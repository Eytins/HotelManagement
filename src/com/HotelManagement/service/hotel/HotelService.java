package com.HotelManagement.service.hotel;

import com.HotelManagement.pojo.Hotel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HotelService {

    //通过酒店名酒店地址搜索酒店
    List<Hotel> selectHotel( String hotelName,  String hotelAddress);
}
