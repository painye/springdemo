import com.yp.anno.demo02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test02 {

    @Test
    public void testDemo01(){
        ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:demo02/applicationContext.xml");
        Student myStudent = factory.getBean("myStudent", Student.class);
        System.out.println(myStudent);
    }
}
