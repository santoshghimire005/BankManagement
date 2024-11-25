package BankManagement;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Withdraw extends JFrame implements ActionListener{
    JButton withdraw, back;
    String pinnumber;
    JTextField amount;
    Withdraw(String pinnumber){
        this.pinnumber= pinnumber;

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,700);
        add(image);

        JLabel text = new JLabel("Enter the amount you want to withdraw");
        text.setBounds(400,100,450,25);
        text.setFont(new Font("Raleway",Font.BOLD, 22));
        text.setForeground(Color.white);
        image.add(text);

        amount = new JTextField();
        amount.setBounds(400,170,300,35);
        image.add(amount);

        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(550,220,150,40);
        withdraw.setFont(new Font("Raleway", Font.BOLD, 18));
        withdraw.setBackground(Color.black);
        withdraw.setForeground(Color.white);
        withdraw.addActionListener(this);
        image.add(withdraw);

        back = new JButton("BACK");
        back.setBounds(550,270,150,40);
        back.setFont(new Font("Raleway", Font.BOLD, 18));
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        image.add(back);



        setLayout(null);
        setBounds(300,100,900,700);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==withdraw){
            String number= amount.getText();
            Date date= new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "please enter an valid amount");
            }
            else{
                try{
                Conn conn = new Conn();
                String query= "insert into bank values('"+pinnumber+"','"+date+"','Withdraw','"+number+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "RS "+number+" Withdrewed successfully");
                setVisible(false);
                new Transactions(pinnumber);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }

        }
        else if(ae.getSource()==back){
            setVisible(false);
            new Transactions(pinnumber);
        }

    }
    public static void main(String[] args) {
        new Withdraw("0000");
    }
}
