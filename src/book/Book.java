package book;

public class Book extends LoanItem{

	private String author;
	private String returnDate;
	
	//the constructor
	public Book(String title, String author) {
		super(title);
		this.author = author;
		returnDate = "00-00-00";
	}
	
	//accessor to the author
	public String getAuthor(){
		return author;
	}
	
	//accessor to the return date
	public String getReturnDate(){
		return returnDate;
	}
	
	//this method allows to borrow a book
	public void borrow(int borrowerNumber, String returnDate){
		String [] date = returnDate.split("-");
		int day 	= Integer.parseInt(date[2]);
		int month 	= Integer.parseInt(date[1]);
		
		//if the borrower number is lesser than or equals 0
		if(borrowerNumber <= 0){
			System.out.println("Error : the borrower number must be greater than 0");
			return;
		}
		//if the day is greater than 31 or the month is greater than 12
		if(day > 31 || month > 12){
			System.out.println("Error : invalid day or month");
			return;
		}
		
		this.returnDate = returnDate;
		setBorrowerNumber(borrowerNumber);
	}
	
	//this method allows to return the current book
	public void returnBook(){
		returnDate = "000000";
		resetBorrowerNumber();
	}

	@Override
	public void display(){
		super.display();
		System.out.println("The Author: " + author + "\nThe return date: " + returnDate);
	}
}
