import com.HotelManagement.pojo.User;
import com.google.gson.Gson;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test {
    @Test
    public void test1(){
        User user = new User();
        user.setId(1);
        User user3 = new User();
        user3.setId(2);
        User user2 = new User();
        List<User> user1 = new ArrayList<>();
        user1.add(0,user);
        user1.add(1,user3);
        String gson = new Gson().toJson(user1);
        System.out.println(gson);
    }
}
