/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontHeo;

import heoApp.Exame;
import heoApp.RegistroManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormCadastrarExame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormCadastrarExame.class.getName());

    private RegistroManager registroManager;
    private FormExames formExames;
    
    public FormCadastrarExame(RegistroManager registroManager, FormExames formExames) {
        initComponents();
        this.registroManager = registroManager;
        this.formExames = formExames;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNomeExame = new javax.swing.JLabel();
        textNomeExame = new javax.swing.JTextField();
        labelDataExame = new javax.swing.JLabel();
        textDataExame = new javax.swing.JTextField();
        tituloExame = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();
        labelErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNomeExame.setText("Nome do Exame:");

        textNomeExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeExameActionPerformed(evt);
            }
        });

        labelDataExame.setText("Data do Exame:");

        tituloExame.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        tituloExame.setText("Cadastrar Exame");

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoSalvar)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomeExame)
                                .addGap(18, 18, 18)
                                .addComponent(textNomeExame, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDataExame)
                                .addGap(18, 18, 18)
                                .addComponent(textDataExame, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tituloExame)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloExame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNomeExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeExame))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDataExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataExame))
                .addGap(30, 30, 30)
                .addComponent(labelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoSalvar)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        String nome = textNomeExame.getText().trim();
        String data = textDataExame.getText().trim();

        if (nome.isEmpty() || data.isEmpty()) {
            labelErro.setText("PREENCHA TODOS OS CAMPOS.");
            labelErro.setVisible(true);
            return;
        } else {
            Exame novoExame = new Exame(nome, data);
            registroManager.adicionarExame(novoExame);
            formExames.atualizarListaExames();
            JOptionPane.showMessageDialog(this, "Exame cadastrado com sucesso!");
            dispose();
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void textNomeExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeExameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeExameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel labelDataExame;
    private javax.swing.JLabel labelErro;
    private javax.swing.JLabel labelNomeExame;
    private javax.swing.JTextField textDataExame;
    private javax.swing.JTextField textNomeExame;
    private javax.swing.JLabel tituloExame;
    // End of variables declaration//GEN-END:variables
}
