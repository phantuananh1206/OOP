/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationcalculartor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class JavaApplicationCalculartor extends JFrame {
    private double Firstnumber,Seccondnumber;
    private JTextField tfShow,tfShow2;
    private JButton bt0 = new JButton("0");
    private JButton bt1 = new JButton("1");
    private JButton bt2 = new JButton("2");
    private JButton bt3 = new JButton("3");
    private JButton bt4 = new JButton("4");
    private JButton bt5 = new JButton("5");
    private JButton bt6 = new JButton("6");
    private JButton bt7 = new JButton("7");
    private JButton bt8 = new JButton("8");
    private JButton bt9 = new JButton("9");
    private JButton btcham = new JButton(".");
    private JButton btcong = new JButton("+");
    private JButton bttru = new JButton("-");
    private JButton btnhan = new JButton("x");
    private JButton btchia = new JButton("/");
    private JButton btbang = new JButton("=");
    private JButton btdel = new JButton("DEl");
    private JButton btac = new JButton("AC");
    
    
    public JavaApplicationCalculartor(){
       
        tfShow = new JTextField(15);
        tfShow.setHorizontalAlignment(JTextField.RIGHT);
        tfShow.setFont(new Font("",Font.BOLD,18));
        tfShow2 = new JTextField(15);
        tfShow2.setHorizontalAlignment(JTextField.RIGHT);
        tfShow2.setFont(new Font("",Font.BOLD,18));
        GUI();
    }
     
    
    private void GUI(){
        JFrame f = new JFrame();
        
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout());
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        
        JPanel pnlNorth = new JPanel();
        pnlNorth.setBackground(new Color(15, 62, 84));
        JLabel header = new JLabel("Carculator");
        header.setFont(new Font("",Font.BOLD,25));
        header.setForeground(new Color(255, 253, 255));
        pnlNorth.add(header);
        f.add(pnlNorth,BorderLayout.NORTH);
        
        JPanel pnlWest = new JPanel();
        pnlWest.setBackground(new Color(15,62,84));
        f.add(pnlWest,BorderLayout.WEST);
        JPanel pnlEast = new JPanel();
        pnlEast.setBackground(new Color(15,62,84));
        f.add(pnlEast,BorderLayout.EAST);
        JPanel pnlSouth = new JPanel();
        pnlSouth.setBackground(new Color(15,62,84));
        f.add(pnlSouth,BorderLayout.SOUTH);
        
        JPanel pnlCenter = new JPanel();
        pnlCenter.setBorder(BorderFactory.createTitledBorder(""));
        pnlCenter.setLayout(new BorderLayout(10,20));
        InCenter(pnlCenter);
        tinhToan();
        f.add(pnlCenter,BorderLayout.CENTER);
        
        f.setSize(315,390);
    }
    
    private void InCenter(JPanel pnlCenter){
        JPanel pnlShow = new JPanel();
        pnlShow.setLayout(new GridLayout(2,1,-1,-1));
        pnlShow.add(tfShow2);
        pnlShow.add(tfShow);
        pnlCenter.add(pnlShow,BorderLayout.NORTH);
        JPanel pnlReader = new JPanel();
        JLabel temp1 = new JLabel();
        JLabel temp2 = new JLabel();
        pnlReader.setLayout(new GridLayout(5,4,10,20));
        pnlReader.add(temp1);
        pnlReader.add(temp2);
        pnlReader.add(btdel);
        pnlReader.add(btac);
        pnlReader.add(bt7);
        pnlReader.add(bt8);
        pnlReader.add(bt9);
        pnlReader.add(btcong);
        pnlReader.add(bt4);
        pnlReader.add(bt5);
        pnlReader.add(bt6);
        pnlReader.add(bttru);
        pnlReader.add(bt1);
        pnlReader.add(bt2);
        pnlReader.add(bt3);
        pnlReader.add(btnhan);
        pnlReader.add(bt0);
        pnlReader.add(btcham);
        pnlReader.add(btchia);
        pnlReader.add(btbang);
        pnlCenter.add(pnlReader,BorderLayout.CENTER);
        JPanel pnlsouth = new JPanel();
        pnlCenter.add(pnlsouth,BorderLayout.SOUTH);
    }
    
    
    private void tinhToan(){
        
        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfShow.setText(tfShow.getText()+bt0.getText());
            }
        });
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfShow.setText(tfShow.getText()+bt1.getText());
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfShow.setText(tfShow.getText()+bt2.getText());
            }
        });
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfShow.setText(tfShow.getText()+bt3.getText());
            }
        });
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfShow.setText(tfShow.getText()+bt4.getText());
            }
        });
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfShow.setText(tfShow.getText()+bt5.getText());
            }
        });
        bt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfShow.setText(tfShow.getText()+bt6.getText());
            }
        });
        bt7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfShow.setText(tfShow.getText()+bt7.getText());
            }
        });
        bt8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfShow.setText(tfShow.getText()+bt8.getText());
            }
        });
        bt9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfShow.setText(tfShow.getText()+bt9.getText());
            }
        });
        
        btcong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfShow.setText(tfShow.getText()+btcong.getText());
                
            }
        });
        btnhan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfShow.setText(tfShow.getText()+btnhan.getText());
            }
        });
        bttru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfShow.setText(tfShow.getText()+bttru.getText());
            }
        });
        btcham.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tfShow.getText().equals("")){
                tfShow.setText("0.");
            }else{
                tfShow.setText(tfShow.getText()+btcham.getText());    
                }
            }
        });
        btchia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfShow.setText(tfShow.getText()+btchia.getText());
            }
        });
        btac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfShow.setText("");
            }
        });
        btdel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp;
                StringBuffer str = new StringBuffer(tfShow.getText());
                if(tfShow.getText().length() >0 ){
                str.deleteCharAt(tfShow.getText().length()-1);
                temp=str.toString();
                tfShow.setText(temp);
                }
            }
        });
        
        btbang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
     
                
            }
        });
    }
    

    
    
    
    public static void main(String[] args) {
       new JavaApplicationCalculartor();
    }
    
}
