/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ConnectionFromSQL.VIEW;

import ConnectionFromSQL.DAO.UsuarioDAO;
import ConnectionFromSQL.DTO.UsuarioDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class InternalTrans extends javax.swing.JInternalFrame {


    /**
     * Creates new form InternalTrans
     */
    public InternalTrans() {
        initComponents();
        
    }
    
    private void RegistrarTransfPix() {
        String cpfDestinatario = chavePix.getText();
        float registroValorTransf = Float.parseFloat(valorPix.getText());
       

        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        objUsuarioDTO.setId_cpfDestinatario(cpfDestinatario);
        objUsuarioDTO.setId_valorTransPix(registroValorTransf);
        
        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        objUsuarioDAO.RegistrarTransfPIX(objUsuarioDTO);
    }

    private void RegistrarTransfTed() {
        int contaDestino = Integer.parseInt(contaTrans.getText());
        int agenciaDestino = Integer.parseInt(agenciaTrans.getText());
        float registroValorTransf = Float.parseFloat(valorTD.getText());
        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        
        UsuarioDTO objUsuarioDTO = objUsuarioDAO.PerfilUser();
        objUsuarioDTO.setId_contaDestinatario(contaDestino);
        objUsuarioDTO.setId_agenciaDestinatario(agenciaDestino);
        objUsuarioDTO.setId_valorTransTED(registroValorTransf);
        objUsuarioDAO.RegistrarTransfTed(objUsuarioDTO);
    }

    
    private void LimparCampo (){
        chavePix.setText("");
        valorPix.setText("");
        contaTrans.setText("");
        agenciaTrans.setText("");
        valorTD.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PainelPix = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        chavePix = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        valorPix = new javax.swing.JTextField();
        enviarBtnPix = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PainelTEDDOC = new javax.swing.JPanel();
        enviarBtnTD = new javax.swing.JButton();
        contaTrans = new javax.swing.JTextField();
        agenciaTrans = new javax.swing.JTextField();
        valorTD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(990, 740));
        setMinimumSize(new java.awt.Dimension(990, 740));
        setPreferredSize(new java.awt.Dimension(990, 766));

        jPanel1.setBackground(new java.awt.Color(20, 26, 38));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelPix.setBackground(new java.awt.Color(33, 43, 63));
        PainelPix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(48, 61, 89)));
        PainelPix.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Chave PIX");
        PainelPix.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 93, 436, -1));

        chavePix.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chavePix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PainelPix.add(chavePix, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 133, 436, 35));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PIX");
        jLabel7.setToolTipText("");
        PainelPix.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 41, 436, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Valor");
        PainelPix.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 186, 436, -1));

        valorPix.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        valorPix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PainelPix.add(valorPix, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 226, 436, 35));

        enviarBtnPix.setBackground(new java.awt.Color(46, 58, 86));
        enviarBtnPix.setForeground(new java.awt.Color(255, 255, 255));
        enviarBtnPix.setLabel("Enviar");
        enviarBtnPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBtnPixActionPerformed(evt);
            }
        });
        PainelPix.add(enviarBtnPix, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 371, 70, 35));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/imagens/degradeTransf.png"))); // NOI18N
        PainelPix.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 450));

        jPanel1.add(PainelPix, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 450, 450));

        PainelTEDDOC.setBackground(new java.awt.Color(33, 43, 63));
        PainelTEDDOC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(48, 61, 89)));
        PainelTEDDOC.setPreferredSize(new java.awt.Dimension(450, 450));
        PainelTEDDOC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enviarBtnTD.setBackground(new java.awt.Color(46, 58, 86));
        enviarBtnTD.setForeground(new java.awt.Color(255, 255, 255));
        enviarBtnTD.setText("Enviar");
        enviarBtnTD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        enviarBtnTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBtnTDActionPerformed(evt);
            }
        });
        PainelTEDDOC.add(enviarBtnTD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 373, 70, 35));

        contaTrans.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        contaTrans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PainelTEDDOC.add(contaTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 134, 436, 35));

        agenciaTrans.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        agenciaTrans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PainelTEDDOC.add(agenciaTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 227, 436, 35));

        valorTD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        valorTD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PainelTEDDOC.add(valorTD, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 320, 436, 35));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TED/DOC");
        PainelTEDDOC.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 41, 436, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Conta");
        PainelTEDDOC.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 81, 436, 35));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Agencia");
        PainelTEDDOC.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 187, 436, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Valor");
        PainelTEDDOC.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 280, 436, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/imagens/degradeTransf.png"))); // NOI18N
        PainelTEDDOC.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 450));

        jPanel1.add(PainelTEDDOC, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 450, 450));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/imagens/rubik_bg.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(990, 766));
        jLabel1.setMinimumSize(new java.awt.Dimension(990, 766));
        jLabel1.setPreferredSize(new java.awt.Dimension(990, 766));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarBtnTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBtnTDActionPerformed
        // TODO add your handling code here:
        RegistrarTransfTed();
        LimparCampo();
    }//GEN-LAST:event_enviarBtnTDActionPerformed

    private void enviarBtnPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBtnPixActionPerformed
        // TODO add your handling code here:
        RegistrarTransfPix();
        LimparCampo();
    }//GEN-LAST:event_enviarBtnPixActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPix;
    private javax.swing.JPanel PainelTEDDOC;
    private javax.swing.JTextField agenciaTrans;
    private javax.swing.JTextField chavePix;
    private javax.swing.JTextField contaTrans;
    private javax.swing.JButton enviarBtnPix;
    private javax.swing.JButton enviarBtnTD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField valorPix;
    private javax.swing.JTextField valorTD;
    // End of variables declaration//GEN-END:variables
}
