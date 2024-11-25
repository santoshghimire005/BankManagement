package BankManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.cj.protocol.Resultset;

public class Login extends JFrame implements ActionListener {
    JLabel label, title, cardno, pin;
    JTextField cardTextField;
    JButton login, clear, register;
    JPasswordField pinPasswordField;

    Login() {
        setBounds(300, 200, 800, 500);
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));// imports and displays image
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);// this line for scaling image
        ImageIcon i3 = new ImageIcon(i2);// creates image icon of the scaled image

        label = new JLabel(i3);
        label.setBounds(0, 0, 100, 100);
        add(label);

        title = new JLabel("WELCOME TO ATM");
        title.setFont(new Font("Osward", Font.BOLD, 38));
        title.setBounds(180, 30, 400, 40);
        add(title);

        cardno = new JLabel("CARD NUMBER:");
        cardno.setFont(new Font("Osward", Font.BOLD, 20));
        cardno.setBounds(120, 130, 200, 40);
        add(cardno);

        pin = new JLabel("PIN: ");
        pin.setFont(new Font("Osward", Font.BOLD, 20));
        pin.setBounds(120, 180, 400, 40);
        add(pin);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 130, 300, 40);
        cardTextField.setFont(new Font("Osward", Font.PLAIN, 20));
        add(cardTextField);

        pinPasswordField = new JPasswordField();
        pinPasswordField.setBounds(300, 180, 300, 40);
        pinPasswordField.setFont(new Font("Osward", Font.PLAIN, 20));
        add(pinPasswordField);

        login = new JButton(" LOGIN ");
        login.setBounds(350, 270, 100, 40);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);
        login.addActionListener(this);

        clear = new JButton(" CLEAR ");
        clear.setBounds(470, 270, 100, 40);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        add(clear);
        clear.addActionListener(this);

        register = new JButton(" REGISTER ");
        register.setBounds(350, 350, 220, 40);
        register.setBackground(Color.BLACK);
        register.setForeground(Color.WHITE);
        add(register);
        register.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == register) {
            setVisible(false);
            dispose();
            new Register();

        }
        else if (ae.getSource() == clear) {
            cardTextField.setText("");
            pinPasswordField.setText("");
        } 
        
            else if (ae.getSource() == login) {
                try {
                    Conn conn = new Conn();
                    String cardnumber = cardTextField.getText().trim();
                    String pinnumber = new String(pinPasswordField.getPassword()).trim();
            
                    String query = "SELECT * FROM loginvalues WHERE cardnumber = '"+cardnumber+"' AND pinnumber = '"+pinnumber+"'";
                    
                    // Print the query to debug
                    System.out.println("Generated Query: " + query);
            
                    ResultSet rs = conn.s.executeQuery(query);
            
                    if (rs.next()) {
                        System.out.println("Login Successful!");
                        setVisible(false);
                        new Transactions(pinnumber);
                    } else {
                        System.out.println("No match found in database.");
                        JOptionPane.showMessageDialog(null, "Incorrect cardnumber or pin");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
            

        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
