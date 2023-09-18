package ConnectionFromSQL.VIEW;

import ConnectionFromSQL.DAO.UsuarioDAO;
import ConnectionFromSQL.DTO.UsuarioDTO;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {
    public TelaPrincipal() {
        initComponents();
        legendaTitle.setText("Tela principal");
        legendaTitle.setForeground(Color.white);
        AdicionaInicio();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Home = new javax.swing.JLabel();
        Oculto = new javax.swing.JButton();
        btnSaldo = new javax.swing.JButton();
        btnTrans = new javax.swing.JButton();
        btnHistorico = new javax.swing.JButton();
        btnInvest = new javax.swing.JButton();
        btnChat = new javax.swing.JButton();
        btnSobre = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        MainPanel = new javax.swing.JPanel();
        MainPanelContent = new javax.swing.JPanel();
        Titulo = new javax.swing.JPanel();
        legendaTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(30, 30, 30));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(84, 124, 140));
        jPanel1.setPreferredSize(new java.awt.Dimension(280, 411));

        jPanel2.setBackground(new java.awt.Color(60, 94, 115));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);

        Home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/imagens/rubiklogo.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        Oculto.setBackground(new java.awt.Color(84, 124, 140));
        Oculto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Oculto.setForeground(new java.awt.Color(0, 0, 0));
        Oculto.setToolTipText("");
        Oculto.setBorder(null);
        Oculto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Oculto.setHideActionText(true);
        Oculto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Oculto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Oculto.setIconTextGap(0);
        Oculto.setInheritsPopupMenu(true);
        Oculto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OcultoActionPerformed(evt);
            }
        });

        btnSaldo.setBackground(new java.awt.Color(84, 124, 140));
        btnSaldo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnSaldo.setForeground(new java.awt.Color(0, 0, 0));
        btnSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/imagens/Icons/Saldo.png"))); // NOI18N
        btnSaldo.setText(" Saldo Bancário");
        btnSaldo.setToolTipText("");
        btnSaldo.setBorder(null);
        btnSaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaldo.setHideActionText(true);
        btnSaldo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSaldo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSaldo.setIconTextGap(0);
        btnSaldo.setInheritsPopupMenu(true);
        btnSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaldoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaldoMouseExited(evt);
            }
        });
        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoActionPerformed(evt);
            }
        });

        btnTrans.setBackground(new java.awt.Color(84, 124, 140));
        btnTrans.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnTrans.setForeground(new java.awt.Color(0, 0, 0));
        btnTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/imagens/Icons/Transferencia.png"))); // NOI18N
        btnTrans.setText(" Transferência");
        btnTrans.setBorder(null);
        btnTrans.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrans.setHideActionText(true);
        btnTrans.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTrans.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTrans.setIconTextGap(0);
        btnTrans.setInheritsPopupMenu(true);
        btnTrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTransMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTransMouseExited(evt);
            }
        });
        btnTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransActionPerformed(evt);
            }
        });

        btnHistorico.setBackground(new java.awt.Color(84, 124, 140));
        btnHistorico.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnHistorico.setForeground(new java.awt.Color(0, 0, 0));
        btnHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/imagens/Icons/Historico.png"))); // NOI18N
        btnHistorico.setText(" Histórico");
        btnHistorico.setBorder(null);
        btnHistorico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistorico.setHideActionText(true);
        btnHistorico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHistorico.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHistorico.setIconTextGap(0);
        btnHistorico.setInheritsPopupMenu(true);
        btnHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHistoricoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHistoricoMouseExited(evt);
            }
        });
        btnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoActionPerformed(evt);
            }
        });

        btnInvest.setBackground(new java.awt.Color(84, 124, 140));
        btnInvest.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnInvest.setForeground(new java.awt.Color(0, 0, 0));
        btnInvest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/imagens/Icons/Investimento.png"))); // NOI18N
        btnInvest.setText(" Investimentos");
        btnInvest.setToolTipText("");
        btnInvest.setBorder(null);
        btnInvest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInvest.setHideActionText(true);
        btnInvest.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInvest.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInvest.setIconTextGap(0);
        btnInvest.setInheritsPopupMenu(true);
        btnInvest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInvestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInvestMouseExited(evt);
            }
        });
        btnInvest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvestActionPerformed(evt);
            }
        });

        btnChat.setBackground(new java.awt.Color(84, 124, 140));
        btnChat.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnChat.setForeground(new java.awt.Color(0, 0, 0));
        btnChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/imagens/Icons/Atendimento.png"))); // NOI18N
        btnChat.setText(" Atendimento");
        btnChat.setBorder(null);
        btnChat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChat.setHideActionText(true);
        btnChat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnChat.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnChat.setIconTextGap(0);
        btnChat.setInheritsPopupMenu(true);
        btnChat.setMargin(new java.awt.Insets(3, 14, 3, 14));
        btnChat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChatMouseExited(evt);
            }
        });
        btnChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatActionPerformed(evt);
            }
        });

        btnSobre.setBackground(new java.awt.Color(60, 94, 115));
        btnSobre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSobre.setForeground(new java.awt.Color(255, 255, 255));
        btnSobre.setText("!");
        btnSobre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        sair.setBackground(new java.awt.Color(69, 109, 134));
        sair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sair.setForeground(new java.awt.Color(255, 255, 255));
        sair.setText("Sair");
        sair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sairMouseExited(evt);
            }
        });
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        btnPerfil.setBackground(new java.awt.Color(84, 124, 140));
        btnPerfil.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(0, 0, 0));
        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/imagens/Icons/Perfil.png"))); // NOI18N
        btnPerfil.setText(" Perfil");
        btnPerfil.setToolTipText("");
        btnPerfil.setBorder(null);
        btnPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPerfil.setHideActionText(true);
        btnPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPerfil.setIconTextGap(0);
        btnPerfil.setInheritsPopupMenu(true);
        btnPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPerfilMouseExited(evt);
            }
        });
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTrans, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHistorico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInvest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnChat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Oculto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(btnPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Oculto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnInvest, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnChat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        MainPanel.setBackground(new java.awt.Color(20, 26, 38));

        MainPanelContent.setBackground(new java.awt.Color(20, 26, 38));
        MainPanelContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout MainPanelContentLayout = new javax.swing.GroupLayout(MainPanelContent);
        MainPanelContent.setLayout(MainPanelContentLayout);
        MainPanelContentLayout.setHorizontalGroup(
            MainPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        MainPanelContentLayout.setVerticalGroup(
            MainPanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 764, Short.MAX_VALUE)
        );

        Titulo.setBackground(new java.awt.Color(36, 45, 64));
        Titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(45, 58, 81)));

        legendaTitle.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        legendaTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        legendaTitle.setText("Tela principal");
        legendaTitle.setToolTipText("");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(legendaTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(legendaTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 848, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OcultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OcultoActionPerformed
        setVisible(false);
    }//GEN-LAST:event_OcultoActionPerformed

    private void AdicionaInicio (){
        InternalMain im = new InternalMain();
        MainPanelContent.add(im);
        im.setVisible(true);
    }
    
    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoActionPerformed
        //Chama O jFrame do saldo
        InternalSaldo objInternalSaldo = new InternalSaldo();
        InternalPerfil objInternalPerfil = new InternalPerfil();
        objInternalSaldo.listarSaldo();
        MainPanelContent.add(objInternalSaldo);
        objInternalSaldo.setVisible(true);
        legendaTitle.setText("Saldo bancário");
        legendaTitle.setForeground(Color.white);
        MainPanelContent.remove(0);
    }//GEN-LAST:event_btnSaldoActionPerformed

    private void btnTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransActionPerformed
        //Chama O jFrame da transferencia
        InternalTrans objInternalTrans = new InternalTrans();
        MainPanelContent.add(objInternalTrans);
        objInternalTrans.setVisible(true);    
        legendaTitle.setText("Transações bancarias");
        legendaTitle.setForeground(Color.white);
        MainPanelContent.remove(0);
    }//GEN-LAST:event_btnTransActionPerformed

    private void btnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoActionPerformed
        //Chama O jFrame da historico
        InternalHistorico ih = new InternalHistorico();
        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        
        ih.listarValoresTabelaPIX(objUsuarioDTO.getCpf_login());
        ih.listarValoresTabelaTED(objUsuarioDTO.getCpf_login());
        MainPanelContent.add(ih);
        ih.setVisible(true);
        legendaTitle.setText("Histórico de transações");
        legendaTitle.setForeground(Color.white);
        MainPanelContent.remove(0);
    }//GEN-LAST:event_btnHistoricoActionPerformed

    private void btnInvestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvestActionPerformed
        //Chama O jFrame da investimento
        InternalInvest objInternalInvestimento = new InternalInvest();
        MainPanelContent.add(objInternalInvestimento);
        objInternalInvestimento.setVisible(true);
        UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        legendaTitle.setText("Investimentos bancários");
        legendaTitle.setForeground(Color.white);
        MainPanelContent.remove(0);
    }//GEN-LAST:event_btnInvestActionPerformed

    private void btnChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatActionPerformed
        //Chama O jFrame da atendimento
        InternalChat objInternalChat = new InternalChat();
        MainPanelContent.add(objInternalChat);
        objInternalChat.setVisible(true);
        legendaTitle.setText("Atendimento online");
        legendaTitle.setForeground(Color.white);
        MainPanelContent.remove(0);
    }//GEN-LAST:event_btnChatActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        // Chama o jFrame do sobre        
        InternalSobre objInternalSobre = new InternalSobre();
        MainPanelContent.add(objInternalSobre);
        objInternalSobre.setVisible(true);
        legendaTitle.setText("Sobre");
        legendaTitle.setForeground(Color.white);
        MainPanelContent.remove(0);
    }//GEN-LAST:event_btnSobreActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
         //Chama O jFrame do perfil        
        InternalPerfil objInternalPerfil = new InternalPerfil();
        MainPanelContent.add(objInternalPerfil);
        objInternalPerfil.setVisible(true);
        objInternalPerfil.listarValores();
        legendaTitle.setText("Perfil do usuário");
        legendaTitle.setForeground(Color.white);
        MainPanelContent.remove(0);
        
        
    }//GEN-LAST:event_btnPerfilActionPerformed
    // <editor-fold defaultstate="collapsed" desc="Hovers">


    private void btnPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseEntered
        
        Color hover = new Color(96,132,148);
        btnPerfil.setBackground(hover);
    }//GEN-LAST:event_btnPerfilMouseEntered

    private void btnPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseExited
        
        Color hoverExit = new Color(84,124,140);
        btnPerfil.setBackground(hoverExit);
    }//GEN-LAST:event_btnPerfilMouseExited

    private void btnSaldoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaldoMouseEntered
        Color hover = new Color(96,132,148);
        btnSaldo.setBackground(hover);
    }//GEN-LAST:event_btnSaldoMouseEntered

    private void btnSaldoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaldoMouseExited
        Color hoverExit = new Color(84,124,140);
        btnSaldo.setBackground(hoverExit);
    }//GEN-LAST:event_btnSaldoMouseExited

    private void btnTransMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransMouseEntered
        Color hover = new Color(96,132,148);
        btnTrans.setBackground(hover);
    }//GEN-LAST:event_btnTransMouseEntered

    private void btnTransMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransMouseExited
        Color hoverExit = new Color(84,124,140);
        btnTrans.setBackground(hoverExit);
    }//GEN-LAST:event_btnTransMouseExited

    private void btnHistoricoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoricoMouseEntered
        Color hover = new Color(96,132,148);
        btnHistorico.setBackground(hover);
    }//GEN-LAST:event_btnHistoricoMouseEntered

    private void btnHistoricoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoricoMouseExited
        Color hoverExit = new Color(84,124,140);
        btnHistorico.setBackground(hoverExit);
    }//GEN-LAST:event_btnHistoricoMouseExited

    private void btnInvestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvestMouseEntered
        Color hover = new Color(96,132,148);
        btnInvest.setBackground(hover);
    }//GEN-LAST:event_btnInvestMouseEntered

    private void btnInvestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvestMouseExited
        Color hoverExit = new Color(84,124,140);
        btnInvest.setBackground(hoverExit);
    }//GEN-LAST:event_btnInvestMouseExited

    private void btnChatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChatMouseEntered
        Color hover = new Color(96,132,148);
        btnChat.setBackground(hover);
    }//GEN-LAST:event_btnChatMouseEntered

    private void btnChatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChatMouseExited
        Color hoverExit = new Color(84,124,140);
        btnChat.setBackground(hoverExit);
    }//GEN-LAST:event_btnChatMouseExited

    private void sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseExited
        Color hoverExit = new Color(60, 94, 115);
        sair.setBackground(hoverExit);
    }//GEN-LAST:event_sairMouseExited

    private void sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseEntered
        Color hover = new Color(69, 109, 134);
        sair.setBackground(hover);
    }//GEN-LAST:event_sairMouseEntered

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        legendaTitle.setText("Tela Principal");
        legendaTitle.setForeground(Color.white);
        InternalMain im = new InternalMain();
        MainPanelContent.add(im);
        im.setVisible(true);
        MainPanelContent.remove(0);
    }//GEN-LAST:event_HomeMouseClicked
    
    
// </editor-fold>
    
       
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
    private javax.swing.JLabel Home;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MainPanelContent;
    private javax.swing.JButton Oculto;
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton btnChat;
    private javax.swing.JButton btnHistorico;
    private javax.swing.JButton btnInvest;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JButton btnSobre;
    private javax.swing.JButton btnTrans;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel legendaTitle;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}


