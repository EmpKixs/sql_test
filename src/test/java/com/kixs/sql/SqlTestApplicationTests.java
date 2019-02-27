package com.kixs.sql;

import com.kixs.sql.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SqlTestApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            System.out.println("第" + (i + 1) + "轮");
            userService.batchInsert(10000);
        }
        System.out.println("添加结束，耗时：" + (System.currentTimeMillis() - start));
    }

}
