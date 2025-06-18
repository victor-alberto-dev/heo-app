/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontHeo;

import heoApp.FichaMedica;
import heoApp.RegistroManager;

public class FormMenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormMenu.class.getName());
    
    private RegistroManager registroManager; 
    private FichaMedica ficha;
    
    public FormMenu(RegistroManager registroManager, FichaMedica ficha) {
        initComponents();
        this.registroManager = registroManager;
        this.ficha = ficha;
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloMenu = new javax.swing.JLabel();
        botaoFicha = new javax.swing.JButton();
        botaoVacinas = new javax.swing.JButton();
        botaoExames = new javax.swing.JButton();
        botaoMeusMedicos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloMenu.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        tituloMenu.setText("MENU");

        botaoFicha.setText("Ficha Médica");
        botaoFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFichaActionPerformed(evt);
            }
        });

        botaoVacinas.setText("Vacinas");
        botaoVacinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVacinasActionPerformed(evt);
            }
        });

        botaoExames.setText("Exames");
        botaoExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExamesActionPerformed(evt);
            }
        });

        botaoMeusMedicos.setText("Meus Médicos");
        botaoMeusMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMeusMedicosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoExames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoFicha, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoVacinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoMeusMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(tituloMenu)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloMenu)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoVacinas, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(botaoFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExames, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoMeusMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMeusMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMeusMedicosActionPerformed
        new FormMeusMedicos(registroManager).setVisible(true);
    }//GEN-LAST:event_botaoMeusMedicosActionPerformed

    private void botaoFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFichaActionPerformed
        new FormFichaMedica(registroManager).setVisible(true);
    }//GEN-LAST:event_botaoFichaActionPerformed

    private void botaoVacinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVacinasActionPerformed
        new FormVacinas(registroManager).setVisible(true);
    }//GEN-LAST:event_botaoVacinasActionPerformed

    private void botaoExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExamesActionPerformed
        new FormExames(registroManager).setVisible(true);
    }//GEN-LAST:event_botaoExamesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExames;
    private javax.swing.JButton botaoFicha;
    private javax.swing.JButton botaoMeusMedicos;
    private javax.swing.JButton botaoVacinas;
    private javax.swing.JLabel tituloMenu;
    // End of variables declaration//GEN-END:variables
}
