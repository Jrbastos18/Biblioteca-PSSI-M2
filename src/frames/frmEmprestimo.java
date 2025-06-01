/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import entidades.Emprestimo;
import entidades.Livro;
import enums.EstadoLivro;
import enums.StatusEmprestimo;
import enums.StatusLivro;
import enums.Uf;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import swingCustom.EventSwitchSelected;
import java.sql.*;
import java.time.Instant;
import java.time.LocalDate;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DateFormatter;

/**
 *
 * @author junio
 */
public final class frmEmprestimo extends javax.swing.JFrame {

    /**
     * Creates new form frmUsuario
     */
    Emprestimo emprestimo = new Emprestimo();;
    private int id_usuario;
    private Integer id_livro;
    // MODELO DA TABELA
    DefaultTableModel model = new DefaultTableModel();
    
    
    public frmEmprestimo() {
        initComponents();

        //carregarUsuario(); // CARREGA USUÁRIO E PREENCHE SEU NOME NA JFIELDTEXT USUÁRIO, POIS SÓ PODE SER FEITO EMPRÉSTIMO PELO USUÁRIO ATUAL LOGADO 
        metadadosTabelaLivro(); // CARREGA METADADOS DA TABELA LIVRO AO INICIAR O FORM
        metadadosTabelaEmprestimo(); // CARREGA METADADOS DA TABELA EMPRESTIMO AO INICIAR O FORM
          
        TitledBorder tbEstadoLivroInicial = BorderFactory.createTitledBorder("Estado Inicial do Livro");
        tbEstadoLivroInicial.setTitleFont(new java.awt.Font("Segoe UI", 1, 12));
        
        TitledBorder tbEstadoLivroFinal = BorderFactory.createTitledBorder("Estado Final do Livro");
        tbEstadoLivroFinal.setTitleFont(new java.awt.Font("Segoe UI", 1, 12));
       
        // EVENTO PERSONALIZADO PARA SWITCHBUTTON PARA MODO LIGHT E MODO DARK
        switchButton1.addEventSelected(new EventSwitchSelected() {
            @Override
            public void onSelected(boolean selected) {
                if (selected == true){
                    jPanel1.setBackground(Color.decode("#001939"));
                    jPanel3.setBackground(Color.decode("#001939"));                   
                    jPanel4.setBackground(Color.decode("#001939"));                   
                    
                    tbEstadoLivroInicial.setTitleColor(Color.WHITE);
                    jPanel3.setBorder(tbEstadoLivroInicial);

                    jRadioButton3.setBackground(Color.decode("#001939"));
                    jRadioButton3.setForeground(Color.WHITE);
                    jRadioButton4.setBackground(Color.decode("#001939"));
                    jRadioButton4.setForeground(Color.WHITE);
                    jRadioButton5.setBackground(Color.decode("#001939"));
                    jRadioButton5.setForeground(Color.WHITE);
                    
                    tbEstadoLivroInicial.setTitleColor(Color.WHITE);
                    jPanel4.setBorder(tbEstadoLivroInicial);

                    jRadioButton6.setBackground(Color.decode("#001939"));
                    jRadioButton6.setForeground(Color.WHITE);
                    jRadioButton7.setBackground(Color.decode("#001939"));
                    jRadioButton7.setForeground(Color.WHITE);
                    jRadioButton8.setBackground(Color.decode("#001939"));
                    jRadioButton8.setForeground(Color.WHITE);
                    
                    jLabel2.setForeground(Color.WHITE);
                    jLabel3.setForeground(Color.WHITE);
                    jLabel4.setForeground(Color.WHITE);
                    jLabel6.setForeground(Color.WHITE);
                    jLabel5.setForeground(Color.WHITE);
                    jLabel7.setForeground(Color.WHITE);
                    jLabel8.setForeground(Color.WHITE);
                    jLabel13.setForeground(Color.WHITE);
                    jLabel14.setForeground(Color.WHITE);
                    jLabel15.setForeground(Color.WHITE);
                    jLabel26.setForeground(Color.WHITE);
                    jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sol_white.png")));
                    jLabel27.setForeground(Color.WHITE);
                    jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lua_white.png")));
                    
                }
                else {
                    jPanel1.setBackground(new Color(153, 204, 255));
                    jPanel3.setBackground(new Color(153, 204, 255));
                    jPanel4.setBackground(new Color(153, 204, 255));
                    
                    tbEstadoLivroInicial.setTitleColor(Color.BLACK);
                    jPanel3.setBorder(tbEstadoLivroInicial);

                    jRadioButton3.setBackground(new Color(153, 204, 255));
                    jRadioButton3.setForeground(Color.BLACK);
                    jRadioButton4.setBackground(new Color(153, 204, 255));
                    jRadioButton4.setForeground(Color.BLACK);
                    jRadioButton5.setBackground(new Color(153, 204, 255));
                    jRadioButton5.setForeground(Color.BLACK);
                    
                    tbEstadoLivroInicial.setTitleColor(Color.BLACK);
                    jPanel4.setBorder(tbEstadoLivroInicial);

                    jRadioButton6.setBackground(new Color(153, 204, 255));
                    jRadioButton6.setForeground(Color.BLACK);
                    jRadioButton7.setBackground(new Color(153, 204, 255));
                    jRadioButton7.setForeground(Color.BLACK);
                    jRadioButton8.setBackground(new Color(153, 204, 255));
                    jRadioButton8.setForeground(Color.BLACK);
                    
                    jLabel2.setForeground(Color.BLACK);
                    jLabel3.setForeground(Color.BLACK);
                    jLabel4.setForeground(Color.BLACK);
                    jLabel6.setForeground(Color.BLACK);
                    jLabel5.setForeground(Color.BLACK);
                    jLabel7.setForeground(Color.BLACK);
                    jLabel8.setForeground(Color.BLACK);
                    jLabel13.setForeground(Color.BLACK);
                    jLabel14.setForeground(Color.BLACK);
                    jLabel15.setForeground(Color.BLACK);
                    jLabel26.setForeground(Color.BLACK);
                    jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sol.png")));
                    jLabel27.setForeground(Color.BLACK);
                    jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lua.png")));                   
                }
            }
        }
        );
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2_EstadoFinalLivro = new javax.swing.ButtonGroup();
        buttonGroup1_EstadoInicialLivro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        switchButton1 = new swingCustom.SwitchButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autor");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sol.png"))); // NOI18N
        jLabel26.setText("Light");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lua.png"))); // NOI18N
        jLabel27.setText("Dark");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setText("Status:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save_Black_18x18.png"))); // NOI18N
        jButton1.setText("Salvar Empréstimo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Refresh_Black_18x18.png"))); // NOI18N
        jButton4.setText("Renovar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Book_Return_Black_16x16.png"))); // NOI18N
        jButton5.setText("Devolver Livro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BibliotecaHorizontalMenor.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setText("Empréstimo");

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Home_Black_16x16.png"))); // NOI18N
        jButton2.setText("Voltar a Tela Inicial");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_Black.png"))); // NOI18N
        jButton3.setText("Buscar Empréstimo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cancel_Black.png"))); // NOI18N
        jButton6.setText("Limpar Dados");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Book_Black.png"))); // NOI18N
        jButton7.setText("Listar Livros");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID: ");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTabbedPane1.addTab("Empréstimos", jScrollPane2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("Livros", jScrollPane1);

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Approval_Delegation_Black.png"))); // NOI18N
        jButton8.setText("Listar Empréstimos");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Usuário:");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Livro:");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Data Empréstimo:");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setEnabled(false);
        jFormattedTextField1.setFocusable(false);
        jFormattedTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Data Devolução:");

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setEnabled(false);
        jFormattedTextField2.setFocusable(false);
        jFormattedTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Data Devolução Real:");

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField3.setFocusable(false);
        jFormattedTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Status:");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField4.setEnabled(false);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado Inicial do Livro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jRadioButton3.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1_EstadoInicialLivro.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton3.setText("Novo");

        jRadioButton4.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1_EstadoInicialLivro.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton4.setText("Usado");

        jRadioButton5.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1_EstadoInicialLivro.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton5.setText("Danificado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado Final do Livro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jRadioButton6.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup2_EstadoFinalLivro.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton6.setText("Novo");

        jRadioButton7.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup2_EstadoFinalLivro.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton7.setText("Usado");

        jRadioButton8.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup2_EstadoFinalLivro.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton8.setText("Danificado");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton8))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(switchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(7, 7, 7))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(switchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6)
                    .addComponent(jButton2)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Empréstimos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // SETA, CARREGA USUÁRIO E PREENCHE SEU NOME NA JFIELDTEXT USUÁRIO, POIS SÓ PODE SER FEITO EMPRÉSTIMO PELO USUÁRIO ATUAL LOGADO 
    public void setIdUsuario(int p_id_usuario){
        this.id_usuario = p_id_usuario;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco
            
            Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução
            
            String sql = "SELECT nome FROM usuario WHERE id = " + this.id_usuario; // Instução de SELECT no SQL
            
            // ResultSet rs é um objeto que retorna o resultado do SELECT do SQL
            ResultSet rs = stmt.executeQuery(sql); // COMANDO PARA EXECUTAR O SELECT DO SQL
            
            while (rs.next()){
                jTextField2.setText(rs.getString("nome"));
            }

            stmt.close(); // Sempre fechar o banco (abre, executa e fecha) 
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Erro - SQL", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void metadadosTabelaLivro(){
        model.setRowCount(0); // Limpando a tabela para evitar que carregue os dados várias vezes
        jTable1.setModel(model);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco
            
            Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução
            
            String sql = "SELECT l.id, l.isbn, l.titulo, l.subtitulo, l.editora, l.ano, " +
                     "l.edicao, l.genero, l.paginas, l.statusLivro, l.estado_livro, " +
                     "a.nome AS autor " +
                     "FROM livro l " +
                     "JOIN autor a ON l.id_autor = a.id " +
                     "WHERE l.statusLivro = 'DISPONIVEL';"; // Instução de SELECT no SQL
            
            // ResultSet rs é um objeto que retorna o resultado do SELECT do SQL
            ResultSet rs = stmt.executeQuery(sql); // COMANDO PARA EXECUTAR O SELECT DO SQL
            
            // METADATA - METADADOS
            ResultSetMetaData metadata = rs.getMetaData(); // Busca a estrutura da tabela
            int qtdColunas = metadata.getColumnCount(); // Pega a quantidade de colunas
            
            // MODELO DA TABELA
            DefaultTableModel model = new DefaultTableModel();
            
            // PREENCHER OS DADOS NO MODELO
            for (int i = 1; i <= qtdColunas; i++){
                String coluna = metadata.getColumnLabel(i);

                if (coluna.equals("statusLivro")){
                    model.addColumn("status");
                }
                else if (coluna.equals("estado_livro")){
                    model.addColumn("estado do livro");
                }
                else{
                    model.addColumn(coluna);
            }
            }         
            
            jTable1.setModel(model);
            jTable1.getTableHeader().setReorderingAllowed(false);
            stmt.close(); // Sempre fechar o banco (abre, executa e fecha) 
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Erro - SQL", JOptionPane.WARNING_MESSAGE);
        } 
    }
    
    private void metadadosTabelaEmprestimo(){
        model.setRowCount(0); // Limpando a tabela para evitar que carregue os dados várias vezes
        jTable2.setModel(model);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco
            
            Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução
            
            String sql = "SELECT e.id, e.data_emprestimo, e.data_devolucao, e.data_devolucao_real, e.renovacao, e.statusEmprestimo AS status, " +
                     "e.multa, e.estado_livro_inicial, e.estado_livro_final, u.nome AS usuario, l.titulo AS livro " +
                     "FROM emprestimo AS e " +
                     "JOIN usuario AS u ON e.id_usuario = u.id " +
                     "JOIN livro AS l ON e.id_livro = l.id;"; // Instução de SELECT no SQL
            
            // ResultSet rs é um objeto que retorna o resultado do SELECT do SQL
            ResultSet rs = stmt.executeQuery(sql); // COMANDO PARA EXECUTAR O SELECT DO SQL
            
            // METADATA - METADADOS
            ResultSetMetaData metadata = rs.getMetaData(); // Busca a estrutura da tabela
            int qtdColunas = metadata.getColumnCount(); // Pega a quantidade de colunas
            
            // MODELO DA TABELA
            DefaultTableModel model = new DefaultTableModel();
            
            // PREENCHER OS DADOS NO MODELO
            for (int i = 1; i <= qtdColunas; i++){
                String coluna = metadata.getColumnLabel(i);

                if (coluna.equals("statusEmprestimo")){
                    model.addColumn("status");
                }
                else if (coluna.equals("estado_livro_inicial")){
                    model.addColumn("estado livro");
                }
                else{
                    model.addColumn(coluna);
                }
            }         
            
            jTable2.setModel(model);
            jTable2.getTableHeader().setReorderingAllowed(false);
            stmt.close(); // Sempre fechar o banco (abre, executa e fecha) 
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Erro - SQL", JOptionPane.WARNING_MESSAGE);
        } 
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTÃO DE EVENTO - SALVAR EMPRÉSTIMO
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate data_emprestimo = LocalDate.parse(now().format(fmt1), fmt1);
        emprestimo.setData_emprestimo(data_emprestimo);
        emprestimo.setData_devolucao(data_emprestimo.plusDays(10)); // ADICIONANDO 10 DIAS CORRIDOS A DATA DE EMPRESTIMO, ESTIMANDO A DATA DE DEVOLUÇÃO
        emprestimo.setStatusEmprestimo(StatusEmprestimo.EMPRESTADO);
        // emprestimo.setEstado_livro_incial();
        // emprestimo.setEstado_livro_final();
        emprestimo.setUsuario(id_usuario);
        
        // PEGANDO ID DO LIVRO SELECIONADO OU ESCRITO NA FORM
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de conexão com o banco de dados MySQL
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão com o BD
            
            String sql = "SELECT id FROM livro WHERE CONCAT_WS(' ', titulo, subtitulo) LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + jTextField3.getText() + "%");

            ResultSet rs = stmt.executeQuery();
            
            this.id_livro = 0; // DECLARANDO COMO INTEGER (CLASSE) PARA PODER INICIALIZAR COM 'NULL'
            if (rs.next()){
                this.id_livro = Integer.valueOf(rs.getString("id"));
                emprestimo.setLivro(this.id_livro);
            }
            else {
                JOptionPane.showMessageDialog(null, "Livro não encontrado na base de dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SQL Exception: " + e, "SQL ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        // SELEÇÃO ESTADO DO LIVRO
        if (jRadioButton3.isSelected()){
            emprestimo.setEstado_livro_incial(EstadoLivro.NOVO);
        }
        else if (jRadioButton4.isSelected()){
            emprestimo.setEstado_livro_incial(EstadoLivro.USADO);
        }
        else if (jRadioButton5.isSelected()){
            emprestimo.setEstado_livro_incial(EstadoLivro.USADO);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nenhuma opção sobre o estado do livro foi selecionada!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de conexão com o banco de dados MySQL
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão com o BD
            
            Statement stmt = conn.createStatement();

            String data_emp = emprestimo.getData_emprestimo().format(fmt2);
            String data_devo = emprestimo.getData_devolucao().format(fmt2);

            // INSERT INTO emprestimo (data_emprestimo, data_devolucao, statusEmprestimo, estado_livro_inicial, id_usuario, id_livro) VALUES ();
            String sql = "INSERT INTO emprestimo (data_emprestimo, data_devolucao, statusEmprestimo, estado_livro_inicial, id_usuario, id_livro) " +
                         "VALUES ('" + data_emp + "', '"
                                     + data_devo + "', '"
                                     + emprestimo.getStatusEmprestimo() + "', '"
                                     + emprestimo.getEstado_livro_incial() + "', "
                                     + emprestimo.getUsuario() + ", "
                                     + emprestimo.getLivro() + ");";
            
            stmt.executeUpdate(sql);
            
            sql = "UPDATE livro SET statusLivro = '" + StatusLivro.INDISPONIVEL.toString().trim() + "' WHERE id = " + this.id_livro + ";";
            stmt.executeUpdate(sql);
            
            // PEGANDO A ÚLTIMA INSERÇÃO DE REGISTRO E INCLUINDO NA JTABLE
            String sqlSelect = "SELECT e.id, e.data_emprestimo, e.data_devolucao, e.data_devolucao_real, e.renovacao, e.statusEmprestimo AS status, " +
                     "e.multa, e.estado_livro_inicial, e.estado_livro_final, u.nome AS usuario, l.titulo AS livro " +
                     "FROM emprestimo AS e " +
                     "JOIN usuario AS u ON e.id_usuario = u.id " +
                     "JOIN livro AS l ON e.id_livro = l.id;";
        
            ResultSet rs = stmt.executeQuery(sqlSelect);
            rs = stmt.executeQuery(sqlSelect);
            ResultSetMetaData metadata = rs.getMetaData();
            int qtdColunas = metadata.getColumnCount();

            DefaultTableModel model = (DefaultTableModel) jTable2.getModel(); // Pegando o modelo atual da JTable

            if (rs.next()) {
                Object[] registro = new Object[qtdColunas];
                for (int i = 1; i <= qtdColunas; i++) {
                    registro[i - 1] = rs.getObject(i);
                }
                model.addRow(registro); // Apenas adiciona a nova linha
            } 
            
            jButton8ActionPerformed(null); // ACIONANDO BOTÃO DE LISTAR EMPRÉSTIMOS
            jLabel13.setText("Status: Empréstimo realizado com sucesso!");
            jFormattedTextField1.setText(emprestimo.getData_emprestimo().toString());
            jFormattedTextField2.setText(emprestimo.getData_devolucao().toString());
            jTextField4.setText(emprestimo.getStatusEmprestimo().toString());
            JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!", "Empréstimo", JOptionPane.INFORMATION_MESSAGE);
            stmt.close(); // Fechando o banco
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Execption: " + e, "SQL ERROR", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // BOTÃO LIMPAR
        jTextField1.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jFormattedTextField1.setText("");
        jFormattedTextField2.setText("");
        jFormattedTextField3.setText("");
        jLabel13.setText("Status:");
        buttonGroup2_EstadoFinalLivro.clearSelection();
        buttonGroup1_EstadoInicialLivro.clearSelection();
        //(DefaultTableModel) jTable1.getModel()).setRowCount(0); // LIMPANDO TABELA
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BOTÃO HOME      
        frmTelaInicial telaInicial = new frmTelaInicial();
        telaInicial.setLoginUsuario(id_usuario);
        telaInicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BOTÃO BUSCAR Empréstimo
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco
            
            String sql = String.format("SELECT * FROM emprestimo WHERE 1 = 1"); // Com base neutra 1 = 1 para evitar erros
            List<String> parametros = new ArrayList<>(); // Lista para adicionar a condição de busca

            if (!jTextField1.getText().trim().isEmpty()) {
                sql += " AND id = ?";
                parametros.add(jTextField1.getText().trim());
            }
            
            PreparedStatement stmt = conn.prepareStatement(sql); // Criar um objeto que rode uma instrução
            
            // Adiciona os parâmetros no PreparedStatement
            for (int i = 0; i < parametros.size(); i++) {
                stmt.setString(i + 1, parametros.get(i)); // começa no 1
            }
     
            ResultSet rs = stmt.executeQuery(); // COMANDO PARA EXECUTAR O SELECT DO SQL
            
            if (rs.next()){
                jTextField1.setText(rs.getString("id"));

                // titulo e subtitulo do livro
                int idLivro = rs.getInt("id_livro");
                PreparedStatement stmtLivro = conn.prepareStatement("SELECT * FROM livro WHERE id = ?");
                stmtLivro.setInt(1, idLivro);
                ResultSet rsLivro = stmtLivro.executeQuery();
                if (rsLivro.next()) {
                    String titulo = rsLivro.getString("titulo");
                    String subtitulo = rsLivro.getString("subtitulo");
                    jTextField3.setText(titulo + " " + subtitulo);
                }
                rsLivro.close();
                stmtLivro.close();
                
                
                try {
                    // data EMPRÉSTIMO
                    Date empr = rs.getDate("data_emprestimo");
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    String data_empr = dateFormat.format(empr);
                    
                    jFormattedTextField1.setText(data_empr);   
                    
                    // data DEVOLUÇÃO
                    Date devolucao = rs.getDate("data_devolucao");
                    dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    String data_devo = dateFormat.format(devolucao);
                    
                    jFormattedTextField2.setText(data_devo); 
                    
                    // data DEVOLUÇÃO REAL - QUE VERIFICA SE JÁ FOI DEVOLVIDO PARA INSERIR A DATA
                    if (rs.getString("statusEmprestimo").equals("DEVOLVIDO")){
                        Date devolucao_real = rs.getDate("data_devolucao");
                        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        String data_devo_real = dateFormat.format(devolucao_real);

                        jFormattedTextField3.setText(data_devo_real); 
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e, "Erro - SQL", JOptionPane.ERROR_MESSAGE);
                }
                
                jTextField4.setText(rs.getString("statusEmprestimo"));
                         
                // Estado do Livro Inicial;
                String estado = rs.getString("estado_livro_inicial");
                jRadioButton3.setSelected(estado.equals("NOVO"));
                jRadioButton4.setSelected(estado.equals("USADO"));
                jRadioButton5.setSelected(estado.equals("DANIFICADO"));
                
                // Estado do Livro Inicial;
                if (rs.getString("statusEmprestimo").equals("DEVOLVIDO")){
                    String estado_final = rs.getString("estado_livro_final");
                    jRadioButton6.setSelected(estado_final.equals("NOVO"));
                    jRadioButton7.setSelected(estado_final.equals("USADO"));
                    jRadioButton8.setSelected(estado_final.equals("DANIFICADO"));
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Empréstimo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            stmt.close(); // Sempre fechar o banco (abre, executa e fecha) 
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Erro - SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // BOTÃO RENOVAR EMPRÉSTIMO
        int resp = JOptionPane.showConfirmDialog(null, "Deseja renovar empréstimo?", "Renovar Empréstimo", JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_OPTION){
            emprestimo.setId(Integer.parseInt(jTextField1.getText()));
            try{
                Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco

                Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução

                String sqlSelect = "SELECT * FROM emprestimo WHERE id = " + emprestimo.getId() + " AND id_usuario = " + id_usuario;
                ResultSet rs = stmt.executeQuery(sqlSelect);
                if (rs.next()){
                    if (rs.getString("statusEmprestimo").equals("ATRASADO")){
                        JOptionPane.showMessageDialog(null, "Não é possível renovar um livro que está com a devolução atrasada!", "Renovação Indisponível", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                        Object dataDevo = rs.getDate("data_devolucao");
                        String data_devo = new SimpleDateFormat("dd/MM/yyyy").format((Date) dataDevo);
                        LocalDate data_renovacao = ((Date) dataDevo).toLocalDate().plusDays(10);
                        emprestimo.setData_devolucao((LocalDate) data_renovacao);
                        String data_renova = emprestimo.getData_devolucao().format(fmt2);
                        
                        String sql = "UPDATE emprestimo SET data_devolucao = '" + data_renova + "', renovacao = true WHERE id = " + emprestimo.getId(); // Instução de UPDATE no SQL
                        stmt.executeUpdate(sql); // UPDATE DO SQL (QUE ALTERA O ESTADO DA TABELA)
                        JOptionPane.showMessageDialog(null, "Empréstimo renovado com sucesso! \nNova data para devolução: " + data_renovacao, "Renovar Empréstimo", JOptionPane.INFORMATION_MESSAGE);
                        jLabel13.setText("Status: Empréstimo renovado com sucesso!");   
                        jButton8ActionPerformed(null); // ACIONANDO BOTÃO PARA LISTAR EMPRÉSTIMOS NA TABLE
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Empréstimo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                stmt.close(); // Sempre fechar o banco (abre, executa e feecha)            
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex, "Erro - SQL", JOptionPane.WARNING_MESSAGE);
            }  
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // BOTÃO DEVOLVER LIVRO
        int resp = JOptionPane.showConfirmDialog(null, "Deseja devolver este livro?", "AVISO", JOptionPane.YES_NO_OPTION);
        
        if (resp == JOptionPane.YES_OPTION){
            emprestimo.setId(Integer.parseInt(jTextField1.getText()));
                        
            try{
                Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco

                Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução
                
                if(jRadioButton6.isSelected()){
                emprestimo.setEstado_livro_final(EstadoLivro.NOVO);
                }
                else if(jRadioButton7.isSelected()){
                    emprestimo.setEstado_livro_final(EstadoLivro.USADO);
                }
                else if(jRadioButton8.isSelected()){
                    emprestimo.setEstado_livro_final(EstadoLivro.DANIFICADO);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Selecione o estado final do livro!", "Erro", JOptionPane.ERROR_MESSAGE);
                }

                String sqlSelect = "SELECT * FROM emprestimo WHERE id = " + emprestimo.getId() + " AND id_usuario = " + id_usuario;
                ResultSet rs = stmt.executeQuery(sqlSelect);
                if (rs.next()){
                    // VERIFICAÇÃO DO STATUS, SE ESTIVER ATRASADO, SERÁ APLICADO A MULTA
                    String id_livro = rs.getString("id_livro");
                    if (rs.getString("statusEmprestimo").equals("ATRASADO")){
                        JOptionPane.showMessageDialog(null, "Será aplicado uma multa de 10 dias devido ao atraso!", "Renovação Indisponível", JOptionPane.WARNING_MESSAGE);
                        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                        LocalDate data_devolucao_real = LocalDate.parse(now().format(fmt1), fmt1);
                        emprestimo.setData_devolucao_real((LocalDate) data_devolucao_real);
                        String data_devo_Real = emprestimo.getData_devolucao_real().format(fmt2);
                        
                        String sql = "UPDATE emprestimo "
                                    + "SET data_devolucao_real = '" + data_devo_Real + "', statusEmprestimo = 'DEVOLVIDO', multa = 10, estado_livro_final = '" 
                                                                                     + emprestimo.getEstado_livro_final() + "' "
                                    + "WHERE id = " + emprestimo.getId(); // Instução de UPDATE no SQL
                        
                        stmt.executeUpdate(sql); // UPDATE DO SQL (QUE ALTERA O ESTADO DA TABELA)

                        String sql_select = "UPDATE livro SET statusLivro = 'DISPONIVEL', estado_livro = '" + emprestimo.getEstado_livro_final() + "' WHERE id = " + id_livro;
                        stmt.executeUpdate(sql_select);

                        jFormattedTextField3.setText(data_devolucao_real.toString());
                        JOptionPane.showMessageDialog(null, "Livro devolvido com sucesso e aplicado ao usuário uma multa de 10 dias!", "Devolução de Livro", JOptionPane.INFORMATION_MESSAGE);
                        jLabel13.setText("Status: Livro devolvido com sucesso e aplicado ao usuário uma multa de 10 dias!");   
                        jButton8ActionPerformed(null); // ACIONANDO BOTÃO PARA LISTAR EMPRÉSTIMOS NA TABLE
                    }
                    else{
                        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                        LocalDate data_devolucao_real = LocalDate.parse(now().format(fmt1), fmt1);
                        emprestimo.setData_devolucao_real((LocalDate) data_devolucao_real);
                        String data_devo_Real = emprestimo.getData_devolucao_real().format(fmt2);

                        String sql = "UPDATE emprestimo "
                                    + "SET data_devolucao_real = '" + data_devo_Real + "', statusEmprestimo = 'DEVOLVIDO', estado_livro_final = '" 
                                                                                     + emprestimo.getEstado_livro_final()+ "' "
                                    + "WHERE id = " + emprestimo.getId(); // Instução de UPDATE no SQL
                        
                        stmt.executeUpdate(sql); // UPDATE DO SQL (QUE ALTERA O ESTADO DA TABELA)
                        
                        String sql_select = "UPDATE livro SET statusLivro = 'DISPONIVEL', estado_livro = '" + emprestimo.getEstado_livro_final() + "' WHERE id = " + id_livro;
                        stmt.executeUpdate(sql_select);
                        
                        jFormattedTextField3.setText(data_devolucao_real.toString());
                        JOptionPane.showMessageDialog(null, "Livro devolvido com sucesso", "Devolução de Livro", JOptionPane.INFORMATION_MESSAGE);
                        jLabel13.setText("Status: Livro devolvido com sucesso!");   
                        jButton8ActionPerformed(null); // ACIONANDO BOTÃO PARA LISTAR EMPRÉSTIMOS NA TABLE
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Empréstimo não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                
                stmt.close(); // Sempre fechar o banco (abre, executa e feecha)
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e, "Erro - SQL", JOptionPane.WARNING_MESSAGE);            
            }
           
            jButton6ActionPerformed(null); // Limpa tela
        }   
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // BOTÃO LISTAR LIVROS
        jTabbedPane1.setSelectedIndex(1);
        model.setRowCount(0); // Limpando a tabela para evitar que carregue os dados várias vezes
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco
            
            Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução
            
            String sql = "SELECT l.id, l.isbn, l.titulo, l.subtitulo, l.editora, l.ano, " +
                     "l.edicao, l.genero, l.paginas, l.statusLivro, l.estado_livro, " +
                     "a.nome AS autor " +
                     "FROM livro l " +
                     "JOIN autor a ON l.id_autor = a.id " +
                     "WHERE l.statusLivro = 'DISPONIVEL';"; // Instução de SELECT no SQL JUTANDO COM O NOME DO AUTOR
            
            // ResultSet rs é um objeto que retorna o resultado do SELECT do SQL
            ResultSet rs = stmt.executeQuery(sql); // COMANDO PARA EXECUTAR O SELECT DO SQL
            
            // METADATA - METADADOS
            ResultSetMetaData metadata = rs.getMetaData(); // Busca a estrutura da tabela
            int qtdColunas = metadata.getColumnCount(); // Pega a quantidade de colunas
            
            // MODELO DA TABELA
            DefaultTableModel model = new DefaultTableModel();
            
             // PREENCHER OS DADOS NO MODELO
            // PREENCHER OS DADOS NO MODELO
            for (int i = 1; i <= qtdColunas; i++){
                String coluna = metadata.getColumnLabel(i);

                if (coluna.equals("statusLivro")){
                    model.addColumn("status");
                }
                else if (coluna.equals("estado_livro")){
                    model.addColumn("estado do livro");
                }
                else{
                    model.addColumn(coluna);
                }
            }
            
            // PREENCHENDO O MODELO COM OS REGISTROS
            while(rs.next()){
                Object[] registro = new Object[qtdColunas];
                for (int i = 1; i <= qtdColunas; i++){
                    registro[i - 1] = rs.getObject(i);
                }
                model.addRow(registro);
            }           
            jTable1.setModel(model);
            jTable1.getTableHeader().setReorderingAllowed(false); // DESABILITA QUE USUÁRIO MUDE A ORDEM DAS COLUNAS
            stmt.close(); // Sempre fechar o banco (abre, executa e fecha) 
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Erro - SQL", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // BOTÃO LISTAR EMPRÉSTIMOS
        jTabbedPane1.setSelectedIndex(0);
        model.setRowCount(0); // Limpando a tabela para evitar que carregue os dados várias vezes
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco
            
            Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução
            
            String sql = "SELECT e.id, e.data_emprestimo, e.data_devolucao, e.data_devolucao_real, e.renovacao, e.statusEmprestimo AS status, " +
                     "e.multa, e.estado_livro_inicial, e.estado_livro_final, u.nome AS usuario, l.titulo AS livro " +
                     "FROM emprestimo AS e " +
                     "JOIN usuario AS u ON e.id_usuario = u.id " +
                     "JOIN livro AS l ON e.id_livro = l.id "
                    + "WHERE e.id_usuario = " + id_usuario + ";"; // Instução de SELECT no SQL JUTANDO COM O NOME DO AUTOR
            
            // ResultSet rs é um objeto que retorna o resultado do SELECT do SQL
            ResultSet rs = stmt.executeQuery(sql); // COMANDO PARA EXECUTAR O SELECT DO SQL
            
            // METADATA - METADADOS
            ResultSetMetaData metadata = rs.getMetaData(); // Busca a estrutura da tabela
            int qtdColunas = metadata.getColumnCount(); // Pega a quantidade de colunas
            
            // MODELO DA TABELA
            DefaultTableModel model = new DefaultTableModel();
            
            // PREENCHER OS DADOS NO MODELO
            for (int i = 1; i <= qtdColunas; i++){
                String coluna = metadata.getColumnLabel(i);

                if (coluna.equals("statusEmprestimo")){
                    model.addColumn("status");
                }
                else if (coluna.equals("estado_livro_inicial")){
                    model.addColumn("estado livro");
                }
                else{
                    model.addColumn(coluna);
                }
            }
            
            // PREENCHENDO O MODELO COM OS REGISTROS
            while(rs.next()){
                Object[] registro = new Object[qtdColunas];
                for (int i = 1; i <= qtdColunas; i++){
                    registro[i - 1] = rs.getObject(i);
                }
                model.addRow(registro);
            }           
            jTable2.setModel(model);
            jTable2.getTableHeader().setReorderingAllowed(false); // DESABILITA QUE USUÁRIO MUDE A ORDEM DAS COLUNAS
            stmt.close(); // Sempre fechar o banco (abre, executa e fecha) 
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Erro - SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // AO CLICAR NO REGISTRO DA TABELA LIVRO
        /*EXPLICAÇÃO:
          O model recebe o modelo da JTable, o .getValueAt(i,0) pega o valor da i = linha (cliacada) na coluna = 0..n 
          converte para String e atribui o valor aos campos do formulário
        */
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        String titulo = getValue(model.getValueAt(i,2));
        String subtitulo = getValue(model.getValueAt(i,3));
        
        jTextField3.setText(titulo + " " + subtitulo);

        // Estado INCIAL do Livro
        String estado = getValue(model.getValueAt(i,10));
        jRadioButton3.setSelected(estado.equals("NOVO"));
        jRadioButton4.setSelected(estado.equals("USADO"));
        jRadioButton5.setSelected(estado.equals("DANIFICADO"));
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // AO CLICAR NO REGISTRO DA TABELA EMPRÉSTIMO
        /*EXPLICAÇÃO:
          O model recebe o modelo da JTable, o .getValueAt(i,0) pega o valor da i = linha (cliacada) na coluna = 0..n 
          converte para String e atribui o valor aos campos do formulário
        */
        int i = jTable2.getSelectedRow();
        TableModel model = jTable2.getModel();
        
        jTextField1.setText(getValue(model.getValueAt(i, 0))); // id
        jTextField3.setText(getValue(model.getValueAt(i, 10))); // livro
        
        // data emprestimo
        Object dataEmp = model.getValueAt(i, 1);
        if (dataEmp instanceof Date) {
            String data_emp = new SimpleDateFormat("dd/MM/yyyy").format((Date) dataEmp);
            jFormattedTextField1.setText(data_emp);
        }
        
        // data devolução
        Object dataDevo = model.getValueAt(i, 2);
        if (dataDevo instanceof Date) {
            String data_devo = new SimpleDateFormat("dd/MM/yyyy").format((Date) dataDevo);
            jFormattedTextField2.setText(data_devo);
        }

        jTextField4.setText(getValue(model.getValueAt(i, 5))); // status
        // Estado INCIAL do Livro
        String estado = getValue(model.getValueAt(i,7));
        jRadioButton3.setSelected(estado.equals("NOVO"));
        jRadioButton4.setSelected(estado.equals("USADO"));
        jRadioButton5.setSelected(estado.equals("DANIFICADO"));
        
    }//GEN-LAST:event_jTable2MouseClicked

    // FUNÇÃO AUXILIAR PARA NÃO CORRER O RISCO DE EXCEPTION AO RETORNAR REGISTROS NULOS DO BANCO DE DADOS
    String getValue(Object obj) {
        return obj != null ? obj.toString() : "";
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1_EstadoInicialLivro;
    private javax.swing.ButtonGroup buttonGroup2_EstadoFinalLivro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private swingCustom.SwitchButton switchButton1;
    // End of variables declaration//GEN-END:variables
}
