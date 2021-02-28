import com.dlkyy.domain.SysUser;
import com.dlkyy.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/2/27 21:34
 */
public class MyApp {
  public static void main(String[] args) {
    // 从容器中获取对象
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserService userService = (UserService) ac.getBean("userService");

    SysUser user = new SysUser();
    user.setName("dd");
    user.setAge(12);

    userService.addUser(user);
  }
}
