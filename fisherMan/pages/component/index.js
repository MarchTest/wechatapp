var app=getApp();
Page({
  data: {
    url: app.globalData.url+"/getImage?path=",
    promotionMerchandise:null,
    homeImages:null,
    indicatorDots: false,
    autoplay: false,
    interval: 3000,
    duration: 800,
  },
  onLoad() {
    var that=this;
    wx.request({
      url: app.globalData.url+"/index",
      data: {
      },
      //后台加载成功
      success: function (res) {
        // 获取用户信
        console.log("index");
        console.log(res.data);
        var homeImage = res.data.homeImages;
        var merchandise=res.data.promotionMerchandises;
        that.setData({
          homeImages:homeImage,
          promotionMerchandise:merchandise
        })
      },
      fail: function (res) {},
      complete: function (res) { },
    })
   
  },
  navigationTo:function(event){
    wx.navigateTo({
      url: 'details/details?merchandiseId=' + event.currentTarget.dataset.id,
      success: function (res) { },
      fail: function (res) { },
      complete: function (res) { },
    })
  }
 

})