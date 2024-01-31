

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ElectronicResourcesTest.
 *
 * @author  (Ping)
 * @version (1.0)
 */
public class ElectronicResourcesTest
{
                   /**
     * Test  getDownload method
     *
     * 
     */
    @Test
    public void getDownload()
    {
        ElectronicResources electron2 = new ElectronicResources(true, "A");
        assertEquals(true, electron2.getDownload());
    }
                /**
     * Test  printEResources method(without Author)
     *
     * 
     */
    @Test
    public void printEResourcesWithoutAuthor()
    {
        ElectronicResources electron1 = new ElectronicResources(true, "A");
        electron1.printResourcesDetails();
        System.out.println("Test  printEResources method(without Author) success");
    }
               /**
     * Test  printEResources method(with Author)
     *
     * 
     */
    @Test
    public void printEResources()
    {
        ElectronicResources electron1 = new ElectronicResources(true, "A");
        Author author1 = new Author();
        electron1.setAuthor(author1);
        electron1.printResourcesDetails();
         System.out.println("Test  printEResources method(with Author) success");
    }
}


