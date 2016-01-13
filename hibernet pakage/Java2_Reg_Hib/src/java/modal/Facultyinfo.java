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
@Table(name = "facultyinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facultyinfo.findAll", query = "SELECT f FROM Facultyinfo f"),
    @NamedQuery(name = "Facultyinfo.findByFid", query = "SELECT f FROM Facultyinfo f WHERE f.fid = :fid"),
    @NamedQuery(name = "Facultyinfo.findByFname", query = "SELECT f FROM Facultyinfo f WHERE f.fname = :fname"),
    @NamedQuery(name = "Facultyinfo.findByFtech", query = "SELECT f FROM Facultyinfo f WHERE f.ftech = :ftech")})
public class Facultyinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "fid")
    private Integer fid;
    @Column(name = "fname")
    private String fname;
    @Column(name = "ftech")
    private String ftech;

    public Facultyinfo() {
    }

    public Facultyinfo(Integer fid) {
        this.fid = fid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFtech() {
        return ftech;
    }

    public void setFtech(String ftech) {
        this.ftech = ftech;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fid != null ? fid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facultyinfo)) {
            return false;
        }
        Facultyinfo other = (Facultyinfo) object;
        if ((this.fid == null && other.fid != null) || (this.fid != null && !this.fid.equals(other.fid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modal.Facultyinfo[ fid=" + fid + " ]";
    }
    
}
