package com.HotelManagement.service.bill;

import com.HotelManagement.dao.bill.BillMapper;
import com.HotelManagement.pojo.Bill;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillMapper billMapper;
    @Override
    public int addBill(Bill bill) {
        return this.billMapper.addBill(bill);
    }
    public List<Bill> getBillByBillCode(String billCode, String roomType){
        return this.billMapper.getBillByBillCode(billCode,roomType);
    }
}
