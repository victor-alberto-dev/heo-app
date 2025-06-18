/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontHeo;

import heoApp.RegistroManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormExcluirMedico extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormExcluirMedico.class.getName());
    
    private RegistroManager registroManager;
    private FormMeusMedicos formMeusMedicos;
    private javax.swing.DefaultListModel<String> modelo;
    
    public FormExcluirMedico(RegistroManager registroManager, FormMeusMedicos formMeusMedicos) {
        initComponents();
        modelo = new javax.swing.DefaultListModel<>();
        for (int i = 0; i < registroManager.getMedicos().size(); i++) {
            var v = registroManager.getMedicos().get(i);
            modelo.addElement("Nome: " + v.getNome() + " | Especialidade: " + v.getEspecialidade());
        }
        listaMedicos.setModel(modelo);
        this.registroManager = registroManager;
        this.formMeusMedicos = formMeusMedicos;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        painelMeusMedicos = new javax.swing.JScrollPane();
        listaMedicos = new javax.swing.JList<>();
        botaoExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTitulo.setText("Selecione o médico que deseja excluir:");

        painelMeusMedicos.setViewportView(listaMedicos);

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo)
                    .addComponent(painelMeusMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(botaoExcluir)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelMeusMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botaoExcluir)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        int indiceSelecionado = listaMedicos.getSelectedIndex();
        if (indiceSelecionado != -1) {
            registroManager.removerMedico(indiceSelecionado);
            formMeusMedicos.atualizarListaMedicos();
            JOptionPane.showMessageDialog(this, "Médico excluído com sucesso!");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um médico para excluir.", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listaMedicos;
    private javax.swing.JScrollPane painelMeusMedicos;
    // End of variables declaration//GEN-END:variables
}
