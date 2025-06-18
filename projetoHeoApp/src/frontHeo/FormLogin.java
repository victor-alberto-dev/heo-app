/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontHeo;

import heoApp.FichaMedica;
import heoApp.RegistroManager;
import heoApp.Usuario;
import heoApp.UsuarioManager;
import javax.swing.JOptionPane;



// LINKAR TODOS OS DADOS A UM ID PARA CADA USUARIO CADASTRADO





public class FormLogin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormLogin.class.getName());

    private UsuarioManager usuarioManager;
    private RegistroManager registroManager; 
    private static FichaMedica ficha;
    
    public FormLogin(UsuarioManager usuarioManager, RegistroManager registroManager, FichaMedica ficha) {
        initComponents();
        this.usuarioManager = usuarioManager;
        this.registroManager = registroManager;
        this.ficha = ficha;
        setLocationRelativeTo(null);
        labelMensagemErro.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo1 = new javax.swing.JLabel();
        labelTitulo2 = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();
        labelMensagemErro = new javax.swing.JLabel();
        botaoEntrar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo1.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        labelTitulo1.setText("HEO");

        labelTitulo2.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        labelTitulo2.setText("Histórico de Exames Online");

        labelEmail.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        labelEmail.setText("Email:");

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });

        labelSenha.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        labelSenha.setText("Senha:");

        textSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenhaActionPerformed(evt);
            }
        });

        labelMensagemErro.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        botaoEntrar.setText("Entrar");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(labelMensagemErro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(41, 41, 41)
                                            .addComponent(botaoCadastrar)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(labelTitulo1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(labelTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitulo2)
                        .addGap(41, 41, 41)
                        .addComponent(labelEmail))
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMensagemErro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEntrar)
                    .addComponent(botaoCadastrar))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        
    }//GEN-LAST:event_textEmailActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        try {
            String email = textEmail.getText();
            String senha = textSenha.getText();
            
            Usuario usuario = usuarioManager.autenticar(email, senha);
            
            if (usuario != null) {
                new FormMenu(registroManager, ficha).setVisible(true);
                labelMensagemErro.setVisible(false);
            } else if (email.isEmpty() || senha.isEmpty()){
                labelMensagemErro.setText("Preencha todos os campos");
                labelMensagemErro.setVisible(true);
            } else {
                labelMensagemErro.setText("Usuário ou Senha inválido!");
                labelMensagemErro.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao tentar fazer login.\n" + e.getMessage());
        }   
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void textSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenhaActionPerformed
        
    }//GEN-LAST:event_textSenhaActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        new FormCadastroUsuario(usuarioManager).setVisible(true);
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    public static void main(String args[]) {
        UsuarioManager usuarioManager = new UsuarioManager();
        RegistroManager registroManager = new RegistroManager();
        usuarioManager.carregarDeCSV("usuarios.csv");
        java.awt.EventQueue.invokeLater(() -> new FormLogin(usuarioManager, registroManager, ficha).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelMensagemErro;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JTextField textEmail;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables
}
