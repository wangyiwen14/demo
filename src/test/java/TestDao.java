import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.dao.PhoneDao;
import com.offcn.dao.StuDao;
import com.offcn.po.NewStudent;
import com.offcn.po.Phone;

public class TestDao {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dao.xml");

		/*StuDao dao = context.getBean(StuDao.class);
		List<NewStudent> list = dao.getAllStu();
		for (NewStudent s : list) {
			System.out.println(s.getId()+" "+s.getName());
		}*/
		
		PhoneDao dao = context.getBean(PhoneDao.class);
		Phone p = dao.search("1352128");
		System.out.println(p);
	}

}
