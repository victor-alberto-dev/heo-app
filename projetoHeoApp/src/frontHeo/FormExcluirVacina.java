/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontHeo;

import heoApp.RegistroManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormExcluirVacina extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormExcluirVacina.class.getName());

    private RegistroManager registroManager;
    private FormVacinas formVacinas;
    javax.swing.DefaultListModel<String> modelo; 
    
    public FormExcluirVacina(RegistroManager registroManager, FormVacinas formVacinas) {
        initComponents();
        modelo = new javax.swing.DefaultListModel<>();
        for (int i = 0; i < registroManager.getVacinas().size(); i++) {
            var v = registroManager.getVacinas().get(i);
            modelo.addElement("Vacina: " + v.getNome() + " | Data da Dose: " + v.getData());
        }
        listaVacinas.setModel(modelo);
        this.registroManager = registroManager;
        this.formVacinas = formVacinas;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelVacinas = new javax.swing.JScrollPane();
        listaVacinas = new javax.swing.JList<>();
        labelTitulo = new javax.swing.JLabel();
        botaoExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelVacinas.setViewportView(listaVacinas);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTitulo.setText("Selecione a vacina que deseja excluir:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo)
                            .addComponent(painelVacinas, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(botaoExcluir)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelVacinas, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botaoExcluir)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        int indiceSelecionado = listaVacinas.getSelectedIndex();
        if (indiceSelecionado != -1) {
            registroManager.removerVacina(indiceSelecionado);
            formVacinas.atualizarListaVacinas();
            JOptionPane.showMessageDialog(this, "Vacina excluída com sucesso!");
            dispose(); 
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma vacina para excluir.", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList<String> listaVacinas;
    private javax.swing.JScrollPane painelVacinas;
    // End of variables declaration//GEN-END:variables
}
