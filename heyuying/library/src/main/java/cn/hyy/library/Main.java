package cn.hyy.library;

import cn.hyy.library.domain.BookDo;
import cn.hyy.library.domain.condition.BookCondition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

/**
 * Created by heyuying on 18-2-14
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringTest springTest = (SpringTest) context.getBean("springTest");

        BookDo bookDo;
        List<BookDo> bookDoList;
        System.out.println("请输入选择的功能：1.显示，2查找，3插入,4更新，5删除 ");
        Scanner scanner = new Scanner(System.in);
        BookCondition example = new BookCondition();
        BookCondition.Criteria criteria = example.createCriteria();
        switch (scanner.nextInt()) {
            case 1:
                springTest.selectByExample(example);
                System.out.println("成功显示出所有数据");
                break;
            case 2:

                System.out.println("请输入查询的书籍号：");
                bookDo = springTest.selectByPrimaryKey(scanner.nextLong());
                if (bookDo != null) {
                    System.out.println("查询成功");
                } else {
                    System.out.println("查询失败");
                }
                break;
            case 3:

                break;
            case 4:
                break;
            case 5:
                System.out.println("请输入要删除的书籍");

                springTest.deleteByPrimaryKey(scanner.nextLong());
                System.out.println("删除成功");
                break;

        }


    }
}
