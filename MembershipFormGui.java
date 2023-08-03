
package MembershipFormPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author FULUFHELO
 */

public class MembershipFormGui extends JFrame{
    
    //panels 
    private JPanel heading_pnl;
    private JPanel name_pnl;
    private JPanel surname_pnl;
    private JPanel id_pnl;
    private JPanel gender_pnl;
    private JPanel contract_pnl;
    private JPanel button_pnl;
    
    private JPanel client_details_pnl;
    private JPanel contract_options_pnl;
    
    private JPanel client_contract_pnl;
    
    private JPanel main_pnl;
    
    //labels 
    private JLabel heading_lbl;
    private JLabel name_lbl;
    private JLabel surname_lbl;
    private JLabel id_lbl;
    private JLabel gender_lbl;
    private JLabel contract_lbl;
    
    //text fields
    private JTextField name_txtfld;
    private JTextField surname_txtfld;
    private JTextField id_txtfld;
    
    //combo box 
    private JComboBox combo_box;
    
    //radio buttons 
    private JRadioButton month_month_rdbtn;
    private JRadioButton six_months_rdbtn;
    private JRadioButton annual_rdbtn;
    
    //button group
    private ButtonGroup button_group;
    
    //check box 
    private JCheckBox check_box;
    
    //text area 
    private JTextArea text_area;
    
    //buttons 
    private JButton apply_btn;
    private JButton display_btn;
    
    //scroll
    private JScrollPane scroll;
    
    //arraylist
    private ArrayList<CreateMember> members;
    
    public MembershipFormGui(){
    
        setTitle("Gym Membership");
        setSize(500, 850);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setResizable(false);
        
        //arraylist
        members = new ArrayList<>();
        
        //creating panels
        heading_pnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        name_pnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surname_pnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        id_pnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        gender_pnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contract_pnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        client_details_pnl = new JPanel(new GridLayout(4, 1, 1, 1));
        client_details_pnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 1), "Client Details"));
        contract_options_pnl = new JPanel(new GridLayout(2, 1, 1, 1));
        contract_options_pnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 1), "Contract Options"));
        client_contract_pnl = new JPanel(new BorderLayout());
        
        main_pnl = new JPanel(new BorderLayout());
        
        //creating labels 
        heading_lbl = new JLabel("Membership Form");
        name_lbl = new JLabel("Name:     ");
        surname_lbl = new JLabel("Surname:  ");
        id_lbl = new JLabel("ID No:    ");
        gender_lbl = new JLabel("Gender:   ");
        contract_lbl = new JLabel("Type of contract: ");
        
        //creating text fields 
        name_txtfld = new JTextField(10);
        surname_txtfld = new JTextField(10);
        id_txtfld = new JTextField(10);
        
        //creating combo box
        combo_box = new JComboBox();
        combo_box.addItem("Male");
        combo_box.addItem("Female");
        
        //creating radio buttons 
        month_month_rdbtn = new JRadioButton("Month-to-Month");
        six_months_rdbtn = new JRadioButton("Six Months");
        annual_rdbtn = new JRadioButton("Annual");
        
        //creating button group
        button_group = new ButtonGroup();
        button_group.add(month_month_rdbtn);
        button_group.add(six_months_rdbtn);
        button_group.add(annual_rdbtn);
        
        //creating check box
        check_box = new JCheckBox("Select the checkbox if you need a personal trainer");
        
        //creating text area
        text_area = new JTextArea(20, 40);
        text_area.setEditable(false);
        
        //scroll
        scroll = new JScrollPane(text_area);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        //creating buttons 
        apply_btn = new JButton("APPLY");
        apply_btn.addActionListener(new ApplyListener());
        display_btn = new JButton("DISPLAY");
        display_btn.addActionListener(new DisplayListener());
        
        heading_pnl.add(heading_lbl);
        
        name_pnl.add(name_lbl);
        name_pnl.add(name_txtfld);
        
        surname_pnl.add(surname_lbl);
        surname_pnl.add(surname_txtfld);
        
        id_pnl.add(id_lbl);
        id_pnl.add(id_txtfld);
        
        gender_pnl.add(gender_lbl);
        gender_pnl.add(combo_box);
        
        //client_details_pnl.add(heading_pnl);
        client_details_pnl.add(name_pnl);
        client_details_pnl.add(surname_pnl);
        client_details_pnl.add(id_pnl);
        client_details_pnl.add(gender_pnl);
        
        contract_pnl.add(contract_lbl);
        contract_pnl.add(month_month_rdbtn);
        contract_pnl.add(six_months_rdbtn);
        contract_pnl.add(annual_rdbtn);
      
        contract_options_pnl.add(contract_pnl);
        contract_options_pnl.add(check_box);
        
        client_contract_pnl.add(client_details_pnl, BorderLayout.NORTH);
        client_contract_pnl.add(contract_options_pnl, BorderLayout.SOUTH);
        
        button_pnl = new JPanel();
        button_pnl.add(apply_btn);
        button_pnl.add(display_btn);
        
        main_pnl.add(client_contract_pnl, BorderLayout.NORTH);
        main_pnl.add(scroll, BorderLayout.CENTER);
        main_pnl.add(button_pnl, BorderLayout.SOUTH);
        
        add(main_pnl);
        pack();
        setVisible(true);
    }
    
    public class ApplyListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            
            String name = name_txtfld.getText();
            String surname = surname_txtfld.getText();
            String id = id_txtfld.getText();
            String gender = (String)combo_box.getSelectedItem();
            Boolean personal_trainer = check_box.isSelected();
            String contract_type = "Month-to-Month";
            
            if(six_months_rdbtn.isSelected()){
            
                contract_type = "Six Months";
            }else if(annual_rdbtn.isSelected()){
            
                contract_type = "Annual";
            }
            
            CreateMember member = new CreateMember(name, surname, id, gender, contract_type, personal_trainer);
            
            members.add(member);
            
            text_area.setText("The member has been successfully added!!!");
            
            name_txtfld.setText("");
            surname_txtfld.setText("");
            id_txtfld.setText("");
            button_group.clearSelection();
            check_box.setSelected(false);
        }
    }
    
    public class DisplayListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
         
            String output = "";
            
            for(int x = 0; x < members.size(); x++){
            
                output += "Name: " + members.get(x).getName()+ 
                          "\nSurname: " + members.get(x).getSurname() + 
                          "\nID Number: " + members.get(x).getId_number() + 
                          "\nGender: " + members.get(x).getGender() + 
                          "\nContract Type: " + members.get(x).getContract_type() + 
                          "\nNeeds a personal trainer: " + members.get(x).isTrainer() + 
                          "\nThats all for " + members.get(x).getName() + "'s information\n\n";
            }
            
            text_area.setText(output);
        }
    
    }
}
