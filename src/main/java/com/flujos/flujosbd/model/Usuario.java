package com.flujos.flujosbd.model;


public class Usuario {

    private Integer fiusuario;
    private String fcnombre;
    private String fcpassword;

    public Usuario() {
    }

    public Usuario(Integer fiusuario, String fcnombre, String fcpassword) {
        this.fiusuario = fiusuario;
        this.fcnombre = fcnombre;
        this.fcpassword = fcpassword;
    }

    public Integer getFiusuario() {
        return fiusuario;
    }

    public void setFiusuario(Integer fiusuario) {
        this.fiusuario = fiusuario;
    }

    public String getFcnombre() {
        return fcnombre;
    }

    public void setFcnombre(String fcnombre) {
        this.fcnombre = fcnombre;
    }

    public String getFcpassword() {
        return fcpassword;
    }

    public void setFcpassword(String fcpassword) {
        this.fcpassword = fcpassword;
    }

    public void crearUsuario(Integer Fiusuario, String Fcpassword) {
    }

}
