/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 05138300067
 */
public class Conversao extends javax.swing.JFrame {

    /**
     * Creates new form Conversao
     */
    public Conversao() {
        initComponents();
    }
    private static int celsiusParaKelvin(int tCelsius) {
        return tCelsius + 273;
    }
    private static int kelvinParaCelsius (int tKelvin) {
        return tKelvin - 273;
    }
    private static int fahrenheitParaCelsius(int tFahr) {
        double temp = (tFahr - 32.0) / 9 * 5;
        return (int) temp;
    }
    private static int celsiusParaFahrenheit(int tCelsius) {
        double temp = (tCelsius / 5) / 9 +32;
        return (int) temp;
    }
    private static int kelvinParaFahrenheit(int tKelvin) {
        return celsiusParaFahrenheit(
                kelvinParaCelsius(tKelvin));
    }
    private static int fahrenheitParakelvin(int tFahr) {
        return celsiusParaKelvin(
                fahrenheitParaCelsius(tFahr));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoOrigem = new javax.swing.ButtonGroup();
        grupoDestino = new javax.swing.ButtonGroup();
        botSair = new javax.swing.JButton();
        botReiniciar = new javax.swing.JButton();
        pOrigem = new javax.swing.JPanel();
        rbKlevinO = new javax.swing.JRadioButton();
        rbCelsiusO = new javax.swing.JRadioButton();
        rbFahrO = new javax.swing.JRadioButton();
        pDestino = new javax.swing.JPanel();
        rbKelvinD = new javax.swing.JRadioButton();
        rbCelsiusD = new javax.swing.JRadioButton();
        rbFahrD = new javax.swing.JRadioButton();
        lOrigem = new javax.swing.JLabel();
        sliOrigem = new javax.swing.JSlider();
        lConversao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botSair.setText("Sair");
        botSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSairActionPerformed(evt);
            }
        });

        botReiniciar.setText("Reiniciar");
        botReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botReiniciarActionPerformed(evt);
            }
        });

        pOrigem.setBorder(javax.swing.BorderFactory.createTitledBorder("De:"));

        grupoOrigem.add(rbKlevinO);
        rbKlevinO.setText("Kelvin");
        rbKlevinO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKlevinOActionPerformed(evt);
            }
        });

        grupoOrigem.add(rbCelsiusO);
        rbCelsiusO.setSelected(true);
        rbCelsiusO.setText("Celsius");
        rbCelsiusO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCelsiusOActionPerformed(evt);
            }
        });

        grupoOrigem.add(rbFahrO);
        rbFahrO.setText("Fahrenheit");

        javax.swing.GroupLayout pOrigemLayout = new javax.swing.GroupLayout(pOrigem);
        pOrigem.setLayout(pOrigemLayout);
        pOrigemLayout.setHorizontalGroup(
            pOrigemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOrigemLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pOrigemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCelsiusO)
                    .addComponent(rbKlevinO)
                    .addComponent(rbFahrO))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pOrigemLayout.setVerticalGroup(
            pOrigemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOrigemLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(rbCelsiusO)
                .addGap(18, 18, 18)
                .addComponent(rbKlevinO)
                .addGap(18, 18, 18)
                .addComponent(rbFahrO)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pDestino.setBorder(javax.swing.BorderFactory.createTitledBorder("Para:"));

        grupoDestino.add(rbKelvinD);
        rbKelvinD.setSelected(true);
        rbKelvinD.setText("Kelvin");

        grupoDestino.add(rbCelsiusD);
        rbCelsiusD.setText("Celsius");
        rbCelsiusD.setEnabled(false);
        rbCelsiusD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCelsiusDActionPerformed(evt);
            }
        });

        grupoDestino.add(rbFahrD);
        rbFahrD.setText("Farhrenheit");

        javax.swing.GroupLayout pDestinoLayout = new javax.swing.GroupLayout(pDestino);
        pDestino.setLayout(pDestinoLayout);
        pDestinoLayout.setHorizontalGroup(
            pDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDestinoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbFahrD)
                    .addComponent(rbKelvinD)
                    .addComponent(rbCelsiusD))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pDestinoLayout.setVerticalGroup(
            pDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDestinoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(rbCelsiusD)
                .addGap(18, 18, 18)
                .addComponent(rbKelvinD)
                .addGap(18, 18, 18)
                .addComponent(rbFahrD)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        lOrigem.setText("25");
        lOrigem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        sliOrigem.setMajorTickSpacing(10);
        sliOrigem.setMinorTickSpacing(5);
        sliOrigem.setOrientation(javax.swing.JSlider.VERTICAL);
        sliOrigem.setPaintLabels(true);
        sliOrigem.setPaintTicks(true);
        sliOrigem.setValue(25);
        sliOrigem.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sliOrigemMouseDragged(evt);
            }
        });

        lConversao.setText("298");
        lConversao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lConversao, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(pDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botSair, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sliOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(pOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botReiniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botSair))
                    .addComponent(pDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lConversao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lOrigem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botReiniciarActionPerformed

    }//GEN-LAST:event_botReiniciarActionPerformed

    private void botSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botSairActionPerformed

    private void rbKlevinOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKlevinOActionPerformed
       int valor = sliOrigem.getValue();
       valor += 273;
        sliOrigem.setMaximum(373);
        sliOrigem.setMinimum(273);
        sliOrigem.setValue(valor);
        String texto = String.valueOf(valor);
        lOrigem.setText(texto);
    }//GEN-LAST:event_rbKlevinOActionPerformed

    private void rbCelsiusOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCelsiusOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCelsiusOActionPerformed

    private void rbCelsiusDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCelsiusDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCelsiusDActionPerformed

    private void sliOrigemMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliOrigemMouseDragged
       int valor = sliOrigem.getValue();
       String texto = String.valueOf(valor);
       lOrigem.setText(texto);
    }//GEN-LAST:event_sliOrigemMouseDragged

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
            java.util.logging.Logger.getLogger(Conversao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botReiniciar;
    private javax.swing.JButton botSair;
    private javax.swing.ButtonGroup grupoDestino;
    private javax.swing.ButtonGroup grupoOrigem;
    private javax.swing.JLabel lConversao;
    private javax.swing.JLabel lOrigem;
    private javax.swing.JPanel pDestino;
    private javax.swing.JPanel pOrigem;
    private javax.swing.JRadioButton rbCelsiusD;
    private javax.swing.JRadioButton rbCelsiusO;
    private javax.swing.JRadioButton rbFahrD;
    private javax.swing.JRadioButton rbFahrO;
    private javax.swing.JRadioButton rbKelvinD;
    private javax.swing.JRadioButton rbKlevinO;
    private javax.swing.JSlider sliOrigem;
    // End of variables declaration//GEN-END:variables
}