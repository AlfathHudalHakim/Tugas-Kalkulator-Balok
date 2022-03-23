/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import javax.swing.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class KalkulatorBalok extends JFrame{
     JLabel judul = new JLabel("Kalkulator Luas Persegi Panjang, Keliling Persegi Panjang, Volume, dan Luas Permukaan Pada Balok");
    JLabel l = new JLabel("Lebar Balok");
    JLabel p = new JLabel("Panjang Balok");
    JLabel t = new JLabel("Tinggi Balok");
    JLabel hasil = new JLabel("Hasil Kalkulasi : ");

    JLabel labelL = new JLabel("");
    JLabel labelkll = new JLabel("");
    JLabel labelV = new JLabel("");
    JLabel labellp = new JLabel("");

    JTextField fieldl = new JTextField();
    JTextField fieldp = new JTextField();
    JTextField fieldt = new JTextField();

    JButton tombolhitung=  new JButton("Hitung");
    JButton tombolreset=  new JButton("Reset");

    public KalkulatorBalok(){
        setSize(800,600);
        setLayout(null);

        add(judul);
        add(l);
        add(p);
        add(t);
        add(hasil);

        add(fieldl);
        add(fieldp);
        add(fieldt);

        add(labelL);
        add(labelkll);
        add(labelV);
        add(labellp);

        add(tombolhitung);
        add(tombolreset);


        judul.setBounds(150,20,600,25);

        l.setBounds(220,100,150,25);
        fieldl.setBounds(380,100,270,25);

        p.setBounds(220,150,150,25);   
        fieldp.setBounds(380,150,270,25);

        t.setBounds(220,200,150,25);
        fieldt.setBounds(380,200,270,25);

        hasil.setBounds(350,240,200,25);

        labelL.setBounds(320,270,300,25);
        labelkll.setBounds(320,290,300,25);
        labelV.setBounds(320,310,300,25);
        labellp.setBounds(320,330,300,25);

        tombolhitung.setBounds(250,400,100,50);
        tombolreset.setBounds(430,400,100,50);


        tombolhitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double p = Double.parseDouble(fieldp.getText());
                double l = Double.parseDouble(fieldl.getText());
                double t = Double.parseDouble(fieldt.getText());

                double L =  p * l;
                double kll = 2*(p + l);
                double V = p * l * t;
                double lp = 2 * (p*l + p*t + l*t);


                labelL.setText("Luas Persegi Panjang : " + L);
                labelkll.setText("Keliling Persegi Panjang : " + kll);
                labelV.setText("Volume Balok : " + V);
                labellp.setText("Luas Permukaan Balok : " + lp);
            }
        });

        tombolreset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldp.setText("");
                fieldl.setText("");
                fieldt.setText("");
                labelL.setText("");
                labelkll.setText("");
                labelV.setText("");
                labellp.setText("");
            }
        });

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
