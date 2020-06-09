package com.HotelManagement.controller;

import com.HotelManagement.dao.bill.BillMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class BillController {
    private static final Logger logger = Logger.getLogger(BillController.class);
    @Autowired
    private BillMapper billMapper;

    /*@RequestMapping(value = "/doUserBillSearch.html")
    public String doSerch(@RequestParam(value = "hotelName") String hotelName,
                          @RequestParam(value = "hotelAddress") String hotelAddress,
                          HttpSession session, HttpServletRequest request){

    }*/
}
