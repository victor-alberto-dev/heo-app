/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontHeo;

import heoApp.Medico;
import heoApp.RegistroManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormCadastrarMedico extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormCadastrarMedico.class.getName());

   private RegistroManager registroManager;
   private FormMeusMedicos formMeusMedicos;
   
    public FormCadastrarMedico(RegistroManager registroManager, FormMeusMedicos formMeusMedicos) {
        initComponents();
        this.registroManager = registroManager;
        this.formMeusMedicos = formMeusMedicos;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNomeMedico = new javax.swing.JLabel();
        textNomeMedico = new javax.swing.JTextField();
        labelEspecialidadeMedico = new javax.swing.JLabel();
        textEspecialidadeMedico = new javax.swing.JTextField();
        tituloExame = new javax.swing.JLabel();
        labelErro = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNomeMedico.setText("Nome do Médico:");

        textNomeMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeMedicoActionPerformed(evt);
            }
        });

        labelEspecialidadeMedico.setText("Especialidade do Médico:");

        tituloExame.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        tituloExame.setText("Cadastrar Médico");

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
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomeMedico)
                                .addGap(18, 18, 18)
                                .addComponent(textNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEspecialidadeMedico)
                                .addGap(18, 18, 18)
                                .addComponent(textEspecialidadeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tituloExame)
                        .addGap(86, 86, 86))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(botaoSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(labelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloExame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeMedico))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEspecialidadeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEspecialidadeMedico))
                .addGap(30, 30, 30)
                .addComponent(labelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoSalvar)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        String nome = textNomeMedico.getText().trim();
        String data = textEspecialidadeMedico.getText().trim();

        if (nome.isEmpty() || data.isEmpty()) {
            labelErro.setText("PREENCHA TODOS OS CAMPOS.");
            labelErro.setVisible(true);
            return;
        } else {
            Medico novoMedico = new Medico(nome, data);
            registroManager.adicionarMedico(novoMedico);
            formMeusMedicos.atualizarListaMedicos();
            JOptionPane.showMessageDialog(this, "Médico cadastrado com sucesso!");
            dispose();
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void textNomeMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeMedicoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel labelErro;
    private javax.swing.JLabel labelEspecialidadeMedico;
    private javax.swing.JLabel labelNomeMedico;
    private javax.swing.JTextField textEspecialidadeMedico;
    private javax.swing.JTextField textNomeMedico;
    private javax.swing.JLabel tituloExame;
    // End of variables declaration//GEN-END:variables
}
