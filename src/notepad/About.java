package notepad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class About extends JFrame implements ActionListener{
    About(){
        setBounds(400,100,600,500);
        setLayout(null );
        ImageIcon window = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/windowsIcon.png"));
        Image image = window.getImage().getScaledInstance(300,600, Image.SCALE_DEFAULT);
        ImageIcon i1 = new ImageIcon(image);
        JLabel icon = new JLabel(i1);
        icon.setBounds(70,40,400,80);
        add(icon);
        
        JLabel text = new JLabel("<html>Shahjahan<br>Version 0.1.0 (OS Build Java)<br>Shahjahan. All Rights Reserved</html>");
        text.setFont(new Font("SAN SERIF" , Font.PLAIN,16));
        text.setBounds(150,100,500,200);
        add(text);
        
        JButton ok = new JButton("OK");
        ok.addActionListener(this);
        ok.setBounds(250,350,120,25);
        add(ok);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    public static void main(String args[]){
    new About();
    }
}
