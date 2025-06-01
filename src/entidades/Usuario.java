/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enums.Uf;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author junio
 */
public class Usuario {
    // ATRIBUTOS
    private int id;
    private String nome;
    private String rg;
    private String cpf;
    private char sexo;
    private Date nascimento;
    private String email;
    private String telefone;
    private String cep;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private Uf uf;// Enum
    private Login login; // Classe Login
    private List<Emprestimo> emprestimo = new ArrayList<Emprestimo>(); // lISTA DE EMPRÉSTIMOS
    
    
    // CONSTRUTORES
    public Usuario() {
    }

    public Usuario(int p_id, String p_nome, String p_rg, String p_cpf, char p_sexo, Date p_nascimento, String p_email, String p_telefone, String p_cep, String p_logradouro, String p_numero, String p_bairro, String p_cidade, Uf p_uf) {
        this.id = p_id;
        this.nome = p_nome;
        this.rg = p_rg;
        this.cpf = p_cpf;
        this.sexo = p_sexo;
        this.nascimento = p_nascimento;
        this.email = p_email;
        this.telefone = p_telefone;
        this.cep = p_cep;
        this.logradouro = p_logradouro;
        this.numero = p_numero;
        this.bairro = p_bairro;
        this.cidade = p_cidade;
        this.uf = p_uf;
    }

    // MÉTODOS
    // SETTERS
    public void setId(int p_id) {
        this.id = p_id;
    }

    public void setNome(String p_nome) {
        this.nome = p_nome;
    }

    public void setRg(String p_rg) {
        this.rg = p_rg;
    }

    public void setCpf(String p_cpf) {
        this.cpf = p_cpf;
    }

    public void setSexo(char p_sexo) {
        this.sexo = p_sexo;
    }

    public void setNascimento(Date p_nascimento) {
        this.nascimento = p_nascimento;
    }

    public void setEmail(String p_email) {
        this.email = p_email;
    }

    public void setTelefone(String p_telefone) {
        this.telefone = p_telefone;
    }

    public void setCep(String p_cep) {
        this.cep = p_cep;
    }

    public void setLogradouro(String p_logradouro) {
        this.logradouro = p_logradouro;
    }

    public void setNumero(String p_numero) {
        this.numero = p_numero;
    }

    public void setBairro(String p_bairro) {
        this.bairro = p_bairro;
    }

    public void setCidade(String p_cidade) {
        this.cidade = p_cidade;
    }

    public void setUf(Uf p_uf) {
        this.uf = p_uf;
    }

    public void setLogin(Login p_login) {
        this.login = p_login;
    }
    
    // GETTERS
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRg() {
        return this.rg;
    }

    public String getCpf() {
        return this.cpf;
    }

    public char getSexo() {
        return this.sexo;
    }

    public Date getNascimento() {
        return this.nascimento;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getCep() {
        return this.cep;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public Uf getUf() {
        return this.uf;
    }

    public Login getLogin() {
        return this.login;
    }
    
    public List<Emprestimo> getEmprestimo() {
        return this.emprestimo;
    }
    
    // MÉTODOS PERSONALIZADOS
    // ADICIONANDO EMPRESTIMO
    public void addEmprestimo(Emprestimo p_emprestimo){
        emprestimo.add(p_emprestimo);
    }
}
