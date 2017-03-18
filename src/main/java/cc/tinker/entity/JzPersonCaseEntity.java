package cc.tinker.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Tinker on 2017/3/15.
 */
@Entity
@Table(name = "jz_person_case", schema = "heatseeking")
public class JzPersonCaseEntity {
    private String systemid;
    private String ajbh;
    private String rybh;
    private String zagj;
    private String sdtd;
    private String xzsj;
    private String xzcs;
    private String xzdx;
    private String rylx;
    private String rystate;
    private String ryshxs;
    private String rsshcd;
    private Double sazz;
    private Double ssje;
    private Double srwhss;
    private String qfqk;
    private String swqk;
    private String zcf;
    private String departmentcode;
    private String creator;
    private Timestamp createdtime;
    private String securitygrade;
    private String reservation01;
    private String reservation02;
    private String reservation03;
    private String reservation04;
    private String reservation05;
    private String reservation06;
    private String reservation07;
    private String reservation08;
    private String reservation09;
    private String reservation10;
    private String lastupdatedby;
    private Timestamp lastupdatedtime;
    private Timestamp refreshtime;
    private String uploadflag;
    private String downloadflag;
    private String deleteflag;
    private Timestamp gzdbAddtime;
    private Integer rownum;
    @Transient
    public Integer getRownum() {
        return rownum;
    }

    public void setRownum(Integer rownum) {
        this.rownum = rownum;
    }

    @Id
    @Column(name = "SYSTEMID")
    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    @Basic
    @Column(name = "AJBH")
    public String getAjbh() {
        return ajbh;
    }

    public void setAjbh(String ajbh) {
        this.ajbh = ajbh;
    }

    @Basic
    @Column(name = "RYBH")
    public String getRybh() {
        return rybh;
    }

    public void setRybh(String rybh) {
        this.rybh = rybh;
    }

    @Basic
    @Column(name = "ZAGJ")
    public String getZagj() {
        return zagj;
    }

    public void setZagj(String zagj) {
        this.zagj = zagj;
    }

    @Basic
    @Column(name = "SDTD")
    public String getSdtd() {
        return sdtd;
    }

    public void setSdtd(String sdtd) {
        this.sdtd = sdtd;
    }

    @Basic
    @Column(name = "XZSJ")
    public String getXzsj() {
        return xzsj;
    }

    public void setXzsj(String xzsj) {
        this.xzsj = xzsj;
    }

    @Basic
    @Column(name = "XZCS")
    public String getXzcs() {
        return xzcs;
    }

    public void setXzcs(String xzcs) {
        this.xzcs = xzcs;
    }

    @Basic
    @Column(name = "XZDX")
    public String getXzdx() {
        return xzdx;
    }

    public void setXzdx(String xzdx) {
        this.xzdx = xzdx;
    }

    @Basic
    @Column(name = "RYLX")
    public String getRylx() {
        return rylx;
    }

    public void setRylx(String rylx) {
        this.rylx = rylx;
    }

    @Basic
    @Column(name = "RYSTATE")
    public String getRystate() {
        return rystate;
    }

    public void setRystate(String rystate) {
        this.rystate = rystate;
    }

    @Basic
    @Column(name = "RYSHXS")
    public String getRyshxs() {
        return ryshxs;
    }

    public void setRyshxs(String ryshxs) {
        this.ryshxs = ryshxs;
    }

    @Basic
    @Column(name = "RSSHCD")
    public String getRsshcd() {
        return rsshcd;
    }

    public void setRsshcd(String rsshcd) {
        this.rsshcd = rsshcd;
    }

    @Basic
    @Column(name = "SAZZ")
    public Double getSazz() {
        return sazz;
    }

    public void setSazz(Double sazz) {
        this.sazz = sazz;
    }

    @Basic
    @Column(name = "SSJE")
    public Double getSsje() {
        return ssje;
    }

    public void setSsje(Double ssje) {
        this.ssje = ssje;
    }

    @Basic
    @Column(name = "SRWHSS")
    public Double getSrwhss() {
        return srwhss;
    }

    public void setSrwhss(Double srwhss) {
        this.srwhss = srwhss;
    }

    @Basic
    @Column(name = "QFQK")
    public String getQfqk() {
        return qfqk;
    }

    public void setQfqk(String qfqk) {
        this.qfqk = qfqk;
    }

    @Basic
    @Column(name = "SWQK")
    public String getSwqk() {
        return swqk;
    }

    public void setSwqk(String swqk) {
        this.swqk = swqk;
    }

    @Basic
    @Column(name = "ZCF")
    public String getZcf() {
        return zcf;
    }

    public void setZcf(String zcf) {
        this.zcf = zcf;
    }

    @Basic
    @Column(name = "DEPARTMENTCODE")
    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    @Basic
    @Column(name = "CREATOR")
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Basic
    @Column(name = "CREATEDTIME")
    public Timestamp getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Timestamp createdtime) {
        this.createdtime = createdtime;
    }

    @Basic
    @Column(name = "SECURITYGRADE")
    public String getSecuritygrade() {
        return securitygrade;
    }

    public void setSecuritygrade(String securitygrade) {
        this.securitygrade = securitygrade;
    }

    @Basic
    @Column(name = "RESERVATION01")
    public String getReservation01() {
        return reservation01;
    }

    public void setReservation01(String reservation01) {
        this.reservation01 = reservation01;
    }

    @Basic
    @Column(name = "RESERVATION02")
    public String getReservation02() {
        return reservation02;
    }

    public void setReservation02(String reservation02) {
        this.reservation02 = reservation02;
    }

    @Basic
    @Column(name = "RESERVATION03")
    public String getReservation03() {
        return reservation03;
    }

    public void setReservation03(String reservation03) {
        this.reservation03 = reservation03;
    }

    @Basic
    @Column(name = "RESERVATION04")
    public String getReservation04() {
        return reservation04;
    }

    public void setReservation04(String reservation04) {
        this.reservation04 = reservation04;
    }

    @Basic
    @Column(name = "RESERVATION05")
    public String getReservation05() {
        return reservation05;
    }

    public void setReservation05(String reservation05) {
        this.reservation05 = reservation05;
    }

    @Basic
    @Column(name = "RESERVATION06")
    public String getReservation06() {
        return reservation06;
    }

    public void setReservation06(String reservation06) {
        this.reservation06 = reservation06;
    }

    @Basic
    @Column(name = "RESERVATION07")
    public String getReservation07() {
        return reservation07;
    }

    public void setReservation07(String reservation07) {
        this.reservation07 = reservation07;
    }

    @Basic
    @Column(name = "RESERVATION08")
    public String getReservation08() {
        return reservation08;
    }

    public void setReservation08(String reservation08) {
        this.reservation08 = reservation08;
    }

    @Basic
    @Column(name = "RESERVATION09")
    public String getReservation09() {
        return reservation09;
    }

    public void setReservation09(String reservation09) {
        this.reservation09 = reservation09;
    }

    @Basic
    @Column(name = "RESERVATION10")
    public String getReservation10() {
        return reservation10;
    }

    public void setReservation10(String reservation10) {
        this.reservation10 = reservation10;
    }

    @Basic
    @Column(name = "LASTUPDATEDBY")
    public String getLastupdatedby() {
        return lastupdatedby;
    }

    public void setLastupdatedby(String lastupdatedby) {
        this.lastupdatedby = lastupdatedby;
    }

    @Basic
    @Column(name = "LASTUPDATEDTIME")
    public Timestamp getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(Timestamp lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    @Basic
    @Column(name = "REFRESHTIME")
    public Timestamp getRefreshtime() {
        return refreshtime;
    }

    public void setRefreshtime(Timestamp refreshtime) {
        this.refreshtime = refreshtime;
    }

    @Basic
    @Column(name = "UPLOADFLAG")
    public String getUploadflag() {
        return uploadflag;
    }

    public void setUploadflag(String uploadflag) {
        this.uploadflag = uploadflag;
    }

    @Basic
    @Column(name = "DOWNLOADFLAG")
    public String getDownloadflag() {
        return downloadflag;
    }

    public void setDownloadflag(String downloadflag) {
        this.downloadflag = downloadflag;
    }

    @Basic
    @Column(name = "DELETEFLAG")
    public String getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag;
    }

    @Basic
    @Column(name = "GZDB_ADDTIME")
    public Timestamp getGzdbAddtime() {
        return gzdbAddtime;
    }

    public void setGzdbAddtime(Timestamp gzdbAddtime) {
        this.gzdbAddtime = gzdbAddtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JzPersonCaseEntity that = (JzPersonCaseEntity) o;

        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (ajbh != null ? !ajbh.equals(that.ajbh) : that.ajbh != null) return false;
        if (rybh != null ? !rybh.equals(that.rybh) : that.rybh != null) return false;
        if (zagj != null ? !zagj.equals(that.zagj) : that.zagj != null) return false;
        if (sdtd != null ? !sdtd.equals(that.sdtd) : that.sdtd != null) return false;
        if (xzsj != null ? !xzsj.equals(that.xzsj) : that.xzsj != null) return false;
        if (xzcs != null ? !xzcs.equals(that.xzcs) : that.xzcs != null) return false;
        if (xzdx != null ? !xzdx.equals(that.xzdx) : that.xzdx != null) return false;
        if (rylx != null ? !rylx.equals(that.rylx) : that.rylx != null) return false;
        if (rystate != null ? !rystate.equals(that.rystate) : that.rystate != null) return false;
        if (ryshxs != null ? !ryshxs.equals(that.ryshxs) : that.ryshxs != null) return false;
        if (rsshcd != null ? !rsshcd.equals(that.rsshcd) : that.rsshcd != null) return false;
        if (sazz != null ? !sazz.equals(that.sazz) : that.sazz != null) return false;
        if (ssje != null ? !ssje.equals(that.ssje) : that.ssje != null) return false;
        if (srwhss != null ? !srwhss.equals(that.srwhss) : that.srwhss != null) return false;
        if (qfqk != null ? !qfqk.equals(that.qfqk) : that.qfqk != null) return false;
        if (swqk != null ? !swqk.equals(that.swqk) : that.swqk != null) return false;
        if (zcf != null ? !zcf.equals(that.zcf) : that.zcf != null) return false;
        if (departmentcode != null ? !departmentcode.equals(that.departmentcode) : that.departmentcode != null)
            return false;
        if (creator != null ? !creator.equals(that.creator) : that.creator != null) return false;
        if (createdtime != null ? !createdtime.equals(that.createdtime) : that.createdtime != null) return false;
        if (securitygrade != null ? !securitygrade.equals(that.securitygrade) : that.securitygrade != null)
            return false;
        if (reservation01 != null ? !reservation01.equals(that.reservation01) : that.reservation01 != null)
            return false;
        if (reservation02 != null ? !reservation02.equals(that.reservation02) : that.reservation02 != null)
            return false;
        if (reservation03 != null ? !reservation03.equals(that.reservation03) : that.reservation03 != null)
            return false;
        if (reservation04 != null ? !reservation04.equals(that.reservation04) : that.reservation04 != null)
            return false;
        if (reservation05 != null ? !reservation05.equals(that.reservation05) : that.reservation05 != null)
            return false;
        if (reservation06 != null ? !reservation06.equals(that.reservation06) : that.reservation06 != null)
            return false;
        if (reservation07 != null ? !reservation07.equals(that.reservation07) : that.reservation07 != null)
            return false;
        if (reservation08 != null ? !reservation08.equals(that.reservation08) : that.reservation08 != null)
            return false;
        if (reservation09 != null ? !reservation09.equals(that.reservation09) : that.reservation09 != null)
            return false;
        if (reservation10 != null ? !reservation10.equals(that.reservation10) : that.reservation10 != null)
            return false;
        if (lastupdatedby != null ? !lastupdatedby.equals(that.lastupdatedby) : that.lastupdatedby != null)
            return false;
        if (lastupdatedtime != null ? !lastupdatedtime.equals(that.lastupdatedtime) : that.lastupdatedtime != null)
            return false;
        if (refreshtime != null ? !refreshtime.equals(that.refreshtime) : that.refreshtime != null) return false;
        if (uploadflag != null ? !uploadflag.equals(that.uploadflag) : that.uploadflag != null) return false;
        if (downloadflag != null ? !downloadflag.equals(that.downloadflag) : that.downloadflag != null) return false;
        if (deleteflag != null ? !deleteflag.equals(that.deleteflag) : that.deleteflag != null) return false;
        if (gzdbAddtime != null ? !gzdbAddtime.equals(that.gzdbAddtime) : that.gzdbAddtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemid != null ? systemid.hashCode() : 0;
        result = 31 * result + (ajbh != null ? ajbh.hashCode() : 0);
        result = 31 * result + (rybh != null ? rybh.hashCode() : 0);
        result = 31 * result + (zagj != null ? zagj.hashCode() : 0);
        result = 31 * result + (sdtd != null ? sdtd.hashCode() : 0);
        result = 31 * result + (xzsj != null ? xzsj.hashCode() : 0);
        result = 31 * result + (xzcs != null ? xzcs.hashCode() : 0);
        result = 31 * result + (xzdx != null ? xzdx.hashCode() : 0);
        result = 31 * result + (rylx != null ? rylx.hashCode() : 0);
        result = 31 * result + (rystate != null ? rystate.hashCode() : 0);
        result = 31 * result + (ryshxs != null ? ryshxs.hashCode() : 0);
        result = 31 * result + (rsshcd != null ? rsshcd.hashCode() : 0);
        result = 31 * result + (sazz != null ? sazz.hashCode() : 0);
        result = 31 * result + (ssje != null ? ssje.hashCode() : 0);
        result = 31 * result + (srwhss != null ? srwhss.hashCode() : 0);
        result = 31 * result + (qfqk != null ? qfqk.hashCode() : 0);
        result = 31 * result + (swqk != null ? swqk.hashCode() : 0);
        result = 31 * result + (zcf != null ? zcf.hashCode() : 0);
        result = 31 * result + (departmentcode != null ? departmentcode.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (createdtime != null ? createdtime.hashCode() : 0);
        result = 31 * result + (securitygrade != null ? securitygrade.hashCode() : 0);
        result = 31 * result + (reservation01 != null ? reservation01.hashCode() : 0);
        result = 31 * result + (reservation02 != null ? reservation02.hashCode() : 0);
        result = 31 * result + (reservation03 != null ? reservation03.hashCode() : 0);
        result = 31 * result + (reservation04 != null ? reservation04.hashCode() : 0);
        result = 31 * result + (reservation05 != null ? reservation05.hashCode() : 0);
        result = 31 * result + (reservation06 != null ? reservation06.hashCode() : 0);
        result = 31 * result + (reservation07 != null ? reservation07.hashCode() : 0);
        result = 31 * result + (reservation08 != null ? reservation08.hashCode() : 0);
        result = 31 * result + (reservation09 != null ? reservation09.hashCode() : 0);
        result = 31 * result + (reservation10 != null ? reservation10.hashCode() : 0);
        result = 31 * result + (lastupdatedby != null ? lastupdatedby.hashCode() : 0);
        result = 31 * result + (lastupdatedtime != null ? lastupdatedtime.hashCode() : 0);
        result = 31 * result + (refreshtime != null ? refreshtime.hashCode() : 0);
        result = 31 * result + (uploadflag != null ? uploadflag.hashCode() : 0);
        result = 31 * result + (downloadflag != null ? downloadflag.hashCode() : 0);
        result = 31 * result + (deleteflag != null ? deleteflag.hashCode() : 0);
        result = 31 * result + (gzdbAddtime != null ? gzdbAddtime.hashCode() : 0);
        return result;
    }
}
