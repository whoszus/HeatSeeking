package cc.tinker.entity;

import javax.persistence.*;

/**
 * Created by Tinker on 2016/12/16.
 */
@Entity
@Table(name = "hs_authentication", schema = "heatseeking")
public class AuthenticationEntity {
    private int id;
    private Integer parase;
    private String clientName;
    private String password;
    private String token;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PARASE")
    public Integer getParase() {
        return parase;
    }

    public void setParase(Integer parase) {
        this.parase = parase;
    }

    @Basic
    @Column(name = "CLIENT_NAME")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Basic
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "TOKEN")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthenticationEntity that = (AuthenticationEntity) o;

        if (id != that.id) return false;
        if (parase != null ? !parase.equals(that.parase) : that.parase != null) return false;
        if (clientName != null ? !clientName.equals(that.clientName) : that.clientName != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (parase != null ? parase.hashCode() : 0);
        result = 31 * result + (clientName != null ? clientName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        return result;
    }
}
