package wm.gold.dream.ioc.resources;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.*;
import wm.gold.dream.ioc.other.Account;
import wm.gold.dream.ioc.other.CommandManager;
import wm.gold.dream.ioc.other.MyValueCalculator;

/**
 * @Author: wangmeng
 * @Date: 2018/11/8 14:21
 * @Version 1.0
 */
public class MainTest {
    @Test
    public void TestIOC1() {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("application-annotation-ioc.xml");

            UrlResource resource=new UrlResource("https://www.baidu.com/");
            System.out.println(resource.getURL());
            System.out.println(resource.getURI());
            System.out.println(resource.contentLength());

            ClassPathResource classPathResource=new ClassPathResource("application.xml");
            System.out.println(classPathResource.getURL());
            System.out.println(classPathResource.getURI());

            FileSystemResource fileSystemResource=new FileSystemResource("D:\\a.txt");
            System.out.println(fileSystemResource.getURL());
            System.out.println(fileSystemResource.getURI());


            ByteArrayResource byteArrayResource=new ByteArrayResource(new byte[]{'1','2'});
            System.out.println(byteArrayResource.getByteArray());

            Resource template1 = context.getResource("classpath:application.xml");
            System.out.println(template1.getClass());//class org.springframework.core.io.ClassPathResource
            System.out.println(new FileSystemXmlApplicationContext().getResource("classpath:application.xml").getClass());

            Resource template2 = context.getResource("file:D:\\a.txt");
            System.out.println(template2.getClass());//class org.springframework.core.io.FileUrlResource
            System.out.println(new ClassPathXmlApplicationContext().getResource("file:D:\\a.txt").getClass());

            Resource template3 = context.getResource("https://www.baidu.com/");
            System.out.println(new FileSystemXmlApplicationContext().getResource("https://www.baidu.com/").getClass());

            System.out.println(template3.getClass());//class org.springframework.core.io.UrlResource
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
