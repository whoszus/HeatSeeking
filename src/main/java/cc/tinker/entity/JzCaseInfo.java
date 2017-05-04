package cc.tinker.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="jz_case_info")
public class JzCaseInfo implements Serializable{

	/**
	 * 出警单位
	 */
    private String cjdw;
	/**
	 * 出警时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date cjsj;
	/**
	 * 到达时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date ddsj;
	/**
	 * 调解纠纷
	 */
    private String tjjf;
	/**
	 * 现场勘查
	 */
    private String xckz;
	/**
	 * 出警记录
	 */
    private String cjjl;
	/**
	 * 警情处理建议
	 */
    private String cljy;
	/**
	 * 指派本单位办案人员
	 */
    private String bdwBary;
	/**
	 * 指派外单位办案人员
	 */
    private String wdwBary;
	/**
	 * 合并警情号
	 */
    private String hbjqh;
	/**
	 * 保留字段21
	 */
    private String reservation21;
	/**
	 * 保留字段22
	 */
    private String reservation22;
	/**
	 * 保留字段23
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reservation23;
	/**
	 * 保留字段24
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reservation24;
	/**
	 * 保留字段25
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reservation25;
	/**
	 * 保留字段
	 */
    private String reservation41;
	/**
	 * 保留字段
	 */
    private String reservation42;
	/**
	 * 保留字段
	 */
    private String reservation43;
	/**
	 * 保留字段
	 */
    private String reservation44;
	/**
	 * 保留字段
	 */
    private String reservation45;
	/**
	 * 保留字段
	 */
    private String reservation46;
	/**
	 * 保留字段
	 */
    private String reservation47;
	/**
	 * 保留字段
	 */
    private String reservation48;
	/**
	 * 保留字段
	 */
    private String reservation49;
	/**
	 * 保留字段
	 */
    private String reservation50;
	/**
	 * 保留字段
	 */
    private String reservation51;
	/**
	 * 保留字段
	 */
    private String reservation52;
	/**
	 * 保留字段
	 */
    private String reservation53;
	/**
	 * 保留字段
	 */
    private String reservation54;
	/**
	 * 保留字段
	 */
    private String reservation55;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reservation56;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reservation57;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reservation58;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reservation59;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reservation60;
	/**
	 * 基础库入库时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date gzdbAddtime;
	/**
	 * 系统编号-主键
	 */
    private String systemid;
	/**
	 * 警情编号
	 */
    private String ajbh;
	/**
	 * 警情名称
	 */
    private String ajmc;
	/**
	 * 接警单位
	 */
    private String sljjdw;
	/**
	 * 接警人员（警号）
	 */
    private String sljjry;
	/**
	 * 接警时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date sljjsj;
	/**
	 * 接警受理号
	 */
    private String slBjslh;
	/**
	 * 警情类别
	 */
    private String jqlb;
	/**
	 * 案别/案由
	 */
    private String ab;
	/**
	 * 发现时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date slfxrq;
	/**
	 * 发案时间初值
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date fasjcz;
	/**
	 * 发案时间终值
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date fasjzz;
	/**
	 * 接警方式
	 */
    private String slJjfs;
	/**
	 * 移送时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date yssj;
	/**
	 * 移送原因
	 */
    private String ysyy;
	/**
	 * 移送单位
	 */
    private String ysdw;
	/**
	 * 移送单位承办人
	 */
    private String ysdwcbr;
	/**
	 * 移送单位电话
	 */
    private String yscbrdh;
	/**
	 * 发案地点_区县
	 */
    private String faddQx;
	/**
	 * 发案地点_街道
	 */
    private String faddJd;
	/**
	 * 所属警区
	 */
    private String ajssjq;
	/**
	 * 发案地点详址
	 */
    private String fadd;
	/**
	 * 所属社区
	 */
    private String sssq;
	/**
	 * 简要案情
	 */
    private String zyaq;
	/**
	 * 死亡人数
	 */
    private Integer swrs;
	/**
	 * 受伤人数
	 */
    private Integer ssrs;
	/**
	 * 损失折款
	 */
    private Double ssjz;
	/**
	 * 涉案总值
	 */
    private Double sazz;
	/**
	 * 处理情况
	 */
    private String slAjclqk;
	/**
	 * 抓获犯罪嫌疑人
	 */
    private Integer slZhrs;
	/**
	 * 救助群众人数
	 */
    private Integer slJzrs;
	/**
	 * 解救拐卖妇女人数
	 */
    private Integer slJjfnrs;
	/**
	 * 解救拐卖儿童人数
	 */
    private Integer slJjetrs;
	/**
	 * 出警人
	 */
    private String slCjry;
	/**
	 * 出动警力
	 */
    private Integer slCjrc;
	/**
	 * 出动机动车数量
	 */
    private Integer slCjcl;
	/**
	 * 出动船只数量
	 */
    private Integer slCjcz;
	/**
	 * 出动航空器数量
	 */
    private Integer slCjhk;
	/**
	 * 领导意见
	 */
    private String slLdqz;
	/**
	 * 处理结果
	 */
    private String slCljg;
	/**
	 * 受理时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date slSlsj;
	/**
	 * 受理人姓名/接收
	 */
    private String slSlrxm;
	/**
	 * 受理单位/接收单位
	 */
    private String sljsdw;
	/**
	 * 填表人
	 */
    private String slLrr;
	/**
	 * 填表时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date slLrsj;
	/**
	 * 发现形式
	 */
    private String fxxs;
	/**
	 * 部门编号
	 */
    private String departmentcode;
	/**
	 * 创建人
	 */
    private String creator;
	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdtime;
	/**
	 * 密级
	 */
    private String securitygrade;
	/**
	 * 用于保留警情分流时存储过程报的错误描述
	 */
    private String reservation01;
	/**
	 * 如事立案系统的警情编号
	 */
    private String reservation02;
	/**
	 * 用于记录外部移送时的接收单位
	 */
    private String reservation03;
	/**
	 * 省
	 */
    private String reservation04;
	/**
	 * 确认案别
	 */
    private String reservation05;
	/**
	 * 110系统对应的警情号
	 */
    private String reservation06;
	/**
	 * 110系统的原始的警情内容
	 */
    private String reservation07;
	/**
	 * 领导（仅在页面显示，并不保存）
	 */
    private String reservation08;
	/**
	 * 是否作笔录
	 */
    private String reservation09;
	/**
	 * 发生场所
	 */
    private String reservation10;
	/**
	 * 最终修改人
	 */
    private String lastupdatedby;
	/**
	 * 最后修改时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastupdatedtime;
	/**
	 * 更新时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date refreshtime;
	/**
	 * 上传标识
	 */
    private String uploadflag;
	/**
	 * 下传标识
	 */
    private String downloadflag;
	/**
	 * 删除标识
	 */
    private String deleteflag;
	/**
	 * 备注
	 */
    private String bz;
	/**
	 * 若由视频接口新增则显示为由视频接口新增
	 */
    private String reserver1;
	/**
	 * 保留字段
	 */
    private String reserver2;
	/**
	 * 处警X坐标
	 */
    private String reserver3;
	/**
	 * 处警Y坐标
	 */
    private String reserver4;
	/**
	 * 保留字段
	 */
    private String reserver5;
	/**
	 * 保留字段
	 */
    private String reserver6;
	/**
	 * 保留字段
	 */
    private String reserver7;
	/**
	 * 作案手段
	 */
    private String reserver8;
	/**
	 * 作案特点
	 */
    private String reserver9;
	/**
	 * 作案工具
	 */
    private String reserver10;
	/**
	 * 选择对象
	 */
    private String reserver11;
	/**
	 * 选择物品
	 */
    private String reserver12;
	/**
	 * 选择处所
	 */
    private String reserver13;
	/**
	 * 上次发送时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reserver14;
	/**
	 * 报警X坐标
	 */
    private String reserver15;
	/**
	 * 报警Y坐标
	 */
    private String reserver16;
	/**
	 * 警情等级
	 */
    private String reserver17;
	/**
	 * 保留字段
	 */
    private String reserver18;
	/**
	 * 勘验编号
	 */
    private String reserver19;
	/**
	 * 通知时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reserver20;
	/**
	 * 到达时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reserver21;
	/**
	 * 保留字段
	 */
    private String reserver22;
	/**
	 * 保留字段
	 */
    private String reserver23;
	/**
	 * 保留字段
	 */
    private String reserver24;
	/**
	 * 保留字段
	 */
    private String reserver25;
	/**
	 * 保留字段
	 */
    private String reserver26;
	/**
	 * 保留字段
	 */
    private String reserver27;
	/**
	 * 保留字段
	 */
    private String reserver28;
	/**
	 * 保留字段
	 */
    private String reserver29;
	/**
	 * 保留字段
	 */
    private String reserver30;
	/**
	 * 保留字段
	 */
    private String reserver31;
	/**
	 * 保留字段
	 */
    private String reserver32;
	/**
	 * 保留字段
	 */
    private String reserver33;
	/**
	 * 保留字段
	 */
    private String reserver34;
	/**
	 * 保留字段
	 */
    private String reserver35;
	/**
	 * 保留字段
	 */
    private String reserver36;
	/**
	 * 保留字段
	 */
    private String reserver37;
	/**
	 * 保留字段
	 */
    private String reserver38;
	/**
	 * 保留字段
	 */
    private String reserver39;
	/**
	 * 保留字段
	 */
    private String reserver40;
	/**
	 * 保留字段
	 */
    private String reserver41;
	/**
	 * 保留字段
	 */
    private String reserver42;
	/**
	 * 保留字段
	 */
    private String reserver43;
	/**
	 * 保留字段
	 */
    private String reserver44;
	/**
	 * 是否有效
	 */
    private String reserver45;
	/**
	 * 保留字段
	 */
    private String reserver46;
	/**
	 * 保留字段
	 */
    private String reserver47;
	/**
	 * 保留字段
	 */
    private String reserver48;
	/**
	 * 保留字段
	 */
    private String reserver49;
	/**
	 * 保留字段
	 */
    private Integer reserver54;
	/**
	 * 保留字段
	 */
    private Integer reserver55;
	/**
	 * 保留字段
	 */
    private Integer reserver56;
	/**
	 * 保留字段
	 */
    private Integer reserver57;
	/**
	 * 保留字段
	 */
    private Integer reserver58;
	/**
	 * 保留字段
	 */
    private Integer reserver59;
	/**
	 * 保留字段
	 */
    private Integer reserver60;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reserver61;
	/**
	 * 保留字段
	 */
    private String reserver50;
	/**
	 * 保留字段
	 */
    private Integer reserver51;
	/**
	 * 保留字段
	 */
    private Integer reserver52;
	/**
	 * 保留字段
	 */
    private Integer reserver53;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reserver62;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reserver63;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reserver64;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reserver65;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reserver66;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reserver67;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reserver68;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reserver69;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reserver70;
	/**
	 * 保留字段
	 */
    private String reserver71;
	/**
	 * 保留字段
	 */
    private String reserver72;
	/**
	 * 保留字段
	 */
    private String reserver73;
	/**
	 * 保留字段
	 */
    private String reserver74;
	/**
	 * 保留字段
	 */
    private String reserver78;
	/**
	 * 保留字段
	 */
    private String reserver79;
	/**
	 * 保留字段
	 */
    private String reserver80;
	/**
	 * 接警单位(中文)
	 */
    private String sljjdwCn;
	/**
	 * 接警人(中文)
	 */
    private String sljjryCn;
	/**
	 * 警情性质(中文)
	 */
    private String jqlbCn;
	/**
	 * 警情类别(中文)
	 */
    private String abCn;
	/**
	 * 保留字段
	 */
    private String reserver75;
	/**
	 * 保留字段
	 */
    private String reserver76;
	/**
	 * 保留字段
	 */
    private String reserver77;
	/**
	 * 移送单位(中文)
	 */
    private String ysdwCn;
	/**
	 * 接警方式(中文)
	 */
    private String slJjfsCn;
	/**
	 * 移送单位承办人(中文)
	 */
    private String ysdwcbrCn;
	/**
	 * 区县(中文)
	 */
    private String faddQxCn;
	/**
	 * 街道中文)
	 */
    private String faddJdCn;
	/**
	 * 警区(中文)
	 */
    private String ajssjqCn;
	/**
	 * 社区(中文)
	 */
    private String sssqCn;
	/**
	 * 出警人(中文)
	 */
    private String slCjryCn;
	/**
	 * 保留字段20
	 */
    private String reservation20;
	/**
	 * 保留字段
R
	 */
    private String reservation33;
	/**
	 * 保留字段
S
	 */
    private String eservation34;
	/**
	 * 处理结果(中文)
	 */
    private String lCljgCn;
	/**
	 * 接收单位(中文)
	 */
    private String sljsdwCn;
	/**
	 * 填表人(中文)
	 */
    private String slLrrCn;
	/**
	 * 确认警情类别(中文)
	 */
    private String reservation05Cn;
	/**
	 * 领导(中文)
	 */
    private String reservation08Cn;
	/**
	 * 是否中文)
	 */
    private String reservation09Cn;
	/**
	 * 发生场所(中文)
	 */
    private String reservation10Cn;
	/**
	 * 数据状态
	 */
    private String datastate;
	/**
	 * 数据验证码
	 */
    private String datacheck;
	/**
	 * 快速查询编号
	 */
    private String queryid;
	/**
	 * 部门中文
	 */
    private String departmentcodeCn;
	/**
	 * 创建人中文
	 */
    private String creatorCn;
	/**
	 * 最后修改人中文
	 */
    private String lastupdatedbyCn;
	/**
	 * 110创建反馈单时间(山东)
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reservation40;
	/**
	 * 数据接收时间(山东)
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reservation39;
	/**
	 * 警车编号(山东)
	 */
    private String reservation32;
	/**
	 * 本地警情类别(山东)
	 */
    private String reservation31;
	/**
	 * 保留字段18
	 */
    private String reservation18;
	/**
	 * 保留字段17
	 */
    private String reservation17;
	/**
	 * 保留字段16
	 */
    private String reservation16;
	/**
	 * 保留字段15
	 */
    private String reservation15;
	/**
	 * 发案单位
	 */
    private String reservation14;
	/**
	 * 发案地派出所
	 */
    private String reservation13;
	/**
	 * 接警人
	 */
    private String reservation12;
	/**
	 * 警情状态
	 */
    private String reservation11;
	/**
	 * 派警时间(处警单表中处警时间)(山东)
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date pjsj;
	/**
	 * 反馈单表到达现场时间(山东)
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date ddxcsj;
	/**
	 * 坐标信息(山东)
	 */
    private String jqzbxx;
	/**
	 * 保留字段19
	 */
    private String reservation19;
	/**
	 * 保留字段
	 */
    private String reservation35;
	/**
	 * 保留字段
	 */
    private String eservation36;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reservation37;
	/**
	 * 保留字段
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reservation38;
	/**
	 * 分流民警ID
	 */
    private String flmjid;
	/**
	 * 分流民警单位
	 */
    private String flmjdw;
	/**
	 * 二级工作部门
	 */
    private String section;
	/**
	 * 报警来源
	 */
    private String bjly;
	/**
	 * 报警地点
	 */
    private String bjdd;
	/**
	 * 报警电话
	 */
    private String bjdh;
	/**
	 * 涉案人数
	 */
    private Integer sars;
	/**
	 * 
	 */
    private String slCljgCn;
 
	@Column(name="CJDW")
    public String getCjdw() {
        return cjdw;
    }
 
    public void setCjdw(String cjdw) {
        this.cjdw = cjdw;
    }
     
	@Column(name="CJSJ")
    public Date getCjsj() {
        return cjsj;
    }
 
    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }
     
	@Column(name="DDSJ")
    public Date getDdsj() {
        return ddsj;
    }
 
    public void setDdsj(Date ddsj) {
        this.ddsj = ddsj;
    }
     
	@Column(name="TJJF")
    public String getTjjf() {
        return tjjf;
    }
 
    public void setTjjf(String tjjf) {
        this.tjjf = tjjf;
    }
     
	@Column(name="XCKZ")
    public String getXckz() {
        return xckz;
    }
 
    public void setXckz(String xckz) {
        this.xckz = xckz;
    }
     
	@Column(name="CJJL")
    public String getCjjl() {
        return cjjl;
    }
 
    public void setCjjl(String cjjl) {
        this.cjjl = cjjl;
    }
     
	@Column(name="CLJY")
    public String getCljy() {
        return cljy;
    }
 
    public void setCljy(String cljy) {
        this.cljy = cljy;
    }
     
	@Column(name="BDW_BARY")
    public String getBdwBary() {
        return bdwBary;
    }
 
    public void setBdwBary(String bdwBary) {
        this.bdwBary = bdwBary;
    }
     
	@Column(name="WDW_BARY")
    public String getWdwBary() {
        return wdwBary;
    }
 
    public void setWdwBary(String wdwBary) {
        this.wdwBary = wdwBary;
    }
     
	@Column(name="HBJQH")
    public String getHbjqh() {
        return hbjqh;
    }
 
    public void setHbjqh(String hbjqh) {
        this.hbjqh = hbjqh;
    }
     
	@Column(name="RESERVATION21")
    public String getReservation21() {
        return reservation21;
    }
 
    public void setReservation21(String reservation21) {
        this.reservation21 = reservation21;
    }
     
	@Column(name="RESERVATION22")
    public String getReservation22() {
        return reservation22;
    }
 
    public void setReservation22(String reservation22) {
        this.reservation22 = reservation22;
    }
     
	@Column(name="RESERVATION23")
    public Date getReservation23() {
        return reservation23;
    }
 
    public void setReservation23(Date reservation23) {
        this.reservation23 = reservation23;
    }
     
	@Column(name="RESERVATION24")
    public Date getReservation24() {
        return reservation24;
    }
 
    public void setReservation24(Date reservation24) {
        this.reservation24 = reservation24;
    }
     
	@Column(name="RESERVATION25")
    public Date getReservation25() {
        return reservation25;
    }
 
    public void setReservation25(Date reservation25) {
        this.reservation25 = reservation25;
    }
     
	@Column(name="RESERVATION41")
    public String getReservation41() {
        return reservation41;
    }
 
    public void setReservation41(String reservation41) {
        this.reservation41 = reservation41;
    }
     
	@Column(name="RESERVATION42")
    public String getReservation42() {
        return reservation42;
    }
 
    public void setReservation42(String reservation42) {
        this.reservation42 = reservation42;
    }
     
	@Column(name="RESERVATION43")
    public String getReservation43() {
        return reservation43;
    }
 
    public void setReservation43(String reservation43) {
        this.reservation43 = reservation43;
    }
     
	@Column(name="RESERVATION44")
    public String getReservation44() {
        return reservation44;
    }
 
    public void setReservation44(String reservation44) {
        this.reservation44 = reservation44;
    }
     
	@Column(name="RESERVATION45")
    public String getReservation45() {
        return reservation45;
    }
 
    public void setReservation45(String reservation45) {
        this.reservation45 = reservation45;
    }
     
	@Column(name="RESERVATION46")
    public String getReservation46() {
        return reservation46;
    }
 
    public void setReservation46(String reservation46) {
        this.reservation46 = reservation46;
    }
     
	@Column(name="RESERVATION47")
    public String getReservation47() {
        return reservation47;
    }
 
    public void setReservation47(String reservation47) {
        this.reservation47 = reservation47;
    }
     
	@Column(name="RESERVATION48")
    public String getReservation48() {
        return reservation48;
    }
 
    public void setReservation48(String reservation48) {
        this.reservation48 = reservation48;
    }
     
	@Column(name="RESERVATION49")
    public String getReservation49() {
        return reservation49;
    }
 
    public void setReservation49(String reservation49) {
        this.reservation49 = reservation49;
    }
     
	@Column(name="RESERVATION50")
    public String getReservation50() {
        return reservation50;
    }
 
    public void setReservation50(String reservation50) {
        this.reservation50 = reservation50;
    }
     
	@Column(name="RESERVATION51")
    public String getReservation51() {
        return reservation51;
    }
 
    public void setReservation51(String reservation51) {
        this.reservation51 = reservation51;
    }
     
	@Column(name="RESERVATION52")
    public String getReservation52() {
        return reservation52;
    }
 
    public void setReservation52(String reservation52) {
        this.reservation52 = reservation52;
    }
     
	@Column(name="RESERVATION53")
    public String getReservation53() {
        return reservation53;
    }
 
    public void setReservation53(String reservation53) {
        this.reservation53 = reservation53;
    }
     
	@Column(name="RESERVATION54")
    public String getReservation54() {
        return reservation54;
    }
 
    public void setReservation54(String reservation54) {
        this.reservation54 = reservation54;
    }
     
	@Column(name="RESERVATION55")
    public String getReservation55() {
        return reservation55;
    }
 
    public void setReservation55(String reservation55) {
        this.reservation55 = reservation55;
    }
     
	@Column(name="RESERVATION56")
    public Date getReservation56() {
        return reservation56;
    }
 
    public void setReservation56(Date reservation56) {
        this.reservation56 = reservation56;
    }
     
	@Column(name="RESERVATION57")
    public Date getReservation57() {
        return reservation57;
    }
 
    public void setReservation57(Date reservation57) {
        this.reservation57 = reservation57;
    }
     
	@Column(name="RESERVATION58")
    public Date getReservation58() {
        return reservation58;
    }
 
    public void setReservation58(Date reservation58) {
        this.reservation58 = reservation58;
    }
     
	@Column(name="RESERVATION59")
    public Date getReservation59() {
        return reservation59;
    }
 
    public void setReservation59(Date reservation59) {
        this.reservation59 = reservation59;
    }
     
	@Column(name="RESERVATION60")
    public Date getReservation60() {
        return reservation60;
    }
 
    public void setReservation60(Date reservation60) {
        this.reservation60 = reservation60;
    }
     
	@Column(name="GZDB_ADDTIME")
    public Date getGzdbAddtime() {
        return gzdbAddtime;
    }
 
    public void setGzdbAddtime(Date gzdbAddtime) {
        this.gzdbAddtime = gzdbAddtime;
    }
     
	@Id
	@Column(name = "SYSTEMID", unique = true, nullable = false)
    public String getSystemid() {
        return systemid;
    }
 
    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }
     
	@Column(name="AJBH")
    public String getAjbh() {
        return ajbh;
    }
 
    public void setAjbh(String ajbh) {
        this.ajbh = ajbh;
    }
     
	@Column(name="AJMC")
    public String getAjmc() {
        return ajmc;
    }
 
    public void setAjmc(String ajmc) {
        this.ajmc = ajmc;
    }
     
	@Column(name="SLJJDW")
    public String getSljjdw() {
        return sljjdw;
    }
 
    public void setSljjdw(String sljjdw) {
        this.sljjdw = sljjdw;
    }
     
	@Column(name="SLJJRY")
    public String getSljjry() {
        return sljjry;
    }
 
    public void setSljjry(String sljjry) {
        this.sljjry = sljjry;
    }
     
	@Column(name="SLJJSJ")
    public Date getSljjsj() {
        return sljjsj;
    }
 
    public void setSljjsj(Date sljjsj) {
        this.sljjsj = sljjsj;
    }
     
	@Column(name="SL_BJSLH")
    public String getSlBjslh() {
        return slBjslh;
    }
 
    public void setSlBjslh(String slBjslh) {
        this.slBjslh = slBjslh;
    }
     
	@Column(name="JQLB")
    public String getJqlb() {
        return jqlb;
    }
 
    public void setJqlb(String jqlb) {
        this.jqlb = jqlb;
    }
     
	@Column(name="AB")
    public String getAb() {
        return ab;
    }
 
    public void setAb(String ab) {
        this.ab = ab;
    }
     
	@Column(name="SLFXRQ")
    public Date getSlfxrq() {
        return slfxrq;
    }
 
    public void setSlfxrq(Date slfxrq) {
        this.slfxrq = slfxrq;
    }
     
	@Column(name="FASJCZ")
    public Date getFasjcz() {
        return fasjcz;
    }
 
    public void setFasjcz(Date fasjcz) {
        this.fasjcz = fasjcz;
    }
     
	@Column(name="FASJZZ")
    public Date getFasjzz() {
        return fasjzz;
    }
 
    public void setFasjzz(Date fasjzz) {
        this.fasjzz = fasjzz;
    }
     
	@Column(name="SL_JJFS")
    public String getSlJjfs() {
        return slJjfs;
    }
 
    public void setSlJjfs(String slJjfs) {
        this.slJjfs = slJjfs;
    }
     
	@Column(name="YSSJ")
    public Date getYssj() {
        return yssj;
    }
 
    public void setYssj(Date yssj) {
        this.yssj = yssj;
    }
     
	@Column(name="YSYY")
    public String getYsyy() {
        return ysyy;
    }
 
    public void setYsyy(String ysyy) {
        this.ysyy = ysyy;
    }
     
	@Column(name="YSDW")
    public String getYsdw() {
        return ysdw;
    }
 
    public void setYsdw(String ysdw) {
        this.ysdw = ysdw;
    }
     
	@Column(name="YSDWCBR")
    public String getYsdwcbr() {
        return ysdwcbr;
    }
 
    public void setYsdwcbr(String ysdwcbr) {
        this.ysdwcbr = ysdwcbr;
    }
     
	@Column(name="YSCBRDH")
    public String getYscbrdh() {
        return yscbrdh;
    }
 
    public void setYscbrdh(String yscbrdh) {
        this.yscbrdh = yscbrdh;
    }
     
	@Column(name="FADD_QX")
    public String getFaddQx() {
        return faddQx;
    }
 
    public void setFaddQx(String faddQx) {
        this.faddQx = faddQx;
    }
     
	@Column(name="FADD_JD")
    public String getFaddJd() {
        return faddJd;
    }
 
    public void setFaddJd(String faddJd) {
        this.faddJd = faddJd;
    }
     
	@Column(name="AJSSJQ")
    public String getAjssjq() {
        return ajssjq;
    }
 
    public void setAjssjq(String ajssjq) {
        this.ajssjq = ajssjq;
    }
     
	@Column(name="FADD")
    public String getFadd() {
        return fadd;
    }
 
    public void setFadd(String fadd) {
        this.fadd = fadd;
    }
     
	@Column(name="SSSQ")
    public String getSssq() {
        return sssq;
    }
 
    public void setSssq(String sssq) {
        this.sssq = sssq;
    }
     
	@Column(name="ZYAQ")
    public String getZyaq() {
        return zyaq;
    }
 
    public void setZyaq(String zyaq) {
        this.zyaq = zyaq;
    }
     
	@Column(name="SWRS")
    public Integer getSwrs() {
        return swrs;
    }
 
    public void setSwrs(Integer swrs) {
        this.swrs = swrs;
    }
     
	@Column(name="SSRS")
    public Integer getSsrs() {
        return ssrs;
    }
 
    public void setSsrs(Integer ssrs) {
        this.ssrs = ssrs;
    }
     
	@Column(name="SSJZ")
    public Double getSsjz() {
        return ssjz;
    }
 
    public void setSsjz(Double ssjz) {
        this.ssjz = ssjz;
    }
     
	@Column(name="SAZZ")
    public Double getSazz() {
        return sazz;
    }
 
    public void setSazz(Double sazz) {
        this.sazz = sazz;
    }
     
	@Column(name="SL_AJCLQK")
    public String getSlAjclqk() {
        return slAjclqk;
    }
 
    public void setSlAjclqk(String slAjclqk) {
        this.slAjclqk = slAjclqk;
    }
     
	@Column(name="SL_ZHRS")
    public Integer getSlZhrs() {
        return slZhrs;
    }
 
    public void setSlZhrs(Integer slZhrs) {
        this.slZhrs = slZhrs;
    }
     
	@Column(name="SL_JZRS")
    public Integer getSlJzrs() {
        return slJzrs;
    }
 
    public void setSlJzrs(Integer slJzrs) {
        this.slJzrs = slJzrs;
    }
     
	@Column(name="SL_JJFNRS")
    public Integer getSlJjfnrs() {
        return slJjfnrs;
    }
 
    public void setSlJjfnrs(Integer slJjfnrs) {
        this.slJjfnrs = slJjfnrs;
    }
     
	@Column(name="SL_JJETRS")
    public Integer getSlJjetrs() {
        return slJjetrs;
    }
 
    public void setSlJjetrs(Integer slJjetrs) {
        this.slJjetrs = slJjetrs;
    }
     
	@Column(name="SL_CJRY")
    public String getSlCjry() {
        return slCjry;
    }
 
    public void setSlCjry(String slCjry) {
        this.slCjry = slCjry;
    }
     
	@Column(name="SL_CJRC")
    public Integer getSlCjrc() {
        return slCjrc;
    }
 
    public void setSlCjrc(Integer slCjrc) {
        this.slCjrc = slCjrc;
    }
     
	@Column(name="SL_CJCL")
    public Integer getSlCjcl() {
        return slCjcl;
    }
 
    public void setSlCjcl(Integer slCjcl) {
        this.slCjcl = slCjcl;
    }
     
	@Column(name="SL_CJCZ")
    public Integer getSlCjcz() {
        return slCjcz;
    }
 
    public void setSlCjcz(Integer slCjcz) {
        this.slCjcz = slCjcz;
    }
     
	@Column(name="SL_CJHK")
    public Integer getSlCjhk() {
        return slCjhk;
    }
 
    public void setSlCjhk(Integer slCjhk) {
        this.slCjhk = slCjhk;
    }
     
	@Column(name="SL_LDQZ")
    public String getSlLdqz() {
        return slLdqz;
    }
 
    public void setSlLdqz(String slLdqz) {
        this.slLdqz = slLdqz;
    }
     
	@Column(name="SL_CLJG")
    public String getSlCljg() {
        return slCljg;
    }
 
    public void setSlCljg(String slCljg) {
        this.slCljg = slCljg;
    }
     
	@Column(name="SL_SLSJ")
    public Date getSlSlsj() {
        return slSlsj;
    }
 
    public void setSlSlsj(Date slSlsj) {
        this.slSlsj = slSlsj;
    }
     
	@Column(name="SL_SLRXM")
    public String getSlSlrxm() {
        return slSlrxm;
    }
 
    public void setSlSlrxm(String slSlrxm) {
        this.slSlrxm = slSlrxm;
    }
     
	@Column(name="SLJSDW")
    public String getSljsdw() {
        return sljsdw;
    }
 
    public void setSljsdw(String sljsdw) {
        this.sljsdw = sljsdw;
    }
     
	@Column(name="SL_LRR")
    public String getSlLrr() {
        return slLrr;
    }
 
    public void setSlLrr(String slLrr) {
        this.slLrr = slLrr;
    }
     
	@Column(name="SL_LRSJ")
    public Date getSlLrsj() {
        return slLrsj;
    }
 
    public void setSlLrsj(Date slLrsj) {
        this.slLrsj = slLrsj;
    }
     
	@Column(name="FXXS")
    public String getFxxs() {
        return fxxs;
    }
 
    public void setFxxs(String fxxs) {
        this.fxxs = fxxs;
    }
     
	@Column(name="DEPARTMENTCODE")
    public String getDepartmentcode() {
        return departmentcode;
    }
 
    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }
     
	@Column(name="CREATOR")
    public String getCreator() {
        return creator;
    }
 
    public void setCreator(String creator) {
        this.creator = creator;
    }
     
	@Column(name="CREATEDTIME")
    public Date getCreatedtime() {
        return createdtime;
    }
 
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }
     
	@Column(name="SECURITYGRADE")
    public String getSecuritygrade() {
        return securitygrade;
    }
 
    public void setSecuritygrade(String securitygrade) {
        this.securitygrade = securitygrade;
    }
     
	@Column(name="RESERVATION01")
    public String getReservation01() {
        return reservation01;
    }
 
    public void setReservation01(String reservation01) {
        this.reservation01 = reservation01;
    }
     
	@Column(name="RESERVATION02")
    public String getReservation02() {
        return reservation02;
    }
 
    public void setReservation02(String reservation02) {
        this.reservation02 = reservation02;
    }
     
	@Column(name="RESERVATION03")
    public String getReservation03() {
        return reservation03;
    }
 
    public void setReservation03(String reservation03) {
        this.reservation03 = reservation03;
    }
     
	@Column(name="RESERVATION04")
    public String getReservation04() {
        return reservation04;
    }
 
    public void setReservation04(String reservation04) {
        this.reservation04 = reservation04;
    }
     
	@Column(name="RESERVATION05")
    public String getReservation05() {
        return reservation05;
    }
 
    public void setReservation05(String reservation05) {
        this.reservation05 = reservation05;
    }
     
	@Column(name="RESERVATION06")
    public String getReservation06() {
        return reservation06;
    }
 
    public void setReservation06(String reservation06) {
        this.reservation06 = reservation06;
    }
     
	@Column(name="RESERVATION07")
    public String getReservation07() {
        return reservation07;
    }
 
    public void setReservation07(String reservation07) {
        this.reservation07 = reservation07;
    }
     
	@Column(name="RESERVATION08")
    public String getReservation08() {
        return reservation08;
    }
 
    public void setReservation08(String reservation08) {
        this.reservation08 = reservation08;
    }
     
	@Column(name="RESERVATION09")
    public String getReservation09() {
        return reservation09;
    }
 
    public void setReservation09(String reservation09) {
        this.reservation09 = reservation09;
    }
     
	@Column(name="RESERVATION10")
    public String getReservation10() {
        return reservation10;
    }
 
    public void setReservation10(String reservation10) {
        this.reservation10 = reservation10;
    }
     
	@Column(name="LASTUPDATEDBY")
    public String getLastupdatedby() {
        return lastupdatedby;
    }
 
    public void setLastupdatedby(String lastupdatedby) {
        this.lastupdatedby = lastupdatedby;
    }
     
	@Column(name="LASTUPDATEDTIME")
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }
 
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }
     
	@Column(name="REFRESHTIME")
    public Date getRefreshtime() {
        return refreshtime;
    }
 
    public void setRefreshtime(Date refreshtime) {
        this.refreshtime = refreshtime;
    }
     
	@Column(name="UPLOADFLAG")
    public String getUploadflag() {
        return uploadflag;
    }
 
    public void setUploadflag(String uploadflag) {
        this.uploadflag = uploadflag;
    }
     
	@Column(name="DOWNLOADFLAG")
    public String getDownloadflag() {
        return downloadflag;
    }
 
    public void setDownloadflag(String downloadflag) {
        this.downloadflag = downloadflag;
    }
     
	@Column(name="DELETEFLAG")
    public String getDeleteflag() {
        return deleteflag;
    }
 
    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag;
    }
     
	@Column(name="BZ")
    public String getBz() {
        return bz;
    }
 
    public void setBz(String bz) {
        this.bz = bz;
    }
     
	@Column(name="RESERVER1")
    public String getReserver1() {
        return reserver1;
    }
 
    public void setReserver1(String reserver1) {
        this.reserver1 = reserver1;
    }
     
	@Column(name="RESERVER2")
    public String getReserver2() {
        return reserver2;
    }
 
    public void setReserver2(String reserver2) {
        this.reserver2 = reserver2;
    }
     
	@Column(name="RESERVER3")
    public String getReserver3() {
        return reserver3;
    }
 
    public void setReserver3(String reserver3) {
        this.reserver3 = reserver3;
    }
     
	@Column(name="RESERVER4")
    public String getReserver4() {
        return reserver4;
    }
 
    public void setReserver4(String reserver4) {
        this.reserver4 = reserver4;
    }
     
	@Column(name="RESERVER5")
    public String getReserver5() {
        return reserver5;
    }
 
    public void setReserver5(String reserver5) {
        this.reserver5 = reserver5;
    }
     
	@Column(name="RESERVER6")
    public String getReserver6() {
        return reserver6;
    }
 
    public void setReserver6(String reserver6) {
        this.reserver6 = reserver6;
    }
     
	@Column(name="RESERVER7")
    public String getReserver7() {
        return reserver7;
    }
 
    public void setReserver7(String reserver7) {
        this.reserver7 = reserver7;
    }
     
	@Column(name="RESERVER8")
    public String getReserver8() {
        return reserver8;
    }
 
    public void setReserver8(String reserver8) {
        this.reserver8 = reserver8;
    }
     
	@Column(name="RESERVER9")
    public String getReserver9() {
        return reserver9;
    }
 
    public void setReserver9(String reserver9) {
        this.reserver9 = reserver9;
    }
     
	@Column(name="RESERVER10")
    public String getReserver10() {
        return reserver10;
    }
 
    public void setReserver10(String reserver10) {
        this.reserver10 = reserver10;
    }
     
	@Column(name="RESERVER11")
    public String getReserver11() {
        return reserver11;
    }
 
    public void setReserver11(String reserver11) {
        this.reserver11 = reserver11;
    }
     
	@Column(name="RESERVER12")
    public String getReserver12() {
        return reserver12;
    }
 
    public void setReserver12(String reserver12) {
        this.reserver12 = reserver12;
    }
     
	@Column(name="RESERVER13")
    public String getReserver13() {
        return reserver13;
    }
 
    public void setReserver13(String reserver13) {
        this.reserver13 = reserver13;
    }
     
	@Column(name="RESERVER14")
    public Date getReserver14() {
        return reserver14;
    }
 
    public void setReserver14(Date reserver14) {
        this.reserver14 = reserver14;
    }
     
	@Column(name="RESERVER15")
    public String getReserver15() {
        return reserver15;
    }
 
    public void setReserver15(String reserver15) {
        this.reserver15 = reserver15;
    }
     
	@Column(name="RESERVER16")
    public String getReserver16() {
        return reserver16;
    }
 
    public void setReserver16(String reserver16) {
        this.reserver16 = reserver16;
    }
     
	@Column(name="RESERVER17")
    public String getReserver17() {
        return reserver17;
    }
 
    public void setReserver17(String reserver17) {
        this.reserver17 = reserver17;
    }
     
	@Column(name="RESERVER18")
    public String getReserver18() {
        return reserver18;
    }
 
    public void setReserver18(String reserver18) {
        this.reserver18 = reserver18;
    }
     
	@Column(name="RESERVER19")
    public String getReserver19() {
        return reserver19;
    }
 
    public void setReserver19(String reserver19) {
        this.reserver19 = reserver19;
    }
     
	@Column(name="RESERVER20")
    public Date getReserver20() {
        return reserver20;
    }
 
    public void setReserver20(Date reserver20) {
        this.reserver20 = reserver20;
    }
     
	@Column(name="RESERVER21")
    public Date getReserver21() {
        return reserver21;
    }
 
    public void setReserver21(Date reserver21) {
        this.reserver21 = reserver21;
    }
     
	@Column(name="RESERVER22")
    public String getReserver22() {
        return reserver22;
    }
 
    public void setReserver22(String reserver22) {
        this.reserver22 = reserver22;
    }
     
	@Column(name="RESERVER23")
    public String getReserver23() {
        return reserver23;
    }
 
    public void setReserver23(String reserver23) {
        this.reserver23 = reserver23;
    }
     
	@Column(name="RESERVER24")
    public String getReserver24() {
        return reserver24;
    }
 
    public void setReserver24(String reserver24) {
        this.reserver24 = reserver24;
    }
     
	@Column(name="RESERVER25")
    public String getReserver25() {
        return reserver25;
    }
 
    public void setReserver25(String reserver25) {
        this.reserver25 = reserver25;
    }
     
	@Column(name="RESERVER26")
    public String getReserver26() {
        return reserver26;
    }
 
    public void setReserver26(String reserver26) {
        this.reserver26 = reserver26;
    }
     
	@Column(name="RESERVER27")
    public String getReserver27() {
        return reserver27;
    }
 
    public void setReserver27(String reserver27) {
        this.reserver27 = reserver27;
    }
     
	@Column(name="RESERVER28")
    public String getReserver28() {
        return reserver28;
    }
 
    public void setReserver28(String reserver28) {
        this.reserver28 = reserver28;
    }
     
	@Column(name="RESERVER29")
    public String getReserver29() {
        return reserver29;
    }
 
    public void setReserver29(String reserver29) {
        this.reserver29 = reserver29;
    }
     
	@Column(name="RESERVER30")
    public String getReserver30() {
        return reserver30;
    }
 
    public void setReserver30(String reserver30) {
        this.reserver30 = reserver30;
    }
     
	@Column(name="RESERVER31")
    public String getReserver31() {
        return reserver31;
    }
 
    public void setReserver31(String reserver31) {
        this.reserver31 = reserver31;
    }
     
	@Column(name="RESERVER32")
    public String getReserver32() {
        return reserver32;
    }
 
    public void setReserver32(String reserver32) {
        this.reserver32 = reserver32;
    }
     
	@Column(name="RESERVER33")
    public String getReserver33() {
        return reserver33;
    }
 
    public void setReserver33(String reserver33) {
        this.reserver33 = reserver33;
    }
     
	@Column(name="RESERVER34")
    public String getReserver34() {
        return reserver34;
    }
 
    public void setReserver34(String reserver34) {
        this.reserver34 = reserver34;
    }
     
	@Column(name="RESERVER35")
    public String getReserver35() {
        return reserver35;
    }
 
    public void setReserver35(String reserver35) {
        this.reserver35 = reserver35;
    }
     
	@Column(name="RESERVER36")
    public String getReserver36() {
        return reserver36;
    }
 
    public void setReserver36(String reserver36) {
        this.reserver36 = reserver36;
    }
     
	@Column(name="RESERVER37")
    public String getReserver37() {
        return reserver37;
    }
 
    public void setReserver37(String reserver37) {
        this.reserver37 = reserver37;
    }
     
	@Column(name="RESERVER38")
    public String getReserver38() {
        return reserver38;
    }
 
    public void setReserver38(String reserver38) {
        this.reserver38 = reserver38;
    }
     
	@Column(name="RESERVER39")
    public String getReserver39() {
        return reserver39;
    }
 
    public void setReserver39(String reserver39) {
        this.reserver39 = reserver39;
    }
     
	@Column(name="RESERVER40")
    public String getReserver40() {
        return reserver40;
    }
 
    public void setReserver40(String reserver40) {
        this.reserver40 = reserver40;
    }
     
	@Column(name="RESERVER41")
    public String getReserver41() {
        return reserver41;
    }
 
    public void setReserver41(String reserver41) {
        this.reserver41 = reserver41;
    }
     
	@Column(name="RESERVER42")
    public String getReserver42() {
        return reserver42;
    }
 
    public void setReserver42(String reserver42) {
        this.reserver42 = reserver42;
    }
     
	@Column(name="RESERVER43")
    public String getReserver43() {
        return reserver43;
    }
 
    public void setReserver43(String reserver43) {
        this.reserver43 = reserver43;
    }
     
	@Column(name="RESERVER44")
    public String getReserver44() {
        return reserver44;
    }
 
    public void setReserver44(String reserver44) {
        this.reserver44 = reserver44;
    }
     
	@Column(name="RESERVER45")
    public String getReserver45() {
        return reserver45;
    }
 
    public void setReserver45(String reserver45) {
        this.reserver45 = reserver45;
    }
     
	@Column(name="RESERVER46")
    public String getReserver46() {
        return reserver46;
    }
 
    public void setReserver46(String reserver46) {
        this.reserver46 = reserver46;
    }
     
	@Column(name="RESERVER47")
    public String getReserver47() {
        return reserver47;
    }
 
    public void setReserver47(String reserver47) {
        this.reserver47 = reserver47;
    }
     
	@Column(name="RESERVER48")
    public String getReserver48() {
        return reserver48;
    }
 
    public void setReserver48(String reserver48) {
        this.reserver48 = reserver48;
    }
     
	@Column(name="RESERVER49")
    public String getReserver49() {
        return reserver49;
    }
 
    public void setReserver49(String reserver49) {
        this.reserver49 = reserver49;
    }
     
	@Column(name="RESERVER54")
    public Integer getReserver54() {
        return reserver54;
    }
 
    public void setReserver54(Integer reserver54) {
        this.reserver54 = reserver54;
    }
     
	@Column(name="RESERVER55")
    public Integer getReserver55() {
        return reserver55;
    }
 
    public void setReserver55(Integer reserver55) {
        this.reserver55 = reserver55;
    }
     
	@Column(name="RESERVER56")
    public Integer getReserver56() {
        return reserver56;
    }
 
    public void setReserver56(Integer reserver56) {
        this.reserver56 = reserver56;
    }
     
	@Column(name="RESERVER57")
    public Integer getReserver57() {
        return reserver57;
    }
 
    public void setReserver57(Integer reserver57) {
        this.reserver57 = reserver57;
    }
     
	@Column(name="RESERVER58")
    public Integer getReserver58() {
        return reserver58;
    }
 
    public void setReserver58(Integer reserver58) {
        this.reserver58 = reserver58;
    }
     
	@Column(name="RESERVER59")
    public Integer getReserver59() {
        return reserver59;
    }
 
    public void setReserver59(Integer reserver59) {
        this.reserver59 = reserver59;
    }
     
	@Column(name="RESERVER60")
    public Integer getReserver60() {
        return reserver60;
    }
 
    public void setReserver60(Integer reserver60) {
        this.reserver60 = reserver60;
    }
     
	@Column(name="RESERVER61")
    public Date getReserver61() {
        return reserver61;
    }
 
    public void setReserver61(Date reserver61) {
        this.reserver61 = reserver61;
    }
     
	@Column(name="RESERVER50")
    public String getReserver50() {
        return reserver50;
    }
 
    public void setReserver50(String reserver50) {
        this.reserver50 = reserver50;
    }
     
	@Column(name="RESERVER51")
    public Integer getReserver51() {
        return reserver51;
    }
 
    public void setReserver51(Integer reserver51) {
        this.reserver51 = reserver51;
    }
     
	@Column(name="RESERVER52")
    public Integer getReserver52() {
        return reserver52;
    }
 
    public void setReserver52(Integer reserver52) {
        this.reserver52 = reserver52;
    }
     
	@Column(name="RESERVER53")
    public Integer getReserver53() {
        return reserver53;
    }
 
    public void setReserver53(Integer reserver53) {
        this.reserver53 = reserver53;
    }
     
	@Column(name="RESERVER62")
    public Date getReserver62() {
        return reserver62;
    }
 
    public void setReserver62(Date reserver62) {
        this.reserver62 = reserver62;
    }
     
	@Column(name="RESERVER63")
    public Date getReserver63() {
        return reserver63;
    }
 
    public void setReserver63(Date reserver63) {
        this.reserver63 = reserver63;
    }
     
	@Column(name="RESERVER64")
    public Date getReserver64() {
        return reserver64;
    }
 
    public void setReserver64(Date reserver64) {
        this.reserver64 = reserver64;
    }
     
	@Column(name="RESERVER65")
    public Date getReserver65() {
        return reserver65;
    }
 
    public void setReserver65(Date reserver65) {
        this.reserver65 = reserver65;
    }
     
	@Column(name="RESERVER66")
    public Date getReserver66() {
        return reserver66;
    }
 
    public void setReserver66(Date reserver66) {
        this.reserver66 = reserver66;
    }
     
	@Column(name="RESERVER67")
    public Date getReserver67() {
        return reserver67;
    }
 
    public void setReserver67(Date reserver67) {
        this.reserver67 = reserver67;
    }
     
	@Column(name="RESERVER68")
    public Date getReserver68() {
        return reserver68;
    }
 
    public void setReserver68(Date reserver68) {
        this.reserver68 = reserver68;
    }
     
	@Column(name="RESERVER69")
    public Date getReserver69() {
        return reserver69;
    }
 
    public void setReserver69(Date reserver69) {
        this.reserver69 = reserver69;
    }
     
	@Column(name="RESERVER70")
    public Date getReserver70() {
        return reserver70;
    }
 
    public void setReserver70(Date reserver70) {
        this.reserver70 = reserver70;
    }
     
	@Column(name="RESERVER71")
    public String getReserver71() {
        return reserver71;
    }
 
    public void setReserver71(String reserver71) {
        this.reserver71 = reserver71;
    }
     
	@Column(name="RESERVER72")
    public String getReserver72() {
        return reserver72;
    }
 
    public void setReserver72(String reserver72) {
        this.reserver72 = reserver72;
    }
     
	@Column(name="RESERVER73")
    public String getReserver73() {
        return reserver73;
    }
 
    public void setReserver73(String reserver73) {
        this.reserver73 = reserver73;
    }
     
	@Column(name="RESERVER74")
    public String getReserver74() {
        return reserver74;
    }
 
    public void setReserver74(String reserver74) {
        this.reserver74 = reserver74;
    }
     
	@Column(name="RESERVER78")
    public String getReserver78() {
        return reserver78;
    }
 
    public void setReserver78(String reserver78) {
        this.reserver78 = reserver78;
    }
     
	@Column(name="RESERVER79")
    public String getReserver79() {
        return reserver79;
    }
 
    public void setReserver79(String reserver79) {
        this.reserver79 = reserver79;
    }
     
	@Column(name="RESERVER80")
    public String getReserver80() {
        return reserver80;
    }
 
    public void setReserver80(String reserver80) {
        this.reserver80 = reserver80;
    }
     
	@Column(name="SLJJDW_CN")
    public String getSljjdwCn() {
        return sljjdwCn;
    }
 
    public void setSljjdwCn(String sljjdwCn) {
        this.sljjdwCn = sljjdwCn;
    }
     
	@Column(name="SLJJRY_CN")
    public String getSljjryCn() {
        return sljjryCn;
    }
 
    public void setSljjryCn(String sljjryCn) {
        this.sljjryCn = sljjryCn;
    }
     
	@Column(name="JQLB_CN")
    public String getJqlbCn() {
        return jqlbCn;
    }
 
    public void setJqlbCn(String jqlbCn) {
        this.jqlbCn = jqlbCn;
    }
     
	@Column(name="AB_CN")
    public String getAbCn() {
        return abCn;
    }
 
    public void setAbCn(String abCn) {
        this.abCn = abCn;
    }
     
	@Column(name="RESERVER75")
    public String getReserver75() {
        return reserver75;
    }
 
    public void setReserver75(String reserver75) {
        this.reserver75 = reserver75;
    }
     
	@Column(name="RESERVER76")
    public String getReserver76() {
        return reserver76;
    }
 
    public void setReserver76(String reserver76) {
        this.reserver76 = reserver76;
    }
     
	@Column(name="RESERVER77")
    public String getReserver77() {
        return reserver77;
    }
 
    public void setReserver77(String reserver77) {
        this.reserver77 = reserver77;
    }
     
	@Column(name="YSDW_CN")
    public String getYsdwCn() {
        return ysdwCn;
    }
 
    public void setYsdwCn(String ysdwCn) {
        this.ysdwCn = ysdwCn;
    }
     
	@Column(name="SL_JJFS_CN")
    public String getSlJjfsCn() {
        return slJjfsCn;
    }
 
    public void setSlJjfsCn(String slJjfsCn) {
        this.slJjfsCn = slJjfsCn;
    }
     
	@Column(name="YSDWCBR_CN")
    public String getYsdwcbrCn() {
        return ysdwcbrCn;
    }
 
    public void setYsdwcbrCn(String ysdwcbrCn) {
        this.ysdwcbrCn = ysdwcbrCn;
    }
     
	@Column(name="FADD_QX_CN")
    public String getFaddQxCn() {
        return faddQxCn;
    }
 
    public void setFaddQxCn(String faddQxCn) {
        this.faddQxCn = faddQxCn;
    }
     
	@Column(name="FADD_JD_CN")
    public String getFaddJdCn() {
        return faddJdCn;
    }
 
    public void setFaddJdCn(String faddJdCn) {
        this.faddJdCn = faddJdCn;
    }
     
	@Column(name="AJSSJQ_CN")
    public String getAjssjqCn() {
        return ajssjqCn;
    }
 
    public void setAjssjqCn(String ajssjqCn) {
        this.ajssjqCn = ajssjqCn;
    }
     
	@Column(name="SSSQ_CN")
    public String getSssqCn() {
        return sssqCn;
    }
 
    public void setSssqCn(String sssqCn) {
        this.sssqCn = sssqCn;
    }
     
	@Column(name="SL_CJRY_CN")
    public String getSlCjryCn() {
        return slCjryCn;
    }
 
    public void setSlCjryCn(String slCjryCn) {
        this.slCjryCn = slCjryCn;
    }
     
	@Column(name="RESERVATION20")
    public String getReservation20() {
        return reservation20;
    }
 
    public void setReservation20(String reservation20) {
        this.reservation20 = reservation20;
    }
     
	@Column(name="RESERVATION33")
    public String getReservation33() {
        return reservation33;
    }
 
    public void setReservation33(String reservation33) {
        this.reservation33 = reservation33;
    }
     
	@Column(name="ESERVATION34")
    public String getEservation34() {
        return eservation34;
    }
 
    public void setEservation34(String eservation34) {
        this.eservation34 = eservation34;
    }
     
	@Column(name="L_CLJG_CN")
    public String getLCljgCn() {
        return lCljgCn;
    }
 
    public void setLCljgCn(String lCljgCn) {
        this.lCljgCn = lCljgCn;
    }
     
	@Column(name="SLJSDW_CN")
    public String getSljsdwCn() {
        return sljsdwCn;
    }
 
    public void setSljsdwCn(String sljsdwCn) {
        this.sljsdwCn = sljsdwCn;
    }
     
	@Column(name="SL_LRR_CN")
    public String getSlLrrCn() {
        return slLrrCn;
    }
 
    public void setSlLrrCn(String slLrrCn) {
        this.slLrrCn = slLrrCn;
    }
     
	@Column(name="RESERVATION05_CN")
    public String getReservation05Cn() {
        return reservation05Cn;
    }
 
    public void setReservation05Cn(String reservation05Cn) {
        this.reservation05Cn = reservation05Cn;
    }
     
	@Column(name="RESERVATION08_CN")
    public String getReservation08Cn() {
        return reservation08Cn;
    }
 
    public void setReservation08Cn(String reservation08Cn) {
        this.reservation08Cn = reservation08Cn;
    }
     
	@Column(name="RESERVATION09_CN")
    public String getReservation09Cn() {
        return reservation09Cn;
    }
 
    public void setReservation09Cn(String reservation09Cn) {
        this.reservation09Cn = reservation09Cn;
    }
     
	@Column(name="RESERVATION10_CN")
    public String getReservation10Cn() {
        return reservation10Cn;
    }
 
    public void setReservation10Cn(String reservation10Cn) {
        this.reservation10Cn = reservation10Cn;
    }
     
	@Column(name="DATASTATE")
    public String getDatastate() {
        return datastate;
    }
 
    public void setDatastate(String datastate) {
        this.datastate = datastate;
    }
     
	@Column(name="DATACHECK")
    public String getDatacheck() {
        return datacheck;
    }
 
    public void setDatacheck(String datacheck) {
        this.datacheck = datacheck;
    }
     
	@Column(name="QUERYID")
    public String getQueryid() {
        return queryid;
    }
 
    public void setQueryid(String queryid) {
        this.queryid = queryid;
    }
     
	@Column(name="DEPARTMENTCODE_CN")
    public String getDepartmentcodeCn() {
        return departmentcodeCn;
    }
 
    public void setDepartmentcodeCn(String departmentcodeCn) {
        this.departmentcodeCn = departmentcodeCn;
    }
     
	@Column(name="CREATOR_CN")
    public String getCreatorCn() {
        return creatorCn;
    }
 
    public void setCreatorCn(String creatorCn) {
        this.creatorCn = creatorCn;
    }
     
	@Column(name="LASTUPDATEDBY_CN")
    public String getLastupdatedbyCn() {
        return lastupdatedbyCn;
    }
 
    public void setLastupdatedbyCn(String lastupdatedbyCn) {
        this.lastupdatedbyCn = lastupdatedbyCn;
    }
     
	@Column(name="RESERVATION40")
    public Date getReservation40() {
        return reservation40;
    }
 
    public void setReservation40(Date reservation40) {
        this.reservation40 = reservation40;
    }
     
	@Column(name="RESERVATION39")
    public Date getReservation39() {
        return reservation39;
    }
 
    public void setReservation39(Date reservation39) {
        this.reservation39 = reservation39;
    }
     
	@Column(name="RESERVATION32")
    public String getReservation32() {
        return reservation32;
    }
 
    public void setReservation32(String reservation32) {
        this.reservation32 = reservation32;
    }
     
	@Column(name="RESERVATION31")
    public String getReservation31() {
        return reservation31;
    }
 
    public void setReservation31(String reservation31) {
        this.reservation31 = reservation31;
    }
     
	@Column(name="RESERVATION18")
    public String getReservation18() {
        return reservation18;
    }
 
    public void setReservation18(String reservation18) {
        this.reservation18 = reservation18;
    }
     
	@Column(name="RESERVATION17")
    public String getReservation17() {
        return reservation17;
    }
 
    public void setReservation17(String reservation17) {
        this.reservation17 = reservation17;
    }
     
	@Column(name="RESERVATION16")
    public String getReservation16() {
        return reservation16;
    }
 
    public void setReservation16(String reservation16) {
        this.reservation16 = reservation16;
    }
     
	@Column(name="RESERVATION15")
    public String getReservation15() {
        return reservation15;
    }
 
    public void setReservation15(String reservation15) {
        this.reservation15 = reservation15;
    }
     
	@Column(name="RESERVATION14")
    public String getReservation14() {
        return reservation14;
    }
 
    public void setReservation14(String reservation14) {
        this.reservation14 = reservation14;
    }
     
	@Column(name="RESERVATION13")
    public String getReservation13() {
        return reservation13;
    }
 
    public void setReservation13(String reservation13) {
        this.reservation13 = reservation13;
    }
     
	@Column(name="RESERVATION12")
    public String getReservation12() {
        return reservation12;
    }
 
    public void setReservation12(String reservation12) {
        this.reservation12 = reservation12;
    }
     
	@Column(name="RESERVATION11")
    public String getReservation11() {
        return reservation11;
    }
 
    public void setReservation11(String reservation11) {
        this.reservation11 = reservation11;
    }
     
	@Column(name="PJSJ")
    public Date getPjsj() {
        return pjsj;
    }
 
    public void setPjsj(Date pjsj) {
        this.pjsj = pjsj;
    }
     
	@Column(name="DDXCSJ")
    public Date getDdxcsj() {
        return ddxcsj;
    }
 
    public void setDdxcsj(Date ddxcsj) {
        this.ddxcsj = ddxcsj;
    }
     
	@Column(name="JQZBXX")
    public String getJqzbxx() {
        return jqzbxx;
    }
 
    public void setJqzbxx(String jqzbxx) {
        this.jqzbxx = jqzbxx;
    }
     
	@Column(name="RESERVATION19")
    public String getReservation19() {
        return reservation19;
    }
 
    public void setReservation19(String reservation19) {
        this.reservation19 = reservation19;
    }
     
	@Column(name="RESERVATION35")
    public String getReservation35() {
        return reservation35;
    }
 
    public void setReservation35(String reservation35) {
        this.reservation35 = reservation35;
    }
     
	@Column(name="ESERVATION36")
    public String getEservation36() {
        return eservation36;
    }
 
    public void setEservation36(String eservation36) {
        this.eservation36 = eservation36;
    }
     
	@Column(name="RESERVATION37")
    public Date getReservation37() {
        return reservation37;
    }
 
    public void setReservation37(Date reservation37) {
        this.reservation37 = reservation37;
    }
     
	@Column(name="RESERVATION38")
    public Date getReservation38() {
        return reservation38;
    }
 
    public void setReservation38(Date reservation38) {
        this.reservation38 = reservation38;
    }
     
	@Column(name="FLMJID")
    public String getFlmjid() {
        return flmjid;
    }
 
    public void setFlmjid(String flmjid) {
        this.flmjid = flmjid;
    }
     
	@Column(name="FLMJDW")
    public String getFlmjdw() {
        return flmjdw;
    }
 
    public void setFlmjdw(String flmjdw) {
        this.flmjdw = flmjdw;
    }
     
	@Column(name="SECTION")
    public String getSection() {
        return section;
    }
 
    public void setSection(String section) {
        this.section = section;
    }
     
	@Column(name="BJLY")
    public String getBjly() {
        return bjly;
    }
 
    public void setBjly(String bjly) {
        this.bjly = bjly;
    }
     
	@Column(name="BJDD")
    public String getBjdd() {
        return bjdd;
    }
 
    public void setBjdd(String bjdd) {
        this.bjdd = bjdd;
    }
     
	@Column(name="BJDH")
    public String getBjdh() {
        return bjdh;
    }
 
    public void setBjdh(String bjdh) {
        this.bjdh = bjdh;
    }
     
	@Column(name="SARS")
    public Integer getSars() {
        return sars;
    }
 
    public void setSars(Integer sars) {
        this.sars = sars;
    }
     
	@Column(name="SL_CLJG_CN")
    public String getSlCljgCn() {
        return slCljgCn;
    }
 
    public void setSlCljgCn(String slCljgCn) {
        this.slCljgCn = slCljgCn;
    }
     
}