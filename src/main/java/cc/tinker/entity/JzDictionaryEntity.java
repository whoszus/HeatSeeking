package cc.tinker.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Tinker on 2017/3/15.
 */
@Entity
@Table(name = "jz_dictionary", schema = "heatseeking")
public class JzDictionaryEntity {
    private Timestamp gzdbAddtime;
    private String dictionaryid;
    private String kind;
    private String code;
    private String supercode;
    private String detail;
    private String spell;
    private String homophony;
    private String frequencyinuse;
    private String wb;
    private String note;
    private String lastupdatedby;
    private Timestamp lastupdatedtime;
    private Timestamp refreshtime;
    private String downloadflag;
    private String reservation01;
    private String reservation02;
    private String reservation03;
    private String reservation04;
    private String reservation06;
    private String reservation07;
    private String reservation08;
    private String reservation09;
    private String reservation05;
    private String reservation010;
    private String deleteflag;
    private Integer rownum;


    @Transient
    public Integer getRownum() {
        return rownum;
    }

    public void setRownum(Integer rownum) {
        this.rownum = rownum;
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
    @Column(name = "DICTIONARYID")
    public String getDictionaryid() {
        return dictionaryid;
    }

    public void setDictionaryid(String dictionaryid) {
        this.dictionaryid = dictionaryid;
    }

    @Basic
    @Column(name = "KIND")
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Basic
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "SUPERCODE")
    public String getSupercode() {
        return supercode;
    }

    public void setSupercode(String supercode) {
        this.supercode = supercode;
    }

    @Basic
    @Column(name = "DETAIL")
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Basic
    @Column(name = "SPELL")
    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    @Basic
    @Column(name = "HOMOPHONY")
    public String getHomophony() {
        return homophony;
    }

    public void setHomophony(String homophony) {
        this.homophony = homophony;
    }

    @Basic
    @Column(name = "FREQUENCYINUSE")
    public String getFrequencyinuse() {
        return frequencyinuse;
    }

    public void setFrequencyinuse(String frequencyinuse) {
        this.frequencyinuse = frequencyinuse;
    }

    @Basic
    @Column(name = "WB")
    public String getWb() {
        return wb;
    }

    public void setWb(String wb) {
        this.wb = wb;
    }

    @Basic
    @Column(name = "NOTE")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
    @Column(name = "DOWNLOADFLAG")
    public String getDownloadflag() {
        return downloadflag;
    }

    public void setDownloadflag(String downloadflag) {
        this.downloadflag = downloadflag;
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
    @Column(name = "RESERVATION05")
    public String getReservation05() {
        return reservation05;
    }

    public void setReservation05(String reservation05) {
        this.reservation05 = reservation05;
    }

    @Basic
    @Column(name = "RESERVATION010")
    public String getReservation010() {
        return reservation010;
    }

    public void setReservation010(String reservation010) {
        this.reservation010 = reservation010;
    }

    @Basic
    @Column(name = "DELETEFLAG")
    public String getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JzDictionaryEntity that = (JzDictionaryEntity) o;

        if (gzdbAddtime != null ? !gzdbAddtime.equals(that.gzdbAddtime) : that.gzdbAddtime != null) return false;
        if (dictionaryid != null ? !dictionaryid.equals(that.dictionaryid) : that.dictionaryid != null) return false;
        if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (supercode != null ? !supercode.equals(that.supercode) : that.supercode != null) return false;
        if (detail != null ? !detail.equals(that.detail) : that.detail != null) return false;
        if (spell != null ? !spell.equals(that.spell) : that.spell != null) return false;
        if (homophony != null ? !homophony.equals(that.homophony) : that.homophony != null) return false;
        if (frequencyinuse != null ? !frequencyinuse.equals(that.frequencyinuse) : that.frequencyinuse != null)
            return false;
        if (wb != null ? !wb.equals(that.wb) : that.wb != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (lastupdatedby != null ? !lastupdatedby.equals(that.lastupdatedby) : that.lastupdatedby != null)
            return false;
        if (lastupdatedtime != null ? !lastupdatedtime.equals(that.lastupdatedtime) : that.lastupdatedtime != null)
            return false;
        if (refreshtime != null ? !refreshtime.equals(that.refreshtime) : that.refreshtime != null) return false;
        if (downloadflag != null ? !downloadflag.equals(that.downloadflag) : that.downloadflag != null) return false;
        if (reservation01 != null ? !reservation01.equals(that.reservation01) : that.reservation01 != null)
            return false;
        if (reservation02 != null ? !reservation02.equals(that.reservation02) : that.reservation02 != null)
            return false;
        if (reservation03 != null ? !reservation03.equals(that.reservation03) : that.reservation03 != null)
            return false;
        if (reservation04 != null ? !reservation04.equals(that.reservation04) : that.reservation04 != null)
            return false;
        if (reservation06 != null ? !reservation06.equals(that.reservation06) : that.reservation06 != null)
            return false;
        if (reservation07 != null ? !reservation07.equals(that.reservation07) : that.reservation07 != null)
            return false;
        if (reservation08 != null ? !reservation08.equals(that.reservation08) : that.reservation08 != null)
            return false;
        if (reservation09 != null ? !reservation09.equals(that.reservation09) : that.reservation09 != null)
            return false;
        if (reservation05 != null ? !reservation05.equals(that.reservation05) : that.reservation05 != null)
            return false;
        if (reservation010 != null ? !reservation010.equals(that.reservation010) : that.reservation010 != null)
            return false;
        if (deleteflag != null ? !deleteflag.equals(that.deleteflag) : that.deleteflag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gzdbAddtime != null ? gzdbAddtime.hashCode() : 0;
        result = 31 * result + (dictionaryid != null ? dictionaryid.hashCode() : 0);
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (supercode != null ? supercode.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        result = 31 * result + (spell != null ? spell.hashCode() : 0);
        result = 31 * result + (homophony != null ? homophony.hashCode() : 0);
        result = 31 * result + (frequencyinuse != null ? frequencyinuse.hashCode() : 0);
        result = 31 * result + (wb != null ? wb.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (lastupdatedby != null ? lastupdatedby.hashCode() : 0);
        result = 31 * result + (lastupdatedtime != null ? lastupdatedtime.hashCode() : 0);
        result = 31 * result + (refreshtime != null ? refreshtime.hashCode() : 0);
        result = 31 * result + (downloadflag != null ? downloadflag.hashCode() : 0);
        result = 31 * result + (reservation01 != null ? reservation01.hashCode() : 0);
        result = 31 * result + (reservation02 != null ? reservation02.hashCode() : 0);
        result = 31 * result + (reservation03 != null ? reservation03.hashCode() : 0);
        result = 31 * result + (reservation04 != null ? reservation04.hashCode() : 0);
        result = 31 * result + (reservation06 != null ? reservation06.hashCode() : 0);
        result = 31 * result + (reservation07 != null ? reservation07.hashCode() : 0);
        result = 31 * result + (reservation08 != null ? reservation08.hashCode() : 0);
        result = 31 * result + (reservation09 != null ? reservation09.hashCode() : 0);
        result = 31 * result + (reservation05 != null ? reservation05.hashCode() : 0);
        result = 31 * result + (reservation010 != null ? reservation010.hashCode() : 0);
        result = 31 * result + (deleteflag != null ? deleteflag.hashCode() : 0);
        return result;
    }
}
