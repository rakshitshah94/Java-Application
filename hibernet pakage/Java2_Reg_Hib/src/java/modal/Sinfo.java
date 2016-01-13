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
@Table(name = "sinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sinfo.findAll", query = "SELECT s FROM Sinfo s"),
    @NamedQuery(name = "Sinfo.findBySid", query = "SELECT s FROM Sinfo s WHERE s.sid = :sid"),
    @NamedQuery(name = "Sinfo.findBySname", query = "SELECT s FROM Sinfo s WHERE s.sname = :sname"),
    @NamedQuery(name = "Sinfo.findBySmn", query = "SELECT s FROM Sinfo s WHERE s.smn = :smn")})
public class Sinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sid")
    private Integer sid;
    @Column(name = "sname")
    private String sname;
    @Column(name = "smn")
    private String smn;

    public Sinfo() {
    }

    public Sinfo(Integer sid) {
        this.sid = sid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
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
        if (!(object instanceof Sinfo)) {
            return false;
        }
        Sinfo other = (Sinfo) object;
        if ((this.sid == null && other.sid != null) || (this.sid != null && !this.sid.equals(other.sid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modal.Sinfo[ sid=" + sid + " ]";
    }
    
}
