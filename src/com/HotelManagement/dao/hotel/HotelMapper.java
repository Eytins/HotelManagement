package com.HotelManagement.dao.hotel;

import com.HotelManagement.pojo.Hotel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HotelMapper {

    //通过酒店名酒店地址搜索酒店
    List<Hotel> searchHotel(@Param("hotelName") String hotelName, @Param("hotelAddress") String hotelAddress);

    //添加新的酒店
    int addNewHotel(Hotel hotel);

    //删除酒店
    int deleteHotelById(Integer id);
}
