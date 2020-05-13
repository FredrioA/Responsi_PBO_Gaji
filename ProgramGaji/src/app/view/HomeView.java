package app.view;

import app.controller.Transition;
import java.awt.Image;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeView extends JFrame {
    JLabel lInfo1 = new JLabel("Selamat Datang");
    JLabel lInfo2 = new JLabel("Silahkan masuk ke menu gaji untuk melakukan perhitungan gaji");
    JLabel lInfo3 = new JLabel("Jika mengalami kesulitan, klik menu petunjuk");
    JLabel lInfo4 = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");

    ImageIcon home = new ImageIcon("icon/home.jpeg");
    Image getHome = home.getImage();
    Image modifiedHome = getHome.getScaledInstance(20, 20, Image.SCALE_REPLICATE);
    Icon home_n = new ImageIcon(modifiedHome);
    
    ImageIcon gaji = new ImageIcon("icon/gaji.jpeg");
    Image getGaji = gaji.getImage();
    Image modifiedGaji = getGaji.getScaledInstance(20, 20, Image.SCALE_REPLICATE);
    Icon gaji_n = new ImageIcon(modifiedGaji);
    
    ImageIcon data = new ImageIcon("icon/data.jpeg");
    Image getData = data.getImage();
    Image modifiedData = getData.getScaledInstance(20, 20, Image.SCALE_REPLICATE);
    Icon data_n = new ImageIcon(modifiedData);
    
    ImageIcon admin = new ImageIcon("icon/admin.jpeg");
    Image getAdmin = admin.getImage();
    Image modifiedAdmin = getAdmin.getScaledInstance(20, 20, Image.SCALE_REPLICATE);
    Icon admin_n = new ImageIcon(modifiedAdmin);
    
    public JButton btnHomeTransition = new JButton("HOME",home_n);
    public JButton btnGajiTransition = new JButton("GAJI",gaji_n);
    public JButton btnDataTransition = new JButton("DATA",data_n);
    public JButton btnInformasiTransition = new JButton("INFORMASI");
    public JButton btnAdminTransition = new JButton("ADMIN",admin_n);

    public HomeView() {
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        ImageIcon background3 = new ImageIcon("icon/background3.jpeg");
        Image getBackground3 = background3.getImage();
        Image modifiedBackground3 = getBackground3.getScaledInstance(600, 400, Image.SCALE_REPLICATE);
        background3 = new ImageIcon(modifiedBackground3);
        JLabel lBackground3 = new JLabel(background3);

        add(lInfo1);
        add(lInfo2);
        add(lInfo3);
        add(lInfo4);
        add(btnHomeTransition);
        add(btnGajiTransition);
        add(btnDataTransition);
        add(btnInformasiTransition);
        add(btnAdminTransition);
        add(lBackground3);

        setVisible(true);

        lInfo1.setBounds(160,100,200,20);
        lInfo2.setBounds(160,130,600,20);
        lInfo3.setBounds(160,160,600,20);
        lInfo4.setBounds(160,300,600,30);
        btnHomeTransition.setBounds(20,20,100,60);
        btnGajiTransition.setBounds(20,90,100,60);
        btnDataTransition.setBounds(20,160,100,60);
        btnInformasiTransition.setBounds(20,230,100,60);
        btnAdminTransition.setBounds(470,20,100,60);
        lBackground3.setBounds(0, 0, 600, 400);

        btnHomeTransition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transition transition = new Transition();
                transition.homeTransition();
                dispose();
            }
        });

        btnGajiTransition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transition transition = new Transition();
                transition.gajiPegawaiTransition();
                dispose();
            }
        });

        btnDataTransition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transition transition = new Transition();
                transition.dataPegawaiTransition();
                dispose();
            }
        });

        btnInformasiTransition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transition transition = new Transition();
                transition.informasiPegawaiTransition();
                dispose();
            }
        });

        btnAdminTransition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transition transition = new Transition();
                transition.loginAdminTransition();
                dispose();
            }
        });
    }
}
