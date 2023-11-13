/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swingdemo;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;


/**
 *
 * @author inven
 */
public class SwingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(550,300));
        frame.getContentPane().setBackground(Color.red);
        frame.pack();
        frame.setVisible(true);
        
        // TODO code application logic here
    }
    
}
