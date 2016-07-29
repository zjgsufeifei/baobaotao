package domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xpf on 16/7/29.
 */
public class LoginLogDO implements Serializable{

    private Long id;

    private Long userId;

    private String ip;

    private Date loginDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
}
