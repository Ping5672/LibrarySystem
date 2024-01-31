import java.util.ArrayList;

/**
 *class Member that make users recored member related informations.
 *
 * @author (Ping)
 * @version (1.0)
 */
public class Member
{
    // instance variables - replace the example below with your own
    private String memberID;
    private ArrayList<Book>currentlyBorrowed;
    

    /**
     * Constructor for objects of class Member
     */
    public Member()
    {
        // initialise instance variables
        memberID = "";
        currentlyBorrowed = new ArrayList<>();
        
    }

    /**
     * 
     * get MemberID 
     */
    public String getMemberID()
    {
        return memberID;
    }
       /**
     * 
     * get CurrentlyBorrowed 
     */
    public ArrayList getCurrentlyBorrowed()
    {
        return currentlyBorrowed;
    }
    
                          /**
     * set MemberID
     * Parameter newMemberID represent the new Member ID that user want to add.
     */
    public void  setMemberID(String newMemberID)
    {
       this.memberID =newMemberID;
    }
                       /**
     * set CurrentlyBorrowed 
     * Parameter book represent the book that member want to borrow.
     */
    public void  setCurrentlyBorrowed(Book book)
    {
    if(book == null)
    {
      System.out.println("Please add a book");
    }
    else if (currentlyBorrowed.contains(book))
    {
        System.out.println("Book is already borrowed");
    }
    else
    {    
        currentlyBorrowed.add(book);
    }
    }
                                          /**
     * 
     * print MemberDetails
     */
    public void printMemberDetails(){
        System.out.println("MemberID: " + memberID + "," + "CurrentlyBorrowed: ");
         for(Book book : currentlyBorrowed)
        {
           System.out.println(book.getTitle());
        }
   
    }
                                             /**
     * 
     * return the number of books currently borrowed by member
     */
    public String numberOfBookBorrowed(){
      String result="";
      if(currentlyBorrowed.isEmpty()) {
            result +="None of the books is borrowed.";
        }
        else {
            result +=currentlyBorrowed.size();
        }
        return result;
   
    }
    }




    