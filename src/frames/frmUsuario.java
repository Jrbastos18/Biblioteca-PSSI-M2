/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import entidades.Usuario;
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
import javax.swing.text.DateFormatter;

/**
 *
 * @author junio
 */
public class frmUsuario extends javax.swing.JFrame {

    /**
     * Creates new form frmUsuario
     */
    Usuario usuario = new Usuario(); // INSTANCIANDO O USUARIO NO GERAL DO FORM
    private int id_usuario;
    
    
    public frmUsuario() {
        initComponents();
        
        TitledBorder tbSexo = BorderFactory.createTitledBorder("Sexo");
        tbSexo.setTitleFont(new java.awt.Font("Segoe UI", 1, 12));
        
        TitledBorder tbEndereco = BorderFactory.createTitledBorder("Endereco");
        tbEndereco.setTitleFont(new java.awt.Font("Segoe UI", 1, 12));
       
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
                    
                    tbEndereco.setTitleColor(Color.WHITE);
                    jPanel3.setBorder(tbEndereco);
                    
                    jRadioButton1.setBackground(Color.decode("#001939"));
                    jRadioButton1.setForeground(Color.WHITE);
                    jRadioButton2.setBackground(Color.decode("#001939"));
                    jRadioButton2.setForeground(Color.WHITE);
                    
                    jLabel1.setForeground(Color.WHITE);
                    jLabel2.setForeground(Color.WHITE);
                    jLabel3.setForeground(Color.WHITE);
                    jLabel4.setForeground(Color.WHITE);
                    jLabel5.setForeground(Color.WHITE);
                    jLabel6.setForeground(Color.WHITE);
                    jLabel7.setForeground(Color.WHITE);
                    jLabel8.setForeground(Color.WHITE);
                    jLabel9.setForeground(Color.WHITE);
                    jLabel10.setForeground(Color.WHITE);
                    jLabel11.setForeground(Color.WHITE);
                    jLabel12.setForeground(Color.WHITE);
                    jLabel13.setForeground(Color.WHITE);
                    jLabel14.setForeground(Color.WHITE);
                    jLabel15.setForeground(Color.WHITE);
                    jLabel16.setForeground(Color.WHITE);
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
                    
                    tbEndereco.setTitleColor(Color.BLACK);
                    jPanel3.setBorder(tbEndereco);
                    
                    jRadioButton1.setBackground(new Color(153, 204, 255));
                    jRadioButton1.setForeground(Color.BLACK);
                    jRadioButton2.setBackground(new Color(153, 204, 255));
                    jRadioButton2.setForeground(Color.BLACK);
                    
                    jPanel2.setForeground(Color.BLACK);
                    jPanel3.setForeground(Color.BLACK);
                    jLabel1.setForeground(Color.BLACK);
                    jLabel2.setForeground(Color.BLACK);
                    jLabel3.setForeground(Color.BLACK);
                    jLabel4.setForeground(Color.BLACK);
                    jLabel5.setForeground(Color.BLACK);
                    jLabel6.setForeground(Color.BLACK);
                    jLabel7.setForeground(Color.BLACK);
                    jLabel8.setForeground(Color.BLACK);
                    jLabel9.setForeground(Color.BLACK);
                    jLabel10.setForeground(Color.BLACK);
                    jLabel11.setForeground(Color.BLACK);
                    jLabel12.setForeground(Color.BLACK);
                    jLabel13.setForeground(Color.BLACK);
                    jLabel14.setForeground(Color.BLACK);
                    jLabel15.setForeground(Color.BLACK);
                    jLabel16.setForeground(Color.BLACK);
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
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
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
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuário");
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("RG:");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("CPF:");

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Data de Nascimento:");

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("E-mail:");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Telefone:");

        try {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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
                .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
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
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Logradouro:");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Número:");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Bairro:");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Cidade:");

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("UF:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MS", "MT", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.setToolTipText("");
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("CEP:");

        try {
            jFormattedTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
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

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Cadastro de Usuário");

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
        jButton3.setText("Buscar Usuário");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(284, 284, 284)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(switchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(222, 222, 222))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel26))
                            .addComponent(switchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setIdUsuario(int p_id_usuario){
        this.id_usuario = p_id_usuario;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTÃO DE EVENTO - SALVAR USUÁRIO
        usuario.setNome(jTextField1.getText());
        usuario.setRg(jFormattedTextField1.getText());
        usuario.setCpf(jFormattedTextField2.getText());
        // DATA CONVERSÃO
        try {
            usuario.setNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(jFormattedTextField3.getText()));
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Exception " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        usuario.setEmail(jTextField2.getText());
        usuario.setTelefone(jFormattedTextField4.getText());
        // SEXO - RADIOBUTTON1 = MASCULINO
        if (jRadioButton1.isSelected()){
            usuario.setSexo('M');
        }
        else {
            usuario.setSexo('F');
        }
        // ENDEREÇO
        usuario.setLogradouro(jTextField3.getText());
        usuario.setNumero(jTextField4.getText());
        usuario.setBairro(jTextField5.getText());
        usuario.setCidade(jTextField6.getText());
        // ENUM - UF
        Uf uf = Uf.valueOf(jComboBox1.getSelectedItem().toString());
        usuario.setUf(uf);
        usuario.setCep(jFormattedTextField6.getText());    
        
        // GRAVANDO NO BANCO DE DADOS
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de conexão com o banco de dados MySQL
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão com o BD
            
            Statement stmt = conn.createStatement(); // Criando objeto que roda instruções SQL

            
            String data_nascimento = new SimpleDateFormat("yyyy/MM/dd").format(usuario.getNascimento()); // CONVERTENDO DATA PARA TEXTO NO FORMATO DE DATA DO MYSQL
            
            // INSERT INTO usuario (nome, rg, cpf, sexo, nascimento, email, telefone, cep, logradouro, numero, bairro, cidade, uf) VALUES ()
            String sql = "INSERT INTO usuario (nome, rg, cpf, sexo, nascimento, email, telefone, cep, logradouro, numero, bairro, cidade, uf) VALUES ('" + usuario.getNome() + "', '"
                                                                                                                                                         + usuario.getRg() + "', '"
                                                                                                                                                         + usuario.getCpf() + "', '"
                                                                                                                                                         + usuario.getSexo() + "', '"
                                                                                                                                                         + data_nascimento + "', '"
                                                                                                                                                         + usuario.getEmail() + "', '"
                                                                                                                                                         + usuario.getTelefone() + "', '"
                                                                                                                                                         + usuario.getCep() + "', '"
                                                                                                                                                         + usuario.getLogradouro() + "', '"
                                                                                                                                                         + usuario.getNumero() + "', '"
                                                                                                                                                         + usuario.getBairro() + "', '"
                                                                                                                                                         + usuario.getCidade() + "', '"
                                                                                                                                                         + usuario.getUf() + "');";
            
            stmt.executeUpdate(sql);
            
            jLabel13.setText("Status: Cadastro realizado com sucesso!");
            
            String sql_query = "SELECT id FROM usuario WHERE id = LAST_INSERT_ID();"; // VAI RETORNAR O ÚLTIMO ID (CADASTRO) REGISTRADO (ACIMA)
            
            ResultSet rs = stmt.executeQuery(sql_query);
            
            if (rs.next()){ // RECEBENDO O ID PARA UTILIZAR NO CADASTRO DE LOGIN DO USUÁRIO
                usuario.setId(Integer.parseInt(rs.getString("id")));
            }
            
            jTextField7.setText(String.valueOf(usuario.getId()));
            
            // MENSAGEM PERGUNTANDO SE DESEJA CRIAR UM LOGIN PARA O USUÁRIO QUE FOI CADASTRADO
            int resp = JOptionPane.showConfirmDialog(null, "Deseja criar login?", "Cadastro Login", JOptionPane.YES_NO_OPTION);
            
            // VERIFICAÇÃO DA ESCOLHA PARA REGISTRO DE LOGIN
            if(resp == JOptionPane.YES_OPTION){
                frmRegistroLogin frmRegLogin = new frmRegistroLogin();
                frmRegLogin.setIdUsuario(usuario.getId()); // ENVIANDO O ID DO NOVO USUÁRIO CADASTRADO PARA O OUTRO FORM
                frmRegLogin.setVisible(true);
                
                jLabel13.setText("Status:");
            }
            else {
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jFormattedTextField1.setText("");
                jFormattedTextField2.setText("");
                jFormattedTextField3.setText("");
                jFormattedTextField4.setText("");
                jFormattedTextField6.setText("");
                ButtonGroup_Sexo.clearSelection();
                jComboBox1.setSelectedIndex(-1);
                jLabel13.setText("Status:");
            }
            
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
        jFormattedTextField1.setText("");
        jFormattedTextField2.setText("");
        jFormattedTextField3.setText("");
        jFormattedTextField4.setText("");
        jFormattedTextField6.setText("");
        ButtonGroup_Sexo.clearSelection();
        jComboBox1.setSelectedIndex(-1);
        jLabel13.setText("Status:");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BOTÃO HOME      
        frmTelaInicial telaInicial = new frmTelaInicial();
        telaInicial.setLoginUsuario(id_usuario);
        telaInicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BOTÃO CONSULTAR USUÁRIO
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco
            
            Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução
            
            String id = jTextField7.getText();
            String rg = jFormattedTextField1.getText().trim();  // método .trim() exclui espaço em branco se houver ao final da String
            
            String sql = String.format("SELECT * FROM usuario WHERE");
            
            // Verificando se estão vazias ou não para concatenar a instrução SQL e fazer a busca dos dados
            if (!id.isEmpty()) {
                sql += String.format(" id = %s", id);
            }
            else {
                if (!rg.isEmpty()){
                    sql += String.format(" rg = '%s'", rg);
                }
            }
            
            ResultSet rs = stmt.executeQuery(sql); // COMANDO PARA EXECUTAR O SELECT DO SQL
            
            // Consultando através do SQL
            // O laço de repetição WHILE verifica o próximo resultado e caso haja, entra no loop
            if (rs.next()){
                jTextField1.setText(rs.getString("nome"));
                jFormattedTextField1.setText(rs.getString("rg"));
                jFormattedTextField2.setText(rs.getString("cpf"));
                
                try {
                    Date nasc = rs.getDate("nascimento");
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    String data_nasc = dateFormat.format(nasc);
                    
                    jFormattedTextField3.setText(data_nasc);                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e, "Erro - SQL", JOptionPane.ERROR_MESSAGE);
                }
                
                
                jTextField2.setText(rs.getString("email"));
                jFormattedTextField4.setText(rs.getString("telefone"));
                
                if (rs.getString("sexo").trim().equals("M")){
                    jRadioButton1.setSelected(true);
                }
                else{
                    jRadioButton2.setSelected(true);
                }
                
                jTextField3.setText(rs.getString("logradouro"));
                jTextField4.setText(rs.getString("numero"));
                jTextField5.setText(rs.getString("bairro"));
                jTextField6.setText(rs.getString("cidade"));
                
                Uf uf = Uf.valueOf(rs.getString("uf"));
                jComboBox1.setSelectedItem(uf.toString());
                
                jFormattedTextField6.setText(rs.getString("cep"));

                jLabel13.setText("Status: Consulta de usuário.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrando!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
            stmt.close(); // Sempre fechar o banco (abre, executa e fecha) 
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Erro - SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // BOTÃO ATUALIZAR USUÁRIO
        usuario.setNome(jTextField1.getText());
        usuario.setRg(jFormattedTextField1.getText());
        usuario.setCpf(jFormattedTextField2.getText());
        // DATA CONVERSÃO
        try {
            usuario.setNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(jFormattedTextField3.getText()));
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Exception " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        usuario.setEmail(jTextField2.getText());
        usuario.setTelefone(jFormattedTextField4.getText());
        // SEXO - RADIOBUTTON1 = MASCULINO
        if (jRadioButton1.isSelected()){
            usuario.setSexo('M');
        }
        else {
            usuario.setSexo('F');
        }
        // ENDEREÇO
        usuario.setLogradouro(jTextField3.getText());
        usuario.setNumero(jTextField4.getText());
        usuario.setBairro(jTextField5.getText());
        usuario.setCidade(jTextField6.getText());
        // ENUM - UF
        Uf uf = Uf.valueOf(jComboBox1.getSelectedItem().toString());
        usuario.setUf(uf);
        usuario.setCep(jFormattedTextField6.getText()); 
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco
            
            Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução
            
            String data_nascimento = new SimpleDateFormat("yyyy/MM/dd").format(usuario.getNascimento());
            String sql = "UPDATE usuario " + 
                         "SET nome= '" + usuario.getNome() + "', rg= '" + usuario.getRg() + "', cpf= '" + usuario.getCpf() 
                                       + "', sexo= '" + usuario.getSexo() + "', nascimento= '" + data_nascimento + "', email= '" + usuario.getEmail() 
                                       + "', telefone= '" + usuario.getTelefone() + "', cep= '" + usuario.getCep() + "', logradouro= '" + usuario.getLogradouro() 
                                       + "', numero= '" + usuario.getNumero() + "', bairro= '" + usuario.getBairro() + "', cidade= '" + usuario.getCidade() 
                                       + "', uf= '" + usuario.getUf() + "' " +
                         "WHERE id = " + jTextField7.getText() + ";"; // Instução de UPDATE no SQL
                                                                                    
            stmt.executeUpdate(sql); // UPDATE DO SQL (QUE ALTERA O ESTADO DA TABELA)
            
            JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
            jLabel13.setText("Status: Usuário atualizado com sucesso!");   
            stmt.close(); // Sempre fechar o banco (abre, executa e feecha)            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex, "Erro - SQL", JOptionPane.WARNING_MESSAGE);
        }    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // BOTÃO APAGAR
        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir usuário?", "AVISO", JOptionPane.YES_NO_OPTION);
        
        if (resp == JOptionPane.YES_OPTION){
                try{
                Class.forName("com.mysql.cj.jdbc.Driver"); //Driver
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", ""); // Conexão/Onde está o banco

                Statement stmt = conn.createStatement(); // Criar um objeto que rode uma instrução

                String sql = "DELETE FROM usuario WHERE id = " + jTextField7.getText(); // Instução de DELETE no SQL

                stmt.executeUpdate(sql); // UPDATE DO SQL
                stmt.close(); // Sempre fechar o banco (abre, executa e feecha)
                jLabel13.setText("Stauts: Usuário deletado com sucesso!");
                JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso!", "SQL", JOptionPane.INFORMATION_MESSAGE);
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex, "Erro - SQL", JOptionPane.WARNING_MESSAGE);            
            }
           
            jButton6ActionPerformed(null); // Limpa tela
        }   
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsuario().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private swingCustom.SwitchButton switchButton1;
    // End of variables declaration//GEN-END:variables
}
