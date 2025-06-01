/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author junio
 */
public class Login {
    // ATRIBUTOS
    private String usuario;
    private String senha;
    
    // CONSTRUTORES
    public Login() {
    }
 
    public Login(String p_usuario, String p_senha) {
        this.usuario = p_usuario;
        this.senha = p_senha;
    }
    
    // MÉTODOS
    // SETTERS
    public void setUsuario(String p_usuario) {
        this.usuario = p_usuario;
    }

    public void setSenha(String p_senha) {
        this.senha = p_senha;
    }
    
    // GETTERS
    public String getUsuario() {
        return this.usuario;
    }

    public String getSenha() {
        return this.senha;
    }
    
}
