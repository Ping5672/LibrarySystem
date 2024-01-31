

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BookTest.
 *
 * @author  (Ping)
 * @version (1.0)
 */
public class BookTest
{
             /**
     * Test  checkBook method
     *
     * 
     */
    @Test
    public void checkBook()
    {
        Book book2 = new Book("A");
        assertEquals(true, book2.checkBook());
        Book book3 = new Book("B");
        Member member1 = new Member();
        book3.setBorrowMember(member1);
        assertEquals(false, book3.checkBook());
    }
             /**
     * Test  getDamageOfBook method
     *
     * 
     */
    @Test
    public void getDamageOfBook()
    {
        Book book2 = new Book("A");
        book2.setDamageOfBook("page lost");
        assertEquals(book2.getDamageOfBook().get(0),"page lost" );
    }
  
           /**
     * Test  printResourcesDetails method(No author and No member)
     *
     * 
     */
    @Test
    public void printResourcesDetails()
    {
        Book book2 = new Book("A");
        book2.printResourcesDetails();
        System.out.println("printResourcesDetails testing success(No author and No member)");
    }
        /**
     * Test  printResourcesDetails method(No author and have Member)
     *
     * 
     */
    @Test
    public void printResourcesDetailsNoAuthorWithMember()
    {
        Book book2 = new Book("A");
        Member member1 = new Member();
        book2.setBorrowMember(member1);
        book2.printResourcesDetails();
        System.out.println("printResourcesDetails testing success(No author and have Member)");
    }
         /**
     * Test  printResourcesDetails method(Have author and no Member)
     *
     * 
     */
    @Test
    public void printResourcesDetailsWithAuthorNoMember()
    {
        Book book2 = new Book("A");
        Author author1 = new Author();
        book2.setAuthor(author1);
        book2.printResourcesDetails();
        System.out.println("printResourcesDetails testing success(Have author and no Member)");
    }
            /**
     * Test  printResourcesDetails method(Have author and Have Member)
     *
     * 
     */
    @Test
    public void printResourcesDetailsWithAuthorWithMember()
    {
        Book book2 = new Book("A");
        Member member1 = new Member();
        book2.setBorrowMember(member1);
        Author author1 = new Author();
        book2.setAuthor(author1);
        book2.printResourcesDetails();
        System.out.println("printResourcesDetails testing success(Have author and Have Member)");
    }
}



