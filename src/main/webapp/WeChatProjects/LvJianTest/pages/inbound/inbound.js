// inbound.js
const app = getApp()

Page({
  data: {
    result:'',
    warehouse_id:"1",
    warehouse_name:"",
    products:['product1','product2'],
    ready:true
  },
  // 扫码函数
  scanCode(e){
    if(!this.data.ready) return;
    this.setData({ready:false}) // 屏蔽接下来的扫码，直到结束
    this.setData({result:e.detail.result})
    var that = this
    // 对扫码结果进行分析
    // 1. 通过字符串正则表达式提取构件号
    var resultstr = e.detail.result.toString()
    var strs = resultstr.split("\n")
    // for循环从strs中找到构件号或者货位号
    var productId = null
    for(var i = 0; i < strs.length; i++){
      var idx = strs[i].indexOf(":")
      var fieldname = strs[i].substring(0,idx)
      if(fieldname == "构件号"){
        // 这是一个构件标签
        var productId = strs[i].substring(idx+1)
        console.log("扫描到构件'"+productId+"'")
        // 构件查重
        var list = this.data.products
        var flag = true
        for(var j=0; j <list.length; j++){
          if(list[j] == productId) flag = false;
        }
        if(flag){
          // 查验是否已入库，然后重置ready
          var fields = {
            product_id:"STRING"
          }
          wx.request({
            url: 'http://101.37.32.123:8989/QuerySQL',
            data:{
              sqlStr : "select product_id from product where warehouse_id is null and product_id='"+productId+"'",
              fieldNames : JSON.stringify(fields),
              pageCur:1,
              pageMax:10
            },
            method:"POST",
            header:{
              'content-type' : 'application/x-www-form-urlencoded;charset=utf-8'
            },
            success(res){
              console.log(res)
              console.log(res.data.cnt)
              if(res.data.cnt == "1") {
                // 该构件还未入库，可以入库
                list.push(productId)
                that.setData({products:list})
              }
              else{
                // 该构件已入库，提醒
                wx.showToast({
                  title: '该构件已在库内，无法入库!',
                  icon: 'none',
                  duration: 1000
                })
              }
              that.setData({ready:true})
              that.data.ready = true
            },
            error(msg){
              console.log(msg)
              that.setData({ready:true})
              that.data.ready = true
            }
          })
        }
        else{
          that.setData({ready:true})
        }
        
      }
      else if(fieldname.trim() == "货位号"){
        // 这是货位标签
        var warehouseId = strs[i].substring(idx+1)
        console.log("扫描到货位'"+warehouseId+"'")
        if(this.data.warehouse_id==""){
          this.setData({warehouse_id:warehouseId})
        }
        else{
          wx.showToast({
            title: '您已扫描过库房号，若希望扫描新库房号，请点击清空或者点击入库',
            icon: 'none',
            duration: 1000
          })
        }
      }
      else if(fieldname.trim() == "货位名"){
        // 显示货位名
        var warehouseName = strs[i].substring(idx+1)
        console.log("扫描到货位'"+warehouseName+"'")
        if(this.data.warehouse_name ==""){
          this.setData({warehouse_name:warehouseName})
        }
      }
    }
  },
  deleteItem(event) {
    console.log(event.currentTarget.dataset.id)
    var list = this.data.products
    // 删除制定的构件
    list.splice(event.currentTarget.dataset.id,1)
    this.setData({products:list})
  },
  deleteAll(event) {
    this.setData({products:[]})
  },
  submitAll(event){
    var that = this
    // 提交并清空
    if(this.data.warehouse_id!=null && this.data.products.length!=0) {
      // 可以上传
      wx.request({
        url: 'http://localhost:8080/InOutWarehouse',
        data:{
          warehouseId:this.data.warehouse_id,
          productIds:JSON.stringify(this.data.products),
          type:"1",
          userId:app.globalData.userId,
          userName:app.globalData.userName
        },
        method:'POST',
        header:{
          'content-type':'application/x-www-form-urlencoded;charset=utf-8'
        },
        success(res){
          // 清空所有
          console.log(res)
          var list = []
          that.setData({
            products:[],
            warehouse_id:"",
            warehouse_name:""
          })
        }
      })
    }
    else {
      wx.showToast({
        title: '你还未扫描库房或者未扫描构件',
        icon: 'none',
        duration: 1000
      })
    }
  }

})