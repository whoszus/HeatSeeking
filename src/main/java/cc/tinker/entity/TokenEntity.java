package cc.tinker.entity;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * Created by Tinker on 2016/12/16.
 */
@Entity
@Table(name = "hs_token", schema = "heatseeking")
public class TokenEntity {
    private String tokern;
//    @Pattern("yyyy-MM-dd hh:mm:ss")
    private Date activeTime;
    private Integer isEffective;

    @Id
    @Column(name = "TOKERN")
    public String getTokern() {
        return tokern;
    }

    public void setTokern(String tokern) {
        this.tokern = tokern;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TokenEntity that = (TokenEntity) o;

        if (tokern != null ? !tokern.equals(that.tokern) : that.tokern != null) return false;
        if (activeTime != null ? !activeTime.equals(that.activeTime) : that.activeTime != null) return false;
        if (isEffective != null ? !isEffective.equals(that.isEffective) : that.isEffective != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tokern != null ? tokern.hashCode() : 0;
        result = 31 * result + (activeTime != null ? activeTime.hashCode() : 0);
        result = 31 * result + (isEffective != null ? isEffective.hashCode() : 0);
        return result;
    }
}
