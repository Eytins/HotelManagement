import com.HotelManagement.pojo.User;
import com.google.gson.Gson;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test {
    @Test
    public void test1(){
        List<String> user = new ArrayList<>();
        user.add(0,"0");
        user.add(1,"1");
        user.add(2,"2");
        user.add(3,"3");
        user.add(4,"4");
        user.add(5,"5");
        List<List> user1 = new ArrayList<>();
        user1.add(0,user);
        user1.add(1,user);
        User user2 = new User();
        String gson = new Gson().toJson(user2);
        System.out.println(gson);
    }
}
