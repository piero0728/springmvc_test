import cn.k0508.pojo.Emp;
import cn.k0508.service.DemoService;
import cn.k0508.service.impl.DemoServiceImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

//自动加载本地spring-config.xml
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
@RunWith(value = SpringJUnit4ClassRunner.class)
public class Tester {
    @Autowired
    private DemoService demoService;

//    private ApplicationContext app;
//    @Before
//    public void frist(){
//        app = new ClassPathXmlApplicationContext("spring-config.xml");
//    }

//    @Test
//    public void fun01(){
//        SqlSessionFactory sqlSessionFactory = app.getBean("sqlSessionFactory", SqlSessionFactory.class);
//        SqlSessionFactory sqlSessionFactory2 = app.getBean("sqlSessionFactory", SqlSessionFactory.class);
//        System.out.println("sqlSessionFactory = " + sqlSessionFactory);
//        System.out.println("sqlSessionFactory2 = " + sqlSessionFactory2);
//        //两者哈希地址一致，证明spring-config.xml中配置的SqlSessionFactory为单例模式
//    }

    @Test
    public void fun02(){
        Emp emp=new Emp();
        emp.setEname("郭德纲3");
        emp.setEsex("男");
        emp.setEstartime(new Date());
        emp.setEpay(2000F);
        emp.setDid(1);
        String s = demoService.DelEmpAndInsertEmp(22, emp);
        System.out.println("s = " + s);
    }

    @Test
    public void fun03(){
        List<Map<String, Object>> empAndDept = demoService.findEmpAndDept();
        for (Map<String, Object> map:empAndDept){
            Set<Map.Entry<String, Object>> entries = map.entrySet();
            for (Map.Entry<String, Object> entry:entries){
                System.out.println(entry.getKey()+","+entry.getValue());
            }
        }
    }

    @Test
    public void fun04(){
        List<Emp> list = demoService.findEmpAndDeptLazy();
        for (Emp emp :list){
            
        }
    }
}
