package cc.tinker.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Tinker on 2016/12/16.
 */
@Entity
@Table(name = "hs_authentication", schema = "heatseeking")
public class AuthenticationEntity {
    private int id;
    private Integer parase;
    private String clientName;
    private String password;
    private String token;
    private String email;
    private String emailVerify;
    private Date registeTime;
    private Date lastLonginTime;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PARASE")
    public Integer getParase() {
        return parase;
    }

    public void setParase(Integer parase) {
        this.parase = parase;
    }

    @Basic
    @Column(name = "CLIENT_NAME")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "TOKEN")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "EmailVerify")
    public String getEmailVerify() {
        return emailVerify;
    }

    public void setEmailVerify(String emailVerify) {
        this.emailVerify = emailVerify;
    }

    @Basic
    @Column(name = "REGISTE_TIME")
    public Date getRegisteTime() {
        return registeTime;
    }

    public void setRegisteTime(Date registeTime) {
        this.registeTime = registeTime;
    }

    @Basic
    @Column(name = "LAST_LONGIN_TIME")
    public Date getLastLonginTime() {
        return lastLonginTime;
    }

    public void setLastLonginTime(Date lastLonginTime) {
        this.lastLonginTime = lastLonginTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthenticationEntity that = (AuthenticationEntity) o;

        if (id != that.id) return false;
        if (parase != null ? !parase.equals(that.parase) : that.parase != null) return false;
        if (clientName != null ? !clientName.equals(that.clientName) : that.clientName != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (emailVerify != null ? !emailVerify.equals(that.emailVerify) : that.emailVerify != null) return false;
        if (registeTime != null ? !registeTime.equals(that.registeTime) : that.registeTime != null) return false;
        if (lastLonginTime != null ? !lastLonginTime.equals(that.lastLonginTime) : that.lastLonginTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (parase != null ? parase.hashCode() : 0);
        result = 31 * result + (clientName != null ? clientName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (emailVerify != null ? emailVerify.hashCode() : 0);
        result = 31 * result + (registeTime != null ? registeTime.hashCode() : 0);
        result = 31 * result + (lastLonginTime != null ? lastLonginTime.hashCode() : 0);
        return result;
    }
}
