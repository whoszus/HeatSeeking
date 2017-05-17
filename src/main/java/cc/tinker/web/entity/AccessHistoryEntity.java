package cc.tinker.web.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Tinker on 2017/5/3.
 */
@Entity
@Table(name = "redsword_access_history")
public class AccessHistoryEntity {
    private int id;
    private String ipAddress;
    private String sysMethodName;
    private Date accessDateTime;
    private Integer isRefuse;
    private String accessParams;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "IP_ADDRESS")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Basic
    @Column(name = "SYS_METHOD_NAME")
    public String getSysMethodName() {
        return sysMethodName;
    }

    public void setSysMethodName(String sysMethodName) {
        this.sysMethodName = sysMethodName;
    }

    @Basic
    @Column(name = "ACCESS_DATE_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getAccessDateTime() {
        return accessDateTime;
    }

    public void setAccessDateTime(Date accessDateTime) {
        this.accessDateTime = accessDateTime;
    }

    @Basic
    @Column(name = "IS_REFUSE")
    public Integer getIsRefuse() {
        return isRefuse;
    }

    public void setIsRefuse(Integer isRefuse) {
        this.isRefuse = isRefuse;
    }

    @Basic
    @Column(name = "ACCESS_PARAMS")
    public String getAccessParams() {
        return accessParams;
    }

    public void setAccessParams(String accessParams) {
        this.accessParams = accessParams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccessHistoryEntity that = (AccessHistoryEntity) o;

        if (id != that.id) return false;
        if (ipAddress != null ? !ipAddress.equals(that.ipAddress) : that.ipAddress != null) return false;
        if (sysMethodName != null ? !sysMethodName.equals(that.sysMethodName) : that.sysMethodName != null)
            return false;
        if (accessDateTime != null ? !accessDateTime.equals(that.accessDateTime) : that.accessDateTime != null)
            return false;
        if (isRefuse != null ? !isRefuse.equals(that.isRefuse) : that.isRefuse != null) return false;
        if (accessParams != null ? !accessParams.equals(that.accessParams) : that.accessParams != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
        result = 31 * result + (sysMethodName != null ? sysMethodName.hashCode() : 0);
        result = 31 * result + (accessDateTime != null ? accessDateTime.hashCode() : 0);
        result = 31 * result + (isRefuse != null ? isRefuse.hashCode() : 0);
        result = 31 * result + (accessParams != null ? accessParams.hashCode() : 0);
        return result;
    }
}
