/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import cargo.AumentoSalarial;
import javax.swing.JOptionPane;
import modelo.Funcionario;

/**
 *
 * @author Aluno
 */
public class InterfaceCalcSalario extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceCalcSalario
     */
    
    
    
    public InterfaceCalcSalario() {
        initComponents();
        labelResultadoSalario.setText("");
        labelResultadoDiferenca.setText("");
        labelResultadonome.setText("");
        labelResultadocargo.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        cpNome = new javax.swing.JTextField();
        labelSalario = new javax.swing.JLabel();
        cpSalario = new javax.swing.JTextField();
        labelCodigoCargo = new javax.swing.JLabel();
        cpCodigoCargo = new javax.swing.JTextField();
        labelTempoServico = new javax.swing.JLabel();
        cpTempoServico = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();
        labelNovoSalario = new javax.swing.JLabel();
        labelResultadoSalario = new javax.swing.JLabel();
        labelDiferenca = new javax.swing.JLabel();
        labelResultadoDiferenca = new javax.swing.JLabel();
        labelSobrenome = new javax.swing.JLabel();
        cpSobrenome = new javax.swing.JTextField();
        labelSeunome = new javax.swing.JLabel();
        labelResultadonome = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        labelCargo = new javax.swing.JLabel();
        labelResultadocargo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculo de aumento salarial");

        labelNome.setBackground(new java.awt.Color(51, 153, 0));
        labelNome.setFont(new java.awt.Font("Swis721 Hv BT", 0, 11)); // NOI18N
        labelNome.setText("Informe seu primeiro nome:");
        labelNome.setToolTipText("Digite seu nome aqui:");

        cpNome.setBackground(new java.awt.Color(0, 102, 102));
        cpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomeActionPerformed(evt);
            }
        });

        labelSalario.setFont(new java.awt.Font("Swis721 Hv BT", 0, 11)); // NOI18N
        labelSalario.setText("Informe o salário:");

        cpSalario.setBackground(new java.awt.Color(0, 102, 102));

        labelCodigoCargo.setFont(new java.awt.Font("Swis721 Hv BT", 0, 11)); // NOI18N
        labelCodigoCargo.setText("Informe o código do cargo:");

        cpCodigoCargo.setBackground(new java.awt.Color(0, 102, 102));

        labelTempoServico.setFont(new java.awt.Font("Swis721 Hv BT", 0, 11)); // NOI18N
        labelTempoServico.setText("Informe o tempo de serviço:");

        cpTempoServico.setBackground(new java.awt.Color(0, 102, 102));

        btCalcular.setBackground(new java.awt.Color(0, 204, 204));
        btCalcular.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        labelNovoSalario.setBackground(new java.awt.Color(204, 255, 0));
        labelNovoSalario.setFont(new java.awt.Font("Wide Latin", 0, 11)); // NOI18N
        labelNovoSalario.setText("Novo Salário:");

        labelResultadoSalario.setBackground(new java.awt.Color(204, 255, 0));
        labelResultadoSalario.setFont(new java.awt.Font("Wide Latin", 0, 11)); // NOI18N
        labelResultadoSalario.setText("(resultado salário)");

        labelDiferenca.setBackground(new java.awt.Color(204, 255, 0));
        labelDiferenca.setFont(new java.awt.Font("Wide Latin", 0, 11)); // NOI18N
        labelDiferenca.setText("Diferença:");

        labelResultadoDiferenca.setBackground(new java.awt.Color(204, 255, 0));
        labelResultadoDiferenca.setFont(new java.awt.Font("Wide Latin", 0, 11)); // NOI18N
        labelResultadoDiferenca.setText("(resultado diferença)");

        labelSobrenome.setFont(new java.awt.Font("Swis721 Hv BT", 0, 11)); // NOI18N
        labelSobrenome.setText("Informe seu sobrenome:");

        cpSobrenome.setBackground(new java.awt.Color(0, 102, 102));
        cpSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpSobrenomeActionPerformed(evt);
            }
        });

        labelSeunome.setBackground(new java.awt.Color(204, 255, 0));
        labelSeunome.setFont(new java.awt.Font("Wide Latin", 0, 11)); // NOI18N
        labelSeunome.setText("Seu nome:");

        labelResultadonome.setBackground(new java.awt.Color(204, 255, 0));
        labelResultadonome.setFont(new java.awt.Font("Wide Latin", 0, 11)); // NOI18N
        labelResultadonome.setText("(resultado nome)");

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/download.jpg"))); // NOI18N

        labelCargo.setText("Seu cargo é:");

        labelResultadocargo.setText("seu cargo ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cpNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpSobrenome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpSalario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpCodigoCargo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpTempoServico, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelDiferenca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelResultadoDiferenca))
                                    .addComponent(labelSobrenome)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelNovoSalario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelResultadoSalario))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelSeunome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelResultadonome))
                                    .addComponent(labelSalario)
                                    .addComponent(labelCodigoCargo)
                                    .addComponent(labelTempoServico))
                                .addGap(0, 18, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(labelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelResultadocargo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSobrenome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCodigoCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpCodigoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTempoServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpTempoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSeunome)
                    .addComponent(labelResultadonome))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNovoSalario)
                    .addComponent(labelResultadoSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDiferenca)
                    .addComponent(labelResultadoDiferenca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCargo)
                    .addComponent(labelResultadocargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        
        String nome = cpNome.getText();
        double salario = Double.parseDouble(cpSalario.getText());
        
        String sobrenome = cpSobrenome.getText();
        
        
        int codCargo = 
        Integer.parseInt(cpCodigoCargo.getText());
        
        int tempoServico = 
        Integer.parseInt(cpTempoServico.getText());
        
        Funcionario f = new Funcionario();
        f.setSobrenome(sobrenome);
        f.setNome(nome);
        f.setSalario(salario);
        f.setCodCargo(codCargo);
        f.setTempServico(tempoServico);
        
        AumentoSalarial s = new AumentoSalarial(f);
        double novoSalario = s.calcularAumento();
        
        labelResultadoSalario.setText(""+novoSalario);
        
        labelResultadoDiferenca
        .setText(""+(novoSalario - f.getSalario()));
        
        labelResultadonome.setText(nome +" "+ sobrenome);
        labelResultadocargo.setText(f.cargo);
        
    }//GEN-LAST:event_btCalcularActionPerformed

    private void cpSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpSobrenomeActionPerformed

    private void cpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalcSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalcSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalcSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalcSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCalcSalario().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JTextField cpCodigoCargo;
    private javax.swing.JTextField cpNome;
    private javax.swing.JTextField cpSalario;
    private javax.swing.JTextField cpSobrenome;
    private javax.swing.JTextField cpTempoServico;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelCodigoCargo;
    private javax.swing.JLabel labelDiferenca;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNovoSalario;
    private javax.swing.JLabel labelResultadoDiferenca;
    private javax.swing.JLabel labelResultadoSalario;
    private javax.swing.JLabel labelResultadocargo;
    private javax.swing.JLabel labelResultadonome;
    private javax.swing.JLabel labelSalario;
    private javax.swing.JLabel labelSeunome;
    private javax.swing.JLabel labelSobrenome;
    private javax.swing.JLabel labelTempoServico;
    // End of variables declaration//GEN-END:variables
}
