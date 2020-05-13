package app.view;

import app.controller.Transition;
import java.awt.Image;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataPegawaiView extends JFrame {
    JLabel lInfo = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");

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
    public JButton btnShow = new JButton("SHOW");

    public JTable jTable;
    JScrollPane scrollPane;
    DefaultTableModel defaultTableModel;
    JScrollPane sp;
    JTextArea jTextArea = new JTextArea();
    public String columns[] = {"ID", "Nama", "Posisi", "Gaji Pokok", "Jam Lembur", "Tunjangan", "Total Gaji"};

    public DataPegawaiView() {
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        scrollPane = new JScrollPane(jTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        defaultTableModel = new DefaultTableModel(columns, 0);
        jTable = new JTable(defaultTableModel);
        sp = new JScrollPane(jTable);
        sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(sp).setBounds(120,80,400,200);

        add(lInfo).setBounds(160,330,600,30);
        add(btnHomeTransition).setBounds(10,20,100,60);
        add(btnGajiTransition).setBounds(10,90,100,60);
        add(btnDataTransition).setBounds(10,160,100,60);
        add(btnInformasiTransition).setBounds(10,230,100,60);
        add(btnAdminTransition).setBounds(470,10,100,60);
        add(btnShow).setBounds(250, 290,100,40);
        ImageIcon background3 = new ImageIcon("icon/background3.jpeg");
        Image getBackground3 = background3.getImage();
        Image modifiedBackground3 = getBackground3.getScaledInstance(600, 400, Image.SCALE_REPLICATE);
        background3 = new ImageIcon(modifiedBackground3);
        JLabel lBackground3 = new JLabel(background3);
        add(lBackground3);
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
