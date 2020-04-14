package com.example.jdbc.entity;


public class Goods {

  private long id;
  private String goodsName;
  private String goodsTitle;
  private String goodsImg;
  private String goodsDetails;
  private double goodsPrice;
  private long goodsStock;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public String getGoodsTitle() {
    return goodsTitle;
  }

  public void setGoodsTitle(String goodsTitle) {
    this.goodsTitle = goodsTitle;
  }


  public String getGoodsImg() {
    return goodsImg;
  }

  public void setGoodsImg(String goodsImg) {
    this.goodsImg = goodsImg;
  }


  public String getGoodsDetails() {
    return goodsDetails;
  }

  public void setGoodsDetails(String goodsDetails) {
    this.goodsDetails = goodsDetails;
  }


  public double getGoodsPrice() {
    return goodsPrice;
  }

  public void setGoodsPrice(double goodsPrice) {
    this.goodsPrice = goodsPrice;
  }


  public long getGoodsStock() {
    return goodsStock;
  }

  public void setGoodsStock(long goodsStock) {
    this.goodsStock = goodsStock;
  }

  @Override
  public String toString() {
    return "Goods{" +
            "id=" + id +
            ", goodsName='" + goodsName + '\'' +
            ", goodsTitle='" + goodsTitle + '\'' +
            ", goodsImg='" + goodsImg + '\'' +
            ", goodsDetails='" + goodsDetails + '\'' +
            ", goodsPrice=" + goodsPrice +
            ", goodsStock=" + goodsStock +
            '}';
  }
}
