/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enums.EstadoLivro;
import enums.StatusLivro;

/**
 *
 * @author junio
 */
public class Livro {
    // ATRIBUTOS
    private int id;
    private String isbn;
    private String titulo;
    private String subtitulo;
    private String editora;
    private int ano;
    private String edicao;
    private String genero;
    private int paginas;
    // Enum
    private StatusLivro statusLivro;
    private EstadoLivro estadoLivro;
    // Autor
    private String autor;
    
    // CONSTRUTORES
    public Livro() {
    }

    public Livro(int p_id, String p_isbn, String p_titulo, String p_subtitulo, String p_editora, int p_ano, String p_edicao, String p_genero, int p_paginas, StatusLivro p_statusLivro, String p_autor) {
        this.id = p_id;
        this.isbn = p_isbn;
        this.titulo = p_titulo;
        this.subtitulo = p_subtitulo;
        this.editora = p_editora;
        this.ano = p_ano;
        this.edicao = p_edicao;
        this.genero = p_genero;
        this.paginas = p_paginas;
        this.statusLivro = p_statusLivro;
        this.autor = p_autor;
    }
    
    // MÉTODOS
    // SETTERS
    public void setId(int p_id) {
        this.id = p_id;
    }

    public void setIsbn(String p_isbn) {
        this.isbn = p_isbn;
    }

    public void setTitulo(String p_titulo) {
        this.titulo = p_titulo;
    }

    public void setSubtitulo(String p_subtitulo) {
        this.subtitulo = p_subtitulo;
    }

    public void setEditora(String p_editora) {
        this.editora = p_editora;
    }

    public void setAno(int p_ano) {
        this.ano = p_ano;
    }

    public void setEdicao(String p_edicao) {
        this.edicao = p_edicao;
    }

    public void setGenero(String p_genero) {
        this.genero = p_genero;
    }

    public void setPaginas(int p_paginas) {
        this.paginas = p_paginas;
    }

    public void setStatusLivro(StatusLivro p_statusLivro) {
        this.statusLivro = p_statusLivro;
    }

    public void setAutor(String p_autor) {
        this.autor = p_autor;
    }

    public void setEstadoLivro(EstadoLivro p_estadoLivro) {
        this.estadoLivro = p_estadoLivro;
    }
    
    // GETTERS
    public int getId() {
        return this.id;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getSubtitulo() {
        return this.subtitulo;
    }

    public String getEditora() {
        return this.editora;
    }

    public int getAno() {
        return this.ano;
    }

    public String getEdicao() {
        return this.edicao;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public StatusLivro getStatusLivro() {
        return this.statusLivro;
    }

    public String getAutor() {
        return this.autor;
    }

    public EstadoLivro getEstadoLivro() {
        return this.estadoLivro;
    }
}
