package com.HotelManagement.controller.billController;

import com.HotelManagement.pojo.Bill;
import com.HotelManagement.service.bill.BillService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.List;

@Controller
@RequestMapping("billlist")
public class BillListController {

    private static final Logger logger = Logger.getLogger(BillListController.class);

    @Autowired
    private BillService billService;

    @RequestMapping(value = "doBillSearch", method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    /*
    * 订单的查询
    * */
    public List<Bill> doBillSearch(@RequestParam(value = "billCode", required = false) String billCode,
                                     @RequestParam(value = "roomType", required = false,defaultValue = "1") String roomType){

        int roomType1 = Integer.parseInt(roomType);
        logger.debug(this.billService.getBillByBillCode(billCode,roomType1));
        return this.billService.getBillByBillCode(billCode,roomType1);
    }

    @RequestMapping(value ="addNewBill" , method = {RequestMethod.POST,RequestMethod.GET})
    public int addNewBill(@RequestParam(value = "orderId") Integer orderId,
                          @RequestParam(value = "hotelId") Integer hotelId,
                          @RequestParam(value = "roomType") Integer roomType,
                          @RequestParam(value = "checkInDate") Date checkInDate,
                          @RequestParam(value = "checkOutDate") Date checkOutDate,
                          @RequestParam(value = "totalPrice") Integer totalPrice
                                     )
            {
                Bill bill= new Bill();

                bill.setOrderId(orderId);
                bill.setHotelId(hotelId);
                bill.setRoomType(roomType);
                bill.setCheckInDate(checkInDate);
                bill.setCheckOutDate(checkOutDate);
                bill.setTotalPrice(totalPrice);

                return this.billService.addBill(bill);

    }


    @RequestMapping(value = "deleteBill", method = {RequestMethod.POST,RequestMethod.GET})
    public int deleteBill(@RequestParam(value = "id") String id){
        return this.billService.deleteBillbyId(Integer.parseInt(id));
    }


}
