package com.HotelManagement.controller;

import com.HotelManagement.dao.hotel.HotelMapper;
import com.HotelManagement.dao.hotelType.HotelTypeMapper;
import com.HotelManagement.pojo.HotelType;
import com.HotelManagement.service.hotelType.HotelTypeService;
import com.alibaba.fastjson.JSONArray;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HotelController {
    private static final org.apache.log4j.Logger logger = Logger.getLogger(HotelController.class);
    @Autowired
    private HotelTypeService hotelTypeService;

    @RequestMapping(value = "hotel/doUserHotelSearch", method = RequestMethod.POST)
    @ResponseBody
    public List<HotelType> doSerch(@RequestParam(value = "priceMin") String priceMin,
                                   @RequestParam(value = "priceMax") String priceMax,
                                   @RequestParam(value = "hotelName") String hotelName,
                                   @RequestParam(value = "hotelAddress") String hotelAddress
                             ) {
        int priceMin1 = Integer.parseInt(priceMin);
        int priceMax1 = Integer.parseInt(priceMax);
        logger.debug("------------------------------------------------------------------------");
        return this.hotelTypeService.selectByUser(priceMin1,priceMax1,hotelName,hotelAddress);
    }
}
