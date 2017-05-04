package cc.tinker.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Tinker on 2017/3/14.
 */
@Entity
@Table(name = "jz_case_info")
public class JzCaseInfoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cjdw;
    private Timestamp cjsj;
    private Timestamp ddsj;
    private String tjjf;
    private String xckz;
    private String cjjl;
    private String cljy;
    private String bdwBary;
    private String wdwBary;
    private String hbjqh;
    private String reservation21;
    private String reservation22;
    private Timestamp reservation23;
    private Timestamp reservation24;
    private Timestamp reservation25;
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
    private String reservation51;
    private String reservation52;
    private String reservation53;
    private String reservation54;
    private String reservation55;
    private Timestamp reservation56;
    private Timestamp reservation57;
    private Timestamp reservation58;
    private Timestamp reservation59;
    private Timestamp reservation60;
    private Timestamp gzdbAddtime;
    private String systemid;
    private String ajbh;
    private String ajmc;
    private String sljjdw;
    private String sljjry;
    private Timestamp sljjsj;
    private String slBjslh;
    private String jqlb;
    private String ab;
    private Timestamp slfxrq;
    private Timestamp fasjcz;
    private Timestamp fasjzz;
    private String slJjfs;
    private Timestamp yssj;
    private String ysyy;
    private String ysdw;
    private String ysdwcbr;
    private String yscbrdh;
    private String faddQx;
    private String faddJd;
    private String ajssjq;
    private String fadd;
    private String sssq;
    private String zyaq;
    private Integer swrs;
    private Integer ssrs;
    private Double ssjz;
    private Double sazz;
    private String slAjclqk;
    private Integer slZhrs;
    private Integer slJzrs;
    private Integer slJjfnrs;
    private Integer slJjetrs;
    private String slCjry;
    private Integer slCjrc;
    private Integer slCjcl;
    private Integer slCjcz;
    private Integer slCjhk;
    private String slLdqz;
    private String slCljg;
    private Timestamp slSlsj;
    private String slSlrxm;
    private String sljsdw;
    private String slLrr;
    private Timestamp slLrsj;
    private String fxxs;
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
    private String bz;
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
    private Timestamp reserver14;
    private String reserver15;
    private String reserver16;
    private String reserver17;
    private String reserver18;
    private String reserver19;
    private Timestamp reserver20;
    private Timestamp reserver21;
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
    private Integer reserver54;
    private Integer reserver55;
    private Integer reserver56;
    private Integer reserver57;
    private Integer reserver58;
    private Integer reserver59;
    private Integer reserver60;
    private Timestamp reserver61;
    private String reserver50;
    private Integer reserver51;
    private Integer reserver52;
    private Integer reserver53;
    private Timestamp reserver62;
    private Timestamp reserver63;
    private Timestamp reserver64;
    private Timestamp reserver65;
    private Timestamp reserver66;
    private Timestamp reserver67;
    private Timestamp reserver68;
    private Timestamp reserver69;
    private Timestamp reserver70;
    private String reserver71;
    private String reserver72;
    private String reserver73;
    private String reserver74;
    private String reserver78;
    private String reserver79;
    private String reserver80;
    private String sljjdwCn;
    private String sljjryCn;
    private String jqlbCn;
    private String abCn;
    private String reserver75;
    private String reserver76;
    private String reserver77;
    private String ysdwCn;
    private String slJjfsCn;
    private String ysdwcbrCn;
    private String faddQxCn;
    private String faddJdCn;
    private String ajssjqCn;
    private String sssqCn;
    private String slCjryCn;
    private String reservation20;
    private String reservation33;
    private String eservation34;
    private String lCljgCn;
    private String sljsdwCn;
    private String slLrrCn;
    private String reservation05Cn;
    private String reservation08Cn;
    private String reservation09Cn;
    private String reservation10Cn;
    private String datastate;
    private String datacheck;
    private String queryid;
    private String departmentcodeCn;
    private String creatorCn;
    private String lastupdatedbyCn;
    private Timestamp reservation40;
    private Timestamp reservation39;
    private String reservation32;
    private String reservation31;
    private String reservation18;
    private String reservation17;
    private String reservation16;
    private String reservation15;
    private String reservation14;
    private String reservation13;
    private String reservation12;
    private String reservation11;
    private Timestamp pjsj;
    private Timestamp ddxcsj;
    private String jqzbxx;
    private String reservation19;
    private String reservation35;
    private String eservation36;
    private Timestamp reservation37;
    private Timestamp reservation38;
    private String flmjid;
    private String flmjdw;
    private String section;
    private String bjly;
    private String bjdd;
    private String bjdh;
    private Integer sars;
//    private Integer id;
    private Integer rownum;
    private String slCljgCn;

    @Column(name = "SL_CLJG_CN")
    public String getSlCljgCn() {
        return slCljgCn;
    }

    public void setSlCljgCn(String slCljgCn) {
        this.slCljgCn = slCljgCn;
    }
    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ID", unique = true, nullable = false)
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

    @Transient
    public Integer getRownum() {
        return rownum;
    }

    public void setRownum(Integer rownum) {
        this.rownum = rownum;
    }

    @Basic
    @Column(name = "CJDW")
    public String getCjdw() {
        return cjdw;
    }

    public void setCjdw(String cjdw) {
        this.cjdw = cjdw;
    }

    @Basic
    @Column(name = "CJSJ")
    public Timestamp getCjsj() {
        return cjsj;
    }

    public void setCjsj(Timestamp cjsj) {
        this.cjsj = cjsj;
    }

    @Basic
    @Column(name = "DDSJ")
    public Timestamp getDdsj() {
        return ddsj;
    }

    public void setDdsj(Timestamp ddsj) {
        this.ddsj = ddsj;
    }

    @Basic
    @Column(name = "TJJF")
    public String getTjjf() {
        return tjjf;
    }

    public void setTjjf(String tjjf) {
        this.tjjf = tjjf;
    }

    @Basic
    @Column(name = "XCKZ")
    public String getXckz() {
        return xckz;
    }

    public void setXckz(String xckz) {
        this.xckz = xckz;
    }

    @Basic
    @Column(name = "CJJL")
    public String getCjjl() {
        return cjjl;
    }

    public void setCjjl(String cjjl) {
        this.cjjl = cjjl;
    }

    @Basic
    @Column(name = "CLJY")
    public String getCljy() {
        return cljy;
    }

    public void setCljy(String cljy) {
        this.cljy = cljy;
    }

    @Basic
    @Column(name = "BDW_BARY")
    public String getBdwBary() {
        return bdwBary;
    }

    public void setBdwBary(String bdwBary) {
        this.bdwBary = bdwBary;
    }

    @Basic
    @Column(name = "WDW_BARY")
    public String getWdwBary() {
        return wdwBary;
    }

    public void setWdwBary(String wdwBary) {
        this.wdwBary = wdwBary;
    }

    @Basic
    @Column(name = "HBJQH")
    public String getHbjqh() {
        return hbjqh;
    }

    public void setHbjqh(String hbjqh) {
        this.hbjqh = hbjqh;
    }

    @Basic
    @Column(name = "RESERVATION21")
    public String getReservation21() {
        return reservation21;
    }

    public void setReservation21(String reservation21) {
        this.reservation21 = reservation21;
    }

    @Basic
    @Column(name = "RESERVATION22")
    public String getReservation22() {
        return reservation22;
    }

    public void setReservation22(String reservation22) {
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
    public Timestamp getReservation24() {
        return reservation24;
    }

    public void setReservation24(Timestamp reservation24) {
        this.reservation24 = reservation24;
    }

    @Basic
    @Column(name = "RESERVATION25")
    public Timestamp getReservation25() {
        return reservation25;
    }

    public void setReservation25(Timestamp reservation25) {
        this.reservation25 = reservation25;
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
    @Column(name = "RESERVATION51")
    public String getReservation51() {
        return reservation51;
    }

    public void setReservation51(String reservation51) {
        this.reservation51 = reservation51;
    }

    @Basic
    @Column(name = "RESERVATION52")
    public String getReservation52() {
        return reservation52;
    }

    public void setReservation52(String reservation52) {
        this.reservation52 = reservation52;
    }

    @Basic
    @Column(name = "RESERVATION53")
    public String getReservation53() {
        return reservation53;
    }

    public void setReservation53(String reservation53) {
        this.reservation53 = reservation53;
    }

    @Basic
    @Column(name = "RESERVATION54")
    public String getReservation54() {
        return reservation54;
    }

    public void setReservation54(String reservation54) {
        this.reservation54 = reservation54;
    }

    @Basic
    @Column(name = "RESERVATION55")
    public String getReservation55() {
        return reservation55;
    }

    public void setReservation55(String reservation55) {
        this.reservation55 = reservation55;
    }

    @Basic
    @Column(name = "RESERVATION56")
    public Timestamp getReservation56() {
        return reservation56;
    }

    public void setReservation56(Timestamp reservation56) {
        this.reservation56 = reservation56;
    }

    @Basic
    @Column(name = "RESERVATION57")
    public Timestamp getReservation57() {
        return reservation57;
    }

    public void setReservation57(Timestamp reservation57) {
        this.reservation57 = reservation57;
    }

    @Basic
    @Column(name = "RESERVATION58")
    public Timestamp getReservation58() {
        return reservation58;
    }

    public void setReservation58(Timestamp reservation58) {
        this.reservation58 = reservation58;
    }

    @Basic
    @Column(name = "RESERVATION59")
    public Timestamp getReservation59() {
        return reservation59;
    }

    public void setReservation59(Timestamp reservation59) {
        this.reservation59 = reservation59;
    }

    @Basic
    @Column(name = "RESERVATION60")
    public Timestamp getReservation60() {
        return reservation60;
    }

    public void setReservation60(Timestamp reservation60) {
        this.reservation60 = reservation60;
    }

    @Basic
    @Column(name = "GZDB_ADDTIME")
    public Timestamp getGzdbAddtime() {
        return gzdbAddtime;
    }

    public void setGzdbAddtime(Timestamp gzdbAddtime) {
        this.gzdbAddtime = gzdbAddtime;
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
    @Column(name = "AJMC")
    public String getAjmc() {
        return ajmc;
    }

    public void setAjmc(String ajmc) {
        this.ajmc = ajmc;
    }

    @Basic
    @Column(name = "SLJJDW")
    public String getSljjdw() {
        return sljjdw;
    }

    public void setSljjdw(String sljjdw) {
        this.sljjdw = sljjdw;
    }

    @Basic
    @Column(name = "SLJJRY")
    public String getSljjry() {
        return sljjry;
    }

    public void setSljjry(String sljjry) {
        this.sljjry = sljjry;
    }

    @Basic
    @Column(name = "SLJJSJ")
    public Timestamp getSljjsj() {
        return sljjsj;
    }

    public void setSljjsj(Timestamp sljjsj) {
        this.sljjsj = sljjsj;
    }

    @Basic
    @Column(name = "SL_BJSLH")
    public String getSlBjslh() {
        return slBjslh;
    }

    public void setSlBjslh(String slBjslh) {
        this.slBjslh = slBjslh;
    }

    @Basic
    @Column(name = "JQLB")
    public String getJqlb() {
        return jqlb;
    }

    public void setJqlb(String jqlb) {
        this.jqlb = jqlb;
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
    @Column(name = "SLFXRQ")
    public Timestamp getSlfxrq() {
        return slfxrq;
    }

    public void setSlfxrq(Timestamp slfxrq) {
        this.slfxrq = slfxrq;
    }

    @Basic
    @Column(name = "FASJCZ")
    public Timestamp getFasjcz() {
        return fasjcz;
    }

    public void setFasjcz(Timestamp fasjcz) {
        this.fasjcz = fasjcz;
    }

    @Basic
    @Column(name = "FASJZZ")
    public Timestamp getFasjzz() {
        return fasjzz;
    }

    public void setFasjzz(Timestamp fasjzz) {
        this.fasjzz = fasjzz;
    }

    @Basic
    @Column(name = "SL_JJFS")
    public String getSlJjfs() {
        return slJjfs;
    }

    public void setSlJjfs(String slJjfs) {
        this.slJjfs = slJjfs;
    }

    @Basic
    @Column(name = "YSSJ")
    public Timestamp getYssj() {
        return yssj;
    }

    public void setYssj(Timestamp yssj) {
        this.yssj = yssj;
    }

    @Basic
    @Column(name = "YSYY")
    public String getYsyy() {
        return ysyy;
    }

    public void setYsyy(String ysyy) {
        this.ysyy = ysyy;
    }

    @Basic
    @Column(name = "YSDW")
    public String getYsdw() {
        return ysdw;
    }

    public void setYsdw(String ysdw) {
        this.ysdw = ysdw;
    }

    @Basic
    @Column(name = "YSDWCBR")
    public String getYsdwcbr() {
        return ysdwcbr;
    }

    public void setYsdwcbr(String ysdwcbr) {
        this.ysdwcbr = ysdwcbr;
    }

    @Basic
    @Column(name = "YSCBRDH")
    public String getYscbrdh() {
        return yscbrdh;
    }

    public void setYscbrdh(String yscbrdh) {
        this.yscbrdh = yscbrdh;
    }

    @Basic
    @Column(name = "FADD_QX")
    public String getFaddQx() {
        return faddQx;
    }

    public void setFaddQx(String faddQx) {
        this.faddQx = faddQx;
    }

    @Basic
    @Column(name = "FADD_JD")
    public String getFaddJd() {
        return faddJd;
    }

    public void setFaddJd(String faddJd) {
        this.faddJd = faddJd;
    }

    @Basic
    @Column(name = "AJSSJQ")
    public String getAjssjq() {
        return ajssjq;
    }

    public void setAjssjq(String ajssjq) {
        this.ajssjq = ajssjq;
    }

    @Basic
    @Column(name = "FADD")
    public String getFadd() {
        return fadd;
    }

    public void setFadd(String fadd) {
        this.fadd = fadd;
    }

    @Basic
    @Column(name = "SSSQ")
    public String getSssq() {
        return sssq;
    }

    public void setSssq(String sssq) {
        this.sssq = sssq;
    }

    @Basic
    @Column(name = "ZYAQ")
    public String getZyaq() {
        return zyaq;
    }

    public void setZyaq(String zyaq) {
        this.zyaq = zyaq;
    }

    @Basic
    @Column(name = "SWRS")
    public Integer getSwrs() {
        return swrs;
    }

    public void setSwrs(Integer swrs) {
        this.swrs = swrs;
    }

    @Basic
    @Column(name = "SSRS")
    public Integer getSsrs() {
        return ssrs;
    }

    public void setSsrs(Integer ssrs) {
        this.ssrs = ssrs;
    }

    @Basic
    @Column(name = "SSJZ")
    public Double getSsjz() {
        return ssjz;
    }

    public void setSsjz(Double ssjz) {
        this.ssjz = ssjz;
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
    @Column(name = "SL_AJCLQK")
    public String getSlAjclqk() {
        return slAjclqk;
    }

    public void setSlAjclqk(String slAjclqk) {
        this.slAjclqk = slAjclqk;
    }

    @Basic
    @Column(name = "SL_ZHRS")
    public Integer getSlZhrs() {
        return slZhrs;
    }

    public void setSlZhrs(Integer slZhrs) {
        this.slZhrs = slZhrs;
    }

    @Basic
    @Column(name = "SL_JZRS")
    public Integer getSlJzrs() {
        return slJzrs;
    }

    public void setSlJzrs(Integer slJzrs) {
        this.slJzrs = slJzrs;
    }

    @Basic
    @Column(name = "SL_JJFNRS")
    public Integer getSlJjfnrs() {
        return slJjfnrs;
    }

    public void setSlJjfnrs(Integer slJjfnrs) {
        this.slJjfnrs = slJjfnrs;
    }

    @Basic
    @Column(name = "SL_JJETRS")
    public Integer getSlJjetrs() {
        return slJjetrs;
    }

    public void setSlJjetrs(Integer slJjetrs) {
        this.slJjetrs = slJjetrs;
    }

    @Basic
    @Column(name = "SL_CJRY")
    public String getSlCjry() {
        return slCjry;
    }

    public void setSlCjry(String slCjry) {
        this.slCjry = slCjry;
    }

    @Basic
    @Column(name = "SL_CJRC")
    public Integer getSlCjrc() {
        return slCjrc;
    }

    public void setSlCjrc(Integer slCjrc) {
        this.slCjrc = slCjrc;
    }

    @Basic
    @Column(name = "SL_CJCL")
    public Integer getSlCjcl() {
        return slCjcl;
    }

    public void setSlCjcl(Integer slCjcl) {
        this.slCjcl = slCjcl;
    }

    @Basic
    @Column(name = "SL_CJCZ")
    public Integer getSlCjcz() {
        return slCjcz;
    }

    public void setSlCjcz(Integer slCjcz) {
        this.slCjcz = slCjcz;
    }

    @Basic
    @Column(name = "SL_CJHK")
    public Integer getSlCjhk() {
        return slCjhk;
    }

    public void setSlCjhk(Integer slCjhk) {
        this.slCjhk = slCjhk;
    }

    @Basic
    @Column(name = "SL_LDQZ")
    public String getSlLdqz() {
        return slLdqz;
    }

    public void setSlLdqz(String slLdqz) {
        this.slLdqz = slLdqz;
    }

    @Basic
    @Column(name = "SL_CLJG")
    public String getSlCljg() {
        return slCljg;
    }

    public void setSlCljg(String slCljg) {
        this.slCljg = slCljg;
    }

    @Basic
    @Column(name = "SL_SLSJ")
    public Timestamp getSlSlsj() {
        return slSlsj;
    }

    public void setSlSlsj(Timestamp slSlsj) {
        this.slSlsj = slSlsj;
    }

    @Basic
    @Column(name = "SL_SLRXM")
    public String getSlSlrxm() {
        return slSlrxm;
    }

    public void setSlSlrxm(String slSlrxm) {
        this.slSlrxm = slSlrxm;
    }

    @Basic
    @Column(name = "SLJSDW")
    public String getSljsdw() {
        return sljsdw;
    }

    public void setSljsdw(String sljsdw) {
        this.sljsdw = sljsdw;
    }

    @Basic
    @Column(name = "SL_LRR")
    public String getSlLrr() {
        return slLrr;
    }

    public void setSlLrr(String slLrr) {
        this.slLrr = slLrr;
    }

    @Basic
    @Column(name = "SL_LRSJ")
    public Timestamp getSlLrsj() {
        return slLrsj;
    }

    public void setSlLrsj(Timestamp slLrsj) {
        this.slLrsj = slLrsj;
    }

    @Basic
    @Column(name = "FXXS")
    public String getFxxs() {
        return fxxs;
    }

    public void setFxxs(String fxxs) {
        this.fxxs = fxxs;
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
    @Column(name = "BZ")
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
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
    public Timestamp getReserver14() {
        return reserver14;
    }

    public void setReserver14(Timestamp reserver14) {
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
    public Timestamp getReserver20() {
        return reserver20;
    }

    public void setReserver20(Timestamp reserver20) {
        this.reserver20 = reserver20;
    }

    @Basic
    @Column(name = "RESERVER21")
    public Timestamp getReserver21() {
        return reserver21;
    }

    public void setReserver21(Timestamp reserver21) {
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
    @Column(name = "SLJJDW_CN")
    public String getSljjdwCn() {
        return sljjdwCn;
    }

    public void setSljjdwCn(String sljjdwCn) {
        this.sljjdwCn = sljjdwCn;
    }

    @Basic
    @Column(name = "SLJJRY_CN")
    public String getSljjryCn() {
        return sljjryCn;
    }

    public void setSljjryCn(String sljjryCn) {
        this.sljjryCn = sljjryCn;
    }

    @Basic
    @Column(name = "JQLB_CN")
    public String getJqlbCn() {
        return jqlbCn;
    }

    public void setJqlbCn(String jqlbCn) {
        this.jqlbCn = jqlbCn;
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
    @Column(name = "YSDW_CN")
    public String getYsdwCn() {
        return ysdwCn;
    }

    public void setYsdwCn(String ysdwCn) {
        this.ysdwCn = ysdwCn;
    }

    @Basic
    @Column(name = "SL_JJFS_CN")
    public String getSlJjfsCn() {
        return slJjfsCn;
    }

    public void setSlJjfsCn(String slJjfsCn) {
        this.slJjfsCn = slJjfsCn;
    }

    @Basic
    @Column(name = "YSDWCBR_CN")
    public String getYsdwcbrCn() {
        return ysdwcbrCn;
    }

    public void setYsdwcbrCn(String ysdwcbrCn) {
        this.ysdwcbrCn = ysdwcbrCn;
    }

    @Basic
    @Column(name = "FADD_QX_CN")
    public String getFaddQxCn() {
        return faddQxCn;
    }

    public void setFaddQxCn(String faddQxCn) {
        this.faddQxCn = faddQxCn;
    }

    @Basic
    @Column(name = "FADD_JD_CN")
    public String getFaddJdCn() {
        return faddJdCn;
    }

    public void setFaddJdCn(String faddJdCn) {
        this.faddJdCn = faddJdCn;
    }

    @Basic
    @Column(name = "AJSSJQ_CN")
    public String getAjssjqCn() {
        return ajssjqCn;
    }

    public void setAjssjqCn(String ajssjqCn) {
        this.ajssjqCn = ajssjqCn;
    }

    @Basic
    @Column(name = "SSSQ_CN")
    public String getSssqCn() {
        return sssqCn;
    }

    public void setSssqCn(String sssqCn) {
        this.sssqCn = sssqCn;
    }

    @Basic
    @Column(name = "SL_CJRY_CN")
    public String getSlCjryCn() {
        return slCjryCn;
    }

    public void setSlCjryCn(String slCjryCn) {
        this.slCjryCn = slCjryCn;
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
    @Column(name = "RESERVATION33")
    public String getReservation33() {
        return reservation33;
    }

    public void setReservation33(String reservation33) {
        this.reservation33 = reservation33;
    }

    @Basic
    @Column(name = "ESERVATION34")
    public String getEservation34() {
        return eservation34;
    }

    public void setEservation34(String eservation34) {
        this.eservation34 = eservation34;
    }

    @Basic
    @Column(name = "L_CLJG_CN")
    public String getlCljgCn() {
        return lCljgCn;
    }

    public void setlCljgCn(String lCljgCn) {
        this.lCljgCn = lCljgCn;
    }

    @Basic
    @Column(name = "SLJSDW_CN")
    public String getSljsdwCn() {
        return sljsdwCn;
    }

    public void setSljsdwCn(String sljsdwCn) {
        this.sljsdwCn = sljsdwCn;
    }

    @Basic
    @Column(name = "SL_LRR_CN")
    public String getSlLrrCn() {
        return slLrrCn;
    }

    public void setSlLrrCn(String slLrrCn) {
        this.slLrrCn = slLrrCn;
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
    @Column(name = "RESERVATION08_CN")
    public String getReservation08Cn() {
        return reservation08Cn;
    }

    public void setReservation08Cn(String reservation08Cn) {
        this.reservation08Cn = reservation08Cn;
    }

    @Basic
    @Column(name = "RESERVATION09_CN")
    public String getReservation09Cn() {
        return reservation09Cn;
    }

    public void setReservation09Cn(String reservation09Cn) {
        this.reservation09Cn = reservation09Cn;
    }

    @Basic
    @Column(name = "RESERVATION10_CN")
    public String getReservation10Cn() {
        return reservation10Cn;
    }

    public void setReservation10Cn(String reservation10Cn) {
        this.reservation10Cn = reservation10Cn;
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
    @Column(name = "RESERVATION40")
    public Timestamp getReservation40() {
        return reservation40;
    }

    public void setReservation40(Timestamp reservation40) {
        this.reservation40 = reservation40;
    }

    @Basic
    @Column(name = "RESERVATION39")
    public Timestamp getReservation39() {
        return reservation39;
    }

    public void setReservation39(Timestamp reservation39) {
        this.reservation39 = reservation39;
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
    @Column(name = "RESERVATION31")
    public String getReservation31() {
        return reservation31;
    }

    public void setReservation31(String reservation31) {
        this.reservation31 = reservation31;
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
    @Column(name = "RESERVATION17")
    public String getReservation17() {
        return reservation17;
    }

    public void setReservation17(String reservation17) {
        this.reservation17 = reservation17;
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
    @Column(name = "RESERVATION15")
    public String getReservation15() {
        return reservation15;
    }

    public void setReservation15(String reservation15) {
        this.reservation15 = reservation15;
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
    @Column(name = "RESERVATION13")
    public String getReservation13() {
        return reservation13;
    }

    public void setReservation13(String reservation13) {
        this.reservation13 = reservation13;
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
    @Column(name = "RESERVATION11")
    public String getReservation11() {
        return reservation11;
    }

    public void setReservation11(String reservation11) {
        this.reservation11 = reservation11;
    }

    @Basic
    @Column(name = "PJSJ")
    public Timestamp getPjsj() {
        return pjsj;
    }

    public void setPjsj(Timestamp pjsj) {
        this.pjsj = pjsj;
    }

    @Basic
    @Column(name = "DDXCSJ")
    public Timestamp getDdxcsj() {
        return ddxcsj;
    }

    public void setDdxcsj(Timestamp ddxcsj) {
        this.ddxcsj = ddxcsj;
    }

    @Basic
    @Column(name = "JQZBXX")
    public String getJqzbxx() {
        return jqzbxx;
    }

    public void setJqzbxx(String jqzbxx) {
        this.jqzbxx = jqzbxx;
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
    @Column(name = "RESERVATION35")
    public String getReservation35() {
        return reservation35;
    }

    public void setReservation35(String reservation35) {
        this.reservation35 = reservation35;
    }

    @Basic
    @Column(name = "ESERVATION36")
    public String getEservation36() {
        return eservation36;
    }

    public void setEservation36(String eservation36) {
        this.eservation36 = eservation36;
    }

    @Basic
    @Column(name = "RESERVATION37")
    public Timestamp getReservation37() {
        return reservation37;
    }

    public void setReservation37(Timestamp reservation37) {
        this.reservation37 = reservation37;
    }

    @Basic
    @Column(name = "RESERVATION38")
    public Timestamp getReservation38() {
        return reservation38;
    }

    public void setReservation38(Timestamp reservation38) {
        this.reservation38 = reservation38;
    }

    @Basic
    @Column(name = "FLMJID")
    public String getFlmjid() {
        return flmjid;
    }

    public void setFlmjid(String flmjid) {
        this.flmjid = flmjid;
    }

    @Basic
    @Column(name = "FLMJDW")
    public String getFlmjdw() {
        return flmjdw;
    }

    public void setFlmjdw(String flmjdw) {
        this.flmjdw = flmjdw;
    }

    @Basic
    @Column(name = "SECTION")
    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Basic
    @Column(name = "BJLY")
    public String getBjly() {
        return bjly;
    }

    public void setBjly(String bjly) {
        this.bjly = bjly;
    }

    @Basic
    @Column(name = "BJDD")
    public String getBjdd() {
        return bjdd;
    }

    public void setBjdd(String bjdd) {
        this.bjdd = bjdd;
    }

    @Basic
    @Column(name = "BJDH")
    public String getBjdh() {
        return bjdh;
    }

    public void setBjdh(String bjdh) {
        this.bjdh = bjdh;
    }

    @Basic
    @Column(name = "SARS")
    public Integer getSars() {
        return sars;
    }

    public void setSars(Integer sars) {
        this.sars = sars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JzCaseInfoEntity that = (JzCaseInfoEntity) o;

        if (cjdw != null ? !cjdw.equals(that.cjdw) : that.cjdw != null) return false;
        if (cjsj != null ? !cjsj.equals(that.cjsj) : that.cjsj != null) return false;
        if (ddsj != null ? !ddsj.equals(that.ddsj) : that.ddsj != null) return false;
        if (tjjf != null ? !tjjf.equals(that.tjjf) : that.tjjf != null) return false;
        if (xckz != null ? !xckz.equals(that.xckz) : that.xckz != null) return false;
        if (cjjl != null ? !cjjl.equals(that.cjjl) : that.cjjl != null) return false;
        if (cljy != null ? !cljy.equals(that.cljy) : that.cljy != null) return false;
        if (bdwBary != null ? !bdwBary.equals(that.bdwBary) : that.bdwBary != null) return false;
        if (wdwBary != null ? !wdwBary.equals(that.wdwBary) : that.wdwBary != null) return false;
        if (hbjqh != null ? !hbjqh.equals(that.hbjqh) : that.hbjqh != null) return false;
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
        if (reservation51 != null ? !reservation51.equals(that.reservation51) : that.reservation51 != null)
            return false;
        if (reservation52 != null ? !reservation52.equals(that.reservation52) : that.reservation52 != null)
            return false;
        if (reservation53 != null ? !reservation53.equals(that.reservation53) : that.reservation53 != null)
            return false;
        if (reservation54 != null ? !reservation54.equals(that.reservation54) : that.reservation54 != null)
            return false;
        if (reservation55 != null ? !reservation55.equals(that.reservation55) : that.reservation55 != null)
            return false;
        if (reservation56 != null ? !reservation56.equals(that.reservation56) : that.reservation56 != null)
            return false;
        if (reservation57 != null ? !reservation57.equals(that.reservation57) : that.reservation57 != null)
            return false;
        if (reservation58 != null ? !reservation58.equals(that.reservation58) : that.reservation58 != null)
            return false;
        if (reservation59 != null ? !reservation59.equals(that.reservation59) : that.reservation59 != null)
            return false;
        if (reservation60 != null ? !reservation60.equals(that.reservation60) : that.reservation60 != null)
            return false;
        if (gzdbAddtime != null ? !gzdbAddtime.equals(that.gzdbAddtime) : that.gzdbAddtime != null) return false;
        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (ajbh != null ? !ajbh.equals(that.ajbh) : that.ajbh != null) return false;
        if (ajmc != null ? !ajmc.equals(that.ajmc) : that.ajmc != null) return false;
        if (sljjdw != null ? !sljjdw.equals(that.sljjdw) : that.sljjdw != null) return false;
        if (sljjry != null ? !sljjry.equals(that.sljjry) : that.sljjry != null) return false;
        if (sljjsj != null ? !sljjsj.equals(that.sljjsj) : that.sljjsj != null) return false;
        if (slBjslh != null ? !slBjslh.equals(that.slBjslh) : that.slBjslh != null) return false;
        if (jqlb != null ? !jqlb.equals(that.jqlb) : that.jqlb != null) return false;
        if (ab != null ? !ab.equals(that.ab) : that.ab != null) return false;
        if (slfxrq != null ? !slfxrq.equals(that.slfxrq) : that.slfxrq != null) return false;
        if (fasjcz != null ? !fasjcz.equals(that.fasjcz) : that.fasjcz != null) return false;
        if (fasjzz != null ? !fasjzz.equals(that.fasjzz) : that.fasjzz != null) return false;
        if (slJjfs != null ? !slJjfs.equals(that.slJjfs) : that.slJjfs != null) return false;
        if (yssj != null ? !yssj.equals(that.yssj) : that.yssj != null) return false;
        if (ysyy != null ? !ysyy.equals(that.ysyy) : that.ysyy != null) return false;
        if (ysdw != null ? !ysdw.equals(that.ysdw) : that.ysdw != null) return false;
        if (ysdwcbr != null ? !ysdwcbr.equals(that.ysdwcbr) : that.ysdwcbr != null) return false;
        if (yscbrdh != null ? !yscbrdh.equals(that.yscbrdh) : that.yscbrdh != null) return false;
        if (faddQx != null ? !faddQx.equals(that.faddQx) : that.faddQx != null) return false;
        if (faddJd != null ? !faddJd.equals(that.faddJd) : that.faddJd != null) return false;
        if (ajssjq != null ? !ajssjq.equals(that.ajssjq) : that.ajssjq != null) return false;
        if (fadd != null ? !fadd.equals(that.fadd) : that.fadd != null) return false;
        if (sssq != null ? !sssq.equals(that.sssq) : that.sssq != null) return false;
        if (zyaq != null ? !zyaq.equals(that.zyaq) : that.zyaq != null) return false;
        if (swrs != null ? !swrs.equals(that.swrs) : that.swrs != null) return false;
        if (ssrs != null ? !ssrs.equals(that.ssrs) : that.ssrs != null) return false;
        if (ssjz != null ? !ssjz.equals(that.ssjz) : that.ssjz != null) return false;
        if (sazz != null ? !sazz.equals(that.sazz) : that.sazz != null) return false;
        if (slAjclqk != null ? !slAjclqk.equals(that.slAjclqk) : that.slAjclqk != null) return false;
        if (slZhrs != null ? !slZhrs.equals(that.slZhrs) : that.slZhrs != null) return false;
        if (slJzrs != null ? !slJzrs.equals(that.slJzrs) : that.slJzrs != null) return false;
        if (slJjfnrs != null ? !slJjfnrs.equals(that.slJjfnrs) : that.slJjfnrs != null) return false;
        if (slJjetrs != null ? !slJjetrs.equals(that.slJjetrs) : that.slJjetrs != null) return false;
        if (slCjry != null ? !slCjry.equals(that.slCjry) : that.slCjry != null) return false;
        if (slCjrc != null ? !slCjrc.equals(that.slCjrc) : that.slCjrc != null) return false;
        if (slCjcl != null ? !slCjcl.equals(that.slCjcl) : that.slCjcl != null) return false;
        if (slCjcz != null ? !slCjcz.equals(that.slCjcz) : that.slCjcz != null) return false;
        if (slCjhk != null ? !slCjhk.equals(that.slCjhk) : that.slCjhk != null) return false;
        if (slLdqz != null ? !slLdqz.equals(that.slLdqz) : that.slLdqz != null) return false;
        if (slCljg != null ? !slCljg.equals(that.slCljg) : that.slCljg != null) return false;
        if (slSlsj != null ? !slSlsj.equals(that.slSlsj) : that.slSlsj != null) return false;
        if (slSlrxm != null ? !slSlrxm.equals(that.slSlrxm) : that.slSlrxm != null) return false;
        if (sljsdw != null ? !sljsdw.equals(that.sljsdw) : that.sljsdw != null) return false;
        if (slLrr != null ? !slLrr.equals(that.slLrr) : that.slLrr != null) return false;
        if (slLrsj != null ? !slLrsj.equals(that.slLrsj) : that.slLrsj != null) return false;
        if (fxxs != null ? !fxxs.equals(that.fxxs) : that.fxxs != null) return false;
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
        if (bz != null ? !bz.equals(that.bz) : that.bz != null) return false;
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
        if (reserver54 != null ? !reserver54.equals(that.reserver54) : that.reserver54 != null) return false;
        if (reserver55 != null ? !reserver55.equals(that.reserver55) : that.reserver55 != null) return false;
        if (reserver56 != null ? !reserver56.equals(that.reserver56) : that.reserver56 != null) return false;
        if (reserver57 != null ? !reserver57.equals(that.reserver57) : that.reserver57 != null) return false;
        if (reserver58 != null ? !reserver58.equals(that.reserver58) : that.reserver58 != null) return false;
        if (reserver59 != null ? !reserver59.equals(that.reserver59) : that.reserver59 != null) return false;
        if (reserver60 != null ? !reserver60.equals(that.reserver60) : that.reserver60 != null) return false;
        if (reserver61 != null ? !reserver61.equals(that.reserver61) : that.reserver61 != null) return false;
        if (reserver50 != null ? !reserver50.equals(that.reserver50) : that.reserver50 != null) return false;
        if (reserver51 != null ? !reserver51.equals(that.reserver51) : that.reserver51 != null) return false;
        if (reserver52 != null ? !reserver52.equals(that.reserver52) : that.reserver52 != null) return false;
        if (reserver53 != null ? !reserver53.equals(that.reserver53) : that.reserver53 != null) return false;
        if (reserver62 != null ? !reserver62.equals(that.reserver62) : that.reserver62 != null) return false;
        if (reserver63 != null ? !reserver63.equals(that.reserver63) : that.reserver63 != null) return false;
        if (reserver64 != null ? !reserver64.equals(that.reserver64) : that.reserver64 != null) return false;
        if (reserver65 != null ? !reserver65.equals(that.reserver65) : that.reserver65 != null) return false;
        if (reserver66 != null ? !reserver66.equals(that.reserver66) : that.reserver66 != null) return false;
        if (reserver67 != null ? !reserver67.equals(that.reserver67) : that.reserver67 != null) return false;
        if (reserver68 != null ? !reserver68.equals(that.reserver68) : that.reserver68 != null) return false;
        if (reserver69 != null ? !reserver69.equals(that.reserver69) : that.reserver69 != null) return false;
        if (reserver70 != null ? !reserver70.equals(that.reserver70) : that.reserver70 != null) return false;
        if (reserver71 != null ? !reserver71.equals(that.reserver71) : that.reserver71 != null) return false;
        if (reserver72 != null ? !reserver72.equals(that.reserver72) : that.reserver72 != null) return false;
        if (reserver73 != null ? !reserver73.equals(that.reserver73) : that.reserver73 != null) return false;
        if (reserver74 != null ? !reserver74.equals(that.reserver74) : that.reserver74 != null) return false;
        if (reserver78 != null ? !reserver78.equals(that.reserver78) : that.reserver78 != null) return false;
        if (reserver79 != null ? !reserver79.equals(that.reserver79) : that.reserver79 != null) return false;
        if (reserver80 != null ? !reserver80.equals(that.reserver80) : that.reserver80 != null) return false;
        if (sljjdwCn != null ? !sljjdwCn.equals(that.sljjdwCn) : that.sljjdwCn != null) return false;
        if (sljjryCn != null ? !sljjryCn.equals(that.sljjryCn) : that.sljjryCn != null) return false;
        if (jqlbCn != null ? !jqlbCn.equals(that.jqlbCn) : that.jqlbCn != null) return false;
        if (abCn != null ? !abCn.equals(that.abCn) : that.abCn != null) return false;
        if (reserver75 != null ? !reserver75.equals(that.reserver75) : that.reserver75 != null) return false;
        if (reserver76 != null ? !reserver76.equals(that.reserver76) : that.reserver76 != null) return false;
        if (reserver77 != null ? !reserver77.equals(that.reserver77) : that.reserver77 != null) return false;
        if (ysdwCn != null ? !ysdwCn.equals(that.ysdwCn) : that.ysdwCn != null) return false;
        if (slJjfsCn != null ? !slJjfsCn.equals(that.slJjfsCn) : that.slJjfsCn != null) return false;
        if (ysdwcbrCn != null ? !ysdwcbrCn.equals(that.ysdwcbrCn) : that.ysdwcbrCn != null) return false;
        if (faddQxCn != null ? !faddQxCn.equals(that.faddQxCn) : that.faddQxCn != null) return false;
        if (faddJdCn != null ? !faddJdCn.equals(that.faddJdCn) : that.faddJdCn != null) return false;
        if (ajssjqCn != null ? !ajssjqCn.equals(that.ajssjqCn) : that.ajssjqCn != null) return false;
        if (sssqCn != null ? !sssqCn.equals(that.sssqCn) : that.sssqCn != null) return false;
        if (slCjryCn != null ? !slCjryCn.equals(that.slCjryCn) : that.slCjryCn != null) return false;
        if (reservation20 != null ? !reservation20.equals(that.reservation20) : that.reservation20 != null)
            return false;
        if (reservation33 != null ? !reservation33.equals(that.reservation33) : that.reservation33 != null)
            return false;
        if (eservation34 != null ? !eservation34.equals(that.eservation34) : that.eservation34 != null) return false;
        if (lCljgCn != null ? !lCljgCn.equals(that.lCljgCn) : that.lCljgCn != null) return false;
        if (sljsdwCn != null ? !sljsdwCn.equals(that.sljsdwCn) : that.sljsdwCn != null) return false;
        if (slLrrCn != null ? !slLrrCn.equals(that.slLrrCn) : that.slLrrCn != null) return false;
        if (reservation05Cn != null ? !reservation05Cn.equals(that.reservation05Cn) : that.reservation05Cn != null)
            return false;
        if (reservation08Cn != null ? !reservation08Cn.equals(that.reservation08Cn) : that.reservation08Cn != null)
            return false;
        if (reservation09Cn != null ? !reservation09Cn.equals(that.reservation09Cn) : that.reservation09Cn != null)
            return false;
        if (reservation10Cn != null ? !reservation10Cn.equals(that.reservation10Cn) : that.reservation10Cn != null)
            return false;
        if (datastate != null ? !datastate.equals(that.datastate) : that.datastate != null) return false;
        if (datacheck != null ? !datacheck.equals(that.datacheck) : that.datacheck != null) return false;
        if (queryid != null ? !queryid.equals(that.queryid) : that.queryid != null) return false;
        if (departmentcodeCn != null ? !departmentcodeCn.equals(that.departmentcodeCn) : that.departmentcodeCn != null)
            return false;
        if (creatorCn != null ? !creatorCn.equals(that.creatorCn) : that.creatorCn != null) return false;
        if (lastupdatedbyCn != null ? !lastupdatedbyCn.equals(that.lastupdatedbyCn) : that.lastupdatedbyCn != null)
            return false;
        if (reservation40 != null ? !reservation40.equals(that.reservation40) : that.reservation40 != null)
            return false;
        if (reservation39 != null ? !reservation39.equals(that.reservation39) : that.reservation39 != null)
            return false;
        if (reservation32 != null ? !reservation32.equals(that.reservation32) : that.reservation32 != null)
            return false;
        if (reservation31 != null ? !reservation31.equals(that.reservation31) : that.reservation31 != null)
            return false;
        if (reservation18 != null ? !reservation18.equals(that.reservation18) : that.reservation18 != null)
            return false;
        if (reservation17 != null ? !reservation17.equals(that.reservation17) : that.reservation17 != null)
            return false;
        if (reservation16 != null ? !reservation16.equals(that.reservation16) : that.reservation16 != null)
            return false;
        if (reservation15 != null ? !reservation15.equals(that.reservation15) : that.reservation15 != null)
            return false;
        if (reservation14 != null ? !reservation14.equals(that.reservation14) : that.reservation14 != null)
            return false;
        if (reservation13 != null ? !reservation13.equals(that.reservation13) : that.reservation13 != null)
            return false;
        if (reservation12 != null ? !reservation12.equals(that.reservation12) : that.reservation12 != null)
            return false;
        if (reservation11 != null ? !reservation11.equals(that.reservation11) : that.reservation11 != null)
            return false;
        if (pjsj != null ? !pjsj.equals(that.pjsj) : that.pjsj != null) return false;
        if (ddxcsj != null ? !ddxcsj.equals(that.ddxcsj) : that.ddxcsj != null) return false;
        if (jqzbxx != null ? !jqzbxx.equals(that.jqzbxx) : that.jqzbxx != null) return false;
        if (reservation19 != null ? !reservation19.equals(that.reservation19) : that.reservation19 != null)
            return false;
        if (reservation35 != null ? !reservation35.equals(that.reservation35) : that.reservation35 != null)
            return false;
        if (eservation36 != null ? !eservation36.equals(that.eservation36) : that.eservation36 != null) return false;
        if (reservation37 != null ? !reservation37.equals(that.reservation37) : that.reservation37 != null)
            return false;
        if (reservation38 != null ? !reservation38.equals(that.reservation38) : that.reservation38 != null)
            return false;
        if (flmjid != null ? !flmjid.equals(that.flmjid) : that.flmjid != null) return false;
        if (flmjdw != null ? !flmjdw.equals(that.flmjdw) : that.flmjdw != null) return false;
        if (section != null ? !section.equals(that.section) : that.section != null) return false;
        if (bjly != null ? !bjly.equals(that.bjly) : that.bjly != null) return false;
        if (bjdd != null ? !bjdd.equals(that.bjdd) : that.bjdd != null) return false;
        if (bjdh != null ? !bjdh.equals(that.bjdh) : that.bjdh != null) return false;
        if (sars != null ? !sars.equals(that.sars) : that.sars != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cjdw != null ? cjdw.hashCode() : 0;
        result = 31 * result + (cjsj != null ? cjsj.hashCode() : 0);
        result = 31 * result + (ddsj != null ? ddsj.hashCode() : 0);
        result = 31 * result + (tjjf != null ? tjjf.hashCode() : 0);
        result = 31 * result + (xckz != null ? xckz.hashCode() : 0);
        result = 31 * result + (cjjl != null ? cjjl.hashCode() : 0);
        result = 31 * result + (cljy != null ? cljy.hashCode() : 0);
        result = 31 * result + (bdwBary != null ? bdwBary.hashCode() : 0);
        result = 31 * result + (wdwBary != null ? wdwBary.hashCode() : 0);
        result = 31 * result + (hbjqh != null ? hbjqh.hashCode() : 0);
        result = 31 * result + (reservation21 != null ? reservation21.hashCode() : 0);
        result = 31 * result + (reservation22 != null ? reservation22.hashCode() : 0);
        result = 31 * result + (reservation23 != null ? reservation23.hashCode() : 0);
        result = 31 * result + (reservation24 != null ? reservation24.hashCode() : 0);
        result = 31 * result + (reservation25 != null ? reservation25.hashCode() : 0);
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
        result = 31 * result + (reservation51 != null ? reservation51.hashCode() : 0);
        result = 31 * result + (reservation52 != null ? reservation52.hashCode() : 0);
        result = 31 * result + (reservation53 != null ? reservation53.hashCode() : 0);
        result = 31 * result + (reservation54 != null ? reservation54.hashCode() : 0);
        result = 31 * result + (reservation55 != null ? reservation55.hashCode() : 0);
        result = 31 * result + (reservation56 != null ? reservation56.hashCode() : 0);
        result = 31 * result + (reservation57 != null ? reservation57.hashCode() : 0);
        result = 31 * result + (reservation58 != null ? reservation58.hashCode() : 0);
        result = 31 * result + (reservation59 != null ? reservation59.hashCode() : 0);
        result = 31 * result + (reservation60 != null ? reservation60.hashCode() : 0);
        result = 31 * result + (gzdbAddtime != null ? gzdbAddtime.hashCode() : 0);
        result = 31 * result + (systemid != null ? systemid.hashCode() : 0);
        result = 31 * result + (ajbh != null ? ajbh.hashCode() : 0);
        result = 31 * result + (ajmc != null ? ajmc.hashCode() : 0);
        result = 31 * result + (sljjdw != null ? sljjdw.hashCode() : 0);
        result = 31 * result + (sljjry != null ? sljjry.hashCode() : 0);
        result = 31 * result + (sljjsj != null ? sljjsj.hashCode() : 0);
        result = 31 * result + (slBjslh != null ? slBjslh.hashCode() : 0);
        result = 31 * result + (jqlb != null ? jqlb.hashCode() : 0);
        result = 31 * result + (ab != null ? ab.hashCode() : 0);
        result = 31 * result + (slfxrq != null ? slfxrq.hashCode() : 0);
        result = 31 * result + (fasjcz != null ? fasjcz.hashCode() : 0);
        result = 31 * result + (fasjzz != null ? fasjzz.hashCode() : 0);
        result = 31 * result + (slJjfs != null ? slJjfs.hashCode() : 0);
        result = 31 * result + (yssj != null ? yssj.hashCode() : 0);
        result = 31 * result + (ysyy != null ? ysyy.hashCode() : 0);
        result = 31 * result + (ysdw != null ? ysdw.hashCode() : 0);
        result = 31 * result + (ysdwcbr != null ? ysdwcbr.hashCode() : 0);
        result = 31 * result + (yscbrdh != null ? yscbrdh.hashCode() : 0);
        result = 31 * result + (faddQx != null ? faddQx.hashCode() : 0);
        result = 31 * result + (faddJd != null ? faddJd.hashCode() : 0);
        result = 31 * result + (ajssjq != null ? ajssjq.hashCode() : 0);
        result = 31 * result + (fadd != null ? fadd.hashCode() : 0);
        result = 31 * result + (sssq != null ? sssq.hashCode() : 0);
        result = 31 * result + (zyaq != null ? zyaq.hashCode() : 0);
        result = 31 * result + (swrs != null ? swrs.hashCode() : 0);
        result = 31 * result + (ssrs != null ? ssrs.hashCode() : 0);
        result = 31 * result + (ssjz != null ? ssjz.hashCode() : 0);
        result = 31 * result + (sazz != null ? sazz.hashCode() : 0);
        result = 31 * result + (slAjclqk != null ? slAjclqk.hashCode() : 0);
        result = 31 * result + (slZhrs != null ? slZhrs.hashCode() : 0);
        result = 31 * result + (slJzrs != null ? slJzrs.hashCode() : 0);
        result = 31 * result + (slJjfnrs != null ? slJjfnrs.hashCode() : 0);
        result = 31 * result + (slJjetrs != null ? slJjetrs.hashCode() : 0);
        result = 31 * result + (slCjry != null ? slCjry.hashCode() : 0);
        result = 31 * result + (slCjrc != null ? slCjrc.hashCode() : 0);
        result = 31 * result + (slCjcl != null ? slCjcl.hashCode() : 0);
        result = 31 * result + (slCjcz != null ? slCjcz.hashCode() : 0);
        result = 31 * result + (slCjhk != null ? slCjhk.hashCode() : 0);
        result = 31 * result + (slLdqz != null ? slLdqz.hashCode() : 0);
        result = 31 * result + (slCljg != null ? slCljg.hashCode() : 0);
        result = 31 * result + (slSlsj != null ? slSlsj.hashCode() : 0);
        result = 31 * result + (slSlrxm != null ? slSlrxm.hashCode() : 0);
        result = 31 * result + (sljsdw != null ? sljsdw.hashCode() : 0);
        result = 31 * result + (slLrr != null ? slLrr.hashCode() : 0);
        result = 31 * result + (slLrsj != null ? slLrsj.hashCode() : 0);
        result = 31 * result + (fxxs != null ? fxxs.hashCode() : 0);
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
        result = 31 * result + (bz != null ? bz.hashCode() : 0);
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
        result = 31 * result + (reserver54 != null ? reserver54.hashCode() : 0);
        result = 31 * result + (reserver55 != null ? reserver55.hashCode() : 0);
        result = 31 * result + (reserver56 != null ? reserver56.hashCode() : 0);
        result = 31 * result + (reserver57 != null ? reserver57.hashCode() : 0);
        result = 31 * result + (reserver58 != null ? reserver58.hashCode() : 0);
        result = 31 * result + (reserver59 != null ? reserver59.hashCode() : 0);
        result = 31 * result + (reserver60 != null ? reserver60.hashCode() : 0);
        result = 31 * result + (reserver61 != null ? reserver61.hashCode() : 0);
        result = 31 * result + (reserver50 != null ? reserver50.hashCode() : 0);
        result = 31 * result + (reserver51 != null ? reserver51.hashCode() : 0);
        result = 31 * result + (reserver52 != null ? reserver52.hashCode() : 0);
        result = 31 * result + (reserver53 != null ? reserver53.hashCode() : 0);
        result = 31 * result + (reserver62 != null ? reserver62.hashCode() : 0);
        result = 31 * result + (reserver63 != null ? reserver63.hashCode() : 0);
        result = 31 * result + (reserver64 != null ? reserver64.hashCode() : 0);
        result = 31 * result + (reserver65 != null ? reserver65.hashCode() : 0);
        result = 31 * result + (reserver66 != null ? reserver66.hashCode() : 0);
        result = 31 * result + (reserver67 != null ? reserver67.hashCode() : 0);
        result = 31 * result + (reserver68 != null ? reserver68.hashCode() : 0);
        result = 31 * result + (reserver69 != null ? reserver69.hashCode() : 0);
        result = 31 * result + (reserver70 != null ? reserver70.hashCode() : 0);
        result = 31 * result + (reserver71 != null ? reserver71.hashCode() : 0);
        result = 31 * result + (reserver72 != null ? reserver72.hashCode() : 0);
        result = 31 * result + (reserver73 != null ? reserver73.hashCode() : 0);
        result = 31 * result + (reserver74 != null ? reserver74.hashCode() : 0);
        result = 31 * result + (reserver78 != null ? reserver78.hashCode() : 0);
        result = 31 * result + (reserver79 != null ? reserver79.hashCode() : 0);
        result = 31 * result + (reserver80 != null ? reserver80.hashCode() : 0);
        result = 31 * result + (sljjdwCn != null ? sljjdwCn.hashCode() : 0);
        result = 31 * result + (sljjryCn != null ? sljjryCn.hashCode() : 0);
        result = 31 * result + (jqlbCn != null ? jqlbCn.hashCode() : 0);
        result = 31 * result + (abCn != null ? abCn.hashCode() : 0);
        result = 31 * result + (reserver75 != null ? reserver75.hashCode() : 0);
        result = 31 * result + (reserver76 != null ? reserver76.hashCode() : 0);
        result = 31 * result + (reserver77 != null ? reserver77.hashCode() : 0);
        result = 31 * result + (ysdwCn != null ? ysdwCn.hashCode() : 0);
        result = 31 * result + (slJjfsCn != null ? slJjfsCn.hashCode() : 0);
        result = 31 * result + (ysdwcbrCn != null ? ysdwcbrCn.hashCode() : 0);
        result = 31 * result + (faddQxCn != null ? faddQxCn.hashCode() : 0);
        result = 31 * result + (faddJdCn != null ? faddJdCn.hashCode() : 0);
        result = 31 * result + (ajssjqCn != null ? ajssjqCn.hashCode() : 0);
        result = 31 * result + (sssqCn != null ? sssqCn.hashCode() : 0);
        result = 31 * result + (slCjryCn != null ? slCjryCn.hashCode() : 0);
        result = 31 * result + (reservation20 != null ? reservation20.hashCode() : 0);
        result = 31 * result + (reservation33 != null ? reservation33.hashCode() : 0);
        result = 31 * result + (eservation34 != null ? eservation34.hashCode() : 0);
        result = 31 * result + (lCljgCn != null ? lCljgCn.hashCode() : 0);
        result = 31 * result + (sljsdwCn != null ? sljsdwCn.hashCode() : 0);
        result = 31 * result + (slLrrCn != null ? slLrrCn.hashCode() : 0);
        result = 31 * result + (reservation05Cn != null ? reservation05Cn.hashCode() : 0);
        result = 31 * result + (reservation08Cn != null ? reservation08Cn.hashCode() : 0);
        result = 31 * result + (reservation09Cn != null ? reservation09Cn.hashCode() : 0);
        result = 31 * result + (reservation10Cn != null ? reservation10Cn.hashCode() : 0);
        result = 31 * result + (datastate != null ? datastate.hashCode() : 0);
        result = 31 * result + (datacheck != null ? datacheck.hashCode() : 0);
        result = 31 * result + (queryid != null ? queryid.hashCode() : 0);
        result = 31 * result + (departmentcodeCn != null ? departmentcodeCn.hashCode() : 0);
        result = 31 * result + (creatorCn != null ? creatorCn.hashCode() : 0);
        result = 31 * result + (lastupdatedbyCn != null ? lastupdatedbyCn.hashCode() : 0);
        result = 31 * result + (reservation40 != null ? reservation40.hashCode() : 0);
        result = 31 * result + (reservation39 != null ? reservation39.hashCode() : 0);
        result = 31 * result + (reservation32 != null ? reservation32.hashCode() : 0);
        result = 31 * result + (reservation31 != null ? reservation31.hashCode() : 0);
        result = 31 * result + (reservation18 != null ? reservation18.hashCode() : 0);
        result = 31 * result + (reservation17 != null ? reservation17.hashCode() : 0);
        result = 31 * result + (reservation16 != null ? reservation16.hashCode() : 0);
        result = 31 * result + (reservation15 != null ? reservation15.hashCode() : 0);
        result = 31 * result + (reservation14 != null ? reservation14.hashCode() : 0);
        result = 31 * result + (reservation13 != null ? reservation13.hashCode() : 0);
        result = 31 * result + (reservation12 != null ? reservation12.hashCode() : 0);
        result = 31 * result + (reservation11 != null ? reservation11.hashCode() : 0);
        result = 31 * result + (pjsj != null ? pjsj.hashCode() : 0);
        result = 31 * result + (ddxcsj != null ? ddxcsj.hashCode() : 0);
        result = 31 * result + (jqzbxx != null ? jqzbxx.hashCode() : 0);
        result = 31 * result + (reservation19 != null ? reservation19.hashCode() : 0);
        result = 31 * result + (reservation35 != null ? reservation35.hashCode() : 0);
        result = 31 * result + (eservation36 != null ? eservation36.hashCode() : 0);
        result = 31 * result + (reservation37 != null ? reservation37.hashCode() : 0);
        result = 31 * result + (reservation38 != null ? reservation38.hashCode() : 0);
        result = 31 * result + (flmjid != null ? flmjid.hashCode() : 0);
        result = 31 * result + (flmjdw != null ? flmjdw.hashCode() : 0);
        result = 31 * result + (section != null ? section.hashCode() : 0);
        result = 31 * result + (bjly != null ? bjly.hashCode() : 0);
        result = 31 * result + (bjdd != null ? bjdd.hashCode() : 0);
        result = 31 * result + (bjdh != null ? bjdh.hashCode() : 0);
        result = 31 * result + (sars != null ? sars.hashCode() : 0);
        return result;
    }
}
