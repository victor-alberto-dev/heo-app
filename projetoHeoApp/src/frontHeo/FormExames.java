/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontHeo;

import heoApp.Exame;
import heoApp.RegistroManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormExames extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormExames.class.getName());

    private RegistroManager registroManager;
    private javax.swing.DefaultListModel<String> modeloListaExames;
    
    public FormExames(RegistroManager registroManager) {
        initComponents();
        modeloListaExames = new javax.swing.DefaultListModel<>();
        listaExames.setModel(modeloListaExames);
        this.registroManager = registroManager;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        atualizarListaExames();
    }
    
    public void atualizarListaExames() {
        modeloListaExames.clear(); 
        for (Exame exame : registroManager.getExames()) {
            modeloListaExames.addElement("Exame: " + exame.getNome() + " | Data do exame: " + exame.getData());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCadastrarNovoExame = new javax.swing.JButton();
        botaoExcluirExames = new javax.swing.JButton();
        tituloExames = new javax.swing.JLabel();
        painelExames = new javax.swing.JScrollPane();
        listaExames = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoCadastrarNovoExame.setText("Cadastrar Exame");
        botaoCadastrarNovoExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarNovoExameActionPerformed(evt);
            }
        });

        botaoExcluirExames.setText("Excluir Exames");
        botaoExcluirExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirExamesActionPerformed(evt);
            }
        });

        tituloExames.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        tituloExames.setText("Exames");

        painelExames.setViewportView(listaExames);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloExames)
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelExames)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoCadastrarNovoExame, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(botaoExcluirExames, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloExames)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelExames, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrarNovoExame)
                    .addComponent(botaoExcluirExames))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarNovoExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarNovoExameActionPerformed
        FormCadastrarExame form = new FormCadastrarExame(registroManager, this);
        form.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarNovoExameActionPerformed

    private void botaoExcluirExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirExamesActionPerformed
        if (!registroManager.getExames().isEmpty()){
            FormExcluirExame form = new FormExcluirExame(registroManager, this);
            form.setVisible(true); 
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum Exame cadastrado.", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botaoExcluirExamesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarNovoExame;
    private javax.swing.JButton botaoExcluirExames;
    private javax.swing.JList<String> listaExames;
    private javax.swing.JScrollPane painelExames;
    private javax.swing.JLabel tituloExames;
    // End of variables declaration//GEN-END:variables
}
