/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class GUIfak extends JFrame implements ActionListener{
    double hasil;
    Container con = new Container();
    JButton hapus, ok;
    JTextField tex1, tex2;
    double fakt(double angka){
        if(angka==0){
            return 1;
        }
        else
            return angka*fakt(angka-1);
    }
    public GUIfak(){
        super("faktorial niy...!!");
        setSize(30,250);
        ok = new JButton("faktorial");
        hapus = new JButton("hapus");
        ok.addActionListener(this);
        hapus.addActionListener(this);
        JPanel tombol = new JPanel();
        hapus.setEnabled(false);
        tombol.setLayout(new GridLayout(1,2,10,10));

        tombol.add(hapus);
        tombol.add(ok);
        tex1 = new JTextField("");
        tex2 = new JTextField("");
        tex2.setEditable(false);
        JPanel tex = new JPanel();
        tex.setLayout(new GridLayout(2,1,10,10));
        tex.add(tex1);tex.add(tex2);
        con=getContentPane();
        con.setLayout(null);
        tex.setBounds(100,80,100,50);
        tombol.setBounds(50,150,200,30);
        con.add(tombol);
        con.add(tex);
        show();
    }
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource()==ok){
                hapus.setEnabled(true);
                String a;
                double angka = Double.parseDouble(tex1.getText());
                hasil = fakt(angka);
            }
            tex2.setText(Double.toString(hasil));
            if(e.getSource()==hapus){
                tex1.setText("");
                tex2.setText("");
                hapus.setEnabled(false);
            }
        }
        catch(Exception ex){
            hapus.setEnabled(false);
            JOptionPane.showMessageDialog(this,"masukkan nilai yang benar...!");
        }
    }
    public static void main(String[] Zzzz){
            GUIfak q = new GUIfak();
            q.setResizable(false);
            q.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
