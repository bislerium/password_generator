package com.bigc.gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
/**
 *
 * @author bisha
 */
public class PW_GUI extends javax.swing.JFrame {

    /**
     * Creates new form PW_GUI
     */
    public PW_GUI() {
        options = new ArrayList<>();
        initComponents();
    }
    
    private void checkBoxInvoked(JCheckBox chk, char c){
        if(chk.isSelected()){
            options.add(c);
        } else{
            options.remove(options.indexOf(c));
        }
        slider.setMaximum(Password.getMaxSize(options));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        textField = new javax.swing.JTextField();
        copy = new javax.swing.JButton();
        generate = new javax.swing.JButton();
        upperCase = new javax.swing.JCheckBox();
        lowerCase = new javax.swing.JCheckBox();
        numbers = new javax.swing.JCheckBox();
        symbols = new javax.swing.JCheckBox();
        slider = new javax.swing.JSlider();
        sliderValue = new javax.swing.JLabel();
        unique = new javax.swing.JToggleButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Generator");
        setIconImage((new ImageIcon("images/key.png")).getImage());
        setResizable(false);

        textField.setEditable(false);
        textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textField.setToolTipText("Your Passowrd!");
        textField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textField.setMaximumSize(new java.awt.Dimension(7, 23));
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        copy.setText("Copy");
        copy.setToolTipText("Copy the password!");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });

        generate.setText("Generate");
        generate.setToolTipText("Generate a password!");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        upperCase.setText("Uppercase");
        upperCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperCaseActionPerformed(evt);
            }
        });

        lowerCase.setText("Lowercase");
        lowerCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerCaseActionPerformed(evt);
            }
        });

        numbers.setText("Numbers");
        numbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbersActionPerformed(evt);
            }
        });

        symbols.setText("Symbols");
        symbols.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symbolsActionPerformed(evt);
            }
        });

        slider.setMaximum(0);
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        slider.setToolTipText("Length of Password");
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        sliderValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sliderValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sliderValue.setText("0");

        unique.setText("Unique");
        unique.setToolTipText("Create a passsword with unique characters!");
        unique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliderValue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lowerCase, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(upperCase, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numbers, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(symbols, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(unique)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sliderValue, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowerCase)
                    .addComponent(upperCase))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numbers)
                    .addComponent(symbols))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(unique, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(copy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
        // TODO add your handling code here:
        textField.copy();
    }//GEN-LAST:event_copyActionPerformed

    private void upperCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperCaseActionPerformed
        checkBoxInvoked(upperCase, 'U');
    }//GEN-LAST:event_upperCaseActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed

    }//GEN-LAST:event_textFieldActionPerformed

    private void lowerCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerCaseActionPerformed
        checkBoxInvoked(lowerCase, 'L');
    }//GEN-LAST:event_lowerCaseActionPerformed

    private void numbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numbersActionPerformed
        checkBoxInvoked(numbers, 'N');
    }//GEN-LAST:event_numbersActionPerformed

    private void symbolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symbolsActionPerformed
        checkBoxInvoked(symbols, 'S');
    }//GEN-LAST:event_symbolsActionPerformed

    private void uniqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniqueActionPerformed

    }//GEN-LAST:event_uniqueActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
        generatePassword();
    }//GEN-LAST:event_generateActionPerformed

    private void generatePassword() {
        Password pw = new Password(slider.getValue(), options, unique.isSelected());
        textField.setText(pw.getPassword());
    }
    
    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
        // TODO add your handling code here:
        sliderValue.setText(String.valueOf(slider.getValue()));
        generatePassword();
    }//GEN-LAST:event_sliderStateChanged

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
            java.util.logging.Logger.getLogger(PW_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PW_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PW_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PW_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PW_GUI().setVisible(true);
            }
        });
    }

    private ArrayList<Character> options;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton copy;
    private javax.swing.JButton generate;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JCheckBox lowerCase;
    private javax.swing.JCheckBox numbers;
    private javax.swing.JSlider slider;
    private javax.swing.JLabel sliderValue;
    private javax.swing.JCheckBox symbols;
    private javax.swing.JTextField textField;
    private javax.swing.JToggleButton unique;
    private javax.swing.JCheckBox upperCase;
    // End of variables declaration//GEN-END:variables
}