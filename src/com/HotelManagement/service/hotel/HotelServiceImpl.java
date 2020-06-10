package com.HotelManagement.service.hotel;

import com.HotelManagement.dao.hotel.HotelMapper;
import com.HotelManagement.pojo.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelMapper hotelMapper;

    @Override
    //通过酒店名酒店地址搜索酒店
    public List<Hotel> selectHotel(String hotelName, String hotelAddress) {
        return this.hotelMapper.selectHotel(hotelName, hotelAddress);
    }

    //添加新的酒店
    public int addNewHotel(Hotel hotel) {
        return this.hotelMapper.addNewHotel(hotel);
    }

    //删除酒店
    public int deleteHotelbyId(Integer id) {
        return this.hotelMapper.deleteHotelbyId(id);
    }
}
