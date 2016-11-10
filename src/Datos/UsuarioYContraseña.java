package Datos;

import java.io.Serializable;

public class UsuarioYContraseña implements Serializable {

    private String user;
    private String password;

    public UsuarioYContraseña(String usuario, String contraseña) {
        password = contraseña;
        user = usuario;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
