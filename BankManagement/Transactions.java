package BankManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transactions extends JFrame implements ActionListener {

    JButton deposit, withdraw, fastcash, statement, pinchange, balance, exit;
    String pinnumber;

     Transactions(String pinnumber){
        pinnumber= this.pinnumber;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,700);
        add(image);

        JLabel text = new JLabel("PLEASE SELECT YOUR TRANSACTIONS");
        text.setBounds(400,80,450,25);
        text.setFont(new Font("Raleway",Font.BOLD, 22));
        text.setForeground(Color.white);
        image.add(text);

        deposit = new JButton("DEPOSIT");
        deposit.setBounds(420,150,150,40);
        deposit.setFont(new Font("Raleway", Font.BOLD, 18));
        deposit.setBackground(Color.black);
        deposit.setForeground(Color.white);
        deposit.addActionListener(this);
        image.add(deposit);

        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(650,150,150,40);
        withdraw.setFont(new Font("Raleway", Font.BOLD, 18));
        withdraw.setBackground(Color.black);
        withdraw.setForeground(Color.white);
        withdraw.addActionListener(this);
        image.add(withdraw);

        fastcash = new JButton("FAST CASH");
        fastcash.setBounds(420,220,150,40);
        fastcash.setFont(new Font("Raleway", Font.BOLD, 18));
        fastcash.setBackground(Color.black);
        fastcash.setForeground(Color.white);
        fastcash.addActionListener(this);
        image.add(fastcash);

        statement = new JButton("STATEMENT");
        statement.setBounds(650,220,150,40);
        statement.setFont(new Font("Raleway", Font.BOLD, 18));
        statement.setBackground(Color.black);
        statement.setForeground(Color.white);
        statement.addActionListener(this);
        image.add(statement);

        pinchange = new JButton("PIN CHANGE");
        pinchange.setBounds(420,290,150,40);
        pinchange.setFont(new Font("Raleway", Font.BOLD, 18));
        pinchange.setBackground(Color.black);
        pinchange.setForeground(Color.white);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balance = new JButton("BALANCE");
        balance.setBounds(650,290,150,40);
        balance.setFont(new Font("Raleway", Font.BOLD, 18));
        balance.setBackground(Color.black);
        balance.setForeground(Color.white);
        balance.addActionListener(this);
        image.add(balance);

        exit = new JButton("EXIT");
        exit.setBounds(650,360,150,40);
        exit.setFont(new Font("Raleway", Font.BOLD, 18));
        exit.setBackground(Color.black);
        exit.setForeground(Color.white);
        exit.addActionListener(this);
        image.add(exit);


        

        setBounds(300,100,900,700);
        // setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void actionPerformed( ActionEvent ae){


    }
public static void main(String[] args) {
    new Transactions("0000");
}
    
}
