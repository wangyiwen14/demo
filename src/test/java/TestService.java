import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.po.NewStudent;
import com.offcn.service.StuService;
import com.offcn.service.imp.StuServiceImp;

public class TestService {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dao.xml","classpath:spring-service.xml");

		StuService service = context.getBean(StuService.class);
		List<NewStudent> list = service.getAllStu();
		for (NewStudent s : list) {
			System.out.println(s.getId()+" "+s.getName());
		}
	
	}

}
