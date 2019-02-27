package com.kixs.sql.module;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author wangbing
 * @version 1.0, 2018/11/9
 */
public class User implements Serializable {

    private static final long serialVersionUID = 7932679183350990150L;
    private Integer id;

    private String nickName;

    private String phone;

    private Byte gender;

    private LocalDateTime latestLoginTime;

    private LocalDateTime createDateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public LocalDateTime getLatestLoginTime() {
        return latestLoginTime;
    }

    public void setLatestLoginTime(LocalDateTime latestLoginTime) {
        this.latestLoginTime = latestLoginTime;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }
}
