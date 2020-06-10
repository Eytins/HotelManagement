package com.HotelManagement.service.hotelType;

import com.HotelManagement.pojo.HotelType;

import java.util.List;

public interface HotelTypeService {

    //添加新的房间类型
    int addNewHotelType(HotelType hotelType);

    //删除房间类型
    int deleteHotelType(int id);

    //查询剩余房型量
    int selectRemainNumber(String hotelTypeId,
                           Integer hotelId,
                           Integer roomType,
                           Integer billHotelId);

    //用户查询
    public List<HotelType> selectByUser(
            Integer priceMin,
            Integer priceMax,
            String hotelName,
            String hotelAddress
    );

    //查询房型
    List<HotelType> selectHotelTypeByIdType(String hotelRoomType, Integer hotelId);


}
