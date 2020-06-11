package com.HotelManagement.service.hotel;

import com.HotelManagement.dao.hotel.HotelMapper;
import com.HotelManagement.pojo.Bill;
import com.HotelManagement.pojo.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelMapper hotelMapper;

    //通过酒店名酒店地址搜索酒店
    @Override
    public List<Hotel> searchHotel(String hotelName, String hotelAddress) {
        return this.hotelMapper.searchHotel(hotelName, hotelAddress);
    }

    //添加新的酒店
    @Override
    public int addNewHotel(Hotel hotel) {
        return this.hotelMapper.addNewHotel(hotel);
    }

    //删除酒店
    @Override
    public int deleteHotelById(Integer id) {
        return this.hotelMapper.deleteHotelById(id);
    }

    @Override
    public List<Bill> searchBillByHotel(int isPayment, int isCheckIn) {
        return this.hotelMapper.searchBillByHotel(isPayment, isCheckIn);
    }

    @Override
    public int checkIn(int billId) {
        return this.hotelMapper.checkIn(billId);
    }
}
