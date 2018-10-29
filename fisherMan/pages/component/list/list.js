// page/component/list/list.js
var app=getApp();
Page({
  data:{
    url: app.globalData.url
  },
  onLoad:function(options){
    console.log(this.data.url)
  },
  onReady:function(){
    // 页面渲染完成
  },
  onShow:function(){
    // 页面显示
  },
  onHide:function(){
    // 页面隐藏
  },
  onUnload:function(){
    // 页面关闭
  }
})