/**
*Text genereted by Simple GUI Extension for BlueJ
*/
package book;

import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
import java.util.ArrayList;

public class Library extends JFrame {

    private ArrayList<LoanItem> itemList=new ArrayList<>(); //ArrayList to store books and Journals
    
    private JMenuBar menuBar;
    private JButton btnAddBook;
    private JButton btnAddJounal;
    private JButton btnClear;
    private JButton btnDisplay;
    private JButton btnLoanBook;
    private JButton btnLoanJournal;
    private JButton btnReturnBook;
    private JButton btnReturnJournal;
    private JLabel lblAuthor;
    private JLabel lblBorrow;
    private JLabel lblDate;
    private JLabel lblHour;
    private JLabel lblIssue;
    private JLabel lblItem;
    private JLabel lblTitle;
    private JLabel lblVol;
    private JTextField txtAuthor;
    private JTextField txtBorrow;
    private JTextField txtDate;
    private JTextField txtHour;
    private JTextField txtIssue;
    private JTextField txtItem;
    private JTextField txtTile;
    private JTextField txtVol;

    //Constructor 
    public Library(){

        setTitle("Library");
        setSize(416,286);
        //menu generate method
        generateMenu();
        setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(416,286));
        contentPane.setBackground(new Color(216,216,216));


        btnAddBook = new JButton();
        btnAddBook.setBounds(293,6,112,31);
        btnAddBook.setBackground(new Color(214,217,223));
        btnAddBook.setForeground(new Color(0,0,0));
        btnAddBook.setEnabled(true);
        btnAddBook.setFont(new Font("sansserif",0,12));
        btnAddBook.setText("Add Book");
        btnAddBook.setVisible(true);
        //Set action for button click
        //Call defined method
        btnAddBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddBook(evt);
            }
        });


        btnAddJounal = new JButton();
        btnAddJounal.setBounds(294,42,110,32);
        btnAddJounal.setBackground(new Color(214,217,223));
        btnAddJounal.setForeground(new Color(0,0,0));
        btnAddJounal.setEnabled(true);
        btnAddJounal.setFont(new Font("sansserif",0,12));
        btnAddJounal.setText("Add Journal");
        btnAddJounal.setVisible(true);
        //Set action for button click
        //Call defined method
        btnAddJounal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddJournal(evt);
            }
        });


        btnClear = new JButton();
        btnClear.setBounds(295,249,111,29);
        btnClear.setBackground(new Color(214,217,223));
        btnClear.setForeground(new Color(0,0,0));
        btnClear.setEnabled(true);
        btnClear.setFont(new Font("sansserif",0,12));
        btnClear.setText("Clear");
        btnClear.setVisible(true);
        //Set action for button click
        //Call defined method
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Clear(evt);
            }
        });


        btnDisplay = new JButton();
        btnDisplay.setBounds(295,215,112,31);
        btnDisplay.setBackground(new Color(214,217,223));
        btnDisplay.setForeground(new Color(0,0,0));
        btnDisplay.setEnabled(true);
        btnDisplay.setFont(new Font("sansserif",0,12));
        btnDisplay.setText("Display All");
        btnDisplay.setVisible(true);
        //Set action for button click
        //Call defined method
        btnDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DisplayAll(evt);
            }
        });


        btnLoanBook = new JButton();
        btnLoanBook.setBounds(294,76,113,32);
        btnLoanBook.setBackground(new Color(214,217,223));
        btnLoanBook.setForeground(new Color(0,0,0));
        btnLoanBook.setEnabled(true);
        btnLoanBook.setFont(new Font("sansserif",0,12));
        btnLoanBook.setText("Loan Book");
        btnLoanBook.setVisible(true);
        //Set action for button click
        //Call defined method
        btnLoanBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                LoanBook(evt);
            }
        });


        btnLoanJournal = new JButton();
        btnLoanJournal.setBounds(295,110,111,31);
        btnLoanJournal.setBackground(new Color(214,217,223));
        btnLoanJournal.setForeground(new Color(0,0,0));
        btnLoanJournal.setEnabled(true);
        btnLoanJournal.setFont(new Font("sansserif",0,12));
        btnLoanJournal.setText("Loan Journal");
        btnLoanJournal.setVisible(true);
        btnLoanJournal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                LoanJournal(evt);
            }
        });
        
        btnReturnBook = new JButton();
        btnReturnBook.setBounds(295,144,111,31);
        btnReturnBook.setBackground(new Color(214,217,223));
        btnReturnBook.setForeground(new Color(0,0,0));
        btnReturnBook.setEnabled(true);
        btnReturnBook.setFont(new Font("sansserif",0,12));
        btnReturnBook.setText("Return Book");
        btnReturnBook.setVisible(true);
        //Set action for button click
        //Call defined method
        btnReturnBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ReturnBook(evt);
            }
        });


        btnReturnJournal = new JButton();
        btnReturnJournal.setBounds(295,178,111,31);
        btnReturnJournal.setBackground(new Color(214,217,223));
        btnReturnJournal.setForeground(new Color(0,0,0));
        btnReturnJournal.setEnabled(true);
        btnReturnJournal.setFont(new Font("sansserif",0,12));
        btnReturnJournal.setText("Return Journal");
        btnReturnJournal.setVisible(true);
        //Set action for button click
        //Call defined method
        btnReturnJournal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ReturnJournal(evt);
            }
        });


        lblAuthor = new JLabel();
        lblAuthor.setBounds(5,39,90,35);
        lblAuthor.setBackground(new Color(214,217,223));
        lblAuthor.setForeground(new Color(0,0,0));
        lblAuthor.setEnabled(true);
        lblAuthor.setFont(new Font("sansserif",0,12));
        lblAuthor.setText("Author:");
        lblAuthor.setVisible(true);

        lblBorrow = new JLabel();
        lblBorrow.setBounds(5,177,127,36);
        lblBorrow.setBackground(new Color(214,217,223));
        lblBorrow.setForeground(new Color(0,0,0));
        lblBorrow.setEnabled(true);
        lblBorrow.setFont(new Font("sansserif",0,12));
        lblBorrow.setText("Borrower Number:");
        lblBorrow.setVisible(true);

        lblDate = new JLabel();
        lblDate.setBounds(5,212,90,35);
        lblDate.setBackground(new Color(214,217,223));
        lblDate.setForeground(new Color(0,0,0));
        lblDate.setEnabled(true);
        lblDate.setFont(new Font("sansserif",0,12));
        lblDate.setText("Return Date:");
        lblDate.setVisible(true);

        lblHour = new JLabel();
        lblHour.setBounds(5,247,90,35);
        lblHour.setBackground(new Color(214,217,223));
        lblHour.setForeground(new Color(0,0,0));
        lblHour.setEnabled(true);
        lblHour.setFont(new Font("sansserif",0,12));
        lblHour.setText("Current Hour:");
        lblHour.setVisible(true);

        lblIssue = new JLabel();
        lblIssue.setBounds(5,108,90,35);
        lblIssue.setBackground(new Color(214,217,223));
        lblIssue.setForeground(new Color(0,0,0));
        lblIssue.setEnabled(true);
        lblIssue.setFont(new Font("sansserif",0,12));
        lblIssue.setText("Issue Number:");
        lblIssue.setVisible(true);

        lblItem = new JLabel();
        lblItem.setBounds(5,144,90,35);
        lblItem.setBackground(new Color(214,217,223));
        lblItem.setForeground(new Color(0,0,0));
        lblItem.setEnabled(true);
        lblItem.setFont(new Font("sansserif",0,12));
        lblItem.setText("Item Number:");
        lblItem.setVisible(true);

        lblTitle = new JLabel();
        lblTitle.setBounds(5,5,90,35);
        lblTitle.setBackground(new Color(214,217,223));
        lblTitle.setForeground(new Color(0,0,0));
        lblTitle.setEnabled(true);
        lblTitle.setFont(new Font("sansserif",0,12));
        lblTitle.setText("Title:");
        lblTitle.setVisible(true);

        lblVol = new JLabel();
        lblVol.setBounds(5,75,104,31);
        lblVol.setBackground(new Color(214,217,223));
        lblVol.setForeground(new Color(0,0,0));
        lblVol.setEnabled(true);
        lblVol.setFont(new Font("sansserif",0,12));
        lblVol.setText("Volume Number:");
        lblVol.setVisible(true);

        txtAuthor = new JTextField();
        txtAuthor.setBounds(149,39,134,33);
        txtAuthor.setBackground(new Color(255,255,255));
        txtAuthor.setForeground(new Color(0,0,0));
        txtAuthor.setEnabled(true);
        txtAuthor.setFont(new Font("sansserif",0,12));
        txtAuthor.setText("");
        txtAuthor.setVisible(true);

        txtBorrow = new JTextField();
        txtBorrow.setBounds(149,178,135,30);
        txtBorrow.setBackground(new Color(255,255,255));
        txtBorrow.setForeground(new Color(0,0,0));
        txtBorrow.setEnabled(true);
        txtBorrow.setFont(new Font("sansserif",0,12));
        txtBorrow.setText("");
        txtBorrow.setVisible(true);

        txtDate = new JTextField();
        txtDate.setBounds(149,212,136,32);
        txtDate.setBackground(new Color(255,255,255));
        txtDate.setForeground(new Color(0,0,0));
        txtDate.setEnabled(true);
        txtDate.setFont(new Font("sansserif",0,12));
        txtDate.setText("");
        txtDate.setVisible(true);

        txtHour = new JTextField();
        txtHour.setBounds(149,248,136,32);
        txtHour.setBackground(new Color(255,255,255));
        txtHour.setForeground(new Color(0,0,0));
        txtHour.setEnabled(true);
        txtHour.setFont(new Font("sansserif",0,12));
        txtHour.setText("");
        txtHour.setVisible(true);

        txtIssue = new JTextField();
        txtIssue.setBounds(149,109,136,32);
        txtIssue.setBackground(new Color(255,255,255));
        txtIssue.setForeground(new Color(0,0,0));
        txtIssue.setEnabled(true);
        txtIssue.setFont(new Font("sansserif",0,12));
        txtIssue.setText("");
        txtIssue.setVisible(true);

        txtItem = new JTextField();
        txtItem.setBounds(149,144,136,31);
        txtItem.setBackground(new Color(255,255,255));
        txtItem.setForeground(new Color(0,0,0));
        txtItem.setEnabled(true);
        txtItem.setFont(new Font("sansserif",0,12));
        txtItem.setText("");
        txtItem.setVisible(true);

        txtTile = new JTextField();
        txtTile.setBounds(149,5,134,33);
        txtTile.setBackground(new Color(255,255,255));
        txtTile.setForeground(new Color(0,0,0));
        txtTile.setEnabled(true);
        txtTile.setFont(new Font("sansserif",0,12));
        txtTile.setText("");
        txtTile.setVisible(true);

        txtVol = new JTextField();
        txtVol.setBounds(149,74,134,32);
        txtVol.setBackground(new Color(255,255,255));
        txtVol.setForeground(new Color(0,0,0));
        txtVol.setEnabled(true);
        txtVol.setFont(new Font("sansserif",0,12));
        txtVol.setText("");
        txtVol.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(btnAddBook);
        contentPane.add(btnAddJounal);
        contentPane.add(btnClear);
        contentPane.add(btnDisplay);
        contentPane.add(btnLoanBook);
        contentPane.add(btnLoanJournal);
        contentPane.add(btnReturnBook);
        contentPane.add(btnReturnJournal);
        contentPane.add(lblAuthor);
        contentPane.add(lblBorrow);
        contentPane.add(lblDate);
        contentPane.add(lblHour);
        contentPane.add(lblIssue);
        contentPane.add(lblItem);
        contentPane.add(lblTitle);
        contentPane.add(lblVol);
        contentPane.add(txtAuthor);
        contentPane.add(txtBorrow);
        contentPane.add(txtDate);
        contentPane.add(txtHour);
        contentPane.add(txtIssue);
        contentPane.add(txtItem);
        contentPane.add(txtTile);
        contentPane.add(txtVol);

        //adding panel to JFrame and seting of window position and close operation
        getContentPane().add(contentPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    //Method returns Title given in the text field
    private String getTxtItemTitle(){
        return txtTile.getText();
    }
    
    //Method returns Author given in the text field
    private String getTxtAuthor(){
        return txtAuthor.getText();
    }
    
    //Method returns volume number given in the text field
    private int getTxtVolumeNumber(){
        try{
            return Integer.parseInt(txtVol.getText());
        }
        catch(Exception e){
            //System.out.println("Invalid input given");
            return -1;
        }
    }
    
    //Method returns issue number given in the text field
    private int getTxtIssueNumber(){
        try{
            return Integer.parseInt(txtIssue.getText());
        }
        catch(Exception e){
            //System.out.println("Invalid input given");
            return -1;
        }
    }
    
    //Method returns item number given in the text field
    private int getTxtItemNumber(){
        try{
            return Integer.parseInt(txtItem.getText());
        }
        catch(Exception e){
            //System.out.println("Invalid input given");
            return -1;
        }
    }
    
    //Method returns burrower number given in the text field
    private int getTxtBorrowerNumber(){
        try{
            return Integer.parseInt(txtBorrow.getText());
            }
        catch(Exception e){
            //System.out.println("Invalid input given");
            return -1;
        }
    }
    
    //Method returns retrunDate given in the text field
    private String getTxtReturnDate(){
        return txtDate.getText();
    }
    
    //Method returns current hour given in the text field
    private int getTxtCurrentHour(){
        return Integer.parseInt(txtHour.getText());
    }
    
    
    //Method actionPerformed for btnAddBook
    private void AddBook (ActionEvent evt) {
            if(!"".equals(getTxtItemTitle()) && !"".equals(getTxtAuthor())){
                Book newBook=new Book(getTxtItemTitle(),getTxtAuthor());
                itemList.add(newBook);
                JOptionPane.showMessageDialog(null,"Book Successfully Added with Item Number:"+ (itemList.size()-1));
            }
            else{
                JOptionPane.showMessageDialog(null,"Error:Add Correct Data to Author and Title");
            }
    }

    //Method actionPerformed for btnAddJounal
    private void AddJournal (ActionEvent evt) {
        if(!"".equals(getTxtItemTitle())){
            if(getTxtVolumeNumber()!=-1 && getTxtIssueNumber()!=-1){
                Journal newJournal=new Journal(getTxtItemTitle(),getTxtVolumeNumber(),getTxtIssueNumber());
                itemList.add(newJournal);
                JOptionPane.showMessageDialog(null,"Journal Successfully Added with Item Number:"+ (itemList.size()-1));
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Error: Add Correct Data to Title. Unable to add Journal");
        }
    }

    //Method actionPerformed for btnClear
    private void Clear (ActionEvent evt) {
            txtTile.setText("");
            txtAuthor.setText("");
            txtVol.setText("");
            txtIssue.setText("");
            txtItem.setText("");
            txtBorrow.setText("");
            txtDate.setText("");
            txtHour.setText("");
    }

    //Method actionPerformed for btnDisplay
    private void DisplayAll (ActionEvent evt) {
        int count=0;
        for(LoanItem item:itemList){
            System.out.println("\n\nItem Number:"+count+"\n");
            item.display();
            count++;
        }
    }

    //Method actionPerformed for btnLoanBook
    private void LoanBook (ActionEvent evt) {
        try{
            if(itemList.size()>getTxtItemNumber()){
                Book toLoan=(Book)(itemList.get(getTxtItemNumber()));
                toLoan.borrow(getTxtBorrowerNumber(),getTxtReturnDate());
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error:Invalid Data Given. Unable to Loan Book");
        }
    }
    
    //Method actionPerformed for btnLoanJournal
    private void LoanJournal (ActionEvent evt) {
        
        try{
            if(itemList.size()>getTxtItemNumber()){
                Journal toLoan=(Journal)(itemList.get(getTxtItemNumber()));
                toLoan.borrow(getTxtBorrowerNumber(),getTxtCurrentHour());
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: Invalid Data Given. Unable to Loan Journal");
        }
    }

    //Method actionPerformed for btnReturnBook
    private void ReturnBook (ActionEvent evt) {
        try{
            if(itemList.size()>getTxtItemNumber()){
                Book toLoan=(Book)(itemList.get(getTxtItemNumber()));
                if(toLoan.getBorrowerNumber()!=0){
                    toLoan.returnBook();
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error:Invalid input | Book Not Found");
        }
    }

    //Method actionPerformed for btnReturnJournal
    private void ReturnJournal (ActionEvent evt) {
        try{
            if(itemList.size()>getTxtItemNumber()){
                Journal toLoan=(Journal)(itemList.get(getTxtItemNumber()));
                if(toLoan.getBorrowerNumber()!=0){
                    toLoan.returnJournal();
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error:Invalid input | Journal Not Found");
        }
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }



     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Library();
            }
        });
    }

}