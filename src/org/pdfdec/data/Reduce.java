/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pdfdec.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.pdfdec.gui.MainWindow;

/**
 *
 * @author cyounes
 */
public class Reduce {
    private String inputFilePath;
    private String outputFilePath;
    private String optimization;
    private MainWindow frm;
    
    public Reduce(MainWindow frm) {
        this.frm = frm;
    }
    
    public int reducePdf(String input, String output, String opt) {
        int retVal = 0;
        this.inputFilePath = input;
        this.outputFilePath = output;
        this.optimization = opt;
        String command = "gs -q -dUseCIEColor=true -dSAFER -dNOPAUSE -dBATCH ";
        command=command+ "-sDEVICE=pdfwrite -dPDFSETTINGS=/"+opt+" -sOUTPUTFILE="+output+" -f "+input+"";
        
        try {
            Process p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e1) {
            retVal = -1;
        }
         catch ( InterruptedException e1) {
            retVal = -1;
        }
        System.out.println("Done");
        frm.buttonsEnabled(true);
        frm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        return retVal;
    }
    
}
