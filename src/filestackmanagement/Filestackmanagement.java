/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//C:\Users\Shubham Singh\Desktop\ff
package filestackmanagement;
import java.io.File;
import java.util.Scanner;
import javax.swing.JFrame;
/**
 *
 * @author Shubham Singh
 */
public class Filestackmanagement {

    /**
     * @param args the command line arguments
     */
    
  
    public static void main(String[] args) {
      //  gui obj=new gui();
        Stacker obj=new Stacker();
       // obj.setBounds(0,0,400,400);
        obj.setTitle("Stacker");
        obj.setVisible(true);
        obj.setResizable(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
