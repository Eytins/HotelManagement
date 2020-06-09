package com.HotelManagement.dao.hotelType;

import com.HotelManagement.pojo.HotelType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HotelTypeMapper {
    //添加新的房间类型
    int addNewHotelType(HotelType hotelType);
    //删除房间类型
    int deleteHotelType(int id);
    //查询房型
    List<HotelType> selectHotelTypeByIdType(@Param("hotelRoomType") String hotelRoomType, @Param("hotelId") Integer hotelId);
}
