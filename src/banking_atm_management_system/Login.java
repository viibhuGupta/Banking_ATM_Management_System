
package banking_atm_management_system;

import javax.swing.*;
import java.awt.*;


public class Login  extends JFrame{
    
    Login(){
        
        setTitle("AUTOMATED TELLER MACHINE h");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        add(label);
        
       setSize(800 ,480); 
       setVisible (true);
       setLocation(350,200);
    }
    
    public static void main(String[] args) {
        
        new Login ();
    }
    
}
