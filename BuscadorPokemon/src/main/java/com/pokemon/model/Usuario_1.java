/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pokemon.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aprendiz
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario_1.findAll", query = "SELECT u FROM Usuario_1 u"),
    @NamedQuery(name = "Usuario_1.findById", query = "SELECT u FROM Usuario_1 u WHERE u.id = :id"),
    @NamedQuery(name = "Usuario_1.findByNombreCompleto", query = "SELECT u FROM Usuario_1 u WHERE u.nombreCompleto = :nombreCompleto"),
    @NamedQuery(name = "Usuario_1.findByTipoDocumento", query = "SELECT u FROM Usuario_1 u WHERE u.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Usuario_1.findByDocumento", query = "SELECT u FROM Usuario_1 u WHERE u.documento = :documento"),
    @NamedQuery(name = "Usuario_1.findByFechaNacimiento", query = "SELECT u FROM Usuario_1 u WHERE u.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Usuario_1.findByCorreo", query = "SELECT u FROM Usuario_1 u WHERE u.correo = :correo"),
    @NamedQuery(name = "Usuario_1.findByNumeroCelular", query = "SELECT u FROM Usuario_1 u WHERE u.numeroCelular = :numeroCelular"),
    @NamedQuery(name = "Usuario_1.findByUbicacion", query = "SELECT u FROM Usuario_1 u WHERE u.ubicacion = :ubicacion"),
    @NamedQuery(name = "Usuario_1.findByPolitica", query = "SELECT u FROM Usuario_1 u WHERE u.politica = :politica")})
public class Usuario_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @Column(name = "tipo_documento")
    private String tipoDocumento;
    @Column(name = "documento")
    private String documento;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "correo")
    private String correo;
    @Column(name = "numero_celular")
    private String numeroCelular;
    @Column(name = "ubicacion")
    private String ubicacion;
    @Column(name = "politica")
    private Boolean politica;
    @OneToMany(mappedBy = "usuarioId")
    private Collection<Mochila> mochilaCollection;

    public Usuario_1() {
    }

    public Usuario_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Boolean getPolitica() {
        return politica;
    }

    public void setPolitica(Boolean politica) {
        this.politica = politica;
    }

    public Collection<Mochila> getMochilaCollection() {
        return mochilaCollection;
    }

    public void setMochilaCollection(Collection<Mochila> mochilaCollection) {
        this.mochilaCollection = mochilaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario_1)) {
            return false;
        }
        Usuario_1 other = (Usuario_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pokemon.model.Usuario_1[ id=" + id + " ]";
    }
    
}
