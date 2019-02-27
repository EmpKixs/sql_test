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
        for (int i = 0; i < 99; i++) {
            userService.batchInsert(10000);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

}
