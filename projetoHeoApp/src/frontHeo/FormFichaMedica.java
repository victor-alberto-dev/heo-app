/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontHeo;

import heoApp.FichaMedica;
import heoApp.RegistroManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormFichaMedica extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormFichaMedica.class.getName());
    
    private RegistroManager registroManager; 
    private FichaMedica ficha;
    /**
     * Creates new form FormFichaMedica
     */
    public FormFichaMedica(RegistroManager registroManager) {
        initComponents();
        this.registroManager = registroManager;
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloFicha = new javax.swing.JLabel();
        botaoVisualizarFicha = new javax.swing.JButton();
        botaoCadastrarFicha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloFicha.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        tituloFicha.setText("Ficha Médica");

        botaoVisualizarFicha.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        botaoVisualizarFicha.setText("Visualizar Ficha Médica");
        botaoVisualizarFicha.setPreferredSize(new java.awt.Dimension(126, 21));
        botaoVisualizarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizarFichaActionPerformed(evt);
            }
        });

        botaoCadastrarFicha.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        botaoCadastrarFicha.setText("Cadastrar Ficha Médica");
        botaoCadastrarFicha.setMaximumSize(new java.awt.Dimension(196, 21));
        botaoCadastrarFicha.setMinimumSize(new java.awt.Dimension(196, 21));
        botaoCadastrarFicha.setPreferredSize(new java.awt.Dimension(126, 21));
        botaoCadastrarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarFichaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoCadastrarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVisualizarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(tituloFicha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tituloFicha)
                .addGap(51, 51, 51)
                .addComponent(botaoVisualizarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(botaoCadastrarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVisualizarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizarFichaActionPerformed
        if (registroManager.getFichaMedica() == null){
            JOptionPane.showMessageDialog(this, "Nenhuma Ficha Médica foi cadastrada ainda.", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            //Cria variavel ficha e atribui a ficha medica cadastrada no regisdtroManager
            FichaMedica ficha = registroManager.getFichaMedica();
            //Mostra a ficha que foi cadastrada
            new FormVisualizarFichaCadastrada(registroManager, ficha).setVisible(true);
        }
        
    }//GEN-LAST:event_botaoVisualizarFichaActionPerformed

    private void botaoCadastrarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarFichaActionPerformed
        new FormCadastrarFicha(registroManager).setVisible(true);
    }//GEN-LAST:event_botaoCadastrarFichaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrarFicha;
    private javax.swing.JButton botaoVisualizarFicha;
    private javax.swing.JLabel tituloFicha;
    // End of variables declaration//GEN-END:variables
}
