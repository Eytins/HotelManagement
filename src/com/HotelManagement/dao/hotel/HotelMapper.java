package com.HotelManagement.dao.hotel;

import com.HotelManagement.pojo.Hotel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HotelMapper {
    Hotel selectHotel(@Param("hotelName") String hotelName,@Param("hotelAddress") String hotelAddress);
    int addNewHotel(Hotel hotel);
}
