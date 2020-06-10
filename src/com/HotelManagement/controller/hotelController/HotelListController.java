package com.HotelManagement.controller.hotelController;

import com.HotelManagement.pojo.Hotel;
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
public class HotelListController {

    private static final Logger logger = Logger.getLogger(HotelListController.class);

    @Autowired
    private HotelService hotelService;

    @RequestMapping(value = {"hotelList/doHotelSearch.html", "hotelstatics/hotelList/doHotelSearch.html"}, method = RequestMethod.GET)
    @ResponseBody
    public List<Hotel> doHotelSearch(@RequestParam(value = "hotelName", required = false) String hotelName,
                                     @RequestParam(value = "hotelAddress", required = false) String hotelAddress){

        return this.hotelService.searchHotel(hotelName, hotelAddress);
    }
}
