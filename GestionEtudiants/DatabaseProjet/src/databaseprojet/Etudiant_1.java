/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseprojet;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author El Mysto
 */
@Entity
@Table(name = "ETUDIANT", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Etudiant_1.findAll", query = "SELECT e FROM Etudiant_1 e")
    , @NamedQuery(name = "Etudiant_1.findByMatriculeEtu", query = "SELECT e FROM Etudiant_1 e WHERE e.matriculeEtu = :matriculeEtu")
    , @NamedQuery(name = "Etudiant_1.findByNomEtu", query = "SELECT e FROM Etudiant_1 e WHERE e.nomEtu = :nomEtu")
    , @NamedQuery(name = "Etudiant_1.findByPrenomEtu", query = "SELECT e FROM Etudiant_1 e WHERE e.prenomEtu = :prenomEtu")
    , @NamedQuery(name = "Etudiant_1.findByDateNaissance", query = "SELECT e FROM Etudiant_1 e WHERE e.dateNaissance = :dateNaissance")
    , @NamedQuery(name = "Etudiant_1.findByAdresse", query = "SELECT e FROM Etudiant_1 e WHERE e.adresse = :adresse")})
public class Etudiant_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "MATRICULE_ETU")
    private BigDecimal matriculeEtu;
    @Basic(optional = false)
    @Column(name = "NOM_ETU")
    private String nomEtu;
    @Basic(optional = false)
    @Column(name = "PRENOM_ETU")
    private String prenomEtu;
    @Basic(optional = false)
    @Column(name = "DATE_NAISSANCE")
    private String dateNaissance;
    @Column(name = "ADRESSE")
    private String adresse;

    public Etudiant_1() {
    }

    public Etudiant_1(BigDecimal matriculeEtu) {
        this.matriculeEtu = matriculeEtu;
    }

    public Etudiant_1(BigDecimal matriculeEtu, String nomEtu, String prenomEtu, String dateNaissance) {
        this.matriculeEtu = matriculeEtu;
        this.nomEtu = nomEtu;
        this.prenomEtu = prenomEtu;
        this.dateNaissance = dateNaissance;
    }

    public BigDecimal getMatriculeEtu() {
        return matriculeEtu;
    }

    public void setMatriculeEtu(BigDecimal matriculeEtu) {
        BigDecimal oldMatriculeEtu = this.matriculeEtu;
        this.matriculeEtu = matriculeEtu;
        changeSupport.firePropertyChange("matriculeEtu", oldMatriculeEtu, matriculeEtu);
    }

    public String getNomEtu() {
        return nomEtu;
    }

    public void setNomEtu(String nomEtu) {
        String oldNomEtu = this.nomEtu;
        this.nomEtu = nomEtu;
        changeSupport.firePropertyChange("nomEtu", oldNomEtu, nomEtu);
    }

    public String getPrenomEtu() {
        return prenomEtu;
    }

    public void setPrenomEtu(String prenomEtu) {
        String oldPrenomEtu = this.prenomEtu;
        this.prenomEtu = prenomEtu;
        changeSupport.firePropertyChange("prenomEtu", oldPrenomEtu, prenomEtu);
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        String oldDateNaissance = this.dateNaissance;
        this.dateNaissance = dateNaissance;
        changeSupport.firePropertyChange("dateNaissance", oldDateNaissance, dateNaissance);
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        String oldAdresse = this.adresse;
        this.adresse = adresse;
        changeSupport.firePropertyChange("adresse", oldAdresse, adresse);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matriculeEtu != null ? matriculeEtu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etudiant_1)) {
            return false;
        }
        Etudiant_1 other = (Etudiant_1) object;
        if ((this.matriculeEtu == null && other.matriculeEtu != null) || (this.matriculeEtu != null && !this.matriculeEtu.equals(other.matriculeEtu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "databaseprojet.Etudiant_1[ matriculeEtu=" + matriculeEtu + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
