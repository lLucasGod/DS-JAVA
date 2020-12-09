/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadefinalds;

import javax.swing.table.DefaultTableModel;

import java.sql.*;

import java.util.*;

import javax.swing.*;

/**
 *
 * @author Dr chapatine
 */
public class JFClientes extends javax.swing.JFrame {
    

    /**
     * Creates new form JFClientes
     */
    
    public JFClientes() {
        initComponents();
        btnAlterar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnConfirmar.setEnabled(false);
        btnRemover.setEnabled(false);
        btnAlterar.setEnabled(false);
        txtID.setEnabled(false);
        txtNome.setEnabled(false);
        txtTelR.setEnabled(false);
        txtTelC.setEnabled(false);
        txtCel.setEnabled(false);
        txtEmail.setEnabled(false);
        lblMsg.setText("");
    }
    
        public void atualizar(){
          
        Connection con = Conexao.abrirConexao();
        
        ClienteDAO cd = new ClienteDAO(con);
        
        List<ClienteBean> listaCliente = new ArrayList<ClienteBean>();
        
        listaCliente = cd.listarCliente();
        
        DefaultTableModel tbm = (DefaultTableModel) table.getModel();
        
        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }
        
        int i = 0;
        
        for (ClienteBean cb : listaCliente) {
            tbm.addRow(new String[1]);
            
            table.setValueAt(cb.getId(), i, 0);
            table.setValueAt(cb.getNome(), i, 1);
            table.setValueAt(cb.getEmail(), i, 2);
            
            i++;
        }
        txtID.setText("");
            txtNome.setText("");
            txtTelC.setText("");
            txtTelR.setText("");
            txtCel.setText("");
            txtEmail.setText("");
        Conexao.fecharConexao(con); 
        
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblTelR = new javax.swing.JLabel();
        lblTelC = new javax.swing.JLabel();
        lblCel = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtTelR = new javax.swing.JTextField();
        txtTelC = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblClientes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblMsg = new javax.swing.JLabel();

        jTextField4.setBackground(new java.awt.Color(240, 240, 240));
        jTextField4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField4.setSelectionColor(new java.awt.Color(0, 0, 0));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        lblNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblID.setText("ID:");

        lblTelR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTelR.setText("Tel. Residencial:");

        lblTelC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTelC.setText("Tel. Comercial:");

        lblCel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCel.setText("Tel. Celular:");

        lblEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEmail.setText("E-mail:");

        txtNome.setBackground(new java.awt.Color(240, 240, 240));
        txtNome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNome.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtTelR.setBackground(new java.awt.Color(240, 240, 240));
        txtTelR.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtTelR.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        txtTelR.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTelR.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtTelR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelRActionPerformed(evt);
            }
        });

        txtTelC.setBackground(new java.awt.Color(240, 240, 240));
        txtTelC.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtTelC.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        txtTelC.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTelC.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtTelC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelCActionPerformed(evt);
            }
        });

        txtCel.setBackground(new java.awt.Color(240, 240, 240));
        txtCel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtCel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        txtCel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCel.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelActionPerformed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(240, 240, 240));
        txtEmail.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtID.setBackground(new java.awt.Color(240, 240, 240));
        txtID.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtID.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        txtID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtID.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        btnInserir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(125, 125, 255), new java.awt.Color(125, 125, 255)));
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(125, 125, 255), new java.awt.Color(125, 125, 255)));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(125, 125, 255), new java.awt.Color(125, 125, 255)));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnConfirmar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(125, 125, 255), new java.awt.Color(125, 125, 255)));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(125, 125, 255), new java.awt.Color(125, 125, 255)));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(125, 125, 255), new java.awt.Color(125, 125, 255)));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblClientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblClientes.setForeground(new java.awt.Color(51, 51, 255));
        lblClientes.setText("Clientes Cadastrados   -----------------------------------------------------------------------------------------------------------------------------------");

        table.setBackground(new java.awt.Color(204, 204, 255));
        table.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(125, 125, 255), new java.awt.Color(125, 125, 255)));
        table.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        lblMsg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelR)
                                    .addComponent(txtTelR, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelC, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelC))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCel)
                                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtEmail)
                                .addComponent(lblClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
                                .addComponent(jScrollPane1))
                            .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(lblNome))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTelR)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelC)
                            .addComponent(lblCel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(lblClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtTelRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelRActionPerformed

    private void txtTelCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelCActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void txtCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        atualizar();
        btnRemover.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnConfirmar.setEnabled(true);
        txtNome.setEnabled(true);
        txtTelR.setEnabled(true);
        txtTelC.setEnabled(true);
        txtCel.setEnabled(true);
        txtEmail.setEnabled(true);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        
        if(table.getSelectedRow() != -1){
            
        
        Connection con = Conexao.abrirConexao();
        ClienteBean cb = new ClienteBean();
        ClienteDAO cd = new ClienteDAO(con);
        
       cb.setId((int)table.getValueAt(table.getSelectedRow(), 0));
        
        Object[] opcoes = {"Sim", "Não"};
        
        int i = JOptionPane.showOptionDialog(
                null,
                "Deseja excluir esse Cliente: " + txtID.getText() + "?",
                "Exclusão",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);
        
        if (i == JOptionPane.YES_OPTION) {
            lblMsg.setText(cd.removerCliente(cb));
            txtID.setText("");
        }
        Conexao.fecharConexao(con);
    }  
        atualizar();     
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        if(table.getSelectedRow() != -1){
            
        
        Connection con = Conexao.abrirConexao();
        ClienteBean cb = new ClienteBean();
        ClienteDAO cd = new ClienteDAO(con);
        
        cb.setNome(txtNome.getText());
        cb.setTelRes(txtTelR.getText());
        cb.setTelCom(txtTelC.getText());
        cb.setCel(txtCel.getText());
        cb.setEmail(txtEmail.getText());

       cb.setId((int)table.getValueAt(table.getSelectedRow(), 0));
        
        Object[] opcoes = {"Sim", "Não"};
        
        int i = JOptionPane.showOptionDialog(
                null,
                "Deseja Alterar esse Cliente: " + txtID.getText() + "?",
                "Alteraração",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);
        
        if (i == JOptionPane.YES_OPTION) {
            lblMsg.setText(cd.alterarCliente(cb));
            txtID.setText("");
            txtID.setText("");
            txtNome.setText("");
            txtTelC.setText("");
            txtTelR.setText("");
            txtCel.setText("");
            txtEmail.setText("");
        
        }
        Conexao.fecharConexao(con);
    }
        atualizar(); 
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        Connection con = Conexao.abrirConexao();
        ClienteBean cb = new ClienteBean();
        ClienteDAO cd = new ClienteDAO(con);
        
        cb.setNome(txtNome.getText());
        cb.setTelCom(txtTelC.getText());
        cb.setTelRes(txtTelR.getText());
        cb.setCel(txtCel.getText());
        cb.setEmail(txtEmail.getText());
        lblMsg.setText(cd.inserirCliente(cb));
        
        btnAlterar.setEnabled(false);
        btnRemover.setEnabled(false);
        btnInserir.setEnabled(true);
        btnConfirmar.setEnabled(false);
        btnCancelar.setEnabled(false);
        txtNome.setText("");
        txtID.setText("");
        txtTelC.setText("");
        txtTelR.setText("");
        txtCel.setText("");
        txtEmail.setText("");
        txtTelR.setEnabled(false);
        txtTelC.setEnabled(false);
        txtEmail.setEnabled(false);
        txtCel.setEnabled(false);
        txtNome.setEnabled(false);
 
        atualizar();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        Object[] opcoes = {"Sim", "Não"};
        
        int i = JOptionPane.showOptionDialog(
                null,
                "Deseja cancelar o Processo ? ",
                "Cancelar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);
        
        if (i == JOptionPane.YES_OPTION) {
            txtID.setText("");
            txtNome.setText("");
            txtTelC.setText("");
            txtTelR.setText("");
            txtCel.setText("");
            txtEmail.setText("");
            txtTelR.setEnabled(false);
            txtTelC.setEnabled(false);
            txtEmail.setEnabled(false);
            txtCel.setEnabled(false);
            txtNome.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnConfirmar.setEnabled(false);
            btnInserir.setEnabled(true);
            btnRemover.setEnabled(false);
            btnAlterar.setEnabled(false);
            lblMsg.setText("");            
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableKeyPressed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        Connection con = Conexao.abrirConexao();
        ClienteBean cb = new ClienteBean();
        ClienteDAO cd = new ClienteDAO(con);
        
        int index = table.getSelectedRow();
        
        cb = cd.listarCliente().get(index);
        
        txtID.setText(String.valueOf(cb.getId()));
        txtNome.setText(cb.getNome());
        txtTelR.setText(cb.getTelRes());
        txtTelC.setText(cb.getTelCom());
        txtCel.setText(cb.getCel());
        txtEmail.setText(cb.getEmail());

    }//GEN-LAST:event_tableMouseClicked

    private void tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tableKeyReleased

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
            java.util.logging.Logger.getLogger(JFClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelC;
    private javax.swing.JLabel lblTelR;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelC;
    private javax.swing.JTextField txtTelR;
    // End of variables declaration//GEN-END:variables
}
