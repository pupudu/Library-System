package book;

public class LoanItem{

	protected int borrowerNumber;
	protected String title;
	
	public LoanItem(String title){
		borrowerNumber = 0;
		this.title = title;
	}

	//accessor to the borrower number
	public int getBorrowerNumber(){
		return borrowerNumber;
	}
	
	//accessor to the title
	public String getTitle(){
		return title;
	}
	
	//to set the borrower number
	public void setBorrowerNumber(int b){
		borrowerNumber = b;
	}
	
	//to reset the borrower number
	public void resetBorrowerNumber(){
		borrowerNumber = 0;
	}
	
	//to display the loan attributes
	public void display(){
		System.out.println("The borrowerNumber: " + borrowerNumber +
						   "\nThe item title  : " + title);
	}
}
