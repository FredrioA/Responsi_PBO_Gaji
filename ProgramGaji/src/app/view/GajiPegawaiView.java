package app.view;

import app.controller.Transition;
import java.awt.Image;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GajiPegawaiView extends JFrame {
    JLabel lId = new JLabel("ID Pegawai : ");
    JLabel lNama = new JLabel("Nama : ");
    JLabel lPosisi = new JLabel("Posisi : ");
    JLabel lAlamat = new JLabel("Alamat : ");
    JLabel lNoHp = new JLabel("No HP : ");
    JLabel lGaji = new JLabel("Gaji Pokok : ");
    JLabel lJamLembur = new JLabel("Jam Lembur : ");
    JLabel lTunjangan = new JLabel("Tunjangan : ");
    JLabel lPajak = new JLabel("Pajak : ");
    JLabel lSumGaji = new JLabel("Total Gaji : ");
    JLabel lInfo = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");

    public JTextField txId = new JTextField();
    public JTextField txNama = new JTextField();
    public JTextField txAlamat = new JTextField();
    public JTextField txNoHp = new JTextField();
    public JTextField txGaji = new JTextField();
    public JTextField txJamLembur = new JTextField();
    public JTextField txTunjangan = new JTextField();
    public JTextField txPajak = new JTextField();
    public JTextField txSumGaji = new JTextField();

    String[] posisi = {"", "Direktur", "Manager", "Programmer", "Marketing"};
    public JComboBox comPosisi = new JComboBox(posisi);

    public JButton btnHitung = new JButton("Hitung");
    public JButton btnSimpan = new JButton("Simpan");
    
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

    public GajiPegawaiView() {
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        add(lInfo).setBounds(160,330,600,30);
        add(btnHomeTransition).setBounds(20,20,100,60);
        add(btnGajiTransition).setBounds(20,90,100,60);
        add(btnDataTransition).setBounds(20,160,100,60);
        add(btnInformasiTransition).setBounds(20,230,100,60);
        add(btnAdminTransition).setBounds(470,20,100,60);
        add(btnHitung).setBounds(470,200,100,60);
        add(btnSimpan).setBounds(470,270,100,60);

        add(lId).setBounds(130,40,100,20);
        add(lNama).setBounds(130,70,100,20);
        add(lPosisi).setBounds(130,100,100,20);
        add(lAlamat).setBounds(130,130,100,20);
        add(lNoHp).setBounds(130,160,100,20);
        add(lGaji).setBounds(130,190,100,20);
        add(lJamLembur).setBounds(130,220,100,20);
        add(lTunjangan).setBounds(130,250,100,20);
        add(lPajak).setBounds(130,280,100,20);
        add(lSumGaji).setBounds(130,310,100,20);

        add(txId).setBounds(230,40,200,20);
        add(txNama).setBounds(230,70,200,20);
        add(comPosisi).setBounds(230,100,100,20);
        add(txAlamat).setBounds(230,130,300,20);
        add(txNoHp).setBounds(230,160,150,20);
        add(txGaji).setBounds(230,190,150,20);
        add(txJamLembur).setBounds(230,220,100,20);
        add(txTunjangan).setBounds(230,250,150,20);
        add(txPajak).setBounds(230,280,150,20);
        add(txSumGaji).setBounds(230,310,150,20);
        
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
