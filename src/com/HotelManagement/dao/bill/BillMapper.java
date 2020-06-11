package com.HotelManagement.dao.bill;

import com.HotelManagement.pojo.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface BillMapper {

    //根据订单编号和房间类型获得订单列表
    public List<Bill> getBillByBillCode(@Param("billCode") String billCode, @Param("roomType")Integer roomType);

    //新建订单
    public int addBill(Bill bill);

    //根据id删除订单信息
    public int deleteBillbyId(@Param("billCode") String billCode);

    //获取订单价格最高值
    public int HPrice();

    //获取订单价格最低值
    public int LPrice();

    //根据订单编号和房间类型获得包含房间类型和房间规格的订单列表
    public List<Bill> getBillListWithType(@Param("billCode") String billCode, @Param("roomType") Integer roomType);

    //是否已经入住
    public int isCheckIn(@Param("id") Integer id, @Param("flag") int flag);

    //根据Date、酒店名称、地址获取订单列表
    List<Bill> getBillListAndHotelNameByDateAndHotelNameAndAddress(@Param("date") Date date, @Param("hotelName") String hotelName, @Param("hotelAddress") String hotelAddress);
}
