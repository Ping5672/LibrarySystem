

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GuestTest.
 *
 * @author  (Ping)
 * @version (1.0)
 */
public class GuestTest
{
                  /**
     * Test  getDuration method and restrictions of Duration
     *
     * 
     */
    @Test
    public void getDuration()
    {
        Guest guest3 = new Guest(3);
        Guest guest2 = new Guest(4);
        System.out.println("Test Duration restrictions success");
        guest2.setDuration(5);
        System.out.println("Test Duration restrictions success");
        guest2.setDuration(3);
        assertEquals(3, guest2.getDuration());
        assertEquals(3, guest3.getDuration());
    }
}

