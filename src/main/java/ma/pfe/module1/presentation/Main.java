package ma.pfe.module1.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.pfe.module1.services.IService;
import ma.pfe.module1.services.ServiceImpl;

public class Main {

	static ApplicationContext con = new ClassPathXmlApplicationContext("ma/pfe/module1/services/spring.xml");
	public static void main(String[] args) {
	
		IService is = con.getBean("s" , IService.class);
		IService is2 = con.getBean("s" , IService.class);
		System.out.println(is);
		System.out.println(is2);
		is.insert();
	}

}
