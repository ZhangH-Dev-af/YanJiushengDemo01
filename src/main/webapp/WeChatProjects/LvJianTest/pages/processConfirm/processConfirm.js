// processConfirm.js
const app = getApp()

Page({
  data: {
    result:'',
    product_id:'',
    pc_name:'',
    errormsg:''
  },
  // 扫码函数
  scanCode(e){
    this.setData({result:e.detail.result})
    var that = this
    // 对扫码结果进行分析
    // 1. 通过字符串正则表达式提取构件号
    var resultstr = e.detail.result.toString()
    var strs = resultstr.split("\n")
    // for循环从strs中找到构件号
    var productId = null
    for(var i = 0; i < strs.length; i++){
      var idx = strs[i].indexOf(":")
      var fieldname = strs[i].substring(0,idx)
      if(fieldname == "构件号"){
        productId = strs[i].substring(idx+1)
      }
    }
    that.setData({product_id:productId})
    console.log(productId)
    if(productId != null){
      // 获取构件目前所在的工序
      var fields = {
        pc_name:"STRING"
      }
      wx.request({
        url: 'http://101.37.32.123:8989/QuerySQL',
        data:{
          sqlStr:"select pc_name from product,process_content where product.process_content_id = pc_id and product_id='"+that.data.product_id+"'",
          fieldNames:JSON.stringify(fields),
          pageCur:1,
          pageMax:10
        },
        method:'POST',
        header:{
          "content-type":'application/x-www-form-urlencoded'
        },
        success(res){
          if(res.data.cnt != 0){
            // 未完工，显示当前工序
            that.setData({pc_name:JSON.parse(res.data.data)[0].pc_name})
          }
          else{
            // 已完工
            that.setData({errormsg:"该构件已完工!"})
          }
        }
      })
    }
    else{
      wx.showToast({
        title:'请扫描具有构件号的构件二维码!',
        icon:'none',
        duration:1000
      })
    }
  },
  submitInfo(e){
    var that = this
    console.log(app.globalData.userId)
    console.log(this.data.product_id)
    // 传送userId和product_id，在服务器端写入时间
    if(this.data.product_id!=null && this.data.pc_name !="") {
      wx.request({
        url: 'http://101.37.32.123:8989/Confirm',
        data:{
          productId:that.data.product_id,
          userId:app.globalData.userId,
          userName:app.globalData.userName
        },
        method:'POST',
        header:{
          "content-type":'application/x-www-form-urlencoded'
        },
        success(res){
          console.log(res)
          // 成功后
          wx.showToast({
            title:'完成工序确认!',
            icon:'success',
            duration:1000
          })
          // 同时清除构件号product_id和所在工序内容pc_name和errormsg
          that.setData({
            product_id:"",
            pc_name:"",
            errormsg:""
          })
        }
      })
    }
    else{
      // 没有productId
      wx.showToast({
        title:'请先扫描一个未完工构件的二维码!',
        icon:'none',
        duration:1000
      })
    }
  }
})