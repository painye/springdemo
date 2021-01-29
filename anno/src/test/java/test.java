import com.yp.anno.demo01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test{

    @Test
    public void testDemo01(){
        ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        Student myStudent = factory.getBean("myStudent", Student.class);
        System.out.println(myStudent);
    }
}
