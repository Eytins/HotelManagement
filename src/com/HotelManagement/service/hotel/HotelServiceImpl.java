package com.HotelManagement.service.hotel;

import com.HotelManagement.dao.bill.BillMapper;
import com.HotelManagement.dao.hotel.HotelMapper;
import com.HotelManagement.pojo.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements  HotelService {

    @Autowired
    private HotelMapper hotelMapper;
    @Override
    public

        //通过酒店名酒店地址搜索酒店
    List<Hotel>   selectHotel(String hotelName, String hotelAddress){
        return  this.hotelMapper.selectHotel(hotelName,hotelAddress);
    }
}
