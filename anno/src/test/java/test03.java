import com.yp.anno.demo03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test03 {

    @Test
    public void testDemo01(){
        ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:demo03/beans.xml");
        Student myStudent = factory.getBean("myStudent", Student.class);
        System.out.println(myStudent);
    }
}
