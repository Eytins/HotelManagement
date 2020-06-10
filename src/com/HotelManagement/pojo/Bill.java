package com.HotelManagement.pojo;

import java.sql.Date;
import java.sql.Timestamp;

public class Bill {
    private long id;
    private String billCode;
    private long orderId;
    private long hotelId;
    private long roomType;
    private java.sql.Date checkInDate;
    private java.sql.Date checkOutDate;
    private int isCheckIn;
    private int countDays;
    private int isPayment;
    private java.sql.Timestamp creationDate;
    private java.sql.Timestamp modifyDate;
    private long providerId;
    private String hoteRoomType;
    private long hotelPeople;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public long getRoomType() {
        return roomType;
    }

    public void setRoomType(long roomType) {
        this.roomType = roomType;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getIsCheckIn() {
        return isCheckIn;
    }

    public void setIsCheckIn(int isCheckIn) {
        this.isCheckIn = isCheckIn;
    }

    public int getCountDays() {
        return countDays;
    }

    public void setCountDays(int countDays) {
        this.countDays = countDays;
    }

    public int getIsPayment() {
        return isPayment;
    }

    public void setIsPayment(int isPayment) {
        this.isPayment = isPayment;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    public long getProviderId() {
        return providerId;
    }

    public void setProviderId(long providerId) {
        this.providerId = providerId;
    }

    public String getHoteRoomType() {
        return hoteRoomType;
    }

    public void setHoteRoomType(String hoteRoomType) {
        this.hoteRoomType = hoteRoomType;
    }

    public long getHotelPeople() {
        return hotelPeople;
    }

    public void setHotelPeople(long hotelPeople) {
        this.hotelPeople = hotelPeople;
    }
}
