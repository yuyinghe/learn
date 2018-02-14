import cn.xf.learn.domin.newHomework.SpringTest;
import cn.xf.learn.domin.BookDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@Slf4j
public class Main1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SpringTest springTest = (SpringTest) context.getBean("springTest");
        BookDO bookDO = new BookDO();
        bookDO.setName("name");
        bookDO.setAuthor("author");
        bookDO.setCatalogue("catalogue");
        bookDO.setIntroduction("introduction");
        springTest.insert(bookDO);
        int id;
        Scanner scanner=new Scanner(System.in);
        scanner.nextInt();


    }
}
