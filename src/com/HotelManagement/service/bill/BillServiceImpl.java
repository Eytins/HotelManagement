package com.HotelManagement.service.bill;

import com.HotelManagement.dao.bill.BillMapper;
import com.HotelManagement.pojo.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;

    @Override
    //增加订单
    public int addBill(Bill bill) {
        return this.billMapper.addBill(bill);
    }

    //通过订单号和房间类型返回带有房间名和房间规格的表
    public List<Bill> getBillByBillCode(String billCode,Integer roomType) {
        return this.billMapper.getBillByBillCode(billCode, roomType);
    }

    //获取订单价格最高值
    public int getHPrice() {
        return this.billMapper.HPrice();
    }

    //获取订单价格最低值
    public int getLPrice() {
        return this.billMapper.LPrice();
    }

    //根据订单id删除订单
    public int deleteBillbyId(String billcode) {
        return this.billMapper.deleteBillbyId(billcode);
    }

    //是否已经入住
    public int isCheckIn(Integer id, int flag) {
        return this.billMapper.isCheckIn(id, flag);
    }

    @Override
    public List<Bill> getBillListAndHotelNameByDateAndHotelNameAndAddress(Date date, String hotelName, String hotelAddress) {
        return billMapper.getBillListAndHotelNameByDateAndHotelNameAndAddress(date, hotelName, hotelAddress);
    }
}
