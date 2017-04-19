package cc.tinker.entity;

import javax.persistence.*;

/**
 * Created by whoszus on 2017/4/11.
 *
 * @email whoszus@yahoo.com
 */
@Entity
@Table(name = "redsword_rsa_key")
public class RedswordRsaKeyEntity {
    private Integer id;
    private String rsaPublicKey;
    private String rsaPrivateKey;
    private Integer isDeleted;
    private Integer keyHolder;

    @Id
    @Column(name = "ID", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "RSA_PUBLIC_KEY", nullable = true, length = 1024)
    public String getRsaPublicKey() {
        return rsaPublicKey;
    }

    public void setRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey;
    }

    @Basic
    @Column(name = "RSA_PRIVATE_KEY", nullable = true, length = 2048)
    public String getRsaPrivateKey() {
        return rsaPrivateKey;
    }

    public void setRsaPrivateKey(String rsaPrivateKey) {
        this.rsaPrivateKey = rsaPrivateKey;
    }

    @Basic
    @Column(name = "IS_DELETED", nullable = true)
    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Basic
    @Column(name = "KEY_HOLDER", nullable = true)
    public Integer getKeyHolder() {
        return keyHolder;
    }

    public void setKeyHolder(Integer keyHolder) {
        this.keyHolder = keyHolder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RedswordRsaKeyEntity that = (RedswordRsaKeyEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (rsaPublicKey != null ? !rsaPublicKey.equals(that.rsaPublicKey) : that.rsaPublicKey != null) return false;
        if (rsaPrivateKey != null ? !rsaPrivateKey.equals(that.rsaPrivateKey) : that.rsaPrivateKey != null)
            return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
        if (keyHolder != null ? !keyHolder.equals(that.keyHolder) : that.keyHolder != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (rsaPublicKey != null ? rsaPublicKey.hashCode() : 0);
        result = 31 * result + (rsaPrivateKey != null ? rsaPrivateKey.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (keyHolder != null ? keyHolder.hashCode() : 0);
        return result;
    }
}
