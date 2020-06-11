package com.HotelManagement.controller.hotelController;

import com.HotelManagement.pojo.Bill;
import com.HotelManagement.service.bill.BillService;
import com.HotelManagement.service.hotel.HotelService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Eytins
 */

@Controller
@RequestMapping("hotelbill")
public class HotelBillController {

    private static final Logger logger = Logger.getLogger(HotelBillController.class);

    @Autowired
    private HotelService hotelService;

    @RequestMapping(value = "searchBillByHotel", method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public List<Bill> searchBillByHotel(@RequestParam(value = "isPayment") String isPayment,
                                        @RequestParam(value = "isCheckIn") String isCheckIn){

        return this.hotelService.searchBillByHotel(Integer.parseInt(isPayment),
                                                   Integer.parseInt(isCheckIn));
    }

}
