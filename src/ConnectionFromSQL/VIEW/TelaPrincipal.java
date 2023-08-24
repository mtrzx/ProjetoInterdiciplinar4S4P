package ConnectionFromSQL.VIEW;

import ConnectionFromSQL.DAO.UsuarioDAO;
import ConnectionFromSQL.DTO.UsuarioDTO;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {
    public TelaPrincipal() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JButton();
        btnSaldo = new javax.swing.JButton();
        btnTrans = new javax.swing.JButton();
        btnHistorico = new javax.swing.JButton();
        btnInvest = new javax.swing.JButton();
        btnChat = new javax.swing.JButton();
        btnSobre = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(30, 30, 30));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(11, 164, 132));

        jPanel2.setBackground(new java.awt.Color(35, 117, 99));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/imagens/RUBIKHome.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        btnPerfil.setBackground(new java.awt.Color(11, 164, 132));
        btnPerfil.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(51, 51, 51));
        btnPerfil.setText("Perfil");
        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfil.setHideActionText(true);
        btnPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnPerfil.setIconTextGap(0);
        btnPerfil.setInheritsPopupMenu(true);
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnSaldo.setBackground(new java.awt.Color(11, 164, 132));
        btnSaldo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSaldo.setForeground(new java.awt.Color(51, 51, 51));
        btnSaldo.setText("Saldo Bancário");
        btnSaldo.setToolTipText("");
        btnSaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaldo.setHideActionText(true);
        btnSaldo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnSaldo.setIconTextGap(0);
        btnSaldo.setInheritsPopupMenu(true);
        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoActionPerformed(evt);
            }
        });

        btnTrans.setBackground(new java.awt.Color(11, 164, 132));
        btnTrans.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTrans.setForeground(new java.awt.Color(51, 51, 51));
        btnTrans.setText("Transferência");
        btnTrans.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrans.setHideActionText(true);
        btnTrans.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnTrans.setIconTextGap(0);
        btnTrans.setInheritsPopupMenu(true);
        btnTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransActionPerformed(evt);
            }
        });

        btnHistorico.setBackground(new java.awt.Color(11, 164, 132));
        btnHistorico.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnHistorico.setForeground(new java.awt.Color(51, 51, 51));
        btnHistorico.setText("Histórico");
        btnHistorico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistorico.setHideActionText(true);
        btnHistorico.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnHistorico.setIconTextGap(0);
        btnHistorico.setInheritsPopupMenu(true);
        btnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoActionPerformed(evt);
            }
        });

        btnInvest.setBackground(new java.awt.Color(11, 164, 132));
        btnInvest.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnInvest.setForeground(new java.awt.Color(51, 51, 51));
        btnInvest.setText("Investimentos");
        btnInvest.setToolTipText("");
        btnInvest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInvest.setHideActionText(true);
        btnInvest.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnInvest.setIconTextGap(0);
        btnInvest.setInheritsPopupMenu(true);
        btnInvest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvestActionPerformed(evt);
            }
        });

        btnChat.setBackground(new java.awt.Color(11, 164, 132));
        btnChat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnChat.setForeground(new java.awt.Color(51, 51, 51));
        btnChat.setText("Atendimento");
        btnChat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChat.setHideActionText(true);
        btnChat.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnChat.setIconTextGap(0);
        btnChat.setInheritsPopupMenu(true);
        btnChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatActionPerformed(evt);
            }
        });

        btnSobre.setBackground(new java.awt.Color(11, 164, 132));
        btnSobre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSobre.setForeground(new java.awt.Color(51, 51, 51));
        btnSobre.setText("?");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        sair.setBackground(new java.awt.Color(11, 146, 164));
        sair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sair.setForeground(new java.awt.Color(51, 51, 51));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInvest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSobre)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnInvest, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnChat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSobre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        MainPanel.setBackground(new java.awt.Color(30, 30, 30));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
         //Chama O jFrame do perfil
        InternalPerfil objInternalPerfil = new InternalPerfil();
        MainPanel.add(objInternalPerfil);
        objInternalPerfil.setVisible(true);
        objInternalPerfil.listarValores();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoActionPerformed
        //Chama O jFrame do saldo
        InternalSaldo objInternalSaldo = new InternalSaldo();
        objInternalSaldo.listarSaldo();
        MainPanel.add(objInternalSaldo);
        objInternalSaldo.setVisible(true);
    }//GEN-LAST:event_btnSaldoActionPerformed

    private void btnTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransActionPerformed
        //Chama O jFrame da transferencia
        InternalTrans objInternalTrans = new InternalTrans();
        MainPanel.add(objInternalTrans);
        objInternalTrans.setVisible(true);    
        // Crie um objeto da classe que tem o setter
    }//GEN-LAST:event_btnTransActionPerformed

    private void btnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoActionPerformed
        //Chama O jFrame da historico
        InternalHistorico ih = new InternalHistorico();
        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        
        ih.listarValoresTabelaPIX(objUsuarioDTO.getCpf_login());
        ih.listarValoresTabelaTED(objUsuarioDTO.getCpf_login());
        MainPanel.add(ih);
        ih.setVisible(true);
        
    
    }//GEN-LAST:event_btnHistoricoActionPerformed

    private void btnInvestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvestActionPerformed
        //Chama O jFrame da investimento
        InternalInvest objInternalInvestimento = new InternalInvest();
        MainPanel.add(objInternalInvestimento);
        objInternalInvestimento.setVisible(true);
        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
    }//GEN-LAST:event_btnInvestActionPerformed

    private void btnChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatActionPerformed
        //Chama O jFrame da atendimento
        InternalChat objInternalChat = new InternalChat();
        MainPanel.add(objInternalChat);
        objInternalChat.setVisible(true);
    }//GEN-LAST:event_btnChatActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        // Chama o jFrame do sobre
        InternalSobre objInternalSobre = new InternalSobre();
        MainPanel.add(objInternalSobre);
        objInternalSobre.setVisible(true);
    }//GEN-LAST:event_btnSobreActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_sairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton btnChat;
    private javax.swing.JButton btnHistorico;
    private javax.swing.JButton btnInvest;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JButton btnSobre;
    private javax.swing.JButton btnTrans;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}


