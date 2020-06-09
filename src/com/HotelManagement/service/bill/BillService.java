package com.HotelManagement.service.bill;

import com.HotelManagement.pojo.Bill;

import java.util.List;

public interface BillService {
    public int addBill(Bill bill);
    public List<Bill> getBillByBillCode(String billCode, String roomType);
}
