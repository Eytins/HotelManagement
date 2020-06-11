package com.HotelManagement.service.hotel;

import com.HotelManagement.pojo.Hotel;

import java.util.List;

public interface HotelService {

    //通过酒店名酒店地址搜索酒店
    List<Hotel> searchHotel(String hotelName, String hotelAddress);

    //添加新的酒店
    int addNewHotel(Hotel hotel);

    //删除酒店
    int deleteHotelById(Integer id);
}
