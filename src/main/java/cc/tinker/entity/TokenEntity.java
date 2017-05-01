package cc.tinker.entity;

import org.hibernate.annotations.Where;
import org.hibernate.dialect.InterbaseDialect;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Tinker on 2016/12/16.
 */
@Entity
@Table(name = "hs_token")

public class TokenEntity {
    private String token;
//    @Pattern("yyyy-MM-dd hh:mm:ss")
    private Date activeTime;
    private Integer isEffective;
    private Integer userId;



    @Basic
    @Column(name = "ACTIVE_TIME")
    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    @Basic
    @Column(name = "IS_EFFECTIVE")
    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }

    @Id
    @Column(name = "TOKEN")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Column(name = "USER_ID")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TokenEntity that = (TokenEntity) o;

        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        if (activeTime != null ? !activeTime.equals(that.activeTime) : that.activeTime != null) return false;
        if (isEffective != null ? !isEffective.equals(that.isEffective) : that.isEffective != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = token != null ? token.hashCode() : 0;
        result = 31 * result + (activeTime != null ? activeTime.hashCode() : 0);
        result = 31 * result + (isEffective != null ? isEffective.hashCode() : 0);
        return result;
    }


}
