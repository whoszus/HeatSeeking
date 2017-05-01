package cc.tinker.entity;

import javax.persistence.*;

/**
 * Created by whoszus on 2017/4/10.
 *
 * @email whoszus@yahoo.com
 */
@Entity
@Table(name = "ip_access_list")
public class IpAccessListEntity {
    private int id;
    private String ipAddr;
    private int handleStatus;
    private Integer isAccessable;

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
    @Column(name = "IP_ADDR", nullable = true, length = 30)
    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    @Basic
    @Column(name = "HANDLE_STATUS", nullable = false)
    public int getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(int handleStatus) {
        this.handleStatus = handleStatus;
    }

    @Basic
    @Column(name = "IS_ACCESSABLE", nullable = true)
    public Integer getIsAccessable() {
        return isAccessable;
    }

    public void setIsAccessable(Integer isAccessable) {
        this.isAccessable = isAccessable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IpAccessListEntity that = (IpAccessListEntity) o;

        if (id != that.id) return false;
        if (handleStatus != that.handleStatus) return false;
        if (ipAddr != null ? !ipAddr.equals(that.ipAddr) : that.ipAddr != null) return false;
        if (isAccessable != null ? !isAccessable.equals(that.isAccessable) : that.isAccessable != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ipAddr != null ? ipAddr.hashCode() : 0);
        result = 31 * result + handleStatus;
        result = 31 * result + (isAccessable != null ? isAccessable.hashCode() : 0);
        return result;
    }
}
