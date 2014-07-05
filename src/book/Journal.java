package book;

import javax.swing.JOptionPane;

public class Journal extends LoanItem{

	private int volumeNumber;
	private int issueNumber;
	private int returnHour;
	
	//the constructor
	public Journal(String title, int volumeNumber, int issueNumber){
		super(title);
		this.volumeNumber = volumeNumber;
		this.issueNumber = issueNumber;
		returnHour = 0;
	}
	
	//accessor to the volume number
	public int getVolumeNumber(){
		return volumeNumber;
	}
	
	//accessor to the issue number
	public int getIssueNumber(){
		return issueNumber;
	}
	
	//accessor to the return hour
	public int getReturnHour(){
		return returnHour;
	}
	
	//this method allows to borrow a book
	public void borrow(int borrowerNumber, int currentHour){
		
		//if the borrower number is lesser than or equals 0
		if(borrowerNumber <= 0){
			System.out.println("Error : the borrower number must be greater than 0 haiyo");
                        JOptionPane.showMessageDialog(null, "Error : the borrower number must be greater than 0");
			return;
		}
		
		//if the current Hour is lesser than or equals 0
		if(currentHour < 10){
			System.out.println("Error : we can only borrow a book when the library is open");
                        JOptionPane.showMessageDialog(null,"Error : we can only borrow a book when the library is open");
			return;
		}
		
		setBorrowerNumber(borrowerNumber);
		
		if(currentHour > 16)
			returnHour = 20;
		else
			returnHour = currentHour + 4;
	}
	
	//this method allows to return the current journal
	public void returnJournal(){
		returnHour = 0;
		resetBorrowerNumber();
	}
	

	@Override
	public void display(){
		super.display();
		System.out.println("The volume number : " + volumeNumber +
						   "\nThe issue number: " + issueNumber +
						   "\nThe return hour : " + returnHour);
	}


}
