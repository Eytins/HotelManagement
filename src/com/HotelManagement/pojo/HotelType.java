package com.HotelManagement.pojo;


public class HotelType {

  private long id;
  private long hotelId;
  private String hoteRoomType;
  private long hotelRoomNumber;
  private double hotelPrice;
  private long hotelPeople;
  private java.sql.Timestamp creationDate;
  private java.sql.Timestamp modifyDate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getHotelId() {
    return hotelId;
  }

  public void setHotelId(long hotelId) {
    this.hotelId = hotelId;
  }


  public String getHoteRoomType() {
    return hoteRoomType;
  }

  public void setHoteRoomType(String hoteRoomType) {
    this.hoteRoomType = hoteRoomType;
  }


  public long getHotelRoomNumber() {
    return hotelRoomNumber;
  }

  public void setHotelRoomNumber(long hotelRoomNumber) {
    this.hotelRoomNumber = hotelRoomNumber;
  }


  public double getHotelPrice() {
    return hotelPrice;
  }

  public void setHotelPrice(double hotelPrice) {
    this.hotelPrice = hotelPrice;
  }


  public long getHotelPeople() {
    return hotelPeople;
  }

  public void setHotelPeople(long hotelPeople) {
    this.hotelPeople = hotelPeople;
  }


  public java.sql.Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Timestamp creationDate) {
    this.creationDate = creationDate;
  }


  public java.sql.Timestamp getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(java.sql.Timestamp modifyDate) {
    this.modifyDate = modifyDate;
  }

}
