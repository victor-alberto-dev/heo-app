/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontHeo;

import heoApp.RegistroManager;
import heoApp.Vacina;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormCadastrarVacina extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormCadastrarVacina.class.getName());
    
    private RegistroManager registroManager;
    private FormVacinas formVacinas;

    public FormCadastrarVacina(RegistroManager registroManager, FormVacinas formVacinas) {
        initComponents();
        this.registroManager = registroManager;
        this.formVacinas = formVacinas;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloVacinas = new javax.swing.JLabel();
        labelNomeVacina = new javax.swing.JLabel();
        labelDataDose = new javax.swing.JLabel();
        textNomeVacina = new javax.swing.JTextField();
        textDataDose = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        labelErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloVacinas.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        tituloVacinas.setText("Cadastrar Vacina");

        labelNomeVacina.setText("Nome da Vacina:");

        labelDataDose.setText("Data da Dose:");

        textNomeVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeVacinaActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloVacinas)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(botaoSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDataDose)
                                .addGap(18, 18, 18)
                                .addComponent(textDataDose, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomeVacina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textNomeVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(labelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(tituloVacinas)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeVacina)
                    .addComponent(textNomeVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataDose)
                    .addComponent(textDataDose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(labelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoSalvar)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        String nome = textNomeVacina.getText().trim();
        String data = textDataDose.getText().trim();

        if (nome.isEmpty() || data.isEmpty()) {
            labelErro.setText("PREENCHA TODOS OS CAMPOS.");
            labelErro.setVisible(true);
            return;
        } else {
            Vacina novaVacina = new Vacina(nome, data);
            registroManager.adicionarVacina(novaVacina);
            formVacinas.atualizarListaVacinas();
            JOptionPane.showMessageDialog(this, "Vacina cadastrada com sucesso!");
            dispose();
        } 
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void textNomeVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeVacinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeVacinaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel labelDataDose;
    private javax.swing.JLabel labelErro;
    private javax.swing.JLabel labelNomeVacina;
    private javax.swing.JTextField textDataDose;
    private javax.swing.JTextField textNomeVacina;
    private javax.swing.JLabel tituloVacinas;
    // End of variables declaration//GEN-END:variables
}
