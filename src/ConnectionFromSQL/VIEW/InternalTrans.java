/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ConnectionFromSQL.VIEW;

import ConnectionFromSQL.DAO.UsuarioDAO;
import ConnectionFromSQL.DTO.UsuarioDTO;
import java.awt.Color;
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
        listarSaldo();
        
    }
    
    private void RegistrarTransfPix() {
        String chaveDest = chavePix.getText().toUpperCase();
        float registroValorTransf = Float.parseFloat(valorPix.getText());
       

        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        objUsuarioDTO.setChavePixBD(chaveDest);
        objUsuarioDTO.setId_valorTransPix(registroValorTransf);
        
        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        objUsuarioDAO.RegistraData();
        objUsuarioDAO.RegistrarTransfPIX(objUsuarioDTO);
    }

    private void RegistrarTransfTed() {
        
        int contaDestino = Integer.parseInt(contaTrans.getText());
        int agenciaDestino = Integer.parseInt(agenciaTrans.getText());
        float registroValorTransf = Float.parseFloat(valorTD.getText());
        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        objUsuarioDAO.RegistraData();
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
        toggleSaldo = new javax.swing.JToggleButton();
        campoSaldo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoSaldo1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(990, 766));
        setMinimumSize(new java.awt.Dimension(990, 766));
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

        chavePix.setBackground(new java.awt.Color(255, 255, 255));
        chavePix.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        chavePix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        chavePix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                chavePixKeyTyped(evt);
            }
        });
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

        valorPix.setBackground(new java.awt.Color(255, 255, 255));
        valorPix.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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

        contaTrans.setBackground(new java.awt.Color(255, 255, 255));
        contaTrans.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        contaTrans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contaTrans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contaTransKeyTyped(evt);
            }
        });
        PainelTEDDOC.add(contaTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 134, 436, 35));

        agenciaTrans.setBackground(new java.awt.Color(255, 255, 255));
        agenciaTrans.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        agenciaTrans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agenciaTrans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agenciaTransKeyTyped(evt);
            }
        });
        PainelTEDDOC.add(agenciaTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 227, 436, 35));

        valorTD.setBackground(new java.awt.Color(255, 255, 255));
        valorTD.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("R$");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 30, 30));

        toggleSaldo.setSelected(true);
        toggleSaldo.setText("Revelar");
        toggleSaldo.setToolTipText("");
        toggleSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleSaldoActionPerformed(evt);
            }
        });
        jPanel1.add(toggleSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        campoSaldo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        campoSaldo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(campoSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 80, 30));
        campoSaldo.setVisible(false);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Saldo bancário");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 978, 20));

        campoSaldo1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        campoSaldo1.setForeground(new java.awt.Color(255, 255, 255));
        campoSaldo1.setText("****");
        campoSaldo1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(campoSaldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, 20));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/imagens/rubik_bg.png"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(990, 766));
        background.setMinimumSize(new java.awt.Dimension(990, 766));
        background.setPreferredSize(new java.awt.Dimension(990, 766));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 740));

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
        UsuarioDAO userDAO = new UsuarioDAO();
        UsuarioDTO userDTO = new UsuarioDTO();
        //conversões
        String contaString = contaTrans.getText();
        String agenciaString = agenciaTrans.getText();
        int contaInt = Integer.parseInt(contaString);
        int agenciaInt = Integer.parseInt(agenciaString);
        //conversões
        userDTO.setId_contaDestinatario(contaInt);
        userDTO.setId_agenciaDestinatario(agenciaInt);
        userDAO.VerificaDestinatarioSelf();
        userDAO.VerificaDestinatarioTD();
        userDAO.Verifica(userDTO);
        
        boolean TDDest = userDTO.isDestinatarioEncontradoTD();
        boolean Self = true;        
        String senha = JOptionPane.showInputDialog("Digite sua senha");
        String senhaDTO = userDTO.getSenhaBancoDeDados();
        
        System.out.println(userDTO.getContaSelf() + " " + userDTO.getAgenciaSelf());
        
        if (contaInt == userDTO.getContaSelf() && agenciaInt == userDTO.getAgenciaSelf()){
            Self = true;
        }else if (contaInt != userDTO.getContaSelf() && agenciaInt != userDTO.getAgenciaSelf()){
            Self = false;
        }
        
        if(senha.equals(senhaDTO) && TDDest == true && Self == false){            
            RegistrarTransfTed();
            LimparCampo();
            listarSaldo();        
        }else if (TDDest == false){
            JOptionPane.showMessageDialog(null, "Conta ou Agencia invalida");
        }else if (!senha.equals(senhaDTO)){
            JOptionPane.showMessageDialog(null, "Senha incorreta");
        }else if (Self == true){
            JOptionPane.showMessageDialog(null, "Você não pode enviar valores a sí proprio");
            LimparCampo();
        }else{
            JOptionPane.showConfirmDialog(null, "ERROR");
        }
    }//GEN-LAST:event_enviarBtnTDActionPerformed

    private void enviarBtnPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBtnPixActionPerformed
        // TODO add your handling code here:
        UsuarioDAO userDAO = new UsuarioDAO();
        UsuarioDTO userDTO = new UsuarioDTO();
        userDTO.setChavePixBD(chavePix.getText().toUpperCase());
        userDAO.VerificaDestinatarioCHAVEP();
        userDAO.Verifica(userDTO);
        userDAO.SelfVerificador();
        boolean CPFDest = userDTO.DestinatarioEncontrado;
        boolean Self = true;
        String ChaveSelf = userDTO.getPixSelf();        
        String ChaveInputSelf = chavePix.getText().toUpperCase();
        
        String senha = JOptionPane.showInputDialog("Digite sua senha");
        String senhaDTO = userDTO.getSenhaBancoDeDados();
        System.out.println(userDTO.getPixSelf());
        //Verificador de conta
        if(ChaveInputSelf.equals(ChaveSelf)){
            Self = true;
        }else if (!chavePix.getText().equals(userDTO.getCpf_login())){
            Self = false;
        }
        
        ////////////
        
        if(senha.equals(senhaDTO) && CPFDest == true && Self == false){
            RegistrarTransfPix();
            LimparCampo();
            listarSaldo();        
        }else if (CPFDest == false){
            JOptionPane.showMessageDialog(null, "Chave Pix invalida");
        }else if (!senha.equals(senhaDTO)){
            JOptionPane.showMessageDialog(null, "Senha incorreta");
        }else if (Self == true){
            JOptionPane.showMessageDialog(null, "Você não pode enviar valores a sí proprio");
            LimparCampo();
        }else if (ChaveInputSelf.isBlank() || ChaveInputSelf.isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo da Chave pix esta vazio.");
        }
        else{
            JOptionPane.showConfirmDialog(null, "ERROR");
        }
    }//GEN-LAST:event_enviarBtnPixActionPerformed

    private void toggleSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleSaldoActionPerformed
        
        if(toggleSaldo.isSelected()){
            campoSaldo.setVisible(false);
            campoSaldo1.setVisible(true);
            campoSaldo1.setForeground(Color.WHITE);
            toggleSaldo.setForeground(Color.black);
            toggleSaldo.setText("Revelar");
            
        }else{            
            campoSaldo.setVisible(true);
            campoSaldo1.setVisible(false);
            campoSaldo.setForeground(Color.white);
            toggleSaldo.setText("Ocultar");
            toggleSaldo.setForeground(Color.black);
        }
    }//GEN-LAST:event_toggleSaldoActionPerformed

    private void chavePixKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chavePixKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_chavePixKeyTyped

    private void contaTransKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contaTransKeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_contaTransKeyTyped

    private void agenciaTransKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agenciaTransKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_agenciaTransKeyTyped
                                        
    public void listarSaldo(){        
        /*Método responsavel por imprimir na interface grafica as informações
        recebidas pelo retorno do UsuarioDAO
        */
        UsuarioDTO user = new UsuarioDTO();
        try {
            UsuarioDAO objUsuarioDAO = new UsuarioDAO();
            
            UsuarioDTO UserSaldo = objUsuarioDAO.PerfilSaldoTrnasacoes();       
            float saldo = UserSaldo.getId_saldo();
            String saldoString = String.valueOf(saldo);
            campoSaldo.setText(saldoString);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar erro" 
            + erro);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPix;
    private javax.swing.JPanel PainelTEDDOC;
    private javax.swing.JTextField agenciaTrans;
    private javax.swing.JLabel background;
    private javax.swing.JLabel campoSaldo;
    private javax.swing.JLabel campoSaldo1;
    private javax.swing.JTextField chavePix;
    private javax.swing.JTextField contaTrans;
    private javax.swing.JButton enviarBtnPix;
    private javax.swing.JButton enviarBtnTD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton toggleSaldo;
    private javax.swing.JTextField valorPix;
    private javax.swing.JTextField valorTD;
    // End of variables declaration//GEN-END:variables
}
