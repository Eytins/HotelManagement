package com.HotelManagement.controller.userController;

import com.HotelManagement.pojo.Bill;
import com.HotelManagement.service.bill.BillService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by Eytins
 */

@Controller
public class UserBillSearchController {

    private static final Logger logger = Logger.getLogger(UserBillOrderController.class);

    //service自己视需求调用
    @Autowired
    private BillService billService;

    @RequestMapping(value = {"userBillSearch/doUserHotelSearch.html", "userstatics/userBillSearch/doUserHotelSearch.html"}, method = RequestMethod.GET)
    @ResponseBody
    public List<Bill> doUserHotelSearch(@RequestParam(value = "theDay", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd")
                                           Date theDay,
                              @RequestParam(value = "hotelName", required = false) String hotelName,
                              @RequestParam(value = "hotelAddress", required = false) String hotelAddress) {


        logger.debug(this.billService.getBillListAndHotelNameByDateAndHotelNameAndAddress(theDay, hotelName, hotelAddress));
        return this.billService.getBillListAndHotelNameByDateAndHotelNameAndAddress(theDay, hotelName, hotelAddress);
    }
}
