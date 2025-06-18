/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontHeo;

import heoApp.RegistroManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormExcluirExame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormExcluirExame.class.getName());

    private RegistroManager registroManager;
    private FormExames formExames;
    private javax.swing.DefaultListModel<String> modelo;
    
    public FormExcluirExame(RegistroManager registroManager, FormExames formExames) {
        initComponents();
        modelo = new javax.swing.DefaultListModel<>();
        for (int i = 0; i < registroManager.getExames().size(); i++) {
            var v = registroManager.getExames().get(i);
            modelo.addElement("Exame: " + v.getNome() + " | Data do exame: " + v.getData());
        }
        listaExames.setModel(modelo);
        this.registroManager = registroManager;
        this.formExames = formExames;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoExcluir = new javax.swing.JButton();
        painelExames = new javax.swing.JScrollPane();
        listaExames = new javax.swing.JList<>();
        labelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        painelExames.setViewportView(listaExames);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTitulo.setText("Selecione o exame que deseja excluir:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo)
                    .addComponent(painelExames, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(botaoExcluir)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelExames, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botaoExcluir)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        int indiceSelecionado = listaExames.getSelectedIndex();
        if (indiceSelecionado != -1) {
            registroManager.removerExame(indiceSelecionado);
            formExames.atualizarListaExames();
            JOptionPane.showMessageDialog(this, "Exame excluído com sucesso!");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um exame para excluir.", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listaExames;
    private javax.swing.JScrollPane painelExames;
    // End of variables declaration//GEN-END:variables
}
