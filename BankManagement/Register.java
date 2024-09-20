package BankManagement;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.util.Random;

public class Register extends JFrame implements ActionListener {
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
    // JDateChooser datechooser;
    JRadioButton male, female, others, single, married, nospecify;
    JButton next,back;
    
    Register(){
        Random ran = new Random();
        int random= Math.abs(ran.nextInt()%9000);

        JLabel formno = new JLabel("APPLICATION FORM NO: "+ random);
        formno.setBounds(200,0, 500, 30);
        formno.setFont(new Font("Raleway", Font.BOLD, 25));
        add(formno);

        JLabel page = new JLabel("Page 1: Personal Details");
        page.setBounds(300,40, 300, 30);
        page.setFont(new Font("Raleway", Font.BOLD, 16));
        add(page);

        JLabel name = new JLabel("NAME: ");
        name.setBounds(100,80, 100, 30);
        name.setFont(new Font("Raleway", Font.BOLD, 16));
        add(name);
        nameTextField = new JTextField();
        nameTextField.setBounds( 300, 80, 400, 30);
        nameTextField.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(nameTextField);

        JLabel fname = new JLabel("FATHER'S NAME: ");
        fname.setBounds(100,120, 300, 30);
        fname.setFont(new Font("Raleway", Font.BOLD, 16));
        add(fname);
        fnameTextField = new JTextField();
        fnameTextField.setBounds( 300, 120, 400, 30);
        fnameTextField.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(fnameTextField);

        JLabel dob = new JLabel("DATE OF BIRTH: ");
        dob.setBounds(100,160, 300, 30);
        dob.setFont(new Font("Raleway", Font.BOLD, 16));
        add(dob);
        //  datechooser= new JDateChooser();
        // datechooser.setBounds(300, 160, 400, 30);
        // add(datechooser);

    

        JLabel gender = new JLabel("GENDER: ");
        gender.setBounds(100,200, 100, 30);
        gender.setFont(new Font("Raleway", Font.BOLD, 16));
        add(gender);
        male= new JRadioButton("MALE");
        male.setBounds(300, 200, 100, 30);
        male.setBackground(Color.white);
        add(male);
        female= new JRadioButton("FEMALE");
        female.setBounds(400, 200, 100, 30);
        female.setBackground(Color.white);
        add(female);
        others= new JRadioButton("OTHERS");
        others.setBounds(500, 200, 100, 30);
        others.setBackground(Color.white);
        add(others);
        ButtonGroup gendergroup= new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(others);

    
        JLabel email = new JLabel("EMAIL: ");
        email.setBounds(100,240, 100, 30);
        email.setFont(new Font("Raleway", Font.BOLD, 16));
        add(email);
        emailTextField = new JTextField();
        emailTextField.setBounds( 300, 240, 400, 30);
        emailTextField.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(emailTextField);


        JLabel marriage = new JLabel("MARITAL STATUS: ");
        marriage.setBounds(100,280, 150, 30);
        marriage.setFont(new Font("Raleway", Font.BOLD, 16));
        add(marriage);
        single= new JRadioButton("SINGLE");
        single.setBounds(300,280,100,30);
        single.setBackground(Color.WHITE);
        add(single);
        married= new JRadioButton("MARRIED");
        married.setBounds(400,280,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        nospecify= new JRadioButton("DON'T SPECIFY");
        nospecify.setBounds(500,280,150,30);
        nospecify.setBackground(Color.WHITE);
        add(nospecify);
        ButtonGroup marriagegroup= new ButtonGroup();
        marriagegroup.add(single);
        marriagegroup.add(married);
        marriagegroup.add(nospecify);


        

        JLabel address = new JLabel("ADDRESS: ");
        address.setBounds(100,320, 100, 30);
        address.setFont(new Font("Raleway", Font.BOLD, 16));
        add(address);
        addressTextField = new JTextField();
        addressTextField.setBounds( 300, 320, 400, 30);
        addressTextField.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(addressTextField);

        JLabel city = new JLabel("CITY: ");
        city.setBounds(100,360, 100, 30);
        city.setFont(new Font("Raleway", Font.BOLD, 16));
        add(city);
        cityTextField = new JTextField();
        cityTextField.setBounds( 300, 360, 400, 30);
        cityTextField.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(cityTextField);

        JLabel state = new JLabel("STATE: ");
        state.setBounds(100,400, 100, 30);
        state.setFont(new Font("Raleway", Font.BOLD, 16));
        add(state);
        cityTextField = new JTextField();
        cityTextField.setBounds( 300, 400, 400, 30);
        cityTextField.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(cityTextField);

        JLabel pincode = new JLabel("PIN CODE: ");
        pincode.setBounds(100,440, 100, 30);
        pincode.setFont(new Font("Raleway", Font.BOLD, 16));
        add(pincode);
        pincodeTextField = new JTextField();
        pincodeTextField.setBounds( 300, 440, 400, 30);
        pincodeTextField.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(pincodeTextField);

        next = new JButton("NEXT");
        next.setBounds(400,500, 100, 30);
        next.setFont(new Font("Raleway", Font.BOLD, 16));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        add(next);
        next.addActionListener(this);

        back = new JButton("BACK");
        back.setBounds(520,500, 100, 30);
        back.setFont(new Font("Raleway", Font.BOLD, 16));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);
        back.addActionListener(this);

        





        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(350,40,800,750);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
            dispose();
            new Login();
        }
        else if (ae.getSource()==next){

        }

    }
    public static void main(String[] args) {
        new Register();
    }
}
