package com.kixs.sql.service.impl;

import com.kixs.sql.dao.UserDao;
import com.kixs.sql.module.User;
import com.kixs.sql.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author wangbing
 * @version 1.0, 2018/11/9
 */
@Service
public class UserServiceImpl implements UserService {

    public static final String ALLCHAR = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String NUMBERCHAR = "0123456789";

    public static final String NICK_NAME_KEY = "nick_name_set";
    public static final String PHONE_KEY = "phone_set";
    public static final String NUMBER_KEY = "number";

    private static final Byte MALE = (byte) 1;
    private static final Byte FEMALE = (byte) 2;

    @Autowired
    private UserDao userDao;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public void batchInsert1(int count) {
        LocalDateTime create = LocalDateTime.now();
        Random random = new Random();
        List<User> users = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            User user = new User();
            int length = random.nextInt(32) + 5;
            if (length > 32) {
                length = 32;
            }
            user.setNickName(getRandomNickName(random, length));
            user.setPhone(getRandomPhone(random, "183"));
            user.setGender(getRandomGender(random));
            user.setLatestLoginTime(LocalDateTime.now());
            user.setCreateDateTime(create);
            users.add(user);
        }
        userDao.insertBatch1(users);
    }

    @Override
    public void batchInsert2(int count) {
        LocalDateTime create = LocalDateTime.now();
        Random random = new Random();
        List<User> users = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            User user = new User();
            int length = random.nextInt(32) + 5;
            if (length > 32) {
                length = 32;
            }
            user.setNickName(getRandomNickName(random, length));
            user.setPhone(getRandomPhone(random, "183"));
            user.setGender(getRandomGender(random));
            user.setLatestLoginTime(LocalDateTime.now());
            user.setCreateDateTime(create);
            users.add(user);
        }
        userDao.insertBatch2(users);
    }

    @Override
    public void batchInsert3(int count) {
        LocalDateTime create = LocalDateTime.now();
        Random random = new Random();
        List<User> users = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            User user = new User();
            int length = random.nextInt(32) + 5;
            if (length > 32) {
                length = 32;
            }
            user.setNickName(getRandomNickName(random, length));
            user.setPhone(getRandomPhone(random, "183"));
            user.setGender(getRandomGender(random));
            user.setLatestLoginTime(LocalDateTime.now());
            user.setCreateDateTime(create);
            users.add(user);
        }
        userDao.insertBatch3(users);
    }

    @Override
    public void batchInsert4(int count) {
        LocalDateTime create = LocalDateTime.now();
        Random random = new Random();
        List<User> users = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            User user = new User();
            int length = random.nextInt(32) + 5;
            if (length > 32) {
                length = 32;
            }
            user.setNickName(getRandomNickName(random, length));
            user.setPhone(getRandomPhone(random, "183"));
            user.setGender(getRandomGender(random));
            user.setLatestLoginTime(LocalDateTime.now());
            user.setCreateDateTime(create);
            users.add(user);
        }
        userDao.insertBatch4(users);
    }

    @Override
    public void batchInsert5(int count) {
        LocalDateTime create = LocalDateTime.now();
        Random random = new Random();
        List<User> users = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            User user = new User();
            int length = random.nextInt(32) + 5;
            if (length > 32) {
                length = 32;
            }
            user.setNickName(getRandomNickName(random, length));
            user.setPhone(getRandomPhone(random, "183"));
            user.setGender(getRandomGender(random));
            user.setLatestLoginTime(LocalDateTime.now());
            user.setCreateDateTime(create);
            users.add(user);
        }
        userDao.insertBatch5(users);
    }

    private String getRandomNickName(Random random, int length) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(ALLCHAR.charAt(random.nextInt(ALLCHAR.length())));
        }
        return builder.toString();
    }

    private String getRandomPhone(Random random, String prefix) {
        StringBuilder builder = new StringBuilder(prefix);
        for (int i = 0; i < 8; i++) {
            builder.append(NUMBERCHAR.charAt(random.nextInt(NUMBERCHAR.length())));
        }
        return builder.toString();
    }

    private Byte getRandomGender(Random random) {
        return random.nextBoolean() ? MALE : FEMALE;
    }
}
