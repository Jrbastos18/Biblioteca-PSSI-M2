<h1>SISTEMA DE GERENCIAMENTO DE BIBLIOTECA</h1>

<h2>Descrição</h2>
<p>Projeto de gerenciamento de biblioteca elaborado como projeto final para a disciplina: Projeto de Software e Segurança da Informação do curso de Análise e Desenvolvimento de Sistemas pela UMC - Universidade de Mogi das Cruzes.</p>
<p>Este projeto tem como objetivo o desenvolvimento de um sistema de gerenciamento de biblioteca virtual utilizando a linguagem Java com interface gráfica Swing e banco de dados MySQL. A aplicação permite o controle completo de usuários, autores, livros e empréstimos, com funcionalidades como cadastro, edição, exclusão, autenticação por login e acompanhamento do status de livros emprestados. O sistema conta com um modelo de banco de dados relacional bem estruturado, entidades organizadas em camadas, uso de enums para controle de estados e status, além de um agendador de eventos no MySQL que atualiza automaticamente o status de empréstimos vencidos. A interface é dividida em múltiplas telas (frames) que tornam o uso intuitivo e funcional. </p>

<h2>Índice</h2>
<ol>
    <li><a href="#MER">Modelagem de Banco de Dados Relacional</a></li>
      <ol>
          <li><a href="#Conceitual">Diagrama Entidade-Relacionamento (Modelo Conceitual)</a></li>
          <li><a href="#Logico">Diagrama Entidade-Relacionamento (Modelo Lógico)</a></li>
      </ol>   
</ol>

<h2>1.Modelagem de Banco de Dados Relacional</h2>
<a name="MER"></a>
<h3>i. Diagrama Entidade-Relacionamento (Modelo Conceitual)</h3>
<a name="Conceitual"></a>
<img src="https://github.com/Jrbastos18/Biblioteca-PSSI-M2/blob/main/src/sql/ConceitualBiblioteca1.png?raw=true" alt="DER - Diagrama de Entidade-Relacionamento Conceitual">

<h3>i. Diagrama Entidade-Relacionamento (Modelo Lógico)</h3>
<a name="Logico"></a>
<img src="https://github.com/Jrbastos18/Biblioteca-PSSI-M2/blob/main/src/sql/LogicoBiblioteca2.png?raw=true" alt="DER - Diagrama de Entidade-Relacionamento Lógico">
