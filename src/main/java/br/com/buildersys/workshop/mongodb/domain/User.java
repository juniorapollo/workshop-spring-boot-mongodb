
package br.com.buildersys.workshop.mongodb.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author daniel
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String nome;
    private String email;
    
    public User(){}

    public User(String id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    
    //Getter e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
