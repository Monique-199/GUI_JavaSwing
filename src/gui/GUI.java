/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;
import javax.swing.*;

/**
 *
 * @author inven
 */
public class GUI {
    //declarations
    private JLabel name;
    private JTextField nametf;
    private JButton SubmitButton;
    private JFrame frame;
    private JPanel panel;
    public GUI(){
        frame= new JFrame();
        panel=new JPanel();
        name=new JLabel("Name");
        name.setBounds(120,10,170,30);
        //100 for width,30 for length
        // 10,10 coordinates
        nametf=new JTextField(20);
        nametf.setBounds(60,85,200,200);
        SubmitButton=new JButton("SUBMIT");
        SubmitButton.setBounds(20,50,100,30);
        frame.setTitle("GUI");
        frame.setSize(800,800);
        
        frame.add(panel);
        panel.add(name);
        panel.add(nametf);
        panel.add(SubmitButton);
        
        frame.setVisible(true);
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new GUI();
        // TODO code application logic here
    }
    
}
