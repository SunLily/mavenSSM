//package exam;
//
//import java.io.IOException;
//import java.io.Reader;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.cn.Service.UserService;
//import com.cn.pojo.User;
//import com.cn.pojo.helloWorld;
//
//import org.apache.log4j.Logger;  
//
//import tk.mybatis.mapper.entity.Config;
//import tk.mybatis.mapper.mapperhelper.MapperHelper;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
//public class test {
//	private static Logger logger = Logger.getLogger(test.class);
//	
//	@Autowired
//	private UserService userService = null;
//	@Test
//	public void test(){
//				
//		//查找
//		List<User> user = userService.getUser();
////		System.out.println(user.size());
//		//根据条件查询
//		Map<String,Object> map = new HashMap<String, Object>();
//		map.put("name", "tom");
//		map.put("age", "12");
//		List<User> l = userService.findBy(map);
//		System.out.println(l.size());
//		
//	}
	
//}
