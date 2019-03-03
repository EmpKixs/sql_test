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
        System.out.println("开始向user1添加100W数据");
        for (int i = 0; i < 100; i++) {
            System.out.print("第" + (i + 1) + "轮\t");
            userService.batchInsert1(10000);
        }
        System.out.println();
        System.out.println("结束向user1添加100W数据，耗时：" + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println("开始向user2添加200W数据");
        for (int i = 0; i < 200; i++) {
            System.out.print("第" + (i + 1) + "轮\t");
            userService.batchInsert2(10000);
        }
        System.out.println();
        System.out.println("结束向user2添加200W数据，耗时：" + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println("开始向user3添加300W数据");
        for (int i = 0; i < 300; i++) {
            System.out.print("第" + (i + 1) + "轮\t");
            userService.batchInsert3(10000);
        }
        System.out.println();
        System.out.println("结束向user3添加300W数据，耗时：" + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println("开始向user4添加400W数据");
        for (int i = 0; i < 400; i++) {
            System.out.print("第" + (i + 1) + "轮\t");
            userService.batchInsert4(10000);
        }
        System.out.println();
        System.out.println("结束向user4添加400W数据，耗时：" + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println("开始向user5添加500W数据");
        for (int i = 0; i < 500; i++) {
            System.out.print("第" + (i + 1) + "轮\t");
            userService.batchInsert5(10000);
        }
        System.out.println();
        System.out.println("结束向user5添加500W数据，耗时：" + (System.currentTimeMillis() - start));

    }

}
