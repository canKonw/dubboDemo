import com.hh.service.ProducterDemo;
import com.hh.service.impl.ProducterDemoImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 15-12-19.
 */
public class Customer {
    @Test
    public void test() throws IOException,InterruptedException{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:dubbo/dubbo-config.xml" });
        context.start();
        ProducterDemo producterDemo = context.getBean("demoService", ProducterDemo.class);
       for (int i = 0;i <= 1;i++){
           String str = producterDemo.saySomeThing("向你发送了参数："+i);
           System.out.println("--------:"+str);
           Thread.sleep(2000);
       }

    }
}
