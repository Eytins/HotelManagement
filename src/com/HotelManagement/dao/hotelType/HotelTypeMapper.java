package com.HotelManagement.dao.hotelType;

import com.HotelManagement.pojo.HotelType;

public interface HotelTypeMapper {
    int addNewHotelType(HotelType hotelType);
    int deleteHotelType(int id);

}
