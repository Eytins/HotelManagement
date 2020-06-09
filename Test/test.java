import com.HotelManagement.pojo.HotelType;
import com.HotelManagement.pojo.User;
import com.HotelManagement.service.hotelType.HotelTypeService;
import com.HotelManagement.service.hotelType.HotelTypeServiceImpl;
import com.HotelManagement.service.user.UserService;
import com.HotelManagement.service.user.UserServiceImpl;
import com.google.gson.Gson;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test {
    @Test
    public void test1(){

        UserService userService = new UserServiceImpl();
        System.out.println(userService.login("xiaoming","0000000"));

        HotelTypeService hotelTypeService = new HotelTypeServiceImpl();
        List<HotelType> hotelType = hotelTypeService.selectByUser(500,2000,"","");
        System.out.println(hotelType);
    }
}
