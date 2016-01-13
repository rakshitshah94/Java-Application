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
@Table(name = "smaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Smaster.findAll", query = "SELECT s FROM Smaster s"),
    @NamedQuery(name = "Smaster.findBySid", query = "SELECT s FROM Smaster s WHERE s.sid = :sid"),
    @NamedQuery(name = "Smaster.findByUid", query = "SELECT s FROM Smaster s WHERE s.uid = :uid"),
    @NamedQuery(name = "Smaster.findBySname", query = "SELECT s FROM Smaster s WHERE s.sname = :sname"),
    @NamedQuery(name = "Smaster.findBySmn", query = "SELECT s FROM Smaster s WHERE s.smn = :smn")})
public class Smaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "sid")
    private Integer sid;
    @Basic(optional = false)
    @Column(name = "uid")
    private int uid;
    @Column(name = "sname")
    private String sname;
    @Column(name = "smn")
    private String smn;

    public Smaster() {
    }

    public Smaster(Integer sid) {
        this.sid = sid;
    }

    public Smaster(Integer sid, int uid) {
        this.sid = sid;
        this.uid = uid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSmn() {
        return smn;
    }

    public void setSmn(String smn) {
        this.smn = smn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sid != null ? sid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Smaster)) {
            return false;
        }
        Smaster other = (Smaster) object;
        if ((this.sid == null && other.sid != null) || (this.sid != null && !this.sid.equals(other.sid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modal.Smaster[ sid=" + sid + " ]";
    }
    
}
