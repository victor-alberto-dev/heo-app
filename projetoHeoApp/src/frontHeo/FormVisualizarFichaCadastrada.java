/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontHeo;

import heoApp.FichaMedica;
import heoApp.RegistroManager;
import javax.swing.JFrame;

public class FormVisualizarFichaCadastrada extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormVisualizarFichaCadastrada.class.getName());
    
    private RegistroManager registroManager; 
    private FichaMedica ficha;
    
    public FormVisualizarFichaCadastrada(RegistroManager registroManager, FichaMedica ficha) {
        initComponents();
        this.registroManager = registroManager;
        this.ficha = ficha;
        if (ficha != null) {
            labelNomeCadastrado.setText(ficha.getNome());
            labelDataNascimentoCadastrado.setText(ficha.getDataNascimento());
            labelSexoCadastrado.setText(ficha.getSexo());
            labelAlturaCadastrada.setText(String.valueOf(ficha.getAltura()));
            labelPesoCadastrado.setText(String.valueOf(ficha.getPeso()));
            labelTipoSanguineoCadastrado.setText(ficha.getTipoSanguineo());
        } else {
            labelNomeCadastrado.setText("Ficha não encontrada.");
        }
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloFicha = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelDataNascimento = new javax.swing.JLabel();
        labelSexo = new javax.swing.JLabel();
        labelAltura = new javax.swing.JLabel();
        labelPeso = new javax.swing.JLabel();
        labelTipoSanguineo = new javax.swing.JLabel();
        labelNomeCadastrado = new javax.swing.JLabel();
        labelDataNascimentoCadastrado = new javax.swing.JLabel();
        labelSexoCadastrado = new javax.swing.JLabel();
        labelAlturaCadastrada = new javax.swing.JLabel();
        labelCm = new javax.swing.JLabel();
        labelPesoCadastrado = new javax.swing.JLabel();
        labelKg = new javax.swing.JLabel();
        labelTipoSanguineoCadastrado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloFicha.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        tituloFicha.setText("Ficha Médica");

        labelNome.setText("Nome:");

        labelDataNascimento.setText("Data de Nascimento:");

        labelSexo.setText("Sexo:");

        labelAltura.setText("Altura:");

        labelPeso.setText("Peso:");

        labelTipoSanguineo.setText("Tipo Sanguíneo:");

        labelCm.setText("cm");

        labelKg.setText("Kg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(tituloFicha))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelDataNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelDataNascimentoCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelNomeCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelAltura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelAlturaCadastrada, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelCm))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPeso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelPesoCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelKg))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(labelTipoSanguineo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labelTipoSanguineoCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(labelSexo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labelSexoCadastrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(62, 62, 62))))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tituloFicha)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNomeCadastrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelDataNascimentoCadastrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSexoCadastrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAltura)
                    .addComponent(labelCm)
                    .addComponent(labelAlturaCadastrada, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPeso)
                    .addComponent(labelKg)
                    .addComponent(labelPesoCadastrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoSanguineo)
                    .addComponent(labelTipoSanguineoCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelAltura;
    private javax.swing.JLabel labelAlturaCadastrada;
    private javax.swing.JLabel labelCm;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelDataNascimentoCadastrado;
    private javax.swing.JLabel labelKg;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNomeCadastrado;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelPesoCadastrado;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelSexoCadastrado;
    private javax.swing.JLabel labelTipoSanguineo;
    private javax.swing.JLabel labelTipoSanguineoCadastrado;
    private javax.swing.JLabel tituloFicha;
    // End of variables declaration//GEN-END:variables
}
