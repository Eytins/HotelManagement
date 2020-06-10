package com.HotelManagement.controller.hotelController;

import com.HotelManagement.pojo.Hotel;
import com.HotelManagement.pojo.User;
import com.HotelManagement.service.hotel.HotelService;
import com.HotelManagement.tools.Constants;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by Eytins
 */

@Controller
public class HotelListController {

    private static final Logger logger = Logger.getLogger(HotelListController.class);

    @Autowired
    private HotelService hotelService;

    @RequestMapping(value = {"hotelList/doHotelSearch.html", "hotelstatics/hotelList/doHotelSearch.html"}, method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public List<Hotel> doHotelSearch(@RequestParam(value = "hotelName", required = false) String hotelName,
                                     @RequestParam(value = "hotelAddress", required = false) String hotelAddress){

        return this.hotelService.searchHotel(hotelName, hotelAddress);
    }

    @RequestMapping(value = {"hotelAdd/doAddNewHotel.html", "hotelstatics/hotelAdd/doAddNewHotel.html"}, method = RequestMethod.GET)
    @ResponseBody
    public int addNewHotel(@RequestParam(value = "hotelName") String hotelName,
                           @RequestParam(value = "hotelAddress") String hotelAddress,
                           @RequestParam(value = "postCode") String postCode,
                           @RequestParam(value = "tel") String tel,
                           HttpSession session){

        Hotel hotel = new Hotel();

        User loginUser = (User) session.getAttribute(Constants.USER_SESSION);

        hotel.setHotelName(hotelName);
        hotel.setHotelAddress(hotelAddress);
        hotel.setPostCode(postCode);
        hotel.setTel(tel);
        hotel.setCreationDate(new Date());
        hotel.setUserId(loginUser.getId());

        return this.hotelService.addNewHotel(hotel);
    }
}
