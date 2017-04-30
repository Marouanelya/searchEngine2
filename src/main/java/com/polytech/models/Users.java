package com.polytech.models;

import javax.persistence.*;

/**
 * Created by E.Marouane on 19/03/2017.
 */
@Entity
@Table(name = "users")
public class Users {

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "nom")
    private String nom;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private boolean enabled;

    public Users(){

    }

    public Users(String email, String prenom, String nom, String password, boolean enabled){
        this.setEmail(email);
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setPassword(password);
        this.setEnabled(enabled);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
