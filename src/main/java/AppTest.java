import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wcj.entity.Printer;
import com.wcj.entity.Users;

import junit.framework.TestCase;

public class AppTest extends TestCase{
	public void testIoc(){
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Users user=(Users) context.getBean("temo");
		user.hello();
	}
	
	public void testPrinter(){
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Printer printer=(Printer) context.getBean("hp");
		printer.print();
	}
}
