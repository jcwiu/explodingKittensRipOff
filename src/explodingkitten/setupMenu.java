/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explodingkitten;

/**
 *
 * @author Jenn
 */

public class setupMenu extends javax.swing.JFrame {

    /**
     * Creates new form startMenu
     */
    public int setupFrame=0;
    public String jText;
    public int playerCount=4;
    public String[] playerName = new String[4];
    public boolean haveAI = false;
    public int AIdifficulty = 1;
    public int j=1;
    public setupMenu() {
        
        initComponents();
        jCheckBox1.setVisible(false);
        jButton7.setVisible(false);
        jFormattedTextField1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jFormattedTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(707, 467));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton5.setFont(new java.awt.Font("AR CHRISTY", 0, 24)); // NOI18N
        jButton5.setText("Cancel");
        jButton5.setToolTipText("");
        jButton5.setActionCommand("back");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(20, 380, 180, 40);

        jCheckBox1.setFont(new java.awt.Font("AR CHRISTY", 0, 18)); // NOI18N
        jCheckBox1.setText("YES");
        jCheckBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox1.setOpaque(false);
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(410, 250, 140, 40);

        jFormattedTextField1.setFont(new java.awt.Font("AR CHRISTY", 0, 14)); // NOI18N
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(410, 249, 140, 40);

        jLabel2.setFont(new java.awt.Font("AR CHRISTY", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("The following will help setup your game");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 160, 350, 40);

        jButton7.setFont(new java.awt.Font("AR CHRISTY", 0, 24)); // NOI18N
        jButton7.setText("Next");
        jButton7.setActionCommand("back");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(410, 300, 140, 30);

        jButton6.setFont(new java.awt.Font("AR CHRISTY", 0, 24)); // NOI18N
        jButton6.setText("Next");
        jButton6.setActionCommand("back");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(510, 380, 180, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/setup.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        startMenu s = new startMenu();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        //get number of players (up to 4)
        //let players enter their names (up to 8 characters)
        //play with AI?
        //AI difficulty
        
        jFormattedTextField1.setVisible(true);

        if (setupFrame==0){
            System.out.printf("ENTERING FRAME %d\n", setupFrame);
            jLabel2.setText("Number of (Human) Players\n[1-4]");
            jFormattedTextField1.setText("");
            System.out.printf("jformattedtextfield: %s\n", jFormattedTextField1.getText());
        }else if (setupFrame==1){
            System.out.printf("ENTERING FRAME %d\n", setupFrame);
            System.out.printf("jformattedtextfield: %s\n", jFormattedTextField1.getText());
            playerCount = Integer.parseInt(jFormattedTextField1.getText());
            jLabel2.setText("Enter P1's Name");
            jButton7.setVisible(true);
        }else if(setupFrame==2){
            System.out.printf("ENTERING FRAME %d\n", setupFrame);
            jButton7.setVisible(false);
            jLabel2.setText("Play with AI?");
            jFormattedTextField1.setText("");
            jFormattedTextField1.setVisible(false);
            jCheckBox1.setVisible(true);
            haveAI=jCheckBox1.isSelected();
        }else if(setupFrame==3){
            System.out.printf("ENTERING FRAME %d\n", setupFrame);
            jCheckBox1.setVisible(false);
            jFormattedTextField1.setVisible(true);
            jLabel2.setText("Enter AI Difficulty [1-3]");
            jFormattedTextField1.setText("");
            System.out.printf("jformattedtextfield: %s\n", jFormattedTextField1.getText());
        }else if (setupFrame > 3){
            System.out.printf("ENTERING FRAME %d\n", setupFrame);
            AIdifficulty = Integer.parseInt( jFormattedTextField1.getText());
            System.out.printf("jformattedtextfield: %s\n", jFormattedTextField1.getText());
            gameGUI g = new gameGUI(playerCount,playerName,haveAI,AIdifficulty);
            g.setVisible(true);
            this.setVisible(false);
            
        }
        setupFrame++;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(playerCount > j){
                jLabel2.setText("Enter P"+(j+1)+"'s Name");
                System.out.printf("var j: %d\n", j);
                System.out.printf("var playerCount: %d\n", playerCount);
                System.out.printf("jformattedtextfield: %s\n", jFormattedTextField1.getText());
                playerName[j-1] = jFormattedTextField1.getText();
                j++;
        } else {jButton7.setVisible(false);}
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(setupMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setupMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setupMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setupMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new setupMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
