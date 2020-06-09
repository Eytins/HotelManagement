package com.HotelManagement.dao.hotel;

import com.HotelManagement.pojo.Hotel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HotelMapper {
    //搜索所有酒店名
    List<Hotel> selectHotel(@Param("hotelName") String hotelName, @Param("hotelAddress") String hotelAddress);
    //添加新的酒店
    int addNewHotel(Hotel hotel);
    //删除酒店
    int deleteHotelbyId(Integer id);

}
