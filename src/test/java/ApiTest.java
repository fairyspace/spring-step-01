import io.github.fairyspace.beans.BeanFactory;
import io.github.fairyspace.beans.factory.config.BeanDefinition;
import io.github.fairyspace.service.UserService;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ApiTest {
   @Test
    public void test_simple(){
      //初始化BeanFactory接口
      BeanFactory beanFactory = new BeanFactory();

      //注册Bean对象
      BeanDefinition beanDefinition = new BeanDefinition(new UserService());
      beanFactory.registerBeanDefinition("userService",beanDefinition);

      //获取Bean对象
      UserService userService = (UserService) beanFactory.getBean("userService");
      userService.queryUserInfo();
   }
}
