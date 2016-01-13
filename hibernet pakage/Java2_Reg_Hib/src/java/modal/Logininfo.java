/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author master
 */
@Entity
@Table(name = "logininfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logininfo.findAll", query = "SELECT l FROM Logininfo l"),
    @NamedQuery(name = "Logininfo.findByUid", query = "SELECT l FROM Logininfo l WHERE l.uid = :uid"),
    @NamedQuery(name = "Logininfo.findByUname", query = "SELECT l FROM Logininfo l WHERE l.uname = :uname"),
    @NamedQuery(name = "Logininfo.findByPwd", query = "SELECT l FROM Logininfo l WHERE l.pwd = :pwd"),
    @NamedQuery(name = "Logininfo.findByRole", query = "SELECT l FROM Logininfo l WHERE l.role = :role")})
public class Logininfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "uid")
    private Integer uid;
    @Column(name = "uname")
    private String uname;
    @Column(name = "pwd")
    private String pwd;
    @Column(name = "role")
    private String role;

    public Logininfo() {
    }

    public Logininfo(Integer uid) {
        this.uid = uid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uid != null ? uid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Logininfo)) {
            return false;
        }
        Logininfo other = (Logininfo) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modal.Logininfo[ uid=" + uid + " ]";
    }
    
}
