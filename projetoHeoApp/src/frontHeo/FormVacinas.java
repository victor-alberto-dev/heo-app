/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontHeo;

import heoApp.RegistroManager;
import heoApp.Vacina;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormVacinas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormVacinas.class.getName());

    private RegistroManager registroManager;
    private javax.swing.DefaultListModel<String> modeloListaVacinas;

    public FormVacinas(RegistroManager registroManager) {
        initComponents();
        modeloListaVacinas = new javax.swing.DefaultListModel<>();
        listaVacinas.setModel(modeloListaVacinas);
        this.registroManager = registroManager;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        atualizarListaVacinas();
    }
    
    public void atualizarListaVacinas() {
        modeloListaVacinas.clear(); 
        for (Vacina vacina : registroManager.getVacinas()) {
            modeloListaVacinas.addElement("Vacina: " + vacina.getNome() + " | Data da dose: " + vacina.getData());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloVacinas = new javax.swing.JLabel();
        botaoCadastrarNovaVacina = new javax.swing.JButton();
        botaExcluirVacina = new javax.swing.JButton();
        painelVacinas = new javax.swing.JScrollPane();
        listaVacinas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloVacinas.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        tituloVacinas.setText("Vacinas");

        botaoCadastrarNovaVacina.setText("Cadastrar Vacina");
        botaoCadastrarNovaVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarNovaVacinaActionPerformed(evt);
            }
        });

        botaExcluirVacina.setText("Excluir Vacina");
        botaExcluirVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaExcluirVacinaActionPerformed(evt);
            }
        });

        painelVacinas.setViewportView(listaVacinas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(painelVacinas)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(111, 111, 111)
                            .addComponent(tituloVacinas))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botaoCadastrarNovaVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(botaExcluirVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloVacinas)
                .addGap(8, 8, 8)
                .addComponent(painelVacinas, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarNovaVacina)
                    .addComponent(botaExcluirVacina))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarNovaVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarNovaVacinaActionPerformed
        FormCadastrarVacina form = new FormCadastrarVacina(registroManager, this);
        form.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarNovaVacinaActionPerformed

    private void botaExcluirVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaExcluirVacinaActionPerformed
        if (!registroManager.getVacinas().isEmpty()){
            FormExcluirVacina form = new FormExcluirVacina(registroManager, this);
            form.setVisible(true); 
        } else {
            JOptionPane.showMessageDialog(this, "Nenhuma Vacina cadastrada.", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botaExcluirVacinaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaExcluirVacina;
    private javax.swing.JButton botaoCadastrarNovaVacina;
    private javax.swing.JList<String> listaVacinas;
    private javax.swing.JScrollPane painelVacinas;
    private javax.swing.JLabel tituloVacinas;
    // End of variables declaration//GEN-END:variables
}
