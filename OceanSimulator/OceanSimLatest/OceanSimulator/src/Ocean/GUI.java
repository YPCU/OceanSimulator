/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ocean;

import Ocean.Simulator;

/**
 *
 * @author alekyap
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        sharkPanel = new javax.swing.JPanel();
        sharkLabel = new javax.swing.JLabel();
        sharkCreationLabel = new javax.swing.JLabel();
        sharkBreedProbLabel = new javax.swing.JLabel();
        sharkMaxAgeLabel = new javax.swing.JLabel();
        sharkBreedAgeLabel = new javax.swing.JLabel();
        sharkCreationProb = new javax.swing.JTextField();
        sharkBreedingProb = new javax.swing.JTextField();
        sharkMaxAge = new javax.swing.JTextField();
        sharkBreedingAge = new javax.swing.JTextField();
        sardinesPanel = new javax.swing.JPanel();
        sardinesLabel = new javax.swing.JLabel();
        sardinesCreationLabel = new javax.swing.JLabel();
        sardinesBreedProbLabel = new javax.swing.JLabel();
        sardinesMaxAgeLabel = new javax.swing.JLabel();
        sardinesBreedAgeLabel = new javax.swing.JLabel();
        sardinesCreationProb = new javax.swing.JTextField();
        sardinesBreedingProb = new javax.swing.JTextField();
        sardinesMaxAge = new javax.swing.JTextField();
        sardinesBreedingAge = new javax.swing.JTextField();
        planktonPanel = new javax.swing.JPanel();
        planktonLabel = new javax.swing.JLabel();
        planktonCreationLabel = new javax.swing.JLabel();
        planktonBreedingProbLabel = new javax.swing.JLabel();
        planktonMaxAgeLabel = new javax.swing.JLabel();
        planktonCreationProb = new javax.swing.JTextField();
        planktonBreedingProb = new javax.swing.JTextField();
        planktonMaxAge = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cancelButton.setText("Cancel");
        cancelButton.setToolTipText("Cancel simulation.");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        startButton.setText("Start");
        startButton.setToolTipText("Start simulation.");
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        sharkPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sharkLabel.setText("Shark");

        sharkCreationLabel.setText("Creation Probability");

        sharkBreedProbLabel.setText("Breeding Probability");

        sharkMaxAgeLabel.setText("Maximum Age");

        sharkBreedAgeLabel.setText("Breeding Age");

        sharkCreationProb.setText("0.05");
        sharkCreationProb.setToolTipText("Click to change the sharks' creation probability.");

        sharkBreedingProb.setText("0.2");
        sharkBreedingProb.setToolTipText("Click to change the sharks' breeding probability.");

        sharkMaxAge.setText("150");
        sharkMaxAge.setToolTipText("Click to change the sharks' maximum age.");

        sharkBreedingAge.setText("25");
        sharkBreedingAge.setToolTipText("Click to change the sharks' breeding age.");

        javax.swing.GroupLayout sharkPanelLayout = new javax.swing.GroupLayout(sharkPanel);
        sharkPanel.setLayout(sharkPanelLayout);
        sharkPanelLayout.setHorizontalGroup(
            sharkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sharkPanelLayout.createSequentialGroup()
                .addGroup(sharkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sharkPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sharkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sharkPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(sharkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sharkPanelLayout.createSequentialGroup()
                                .addComponent(sharkMaxAgeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sharkMaxAge, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sharkPanelLayout.createSequentialGroup()
                                .addComponent(sharkBreedProbLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sharkBreedingProb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sharkPanelLayout.createSequentialGroup()
                                .addComponent(sharkCreationLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sharkCreationProb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(sharkPanelLayout.createSequentialGroup()
                                .addComponent(sharkBreedAgeLabel)
                                .addGap(66, 66, 66)
                                .addComponent(sharkBreedingAge, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28))
        );
        sharkPanelLayout.setVerticalGroup(
            sharkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sharkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sharkLabel)
                .addGap(18, 18, 18)
                .addGroup(sharkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sharkCreationLabel)
                    .addComponent(sharkCreationProb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sharkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sharkBreedProbLabel)
                    .addComponent(sharkBreedingProb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sharkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sharkMaxAgeLabel)
                    .addComponent(sharkMaxAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sharkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sharkBreedingAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sharkBreedAgeLabel))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        sardinesPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        sardinesLabel.setText("Sardines");

        sardinesCreationLabel.setText("Creation Probability");

        sardinesBreedProbLabel.setText("Breeding Probability");

        sardinesMaxAgeLabel.setText("Maximum Age");

        sardinesBreedAgeLabel.setText("Breeding Age");

        sardinesCreationProb.setText("0.1");
        sardinesCreationProb.setToolTipText("Click to change the sardines' creation probability.");

        sardinesBreedingProb.setText("0.5");
        sardinesBreedingProb.setToolTipText("Click to change the sardines' breeding probability.");

        sardinesMaxAge.setText("75");
        sardinesMaxAge.setToolTipText("Click to change the sardines' maximum age.");

        sardinesBreedingAge.setText("12");
        sardinesBreedingAge.setToolTipText("Click to change the sardines' breeding age.");

        javax.swing.GroupLayout sardinesPanelLayout = new javax.swing.GroupLayout(sardinesPanel);
        sardinesPanel.setLayout(sardinesPanelLayout);
        sardinesPanelLayout.setHorizontalGroup(
            sardinesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sardinesPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(sardinesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sardinesPanelLayout.createSequentialGroup()
                        .addComponent(sardinesMaxAgeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sardinesMaxAge, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sardinesPanelLayout.createSequentialGroup()
                        .addComponent(sardinesBreedProbLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sardinesBreedingProb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sardinesPanelLayout.createSequentialGroup()
                        .addComponent(sardinesCreationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sardinesCreationProb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sardinesPanelLayout.createSequentialGroup()
                        .addComponent(sardinesBreedAgeLabel)
                        .addGap(66, 66, 66)
                        .addComponent(sardinesBreedingAge, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(sardinesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sardinesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sardinesPanelLayout.setVerticalGroup(
            sardinesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sardinesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sardinesLabel)
                .addGap(18, 18, 18)
                .addGroup(sardinesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sardinesCreationLabel)
                    .addComponent(sardinesCreationProb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sardinesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sardinesBreedProbLabel)
                    .addComponent(sardinesBreedingProb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sardinesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sardinesMaxAgeLabel)
                    .addComponent(sardinesMaxAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sardinesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sardinesBreedingAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sardinesBreedAgeLabel))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        planktonPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        planktonLabel.setText("Plankton");

        planktonCreationLabel.setText("Creation Probability");

        planktonBreedingProbLabel.setText("Breeding Probability");

        planktonMaxAgeLabel.setText("Maximum Age");

        planktonCreationProb.setText("0.7");
        planktonCreationProb.setToolTipText("Click to change the planktons' creation probability.");

        planktonBreedingProb.setText("0.8");
        planktonBreedingProb.setToolTipText("Click to change the planktons' breeding probability.");

        planktonMaxAge.setText("100");
        planktonMaxAge.setToolTipText("Click to change the planktons' maximum age.");

        javax.swing.GroupLayout planktonPanelLayout = new javax.swing.GroupLayout(planktonPanel);
        planktonPanel.setLayout(planktonPanelLayout);
        planktonPanelLayout.setHorizontalGroup(
            planktonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planktonPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(planktonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(planktonPanelLayout.createSequentialGroup()
                        .addComponent(planktonMaxAgeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(planktonMaxAge, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(planktonPanelLayout.createSequentialGroup()
                        .addComponent(planktonBreedingProbLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(planktonBreedingProb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(planktonPanelLayout.createSequentialGroup()
                        .addComponent(planktonCreationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(planktonCreationProb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(planktonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(planktonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        planktonPanelLayout.setVerticalGroup(
            planktonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planktonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(planktonLabel)
                .addGap(18, 18, 18)
                .addGroup(planktonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planktonCreationLabel)
                    .addComponent(planktonCreationProb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(planktonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planktonBreedingProbLabel)
                    .addComponent(planktonBreedingProb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(planktonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planktonMaxAgeLabel)
                    .addComponent(planktonMaxAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sharkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sardinesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(planktonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sardinesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startButton)
                            .addComponent(cancelButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sharkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(planktonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private static void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        
        //valueSetter();
        Print();
//        Simulator simulator = new Simulator(100,100);
//        simulator.startSimulation(); 
        Thread thread = new Thread(new Simulator(100,100));
        thread.start();
        Print();
        startButton.setVisible(false);
        //startButton will disappear after simulator started, since any input further 
        // can not chnage the final constants
      

        
        

        
    }//GEN-LAST:event_startButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private static javax.swing.JTextField planktonBreedingProb;
    private javax.swing.JLabel planktonBreedingProbLabel;
    private javax.swing.JLabel planktonCreationLabel;
    private static javax.swing.JTextField planktonCreationProb;
    private javax.swing.JLabel planktonLabel;
    private static javax.swing.JTextField planktonMaxAge;
    private javax.swing.JLabel planktonMaxAgeLabel;
    private javax.swing.JPanel planktonPanel;
    private javax.swing.JLabel sardinesBreedAgeLabel;
    private javax.swing.JLabel sardinesBreedProbLabel;
    private static javax.swing.JTextField sardinesBreedingAge;
    private static javax.swing.JTextField sardinesBreedingProb;
    private javax.swing.JLabel sardinesCreationLabel;
    private static javax.swing.JTextField sardinesCreationProb;
    private javax.swing.JLabel sardinesLabel;
    private static javax.swing.JTextField sardinesMaxAge;
    private javax.swing.JLabel sardinesMaxAgeLabel;
    private javax.swing.JPanel sardinesPanel;
    private javax.swing.JLabel sharkBreedAgeLabel;
    private javax.swing.JLabel sharkBreedProbLabel;
    private static javax.swing.JTextField sharkBreedingAge;
    private static javax.swing.JTextField sharkBreedingProb;
    private javax.swing.JLabel sharkCreationLabel;
    private static javax.swing.JTextField sharkCreationProb;
    private javax.swing.JLabel sharkLabel;
    private static javax.swing.JTextField sharkMaxAge;
    private javax.swing.JLabel sharkMaxAgeLabel;
    private javax.swing.JPanel sharkPanel;
    private static javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables

    
    
//       private static void valueSetter() {
//
//        /*
//     //setDEFAULT_DEPTH(Integer.parseInt(sharkCreationProb.getText().trim()));
//     //setDEFAULT_WIDTH(Integer.parseInt(sharkCreationProb.getText().trim()));
//     //setSIM_LENGTH(Integer.parseInt(sharkCreationProb.getText().trim()));
//         */
//        double d = ModelConstants.PLANKTON_CREATE_PROB;
//
//        d= ModelConstants.SARDINE_CREATE_PROB;
//
//        d= ModelConstants.SHARK_CREATE_PROB;
//        
//        
//        int i  = ModelConstants.PLANKTON_MAX_AGE;
//        i = ModelConstants.SARDINE_MAX_AGE;
//        i = ModelConstants.SHARK_MAX_AGE;
//
//        /*
//     //ModelConstants.SARDINE_NUTRITIONAL_VALUE(Integer.parseInt(sharkCreationProb.getText.trim));
//     //ModelConstants.PLANKTON_NUTRITIONAL_VALUE(Integer.parseInt(sharkCreationProb.getText.trim));
//         */
//        i= ModelConstants.SARDINE_BREEDING_AGE;
//        i = ModelConstants.SHARK_BREEDING_AGE;
//
//        d = ModelConstants.PLANKTON_BREEDING_PROB;
//
//        d = ModelConstants.SARDINE_BREEDING_PROB;
//
//        d = ModelConstants.SHARK_BREEDING_PROB;
//    }

     public static double setPLANKTON_CREATE_PROB() {
        return Double.parseDouble(planktonCreationProb.getText().trim());
    }

    public static double setSARDINE_CREATE_PROB() {
        return Double.parseDouble(sardinesCreationProb.getText().trim());
    }

    public static double setSHARK_CREATE_PROB() {
        return Double.parseDouble(sharkCreationProb.getText().trim());
    }

    public static int setPLANKTON_MAX_AGE() {
        return Integer.parseInt(planktonMaxAge.getText().trim());
    }

    public static int setSARDINE_MAX_AGE() {
        return Integer.parseInt(sardinesMaxAge.getText().trim());
    }

    public static int setSHARK_MAX_AGE() {
        return Integer.parseInt(sharkMaxAge.getText().trim());
    }
//           public static double setPLANKTON_BREEDING_AGE(){
//        return Double.parseDouble(planktonCreationProb.getText().trim());
//    }

    public static int setSARDINE_BREEDING_AGE() {
        return Integer.parseInt(sardinesBreedingAge.getText().trim());
    }

    public static int setSHARK_BREEDING_AGE() {
        return Integer.parseInt(sharkBreedingAge.getText().trim());
    }

    public static double setPLANKTON_BREEDING_PROB() {
        return Double.parseDouble(planktonBreedingProb.getText().trim());
    }

    public static double setSARDINE_BREEDING_PROB() {
        return Double.parseDouble(sardinesBreedingProb.getText().trim());
    }

    public static double setSHARK_BREEDING_PROB() {
        return Double.parseDouble(sharkBreedingProb.getText().trim());
    }
    
    private static void Print(){
    //declearing the default depth of the Ocean field.
    System.out.println(ModelConstants.DEFAULT_DEPTH);
    //declearing the default width of the Ocean field.
    System.out.println(ModelConstants.DEFAULT_WIDTH);
    System.out.println(ModelConstants.SIM_LENGTH);

    //declearing the plankton generating probability 
    System.out.println(ModelConstants. PLANKTON_CREATE_PROB);
    //declearing the sardine generating probability 
    System.out.println(ModelConstants. SARDINE_CREATE_PROB);
    //declearing the shark generating probability 
    System.out.println(ModelConstants. SHARK_CREATE_PROB);

    //declearing the max age that plankton can live up to.
    System.out.println(ModelConstants.PLANKTON_MAX_AGE);
    //declearing the max age that sardine can live up to.
    System.out.println(ModelConstants.SARDINE_MAX_AGE);
    //declearing the max age that shark can live up to.
    System.out.println(ModelConstants.SHARK_MAX_AGE );

    System.out.println(ModelConstants.SARDINE_NUTRITIONAL_VALUE);
    System.out.println(ModelConstants.PLANKTON_NUTRITIONAL_VALUE);

    //declaring the minimum breeding age
    System.out.println(ModelConstants.SARDINE_BREEDING_AGE);
    System.out.println(ModelConstants.SHARK_BREEDING_AGE);
    System.out.println(ModelConstants.PLANKTON_BREEDING_AGE);

    // defines probability of plankton breeding in each timestep
    System.out.println(ModelConstants. PLANKTON_BREEDING_PROB);
    // defines probability of sardine breeding in each timestep    
    System.out.println(ModelConstants. SARDINE_BREEDING_PROB);
    // defines probability of shark breeding in each timestep
    System.out.println(ModelConstants. SHARK_BREEDING_PROB);

    }
}
