

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MemberTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MemberTest
{
               /**
     * Test  getCurrentBorrow method
     *
     * 
     */
    @Test
    public void getCurrentBorrow()
    {
        Book book1 = new Book("A");
        Book book2 = new Book("B");
        Member member2 = new Member();
        member2.setCurrentlyBorrowed(book1);
        member2.setCurrentlyBorrowed(book2);
        assertEquals(book1, member2.getCurrentlyBorrowed().get(0));
        assertEquals(book2, member2.getCurrentlyBorrowed().get(1));
    }
                /**
     * Test  getMemberID method
     *
     * 
     */
    @Test
    public void getMemberID()
    {
        Member member2 = new Member();
        member2.setMemberID("A");
        assertEquals("A", member2.getMemberID());
    }
                /**
     * Test  noOfBookBorrow method(with book)
     *
     * 
     */
      @Test
    public void noOfBookBorrow()
    {
        Book book1 = new Book("A");
        Book book2 = new Book("B");
        Member member2 = new Member();
        member2.setCurrentlyBorrowed(book1);
        member2.setCurrentlyBorrowed(book2);
        assertEquals("2", member2.numberOfBookBorrowed());
        
    }
                /**
     * Test  noOfBookBorrow method(without book)
     *
     * 
     */
      @Test
    public void noOfBookBorrowNoBook()
    {
        Member member2 = new Member();
        member2.numberOfBookBorrowed();
        System.out.println("noOfBookBorrowNoBook testing(without book) is successful");
    }

    @Test
    public void printMember()
    {
        Member member2 = new Member();
        member2.printMemberDetails();
        System.out.println("printMember testing is successful");
    }
}



