/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author junio
 */
public class Autor {
    // ATRIBUTOS
    private int id;
    private String nome;
    private Date nascimento;
    private char sexo;
    private String email;
    private String nacionalidade;
    private String editora;
    private int numero_publicacoes;
    private int premios;
    private String especialidade;
    
    
    
    // CONSTRUTORES
    public Autor() {
    }

    public Autor(int p_id, String p_nome, Date p_nascimento, char p_sexo, String p_email, String p_nacionalidade, String p_editora, int p_numero_publicacoes, int p_premios, String p_especialidade) {
        this.id = p_id;
        this.nome = p_nome;
        this.nascimento = p_nascimento;
        this.sexo = p_sexo;
        this.email = p_email;
        this.nacionalidade = p_nacionalidade;
        this.editora = p_editora;
        this.numero_publicacoes = p_numero_publicacoes;
        this.premios = p_premios;
        this.especialidade = p_especialidade;
    }
    
    // MÉTODOS
    // SETTERS
    public void setId(int p_id) {
        this.id = p_id;
    }

    public void setNome(String p_nome) {
        this.nome = p_nome;
    }

    public void setNascimento(Date p_nascimento) {
        this.nascimento = p_nascimento;
    }

    public void setSexo(char p_sexo) {
        this.sexo = p_sexo;
    }

    public void setEmail(String p_email) {
        this.email = p_email;
    }

    public void setNacionalidade(String p_nacionalidade) {
        this.nacionalidade = p_nacionalidade;
    }

    public void setEditora(String p_editora) {
        this.editora = p_editora;
    }

    public void setNumero_publicacoes(int p_numero_publicacoes) {
        this.numero_publicacoes = p_numero_publicacoes;
    }

    public void setPremios(int p_premios) {
        this.premios = p_premios;
    }

    public void setEspecialidade(String p_especialidade) {
        this.especialidade = p_especialidade;
    }
    
    // GETTERS
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public Date getNascimento() {
        return this.nascimento;
    }

    public char getSexo() {
        return this.sexo;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public String getEditora() {
        return this.editora;
    }

    public int getNumero_publicacoes() {
        return this.numero_publicacoes;
    }

    public int getPremios() {
        return this.premios;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }   
}
