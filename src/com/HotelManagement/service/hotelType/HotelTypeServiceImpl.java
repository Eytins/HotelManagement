package com.HotelManagement.service.hotelType;

import com.HotelManagement.dao.hotelType.HotelTypeMapper;
import com.HotelManagement.pojo.HotelType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelTypeServiceImpl implements HotelTypeService {
    @Autowired
    private HotelTypeMapper hotelTypeMapper;

    public List<HotelType> selectByUser(
            Integer priceMin,
            Integer priceMax,
            String hotelName,
            String hotelAddress
    ) {
        return  this.hotelTypeMapper.selectByUser(priceMin,priceMax,hotelName,hotelAddress);
    }
}
