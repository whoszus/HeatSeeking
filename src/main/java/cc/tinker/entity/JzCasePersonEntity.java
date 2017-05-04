package cc.tinker.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Tinker on 2017/3/15.
 */
//省警综-案事件-报案、受害、当事、其人
@Entity
@Table(name = "jz_case_person")
public class JzCasePersonEntity {
    private String tlsy;
    private String lhyy;
    private String ljd;
    private String qzzlqz;
    private String qzhm;
    private String qzqfd;
    private String xxdzms;
    private String lxrxm;
    private String lxrdh;
    private String jdrmc;
    private String sfzy;
    private String rylx;
    private String rystate;
    private String ryshxs;
    private String rsshcd;
    private Double sazz;
    private Double ssje;
    private Double srwhss;
    private String qfqk;
    private String swqk;
    private String bz;
    private String ryly;
    private String ztid;
    private String lrdw;
    private Timestamp lrsj;
    private String lrr;
    private String departmentcode;
    private String creator;
    private Timestamp createdtime;
    private String securitygrade;
    private String reservation01;
    private String systemid;
    private String rybh;
    private String xm;
    private String cym;
    private String ywx;
    private String ywm;
    private String bm;
    private String byname;
    private String qtzjlx1;
    private String qtzjhm1;
    private String zjzl;
    private String zjhm;
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
    private String reservation11;
    private String reservation12;
    private String reservation13;
    private String reservation14;
    private String reservation15;
    private String reservation16;
    private String reservation17;
    private Timestamp reservation18;
    private Timestamp reservation19;
    private Timestamp reservation20;
    private String rylxCn;
    private String xb;
    private Timestamp csrq;
    private String mz;
    private String zzdxzqh;
    private String hyzk;
    private String sf;
    private String xrtssf;
    private String xrzhiy;
    private String brdwqh;
    private String jzdxzqh;
    private String gj;
    private String jiguan;
    private String hjdz;
    private String xzqh;
    private String lxdh;
    private String gzdw;
    private String rywhcd;
    private String jzyy;
    private String gjCn;
    private String reservation05Cn;
    private String reservation04Cn;
    private String reservation01Cn;
    private String swqkCn;
    private String sfCn;
    private String xbCn;
    private String zjzlCn;
    private String jzdxzqhCn;
    private String jiguanCn;
    private String mzCn;
    private String ryshxsCn;
    private String lrrCn;
    private String lrdwCn;
    private String datastate;
    private String datacheck;
    private String queryid;
    private String departmentcodeCn;
    private String creatorCn;
    private String lastupdatedbyCn;
    private Timestamp gzdbAddtime;

    private Integer rownum;
    @Transient
    public Integer getRownum() {
        return rownum;
    }

    public void setRownum(Integer rownum) {
        this.rownum = rownum;
    }

    @Basic
    @Column(name = "TLSY")
    public String getTlsy() {
        return tlsy;
    }

    public void setTlsy(String tlsy) {
        this.tlsy = tlsy;
    }

    @Basic
    @Column(name = "LHYY")
    public String getLhyy() {
        return lhyy;
    }

    public void setLhyy(String lhyy) {
        this.lhyy = lhyy;
    }

    @Basic
    @Column(name = "LJD")
    public String getLjd() {
        return ljd;
    }

    public void setLjd(String ljd) {
        this.ljd = ljd;
    }

    @Basic
    @Column(name = "QZZLQZ")
    public String getQzzlqz() {
        return qzzlqz;
    }

    public void setQzzlqz(String qzzlqz) {
        this.qzzlqz = qzzlqz;
    }

    @Basic
    @Column(name = "QZHM")
    public String getQzhm() {
        return qzhm;
    }

    public void setQzhm(String qzhm) {
        this.qzhm = qzhm;
    }

    @Basic
    @Column(name = "QZQFD")
    public String getQzqfd() {
        return qzqfd;
    }

    public void setQzqfd(String qzqfd) {
        this.qzqfd = qzqfd;
    }

    @Basic
    @Column(name = "XXDZMS")
    public String getXxdzms() {
        return xxdzms;
    }

    public void setXxdzms(String xxdzms) {
        this.xxdzms = xxdzms;
    }

    @Basic
    @Column(name = "LXRXM")
    public String getLxrxm() {
        return lxrxm;
    }

    public void setLxrxm(String lxrxm) {
        this.lxrxm = lxrxm;
    }

    @Basic
    @Column(name = "LXRDH")
    public String getLxrdh() {
        return lxrdh;
    }

    public void setLxrdh(String lxrdh) {
        this.lxrdh = lxrdh;
    }

    @Basic
    @Column(name = "JDRMC")
    public String getJdrmc() {
        return jdrmc;
    }

    public void setJdrmc(String jdrmc) {
        this.jdrmc = jdrmc;
    }

    @Basic
    @Column(name = "SFZY")
    public String getSfzy() {
        return sfzy;
    }

    public void setSfzy(String sfzy) {
        this.sfzy = sfzy;
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
    @Column(name = "BZ")
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Basic
    @Column(name = "RYLY")
    public String getRyly() {
        return ryly;
    }

    public void setRyly(String ryly) {
        this.ryly = ryly;
    }

    @Basic
    @Column(name = "ZTID")
    public String getZtid() {
        return ztid;
    }

    public void setZtid(String ztid) {
        this.ztid = ztid;
    }

    @Basic
    @Column(name = "LRDW")
    public String getLrdw() {
        return lrdw;
    }

    public void setLrdw(String lrdw) {
        this.lrdw = lrdw;
    }

    @Basic
    @Column(name = "LRSJ")
    public Timestamp getLrsj() {
        return lrsj;
    }

    public void setLrsj(Timestamp lrsj) {
        this.lrsj = lrsj;
    }

    @Basic
    @Column(name = "LRR")
    public String getLrr() {
        return lrr;
    }

    public void setLrr(String lrr) {
        this.lrr = lrr;
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

    @Id
    @Column(name = "SYSTEMID")
    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
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
    @Column(name = "XM")
    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    @Basic
    @Column(name = "CYM")
    public String getCym() {
        return cym;
    }

    public void setCym(String cym) {
        this.cym = cym;
    }

    @Basic
    @Column(name = "YWX")
    public String getYwx() {
        return ywx;
    }

    public void setYwx(String ywx) {
        this.ywx = ywx;
    }

    @Basic
    @Column(name = "YWM")
    public String getYwm() {
        return ywm;
    }

    public void setYwm(String ywm) {
        this.ywm = ywm;
    }

    @Basic
    @Column(name = "BM")
    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm;
    }

    @Basic
    @Column(name = "BYNAME")
    public String getByname() {
        return byname;
    }

    public void setByname(String byname) {
        this.byname = byname;
    }

    @Basic
    @Column(name = "QTZJLX1")
    public String getQtzjlx1() {
        return qtzjlx1;
    }

    public void setQtzjlx1(String qtzjlx1) {
        this.qtzjlx1 = qtzjlx1;
    }

    @Basic
    @Column(name = "QTZJHM1")
    public String getQtzjhm1() {
        return qtzjhm1;
    }

    public void setQtzjhm1(String qtzjhm1) {
        this.qtzjhm1 = qtzjhm1;
    }

    @Basic
    @Column(name = "ZJZL")
    public String getZjzl() {
        return zjzl;
    }

    public void setZjzl(String zjzl) {
        this.zjzl = zjzl;
    }

    @Basic
    @Column(name = "ZJHM")
    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
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
    @Column(name = "RESERVATION11")
    public String getReservation11() {
        return reservation11;
    }

    public void setReservation11(String reservation11) {
        this.reservation11 = reservation11;
    }

    @Basic
    @Column(name = "RESERVATION12")
    public String getReservation12() {
        return reservation12;
    }

    public void setReservation12(String reservation12) {
        this.reservation12 = reservation12;
    }

    @Basic
    @Column(name = "RESERVATION13")
    public String getReservation13() {
        return reservation13;
    }

    public void setReservation13(String reservation13) {
        this.reservation13 = reservation13;
    }

    @Basic
    @Column(name = "RESERVATION14")
    public String getReservation14() {
        return reservation14;
    }

    public void setReservation14(String reservation14) {
        this.reservation14 = reservation14;
    }

    @Basic
    @Column(name = "RESERVATION15")
    public String getReservation15() {
        return reservation15;
    }

    public void setReservation15(String reservation15) {
        this.reservation15 = reservation15;
    }

    @Basic
    @Column(name = "RESERVATION16")
    public String getReservation16() {
        return reservation16;
    }

    public void setReservation16(String reservation16) {
        this.reservation16 = reservation16;
    }

    @Basic
    @Column(name = "RESERVATION17")
    public String getReservation17() {
        return reservation17;
    }

    public void setReservation17(String reservation17) {
        this.reservation17 = reservation17;
    }

    @Basic
    @Column(name = "RESERVATION18")
    public Timestamp getReservation18() {
        return reservation18;
    }

    public void setReservation18(Timestamp reservation18) {
        this.reservation18 = reservation18;
    }

    @Basic
    @Column(name = "RESERVATION19")
    public Timestamp getReservation19() {
        return reservation19;
    }

    public void setReservation19(Timestamp reservation19) {
        this.reservation19 = reservation19;
    }

    @Basic
    @Column(name = "RESERVATION20")
    public Timestamp getReservation20() {
        return reservation20;
    }

    public void setReservation20(Timestamp reservation20) {
        this.reservation20 = reservation20;
    }

    @Basic
    @Column(name = "RYLX_CN")
    public String getRylxCn() {
        return rylxCn;
    }

    public void setRylxCn(String rylxCn) {
        this.rylxCn = rylxCn;
    }

    @Basic
    @Column(name = "XB")
    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    @Basic
    @Column(name = "CSRQ")
    public Timestamp getCsrq() {
        return csrq;
    }

    public void setCsrq(Timestamp csrq) {
        this.csrq = csrq;
    }

    @Basic
    @Column(name = "MZ")
    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    @Basic
    @Column(name = "ZZDXZQH")
    public String getZzdxzqh() {
        return zzdxzqh;
    }

    public void setZzdxzqh(String zzdxzqh) {
        this.zzdxzqh = zzdxzqh;
    }

    @Basic
    @Column(name = "HYZK")
    public String getHyzk() {
        return hyzk;
    }

    public void setHyzk(String hyzk) {
        this.hyzk = hyzk;
    }

    @Basic
    @Column(name = "SF")
    public String getSf() {
        return sf;
    }

    public void setSf(String sf) {
        this.sf = sf;
    }

    @Basic
    @Column(name = "XRTSSF")
    public String getXrtssf() {
        return xrtssf;
    }

    public void setXrtssf(String xrtssf) {
        this.xrtssf = xrtssf;
    }

    @Basic
    @Column(name = "XRZHIY")
    public String getXrzhiy() {
        return xrzhiy;
    }

    public void setXrzhiy(String xrzhiy) {
        this.xrzhiy = xrzhiy;
    }

    @Basic
    @Column(name = "BRDWQH")
    public String getBrdwqh() {
        return brdwqh;
    }

    public void setBrdwqh(String brdwqh) {
        this.brdwqh = brdwqh;
    }

    @Basic
    @Column(name = "JZDXZQH")
    public String getJzdxzqh() {
        return jzdxzqh;
    }

    public void setJzdxzqh(String jzdxzqh) {
        this.jzdxzqh = jzdxzqh;
    }

    @Basic
    @Column(name = "GJ")
    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    @Basic
    @Column(name = "JIGUAN")
    public String getJiguan() {
        return jiguan;
    }

    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }

    @Basic
    @Column(name = "HJDZ")
    public String getHjdz() {
        return hjdz;
    }

    public void setHjdz(String hjdz) {
        this.hjdz = hjdz;
    }

    @Basic
    @Column(name = "XZQH")
    public String getXzqh() {
        return xzqh;
    }

    public void setXzqh(String xzqh) {
        this.xzqh = xzqh;
    }

    @Basic
    @Column(name = "LXDH")
    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    @Basic
    @Column(name = "GZDW")
    public String getGzdw() {
        return gzdw;
    }

    public void setGzdw(String gzdw) {
        this.gzdw = gzdw;
    }

    @Basic
    @Column(name = "RYWHCD")
    public String getRywhcd() {
        return rywhcd;
    }

    public void setRywhcd(String rywhcd) {
        this.rywhcd = rywhcd;
    }

    @Basic
    @Column(name = "JZYY")
    public String getJzyy() {
        return jzyy;
    }

    public void setJzyy(String jzyy) {
        this.jzyy = jzyy;
    }

    @Basic
    @Column(name = "GJ_CN")
    public String getGjCn() {
        return gjCn;
    }

    public void setGjCn(String gjCn) {
        this.gjCn = gjCn;
    }

    @Basic
    @Column(name = "RESERVATION05_CN")
    public String getReservation05Cn() {
        return reservation05Cn;
    }

    public void setReservation05Cn(String reservation05Cn) {
        this.reservation05Cn = reservation05Cn;
    }

    @Basic
    @Column(name = "RESERVATION04_CN")
    public String getReservation04Cn() {
        return reservation04Cn;
    }

    public void setReservation04Cn(String reservation04Cn) {
        this.reservation04Cn = reservation04Cn;
    }

    @Basic
    @Column(name = "RESERVATION01_CN")
    public String getReservation01Cn() {
        return reservation01Cn;
    }

    public void setReservation01Cn(String reservation01Cn) {
        this.reservation01Cn = reservation01Cn;
    }

    @Basic
    @Column(name = "SWQK_CN")
    public String getSwqkCn() {
        return swqkCn;
    }

    public void setSwqkCn(String swqkCn) {
        this.swqkCn = swqkCn;
    }

    @Basic
    @Column(name = "SF_CN")
    public String getSfCn() {
        return sfCn;
    }

    public void setSfCn(String sfCn) {
        this.sfCn = sfCn;
    }

    @Basic
    @Column(name = "XB_CN")
    public String getXbCn() {
        return xbCn;
    }

    public void setXbCn(String xbCn) {
        this.xbCn = xbCn;
    }

    @Basic
    @Column(name = "ZJZL_CN")
    public String getZjzlCn() {
        return zjzlCn;
    }

    public void setZjzlCn(String zjzlCn) {
        this.zjzlCn = zjzlCn;
    }

    @Basic
    @Column(name = "JZDXZQH_CN")
    public String getJzdxzqhCn() {
        return jzdxzqhCn;
    }

    public void setJzdxzqhCn(String jzdxzqhCn) {
        this.jzdxzqhCn = jzdxzqhCn;
    }

    @Basic
    @Column(name = "JIGUAN_CN")
    public String getJiguanCn() {
        return jiguanCn;
    }

    public void setJiguanCn(String jiguanCn) {
        this.jiguanCn = jiguanCn;
    }

    @Basic
    @Column(name = "MZ_CN")
    public String getMzCn() {
        return mzCn;
    }

    public void setMzCn(String mzCn) {
        this.mzCn = mzCn;
    }

    @Basic
    @Column(name = "RYSHXS_CN")
    public String getRyshxsCn() {
        return ryshxsCn;
    }

    public void setRyshxsCn(String ryshxsCn) {
        this.ryshxsCn = ryshxsCn;
    }

    @Basic
    @Column(name = "LRR_CN")
    public String getLrrCn() {
        return lrrCn;
    }

    public void setLrrCn(String lrrCn) {
        this.lrrCn = lrrCn;
    }

    @Basic
    @Column(name = "LRDW_CN")
    public String getLrdwCn() {
        return lrdwCn;
    }

    public void setLrdwCn(String lrdwCn) {
        this.lrdwCn = lrdwCn;
    }

    @Basic
    @Column(name = "DATASTATE")
    public String getDatastate() {
        return datastate;
    }

    public void setDatastate(String datastate) {
        this.datastate = datastate;
    }

    @Basic
    @Column(name = "DATACHECK")
    public String getDatacheck() {
        return datacheck;
    }

    public void setDatacheck(String datacheck) {
        this.datacheck = datacheck;
    }

    @Basic
    @Column(name = "QUERYID")
    public String getQueryid() {
        return queryid;
    }

    public void setQueryid(String queryid) {
        this.queryid = queryid;
    }

    @Basic
    @Column(name = "DEPARTMENTCODE_CN")
    public String getDepartmentcodeCn() {
        return departmentcodeCn;
    }

    public void setDepartmentcodeCn(String departmentcodeCn) {
        this.departmentcodeCn = departmentcodeCn;
    }

    @Basic
    @Column(name = "CREATOR_CN")
    public String getCreatorCn() {
        return creatorCn;
    }

    public void setCreatorCn(String creatorCn) {
        this.creatorCn = creatorCn;
    }

    @Basic
    @Column(name = "LASTUPDATEDBY_CN")
    public String getLastupdatedbyCn() {
        return lastupdatedbyCn;
    }

    public void setLastupdatedbyCn(String lastupdatedbyCn) {
        this.lastupdatedbyCn = lastupdatedbyCn;
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

        JzCasePersonEntity that = (JzCasePersonEntity) o;

        if (tlsy != null ? !tlsy.equals(that.tlsy) : that.tlsy != null) return false;
        if (lhyy != null ? !lhyy.equals(that.lhyy) : that.lhyy != null) return false;
        if (ljd != null ? !ljd.equals(that.ljd) : that.ljd != null) return false;
        if (qzzlqz != null ? !qzzlqz.equals(that.qzzlqz) : that.qzzlqz != null) return false;
        if (qzhm != null ? !qzhm.equals(that.qzhm) : that.qzhm != null) return false;
        if (qzqfd != null ? !qzqfd.equals(that.qzqfd) : that.qzqfd != null) return false;
        if (xxdzms != null ? !xxdzms.equals(that.xxdzms) : that.xxdzms != null) return false;
        if (lxrxm != null ? !lxrxm.equals(that.lxrxm) : that.lxrxm != null) return false;
        if (lxrdh != null ? !lxrdh.equals(that.lxrdh) : that.lxrdh != null) return false;
        if (jdrmc != null ? !jdrmc.equals(that.jdrmc) : that.jdrmc != null) return false;
        if (sfzy != null ? !sfzy.equals(that.sfzy) : that.sfzy != null) return false;
        if (rylx != null ? !rylx.equals(that.rylx) : that.rylx != null) return false;
        if (rystate != null ? !rystate.equals(that.rystate) : that.rystate != null) return false;
        if (ryshxs != null ? !ryshxs.equals(that.ryshxs) : that.ryshxs != null) return false;
        if (rsshcd != null ? !rsshcd.equals(that.rsshcd) : that.rsshcd != null) return false;
        if (sazz != null ? !sazz.equals(that.sazz) : that.sazz != null) return false;
        if (ssje != null ? !ssje.equals(that.ssje) : that.ssje != null) return false;
        if (srwhss != null ? !srwhss.equals(that.srwhss) : that.srwhss != null) return false;
        if (qfqk != null ? !qfqk.equals(that.qfqk) : that.qfqk != null) return false;
        if (swqk != null ? !swqk.equals(that.swqk) : that.swqk != null) return false;
        if (bz != null ? !bz.equals(that.bz) : that.bz != null) return false;
        if (ryly != null ? !ryly.equals(that.ryly) : that.ryly != null) return false;
        if (ztid != null ? !ztid.equals(that.ztid) : that.ztid != null) return false;
        if (lrdw != null ? !lrdw.equals(that.lrdw) : that.lrdw != null) return false;
        if (lrsj != null ? !lrsj.equals(that.lrsj) : that.lrsj != null) return false;
        if (lrr != null ? !lrr.equals(that.lrr) : that.lrr != null) return false;
        if (departmentcode != null ? !departmentcode.equals(that.departmentcode) : that.departmentcode != null)
            return false;
        if (creator != null ? !creator.equals(that.creator) : that.creator != null) return false;
        if (createdtime != null ? !createdtime.equals(that.createdtime) : that.createdtime != null) return false;
        if (securitygrade != null ? !securitygrade.equals(that.securitygrade) : that.securitygrade != null)
            return false;
        if (reservation01 != null ? !reservation01.equals(that.reservation01) : that.reservation01 != null)
            return false;
        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (rybh != null ? !rybh.equals(that.rybh) : that.rybh != null) return false;
        if (xm != null ? !xm.equals(that.xm) : that.xm != null) return false;
        if (cym != null ? !cym.equals(that.cym) : that.cym != null) return false;
        if (ywx != null ? !ywx.equals(that.ywx) : that.ywx != null) return false;
        if (ywm != null ? !ywm.equals(that.ywm) : that.ywm != null) return false;
        if (bm != null ? !bm.equals(that.bm) : that.bm != null) return false;
        if (byname != null ? !byname.equals(that.byname) : that.byname != null) return false;
        if (qtzjlx1 != null ? !qtzjlx1.equals(that.qtzjlx1) : that.qtzjlx1 != null) return false;
        if (qtzjhm1 != null ? !qtzjhm1.equals(that.qtzjhm1) : that.qtzjhm1 != null) return false;
        if (zjzl != null ? !zjzl.equals(that.zjzl) : that.zjzl != null) return false;
        if (zjhm != null ? !zjhm.equals(that.zjhm) : that.zjhm != null) return false;
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
        if (reservation11 != null ? !reservation11.equals(that.reservation11) : that.reservation11 != null)
            return false;
        if (reservation12 != null ? !reservation12.equals(that.reservation12) : that.reservation12 != null)
            return false;
        if (reservation13 != null ? !reservation13.equals(that.reservation13) : that.reservation13 != null)
            return false;
        if (reservation14 != null ? !reservation14.equals(that.reservation14) : that.reservation14 != null)
            return false;
        if (reservation15 != null ? !reservation15.equals(that.reservation15) : that.reservation15 != null)
            return false;
        if (reservation16 != null ? !reservation16.equals(that.reservation16) : that.reservation16 != null)
            return false;
        if (reservation17 != null ? !reservation17.equals(that.reservation17) : that.reservation17 != null)
            return false;
        if (reservation18 != null ? !reservation18.equals(that.reservation18) : that.reservation18 != null)
            return false;
        if (reservation19 != null ? !reservation19.equals(that.reservation19) : that.reservation19 != null)
            return false;
        if (reservation20 != null ? !reservation20.equals(that.reservation20) : that.reservation20 != null)
            return false;
        if (rylxCn != null ? !rylxCn.equals(that.rylxCn) : that.rylxCn != null) return false;
        if (xb != null ? !xb.equals(that.xb) : that.xb != null) return false;
        if (csrq != null ? !csrq.equals(that.csrq) : that.csrq != null) return false;
        if (mz != null ? !mz.equals(that.mz) : that.mz != null) return false;
        if (zzdxzqh != null ? !zzdxzqh.equals(that.zzdxzqh) : that.zzdxzqh != null) return false;
        if (hyzk != null ? !hyzk.equals(that.hyzk) : that.hyzk != null) return false;
        if (sf != null ? !sf.equals(that.sf) : that.sf != null) return false;
        if (xrtssf != null ? !xrtssf.equals(that.xrtssf) : that.xrtssf != null) return false;
        if (xrzhiy != null ? !xrzhiy.equals(that.xrzhiy) : that.xrzhiy != null) return false;
        if (brdwqh != null ? !brdwqh.equals(that.brdwqh) : that.brdwqh != null) return false;
        if (jzdxzqh != null ? !jzdxzqh.equals(that.jzdxzqh) : that.jzdxzqh != null) return false;
        if (gj != null ? !gj.equals(that.gj) : that.gj != null) return false;
        if (jiguan != null ? !jiguan.equals(that.jiguan) : that.jiguan != null) return false;
        if (hjdz != null ? !hjdz.equals(that.hjdz) : that.hjdz != null) return false;
        if (xzqh != null ? !xzqh.equals(that.xzqh) : that.xzqh != null) return false;
        if (lxdh != null ? !lxdh.equals(that.lxdh) : that.lxdh != null) return false;
        if (gzdw != null ? !gzdw.equals(that.gzdw) : that.gzdw != null) return false;
        if (rywhcd != null ? !rywhcd.equals(that.rywhcd) : that.rywhcd != null) return false;
        if (jzyy != null ? !jzyy.equals(that.jzyy) : that.jzyy != null) return false;
        if (gjCn != null ? !gjCn.equals(that.gjCn) : that.gjCn != null) return false;
        if (reservation05Cn != null ? !reservation05Cn.equals(that.reservation05Cn) : that.reservation05Cn != null)
            return false;
        if (reservation04Cn != null ? !reservation04Cn.equals(that.reservation04Cn) : that.reservation04Cn != null)
            return false;
        if (reservation01Cn != null ? !reservation01Cn.equals(that.reservation01Cn) : that.reservation01Cn != null)
            return false;
        if (swqkCn != null ? !swqkCn.equals(that.swqkCn) : that.swqkCn != null) return false;
        if (sfCn != null ? !sfCn.equals(that.sfCn) : that.sfCn != null) return false;
        if (xbCn != null ? !xbCn.equals(that.xbCn) : that.xbCn != null) return false;
        if (zjzlCn != null ? !zjzlCn.equals(that.zjzlCn) : that.zjzlCn != null) return false;
        if (jzdxzqhCn != null ? !jzdxzqhCn.equals(that.jzdxzqhCn) : that.jzdxzqhCn != null) return false;
        if (jiguanCn != null ? !jiguanCn.equals(that.jiguanCn) : that.jiguanCn != null) return false;
        if (mzCn != null ? !mzCn.equals(that.mzCn) : that.mzCn != null) return false;
        if (ryshxsCn != null ? !ryshxsCn.equals(that.ryshxsCn) : that.ryshxsCn != null) return false;
        if (lrrCn != null ? !lrrCn.equals(that.lrrCn) : that.lrrCn != null) return false;
        if (lrdwCn != null ? !lrdwCn.equals(that.lrdwCn) : that.lrdwCn != null) return false;
        if (datastate != null ? !datastate.equals(that.datastate) : that.datastate != null) return false;
        if (datacheck != null ? !datacheck.equals(that.datacheck) : that.datacheck != null) return false;
        if (queryid != null ? !queryid.equals(that.queryid) : that.queryid != null) return false;
        if (departmentcodeCn != null ? !departmentcodeCn.equals(that.departmentcodeCn) : that.departmentcodeCn != null)
            return false;
        if (creatorCn != null ? !creatorCn.equals(that.creatorCn) : that.creatorCn != null) return false;
        if (lastupdatedbyCn != null ? !lastupdatedbyCn.equals(that.lastupdatedbyCn) : that.lastupdatedbyCn != null)
            return false;
        if (gzdbAddtime != null ? !gzdbAddtime.equals(that.gzdbAddtime) : that.gzdbAddtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tlsy != null ? tlsy.hashCode() : 0;
        result = 31 * result + (lhyy != null ? lhyy.hashCode() : 0);
        result = 31 * result + (ljd != null ? ljd.hashCode() : 0);
        result = 31 * result + (qzzlqz != null ? qzzlqz.hashCode() : 0);
        result = 31 * result + (qzhm != null ? qzhm.hashCode() : 0);
        result = 31 * result + (qzqfd != null ? qzqfd.hashCode() : 0);
        result = 31 * result + (xxdzms != null ? xxdzms.hashCode() : 0);
        result = 31 * result + (lxrxm != null ? lxrxm.hashCode() : 0);
        result = 31 * result + (lxrdh != null ? lxrdh.hashCode() : 0);
        result = 31 * result + (jdrmc != null ? jdrmc.hashCode() : 0);
        result = 31 * result + (sfzy != null ? sfzy.hashCode() : 0);
        result = 31 * result + (rylx != null ? rylx.hashCode() : 0);
        result = 31 * result + (rystate != null ? rystate.hashCode() : 0);
        result = 31 * result + (ryshxs != null ? ryshxs.hashCode() : 0);
        result = 31 * result + (rsshcd != null ? rsshcd.hashCode() : 0);
        result = 31 * result + (sazz != null ? sazz.hashCode() : 0);
        result = 31 * result + (ssje != null ? ssje.hashCode() : 0);
        result = 31 * result + (srwhss != null ? srwhss.hashCode() : 0);
        result = 31 * result + (qfqk != null ? qfqk.hashCode() : 0);
        result = 31 * result + (swqk != null ? swqk.hashCode() : 0);
        result = 31 * result + (bz != null ? bz.hashCode() : 0);
        result = 31 * result + (ryly != null ? ryly.hashCode() : 0);
        result = 31 * result + (ztid != null ? ztid.hashCode() : 0);
        result = 31 * result + (lrdw != null ? lrdw.hashCode() : 0);
        result = 31 * result + (lrsj != null ? lrsj.hashCode() : 0);
        result = 31 * result + (lrr != null ? lrr.hashCode() : 0);
        result = 31 * result + (departmentcode != null ? departmentcode.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (createdtime != null ? createdtime.hashCode() : 0);
        result = 31 * result + (securitygrade != null ? securitygrade.hashCode() : 0);
        result = 31 * result + (reservation01 != null ? reservation01.hashCode() : 0);
        result = 31 * result + (systemid != null ? systemid.hashCode() : 0);
        result = 31 * result + (rybh != null ? rybh.hashCode() : 0);
        result = 31 * result + (xm != null ? xm.hashCode() : 0);
        result = 31 * result + (cym != null ? cym.hashCode() : 0);
        result = 31 * result + (ywx != null ? ywx.hashCode() : 0);
        result = 31 * result + (ywm != null ? ywm.hashCode() : 0);
        result = 31 * result + (bm != null ? bm.hashCode() : 0);
        result = 31 * result + (byname != null ? byname.hashCode() : 0);
        result = 31 * result + (qtzjlx1 != null ? qtzjlx1.hashCode() : 0);
        result = 31 * result + (qtzjhm1 != null ? qtzjhm1.hashCode() : 0);
        result = 31 * result + (zjzl != null ? zjzl.hashCode() : 0);
        result = 31 * result + (zjhm != null ? zjhm.hashCode() : 0);
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
        result = 31 * result + (reservation11 != null ? reservation11.hashCode() : 0);
        result = 31 * result + (reservation12 != null ? reservation12.hashCode() : 0);
        result = 31 * result + (reservation13 != null ? reservation13.hashCode() : 0);
        result = 31 * result + (reservation14 != null ? reservation14.hashCode() : 0);
        result = 31 * result + (reservation15 != null ? reservation15.hashCode() : 0);
        result = 31 * result + (reservation16 != null ? reservation16.hashCode() : 0);
        result = 31 * result + (reservation17 != null ? reservation17.hashCode() : 0);
        result = 31 * result + (reservation18 != null ? reservation18.hashCode() : 0);
        result = 31 * result + (reservation19 != null ? reservation19.hashCode() : 0);
        result = 31 * result + (reservation20 != null ? reservation20.hashCode() : 0);
        result = 31 * result + (rylxCn != null ? rylxCn.hashCode() : 0);
        result = 31 * result + (xb != null ? xb.hashCode() : 0);
        result = 31 * result + (csrq != null ? csrq.hashCode() : 0);
        result = 31 * result + (mz != null ? mz.hashCode() : 0);
        result = 31 * result + (zzdxzqh != null ? zzdxzqh.hashCode() : 0);
        result = 31 * result + (hyzk != null ? hyzk.hashCode() : 0);
        result = 31 * result + (sf != null ? sf.hashCode() : 0);
        result = 31 * result + (xrtssf != null ? xrtssf.hashCode() : 0);
        result = 31 * result + (xrzhiy != null ? xrzhiy.hashCode() : 0);
        result = 31 * result + (brdwqh != null ? brdwqh.hashCode() : 0);
        result = 31 * result + (jzdxzqh != null ? jzdxzqh.hashCode() : 0);
        result = 31 * result + (gj != null ? gj.hashCode() : 0);
        result = 31 * result + (jiguan != null ? jiguan.hashCode() : 0);
        result = 31 * result + (hjdz != null ? hjdz.hashCode() : 0);
        result = 31 * result + (xzqh != null ? xzqh.hashCode() : 0);
        result = 31 * result + (lxdh != null ? lxdh.hashCode() : 0);
        result = 31 * result + (gzdw != null ? gzdw.hashCode() : 0);
        result = 31 * result + (rywhcd != null ? rywhcd.hashCode() : 0);
        result = 31 * result + (jzyy != null ? jzyy.hashCode() : 0);
        result = 31 * result + (gjCn != null ? gjCn.hashCode() : 0);
        result = 31 * result + (reservation05Cn != null ? reservation05Cn.hashCode() : 0);
        result = 31 * result + (reservation04Cn != null ? reservation04Cn.hashCode() : 0);
        result = 31 * result + (reservation01Cn != null ? reservation01Cn.hashCode() : 0);
        result = 31 * result + (swqkCn != null ? swqkCn.hashCode() : 0);
        result = 31 * result + (sfCn != null ? sfCn.hashCode() : 0);
        result = 31 * result + (xbCn != null ? xbCn.hashCode() : 0);
        result = 31 * result + (zjzlCn != null ? zjzlCn.hashCode() : 0);
        result = 31 * result + (jzdxzqhCn != null ? jzdxzqhCn.hashCode() : 0);
        result = 31 * result + (jiguanCn != null ? jiguanCn.hashCode() : 0);
        result = 31 * result + (mzCn != null ? mzCn.hashCode() : 0);
        result = 31 * result + (ryshxsCn != null ? ryshxsCn.hashCode() : 0);
        result = 31 * result + (lrrCn != null ? lrrCn.hashCode() : 0);
        result = 31 * result + (lrdwCn != null ? lrdwCn.hashCode() : 0);
        result = 31 * result + (datastate != null ? datastate.hashCode() : 0);
        result = 31 * result + (datacheck != null ? datacheck.hashCode() : 0);
        result = 31 * result + (queryid != null ? queryid.hashCode() : 0);
        result = 31 * result + (departmentcodeCn != null ? departmentcodeCn.hashCode() : 0);
        result = 31 * result + (creatorCn != null ? creatorCn.hashCode() : 0);
        result = 31 * result + (lastupdatedbyCn != null ? lastupdatedbyCn.hashCode() : 0);
        result = 31 * result + (gzdbAddtime != null ? gzdbAddtime.hashCode() : 0);
        return result;
    }
}
