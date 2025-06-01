/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import entidades.Livro;
import enums.EstadoLivro;
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
public class frmLivro extends javax.swing.JFrame {

    /**
     * Creates new form frmUsuario
     */
    Livro livro = new Livro();
    private int id_usuario;
    // MODELO DA TABELA
    DefaultTableModel model = new DefaultTableModel();
    
    
    public frmLivro() {
        initComponents();
        metadadosTabela();
        carregarAutor();
          
        TitledBorder tbEstadoLivro = BorderFactory.createTitledBorder("Estado do Livro");
        tbEstadoLivro.setTitleFont(new java.awt.Font("Segoe UI", 1, 12));
       
        // EVENTO PERSONALIZADO PARA SWITCHBUTTON PARA MODO LIGHT E MODO DARK
        switchButton1.addEventSelected(new EventSwitchSelected() {
            @Override
            public void onSelected(boolean selected) {
                if (selected == true){
                    jPanel1.setBackground(Color.decode("#001939"));
                    jPanel2.setBackground(Color.decode("#001939"));                   
                    
                    tbEstadoLivro.setTitleColor(Color.WHITE);
                    jPanel2.setBorder(tbEstadoLivro);

                    jRadioButton1.setBackground(Color.decode("#001939"));
                    jRadioButton1.setForeground(Color.WHITE);
                    jRadioButton2.setBackground(Color.decode("#001939"));
                    jRadioButton2.setForeground(Color.WHITE);
                    jRadioButton3.setBackground(Color.decode("#001939"));
                    jRadioButton3.setForeground(Color.WHITE);
                    
                    jLabel2.setForeground(Color.WHITE);
                    jLabel3.setForeground(Color.WHITE);
                    jLabel4.setForeground(Color.WHITE);
                    jLabel6.setForeground(Color.WHITE);
                    jLabel11.setForeground(Color.WHITE);
                    jLabel5.setForeground(Color.WHITE);
                    jLabel7.setForeground(Color.WHITE);
                    jLabel8.setForeground(Color.WHITE);
                    jLabel9.setForeground(Color.WHITE);
                    jLabel10.setForeground(Color.WHITE);
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
                    jPanel2.setBackground(new Color(153, 204, 255));                   
                    
                    tbEstadoLivro.setTitleColor(Color.BLACK);
                    jPanel2.setBorder(tbEstadoLivro);            
                    
                    jRadioButton1.setBackground(new Color(153, 204, 255));
                    jRadioButton1.setForeground(Color.BLACK);
                    jRadioButton2.setBackground(new Color(153, 204, 255));
                    jRadioButton2.setForeground(Color.BLACK);
                    jRadioButton3.setBackground(new Color(153, 204, 255));
                    jRadioButton3.setForeground(Color.BLACK);
                    
                    jPanel2.setForeground(Color.BLACK);
                    jLabel2.setForeground(Color.BLACK);
                    jLabel3.setForeground(Color.BLACK);
                    jLabel4.setForeground(Color.BLACK);
                    jLabel6.setForeground(Color.BLACK);
                    jLabel11.setForeground(Color.BLACK);
                    jLabel5.setForeground(Color.BLACK);
                    jLabel7.setForeground(Color.BLACK);
                    jLabel8.setForeground(Color.BLACK);
                    jLabel9.setForeground(Color.BLACK);
                    jLabel10.setForeground(Color.BLACK);
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

        buttonGroup_EstadoLivro = new javax.swing.ButtonGroup();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

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
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Refresh_Black_18x18.png"))); // NOI18N
        jButton4.setText("Atualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete_Black_18x18.png"))); // NOI18N
        jButton5.setText("Deletar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BibliotecaHorizontalMenor.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setText("Cadastro de Livro");

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
        jButton3.setText("Buscar Livro");
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID: ");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ISBN:");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Tíltulo:");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Subtítulo:");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Ano:");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Edição:");

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Editora:");

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Gênero:");

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Páginas:");

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado do Livro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jRadioButton1.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup_EstadoLivro.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton1.setText("Novo");

        jRadioButton2.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup_EstadoLivro.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton2.setText("Usado");

        jRadioButton3.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup_EstadoLivro.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton3.setText("Danificado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Autor:");

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
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(13, 13, 13))
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
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton4)
                            .addComponent(jButton5)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6)
                    .addComponent(jButton2)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );

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

    public void setIdUsuario(int p_id_usuario){
        this.id_usuario = p_id_usuario;
    }
    
    public void carregarAutor(){
        // MÉTODO PARA CARREGAR TABELA AUTOR DO BANCO DE DADOS E INSERIR NOMES DE AUTORES NO JCOMBOBOX PARA CADASTRO DO LIVRO
        try{
                Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco

                Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução

                String sql = "SELECT nome FROM autor;"; // Instução de SELECT no SQL
                
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()){
                    String nome = rs.getString("nome");
                    jComboBox1.addItem(nome);
                }
                
                jComboBox1.setSelectedIndex(-1);
                stmt.close(); // Sempre fechar o banco (abre, executa e feecha)
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e, "Erro - SQL", JOptionPane.WARNING_MESSAGE);            
            }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTÃO DE EVENTO - SALVAR LIVRO
        livro.setIsbn(jTextField2.getText());
        livro.setTitulo(jTextField3.getText().trim());
        livro.setSubtitulo(jTextField4.getText().trim());
        livro.setEditora(jTextField7.getText());
        livro.setAno(Integer.parseInt(jTextField9.getText()));
        livro.setGenero(jTextField8.getText());
        livro.setEdicao(jTextField6.getText());
        livro.setPaginas(Integer.parseInt(jTextField5.getText()));
        livro.setStatusLivro(StatusLivro.DISPONIVEL); // TODO CADASTRO EFETUADO DE UM LIVRO, "AUTOMATICAMENTE" ELE JÁ ENTRA COMO DISPONÍVEL PARA EMPRÉSTIMO
        
        // VERIFICANDO QUAL JRADIOBUTTON ESTÁ SELECIONADO E SETA O ESTADO DO LIVRO DE ACORDO COM AS OPÇÕES DISPONÍVEIS NO ENUM EstadoLivro
        if (jRadioButton1.isSelected()){
            livro.setEstadoLivro(EstadoLivro.NOVO);
        }
        else if (jRadioButton2.isSelected()){
            livro.setEstadoLivro(EstadoLivro.USADO);
        }
        else {
            livro.setEstadoLivro(EstadoLivro.DANIFICADO);
        }
        
        livro.setAutor(jComboBox1.getSelectedItem().toString()); // Nome do autor a partir do valor da seleção no JComboBox
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de conexão com o banco de dados MySQL
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão com o BD
            
            // Criando um PreparedStatement ao invés de CreateStatement para não gerar erro na cláusula LIKE na query abaixo e também evita SQL Injection
            String sql = "SELECT id FROM autor WHERE nome LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + livro.getAutor().trim() + "%");

            ResultSet rs = stmt.executeQuery();
            
            Integer id_autor = null; // DECLARANDO COMO INTEGER (CLASSE) PARA PODER INICIALIZAR COM 'NULL'
            if (rs.next()){
                id_autor = Integer.valueOf(rs.getString("id"));
            }
            else {
                JOptionPane.showMessageDialog(null, "Autor não encontrado na base de dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
          
            // INSERT INTO livro (isbn, titulo, subtitulo, editora, ano, edicao, genero, paginas, statusLivro, estado_livro, id_autor) VALUES ();
            sql = "INSERT INTO livro (isbn, titulo, subtitulo, editora, ano, edicao, genero, paginas, statusLivro, estado_livro, id_autor) "
                       + "VALUES (" + livro.getIsbn() + ", '"
                                    + livro.getTitulo() + "', '"
                                    + livro.getSubtitulo() + "', '"
                                    + livro.getEditora() + "', "
                                    + livro.getAno() + ", '"
                                    + livro.getEdicao() + "', '"
                                    + livro.getGenero() + "', "
                                    + livro.getPaginas() + ", '"
                                    + livro.getStatusLivro() + "', '"
                                    + livro.getEstadoLivro().toString().trim() + "', "
                                    + id_autor + ");";   
            
            stmt.executeUpdate(sql);
            
            // PEGANDO A ÚLTIMA INSERÇÃO DE REGISTRO E INCLUINDO NA JTABLE
            String sqlSelect = "SELECT l.id, l.isbn, l.titulo, l.subtitulo, l.editora, l.ano, " +
                           "l.edicao, l.genero, l.paginas, l.statusLivro, l.estado_livro, " +
                           "a.nome AS autor " +
                           "FROM livro AS l JOIN autor AS a ON l.id_autor = a.id WHERE l.id = (SELECT MAX(id) FROM livro)";
        

            rs = stmt.executeQuery(sqlSelect);
            ResultSetMetaData metadata = rs.getMetaData();
            int qtdColunas = metadata.getColumnCount();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); // Pegando o modelo atual da JTable

            if (rs.next()) {
                Object[] registro = new Object[qtdColunas];
                for (int i = 1; i <= qtdColunas; i++) {
                    registro[i - 1] = rs.getObject(i);
                }
                model.addRow(registro); // Apenas adiciona a nova linha
            } 
            
            jLabel13.setText("Status: Cadastro realizado com sucesso!");
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            stmt.close(); // Fechando o banco
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Execption: " + e, "SQL ERROR", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // BOTÃO LIMPAR
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jComboBox1.setSelectedIndex(-1);
        buttonGroup_EstadoLivro.clearSelection();
        jLabel13.setText("Status:");
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
        // BOTÃO BUSCAR AUTOR
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco
            
            String sql = String.format("SELECT * FROM livro WHERE 1 = 1"); // Com base neutra 1 = 1 para evitar erros
            List<String> parametros = new ArrayList<>(); // Lista para adicionar a condição de busca

            if (!jTextField1.getText().trim().isEmpty()) {
                sql += " AND id = ?";
                parametros.add(jTextField1.getText().trim());
            }
            if (!jTextField2.getText().trim().isEmpty()) {
                sql += " AND isbn = ?";
                parametros.add("%" + jTextField2.getText().trim() + "%");
            }
            if (!jTextField3.getText().trim().isEmpty()) {
                sql += " AND titulo LIKE ?";
                parametros.add("%" + jTextField3.getText().trim() + "%");
            }
            
            PreparedStatement stmt = conn.prepareStatement(sql); // Criar um objeto que rode uma instrução
            
            // Adiciona os parâmetros no PreparedStatement
            for (int i = 0; i < parametros.size(); i++) {
                stmt.setString(i + 1, parametros.get(i)); // começa no 1
            }
     
            ResultSet rs = stmt.executeQuery(); // COMANDO PARA EXECUTAR O SELECT DO SQL
            
            if (rs.next()){
                jTextField1.setText(rs.getString("id"));
                jTextField2.setText(rs.getString("isbn"));
                jTextField3.setText(rs.getString("titulo"));
                jTextField4.setText(rs.getString("subtitulo"));
                jTextField7.setText(rs.getString("editora"));
                jTextField9.setText(rs.getString("ano"));
                jTextField6.setText(rs.getString("edicao"));
                jTextField8.setText(rs.getString("genero"));
                jTextField5.setText(rs.getString("paginas"));
                
                // Selecionar o autor
                int idAutor = rs.getInt("id_autor");
                PreparedStatement stmtAutor = conn.prepareStatement("SELECT nome FROM autor WHERE id = ?");
                stmtAutor.setInt(1, idAutor);
                ResultSet rsAutor = stmtAutor.executeQuery();
                if (rsAutor.next()) {
                    jComboBox1.setSelectedItem(rsAutor.getString("nome"));
                }
                rsAutor.close();
                stmtAutor.close();
                
                // Estado do Livro
                String estado = rs.getString("estado_livro");
                jRadioButton1.setSelected(estado.equals("NOVO"));
                jRadioButton2.setSelected(estado.equals("USADO"));
                jRadioButton3.setSelected(estado.equals("DANIFICADO"));
            }
            else{
                JOptionPane.showMessageDialog(null, "Livro não encontrando!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
            stmt.close(); // Sempre fechar o banco (abre, executa e fecha) 
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Erro - SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // BOTÃO ATUALIZAR LIVRO
        livro.setId(Integer.parseInt(jTextField1.getText()));
        livro.setIsbn(jTextField2.getText());
        livro.setTitulo(jTextField3.getText());
        livro.setSubtitulo(jTextField4.getText());
        livro.setEditora(jTextField7.getText());
        livro.setAno(Integer.parseInt(jTextField9.getText()));
        livro.setEdicao(jTextField6.getText());
        livro.setGenero(jTextField8.getText());
        livro.setPaginas(Integer.parseInt(jTextField5.getText()));
        
        // Estado do Livro
        if (jRadioButton1.isSelected()) {
            livro.setEstadoLivro(EstadoLivro.NOVO);
        }
        else if (jRadioButton2.isSelected()) {
            livro.setEstadoLivro(EstadoLivro.USADO);
        }
        else if (jRadioButton3.isSelected()) {
            livro.setEstadoLivro(EstadoLivro.DANIFICADO);
        }
        livro.setAutor(jComboBox1.getSelectedItem().toString());

        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco
            
            Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução
            
            String sqlSelect = "SELECT statusLivro FROM livro WHERE id = " + livro.getId();
            
            ResultSet rs = stmt.executeQuery(sqlSelect);;
            if (rs.next()){
                if (rs.getString("statusLivro").equals("DISPONIVEL")){
                    livro.setStatusLivro(StatusLivro.DISPONIVEL);
                }
                else{
                    livro.setStatusLivro(StatusLivro.INDISPONIVEL);
                }
            }
            
            String sql = "UPDATE livro SET isbn = '" + livro.getIsbn() 
                                                     + "', titulo = '" + livro.getTitulo() 
                                                     + "', subtitulo = '" + livro.getSubtitulo() 
                                                     + "', editora = '" + livro.getEditora()
                                                     + "', ano = " + livro.getAno()
                                                     + ", edicao = '" + livro.getEdicao()
                                                     + "', genero = '" + livro.getGenero()
                                                     + "', paginas = " + livro.getPaginas()
                                                     + ", statusLivro = '" + livro.getStatusLivro()
                                                     + "', estado_livro = '" + livro.getEstadoLivro()
                                                     + "', id_autor = (SELECT id FROM autor WHERE nome = '" + livro.getAutor() + "') "
                                                     + "WHERE id = " + livro.getId(); // Instução de UPDATE no SQL
                                                                                    
            stmt.executeUpdate(sql); // UPDATE DO SQL (QUE ALTERA O ESTADO DA TABELA)
            
            JOptionPane.showMessageDialog(null, "Livro atualizado com sucesso!", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
            jButton7ActionPerformed(null); // ACIONAR O BOTÃO DE LISTAR AUTORES NA JTABLE
            jLabel13.setText("Status: Livro atualizado com sucesso!");   
            stmt.close(); // Sempre fechar o banco (abre, executa e feecha)            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Erro - SQL", JOptionPane.WARNING_MESSAGE);
        }    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // BOTÃO APAGAR
        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar este livro?", "AVISO", JOptionPane.YES_NO_OPTION);
        
        if (resp == JOptionPane.YES_OPTION){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco

                Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução

                String sql = "DELETE FROM livro WHERE id = " + jTextField1.getText(); // Instução de DELETE no SQL

                stmt.executeUpdate(sql); // UPDATE DO SQL
                stmt.close(); // Sempre fechar o banco (abre, executa e feecha)
                jLabel13.setText("Stauts: Livro deletado com sucesso!");
                JOptionPane.showMessageDialog(null, "Livro deletado com sucesso!", "SQL", JOptionPane.INFORMATION_MESSAGE);
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e, "Erro - SQL", JOptionPane.WARNING_MESSAGE);            
            }
           
            jButton6ActionPerformed(null); // Limpa tela
            jButton7ActionPerformed(null); // ACIONAR O BOTÃO DE LISTAR LIVROS NA JTABLE
        }   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void metadadosTabela(){
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
                     "JOIN autor a ON l.id_autor = a.id;"; // Instução de SELECT no SQL
            
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
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // BOTÃO LISTAR LIVROS
        model.setRowCount(0); // Limpando a tabela para evitar que carregue os dados várias vezes
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco
            
            Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução
            
            String sql = "SELECT " +
                 "l.id, l.isbn, l.titulo, l.subtitulo, l.editora, l.ano, " +
                 "l.edicao, l.genero, l.paginas, l.statusLivro, l.estado_livro, " +
                 "a.nome AS autor " +
                 "FROM livro l " +
                 "JOIN autor a ON l.id_autor = a.id;"; // Instução de SELECT no SQL JUTANDO COM O NOME DO AUTOR
            
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
            jTable1.getTableHeader().setReorderingAllowed(false);
            stmt.close(); // Sempre fechar o banco (abre, executa e fecha) 
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Erro - SQL", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    // FUNÇÃO AUXILIAR PARA NÃO CORRER O RISCO DE EXCEPTION AO RETORNAR REGISTROS NULOS DO BANCO DE DADOS
    String getValue(Object obj) {
        return obj != null ? obj.toString() : "";
    }
        
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // AO CLICAR NO REGISTRO DA TABELA
        /*EXPLICAÇÃO:
          O model recebe o modelo da JTable, o .getValueAt(i,0) pega o valor da i = linha (cliacada) na coluna = 0..n 
          converte para String e atribui o valor aos campos do formulário
        */
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        
        jTextField1.setText(getValue(model.getValueAt(i,0))); // id
        jTextField2.setText(getValue(model.getValueAt(i,1))); // isbn   
        jTextField3.setText(getValue(model.getValueAt(i,2))); // título   
        jTextField4.setText(getValue(model.getValueAt(i,3))); // subtítulo   
        jTextField7.setText(getValue(model.getValueAt(i,4))); // editora  
        jTextField9.setText(getValue(model.getValueAt(i,5))); // ano  
        jTextField6.setText(getValue(model.getValueAt(i,6))); // edição  
        jTextField8.setText(getValue(model.getValueAt(i,7))); // gênero  
        jTextField5.setText(getValue(model.getValueAt(i,8))); // páginas  
        // jTextField5.setText(model.getValueAt(i,9).toString()); // status
        
         // Autor
        String nomeAutor = getValue(model.getValueAt(i, 11));
        if (nomeAutor.isEmpty()) {
            jComboBox1.setSelectedIndex(-1); // Nenhum selecionado
        } else {
            jComboBox1.setSelectedItem(nomeAutor);
        }

        // Estado do Livro
        String estado = getValue(model.getValueAt(i,10));
        jRadioButton1.setSelected(estado.equals("NOVO"));
        jRadioButton2.setSelected(estado.equals("USADO"));
        jRadioButton3.setSelected(estado.equals("DANIFICADO"));
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_EstadoLivro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private swingCustom.SwitchButton switchButton1;
    // End of variables declaration//GEN-END:variables
}
