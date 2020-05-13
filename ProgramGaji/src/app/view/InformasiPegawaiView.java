package app.view;

import app.controller.Transition;
import java.awt.Image;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InformasiPegawaiView extends JFrame {
    JLabel lInfo1 = new JLabel("klik tombol gaji untuk menghitung gaji anda");
    JLabel lInfo2 = new JLabel("klik tombol data untuk melihat data sudah masuk atau belum");
    JLabel lInfo3 = new JLabel("PETUNJUK KARYAWAN");

    public JButton btnBack = new JButton("BACK");

    public InformasiPegawaiView() {
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        add(lInfo1).setBounds(120,70,400,40);
        add(lInfo2).setBounds(120,100,400,40);
        add(lInfo3).setBounds(170,20,600,30);
        add(btnBack).setBounds(200,200,100,40);
        
        ImageIcon background3 = new ImageIcon("icon/background3.jpeg");
        Image getBackground3 = background3.getImage();
        Image modifiedBackground3 = getBackground3.getScaledInstance(600, 400, Image.SCALE_REPLICATE);
        background3 = new ImageIcon(modifiedBackground3);
        JLabel lBackground3 = new JLabel(background3);
        add(lBackground3);
        lBackground3.setBounds(0, 0, 600, 400);

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Transition transition = new Transition();
                transition.homeTransition();
                dispose();
            }
        });
    }
}
