package BankManagement;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;


import com.toedter.calendar.JDateChooser;


public class RegisterTwo extends JFrame implements ActionListener {
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
    JTextField panTextField, citizenshipTextField, passportTextField;
    JDateChooser datechooser;
    JRadioButton male, female, others, single, married, nospecify;
    JRadioButton yes,no;
    JButton next,back;
    JComboBox religionSelect, categorySelect, incomeSelect, qualificationSelect, occupationSelect;
    String formno;
   
    
    
    RegisterTwo(String formno){
        this.formno= formno;
        
       setTitle("PAGE 2: ADDITIONAL DETAILS");

        JLabel page = new JLabel("Page 2: Additional Details");
        page.setBounds(300,40, 300, 30);
        page.setFont(new Font("Raleway", Font.BOLD, 16));
        add(page);

        JLabel religion = new JLabel("RELIGION: ");
        religion.setBounds(100,80, 100, 30);
        religion.setFont(new Font("Raleway", Font.BOLD, 16));
        add(religion);
        String valReligion[]= {"HINDU","BUDDHIST","CHRISTIAN","MUSLIM","OTHERS"};
        religionSelect= new JComboBox<>(valReligion);
        religionSelect.setBounds( 300, 80, 400, 30);
        religionSelect.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(religionSelect);


        JLabel category = new JLabel("CATEGORY: ");
        category.setBounds(100,120, 300, 30);
        category.setFont(new Font("Raleway", Font.BOLD, 16));
        add(category);
        String valCategory[]={"SAVING","CURRENT"};
        categorySelect = new JComboBox<>(valCategory);
        categorySelect.setBounds( 300, 120, 400, 30);
        categorySelect.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(categorySelect);

        JLabel income = new JLabel("INCOME: ");
        income.setBounds(100,160, 300, 30);
        income.setFont(new Font("Raleway", Font.BOLD, 16));
        add(income);
        String valIncome[]={"Less than 1 lakh","1-2 lakh","2-5 lakh","5-10 lakh","More than 10 lakh"};
        incomeSelect= new JComboBox<>(valIncome);
        incomeSelect.setBounds(300, 160, 400, 30);
        incomeSelect.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(incomeSelect);

    

        JLabel educational = new JLabel("EDUCATIONAL ");
        educational.setBounds(100,217, 150, 30);
        educational.setFont(new Font("Raleway", Font.BOLD, 16));
        add(educational);
       
    
        JLabel qualification = new JLabel("QUALIFICATION: ");
        qualification.setBounds(100,240, 150, 30);
        qualification.setFont(new Font("Raleway", Font.BOLD, 16));
        add(qualification);

        String valQualification[]={"Iliterate","undergraduate ","Bachelor's ","Master's ","PHD "};
        qualificationSelect= new JComboBox<>(valQualification);
        qualificationSelect.setBounds(300, 240, 400, 30);
        qualificationSelect.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(qualificationSelect);

        

        JLabel occupation = new JLabel("OCCUPATION: ");
        occupation.setBounds(100,300, 150, 30);
        occupation.setFont(new Font("Raleway", Font.BOLD, 16));
        add(occupation);

        String valOccupation[]={"Student","Unemployed "," ","Master's ","PHD "};
        occupationSelect= new JComboBox<>(valOccupation);
        occupationSelect.setBounds(300, 300, 400, 30);
        occupationSelect.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(occupationSelect);
        


        

        JLabel citizenship = new JLabel("CITIZENSHIP NO: ");
        citizenship.setBounds(100,340, 150, 30);
        citizenship.setFont(new Font("Raleway", Font.BOLD, 16));
        add(citizenship);
        citizenshipTextField = new JTextField();
        citizenshipTextField.setBounds( 300, 340, 400, 30);
        citizenshipTextField.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(citizenshipTextField);

        JLabel pan = new JLabel("PAN NUMBER ");
        pan.setBounds(100,380, 150, 30);
        pan.setFont(new Font("Raleway", Font.BOLD, 16));
        add(pan);
        panTextField = new JTextField();
        panTextField.setBounds( 300, 380, 400, 30);
        panTextField.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(panTextField);

        JLabel passsport = new JLabel("PASSPORT NUMBER: ");
        passsport.setBounds(100,420, 150, 30);
        passsport.setFont(new Font("Raleway", Font.BOLD, 16));
        add(passsport);
        passportTextField = new JTextField();
        passportTextField.setBounds( 300, 420, 400, 30);
        passportTextField.setFont(new Font("Raleway", Font.PLAIN, 16));
        add(passportTextField);

        JLabel pincode = new JLabel("EXISITING ACCOUNT ");
        pincode.setBounds(100,460, 150, 30);
        pincode.setFont(new Font("Raleway", Font.BOLD, 16));
        add(pincode);

        yes = new JRadioButton("YES");
        yes.setBounds(300, 460, 100,30);
        yes.setBackground(Color.white);
        add(yes);
        no = new JRadioButton("NO");
        no.setBounds(420, 460, 100,30);
        no.setBackground(Color.white);
        add(no);
        ButtonGroup select = new ButtonGroup();
        select.add(yes);
        select.add(no);
        

        next = new JButton("NEXT");
        next.setBounds(400,500, 100, 30);
        next.setFont(new Font("Raleway", Font.BOLD, 16));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        add(next);
        next.addActionListener(this);

        

        





        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(350,40,800,750);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
            
            String religion= (String) religionSelect.getSelectedItem();
            String category= (String) categorySelect.getSelectedItem();
            String income= (String) categorySelect.getSelectedItem();
            String qualification = (String) qualificationSelect.getSelectedItem();
            String occupation = (String) occupationSelect.getSelectedItem();
            String select= null;
            if(yes.isSelected()){
                select="YES";
            }
            else if (no.isSelected()){
                select="NO";
            }

            String citizenship= citizenshipTextField.getText();
            String pan =panTextField.getText();
            String passport= passportTextField.getText();
            try{
                if(citizenship.equals("")|| pan.equals("")|| passport.equals("")){
                    JOptionPane.showMessageDialog(null, "NO EMPTY FIELDS ALLOWED");
                }
                else{
                    Conn c= new Conn();
                    String query= "insert into registerTwo values('"+formno+"','"+ religion+"','"+category+"','"+income+"','"+qualification+"','"+occupation+"','"+citizenship+"','"+pan+"','"+passport+"','"+select+"')";
                    c.s.executeUpdate(query);
                }
            }
            catch(Exception e){
                System.out.println(e);
            }              
        }
    public static void main(String[] args) {
        new RegisterTwo("");
    }
}


