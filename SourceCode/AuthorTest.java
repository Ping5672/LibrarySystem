

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AuthorTest.
 *
 * @author  (Ping)
 * @version (1.0)
 */
public class AuthorTest
{
             /**
     * Test  getAddress method
     *
     * 
     */
    @Test
    public void getAddress()
    {
        Author author1 = new Author();
        author1.setAddress("ABC");
        assertEquals("ABC", author1.getAddress());
    }
             /**
     * Test  getFullName method
     *
     * 
     */
    @Test
    public void getFullName()
    {
        Author author2 = new Author();
        author2.setSurName("ABC");
        author2.setFirstName("DEF");
        assertEquals("DEF ABC", author2.getAuthorFullName());
    }
           /**
     * Test  getSurname method
     *
     * 
     */
    @Test
    public void getSurname()
    {
        Author author2 = new Author();
        author2.setSurName("ABC");
        assertEquals("ABC", author2.getSurName());
    }
         /**
     * Test  getFirstName method
     *
     * 
     */
    @Test
    public void getFirstName()
    {
        Author author1 = new Author();
        author1.setFirstName("ABC");
        assertEquals("ABC", author1.getFirstName());
    }
             /**
     * Test  printAuthor method
     *
     * 
     */
    @Test
    public void printAuthor()
    {
        Author author2 = new Author();
        author2.setFirstName("ABC");
        author2.setSurName("DEF");
        author2.printAuthorDetails();
        System.out.println("printAuthor test success");
    }
}





