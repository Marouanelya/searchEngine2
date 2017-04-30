package com.polytech.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by E.Marouane on 06/04/2017.
 */
@Entity
@Table(name = "authorities")
public class Authority {

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "authority")
    private String authority;


    public Authority(){

    }

    public Authority(String email, String authority){
        this.email = email;
        this.authority = authority;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}

