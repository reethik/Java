

public class CConverter extends javax.swing.JFrame {

    // Currency Values {Rupee,Dollar,Pound,Yen,Euro} 
double curr1[] = {0,1,0.015,0.012,1.67,0.014};
double curr2[] = {0,1,0.015,0.012,1.67,0.014}; 

/**
 * Creates new form CConverter
 */
public CConverter() {
    initComponents();
}

/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jcmbCurrency1 = new javax.swing.JComboBox<>();
    jcmbCurrency2 = new javax.swing.JComboBox<>();
    jtxtAmount = new javax.swing.JTextField();
    jlblConversion = new javax.swing.JLabel();
    jbtnConvert = new javax.swing.JButton();
    jbtnReset = new javax.swing.JButton();
    jtxtConversion = new javax.swing.JTextField();
    jbtnExit = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel1.setText("Currency Converter");

    jcmbCurrency1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One", "INDIA Rupee", "US Dollar", "UK Pound", "JAPAN Yen", "Euro" }));

    jcmbCurrency2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Other", "INDIA Rupee", "US Dollar", "UK Pound", "JAPAN Yen", "Euro" }));

    jtxtAmount.setText("Amount");

    jlblConversion.setText("Conversion");

    jbtnConvert.setText("CONVERT");
    jbtnConvert.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnConvertActionPerformed(evt);
        }
    });

    jbtnReset.setText("RESET");
    jbtnReset.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnResetActionPerformed(evt);
        }
    });

    jtxtConversion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jtxtConversion.setForeground(new java.awt.Color(0, 0, 204));
    jtxtConversion.setText("Converted Value");

    jbtnExit.setText("Exit");
    jbtnExit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbtnExitActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel1)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jbtnConvert)
                    .addGap(18, 18, 18)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jcmbCurrency1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcmbCurrency2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtxtAmount)
                .addComponent(jlblConversion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtxtConversion))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(layout.createSequentialGroup()
            .addGap(158, 158, 158)
            .addComponent(jbtnExit)
            .addContainerGap(191, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(22, 22, 22)
            .addComponent(jLabel1)
            .addGap(28, 28, 28)
            .addComponent(jcmbCurrency1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jcmbCurrency2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jtxtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(38, 38, 38)
            .addComponent(jlblConversion)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jtxtConversion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jbtnConvert)
                .addComponent(jbtnReset))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jbtnExit)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
}// </editor-fold>                        

private void jbtnConvertActionPerformed(java.awt.event.ActionEvent evt) {                                            
    // TODO add your handling code here:


    double amt = Double.parseDouble(jtxtAmount.getText());

    int obj1 = jcmbCurrency1.getSelectedIndex();
    int obj2 = jcmbCurrency2.getSelectedIndex();

    if (obj1 == obj2){
        String samecur = "Both the currencies cannot be the same";
        jtxtConversion.setText(samecur);
    }
    else {
        double res = (amt/curr1[obj1])*curr2[obj2];

        String conv = String.format("%.2f",res);
        jtxtConversion.setText(conv);
    }

}                                           

private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {                                          
    // TODO add your handling code here:
    jtxtAmount.setText(null);
    jtxtConversion.setText(null);
    jcmbCurrency1.setSelectedIndex(0);
    jcmbCurrency2.setSelectedIndex(0);
}                                         

private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {                                         
    // TODO add your handling code here:
    System.exit(0);
}                                        

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
        java.util.logging.Logger.getLogger(CConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(CConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(CConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(CConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new CConverter().setVisible(true);
        }
    });
}

// Variables declaration - do not modify                     
private javax.swing.JLabel jLabel1;
private javax.swing.JButton jbtnConvert;
private javax.swing.JButton jbtnExit;
private javax.swing.JButton jbtnReset;
private javax.swing.JComboBox<String> jcmbCurrency1;
private javax.swing.JComboBox<String> jcmbCurrency2;
private javax.swing.JLabel jlblConversion;
private javax.swing.JTextField jtxtAmount;
private javax.swing.JTextField jtxtConversion;
// End of variables declaration                   
}