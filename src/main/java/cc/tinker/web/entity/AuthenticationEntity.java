package cc.tinker.web.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by whoszus on 2017/4/10.
 *
 * @email whoszus@yahoo.com
 */
@Entity
@Table(name = "hs_authentication")
public class AuthenticationEntity {
    private int id;
    private String userName;
    private String userPassword;
    private String userCode;
    private String userAccount;
    private Date userCreateTime;
    private Date userLastLoginTime;
    private String lastLoginIp;
    private Date lastLoginTime;
    private String userEmail;
    private String userFeedBack;
    private String tokenCache;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USER_NAME", nullable = true, length = 255)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "USER_PASSWORD", nullable = true, length = 512)
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "USER_CODE", nullable = true, length = 255)
    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @Basic
    @Column(name = "USER_ACCOUNT", nullable = true, length = 255)
    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    @Basic
    @Column(name = "USER_CREATE_TIME", nullable = true)
    public Date getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    @Basic
    @Column(name = "USER_LAST_LOGIN_TIME", nullable = true)
    public Date getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(Date userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    @Basic
    @Column(name = "LAST_LOGIN_IP", nullable = true, length = 512)
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    @Basic
    @Column(name = "LAST_LOGIN_TIME", nullable = true)
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Basic
    @Column(name = "USER_EMAIL", nullable = true, length = 255)
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "USER_FEED_BACK", nullable = true, length = 255)
    public String getUserFeedBack() {
        return userFeedBack;
    }

    public void setUserFeedBack(String userFeedBack) {
        this.userFeedBack = userFeedBack;
    }

    @Transient
    public String getTokenCache() {
        return tokenCache;
    }

    public void setTokenCache(String tokenCache) {
        this.tokenCache = tokenCache;
    }
}
