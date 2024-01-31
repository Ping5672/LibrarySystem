

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibraryResourcesTest.
 *
 * @author  (Ping)
 * @version (1.0)
 */
public class LibraryResourcesTest
{
    /**
     * Default constructor for test class LibraryResourcesTest
     */
    public LibraryResourcesTest()
    {
    }
           /**
     * Test  getAuthor method
     *
     * 
     */
    @Test
    public void getAuthor()
    {
        LibraryResources libraryR2 = new LibraryResources("A");
        Author author1 = new Author();
        libraryR2.setAuthor(author1);
        assertEquals(author1, libraryR2.getAuthor());
    }
           /**
     * Test  getGuest method
     *
     * 
     */
    @Test
    public void getGuest()
    {
        LibraryResources libraryR1 = new LibraryResources("A");
        Guest guest1 = new Guest(3);
        libraryR1.setGuest(guest1);
        assertEquals(guest1, libraryR1.getGuest());
    }
        /**
     * Test  getISBN method
     *
     * 
     */
    @Test
    public void getISBN()
    {
        LibraryResources libraryR2 = new LibraryResources("A");
        libraryR2.setISBN("ABC");
        assertEquals("ABC", libraryR2.getISBN());
    }
         /**
     * Test  getMember method
     *
     * 
     */
    @Test
    public void getMember()
    {
        LibraryResources libraryR2 = new LibraryResources("A");
        Member member1 = new Member();
        libraryR2.setBorrowMember(member1);
        assertEquals(member1, libraryR2.getMember());
    }
         /**
     * Test  getTitle method
     *
     * 
     */
    @Test
    public void getTitle()
    {
        LibraryResources libraryR2 = new LibraryResources("A");
        assertEquals("A", libraryR2.getTitle());
    }
       /**
     * Test  printResourcesDetails method(No author and No member)
     *
     * 
     */
    @Test
    public void printResourcesDetails()
    {
        LibraryResources libraryR1 = new LibraryResources("A");
        libraryR1.printResourcesDetails();
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
        LibraryResources libraryR1 = new LibraryResources("A");
        Member member1 = new Member();
        libraryR1.setBorrowMember(member1);
        libraryR1.printResourcesDetails();
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
        LibraryResources libraryR1 = new LibraryResources("A");
        Author author1 = new Author();
        libraryR1.setAuthor(author1);
        libraryR1.printResourcesDetails();
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
        LibraryResources libraryR1 = new LibraryResources("A");
        Member member1 = new Member();
        libraryR1.setBorrowMember(member1);
        Author author1 = new Author();
        libraryR1.setAuthor(author1);
        libraryR1.printResourcesDetails();
        System.out.println("printResourcesDetails testing success(Have author and Have Member)");
    }
}










