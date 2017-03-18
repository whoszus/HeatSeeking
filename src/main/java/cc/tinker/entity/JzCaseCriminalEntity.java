package cc.tinker.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Tinker on 2017/3/15.
 */
@Entity
@Table(name = "jz_case_criminal", schema = "heatseeking", catalog = "")
public class JzCaseCriminalEntity {
    private String systemid;
    private String rybh;
    private String zzdxzqh;
    private String ywgxbm;
    private String xrzwbh;
    private String zwbh;
    private String xm;
    private String ywx;
    private String ywm;
    private String bm;
    private String byname;
    private String zjzl;
    private String zjhm;
    private String xb;
    private Timestamp csrq;
    private Timestamp birthdayinend;
    private String gj;
    private String mz;
    private String rywhcd;
    private String hjdz;
    private String xzqh;
    private String zhch;
    private String xxdzms;
    private String gzdw;
    private String ky;
    private String lxdh;
    private String qtzjlx1;
    private String qtzjhm1;
    private String qtzjlx2;
    private String qtzjhm2;
    private String qtzjlx3;
    private String qtzjhm3;
    private String sf;
    private String sfxd;
    private String ljd;
    private String jzyy;
    private Integer sg;
    private String lx;
    private String tx;
    private String xx;
    private String tmtz;
    private String zagj;
    private String sdtd;
    private String xzsj;
    private String xzcs;
    private String xzdx;
    private String rylx;
    private String rystate;
    private Double sazz;
    private Double ssje;
    private String qfqk;
    private String jiguan;
    private String zy;
    private String ryjs;
    private String ab;
    private String swqk;
    private String zcf;
    private String wfjl;
    private String lrdw;
    private Timestamp lrsj;
    private String lrr;
    private String tlsy;
    private String lhyy;
    private String qzzlqz;
    private String qzhm;
    private String qzqfd;
    private String lxrxm;
    private String lxrdh;
    private String jdrmc;
    private String sfzy;
    private String wfqk;
    private String swztqk;
    private String cs;
    private Timestamp cszxrq;
    private String xzfs;
    private String bz;
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
    private String reservation11;
    private String reservation12;
    private String reservation13;
    private String reservation14;
    private String reservation15;
    private String reservation16;
    private String reservation17;
    private String reservation18;
    private String reservation19;
    private String reservation20;
    private Timestamp reservation21;
    private Timestamp reservation22;
    private Timestamp reservation23;
    private Integer reservation24;
    private Integer reservation25;
    private String lastupdatedby;
    private Timestamp lastupdatedtime;
    private Timestamp refreshtime;
    private String uploadflag;
    private String downloadflag;
    private String deleteflag;
    private String reserver1;
    private String reserver2;
    private String reserver3;
    private String reserver4;
    private String reserver5;
    private String reserver6;
    private String reserver7;
    private String reserver8;
    private String reserver9;
    private String reserver10;
    private String reserver11;
    private String reserver12;
    private String reserver13;
    private String reserver14;
    private String reserver15;
    private String reserver16;
    private String reserver17;
    private String reserver18;
    private String reserver19;
    private String reserver20;
    private String reserver21;
    private String reserver22;
    private String reserver23;
    private String reserver24;
    private String reserver25;
    private String reserver26;
    private String reserver27;
    private String reserver28;
    private String reserver29;
    private String reserver30;
    private String reserver31;
    private String reserver32;
    private String reserver33;
    private String reserver34;
    private String reserver35;
    private String reserver36;
    private String reserver37;
    private String reserver38;
    private String reserver39;
    private String reserver40;
    private String reserver41;
    private String reserver42;
    private String reserver43;
    private String reserver44;
    private String reserver45;
    private String reserver46;
    private String reserver47;
    private String reserver48;
    private String reserver49;
    private String reserver50;
    private Integer reserver51;
    private Integer reserver52;
    private Integer reserver53;
    private Integer reserver54;
    private Integer reserver55;
    private Integer reserver56;
    private Integer reserver57;
    private Integer reserver58;
    private Integer reserver59;
    private Integer reserver60;
    private Timestamp reserver61;
    private Timestamp reserver62;
    private Timestamp reserver63;
    private Timestamp reserver64;
    private Timestamp reserver65;
    private Timestamp reserver66;
    private Timestamp reserver67;
    private String reserver71;
    private String reserver72;
    private String reserver73;
    private String reserver74;
    private String reserver75;
    private String reserver76;
    private String reserver77;
    private Timestamp reserver68;
    private Timestamp reserver69;
    private Timestamp reserver70;
    private String reserver78;
    private String reserver79;
    private String reserver80;
    private String reservation11Cn;
    private String reservation15Cn;
    private String reservation16Cn;
    private String xzfsCn;
    private String lrdwCn;
    private String jiguanCn;
    private String zyCn;
    private String ryjsCn;
    private String abCn;
    private String rystateCn;
    private String swztqkCn;
    private String zzdxzqhCn;
    private String ywgxbmCn;
    private String xbCn;
    private String gjCn;
    private String mzCn;
    private String rywhcdCn;
    private String xzqhCn;
    private String zhchCn;
    private String kyCn;
    private String sfCn;
    private String sfxdCn;
    private String ljdCn;
    private String jzyyCn;
    private String lxCn;
    private String txCn;
    private String xxCn;
    private String tmtzCn;
    private String zagjCn;
    private String sdtdCn;
    private String xzsjCn;
    private String xzcsCn;
    private String xzdxCn;
    private String lrrCn;
    private String departmentcodeCn;
    private String creatorCn;
    private String lastupdatedbyCn;
    private String datastate;
    private String datacheck;
    private String queryid;
    private String reservation26;
    private String reservation27;
    private String reservation28;
    private String reservation29;
    private String reservation30;
    private String reservation31;
    private String reservation32;
    private String reservation33;
    private String reservation34;
    private String reservation35;
    private String reservation36;
    private String reservation37;
    private String reservation38;
    private String reservation39;
    private String reservation40;
    private String reservation41;
    private String reservation42;
    private String reservation43;
    private String reservation44;
    private String reservation45;
    private String reservation46;
    private String reservation47;
    private String reservation48;
    private String reservation49;
    private String reservation50;
    private String yctz;
    private String trackrybh;
    private String xdjyjg;
    private String sfjdxtxdry;
    private String sfjdxtfdry;
    private String sfda;
    private String sfzsxd;
    private String dnabh;
    private Timestamp gzdbAddtime;
    private String yxjyjg;
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
    @Column(name = "RYBH")
    public String getRybh() {
        return rybh;
    }

    public void setRybh(String rybh) {
        this.rybh = rybh;
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
    @Column(name = "YWGXBM")
    public String getYwgxbm() {
        return ywgxbm;
    }

    public void setYwgxbm(String ywgxbm) {
        this.ywgxbm = ywgxbm;
    }

    @Basic
    @Column(name = "XRZWBH")
    public String getXrzwbh() {
        return xrzwbh;
    }

    public void setXrzwbh(String xrzwbh) {
        this.xrzwbh = xrzwbh;
    }

    @Basic
    @Column(name = "ZWBH")
    public String getZwbh() {
        return zwbh;
    }

    public void setZwbh(String zwbh) {
        this.zwbh = zwbh;
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
    @Column(name = "BIRTHDAYINEND")
    public Timestamp getBirthdayinend() {
        return birthdayinend;
    }

    public void setBirthdayinend(Timestamp birthdayinend) {
        this.birthdayinend = birthdayinend;
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
    @Column(name = "MZ")
    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
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
    @Column(name = "ZHCH")
    public String getZhch() {
        return zhch;
    }

    public void setZhch(String zhch) {
        this.zhch = zhch;
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
    @Column(name = "GZDW")
    public String getGzdw() {
        return gzdw;
    }

    public void setGzdw(String gzdw) {
        this.gzdw = gzdw;
    }

    @Basic
    @Column(name = "KY")
    public String getKy() {
        return ky;
    }

    public void setKy(String ky) {
        this.ky = ky;
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
    @Column(name = "QTZJLX2")
    public String getQtzjlx2() {
        return qtzjlx2;
    }

    public void setQtzjlx2(String qtzjlx2) {
        this.qtzjlx2 = qtzjlx2;
    }

    @Basic
    @Column(name = "QTZJHM2")
    public String getQtzjhm2() {
        return qtzjhm2;
    }

    public void setQtzjhm2(String qtzjhm2) {
        this.qtzjhm2 = qtzjhm2;
    }

    @Basic
    @Column(name = "QTZJLX3")
    public String getQtzjlx3() {
        return qtzjlx3;
    }

    public void setQtzjlx3(String qtzjlx3) {
        this.qtzjlx3 = qtzjlx3;
    }

    @Basic
    @Column(name = "QTZJHM3")
    public String getQtzjhm3() {
        return qtzjhm3;
    }

    public void setQtzjhm3(String qtzjhm3) {
        this.qtzjhm3 = qtzjhm3;
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
    @Column(name = "SFXD")
    public String getSfxd() {
        return sfxd;
    }

    public void setSfxd(String sfxd) {
        this.sfxd = sfxd;
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
    @Column(name = "JZYY")
    public String getJzyy() {
        return jzyy;
    }

    public void setJzyy(String jzyy) {
        this.jzyy = jzyy;
    }

    @Basic
    @Column(name = "SG")
    public Integer getSg() {
        return sg;
    }

    public void setSg(Integer sg) {
        this.sg = sg;
    }

    @Basic
    @Column(name = "LX")
    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    @Basic
    @Column(name = "TX")
    public String getTx() {
        return tx;
    }

    public void setTx(String tx) {
        this.tx = tx;
    }

    @Basic
    @Column(name = "XX")
    public String getXx() {
        return xx;
    }

    public void setXx(String xx) {
        this.xx = xx;
    }

    @Basic
    @Column(name = "TMTZ")
    public String getTmtz() {
        return tmtz;
    }

    public void setTmtz(String tmtz) {
        this.tmtz = tmtz;
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
    @Column(name = "QFQK")
    public String getQfqk() {
        return qfqk;
    }

    public void setQfqk(String qfqk) {
        this.qfqk = qfqk;
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
    @Column(name = "ZY")
    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    @Basic
    @Column(name = "RYJS")
    public String getRyjs() {
        return ryjs;
    }

    public void setRyjs(String ryjs) {
        this.ryjs = ryjs;
    }

    @Basic
    @Column(name = "AB")
    public String getAb() {
        return ab;
    }

    public void setAb(String ab) {
        this.ab = ab;
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
    @Column(name = "WFJL")
    public String getWfjl() {
        return wfjl;
    }

    public void setWfjl(String wfjl) {
        this.wfjl = wfjl;
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
    @Column(name = "WFQK")
    public String getWfqk() {
        return wfqk;
    }

    public void setWfqk(String wfqk) {
        this.wfqk = wfqk;
    }

    @Basic
    @Column(name = "SWZTQK")
    public String getSwztqk() {
        return swztqk;
    }

    public void setSwztqk(String swztqk) {
        this.swztqk = swztqk;
    }

    @Basic
    @Column(name = "CS")
    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }

    @Basic
    @Column(name = "CSZXRQ")
    public Timestamp getCszxrq() {
        return cszxrq;
    }

    public void setCszxrq(Timestamp cszxrq) {
        this.cszxrq = cszxrq;
    }

    @Basic
    @Column(name = "XZFS")
    public String getXzfs() {
        return xzfs;
    }

    public void setXzfs(String xzfs) {
        this.xzfs = xzfs;
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
    public String getReservation18() {
        return reservation18;
    }

    public void setReservation18(String reservation18) {
        this.reservation18 = reservation18;
    }

    @Basic
    @Column(name = "RESERVATION19")
    public String getReservation19() {
        return reservation19;
    }

    public void setReservation19(String reservation19) {
        this.reservation19 = reservation19;
    }

    @Basic
    @Column(name = "RESERVATION20")
    public String getReservation20() {
        return reservation20;
    }

    public void setReservation20(String reservation20) {
        this.reservation20 = reservation20;
    }

    @Basic
    @Column(name = "RESERVATION21")
    public Timestamp getReservation21() {
        return reservation21;
    }

    public void setReservation21(Timestamp reservation21) {
        this.reservation21 = reservation21;
    }

    @Basic
    @Column(name = "RESERVATION22")
    public Timestamp getReservation22() {
        return reservation22;
    }

    public void setReservation22(Timestamp reservation22) {
        this.reservation22 = reservation22;
    }

    @Basic
    @Column(name = "RESERVATION23")
    public Timestamp getReservation23() {
        return reservation23;
    }

    public void setReservation23(Timestamp reservation23) {
        this.reservation23 = reservation23;
    }

    @Basic
    @Column(name = "RESERVATION24")
    public Integer getReservation24() {
        return reservation24;
    }

    public void setReservation24(Integer reservation24) {
        this.reservation24 = reservation24;
    }

    @Basic
    @Column(name = "RESERVATION25")
    public Integer getReservation25() {
        return reservation25;
    }

    public void setReservation25(Integer reservation25) {
        this.reservation25 = reservation25;
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
    @Column(name = "RESERVER1")
    public String getReserver1() {
        return reserver1;
    }

    public void setReserver1(String reserver1) {
        this.reserver1 = reserver1;
    }

    @Basic
    @Column(name = "RESERVER2")
    public String getReserver2() {
        return reserver2;
    }

    public void setReserver2(String reserver2) {
        this.reserver2 = reserver2;
    }

    @Basic
    @Column(name = "RESERVER3")
    public String getReserver3() {
        return reserver3;
    }

    public void setReserver3(String reserver3) {
        this.reserver3 = reserver3;
    }

    @Basic
    @Column(name = "RESERVER4")
    public String getReserver4() {
        return reserver4;
    }

    public void setReserver4(String reserver4) {
        this.reserver4 = reserver4;
    }

    @Basic
    @Column(name = "RESERVER5")
    public String getReserver5() {
        return reserver5;
    }

    public void setReserver5(String reserver5) {
        this.reserver5 = reserver5;
    }

    @Basic
    @Column(name = "RESERVER6")
    public String getReserver6() {
        return reserver6;
    }

    public void setReserver6(String reserver6) {
        this.reserver6 = reserver6;
    }

    @Basic
    @Column(name = "RESERVER7")
    public String getReserver7() {
        return reserver7;
    }

    public void setReserver7(String reserver7) {
        this.reserver7 = reserver7;
    }

    @Basic
    @Column(name = "RESERVER8")
    public String getReserver8() {
        return reserver8;
    }

    public void setReserver8(String reserver8) {
        this.reserver8 = reserver8;
    }

    @Basic
    @Column(name = "RESERVER9")
    public String getReserver9() {
        return reserver9;
    }

    public void setReserver9(String reserver9) {
        this.reserver9 = reserver9;
    }

    @Basic
    @Column(name = "RESERVER10")
    public String getReserver10() {
        return reserver10;
    }

    public void setReserver10(String reserver10) {
        this.reserver10 = reserver10;
    }

    @Basic
    @Column(name = "RESERVER11")
    public String getReserver11() {
        return reserver11;
    }

    public void setReserver11(String reserver11) {
        this.reserver11 = reserver11;
    }

    @Basic
    @Column(name = "RESERVER12")
    public String getReserver12() {
        return reserver12;
    }

    public void setReserver12(String reserver12) {
        this.reserver12 = reserver12;
    }

    @Basic
    @Column(name = "RESERVER13")
    public String getReserver13() {
        return reserver13;
    }

    public void setReserver13(String reserver13) {
        this.reserver13 = reserver13;
    }

    @Basic
    @Column(name = "RESERVER14")
    public String getReserver14() {
        return reserver14;
    }

    public void setReserver14(String reserver14) {
        this.reserver14 = reserver14;
    }

    @Basic
    @Column(name = "RESERVER15")
    public String getReserver15() {
        return reserver15;
    }

    public void setReserver15(String reserver15) {
        this.reserver15 = reserver15;
    }

    @Basic
    @Column(name = "RESERVER16")
    public String getReserver16() {
        return reserver16;
    }

    public void setReserver16(String reserver16) {
        this.reserver16 = reserver16;
    }

    @Basic
    @Column(name = "RESERVER17")
    public String getReserver17() {
        return reserver17;
    }

    public void setReserver17(String reserver17) {
        this.reserver17 = reserver17;
    }

    @Basic
    @Column(name = "RESERVER18")
    public String getReserver18() {
        return reserver18;
    }

    public void setReserver18(String reserver18) {
        this.reserver18 = reserver18;
    }

    @Basic
    @Column(name = "RESERVER19")
    public String getReserver19() {
        return reserver19;
    }

    public void setReserver19(String reserver19) {
        this.reserver19 = reserver19;
    }

    @Basic
    @Column(name = "RESERVER20")
    public String getReserver20() {
        return reserver20;
    }

    public void setReserver20(String reserver20) {
        this.reserver20 = reserver20;
    }

    @Basic
    @Column(name = "RESERVER21")
    public String getReserver21() {
        return reserver21;
    }

    public void setReserver21(String reserver21) {
        this.reserver21 = reserver21;
    }

    @Basic
    @Column(name = "RESERVER22")
    public String getReserver22() {
        return reserver22;
    }

    public void setReserver22(String reserver22) {
        this.reserver22 = reserver22;
    }

    @Basic
    @Column(name = "RESERVER23")
    public String getReserver23() {
        return reserver23;
    }

    public void setReserver23(String reserver23) {
        this.reserver23 = reserver23;
    }

    @Basic
    @Column(name = "RESERVER24")
    public String getReserver24() {
        return reserver24;
    }

    public void setReserver24(String reserver24) {
        this.reserver24 = reserver24;
    }

    @Basic
    @Column(name = "RESERVER25")
    public String getReserver25() {
        return reserver25;
    }

    public void setReserver25(String reserver25) {
        this.reserver25 = reserver25;
    }

    @Basic
    @Column(name = "RESERVER26")
    public String getReserver26() {
        return reserver26;
    }

    public void setReserver26(String reserver26) {
        this.reserver26 = reserver26;
    }

    @Basic
    @Column(name = "RESERVER27")
    public String getReserver27() {
        return reserver27;
    }

    public void setReserver27(String reserver27) {
        this.reserver27 = reserver27;
    }

    @Basic
    @Column(name = "RESERVER28")
    public String getReserver28() {
        return reserver28;
    }

    public void setReserver28(String reserver28) {
        this.reserver28 = reserver28;
    }

    @Basic
    @Column(name = "RESERVER29")
    public String getReserver29() {
        return reserver29;
    }

    public void setReserver29(String reserver29) {
        this.reserver29 = reserver29;
    }

    @Basic
    @Column(name = "RESERVER30")
    public String getReserver30() {
        return reserver30;
    }

    public void setReserver30(String reserver30) {
        this.reserver30 = reserver30;
    }

    @Basic
    @Column(name = "RESERVER31")
    public String getReserver31() {
        return reserver31;
    }

    public void setReserver31(String reserver31) {
        this.reserver31 = reserver31;
    }

    @Basic
    @Column(name = "RESERVER32")
    public String getReserver32() {
        return reserver32;
    }

    public void setReserver32(String reserver32) {
        this.reserver32 = reserver32;
    }

    @Basic
    @Column(name = "RESERVER33")
    public String getReserver33() {
        return reserver33;
    }

    public void setReserver33(String reserver33) {
        this.reserver33 = reserver33;
    }

    @Basic
    @Column(name = "RESERVER34")
    public String getReserver34() {
        return reserver34;
    }

    public void setReserver34(String reserver34) {
        this.reserver34 = reserver34;
    }

    @Basic
    @Column(name = "RESERVER35")
    public String getReserver35() {
        return reserver35;
    }

    public void setReserver35(String reserver35) {
        this.reserver35 = reserver35;
    }

    @Basic
    @Column(name = "RESERVER36")
    public String getReserver36() {
        return reserver36;
    }

    public void setReserver36(String reserver36) {
        this.reserver36 = reserver36;
    }

    @Basic
    @Column(name = "RESERVER37")
    public String getReserver37() {
        return reserver37;
    }

    public void setReserver37(String reserver37) {
        this.reserver37 = reserver37;
    }

    @Basic
    @Column(name = "RESERVER38")
    public String getReserver38() {
        return reserver38;
    }

    public void setReserver38(String reserver38) {
        this.reserver38 = reserver38;
    }

    @Basic
    @Column(name = "RESERVER39")
    public String getReserver39() {
        return reserver39;
    }

    public void setReserver39(String reserver39) {
        this.reserver39 = reserver39;
    }

    @Basic
    @Column(name = "RESERVER40")
    public String getReserver40() {
        return reserver40;
    }

    public void setReserver40(String reserver40) {
        this.reserver40 = reserver40;
    }

    @Basic
    @Column(name = "RESERVER41")
    public String getReserver41() {
        return reserver41;
    }

    public void setReserver41(String reserver41) {
        this.reserver41 = reserver41;
    }

    @Basic
    @Column(name = "RESERVER42")
    public String getReserver42() {
        return reserver42;
    }

    public void setReserver42(String reserver42) {
        this.reserver42 = reserver42;
    }

    @Basic
    @Column(name = "RESERVER43")
    public String getReserver43() {
        return reserver43;
    }

    public void setReserver43(String reserver43) {
        this.reserver43 = reserver43;
    }

    @Basic
    @Column(name = "RESERVER44")
    public String getReserver44() {
        return reserver44;
    }

    public void setReserver44(String reserver44) {
        this.reserver44 = reserver44;
    }

    @Basic
    @Column(name = "RESERVER45")
    public String getReserver45() {
        return reserver45;
    }

    public void setReserver45(String reserver45) {
        this.reserver45 = reserver45;
    }

    @Basic
    @Column(name = "RESERVER46")
    public String getReserver46() {
        return reserver46;
    }

    public void setReserver46(String reserver46) {
        this.reserver46 = reserver46;
    }

    @Basic
    @Column(name = "RESERVER47")
    public String getReserver47() {
        return reserver47;
    }

    public void setReserver47(String reserver47) {
        this.reserver47 = reserver47;
    }

    @Basic
    @Column(name = "RESERVER48")
    public String getReserver48() {
        return reserver48;
    }

    public void setReserver48(String reserver48) {
        this.reserver48 = reserver48;
    }

    @Basic
    @Column(name = "RESERVER49")
    public String getReserver49() {
        return reserver49;
    }

    public void setReserver49(String reserver49) {
        this.reserver49 = reserver49;
    }

    @Basic
    @Column(name = "RESERVER50")
    public String getReserver50() {
        return reserver50;
    }

    public void setReserver50(String reserver50) {
        this.reserver50 = reserver50;
    }

    @Basic
    @Column(name = "RESERVER51")
    public Integer getReserver51() {
        return reserver51;
    }

    public void setReserver51(Integer reserver51) {
        this.reserver51 = reserver51;
    }

    @Basic
    @Column(name = "RESERVER52")
    public Integer getReserver52() {
        return reserver52;
    }

    public void setReserver52(Integer reserver52) {
        this.reserver52 = reserver52;
    }

    @Basic
    @Column(name = "RESERVER53")
    public Integer getReserver53() {
        return reserver53;
    }

    public void setReserver53(Integer reserver53) {
        this.reserver53 = reserver53;
    }

    @Basic
    @Column(name = "RESERVER54")
    public Integer getReserver54() {
        return reserver54;
    }

    public void setReserver54(Integer reserver54) {
        this.reserver54 = reserver54;
    }

    @Basic
    @Column(name = "RESERVER55")
    public Integer getReserver55() {
        return reserver55;
    }

    public void setReserver55(Integer reserver55) {
        this.reserver55 = reserver55;
    }

    @Basic
    @Column(name = "RESERVER56")
    public Integer getReserver56() {
        return reserver56;
    }

    public void setReserver56(Integer reserver56) {
        this.reserver56 = reserver56;
    }

    @Basic
    @Column(name = "RESERVER57")
    public Integer getReserver57() {
        return reserver57;
    }

    public void setReserver57(Integer reserver57) {
        this.reserver57 = reserver57;
    }

    @Basic
    @Column(name = "RESERVER58")
    public Integer getReserver58() {
        return reserver58;
    }

    public void setReserver58(Integer reserver58) {
        this.reserver58 = reserver58;
    }

    @Basic
    @Column(name = "RESERVER59")
    public Integer getReserver59() {
        return reserver59;
    }

    public void setReserver59(Integer reserver59) {
        this.reserver59 = reserver59;
    }

    @Basic
    @Column(name = "RESERVER60")
    public Integer getReserver60() {
        return reserver60;
    }

    public void setReserver60(Integer reserver60) {
        this.reserver60 = reserver60;
    }

    @Basic
    @Column(name = "RESERVER61")
    public Timestamp getReserver61() {
        return reserver61;
    }

    public void setReserver61(Timestamp reserver61) {
        this.reserver61 = reserver61;
    }

    @Basic
    @Column(name = "RESERVER62")
    public Timestamp getReserver62() {
        return reserver62;
    }

    public void setReserver62(Timestamp reserver62) {
        this.reserver62 = reserver62;
    }

    @Basic
    @Column(name = "RESERVER63")
    public Timestamp getReserver63() {
        return reserver63;
    }

    public void setReserver63(Timestamp reserver63) {
        this.reserver63 = reserver63;
    }

    @Basic
    @Column(name = "RESERVER64")
    public Timestamp getReserver64() {
        return reserver64;
    }

    public void setReserver64(Timestamp reserver64) {
        this.reserver64 = reserver64;
    }

    @Basic
    @Column(name = "RESERVER65")
    public Timestamp getReserver65() {
        return reserver65;
    }

    public void setReserver65(Timestamp reserver65) {
        this.reserver65 = reserver65;
    }

    @Basic
    @Column(name = "RESERVER66")
    public Timestamp getReserver66() {
        return reserver66;
    }

    public void setReserver66(Timestamp reserver66) {
        this.reserver66 = reserver66;
    }

    @Basic
    @Column(name = "RESERVER67")
    public Timestamp getReserver67() {
        return reserver67;
    }

    public void setReserver67(Timestamp reserver67) {
        this.reserver67 = reserver67;
    }

    @Basic
    @Column(name = "RESERVER71")
    public String getReserver71() {
        return reserver71;
    }

    public void setReserver71(String reserver71) {
        this.reserver71 = reserver71;
    }

    @Basic
    @Column(name = "RESERVER72")
    public String getReserver72() {
        return reserver72;
    }

    public void setReserver72(String reserver72) {
        this.reserver72 = reserver72;
    }

    @Basic
    @Column(name = "RESERVER73")
    public String getReserver73() {
        return reserver73;
    }

    public void setReserver73(String reserver73) {
        this.reserver73 = reserver73;
    }

    @Basic
    @Column(name = "RESERVER74")
    public String getReserver74() {
        return reserver74;
    }

    public void setReserver74(String reserver74) {
        this.reserver74 = reserver74;
    }

    @Basic
    @Column(name = "RESERVER75")
    public String getReserver75() {
        return reserver75;
    }

    public void setReserver75(String reserver75) {
        this.reserver75 = reserver75;
    }

    @Basic
    @Column(name = "RESERVER76")
    public String getReserver76() {
        return reserver76;
    }

    public void setReserver76(String reserver76) {
        this.reserver76 = reserver76;
    }

    @Basic
    @Column(name = "RESERVER77")
    public String getReserver77() {
        return reserver77;
    }

    public void setReserver77(String reserver77) {
        this.reserver77 = reserver77;
    }

    @Basic
    @Column(name = "RESERVER68")
    public Timestamp getReserver68() {
        return reserver68;
    }

    public void setReserver68(Timestamp reserver68) {
        this.reserver68 = reserver68;
    }

    @Basic
    @Column(name = "RESERVER69")
    public Timestamp getReserver69() {
        return reserver69;
    }

    public void setReserver69(Timestamp reserver69) {
        this.reserver69 = reserver69;
    }

    @Basic
    @Column(name = "RESERVER70")
    public Timestamp getReserver70() {
        return reserver70;
    }

    public void setReserver70(Timestamp reserver70) {
        this.reserver70 = reserver70;
    }

    @Basic
    @Column(name = "RESERVER78")
    public String getReserver78() {
        return reserver78;
    }

    public void setReserver78(String reserver78) {
        this.reserver78 = reserver78;
    }

    @Basic
    @Column(name = "RESERVER79")
    public String getReserver79() {
        return reserver79;
    }

    public void setReserver79(String reserver79) {
        this.reserver79 = reserver79;
    }

    @Basic
    @Column(name = "RESERVER80")
    public String getReserver80() {
        return reserver80;
    }

    public void setReserver80(String reserver80) {
        this.reserver80 = reserver80;
    }

    @Basic
    @Column(name = "RESERVATION11_CN")
    public String getReservation11Cn() {
        return reservation11Cn;
    }

    public void setReservation11Cn(String reservation11Cn) {
        this.reservation11Cn = reservation11Cn;
    }

    @Basic
    @Column(name = "RESERVATION15_CN")
    public String getReservation15Cn() {
        return reservation15Cn;
    }

    public void setReservation15Cn(String reservation15Cn) {
        this.reservation15Cn = reservation15Cn;
    }

    @Basic
    @Column(name = "RESERVATION16_CN")
    public String getReservation16Cn() {
        return reservation16Cn;
    }

    public void setReservation16Cn(String reservation16Cn) {
        this.reservation16Cn = reservation16Cn;
    }

    @Basic
    @Column(name = "XZFS_CN")
    public String getXzfsCn() {
        return xzfsCn;
    }

    public void setXzfsCn(String xzfsCn) {
        this.xzfsCn = xzfsCn;
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
    @Column(name = "JIGUAN_CN")
    public String getJiguanCn() {
        return jiguanCn;
    }

    public void setJiguanCn(String jiguanCn) {
        this.jiguanCn = jiguanCn;
    }

    @Basic
    @Column(name = "ZY_CN")
    public String getZyCn() {
        return zyCn;
    }

    public void setZyCn(String zyCn) {
        this.zyCn = zyCn;
    }

    @Basic
    @Column(name = "RYJS_CN")
    public String getRyjsCn() {
        return ryjsCn;
    }

    public void setRyjsCn(String ryjsCn) {
        this.ryjsCn = ryjsCn;
    }

    @Basic
    @Column(name = "AB_CN")
    public String getAbCn() {
        return abCn;
    }

    public void setAbCn(String abCn) {
        this.abCn = abCn;
    }

    @Basic
    @Column(name = "RYSTATE_CN")
    public String getRystateCn() {
        return rystateCn;
    }

    public void setRystateCn(String rystateCn) {
        this.rystateCn = rystateCn;
    }

    @Basic
    @Column(name = "SWZTQK_CN")
    public String getSwztqkCn() {
        return swztqkCn;
    }

    public void setSwztqkCn(String swztqkCn) {
        this.swztqkCn = swztqkCn;
    }

    @Basic
    @Column(name = "ZZDXZQH_CN")
    public String getZzdxzqhCn() {
        return zzdxzqhCn;
    }

    public void setZzdxzqhCn(String zzdxzqhCn) {
        this.zzdxzqhCn = zzdxzqhCn;
    }

    @Basic
    @Column(name = "YWGXBM_CN")
    public String getYwgxbmCn() {
        return ywgxbmCn;
    }

    public void setYwgxbmCn(String ywgxbmCn) {
        this.ywgxbmCn = ywgxbmCn;
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
    @Column(name = "GJ_CN")
    public String getGjCn() {
        return gjCn;
    }

    public void setGjCn(String gjCn) {
        this.gjCn = gjCn;
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
    @Column(name = "RYWHCD_CN")
    public String getRywhcdCn() {
        return rywhcdCn;
    }

    public void setRywhcdCn(String rywhcdCn) {
        this.rywhcdCn = rywhcdCn;
    }

    @Basic
    @Column(name = "XZQH_CN")
    public String getXzqhCn() {
        return xzqhCn;
    }

    public void setXzqhCn(String xzqhCn) {
        this.xzqhCn = xzqhCn;
    }

    @Basic
    @Column(name = "ZHCH_CN")
    public String getZhchCn() {
        return zhchCn;
    }

    public void setZhchCn(String zhchCn) {
        this.zhchCn = zhchCn;
    }

    @Basic
    @Column(name = "KY_CN")
    public String getKyCn() {
        return kyCn;
    }

    public void setKyCn(String kyCn) {
        this.kyCn = kyCn;
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
    @Column(name = "SFXD_CN")
    public String getSfxdCn() {
        return sfxdCn;
    }

    public void setSfxdCn(String sfxdCn) {
        this.sfxdCn = sfxdCn;
    }

    @Basic
    @Column(name = "LJD_CN")
    public String getLjdCn() {
        return ljdCn;
    }

    public void setLjdCn(String ljdCn) {
        this.ljdCn = ljdCn;
    }

    @Basic
    @Column(name = "JZYY_CN")
    public String getJzyyCn() {
        return jzyyCn;
    }

    public void setJzyyCn(String jzyyCn) {
        this.jzyyCn = jzyyCn;
    }

    @Basic
    @Column(name = "LX_CN")
    public String getLxCn() {
        return lxCn;
    }

    public void setLxCn(String lxCn) {
        this.lxCn = lxCn;
    }

    @Basic
    @Column(name = "TX_CN")
    public String getTxCn() {
        return txCn;
    }

    public void setTxCn(String txCn) {
        this.txCn = txCn;
    }

    @Basic
    @Column(name = "XX_CN")
    public String getXxCn() {
        return xxCn;
    }

    public void setXxCn(String xxCn) {
        this.xxCn = xxCn;
    }

    @Basic
    @Column(name = "TMTZ_CN")
    public String getTmtzCn() {
        return tmtzCn;
    }

    public void setTmtzCn(String tmtzCn) {
        this.tmtzCn = tmtzCn;
    }

    @Basic
    @Column(name = "ZAGJ_CN")
    public String getZagjCn() {
        return zagjCn;
    }

    public void setZagjCn(String zagjCn) {
        this.zagjCn = zagjCn;
    }

    @Basic
    @Column(name = "SDTD_CN")
    public String getSdtdCn() {
        return sdtdCn;
    }

    public void setSdtdCn(String sdtdCn) {
        this.sdtdCn = sdtdCn;
    }

    @Basic
    @Column(name = "XZSJ_CN")
    public String getXzsjCn() {
        return xzsjCn;
    }

    public void setXzsjCn(String xzsjCn) {
        this.xzsjCn = xzsjCn;
    }

    @Basic
    @Column(name = "XZCS_CN")
    public String getXzcsCn() {
        return xzcsCn;
    }

    public void setXzcsCn(String xzcsCn) {
        this.xzcsCn = xzcsCn;
    }

    @Basic
    @Column(name = "XZDX_CN")
    public String getXzdxCn() {
        return xzdxCn;
    }

    public void setXzdxCn(String xzdxCn) {
        this.xzdxCn = xzdxCn;
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
    @Column(name = "RESERVATION26")
    public String getReservation26() {
        return reservation26;
    }

    public void setReservation26(String reservation26) {
        this.reservation26 = reservation26;
    }

    @Basic
    @Column(name = "RESERVATION27")
    public String getReservation27() {
        return reservation27;
    }

    public void setReservation27(String reservation27) {
        this.reservation27 = reservation27;
    }

    @Basic
    @Column(name = "RESERVATION28")
    public String getReservation28() {
        return reservation28;
    }

    public void setReservation28(String reservation28) {
        this.reservation28 = reservation28;
    }

    @Basic
    @Column(name = "RESERVATION29")
    public String getReservation29() {
        return reservation29;
    }

    public void setReservation29(String reservation29) {
        this.reservation29 = reservation29;
    }

    @Basic
    @Column(name = "RESERVATION30")
    public String getReservation30() {
        return reservation30;
    }

    public void setReservation30(String reservation30) {
        this.reservation30 = reservation30;
    }

    @Basic
    @Column(name = "RESERVATION31")
    public String getReservation31() {
        return reservation31;
    }

    public void setReservation31(String reservation31) {
        this.reservation31 = reservation31;
    }

    @Basic
    @Column(name = "RESERVATION32")
    public String getReservation32() {
        return reservation32;
    }

    public void setReservation32(String reservation32) {
        this.reservation32 = reservation32;
    }

    @Basic
    @Column(name = "RESERVATION33")
    public String getReservation33() {
        return reservation33;
    }

    public void setReservation33(String reservation33) {
        this.reservation33 = reservation33;
    }

    @Basic
    @Column(name = "RESERVATION34")
    public String getReservation34() {
        return reservation34;
    }

    public void setReservation34(String reservation34) {
        this.reservation34 = reservation34;
    }

    @Basic
    @Column(name = "RESERVATION35")
    public String getReservation35() {
        return reservation35;
    }

    public void setReservation35(String reservation35) {
        this.reservation35 = reservation35;
    }

    @Basic
    @Column(name = "RESERVATION36")
    public String getReservation36() {
        return reservation36;
    }

    public void setReservation36(String reservation36) {
        this.reservation36 = reservation36;
    }

    @Basic
    @Column(name = "RESERVATION37")
    public String getReservation37() {
        return reservation37;
    }

    public void setReservation37(String reservation37) {
        this.reservation37 = reservation37;
    }

    @Basic
    @Column(name = "RESERVATION38")
    public String getReservation38() {
        return reservation38;
    }

    public void setReservation38(String reservation38) {
        this.reservation38 = reservation38;
    }

    @Basic
    @Column(name = "RESERVATION39")
    public String getReservation39() {
        return reservation39;
    }

    public void setReservation39(String reservation39) {
        this.reservation39 = reservation39;
    }

    @Basic
    @Column(name = "RESERVATION40")
    public String getReservation40() {
        return reservation40;
    }

    public void setReservation40(String reservation40) {
        this.reservation40 = reservation40;
    }

    @Basic
    @Column(name = "RESERVATION41")
    public String getReservation41() {
        return reservation41;
    }

    public void setReservation41(String reservation41) {
        this.reservation41 = reservation41;
    }

    @Basic
    @Column(name = "RESERVATION42")
    public String getReservation42() {
        return reservation42;
    }

    public void setReservation42(String reservation42) {
        this.reservation42 = reservation42;
    }

    @Basic
    @Column(name = "RESERVATION43")
    public String getReservation43() {
        return reservation43;
    }

    public void setReservation43(String reservation43) {
        this.reservation43 = reservation43;
    }

    @Basic
    @Column(name = "RESERVATION44")
    public String getReservation44() {
        return reservation44;
    }

    public void setReservation44(String reservation44) {
        this.reservation44 = reservation44;
    }

    @Basic
    @Column(name = "RESERVATION45")
    public String getReservation45() {
        return reservation45;
    }

    public void setReservation45(String reservation45) {
        this.reservation45 = reservation45;
    }

    @Basic
    @Column(name = "RESERVATION46")
    public String getReservation46() {
        return reservation46;
    }

    public void setReservation46(String reservation46) {
        this.reservation46 = reservation46;
    }

    @Basic
    @Column(name = "RESERVATION47")
    public String getReservation47() {
        return reservation47;
    }

    public void setReservation47(String reservation47) {
        this.reservation47 = reservation47;
    }

    @Basic
    @Column(name = "RESERVATION48")
    public String getReservation48() {
        return reservation48;
    }

    public void setReservation48(String reservation48) {
        this.reservation48 = reservation48;
    }

    @Basic
    @Column(name = "RESERVATION49")
    public String getReservation49() {
        return reservation49;
    }

    public void setReservation49(String reservation49) {
        this.reservation49 = reservation49;
    }

    @Basic
    @Column(name = "RESERVATION50")
    public String getReservation50() {
        return reservation50;
    }

    public void setReservation50(String reservation50) {
        this.reservation50 = reservation50;
    }

    @Basic
    @Column(name = "YCTZ")
    public String getYctz() {
        return yctz;
    }

    public void setYctz(String yctz) {
        this.yctz = yctz;
    }

    @Basic
    @Column(name = "TRACKRYBH")
    public String getTrackrybh() {
        return trackrybh;
    }

    public void setTrackrybh(String trackrybh) {
        this.trackrybh = trackrybh;
    }

    @Basic
    @Column(name = "XDJYJG")
    public String getXdjyjg() {
        return xdjyjg;
    }

    public void setXdjyjg(String xdjyjg) {
        this.xdjyjg = xdjyjg;
    }

    @Basic
    @Column(name = "SFJDXTXDRY")
    public String getSfjdxtxdry() {
        return sfjdxtxdry;
    }

    public void setSfjdxtxdry(String sfjdxtxdry) {
        this.sfjdxtxdry = sfjdxtxdry;
    }

    @Basic
    @Column(name = "SFJDXTFDRY")
    public String getSfjdxtfdry() {
        return sfjdxtfdry;
    }

    public void setSfjdxtfdry(String sfjdxtfdry) {
        this.sfjdxtfdry = sfjdxtfdry;
    }

    @Basic
    @Column(name = "SFDA")
    public String getSfda() {
        return sfda;
    }

    public void setSfda(String sfda) {
        this.sfda = sfda;
    }

    @Basic
    @Column(name = "SFZSXD")
    public String getSfzsxd() {
        return sfzsxd;
    }

    public void setSfzsxd(String sfzsxd) {
        this.sfzsxd = sfzsxd;
    }

    @Basic
    @Column(name = "DNABH")
    public String getDnabh() {
        return dnabh;
    }

    public void setDnabh(String dnabh) {
        this.dnabh = dnabh;
    }

    @Basic
    @Column(name = "GZDB_ADDTIME")
    public Timestamp getGzdbAddtime() {
        return gzdbAddtime;
    }

    public void setGzdbAddtime(Timestamp gzdbAddtime) {
        this.gzdbAddtime = gzdbAddtime;
    }

    @Basic
    @Column(name = "YXJYJG")
    public String getYxjyjg() {
        return yxjyjg;
    }

    public void setYxjyjg(String yxjyjg) {
        this.yxjyjg = yxjyjg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JzCaseCriminalEntity that = (JzCaseCriminalEntity) o;

        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (rybh != null ? !rybh.equals(that.rybh) : that.rybh != null) return false;
        if (zzdxzqh != null ? !zzdxzqh.equals(that.zzdxzqh) : that.zzdxzqh != null) return false;
        if (ywgxbm != null ? !ywgxbm.equals(that.ywgxbm) : that.ywgxbm != null) return false;
        if (xrzwbh != null ? !xrzwbh.equals(that.xrzwbh) : that.xrzwbh != null) return false;
        if (zwbh != null ? !zwbh.equals(that.zwbh) : that.zwbh != null) return false;
        if (xm != null ? !xm.equals(that.xm) : that.xm != null) return false;
        if (ywx != null ? !ywx.equals(that.ywx) : that.ywx != null) return false;
        if (ywm != null ? !ywm.equals(that.ywm) : that.ywm != null) return false;
        if (bm != null ? !bm.equals(that.bm) : that.bm != null) return false;
        if (byname != null ? !byname.equals(that.byname) : that.byname != null) return false;
        if (zjzl != null ? !zjzl.equals(that.zjzl) : that.zjzl != null) return false;
        if (zjhm != null ? !zjhm.equals(that.zjhm) : that.zjhm != null) return false;
        if (xb != null ? !xb.equals(that.xb) : that.xb != null) return false;
        if (csrq != null ? !csrq.equals(that.csrq) : that.csrq != null) return false;
        if (birthdayinend != null ? !birthdayinend.equals(that.birthdayinend) : that.birthdayinend != null)
            return false;
        if (gj != null ? !gj.equals(that.gj) : that.gj != null) return false;
        if (mz != null ? !mz.equals(that.mz) : that.mz != null) return false;
        if (rywhcd != null ? !rywhcd.equals(that.rywhcd) : that.rywhcd != null) return false;
        if (hjdz != null ? !hjdz.equals(that.hjdz) : that.hjdz != null) return false;
        if (xzqh != null ? !xzqh.equals(that.xzqh) : that.xzqh != null) return false;
        if (zhch != null ? !zhch.equals(that.zhch) : that.zhch != null) return false;
        if (xxdzms != null ? !xxdzms.equals(that.xxdzms) : that.xxdzms != null) return false;
        if (gzdw != null ? !gzdw.equals(that.gzdw) : that.gzdw != null) return false;
        if (ky != null ? !ky.equals(that.ky) : that.ky != null) return false;
        if (lxdh != null ? !lxdh.equals(that.lxdh) : that.lxdh != null) return false;
        if (qtzjlx1 != null ? !qtzjlx1.equals(that.qtzjlx1) : that.qtzjlx1 != null) return false;
        if (qtzjhm1 != null ? !qtzjhm1.equals(that.qtzjhm1) : that.qtzjhm1 != null) return false;
        if (qtzjlx2 != null ? !qtzjlx2.equals(that.qtzjlx2) : that.qtzjlx2 != null) return false;
        if (qtzjhm2 != null ? !qtzjhm2.equals(that.qtzjhm2) : that.qtzjhm2 != null) return false;
        if (qtzjlx3 != null ? !qtzjlx3.equals(that.qtzjlx3) : that.qtzjlx3 != null) return false;
        if (qtzjhm3 != null ? !qtzjhm3.equals(that.qtzjhm3) : that.qtzjhm3 != null) return false;
        if (sf != null ? !sf.equals(that.sf) : that.sf != null) return false;
        if (sfxd != null ? !sfxd.equals(that.sfxd) : that.sfxd != null) return false;
        if (ljd != null ? !ljd.equals(that.ljd) : that.ljd != null) return false;
        if (jzyy != null ? !jzyy.equals(that.jzyy) : that.jzyy != null) return false;
        if (sg != null ? !sg.equals(that.sg) : that.sg != null) return false;
        if (lx != null ? !lx.equals(that.lx) : that.lx != null) return false;
        if (tx != null ? !tx.equals(that.tx) : that.tx != null) return false;
        if (xx != null ? !xx.equals(that.xx) : that.xx != null) return false;
        if (tmtz != null ? !tmtz.equals(that.tmtz) : that.tmtz != null) return false;
        if (zagj != null ? !zagj.equals(that.zagj) : that.zagj != null) return false;
        if (sdtd != null ? !sdtd.equals(that.sdtd) : that.sdtd != null) return false;
        if (xzsj != null ? !xzsj.equals(that.xzsj) : that.xzsj != null) return false;
        if (xzcs != null ? !xzcs.equals(that.xzcs) : that.xzcs != null) return false;
        if (xzdx != null ? !xzdx.equals(that.xzdx) : that.xzdx != null) return false;
        if (rylx != null ? !rylx.equals(that.rylx) : that.rylx != null) return false;
        if (rystate != null ? !rystate.equals(that.rystate) : that.rystate != null) return false;
        if (sazz != null ? !sazz.equals(that.sazz) : that.sazz != null) return false;
        if (ssje != null ? !ssje.equals(that.ssje) : that.ssje != null) return false;
        if (qfqk != null ? !qfqk.equals(that.qfqk) : that.qfqk != null) return false;
        if (jiguan != null ? !jiguan.equals(that.jiguan) : that.jiguan != null) return false;
        if (zy != null ? !zy.equals(that.zy) : that.zy != null) return false;
        if (ryjs != null ? !ryjs.equals(that.ryjs) : that.ryjs != null) return false;
        if (ab != null ? !ab.equals(that.ab) : that.ab != null) return false;
        if (swqk != null ? !swqk.equals(that.swqk) : that.swqk != null) return false;
        if (zcf != null ? !zcf.equals(that.zcf) : that.zcf != null) return false;
        if (wfjl != null ? !wfjl.equals(that.wfjl) : that.wfjl != null) return false;
        if (lrdw != null ? !lrdw.equals(that.lrdw) : that.lrdw != null) return false;
        if (lrsj != null ? !lrsj.equals(that.lrsj) : that.lrsj != null) return false;
        if (lrr != null ? !lrr.equals(that.lrr) : that.lrr != null) return false;
        if (tlsy != null ? !tlsy.equals(that.tlsy) : that.tlsy != null) return false;
        if (lhyy != null ? !lhyy.equals(that.lhyy) : that.lhyy != null) return false;
        if (qzzlqz != null ? !qzzlqz.equals(that.qzzlqz) : that.qzzlqz != null) return false;
        if (qzhm != null ? !qzhm.equals(that.qzhm) : that.qzhm != null) return false;
        if (qzqfd != null ? !qzqfd.equals(that.qzqfd) : that.qzqfd != null) return false;
        if (lxrxm != null ? !lxrxm.equals(that.lxrxm) : that.lxrxm != null) return false;
        if (lxrdh != null ? !lxrdh.equals(that.lxrdh) : that.lxrdh != null) return false;
        if (jdrmc != null ? !jdrmc.equals(that.jdrmc) : that.jdrmc != null) return false;
        if (sfzy != null ? !sfzy.equals(that.sfzy) : that.sfzy != null) return false;
        if (wfqk != null ? !wfqk.equals(that.wfqk) : that.wfqk != null) return false;
        if (swztqk != null ? !swztqk.equals(that.swztqk) : that.swztqk != null) return false;
        if (cs != null ? !cs.equals(that.cs) : that.cs != null) return false;
        if (cszxrq != null ? !cszxrq.equals(that.cszxrq) : that.cszxrq != null) return false;
        if (xzfs != null ? !xzfs.equals(that.xzfs) : that.xzfs != null) return false;
        if (bz != null ? !bz.equals(that.bz) : that.bz != null) return false;
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
        if (reservation21 != null ? !reservation21.equals(that.reservation21) : that.reservation21 != null)
            return false;
        if (reservation22 != null ? !reservation22.equals(that.reservation22) : that.reservation22 != null)
            return false;
        if (reservation23 != null ? !reservation23.equals(that.reservation23) : that.reservation23 != null)
            return false;
        if (reservation24 != null ? !reservation24.equals(that.reservation24) : that.reservation24 != null)
            return false;
        if (reservation25 != null ? !reservation25.equals(that.reservation25) : that.reservation25 != null)
            return false;
        if (lastupdatedby != null ? !lastupdatedby.equals(that.lastupdatedby) : that.lastupdatedby != null)
            return false;
        if (lastupdatedtime != null ? !lastupdatedtime.equals(that.lastupdatedtime) : that.lastupdatedtime != null)
            return false;
        if (refreshtime != null ? !refreshtime.equals(that.refreshtime) : that.refreshtime != null) return false;
        if (uploadflag != null ? !uploadflag.equals(that.uploadflag) : that.uploadflag != null) return false;
        if (downloadflag != null ? !downloadflag.equals(that.downloadflag) : that.downloadflag != null) return false;
        if (deleteflag != null ? !deleteflag.equals(that.deleteflag) : that.deleteflag != null) return false;
        if (reserver1 != null ? !reserver1.equals(that.reserver1) : that.reserver1 != null) return false;
        if (reserver2 != null ? !reserver2.equals(that.reserver2) : that.reserver2 != null) return false;
        if (reserver3 != null ? !reserver3.equals(that.reserver3) : that.reserver3 != null) return false;
        if (reserver4 != null ? !reserver4.equals(that.reserver4) : that.reserver4 != null) return false;
        if (reserver5 != null ? !reserver5.equals(that.reserver5) : that.reserver5 != null) return false;
        if (reserver6 != null ? !reserver6.equals(that.reserver6) : that.reserver6 != null) return false;
        if (reserver7 != null ? !reserver7.equals(that.reserver7) : that.reserver7 != null) return false;
        if (reserver8 != null ? !reserver8.equals(that.reserver8) : that.reserver8 != null) return false;
        if (reserver9 != null ? !reserver9.equals(that.reserver9) : that.reserver9 != null) return false;
        if (reserver10 != null ? !reserver10.equals(that.reserver10) : that.reserver10 != null) return false;
        if (reserver11 != null ? !reserver11.equals(that.reserver11) : that.reserver11 != null) return false;
        if (reserver12 != null ? !reserver12.equals(that.reserver12) : that.reserver12 != null) return false;
        if (reserver13 != null ? !reserver13.equals(that.reserver13) : that.reserver13 != null) return false;
        if (reserver14 != null ? !reserver14.equals(that.reserver14) : that.reserver14 != null) return false;
        if (reserver15 != null ? !reserver15.equals(that.reserver15) : that.reserver15 != null) return false;
        if (reserver16 != null ? !reserver16.equals(that.reserver16) : that.reserver16 != null) return false;
        if (reserver17 != null ? !reserver17.equals(that.reserver17) : that.reserver17 != null) return false;
        if (reserver18 != null ? !reserver18.equals(that.reserver18) : that.reserver18 != null) return false;
        if (reserver19 != null ? !reserver19.equals(that.reserver19) : that.reserver19 != null) return false;
        if (reserver20 != null ? !reserver20.equals(that.reserver20) : that.reserver20 != null) return false;
        if (reserver21 != null ? !reserver21.equals(that.reserver21) : that.reserver21 != null) return false;
        if (reserver22 != null ? !reserver22.equals(that.reserver22) : that.reserver22 != null) return false;
        if (reserver23 != null ? !reserver23.equals(that.reserver23) : that.reserver23 != null) return false;
        if (reserver24 != null ? !reserver24.equals(that.reserver24) : that.reserver24 != null) return false;
        if (reserver25 != null ? !reserver25.equals(that.reserver25) : that.reserver25 != null) return false;
        if (reserver26 != null ? !reserver26.equals(that.reserver26) : that.reserver26 != null) return false;
        if (reserver27 != null ? !reserver27.equals(that.reserver27) : that.reserver27 != null) return false;
        if (reserver28 != null ? !reserver28.equals(that.reserver28) : that.reserver28 != null) return false;
        if (reserver29 != null ? !reserver29.equals(that.reserver29) : that.reserver29 != null) return false;
        if (reserver30 != null ? !reserver30.equals(that.reserver30) : that.reserver30 != null) return false;
        if (reserver31 != null ? !reserver31.equals(that.reserver31) : that.reserver31 != null) return false;
        if (reserver32 != null ? !reserver32.equals(that.reserver32) : that.reserver32 != null) return false;
        if (reserver33 != null ? !reserver33.equals(that.reserver33) : that.reserver33 != null) return false;
        if (reserver34 != null ? !reserver34.equals(that.reserver34) : that.reserver34 != null) return false;
        if (reserver35 != null ? !reserver35.equals(that.reserver35) : that.reserver35 != null) return false;
        if (reserver36 != null ? !reserver36.equals(that.reserver36) : that.reserver36 != null) return false;
        if (reserver37 != null ? !reserver37.equals(that.reserver37) : that.reserver37 != null) return false;
        if (reserver38 != null ? !reserver38.equals(that.reserver38) : that.reserver38 != null) return false;
        if (reserver39 != null ? !reserver39.equals(that.reserver39) : that.reserver39 != null) return false;
        if (reserver40 != null ? !reserver40.equals(that.reserver40) : that.reserver40 != null) return false;
        if (reserver41 != null ? !reserver41.equals(that.reserver41) : that.reserver41 != null) return false;
        if (reserver42 != null ? !reserver42.equals(that.reserver42) : that.reserver42 != null) return false;
        if (reserver43 != null ? !reserver43.equals(that.reserver43) : that.reserver43 != null) return false;
        if (reserver44 != null ? !reserver44.equals(that.reserver44) : that.reserver44 != null) return false;
        if (reserver45 != null ? !reserver45.equals(that.reserver45) : that.reserver45 != null) return false;
        if (reserver46 != null ? !reserver46.equals(that.reserver46) : that.reserver46 != null) return false;
        if (reserver47 != null ? !reserver47.equals(that.reserver47) : that.reserver47 != null) return false;
        if (reserver48 != null ? !reserver48.equals(that.reserver48) : that.reserver48 != null) return false;
        if (reserver49 != null ? !reserver49.equals(that.reserver49) : that.reserver49 != null) return false;
        if (reserver50 != null ? !reserver50.equals(that.reserver50) : that.reserver50 != null) return false;
        if (reserver51 != null ? !reserver51.equals(that.reserver51) : that.reserver51 != null) return false;
        if (reserver52 != null ? !reserver52.equals(that.reserver52) : that.reserver52 != null) return false;
        if (reserver53 != null ? !reserver53.equals(that.reserver53) : that.reserver53 != null) return false;
        if (reserver54 != null ? !reserver54.equals(that.reserver54) : that.reserver54 != null) return false;
        if (reserver55 != null ? !reserver55.equals(that.reserver55) : that.reserver55 != null) return false;
        if (reserver56 != null ? !reserver56.equals(that.reserver56) : that.reserver56 != null) return false;
        if (reserver57 != null ? !reserver57.equals(that.reserver57) : that.reserver57 != null) return false;
        if (reserver58 != null ? !reserver58.equals(that.reserver58) : that.reserver58 != null) return false;
        if (reserver59 != null ? !reserver59.equals(that.reserver59) : that.reserver59 != null) return false;
        if (reserver60 != null ? !reserver60.equals(that.reserver60) : that.reserver60 != null) return false;
        if (reserver61 != null ? !reserver61.equals(that.reserver61) : that.reserver61 != null) return false;
        if (reserver62 != null ? !reserver62.equals(that.reserver62) : that.reserver62 != null) return false;
        if (reserver63 != null ? !reserver63.equals(that.reserver63) : that.reserver63 != null) return false;
        if (reserver64 != null ? !reserver64.equals(that.reserver64) : that.reserver64 != null) return false;
        if (reserver65 != null ? !reserver65.equals(that.reserver65) : that.reserver65 != null) return false;
        if (reserver66 != null ? !reserver66.equals(that.reserver66) : that.reserver66 != null) return false;
        if (reserver67 != null ? !reserver67.equals(that.reserver67) : that.reserver67 != null) return false;
        if (reserver71 != null ? !reserver71.equals(that.reserver71) : that.reserver71 != null) return false;
        if (reserver72 != null ? !reserver72.equals(that.reserver72) : that.reserver72 != null) return false;
        if (reserver73 != null ? !reserver73.equals(that.reserver73) : that.reserver73 != null) return false;
        if (reserver74 != null ? !reserver74.equals(that.reserver74) : that.reserver74 != null) return false;
        if (reserver75 != null ? !reserver75.equals(that.reserver75) : that.reserver75 != null) return false;
        if (reserver76 != null ? !reserver76.equals(that.reserver76) : that.reserver76 != null) return false;
        if (reserver77 != null ? !reserver77.equals(that.reserver77) : that.reserver77 != null) return false;
        if (reserver68 != null ? !reserver68.equals(that.reserver68) : that.reserver68 != null) return false;
        if (reserver69 != null ? !reserver69.equals(that.reserver69) : that.reserver69 != null) return false;
        if (reserver70 != null ? !reserver70.equals(that.reserver70) : that.reserver70 != null) return false;
        if (reserver78 != null ? !reserver78.equals(that.reserver78) : that.reserver78 != null) return false;
        if (reserver79 != null ? !reserver79.equals(that.reserver79) : that.reserver79 != null) return false;
        if (reserver80 != null ? !reserver80.equals(that.reserver80) : that.reserver80 != null) return false;
        if (reservation11Cn != null ? !reservation11Cn.equals(that.reservation11Cn) : that.reservation11Cn != null)
            return false;
        if (reservation15Cn != null ? !reservation15Cn.equals(that.reservation15Cn) : that.reservation15Cn != null)
            return false;
        if (reservation16Cn != null ? !reservation16Cn.equals(that.reservation16Cn) : that.reservation16Cn != null)
            return false;
        if (xzfsCn != null ? !xzfsCn.equals(that.xzfsCn) : that.xzfsCn != null) return false;
        if (lrdwCn != null ? !lrdwCn.equals(that.lrdwCn) : that.lrdwCn != null) return false;
        if (jiguanCn != null ? !jiguanCn.equals(that.jiguanCn) : that.jiguanCn != null) return false;
        if (zyCn != null ? !zyCn.equals(that.zyCn) : that.zyCn != null) return false;
        if (ryjsCn != null ? !ryjsCn.equals(that.ryjsCn) : that.ryjsCn != null) return false;
        if (abCn != null ? !abCn.equals(that.abCn) : that.abCn != null) return false;
        if (rystateCn != null ? !rystateCn.equals(that.rystateCn) : that.rystateCn != null) return false;
        if (swztqkCn != null ? !swztqkCn.equals(that.swztqkCn) : that.swztqkCn != null) return false;
        if (zzdxzqhCn != null ? !zzdxzqhCn.equals(that.zzdxzqhCn) : that.zzdxzqhCn != null) return false;
        if (ywgxbmCn != null ? !ywgxbmCn.equals(that.ywgxbmCn) : that.ywgxbmCn != null) return false;
        if (xbCn != null ? !xbCn.equals(that.xbCn) : that.xbCn != null) return false;
        if (gjCn != null ? !gjCn.equals(that.gjCn) : that.gjCn != null) return false;
        if (mzCn != null ? !mzCn.equals(that.mzCn) : that.mzCn != null) return false;
        if (rywhcdCn != null ? !rywhcdCn.equals(that.rywhcdCn) : that.rywhcdCn != null) return false;
        if (xzqhCn != null ? !xzqhCn.equals(that.xzqhCn) : that.xzqhCn != null) return false;
        if (zhchCn != null ? !zhchCn.equals(that.zhchCn) : that.zhchCn != null) return false;
        if (kyCn != null ? !kyCn.equals(that.kyCn) : that.kyCn != null) return false;
        if (sfCn != null ? !sfCn.equals(that.sfCn) : that.sfCn != null) return false;
        if (sfxdCn != null ? !sfxdCn.equals(that.sfxdCn) : that.sfxdCn != null) return false;
        if (ljdCn != null ? !ljdCn.equals(that.ljdCn) : that.ljdCn != null) return false;
        if (jzyyCn != null ? !jzyyCn.equals(that.jzyyCn) : that.jzyyCn != null) return false;
        if (lxCn != null ? !lxCn.equals(that.lxCn) : that.lxCn != null) return false;
        if (txCn != null ? !txCn.equals(that.txCn) : that.txCn != null) return false;
        if (xxCn != null ? !xxCn.equals(that.xxCn) : that.xxCn != null) return false;
        if (tmtzCn != null ? !tmtzCn.equals(that.tmtzCn) : that.tmtzCn != null) return false;
        if (zagjCn != null ? !zagjCn.equals(that.zagjCn) : that.zagjCn != null) return false;
        if (sdtdCn != null ? !sdtdCn.equals(that.sdtdCn) : that.sdtdCn != null) return false;
        if (xzsjCn != null ? !xzsjCn.equals(that.xzsjCn) : that.xzsjCn != null) return false;
        if (xzcsCn != null ? !xzcsCn.equals(that.xzcsCn) : that.xzcsCn != null) return false;
        if (xzdxCn != null ? !xzdxCn.equals(that.xzdxCn) : that.xzdxCn != null) return false;
        if (lrrCn != null ? !lrrCn.equals(that.lrrCn) : that.lrrCn != null) return false;
        if (departmentcodeCn != null ? !departmentcodeCn.equals(that.departmentcodeCn) : that.departmentcodeCn != null)
            return false;
        if (creatorCn != null ? !creatorCn.equals(that.creatorCn) : that.creatorCn != null) return false;
        if (lastupdatedbyCn != null ? !lastupdatedbyCn.equals(that.lastupdatedbyCn) : that.lastupdatedbyCn != null)
            return false;
        if (datastate != null ? !datastate.equals(that.datastate) : that.datastate != null) return false;
        if (datacheck != null ? !datacheck.equals(that.datacheck) : that.datacheck != null) return false;
        if (queryid != null ? !queryid.equals(that.queryid) : that.queryid != null) return false;
        if (reservation26 != null ? !reservation26.equals(that.reservation26) : that.reservation26 != null)
            return false;
        if (reservation27 != null ? !reservation27.equals(that.reservation27) : that.reservation27 != null)
            return false;
        if (reservation28 != null ? !reservation28.equals(that.reservation28) : that.reservation28 != null)
            return false;
        if (reservation29 != null ? !reservation29.equals(that.reservation29) : that.reservation29 != null)
            return false;
        if (reservation30 != null ? !reservation30.equals(that.reservation30) : that.reservation30 != null)
            return false;
        if (reservation31 != null ? !reservation31.equals(that.reservation31) : that.reservation31 != null)
            return false;
        if (reservation32 != null ? !reservation32.equals(that.reservation32) : that.reservation32 != null)
            return false;
        if (reservation33 != null ? !reservation33.equals(that.reservation33) : that.reservation33 != null)
            return false;
        if (reservation34 != null ? !reservation34.equals(that.reservation34) : that.reservation34 != null)
            return false;
        if (reservation35 != null ? !reservation35.equals(that.reservation35) : that.reservation35 != null)
            return false;
        if (reservation36 != null ? !reservation36.equals(that.reservation36) : that.reservation36 != null)
            return false;
        if (reservation37 != null ? !reservation37.equals(that.reservation37) : that.reservation37 != null)
            return false;
        if (reservation38 != null ? !reservation38.equals(that.reservation38) : that.reservation38 != null)
            return false;
        if (reservation39 != null ? !reservation39.equals(that.reservation39) : that.reservation39 != null)
            return false;
        if (reservation40 != null ? !reservation40.equals(that.reservation40) : that.reservation40 != null)
            return false;
        if (reservation41 != null ? !reservation41.equals(that.reservation41) : that.reservation41 != null)
            return false;
        if (reservation42 != null ? !reservation42.equals(that.reservation42) : that.reservation42 != null)
            return false;
        if (reservation43 != null ? !reservation43.equals(that.reservation43) : that.reservation43 != null)
            return false;
        if (reservation44 != null ? !reservation44.equals(that.reservation44) : that.reservation44 != null)
            return false;
        if (reservation45 != null ? !reservation45.equals(that.reservation45) : that.reservation45 != null)
            return false;
        if (reservation46 != null ? !reservation46.equals(that.reservation46) : that.reservation46 != null)
            return false;
        if (reservation47 != null ? !reservation47.equals(that.reservation47) : that.reservation47 != null)
            return false;
        if (reservation48 != null ? !reservation48.equals(that.reservation48) : that.reservation48 != null)
            return false;
        if (reservation49 != null ? !reservation49.equals(that.reservation49) : that.reservation49 != null)
            return false;
        if (reservation50 != null ? !reservation50.equals(that.reservation50) : that.reservation50 != null)
            return false;
        if (yctz != null ? !yctz.equals(that.yctz) : that.yctz != null) return false;
        if (trackrybh != null ? !trackrybh.equals(that.trackrybh) : that.trackrybh != null) return false;
        if (xdjyjg != null ? !xdjyjg.equals(that.xdjyjg) : that.xdjyjg != null) return false;
        if (sfjdxtxdry != null ? !sfjdxtxdry.equals(that.sfjdxtxdry) : that.sfjdxtxdry != null) return false;
        if (sfjdxtfdry != null ? !sfjdxtfdry.equals(that.sfjdxtfdry) : that.sfjdxtfdry != null) return false;
        if (sfda != null ? !sfda.equals(that.sfda) : that.sfda != null) return false;
        if (sfzsxd != null ? !sfzsxd.equals(that.sfzsxd) : that.sfzsxd != null) return false;
        if (dnabh != null ? !dnabh.equals(that.dnabh) : that.dnabh != null) return false;
        if (gzdbAddtime != null ? !gzdbAddtime.equals(that.gzdbAddtime) : that.gzdbAddtime != null) return false;
        if (yxjyjg != null ? !yxjyjg.equals(that.yxjyjg) : that.yxjyjg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemid != null ? systemid.hashCode() : 0;
        result = 31 * result + (rybh != null ? rybh.hashCode() : 0);
        result = 31 * result + (zzdxzqh != null ? zzdxzqh.hashCode() : 0);
        result = 31 * result + (ywgxbm != null ? ywgxbm.hashCode() : 0);
        result = 31 * result + (xrzwbh != null ? xrzwbh.hashCode() : 0);
        result = 31 * result + (zwbh != null ? zwbh.hashCode() : 0);
        result = 31 * result + (xm != null ? xm.hashCode() : 0);
        result = 31 * result + (ywx != null ? ywx.hashCode() : 0);
        result = 31 * result + (ywm != null ? ywm.hashCode() : 0);
        result = 31 * result + (bm != null ? bm.hashCode() : 0);
        result = 31 * result + (byname != null ? byname.hashCode() : 0);
        result = 31 * result + (zjzl != null ? zjzl.hashCode() : 0);
        result = 31 * result + (zjhm != null ? zjhm.hashCode() : 0);
        result = 31 * result + (xb != null ? xb.hashCode() : 0);
        result = 31 * result + (csrq != null ? csrq.hashCode() : 0);
        result = 31 * result + (birthdayinend != null ? birthdayinend.hashCode() : 0);
        result = 31 * result + (gj != null ? gj.hashCode() : 0);
        result = 31 * result + (mz != null ? mz.hashCode() : 0);
        result = 31 * result + (rywhcd != null ? rywhcd.hashCode() : 0);
        result = 31 * result + (hjdz != null ? hjdz.hashCode() : 0);
        result = 31 * result + (xzqh != null ? xzqh.hashCode() : 0);
        result = 31 * result + (zhch != null ? zhch.hashCode() : 0);
        result = 31 * result + (xxdzms != null ? xxdzms.hashCode() : 0);
        result = 31 * result + (gzdw != null ? gzdw.hashCode() : 0);
        result = 31 * result + (ky != null ? ky.hashCode() : 0);
        result = 31 * result + (lxdh != null ? lxdh.hashCode() : 0);
        result = 31 * result + (qtzjlx1 != null ? qtzjlx1.hashCode() : 0);
        result = 31 * result + (qtzjhm1 != null ? qtzjhm1.hashCode() : 0);
        result = 31 * result + (qtzjlx2 != null ? qtzjlx2.hashCode() : 0);
        result = 31 * result + (qtzjhm2 != null ? qtzjhm2.hashCode() : 0);
        result = 31 * result + (qtzjlx3 != null ? qtzjlx3.hashCode() : 0);
        result = 31 * result + (qtzjhm3 != null ? qtzjhm3.hashCode() : 0);
        result = 31 * result + (sf != null ? sf.hashCode() : 0);
        result = 31 * result + (sfxd != null ? sfxd.hashCode() : 0);
        result = 31 * result + (ljd != null ? ljd.hashCode() : 0);
        result = 31 * result + (jzyy != null ? jzyy.hashCode() : 0);
        result = 31 * result + (sg != null ? sg.hashCode() : 0);
        result = 31 * result + (lx != null ? lx.hashCode() : 0);
        result = 31 * result + (tx != null ? tx.hashCode() : 0);
        result = 31 * result + (xx != null ? xx.hashCode() : 0);
        result = 31 * result + (tmtz != null ? tmtz.hashCode() : 0);
        result = 31 * result + (zagj != null ? zagj.hashCode() : 0);
        result = 31 * result + (sdtd != null ? sdtd.hashCode() : 0);
        result = 31 * result + (xzsj != null ? xzsj.hashCode() : 0);
        result = 31 * result + (xzcs != null ? xzcs.hashCode() : 0);
        result = 31 * result + (xzdx != null ? xzdx.hashCode() : 0);
        result = 31 * result + (rylx != null ? rylx.hashCode() : 0);
        result = 31 * result + (rystate != null ? rystate.hashCode() : 0);
        result = 31 * result + (sazz != null ? sazz.hashCode() : 0);
        result = 31 * result + (ssje != null ? ssje.hashCode() : 0);
        result = 31 * result + (qfqk != null ? qfqk.hashCode() : 0);
        result = 31 * result + (jiguan != null ? jiguan.hashCode() : 0);
        result = 31 * result + (zy != null ? zy.hashCode() : 0);
        result = 31 * result + (ryjs != null ? ryjs.hashCode() : 0);
        result = 31 * result + (ab != null ? ab.hashCode() : 0);
        result = 31 * result + (swqk != null ? swqk.hashCode() : 0);
        result = 31 * result + (zcf != null ? zcf.hashCode() : 0);
        result = 31 * result + (wfjl != null ? wfjl.hashCode() : 0);
        result = 31 * result + (lrdw != null ? lrdw.hashCode() : 0);
        result = 31 * result + (lrsj != null ? lrsj.hashCode() : 0);
        result = 31 * result + (lrr != null ? lrr.hashCode() : 0);
        result = 31 * result + (tlsy != null ? tlsy.hashCode() : 0);
        result = 31 * result + (lhyy != null ? lhyy.hashCode() : 0);
        result = 31 * result + (qzzlqz != null ? qzzlqz.hashCode() : 0);
        result = 31 * result + (qzhm != null ? qzhm.hashCode() : 0);
        result = 31 * result + (qzqfd != null ? qzqfd.hashCode() : 0);
        result = 31 * result + (lxrxm != null ? lxrxm.hashCode() : 0);
        result = 31 * result + (lxrdh != null ? lxrdh.hashCode() : 0);
        result = 31 * result + (jdrmc != null ? jdrmc.hashCode() : 0);
        result = 31 * result + (sfzy != null ? sfzy.hashCode() : 0);
        result = 31 * result + (wfqk != null ? wfqk.hashCode() : 0);
        result = 31 * result + (swztqk != null ? swztqk.hashCode() : 0);
        result = 31 * result + (cs != null ? cs.hashCode() : 0);
        result = 31 * result + (cszxrq != null ? cszxrq.hashCode() : 0);
        result = 31 * result + (xzfs != null ? xzfs.hashCode() : 0);
        result = 31 * result + (bz != null ? bz.hashCode() : 0);
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
        result = 31 * result + (reservation21 != null ? reservation21.hashCode() : 0);
        result = 31 * result + (reservation22 != null ? reservation22.hashCode() : 0);
        result = 31 * result + (reservation23 != null ? reservation23.hashCode() : 0);
        result = 31 * result + (reservation24 != null ? reservation24.hashCode() : 0);
        result = 31 * result + (reservation25 != null ? reservation25.hashCode() : 0);
        result = 31 * result + (lastupdatedby != null ? lastupdatedby.hashCode() : 0);
        result = 31 * result + (lastupdatedtime != null ? lastupdatedtime.hashCode() : 0);
        result = 31 * result + (refreshtime != null ? refreshtime.hashCode() : 0);
        result = 31 * result + (uploadflag != null ? uploadflag.hashCode() : 0);
        result = 31 * result + (downloadflag != null ? downloadflag.hashCode() : 0);
        result = 31 * result + (deleteflag != null ? deleteflag.hashCode() : 0);
        result = 31 * result + (reserver1 != null ? reserver1.hashCode() : 0);
        result = 31 * result + (reserver2 != null ? reserver2.hashCode() : 0);
        result = 31 * result + (reserver3 != null ? reserver3.hashCode() : 0);
        result = 31 * result + (reserver4 != null ? reserver4.hashCode() : 0);
        result = 31 * result + (reserver5 != null ? reserver5.hashCode() : 0);
        result = 31 * result + (reserver6 != null ? reserver6.hashCode() : 0);
        result = 31 * result + (reserver7 != null ? reserver7.hashCode() : 0);
        result = 31 * result + (reserver8 != null ? reserver8.hashCode() : 0);
        result = 31 * result + (reserver9 != null ? reserver9.hashCode() : 0);
        result = 31 * result + (reserver10 != null ? reserver10.hashCode() : 0);
        result = 31 * result + (reserver11 != null ? reserver11.hashCode() : 0);
        result = 31 * result + (reserver12 != null ? reserver12.hashCode() : 0);
        result = 31 * result + (reserver13 != null ? reserver13.hashCode() : 0);
        result = 31 * result + (reserver14 != null ? reserver14.hashCode() : 0);
        result = 31 * result + (reserver15 != null ? reserver15.hashCode() : 0);
        result = 31 * result + (reserver16 != null ? reserver16.hashCode() : 0);
        result = 31 * result + (reserver17 != null ? reserver17.hashCode() : 0);
        result = 31 * result + (reserver18 != null ? reserver18.hashCode() : 0);
        result = 31 * result + (reserver19 != null ? reserver19.hashCode() : 0);
        result = 31 * result + (reserver20 != null ? reserver20.hashCode() : 0);
        result = 31 * result + (reserver21 != null ? reserver21.hashCode() : 0);
        result = 31 * result + (reserver22 != null ? reserver22.hashCode() : 0);
        result = 31 * result + (reserver23 != null ? reserver23.hashCode() : 0);
        result = 31 * result + (reserver24 != null ? reserver24.hashCode() : 0);
        result = 31 * result + (reserver25 != null ? reserver25.hashCode() : 0);
        result = 31 * result + (reserver26 != null ? reserver26.hashCode() : 0);
        result = 31 * result + (reserver27 != null ? reserver27.hashCode() : 0);
        result = 31 * result + (reserver28 != null ? reserver28.hashCode() : 0);
        result = 31 * result + (reserver29 != null ? reserver29.hashCode() : 0);
        result = 31 * result + (reserver30 != null ? reserver30.hashCode() : 0);
        result = 31 * result + (reserver31 != null ? reserver31.hashCode() : 0);
        result = 31 * result + (reserver32 != null ? reserver32.hashCode() : 0);
        result = 31 * result + (reserver33 != null ? reserver33.hashCode() : 0);
        result = 31 * result + (reserver34 != null ? reserver34.hashCode() : 0);
        result = 31 * result + (reserver35 != null ? reserver35.hashCode() : 0);
        result = 31 * result + (reserver36 != null ? reserver36.hashCode() : 0);
        result = 31 * result + (reserver37 != null ? reserver37.hashCode() : 0);
        result = 31 * result + (reserver38 != null ? reserver38.hashCode() : 0);
        result = 31 * result + (reserver39 != null ? reserver39.hashCode() : 0);
        result = 31 * result + (reserver40 != null ? reserver40.hashCode() : 0);
        result = 31 * result + (reserver41 != null ? reserver41.hashCode() : 0);
        result = 31 * result + (reserver42 != null ? reserver42.hashCode() : 0);
        result = 31 * result + (reserver43 != null ? reserver43.hashCode() : 0);
        result = 31 * result + (reserver44 != null ? reserver44.hashCode() : 0);
        result = 31 * result + (reserver45 != null ? reserver45.hashCode() : 0);
        result = 31 * result + (reserver46 != null ? reserver46.hashCode() : 0);
        result = 31 * result + (reserver47 != null ? reserver47.hashCode() : 0);
        result = 31 * result + (reserver48 != null ? reserver48.hashCode() : 0);
        result = 31 * result + (reserver49 != null ? reserver49.hashCode() : 0);
        result = 31 * result + (reserver50 != null ? reserver50.hashCode() : 0);
        result = 31 * result + (reserver51 != null ? reserver51.hashCode() : 0);
        result = 31 * result + (reserver52 != null ? reserver52.hashCode() : 0);
        result = 31 * result + (reserver53 != null ? reserver53.hashCode() : 0);
        result = 31 * result + (reserver54 != null ? reserver54.hashCode() : 0);
        result = 31 * result + (reserver55 != null ? reserver55.hashCode() : 0);
        result = 31 * result + (reserver56 != null ? reserver56.hashCode() : 0);
        result = 31 * result + (reserver57 != null ? reserver57.hashCode() : 0);
        result = 31 * result + (reserver58 != null ? reserver58.hashCode() : 0);
        result = 31 * result + (reserver59 != null ? reserver59.hashCode() : 0);
        result = 31 * result + (reserver60 != null ? reserver60.hashCode() : 0);
        result = 31 * result + (reserver61 != null ? reserver61.hashCode() : 0);
        result = 31 * result + (reserver62 != null ? reserver62.hashCode() : 0);
        result = 31 * result + (reserver63 != null ? reserver63.hashCode() : 0);
        result = 31 * result + (reserver64 != null ? reserver64.hashCode() : 0);
        result = 31 * result + (reserver65 != null ? reserver65.hashCode() : 0);
        result = 31 * result + (reserver66 != null ? reserver66.hashCode() : 0);
        result = 31 * result + (reserver67 != null ? reserver67.hashCode() : 0);
        result = 31 * result + (reserver71 != null ? reserver71.hashCode() : 0);
        result = 31 * result + (reserver72 != null ? reserver72.hashCode() : 0);
        result = 31 * result + (reserver73 != null ? reserver73.hashCode() : 0);
        result = 31 * result + (reserver74 != null ? reserver74.hashCode() : 0);
        result = 31 * result + (reserver75 != null ? reserver75.hashCode() : 0);
        result = 31 * result + (reserver76 != null ? reserver76.hashCode() : 0);
        result = 31 * result + (reserver77 != null ? reserver77.hashCode() : 0);
        result = 31 * result + (reserver68 != null ? reserver68.hashCode() : 0);
        result = 31 * result + (reserver69 != null ? reserver69.hashCode() : 0);
        result = 31 * result + (reserver70 != null ? reserver70.hashCode() : 0);
        result = 31 * result + (reserver78 != null ? reserver78.hashCode() : 0);
        result = 31 * result + (reserver79 != null ? reserver79.hashCode() : 0);
        result = 31 * result + (reserver80 != null ? reserver80.hashCode() : 0);
        result = 31 * result + (reservation11Cn != null ? reservation11Cn.hashCode() : 0);
        result = 31 * result + (reservation15Cn != null ? reservation15Cn.hashCode() : 0);
        result = 31 * result + (reservation16Cn != null ? reservation16Cn.hashCode() : 0);
        result = 31 * result + (xzfsCn != null ? xzfsCn.hashCode() : 0);
        result = 31 * result + (lrdwCn != null ? lrdwCn.hashCode() : 0);
        result = 31 * result + (jiguanCn != null ? jiguanCn.hashCode() : 0);
        result = 31 * result + (zyCn != null ? zyCn.hashCode() : 0);
        result = 31 * result + (ryjsCn != null ? ryjsCn.hashCode() : 0);
        result = 31 * result + (abCn != null ? abCn.hashCode() : 0);
        result = 31 * result + (rystateCn != null ? rystateCn.hashCode() : 0);
        result = 31 * result + (swztqkCn != null ? swztqkCn.hashCode() : 0);
        result = 31 * result + (zzdxzqhCn != null ? zzdxzqhCn.hashCode() : 0);
        result = 31 * result + (ywgxbmCn != null ? ywgxbmCn.hashCode() : 0);
        result = 31 * result + (xbCn != null ? xbCn.hashCode() : 0);
        result = 31 * result + (gjCn != null ? gjCn.hashCode() : 0);
        result = 31 * result + (mzCn != null ? mzCn.hashCode() : 0);
        result = 31 * result + (rywhcdCn != null ? rywhcdCn.hashCode() : 0);
        result = 31 * result + (xzqhCn != null ? xzqhCn.hashCode() : 0);
        result = 31 * result + (zhchCn != null ? zhchCn.hashCode() : 0);
        result = 31 * result + (kyCn != null ? kyCn.hashCode() : 0);
        result = 31 * result + (sfCn != null ? sfCn.hashCode() : 0);
        result = 31 * result + (sfxdCn != null ? sfxdCn.hashCode() : 0);
        result = 31 * result + (ljdCn != null ? ljdCn.hashCode() : 0);
        result = 31 * result + (jzyyCn != null ? jzyyCn.hashCode() : 0);
        result = 31 * result + (lxCn != null ? lxCn.hashCode() : 0);
        result = 31 * result + (txCn != null ? txCn.hashCode() : 0);
        result = 31 * result + (xxCn != null ? xxCn.hashCode() : 0);
        result = 31 * result + (tmtzCn != null ? tmtzCn.hashCode() : 0);
        result = 31 * result + (zagjCn != null ? zagjCn.hashCode() : 0);
        result = 31 * result + (sdtdCn != null ? sdtdCn.hashCode() : 0);
        result = 31 * result + (xzsjCn != null ? xzsjCn.hashCode() : 0);
        result = 31 * result + (xzcsCn != null ? xzcsCn.hashCode() : 0);
        result = 31 * result + (xzdxCn != null ? xzdxCn.hashCode() : 0);
        result = 31 * result + (lrrCn != null ? lrrCn.hashCode() : 0);
        result = 31 * result + (departmentcodeCn != null ? departmentcodeCn.hashCode() : 0);
        result = 31 * result + (creatorCn != null ? creatorCn.hashCode() : 0);
        result = 31 * result + (lastupdatedbyCn != null ? lastupdatedbyCn.hashCode() : 0);
        result = 31 * result + (datastate != null ? datastate.hashCode() : 0);
        result = 31 * result + (datacheck != null ? datacheck.hashCode() : 0);
        result = 31 * result + (queryid != null ? queryid.hashCode() : 0);
        result = 31 * result + (reservation26 != null ? reservation26.hashCode() : 0);
        result = 31 * result + (reservation27 != null ? reservation27.hashCode() : 0);
        result = 31 * result + (reservation28 != null ? reservation28.hashCode() : 0);
        result = 31 * result + (reservation29 != null ? reservation29.hashCode() : 0);
        result = 31 * result + (reservation30 != null ? reservation30.hashCode() : 0);
        result = 31 * result + (reservation31 != null ? reservation31.hashCode() : 0);
        result = 31 * result + (reservation32 != null ? reservation32.hashCode() : 0);
        result = 31 * result + (reservation33 != null ? reservation33.hashCode() : 0);
        result = 31 * result + (reservation34 != null ? reservation34.hashCode() : 0);
        result = 31 * result + (reservation35 != null ? reservation35.hashCode() : 0);
        result = 31 * result + (reservation36 != null ? reservation36.hashCode() : 0);
        result = 31 * result + (reservation37 != null ? reservation37.hashCode() : 0);
        result = 31 * result + (reservation38 != null ? reservation38.hashCode() : 0);
        result = 31 * result + (reservation39 != null ? reservation39.hashCode() : 0);
        result = 31 * result + (reservation40 != null ? reservation40.hashCode() : 0);
        result = 31 * result + (reservation41 != null ? reservation41.hashCode() : 0);
        result = 31 * result + (reservation42 != null ? reservation42.hashCode() : 0);
        result = 31 * result + (reservation43 != null ? reservation43.hashCode() : 0);
        result = 31 * result + (reservation44 != null ? reservation44.hashCode() : 0);
        result = 31 * result + (reservation45 != null ? reservation45.hashCode() : 0);
        result = 31 * result + (reservation46 != null ? reservation46.hashCode() : 0);
        result = 31 * result + (reservation47 != null ? reservation47.hashCode() : 0);
        result = 31 * result + (reservation48 != null ? reservation48.hashCode() : 0);
        result = 31 * result + (reservation49 != null ? reservation49.hashCode() : 0);
        result = 31 * result + (reservation50 != null ? reservation50.hashCode() : 0);
        result = 31 * result + (yctz != null ? yctz.hashCode() : 0);
        result = 31 * result + (trackrybh != null ? trackrybh.hashCode() : 0);
        result = 31 * result + (xdjyjg != null ? xdjyjg.hashCode() : 0);
        result = 31 * result + (sfjdxtxdry != null ? sfjdxtxdry.hashCode() : 0);
        result = 31 * result + (sfjdxtfdry != null ? sfjdxtfdry.hashCode() : 0);
        result = 31 * result + (sfda != null ? sfda.hashCode() : 0);
        result = 31 * result + (sfzsxd != null ? sfzsxd.hashCode() : 0);
        result = 31 * result + (dnabh != null ? dnabh.hashCode() : 0);
        result = 31 * result + (gzdbAddtime != null ? gzdbAddtime.hashCode() : 0);
        result = 31 * result + (yxjyjg != null ? yxjyjg.hashCode() : 0);
        return result;
    }
}
