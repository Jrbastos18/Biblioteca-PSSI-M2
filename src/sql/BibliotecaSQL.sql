-- ATIVIDADE 1 - M2 - PSSI

-- CRIANDO BANCO DE DADOS
CREATE DATABASE biblioteca;

-- ACESSANDO O BANCO DE DADOS
USE biblioteca;

-- CRIANDO TABELAS
CREATE TABLE autor(
	id INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(130) NOT NULL,
	nascimento DATE NOT NULL,
    sexo CHAR(1) NOT NULL,
    email VARCHAR(100),
    nacionalidade VARCHAR(100) NOT NULL,
    editora VARCHAR(100),
    numero_publicacoes INT,
    premios INT,
    especialidade VARCHAR(100),
    CONSTRAINT pk_autor_id PRIMARY KEY (id)
);

CREATE TABLE livro(
	id INT AUTO_INCREMENT NOT NULL,
    isbn VARCHAR(13) NOT NULL UNIQUE,
    titulo VARCHAR(255) NOT NULL,
    subtitulo VARCHAR(255),
    editora VARCHAR(100),
    ano INT NOT NULL,
    edicao VARCHAR(20),
    genero VARCHAR(50) NOT NULL,
    paginas INT NOT NULL, 
    statusLivro VARCHAR(15) NOT NULL CHECK(statusLivro = 'DISPONIVEL' OR statusLivro = 'INDISPONIVEL'),
	estado_livro VARCHAR(15) CHECK(estado_livro = 'NOVO' OR estado_livro = 'USADO' OR estado_livro = 'DANIFICADO'),
	id_autor INT,
    CONSTRAINT pk_livro_id PRIMARY KEY (id),
    CONSTRAINT fk_livro_autor_id FOREIGN KEY (id_autor) REFERENCES autor(id) ON UPDATE CASCADE ON DELETE NO ACTION 
);

CREATE TABLE usuario(
	id INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(150) NOT NULL,
    rg VARCHAR(13) NOT NULL UNIQUE,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    sexo CHAR(1) NOT NULL,
    nascimento DATE NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefone VARCHAR(15) NOT NULL,
    cep VARCHAR(9) NOT NULL,
    logradouro VARCHAR(150) NOT NULL,
    numero VARCHAR(20) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    uf CHAR(2) NOT NULL,
    CONSTRAINT pk_usuario_id PRIMARY KEY (id)
    );

CREATE TABLE emprestimo(
	id INT AUTO_INCREMENT NOT NULL,
    data_emprestimo DATE NOT NULL,
    data_devolucao DATE NOT NULL,
    data_devolucao_real DATE DEFAULT NULL,
    renovacao BOOLEAN DEFAULT 0,
    statusEmprestimo VARCHAR(15) NOT NULL CHECK(statusEmprestimo = 'EMPRESTADO' OR statusEmprestimo = 'DEVOLVIDO' OR statusEmprestimo = 'ATRASADO'),
	multa VARCHAR(30),
    estado_livro_inicial VARCHAR(15) CHECK(estado_livro_inicial = 'NOVO' OR estado_livro_inicial = 'USADO' OR estado_livro_inicial = 'DANIFICADO'),
	estado_livro_final VARCHAR(15) CHECK(estado_livro_final = 'NOVO' OR estado_livro_final = 'USADO' OR estado_livro_final = 'DANIFICADO'),
    id_usuario INT NOT NULL,
    id_livro INT NOT NULL,
    CONSTRAINT pk_emprestimo_id PRIMARY KEY (id),
    CONSTRAINT fk_emprestimo_usuario_id FOREIGN KEY (id_usuario) REFERENCES usuario(id) ON UPDATE CASCADE ON DELETE NO ACTION,
    CONSTRAINT fk_emprestimo_livro_id FOREIGN KEY (id_livro) REFERENCES livro(id) ON UPDATE CASCADE ON DELETE NO ACTION
);

CREATE TABLE login(
	id INT AUTO_INCREMENT NOT NULL,
    username VARCHAR(50) UNIQUE,
    senha VARCHAR(32),
    id_usuario INT,
    CONSTRAINT pk_login_id PRIMARY KEY (id),
    CONSTRAINT fk_login_usuario_id FOREIGN KEY (id_usuario) REFERENCES usuario(id) ON UPDATE CASCADE ON DELETE CASCADE
);

-- CRIANDO USUARIO ADMIN E LOGIN ADMIN
INSERT INTO usuario (nome, rg, cpf, sexo, nascimento, email, telefone, cep, logradouro, numero, bairro, cidade, uf)
VALUES ('admin', '0000000000', '00000000000', 'M', '2000-01-01', 'admin@biblioteca.com', '00000000000', '0000000', 'XXXXX', 'XX', 'XXXX', 'XXXX', 'SP');

INSERT INTO login (username, senha, id_usuario)
VALUES ('admin', MD5('adminaez123'), 1);


SET SQL_SAFE_UPDATES = 0; -- DESABILITA O MODO SAFE UPDATE DO WORBENCH
-- EVENTO PROGRAMADO QUE VERIFICA 1 VEZ POR DIA SE HÁ ALGUM EMPRÉSTIMO COM DATA INFERIOR A DATA ATUAL
-- ATUALIZANDO O STATUS DE EMPRESTADO PARA ATRASADO
CREATE EVENT IF NOT EXISTS atualizar_emprestimos_atrasados
ON SCHEDULE EVERY 1 DAY
STARTS CURRENT_TIMESTAMP
DO
    UPDATE emprestimo
    SET statusEmprestimo = 'ATRASADO'
    WHERE data_devolucao < CURRENT_DATE() AND statusEmprestimo NOT IN ('DEVOLVIDO', 'ATRASADO');

SET GLOBAL event_scheduler = ON; -- HABILITA O EVENT_SCHEDULER, CASO ESTEJA DESABILITADO


-- INSERÇÃO DE LIVRO COMO INDISPONÍVEL NO STATUS PARA TESTES DE READ E UPDATE
INSERT INTO livro (isbn, titulo, ano, genero, paginas, statusLivro, estado_livro, id_autor) 
VALUES ('12312312', 'teste', 2020, 'Técnico', 639, 'INDISPONIVEL', 'NOVO', 1);

SELECT * FROM usuario;
SELECT * FROM login;
SELECT * FROM autor;
SELECT * FROM livro;
SELECT * FROM emprestimo;

