package com.HotelManagement.controller.hotelController;

import com.HotelManagement.pojo.HotelType;
import com.HotelManagement.service.hotelType.HotelTypeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Eytins
 */

@Controller
public class HotelRoomController {

    private static final Logger logger = Logger.getLogger(HotelRoomController.class);

    //service自己视需求调用

    @Autowired
    private HotelTypeService hotelTypeService;

    @RequestMapping(value = "hotelRoom/searchHotelRoom.html", method = {RequestMethod.GET, RequestMethod.POST})
    public List<HotelType> doRoomSearch(@RequestParam(value = "hotelId") String hotelId) {

        Integer i = null;
        if (hotelId != null) {
            i = Integer.valueOf(hotelId);
        }

        return hotelTypeService.selectHotelTypeByIdType(null, i);
    }

    @RequestMapping(value = "hotelRoom/addHotelRoom.html", method = {RequestMethod.GET, RequestMethod.POST})
    public int addNewRoom(@RequestParam(value = "hotelId") String hotelId,
                          @RequestParam(value = "roomType") String roomType,
                          @RequestParam(value = "roomNumber") String roomNumber,
                          @RequestParam(value = "price") String price,
                          @RequestParam(value = "numberOfPerson") String numberOfPerson) {


        HotelType hotelType    = new HotelType();
        Integer   hotelIdOfInt = null;
        if (hotelId != null) {
            hotelIdOfInt = Integer.valueOf(hotelId);
        }
        hotelType.setHotelId(hotelIdOfInt);
        hotelType.setHotelRoomType(roomType);

        Integer roomNumberOfInt = null;
        if (roomNumber != null) {
            roomNumberOfInt = Integer.valueOf(roomNumber);
        }
        hotelType.setHotelRoomNumber(roomNumberOfInt);

        Integer priceOfInt = null;
        if (price != null) {
            priceOfInt = Integer.valueOf(price);
        }
        hotelType.setHotelPrice(priceOfInt);

        Integer numberOfPersonOfInt = null;
        if (numberOfPerson != null) {
            numberOfPersonOfInt = Integer.valueOf(numberOfPerson);
        }
        hotelType.setHotelPeople(numberOfPersonOfInt);

        return hotelTypeService.addNewHotelType(hotelType);
    }

    @RequestMapping(value = "hotelRoom/editHotelRoom.html", method = {RequestMethod.GET, RequestMethod.POST})
    public int editRoom(@RequestParam(value = "roomTypeId") String roomTypeId,
                        @RequestParam(value = "price") String price,
                        @RequestParam(value = "numberOfPerson") String numberOfPerson) {


        Integer roomTypeIdOfInt = null;
        if (price != null) {
            roomTypeIdOfInt = Integer.valueOf(roomTypeId);
        }

        Integer priceOfInt = null;
        if (price != null) {
            priceOfInt = Integer.valueOf(price);
        }

        Integer numberOfPersonOfInt = null;
        if (numberOfPerson != null) {
            numberOfPersonOfInt = Integer.valueOf(numberOfPerson);
        }


        return hotelTypeService.modifyRoomType(roomTypeIdOfInt, priceOfInt, numberOfPersonOfInt);
    }

    @RequestMapping(value = "hotelRoom/deleteHotelRoom.html", method = {RequestMethod.GET, RequestMethod.POST})
    public int deleteHotelRoom(@RequestParam(value = "roomId") String roomId) {

        Integer roomIdOfInt = null;
        if (roomId != null) {
            roomIdOfInt = Integer.valueOf(roomId);
        }

        return hotelTypeService.deleteHotelType(roomIdOfInt);
    }

}
