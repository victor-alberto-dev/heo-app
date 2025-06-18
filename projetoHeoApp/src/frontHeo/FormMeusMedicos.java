/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontHeo;

import heoApp.Medico;
import heoApp.RegistroManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormMeusMedicos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormMeusMedicos.class.getName());

    private RegistroManager registroManager;
    private javax.swing.DefaultListModel<String> modeloListaMedicos;
    
    public FormMeusMedicos(RegistroManager registroManager) {
        initComponents();
        modeloListaMedicos = new javax.swing.DefaultListModel<>();
        listaMedicos.setModel(modeloListaMedicos);
        this.registroManager = registroManager;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        atualizarListaMedicos();
    }

    public void atualizarListaMedicos() {
        modeloListaMedicos.clear(); 
        for (Medico medico : registroManager.getMedicos()) {
            modeloListaMedicos.addElement("Nome: " + medico.getNome() + " | Especialidade: " + medico.getEspecialidade());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloMeusMedicos = new javax.swing.JLabel();
        botaoCadastrarNovoMedico = new javax.swing.JButton();
        botaoExcluirMedico = new javax.swing.JButton();
        painelMedicos = new javax.swing.JScrollPane();
        listaMedicos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloMeusMedicos.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        tituloMeusMedicos.setText("Meus Médicos");

        botaoCadastrarNovoMedico.setText("Cadastrar Médico");
        botaoCadastrarNovoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarNovoMedicoActionPerformed(evt);
            }
        });

        botaoExcluirMedico.setText("Excluir Médico");
        botaoExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirMedicoActionPerformed(evt);
            }
        });

        painelMedicos.setViewportView(listaMedicos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloMeusMedicos)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelMedicos)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoCadastrarNovoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(botaoExcluirMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloMeusMedicos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarNovoMedico)
                    .addComponent(botaoExcluirMedico))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarNovoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarNovoMedicoActionPerformed
        FormCadastrarMedico form = new FormCadastrarMedico(registroManager, this);
        form.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarNovoMedicoActionPerformed

    private void botaoExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirMedicoActionPerformed

        if (!registroManager.getMedicos().isEmpty()){
            FormExcluirMedico form = new FormExcluirMedico(registroManager, this);
            form.setVisible(true); 
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum Médico cadastrado.", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botaoExcluirMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarNovoMedico;
    private javax.swing.JButton botaoExcluirMedico;
    private javax.swing.JList<String> listaMedicos;
    private javax.swing.JScrollPane painelMedicos;
    private javax.swing.JLabel tituloMeusMedicos;
    // End of variables declaration//GEN-END:variables
}
