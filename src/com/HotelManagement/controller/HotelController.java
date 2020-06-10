package com.HotelManagement.controller;

import com.HotelManagement.dao.hotel.HotelMapper;
import com.HotelManagement.dao.hotelType.HotelTypeMapper;
import com.HotelManagement.pojo.HotelType;
import com.HotelManagement.service.hotelType.HotelTypeService;
import com.alibaba.fastjson.JSONArray;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
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

    @Autowired
    private HotelTypeService hotelTypeService;

    @RequestMapping(value = "hotel/doUserHotelSearch", method = {RequestMethod.POST})
    @ResponseBody
    public String doSerch(@RequestParam(value = "priceMin") Integer priceMin,
                             @RequestParam(value = "priceMax") Integer priceMax,
                             @RequestParam(value = "hotelName") String hotelName,
                             @RequestParam(value = "hotelAddress") String hotelAddress
                             ) {
        String json = new Gson().toJson(this.hotelTypeService.selectByUser(priceMin,priceMax,hotelName,hotelAddress));
        return json;
    }
}
