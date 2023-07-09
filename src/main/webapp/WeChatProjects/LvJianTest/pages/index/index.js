// index.js
// 获取应用实例
const app = getApp()

Page({
  data:{
    userName:null,
  },
  onLoad(){
    this.setData({userName:app.globalData.userName})
  },
  toQrcodeInfo(){
    console.log("查询二维码")
    wx.navigateTo({
      url: "../qrcodeInfo/qrcodeInfo",
    })
  },
  toProcessConfirm(){
    console.log("流程确定")
    wx.navigateTo({
      url:"../processConfirm/processConfirm",
    })
  },
  toInbound(){
    console.log("入库")
    wx.navigateTo({
      url:"../inbound/inbound",
    })
  },
  toOutbound() {
    console.log("出库")
    wx.navigateTo({
      url: "../outbound/outbound",
    })
  },
  toCheckWarehouse(){
    console.log("清点库存");
    wx.navigateTo({
      url: '../checkWarehouse/checkWarehouse',
    })
  }
})
