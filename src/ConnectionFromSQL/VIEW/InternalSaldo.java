/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ConnectionFromSQL.VIEW;

import ConnectionFromSQL.DAO.UsuarioDAO;
import ConnectionFromSQL.DTO.UsuarioDTO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mathe
 */
public class InternalSaldo extends javax.swing.JInternalFrame {


    
    /**
     * Creates new form InternalSaldo
     */
    public InternalSaldo() {
        initComponents();
        
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
        campoNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoSaldo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        toggleSaldo = new javax.swing.JToggleButton();
        campoSaldo1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setMaximumSize(new java.awt.Dimension(990, 766));
        setMinimumSize(new java.awt.Dimension(990, 766));
        setPreferredSize(new java.awt.Dimension(990, 766));

        jPanel1.setBackground(new java.awt.Color(20, 26, 38));
        jPanel1.setMaximumSize(new java.awt.Dimension(990, 766));
        jPanel1.setMinimumSize(new java.awt.Dimension(990, 766));
        jPanel1.setPreferredSize(new java.awt.Dimension(990, 766));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoNome.setEditable(false);
        campoNome.setBackground(new java.awt.Color(232, 246, 248));
        campoNome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        campoNome.setForeground(new java.awt.Color(0, 0, 0));
        campoNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 22, 978, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("R$");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, 87));

        campoSaldo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        campoSaldo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(campoSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 170, 40));
        campoSaldo.setVisible(false);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Saldo bancário");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 978, -1));

        toggleSaldo.setBackground(new java.awt.Color(20, 26, 38));
        toggleSaldo.setForeground(new java.awt.Color(255, 255, 255));
        toggleSaldo.setSelected(true);
        toggleSaldo.setText("Revelar");
        toggleSaldo.setToolTipText("");
        toggleSaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toggleSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleSaldoActionPerformed(evt);
            }
        });
        jPanel1.add(toggleSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 140, 50));

        campoSaldo1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        campoSaldo1.setForeground(new java.awt.Color(255, 255, 255));
        campoSaldo1.setText("****");
        campoSaldo1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        campoSaldo1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(campoSaldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/imagens/rubik_bg.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toggleSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleSaldoActionPerformed
        // TODO add your handling code here:
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
            toggleSaldo.setForeground(Color.white);
        }
    }//GEN-LAST:event_toggleSaldoActionPerformed
    public void listarSaldo(){        
        /*Método responsavel por imprimir na interface grafica as informações
        recebidas pelo retorno do UsuarioDAO
        */
        UsuarioDTO user = new UsuarioDTO();
        try {
            /*chama a classe que guarda mesmo que brevenmente só para comparar
            com o banco de dados*/
            UsuarioDAO objUsuarioDAO = new UsuarioDAO();
            
            /*Cria um Array com os valores retornados pelo UsuarioDAO*/
            UsuarioDTO UserSaldo = objUsuarioDAO.PerfilSaldo();
                    campoNome.setText(UserSaldo.getId_nome());
                    /* Os campos acima não necessitaram de conversão pois são
                    do tipo String, já o abaixo sofreu conversão para String*/
                    float saldo = UserSaldo.getId_saldo();
                    String saldoString = String.valueOf(saldo);
                    campoSaldo.setText(saldoString);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar erro" 
            + erro);
        }
        
         
           
              
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel campoSaldo;
    private javax.swing.JLabel campoSaldo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton toggleSaldo;
    // End of variables declaration//GEN-END:variables

    private String toString(float id_saldo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
