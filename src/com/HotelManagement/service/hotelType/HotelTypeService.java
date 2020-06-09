package com.HotelManagement.service.hotelType;

import com.HotelManagement.pojo.HotelType;

import java.util.List;

public interface HotelTypeService {
    public List<HotelType> selectByUser(
            Integer priceMin,
            Integer priceMax,
            String hotelName,
            String hotelAddress
    );
}
