// page/component/details/details.js
var app=getApp();
Page({
  data:{
    merchandise:null,
    num: 1,
    totalNum: 0,
    hasCarts: false,
    curIndex: 0,
    show: false,
    scaleCart: false,
    url: app.globalData.url,
    imageUrl: app.globalData.url+"/getImage?path="

  },

  addCount() {
    let num = this.data.num;
    num++;
    this.setData({
      num : num
    })
  },

  addToCart() {
    const self = this;
    const num = this.data.num;
    let total = this.data.totalNum;

    self.setData({
      show: true
    })
    setTimeout( function() {
      self.setData({
        show: false,
        scaleCart : true
      })
      setTimeout( function() {
        self.setData({
          scaleCart: false,
          hasCarts : true,
          totalNum: num + total
        })
      }, 200)
    }, 300)

  },

  bindTap(e) {
    const index = parseInt(e.currentTarget.dataset.index);
    this.setData({
      curIndex: index
    })
  },
 
 onLoad:function(options){
   var that=this;
   wx.request({
     url: app.globalData.url+"/getDetails",
     data: {
      merchandiseId:options.merchandiseId
     },
     //后台加载成功
     success: function (res) {
       that.setData({
         merchandise:res.data.merchandise
       })
       console.log(res.data);
   
     },
     fail: function (res) { },
     complete: function (res) { },
   })
 }
})