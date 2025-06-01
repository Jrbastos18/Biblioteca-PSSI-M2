/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import entidades.Autor;
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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DateFormatter;

/**
 *
 * @author junio
 */
public class frmAutor extends javax.swing.JFrame {

    /**
     * Creates new form frmUsuario
     */
    Autor autor = new Autor();
    private int id_usuario;
    // MODELO DA TABELA
    DefaultTableModel model = new DefaultTableModel();
    
    
    public frmAutor() {
        initComponents();
        metadadosTabela();
          
        TitledBorder tbSexo = BorderFactory.createTitledBorder("Sexo");
        tbSexo.setTitleFont(new java.awt.Font("Segoe UI", 1, 12));
        
        TitledBorder tbDadosProfissionais = BorderFactory.createTitledBorder("Dados Profissionais");
        tbDadosProfissionais.setTitleFont(new java.awt.Font("Segoe UI", 1, 12));
       
        // EVENTO PERSONALIZADO PARA SWITCHBUTTON PARA MODO LIGHT E MODO DARK
        switchButton1.addEventSelected(new EventSwitchSelected() {
            @Override
            public void onSelected(boolean selected) {
                if (selected == true){
                    jPanel1.setBackground(Color.decode("#001939"));
                    jPanel2.setBackground(Color.decode("#001939"));                   
                    jPanel3.setBackground(Color.decode("#001939"));
                    
                    tbSexo.setTitleColor(Color.WHITE);
                    jPanel2.setBorder(tbSexo);
                    
                    tbDadosProfissionais.setTitleColor(Color.WHITE);
                    jPanel3.setBorder(tbDadosProfissionais);
                    
                    jRadioButton1.setBackground(Color.decode("#001939"));
                    jRadioButton1.setForeground(Color.WHITE);
                    jRadioButton2.setBackground(Color.decode("#001939"));
                    jRadioButton2.setForeground(Color.WHITE);
                    
                    jLabel1.setForeground(Color.WHITE);
                    jLabel4.setForeground(Color.WHITE);
                    jLabel5.setForeground(Color.WHITE);
                    jLabel7.setForeground(Color.WHITE);
                    jLabel8.setForeground(Color.WHITE);
                    jLabel9.setForeground(Color.WHITE);
                    jLabel10.setForeground(Color.WHITE);
                    jLabel13.setForeground(Color.WHITE);
                    jLabel14.setForeground(Color.WHITE);
                    jLabel15.setForeground(Color.WHITE);
                    jLabel16.setForeground(Color.WHITE);
                    jLabel17.setForeground(Color.WHITE);
                    jLabel26.setForeground(Color.WHITE);
                    jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sol_white.png")));
                    jLabel27.setForeground(Color.WHITE);
                    jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lua_white.png")));
                    
                }
                else {
                    jPanel1.setBackground(new Color(153, 204, 255));
                    jPanel2.setBackground(new Color(153, 204, 255));                   
                    jPanel3.setBackground(new Color(153, 204, 255));
                    
                    tbSexo.setTitleColor(Color.BLACK);
                    jPanel2.setBorder(tbSexo);
                    
                    tbDadosProfissionais.setTitleColor(Color.BLACK);
                    jPanel3.setBorder(tbDadosProfissionais);
                    
                    jRadioButton1.setBackground(new Color(153, 204, 255));
                    jRadioButton1.setForeground(Color.BLACK);
                    jRadioButton2.setBackground(new Color(153, 204, 255));
                    jRadioButton2.setForeground(Color.BLACK);
                    
                    jPanel2.setForeground(Color.BLACK);
                    jPanel3.setForeground(Color.BLACK);
                    jLabel1.setForeground(Color.BLACK);
                    jLabel4.setForeground(Color.BLACK);
                    jLabel5.setForeground(Color.BLACK);
                    jLabel7.setForeground(Color.BLACK);
                    jLabel8.setForeground(Color.BLACK);
                    jLabel9.setForeground(Color.BLACK);
                    jLabel10.setForeground(Color.BLACK);
                    jLabel13.setForeground(Color.BLACK);
                    jLabel14.setForeground(Color.BLACK);
                    jLabel15.setForeground(Color.BLACK);
                    jLabel16.setForeground(Color.BLACK);
                    jLabel17.setForeground(Color.BLACK);
                    jLabel26.setForeground(Color.BLACK);
                    jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sol_white.png")));
                    jLabel27.setForeground(Color.BLACK);
                    jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lua_white.png")));                   
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

        ButtonGroup_Sexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        switchButton1 = new swingCustom.SwitchButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Data de Nascimento:");

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jRadioButton1.setBackground(new java.awt.Color(153, 204, 255));
        ButtonGroup_Sexo.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton1.setText("Masculino");

        jRadioButton2.setBackground(new java.awt.Color(153, 204, 255));
        ButtonGroup_Sexo.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton2.setText("Feminino");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Profissionais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Editora:");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Número de publicações:");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Número de Prêmios:");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Especialidade:");

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("E-mail:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

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
        jLabel15.setText("Cadastro de Autor");

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Home_Black_16x16.png"))); // NOI18N
        jButton2.setText("Voltar a Tela Inicial");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("ID:");

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_Black.png"))); // NOI18N
        jButton3.setText("Buscar Autor");
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

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Nacionalidade:");

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search_Black.png"))); // NOI18N
        jButton7.setText("Listar Autores");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(switchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel27)))
                                .addGap(297, 297, 297))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14))
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
                                .addComponent(jButton2))))
                    .addComponent(jScrollPane1))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26)
                    .addComponent(switchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton4)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton6)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTÃO DE EVENTO - SALVAR AUTOR
        autor.setNome(jTextField1.getText());
        // DATA CONVERSÃO
        try {
            autor.setNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(jFormattedTextField3.getText()));
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Exception " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        autor.setNacionalidade(jTextField8.getText());
        
        // SEXO - RADIOBUTTON1 = MASCULINO
        if (jRadioButton1.isSelected()){
            autor.setSexo('M');
        }
        else {
            autor.setSexo('F');
        }
        autor.setEmail(jTextField2.getText());
        autor.setEditora(jTextField3.getText());
        autor.setNumero_publicacoes(Integer.parseInt(jTextField4.getText()));
        autor.setPremios(Integer.parseInt(jTextField5.getText()));
        autor.setEspecialidade(jTextField6.getText());
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de conexão com o banco de dados MySQL
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão com o BD
            
            Statement stmt = conn.createStatement(); // Criando objeto que roda instruções SQL

            String data_nascimento = new SimpleDateFormat("yyyy/MM/dd").format(autor.getNascimento()); // CONVERTENDO DATA PARA TEXTO NO FORMATO DE DATA DO MYSQL
            
            // INSERT INTO auto (nome, nascimento, sexo, email, nacionalidade, editora, numero_publicacoes, premios, especialidade) VALUES ();
            String sql = "INSERT INTO autor (nome, nascimento, sexo, email, nacionalidade, editora, numero_publicacoes, premios, especialidade) "
                       + "VALUES ('" + autor.getNome() + "', '"
                                     + data_nascimento + "', '"
                                     + autor.getSexo() + "', '"
                                     + autor.getEmail() + "', '"
                                     + autor.getNacionalidade() + "', '"
                                     + autor.getEditora() + "', "
                                     + autor.getNumero_publicacoes() + ", "
                                     + autor.getPremios() + ", '"
                                     + autor.getEspecialidade() + "');";    
            
            stmt.executeUpdate(sql);
            
            // PEGANDO A ÚLTIMA INSERÇÃO DE REGISTRO E INCLUINDO NA JTABLE
            String sql_select = "SELECT * FROM autor ORDER BY id DESC LIMIT 1;"; // Corrigido para "autor"

            ResultSet rs = stmt.executeQuery(sql_select);
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
            JOptionPane.showMessageDialog(null, "Autor cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
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
        jFormattedTextField3.setText("");
        ButtonGroup_Sexo.clearSelection();
        jLabel13.setText("Status:");
        ((DefaultTableModel) jTable1.getModel()).setRowCount(0); // LIMPANDO TABELA
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BOTÃO HOME      
        frmTelaInicial telaInicial = new frmTelaInicial();
        telaInicial.setLoginUsuario(id_usuario);
        telaInicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BOTÃO CONSULTAR AUTOR
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco
            
            Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução
            
            String sql = String.format("SELECT * FROM autor WHERE");
            
            String id = jTextField7.getText();
            String nome = jTextField1.getText().trim();
                        
            // Verificando se estão vazias ou não para concatenar a instrução SQL e fazer a busca dos dados
            if (!id.isEmpty()) {
                sql += String.format(" id = %s", id);
            }
     
            ResultSet rs = stmt.executeQuery(sql); // COMANDO PARA EXECUTAR O SELECT DO SQL
            
            // Consultando através do SQL
            // O laço de repetição WHILE verifica o próximo resultado e caso haja, entra no loop
            if (rs.next()){
                jTextField7.setText(rs.getString("id"));
                jTextField1.setText(rs.getString("nome"));
                try {
                    Date nasc = rs.getDate("nascimento");
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
                    String data_nasc = dateFormat.format(nasc);
                    
                    jFormattedTextField3.setText(data_nasc);                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e, "Erro - SQL", JOptionPane.ERROR_MESSAGE);
                }
                jTextField8.setText(rs.getString("nacionalidade"));
                jTextField2.setText(rs.getString("email"));
                jTextField3.setText(rs.getString("editora"));
                jTextField4.setText(rs.getString("numero_publicacoes"));
                jTextField5.setText(rs.getString("premios"));
                jTextField6.setText(rs.getString("especialidade"));

                if (rs.getString("sexo").trim().equals("M")){
                    jRadioButton1.setSelected(true);
                }
                else{
                    jRadioButton2.setSelected(true);
                }
                
                jLabel13.setText("Status: Consulta de autor!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Autor não encontrando!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
            stmt.close(); // Sempre fechar o banco (abre, executa e fecha) 
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Erro - SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // BOTÃO ATUALIZAR AUTOR
        autor.setId(Integer.parseInt(jTextField7.getText()));
        autor.setNome(jTextField1.getText());
        // DATA CONVERSÃO
        try {
            autor.setNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(jFormattedTextField3.getText()));
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Exception " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        autor.setNacionalidade(jTextField8.getText());
        
        // SEXO - RADIOBUTTON1 = MASCULINO
        if (jRadioButton1.isSelected()){
            autor.setSexo('M');
        }
        else {
            autor.setSexo('F');
        }
        autor.setEmail(jTextField2.getText());
        autor.setEditora(jTextField3.getText());
        autor.setNumero_publicacoes(Integer.parseInt(jTextField4.getText()));
        autor.setPremios(Integer.parseInt(jTextField5.getText()));
        autor.setEspecialidade(jTextField6.getText());
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco
            
            Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução
            
            String data_nascimento = new SimpleDateFormat("yyyy/MM/dd").format(autor.getNascimento());
            String sql = "UPDATE autor " + 
                         "SET nome= '" + autor.getNome() 
                        + "', nascimento= '" + data_nascimento 
                        + "', sexo= '" + autor.getSexo() 
                        + "', email= '" + autor.getEmail()
                        + "', nacionalidade= '" + autor.getNacionalidade()
                        + "', editora= '" + autor.getEditora()
                        + "', numero_publicacoes= " + autor.getNumero_publicacoes()
                        + ", premios= " + autor.getPremios()
                        + ", especialidade= '" + autor.getEspecialidade() + "' " 
                        + "WHERE id = " + autor.getId() + ";"; // Instução de UPDATE no SQL
                                                                                    
            stmt.executeUpdate(sql); // UPDATE DO SQL (QUE ALTERA O ESTADO DA TABELA)
            
            JOptionPane.showMessageDialog(null, "Autor atualizado com sucesso!", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
            jButton7ActionPerformed(null); // ACIONAR O BOTÃO DE LISTAR AUTORES NA JTABLE
            jLabel13.setText("Status: Autor atualizado com sucesso!");   
            stmt.close(); // Sempre fechar o banco (abre, executa e feecha)            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Erro - SQL", JOptionPane.WARNING_MESSAGE);
        }    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // BOTÃO APAGAR
        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar autor?", "AVISO", JOptionPane.YES_NO_OPTION);
        
        if (resp == JOptionPane.YES_OPTION){
                try{
                Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco

                Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução

                String sql = "DELETE FROM autor WHERE id = " + jTextField7.getText(); // Instução de DELETE no SQL

                stmt.executeUpdate(sql); // UPDATE DO SQL
                stmt.close(); // Sempre fechar o banco (abre, executa e feecha)
                jLabel13.setText("Stauts: Autor deletado com sucesso!");
                JOptionPane.showMessageDialog(null, "Autor deletado com sucesso!", "SQL", JOptionPane.INFORMATION_MESSAGE);
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e, "Erro - SQL", JOptionPane.WARNING_MESSAGE);            
            }
           
            jButton6ActionPerformed(null); // Limpa tela
            jButton7ActionPerformed(null); // ACIONAR O BOTÃO DE LISTAR AUTORES NA JTABLE
        }   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void metadadosTabela(){
        model.setRowCount(0); // Limpando a tabela para evitar que carregue os dados várias vezes
        jTable1.setModel(model);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco
            
            Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução
            
            String sql = "SELECT * FROM autor;"; // Instução de SELECT no SQL
            
            // ResultSet rs é um objeto que retorna o resultado do SELECT do SQL
            ResultSet rs = stmt.executeQuery(sql); // COMANDO PARA EXECUTAR O SELECT DO SQL
            
            // METADATA - METADADOS
            ResultSetMetaData metadata = rs.getMetaData(); // Busca a estrutura da tabela
            int qtdColunas = metadata.getColumnCount(); // Pega a quantidade de colunas
            
            // MODELO DA TABELA
            DefaultTableModel model = new DefaultTableModel();
            
            // PREENCHER OS DADOS NO MODELO
            for (int i = 1; i <= qtdColunas; i++){
                model.addColumn(metadata.getColumnName(i));
            }         
            
            jTable1.setModel(model);
            jTable1.getTableHeader().setReorderingAllowed(false);
            stmt.close(); // Sempre fechar o banco (abre, executa e fecha) 
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Erro - SQL", JOptionPane.WARNING_MESSAGE);
        } 
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // BOTÃO LISTAR AUTORES
        model.setRowCount(0); // Limpando a tabela para evitar que carregue os dados várias vezes
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco
            
            Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução
            
            String sql = "SELECT * FROM autor;"; // Instução de SELECT no SQL
            
            // ResultSet rs é um objeto que retorna o resultado do SELECT do SQL
            ResultSet rs = stmt.executeQuery(sql); // COMANDO PARA EXECUTAR O SELECT DO SQL
            
            // METADATA - METADADOS
            ResultSetMetaData metadata = rs.getMetaData(); // Busca a estrutura da tabela
            int qtdColunas = metadata.getColumnCount(); // Pega a quantidade de colunas
            
            // MODELO DA TABELA
            DefaultTableModel model = new DefaultTableModel();
            
             // PREENCHER OS DADOS NO MODELO
            for (int i = 1; i <= qtdColunas; i++){
                model.addColumn(metadata.getColumnName(i));
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // AO CLICAR NO REGISTRO DA TABELA
        /*EXPLICAÇÃO:
          O model recebe o modelo da JTable, o .getValueAt(i,0) pega o valor da i = linha (cliacada) na coluna = 0..n 
          converte para String e atribui o valor aos campos do formulário
        */
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        jTextField7.setText(model.getValueAt(i,0).toString()); // id
        jTextField1.setText(model.getValueAt(i,1).toString()); // nome
        // data
        try {
            Date nasc = (Date) model.getValueAt(i,2); /// Fazendo casting para valor se transformar em data
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
            String data_nasc = dateFormat.format(nasc);
                    
            jFormattedTextField3.setText(data_nasc);                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Erro - SQL", JOptionPane.ERROR_MESSAGE);
        }
        // sexo
        if (model.getValueAt(i,3).toString().equals("M")){
            jRadioButton1.setSelected(true);
        }
        else{
            jRadioButton2.setSelected(true);
        }
        jTextField2.setText(model.getValueAt(i,4).toString()); // email
        jTextField8.setText(model.getValueAt(i,5).toString()); // nacionalidade
        jTextField3.setText(model.getValueAt(i,6).toString()); // editora
        jTextField4.setText(model.getValueAt(i,7).toString()); // numero_publicacoes
        jTextField5.setText(model.getValueAt(i,8).toString()); // premios
        jTextField6.setText(model.getValueAt(i,9).toString()); // especialidade
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroup_Sexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
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
    private swingCustom.SwitchButton switchButton1;
    // End of variables declaration//GEN-END:variables
}
