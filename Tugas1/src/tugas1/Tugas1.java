/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author PC-VICKY1
 */


class Frame1 extends JFrame {
    JLabel judul = new JLabel("Selamat Datang!");
    JLabel ket = new JLabel("Silahkan masuk untuk melanjutkan.");
    JLabel username = new JLabel("Username");
    JTextField inputuser = new JTextField();
    JLabel password = new JLabel("Password");
    JTextField inputpass = new JTextField();
    JLabel jeniskelamin = new JLabel("Jenis Kelamin");
    JRadioButton pilihlaki = new JRadioButton("Laki-laki");
    JRadioButton pilihperempuan = new JRadioButton("Perempuan");
    JButton tombollogin = new JButton("Login");
    
    Frame1(){
        setVisible(true);
        setSize(520, 480);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(judul);
        judul.setBounds(10, 10, 150, 24);
        judul.setFont(new Font("Arial", Font.PLAIN, 20));
        
        add(ket);
        ket.setBounds(10, 35, 500, 24);
        ket.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(username);
        username.setBounds(10, 70, 500, 24);
        username.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(inputuser);
        inputuser.setBounds(10, 95, 485, 24);
        
        add(password);
        password.setBounds(10, 125, 500, 24);
        password.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(inputpass);
        inputpass.setBounds(10, 150, 485, 24);
        
        add(jeniskelamin);
        jeniskelamin.setBounds(10, 180, 485, 24);
        
        ButtonGroup pilihgender = new ButtonGroup();
        pilihgender.add(pilihlaki);
        pilihgender.add(pilihperempuan);
       
            add(pilihlaki);
            pilihlaki.setBounds (10, 205, 145, 24);

            add(pilihperempuan);
            pilihperempuan.setBounds (250, 205, 150, 24);
            
        add(tombollogin);
        tombollogin.setBounds(10, 245, 485, 26);
    }
}

class Frame2 extends JFrame {
    JLabel judul = new JLabel("Welcome, ");
    JLabel usergender = new JLabel("[Mr./Mrs.]");
    JLabel username = new JLabel("[Username]");
    JLabel ket = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung Balok");
    JLabel panjang = new JLabel("Panjang");
    JTextField inputpanjang = new JTextField();
    JLabel lebar = new JLabel("Lebar");
    JTextField inputlebar = new JTextField();
    JLabel tinggi = new JLabel("Tinggi");
    JTextField inputtinggi = new JTextField();
    JButton tombolhitung = new JButton("Hitung");
    JButton tombolreset = new JButton("Reset");
    JLabel hasil = new JLabel("Hasil");
    JLabel luas = new JLabel("Luas Persegi");
    JLabel hasilluas = new JLabel("[Hasil berupa angka]");
    JLabel keliling = new JLabel("Keliling Persegi");
    JLabel hasilkeliling = new JLabel("[Hasil berupa angka]");
    JLabel volume = new JLabel("Volume Balok");
    JLabel hasilvolume = new JLabel("[Hasil berupa angka]");
    JLabel luaspermukaan = new JLabel("Luas Permukaan Balok");
    JLabel hasillp = new JLabel("[Hasil berupa angka]");
    
    Frame2(){
        this.hasil = new JLabel("Hasil");
        setVisible(true);
        setSize(520, 480);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        add(judul);
        judul.setBounds(10, 10, 480, 24);
        judul.setFont(new Font("Arial", Font.PLAIN, 20));
        
        add(usergender);
        usergender.setBounds(105, 10, 480, 24);
        usergender.setFont(new Font("Arial", Font.PLAIN, 20));
        
        add(username);
        username.setBounds(200, 10, 480, 24);
        username.setFont(new Font("Arial", Font.PLAIN, 20));
        
        add(ket);
        ket.setBounds(10, 35, 500, 24);
        ket.setFont(new Font("Arial", Font.PLAIN, 14));
        
        add(panjang);
        panjang.setBounds(10, 80, 140, 24);
        panjang.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(inputpanjang);
        inputpanjang.setBounds(150, 80, 345, 24);
        
        add(lebar);
        lebar.setBounds(10, 115, 140, 24);
        lebar.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(inputlebar);
        inputlebar.setBounds(150, 115, 345, 24);
        
        add(tinggi);
        tinggi.setBounds(10, 150, 140, 24);
        tinggi.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(inputtinggi);
        inputtinggi.setBounds(150, 150, 345, 24);
        
        add(tombolhitung);
        tombolhitung.setBounds(10, 190, 485, 26);
        
        add(tombolreset);
        tombolreset.setBounds(10, 225, 485, 26);
        
        add(hasil);
        hasil.setBounds(10, 260, 485, 26);
        hasil.setFont(new Font("Arial", Font.BOLD, 13));
        hasil.setHorizontalAlignment(SwingConstants.CENTER);
        
        add(luas);
        luas.setBounds(10, 290, 200, 24);
        luas.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(hasilluas);
        hasilluas.setBounds(237, 290, 200, 24);
        hasilluas.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(keliling);
        keliling.setBounds(10, 315, 200, 24);
        keliling.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(hasilkeliling);
        hasilkeliling.setBounds(237, 315, 200, 24);
        hasilkeliling.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(volume);
        volume.setBounds(10, 340, 330, 24);
        volume.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(hasilvolume);
        hasilvolume.setBounds(237, 340, 200, 24);
        hasilvolume.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(luaspermukaan);
        luaspermukaan.setBounds(10, 365, 200, 24);
        luaspermukaan.setFont(new Font("Arial", Font.BOLD, 12));
        
        add(hasillp);
        hasillp.setBounds(237, 365, 200, 24);
        hasillp.setFont(new Font("Arial", Font.BOLD, 12));
    }
}

public class Tugas1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame1 kotakFrame1 = new Frame1();
        Frame2 kotakFrame2 = new Frame2();
    }
    
}
