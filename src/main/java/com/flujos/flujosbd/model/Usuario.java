package com.flujos.flujosbd.model;


public class Usuario {

    private Integer fiusuario;
    private String fcnombre;
    private String password;

    public Usuario() {
    }

    public Usuario(Integer fiusuario, String fcnombre, String password) {
        this.fiusuario = fiusuario;
        this.fcnombre = fcnombre;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void crearUsuario(Integer fiusuario, String password) {
    }
}
