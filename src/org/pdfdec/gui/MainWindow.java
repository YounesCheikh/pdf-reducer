/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pdfdec.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import org.pdfdec.data.Reduce;

/**
 *
 * @author cyounes
 */
public class MainWindow extends javax.swing.JFrame {

    private JFileChooser fcInput;
    private JFileChooser fcOutput;
    private String inputFile;
    private String outputFile;
    private String optimization = "default";
    private Reduce rd ;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        initJradiosButtons();
        rd = new Reduce(this);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                closeApp();
            }
        });

    }

    private void initJradiosButtons() {
        jRadioDefaut.setSelected(true);
        optimizationLevelGroup.add(jRadioDefaut);
        optimizationLevelGroup.add(jRadioEBook);
        optimizationLevelGroup.add(jRadioPrepress);
        optimizationLevelGroup.add(jRadioPrinter);
        optimizationLevelGroup.add(jRadioScreen);
    }

    private String getOptimization() {
        return this.optimization;
    }

    private void resetAll() {
        this.inputFile = null;
        this.outputFile = null;
        this.jRadioDefaut.setSelected(true);
        this.optimization = "default";
        this.inputTextField.setText("");
        this.outputTextField.setText("");
    }
    
    private void closeApp() {
        this.dispose();
        System.exit(0);
    }
    
    private int sendData() {
        int retVal= rd.reducePdf(this.inputFile, this.outputFile, this.optimization);
        return retVal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optimizationLevelGroup = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnInputBrowse = new javax.swing.JButton();
        inputTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnOutputBrowse = new javax.swing.JButton();
        outputTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jRadioDefaut = new javax.swing.JRadioButton();
        jRadioPrinter = new javax.swing.JRadioButton();
        jRadioScreen = new javax.swing.JRadioButton();
        jRadioEBook = new javax.swing.JRadioButton();
        jRadioPrepress = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnReduce = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pdf Reducer");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(null);
        setMinimumSize(null);
        setResizable(false);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Input File"));

        btnInputBrowse.setText("Browse");
        btnInputBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputBrowseActionPerformed(evt);
            }
        });

        jLabel1.setText("Select pdf input file please");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(inputTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInputBrowse)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInputBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Output File"));

        btnOutputBrowse.setText("Browse");
        btnOutputBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutputBrowseActionPerformed(evt);
            }
        });

        jLabel2.setText("Select pdf output destination");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(outputTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOutputBrowse)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOutputBrowse)
                    .addComponent(outputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Optimization Level"));

        jRadioDefaut.setText("Default");
        jRadioDefaut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioDefautActionPerformed(evt);
            }
        });

        jRadioPrinter.setText("Printer");
        jRadioPrinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPrinterActionPerformed(evt);
            }
        });

        jRadioScreen.setText("Screen");
        jRadioScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioScreenActionPerformed(evt);
            }
        });

        jRadioEBook.setText("eBook");
        jRadioEBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEBookActionPerformed(evt);
            }
        });

        jRadioPrepress.setText("prepress");
        jRadioPrepress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioPrepressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioDefaut)
                    .addComponent(jRadioEBook))
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jRadioPrinter)
                        .addGap(79, 79, 79)
                        .addComponent(jRadioScreen))
                    .addComponent(jRadioPrepress))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioDefaut)
                    .addComponent(jRadioPrinter)
                    .addComponent(jRadioScreen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioEBook)
                    .addComponent(jRadioPrepress))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnReset.setText("Reset All");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnClose.setText("Close Application");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnReduce.setText("Reduce size");
        btnReduce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReduceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReduce)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClose)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnClose)
                    .addComponent(btnReduce))
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputBrowseActionPerformed
        if (fcInput == null) {
            fcInput = new JFileChooser("$HOME");
            fcInput.setDialogType(JFileChooser.OPEN_DIALOG);
            fcInput.setFileFilter(new FileFilter() {
                @Override
                public boolean accept(File f) {
                    return f.getName().toLowerCase().endsWith(".pdf")
                            || f.isDirectory();
                }

                @Override
                public String getDescription() {
                    return "pdf Files";
                }
            });
        }

        // Show it.
        int returnVal = fcInput.showOpenDialog(this);

        // Process the results.
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            this.inputFile = fcInput.getSelectedFile().getPath();
            inputTextField.setText(inputFile);
            
        } else {
            inputTextField.setText("");
        }

        // Reset the file chooser for the next time it's shown.
        fcInput.setSelectedFile(null);
    }//GEN-LAST:event_btnInputBrowseActionPerformed

    private void btnOutputBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutputBrowseActionPerformed
        if (fcOutput == null) {
            fcOutput = new JFileChooser("$HOME");
            fcOutput.setDialogType(JFileChooser.SAVE_DIALOG);
            fcOutput.setApproveButtonText("Save");
            fcOutput.setFileFilter(new FileFilter() {
                @Override
                public boolean accept(File f) {
                    return f.getName().toLowerCase().endsWith(".pdf")
                            || f.isDirectory();
                }

                @Override
                public String getDescription() {
                    return "pdf Files";
                }
            });
        }

        // Show it.
        int returnVal = fcOutput.showSaveDialog(this);

        // Process the results.
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            outputFile = fcOutput.getSelectedFile().getPath();
            if (!outputFile.toLowerCase().endsWith(".pdf")) {
                outputFile = outputFile+".pdf";
               }
            outputTextField.setText(outputFile);
        } else {
            outputTextField.setText("");
        }

        // Reset the file chooser for the next time it's shown.
        fcOutput.setSelectedFile(null);
    }//GEN-LAST:event_btnOutputBrowseActionPerformed

    private void jRadioDefautActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioDefautActionPerformed
        this.optimization = "default";
    }//GEN-LAST:event_jRadioDefautActionPerformed

    private void jRadioPrinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPrinterActionPerformed
        this.optimization = "printer";
    }//GEN-LAST:event_jRadioPrinterActionPerformed

    private void jRadioScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioScreenActionPerformed
        this.optimization = "screen";
    }//GEN-LAST:event_jRadioScreenActionPerformed

    private void jRadioEBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEBookActionPerformed
        this.optimization = "ebook";
    }//GEN-LAST:event_jRadioEBookActionPerformed

    private void jRadioPrepressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioPrepressActionPerformed
        this.optimization = "prepress";
    }//GEN-LAST:event_jRadioPrepressActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetAll();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        closeApp();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnReduceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReduceActionPerformed
        this.inputFile = inputTextField.getText();
        this.outputFile = outputTextField.getText();
        int confirmed = JOptionPane.showConfirmDialog(this, "This may take a while!", "Message", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (confirmed == JOptionPane.OK_OPTION ) {
            this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
            this.buttonsEnabled(false);
            int isFinish = sendData();
            if (isFinish==0) {
                JOptionPane.showMessageDialog(this, "Finished successfuly", "Success",JOptionPane.PLAIN_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(this, "There were some errors while reducing file", "Failure",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnReduceActionPerformed

    public void buttonsEnabled(boolean enable) {
        this.btnClose.setEnabled(enable);
        this.btnReset.setEnabled(enable);
        this.btnReset.setEnabled(enable);
        this.btnInputBrowse.setEnabled(enable);
        this.btnOutputBrowse.setEnabled(enable);
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
        /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnInputBrowse;
    private javax.swing.JButton btnOutputBrowse;
    private javax.swing.JButton btnReduce;
    private javax.swing.JButton btnReset;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioDefaut;
    private javax.swing.JRadioButton jRadioEBook;
    private javax.swing.JRadioButton jRadioPrepress;
    private javax.swing.JRadioButton jRadioPrinter;
    private javax.swing.JRadioButton jRadioScreen;
    private javax.swing.ButtonGroup optimizationLevelGroup;
    private javax.swing.JTextField outputTextField;
    // End of variables declaration//GEN-END:variables
}
