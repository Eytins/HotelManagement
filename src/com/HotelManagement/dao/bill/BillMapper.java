package com.HotelManagement.dao.bill;

import com.HotelManagement.pojo.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface BillMapper {

    //根据订单编号和房间类型获得订单列表
    public List<Bill> getBillList(@Param("billCode") String billCode, @Param("roomType") String roomType);

    //添加用户
    public int addBill(@Param("billCode")String billCode,
                       @Param("orderId") int orderId,
                       @Param("hotelId") int hotelId,
                       @Param("roomType") String roomType,
                       @Param("checkInDate") Date checkInDate,
                       @Param("checkOutDate") Date checkOutDate,
                       @Param("isCheckIn") int isCheckIn,
                       @Param("countDays") int countDays,
                       @Param("totalPrice") int totalPrice,
                       @Param("isPayment") int isPayment,
                       @Param("providerId") int providerId
       );

    //根据id删除订单信息
    public int deleteBillbyId(@Param("billId")Integer id);

    //获取订单价格最高值
    public int HPrice();

    //获取订单价格最低值
    public int LPrice();

    //根据订单编号和房间类型获得订单列表
    public List<Bill> getBillListWithType(@Param("billCode") String billCode,@Param("roomType") Integer roomType);


}
