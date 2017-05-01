package cc.tinker.entity;

import cc.tinker.utils.DateTimeUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by whoszus on 2017/4/10.
 *
 * @email whoszus@yahoo.com
 */
@Entity
@Table(name = "site_encode_password")
public class SiteEncodePasswordEntity {
    private int id;
    private int userId;
    private String siteCode;
    private String siteAddr;
    private String sitePasswordEncode;
    private String siteName;
    private int siteEncodeMethod;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastDecodeTime;
    private String lastDecodeIp;
    private int decodeCount;
    private String lastDecodeTimeString;

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
    @Column(name = "USER_ID", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "SITE_CODE", nullable = false, length = 255)
    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    @Basic
    @Column(name = "SITE_ADDR", nullable = true, length = 255)
    public String getSiteAddr() {
        return siteAddr;
    }

    public void setSiteAddr(String siteAddr) {
        this.siteAddr = siteAddr;
    }

    @Basic
    @Column(name = "SITE_PASSWORD_ENCODE", nullable = false, length = 1024)
    public String getSitePasswordEncode() {
        return sitePasswordEncode;
    }

    public void setSitePasswordEncode(String sitePasswordEncode) {
        this.sitePasswordEncode = sitePasswordEncode;
    }

    @Basic
    @Column(name = "SITE_NAME", nullable = true, length = 255)
    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    @Basic
    @Column(name = "SITE_ENCODE_METHOD", nullable = false)
    public int getSiteEncodeMethod() {
        return siteEncodeMethod;
    }

    public void setSiteEncodeMethod(int siteEncodeMethod) {
        this.siteEncodeMethod = siteEncodeMethod;
    }

    @Basic
    @Column(name = "LAST_DECODE_TIME", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getLastDecodeTime() {
        return lastDecodeTime;
    }

    public void setLastDecodeTime(Date lastDecodeTime) {
        this.lastDecodeTime = lastDecodeTime;
    }

    @Basic
    @Column(name = "LAST_DECODE_IP", nullable = false, length = 20)
    public String getLastDecodeIp() {
        return lastDecodeIp;
    }

    public void setLastDecodeIp(String lastDecodeIp) {
        this.lastDecodeIp = lastDecodeIp;
    }

    @Basic
    @Column(name = "DECODE_COUNT", nullable = false)
    public int getDecodeCount() {
        return decodeCount;
    }

    public void setDecodeCount(int decodeCount) {
        this.decodeCount = decodeCount;
    }


    @Transient
    public String getLastDecodeTimeString() {
        return DateTimeUtils.convertDateToStringByFormat(this.lastDecodeTime);
    }

    public void setLastDecodeTimeString(String lastDecodeTimeString) {
        this.lastDecodeTimeString = lastDecodeTimeString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SiteEncodePasswordEntity that = (SiteEncodePasswordEntity) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (siteEncodeMethod != that.siteEncodeMethod) return false;
        if (decodeCount != that.decodeCount) return false;
        if (siteCode != null ? !siteCode.equals(that.siteCode) : that.siteCode != null) return false;
        if (siteAddr != null ? !siteAddr.equals(that.siteAddr) : that.siteAddr != null) return false;
        if (sitePasswordEncode != null ? !sitePasswordEncode.equals(that.sitePasswordEncode) : that.sitePasswordEncode != null)
            return false;
        if (siteName != null ? !siteName.equals(that.siteName) : that.siteName != null) return false;
        if (lastDecodeTime != null ? !lastDecodeTime.equals(that.lastDecodeTime) : that.lastDecodeTime != null)
            return false;
        if (lastDecodeIp != null ? !lastDecodeIp.equals(that.lastDecodeIp) : that.lastDecodeIp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userId;
        result = 31 * result + (siteCode != null ? siteCode.hashCode() : 0);
        result = 31 * result + (siteAddr != null ? siteAddr.hashCode() : 0);
        result = 31 * result + (sitePasswordEncode != null ? sitePasswordEncode.hashCode() : 0);
        result = 31 * result + (siteName != null ? siteName.hashCode() : 0);
        result = 31 * result + siteEncodeMethod;
        result = 31 * result + (lastDecodeTime != null ? lastDecodeTime.hashCode() : 0);
        result = 31 * result + (lastDecodeIp != null ? lastDecodeIp.hashCode() : 0);
        result = 31 * result + decodeCount;
        return result;
    }
}
