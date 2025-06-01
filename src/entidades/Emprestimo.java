/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enums.EstadoLivro;
import enums.StatusEmprestimo;
import java.time.LocalDate;

/**
 *
 * @author junio
 */
public class Emprestimo {
    // ATRIBUTOS
    private int id;
    private LocalDate data_emprestimo;
    private LocalDate data_devolucao;
    private LocalDate data_devolucao_real;
    private boolean renovacao; // 0 = Não e 1 = Sim - com verificação se o estado não está como ATRASADO
    private StatusEmprestimo statusEmprestimo; // Enum
    private int id_livro; // Classe Livro
    private int id_usuario; // Classe Usuario
    private String multa;
    private EstadoLivro estado_livro_incial; // Enum 
    private EstadoLivro estado_livro_final; // Enum
    
    // CONSTRUTORES
    public Emprestimo() {
    }

    public Emprestimo(int p_id, LocalDate p_data_emprestimo, LocalDate p_data_devolucao, LocalDate p_data_devolucao_real, boolean p_renovacao, StatusEmprestimo p_statusEmprestimo, int p_id_livro, int p_id_usuario, String p_multa, EstadoLivro p_estado_livro_incial, EstadoLivro p_estado_livro_final) {
        this.id = p_id;
        this.data_emprestimo = p_data_emprestimo;
        this.data_devolucao = p_data_devolucao;
        this.data_devolucao_real = p_data_devolucao_real;
        this.renovacao = p_renovacao;
        this.statusEmprestimo = p_statusEmprestimo;
        this.id_livro = p_id_livro;
        this.id_usuario = p_id_usuario;
        this.multa = p_multa;
        this.estado_livro_incial = p_estado_livro_incial;
        this.estado_livro_final = p_estado_livro_final;
    }
    
    // MÉTODOS
    // SETTER 
    public void setId(int p_id) {
        this.id = p_id;
    }

    public void setData_emprestimo(LocalDate p_data_emprestimo) {
        this.data_emprestimo = p_data_emprestimo;
    }

    public void setData_devolucao(LocalDate p_data_devolucao) {
        this.data_devolucao = p_data_devolucao;
    }

    public void setData_devolucao_real(LocalDate p_data_devolucao_real) {
        this.data_devolucao_real = p_data_devolucao_real;
    }

    public void setRenovacao(boolean p_renovacao) {
        this.renovacao = p_renovacao;
    }

    public void setStatusEmprestimo(StatusEmprestimo p_statusEmprestimo) {
        this.statusEmprestimo = p_statusEmprestimo;
    }

    public void setLivro(int p_id_livro) {
        this.id_livro = p_id_livro;
    }

    public void setUsuario(int p_id_usuario) {
        this.id_usuario = p_id_usuario;
    }

    public void setMulta(String p_multa) {
        this.multa = p_multa;
    }

    public void setEstado_livro_incial(EstadoLivro p_estado_livro_incial) {
        this.estado_livro_incial = p_estado_livro_incial;
    }

    public void setEstado_livro_final(EstadoLivro p_estado_livro_final) {
        this.estado_livro_final = p_estado_livro_final;
    }
    
    // GETTERS
    public int getId() {
        return this.id;
    }

    public LocalDate getData_emprestimo() {
        return this.data_emprestimo;
    }

    public LocalDate getData_devolucao() {
        return this.data_devolucao;
    }

    public LocalDate getData_devolucao_real() {
        return this.data_devolucao_real;
    }

    public boolean getRenovacao() {
        return this.renovacao;
    }

    public StatusEmprestimo getStatusEmprestimo() {
        return this.statusEmprestimo;
    }

    public int getLivro() {
        return this.id_livro;
    }

    public int getUsuario() {
        return this.id_usuario;
    }

    public String getMulta() {
        return this.multa;
    }

    public EstadoLivro getEstado_livro_incial() {
        return this.estado_livro_incial;
    }

    public EstadoLivro getEstado_livro_final() {
        return this.estado_livro_final;
    }  
}
