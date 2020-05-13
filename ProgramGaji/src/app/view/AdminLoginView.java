package app.view;

import javax.swing.*;
import java.awt.*;

public class AdminLoginView extends JFrame {
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    public JTextField user = new JTextField(20);
    public JPasswordField pass = new JPasswordField(20);
    public JButton login = new JButton("Login");
    public JButton cancel = new JButton("Cancel");

    public AdminLoginView() {
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        add(username).setBounds(60,100,100,30);
        add(user).setBounds(160,100,150,30);
        add(password).setBounds(60,140,100,30);
        add(pass).setBounds(160,140,150,30);
        add(login).setBounds(80,200,100,30);
        add(cancel).setBounds(200,200,100,30);
        ImageIcon background3 = new ImageIcon("icon/background2.jpeg");
        Image getBackground3 = background3.getImage();
        Image modifiedBackground3 = getBackground3.getScaledInstance(400, 300, Image.SCALE_REPLICATE);
        background3 = new ImageIcon(modifiedBackground3);
        JLabel lBackground3 = new JLabel(background3);
        add(lBackground3);
        lBackground3.setBounds(0, 0, 400, 300);
    }
}
