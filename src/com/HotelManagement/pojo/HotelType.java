package com.HotelManagement.pojo;


public class HotelType {

  private long id;
  private long hotelId;
  private String hotelRoomType;
  private long hotelRoomNumber;
  private double hotelPrice;
  private long hotelPeople;
  private java.sql.Timestamp creationDate;
  private java.sql.Timestamp modifyDate;
  private String hotelName;


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


  public String getHotelRoomType() {
    return hotelRoomType;
  }

  public void setHoteRoomType(String hoteRoomType) {
    this.hotelRoomType = hoteRoomType;
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

  public void setHotelRoomType(String hotelRoomType) {
    this.hotelRoomType = hotelRoomType;
  }

  public String getHotelName() {
    return hotelName;
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }
}
