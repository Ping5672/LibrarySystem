import java.util.ArrayList;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibraryTest.
 *
 * @author  (Ping)
 * @version (1.0)
 */
public class LibraryTest
{
    private LibraryResources libraryR1;
    private Author author1;
    private ElectronicResources electron1;
    private Guest guest1;
    private Book book1;
    private Member member1;
    /**
     * Default constructor for test class LibraryTest
     */
    public LibraryTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        libraryR1 = new LibraryResources("A");
        author1 = new Author();
        electron1 = new ElectronicResources(true, "A");
        guest1 = new Guest(2);
        book1 = new Book("D");
        member1 = new Member();
    }
    /**
     * Test All the constructors in each classes 
     *
     * 
     */
    @Test
    public void allConstructorsDefaultTest()
    {
        Library library2 = new Library();
        assertEquals(library2.getLibraryCategories().isEmpty(),true);
        assertEquals(libraryR1.getAuthor(),null);
        assertEquals(libraryR1.getTitle(),"A");
        assertEquals(libraryR1.getISBN(),"");
        assertEquals(libraryR1.getMember(), null);
        assertEquals(libraryR1.getGuest(), null);
        assertEquals(author1.getFirstName(),"");
        assertEquals(author1.getSurName(),"");
        assertEquals(author1.getAddress(),"");
        assertEquals(electron1.getDownload(),true);
        assertEquals(guest1.getDuration(),2);
        assertEquals(book1.getDamageOfBook().isEmpty(),true);
        assertEquals(member1.getMemberID(),"");
        assertEquals(member1.getCurrentlyBorrowed().isEmpty(),true);
    }
    /**
     * Test book borrow method (when the book is borrowed successfully.)
     *
     * 
     */
    @Test
    public void bookBorrow()
    {
        Library library2 = new Library();
        Book book2 = new Book("A");
        Member member2 = new Member();
        library2.setLibraryCatergories(book2);
        library2.bookBorrowing(book2, member2);
        assertEquals(member2, book2.getMember());
    }
    /**
     * Test book borrow method (when the book is not avalible)
     *
     * 
     */
    @Test
    public void bookBorrowNotAvalible()
    {
        Library library2 = new Library();
        Book book2 = new Book("A");
        Member member2 = new Member();
        Member member1 = new Member();
        book2.setBorrowMember(member1);
        library2.setLibraryCatergories(book2);
        library2.bookBorrowing(book2, member2);
        System.out.println("bookBorrowNotAvalible testing successful");
    }
     /**
     * Test book borrow method (when the book is not in the libraryCategory)
     *
     * 
     */
    @Test
    public void bookBorrowNotInCategory()
    {
        Library library2 = new Library();
        Book book2 = new Book("A");
        Member member2 = new Member();
        library2.bookBorrowing(book2, member2);
        System.out.println("bookBorrowNotInCategory testing successful");
    }
    /**
     * Test book return method (when the book is returned successfully.)
     *
     * 
     */
    @Test
    public void bookReturning()
    {
        Library library2 = new Library();
        Book book1 = new Book("A");
        library2.setLibraryCatergories(book1);
        Member member1 = new Member();
        library2.bookBorrowing(book1, member1);
        library2.bookReturning(book1, true, "page lost");
        assertEquals(null, book1.getMember());
        assertEquals("page lost", book1.getDamageOfBook().get(0));
    }
    /**
     * Test book return method (when the book is returned already.)
     *
     * 
     */
     @Test
    public void bookReturningAlreadyReturn()
    {
        Library library2 = new Library();
        Book book1 = new Book("A");
        library2.setLibraryCatergories(book1);
        Member member1 = new Member();
        library2.bookBorrowing(book1, member1);
        library2.bookReturning(book1, true, "page lost");
        library2.bookReturning(book1, true, "page lost");
        System.out.println("bookReturningAlreadyReturn testing is successful");
    }
     /**
     * Test book return method (when the book is not in the libraryCategory.)
     *
     * 
     */
       @Test
    public void bookReturningNotInCategory()
    {
        Library library2 = new Library();
        Book book1 = new Book("A");
        library2.bookReturning(book1, true, "page lost");
        System.out.println("bookReturningNotInCategory testing is successful");
    }
     /**
     * Test changeAuthorFirstName method (when the name changing is successful)
     *
     * 
     */
    @Test
    public void changeAuthorFirstNameSuccess()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("a");
        Author author1 = new Author();
        author1.setFirstName("ABC");
        author1.setSurName("DEF");
        library2.setLibraryCatergories(libraryR1);
        libraryR1.setAuthor(author1);
        library2.changeAuthorFirstName(libraryR1, "DEF");
        assertEquals("DEF", libraryR1.getAuthor().getFirstName());
    }
     /**
     * Test changeAuthorFirstName method (when the name is not in the libraryCategory)
     *
     * 
     */
    @Test
    public void changeAuthorFirstNameNotInCategories()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("a");
        LibraryResources libraryR2 = new LibraryResources("b");
        Author author1 = new Author();
        author1.setFirstName("ABC");
        author1.setSurName("DEF");
        library2.setLibraryCatergories(libraryR1);
        libraryR1.setAuthor(author1);
        library2.changeAuthorFirstName(libraryR2, "DEF");
        System.out.println("changeAuthorFirstNameNotInCategories testing successful");
    }
     /**
     * Test changeAuthorFirstName method (when the Author haven't set the firstName)
     *
     * 
     */
    @Test
    public void changeAuthorFirstNameWithNoAuthor()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("a");
        library2.setLibraryCatergories(libraryR1);
        library2.changeAuthorFirstName(libraryR1, "DEF");
        System.out.println("changeAuthorFirstNameWithNoAuthor testing successful");
    }
     /**
     * Test  checkResource method (when the resources are in the libraryCategory)
     * 
     */
    @Test
    public void checkResourceTrue()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("A");
        library2.setLibraryCatergories(libraryR1);
        assertEquals(true, library2.checkResources(libraryR1));
    }
      /**
     * Test  checkResource method (when the resources are not in the libraryCategory)
     *
     * 
     */
    @Test
    public void checkResourceFalse()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("A");
        assertEquals(false, library2.checkResources(libraryR1));
    }
      /**
     * Test  getLibraryCategory method
     *
     * 
     */
    @Test
    public void getLibraryCategory()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("a");
        LibraryResources libraryR2 = new LibraryResources("b");
        library2.setLibraryCatergories(libraryR1);
        library2.setLibraryCatergories(libraryR2);
        assertEquals(libraryR1,library2.getLibraryCategories().get(0));
        assertEquals(libraryR2,library2.getLibraryCategories().get(1));
    }
       /**
     * Test  getNoOfResources method
     *
     * 
     */
    @Test
    public void getNoOfResources()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("a");
        Book book1 = new Book("b");
        ElectronicResources electron1 = new ElectronicResources(true, "c");
        library2.setLibraryCatergories(libraryR1);
        library2.setLibraryCatergories(book1);
        library2.setLibraryCatergories(electron1);
        assertEquals(3, library2.getNumberOfResources());
    }
     /**
     * Test  RemoveLibraryResource method(when the resources is removed sucessfully.)
     *
     * 
     */
    @Test
    public void RemoveLibraryResource()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("A");
        library2.setLibraryCatergories(libraryR1);
        library2.removeFromCatalogue(libraryR1);
        assertEquals(library2.getNumberOfResources(),0);
    }
     /**
     * Test  RemoveLibraryResource method(when the resources is not in the libraryCategory.)
     *
     * 
     */
    @Test
    public void RemoveLibraryResourceNotInCategory()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("A");
        library2.removeFromCatalogue(libraryR1);
        System.out.println("RemoveLibraryResourceNotInCategory testing is successful");
    }
     /**
     * Test  RemoveLibraryResource method(when the resources is loan.)
     *
     * 
     */
    @Test
    public void RemoveLibraryResourceIsLoan()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("A");
        Member member1 = new Member();
        libraryR1.setBorrowMember(member1);
        library2.setLibraryCatergories(libraryR1);
        library2.removeFromCatalogue(libraryR1);
        System.out.println("RemoveLibraryResourceIsLoan testing is successful");
    }
     /**
     * Test  removeLibraryCategoryByPosition method(when the resources is removed sucessfully.)
     *
     * 
     */
    @Test
    public void removeLibraryCategoryByPosition()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("1");
        library2.setLibraryCatergories(libraryR1);
        library2.removeFromCataloguePosition(0);
        assertEquals(library2.getNumberOfResources(),0);
    }
     /**
     * Test  removeLibraryCategoryByPosition method(when the index is not valid.)
     *
     * 
     */
    @Test
    public void removeLibraryCategoryByPositionInvalidIndex()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("1");
        library2.setLibraryCatergories(libraryR1);
        library2.removeFromCataloguePosition(1);
        System.out.println("removeLibraryCategoryByPositionInvalidIndex testing is successful");
    }
     /**
     * Test  removeLibraryCategoryByPosition method(when the resources is loan.)
     *
     * 
     */
    @Test
    public void removeLibraryCategoryByPositionIsLoan()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("A");
        Member member1 = new Member();
        libraryR1.setBorrowMember(member1);
        library2.setLibraryCatergories(libraryR1);
        library2.removeFromCataloguePosition(0);
        System.out.println("removeLibraryCategoryByPositionIsLoan testing is successful");
    }
     /**
     * Test  SearchByTitle method(when the resources is searched successfully.)
     *
     * 
     */
    @Test
    public void SearchByTitle()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("A");
        library2.searchCatalogueTitle("A");
        library2.setLibraryCatergories(libraryR1);
        library2.searchCatalogueTitle("A");
        System.out.println("SearchByTitle testing successful");
    }
     /**
     * Test  SearchByTitle method(when the resources is not in the libraryCategory.)
     *
     * 
     */
      @Test
    public void SearchByTitleNotInCategory()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("A");
        library2.searchCatalogueTitle("A");
        library2.searchCatalogueTitle("A");
        System.out.println("SearchByTitleNotInCategory testing successful");
    }
     /**
     * Test  searchByAuthorSurname method(when the resources is searched successfully.)
     *
     * 
     */
      @Test
    public void searchByAuthorSurnameSuccess()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("A");
        Author author1 = new Author();
        author1.setSurName("ABC");
        libraryR1.setAuthor(author1);
        library2.setLibraryCatergories(libraryR1);
        library2.searchCatalogueSurname("ABC");
        System.out.println("SearchByAuthorSurnameSuccess testing successful");
    }
       /**
     * Test  searchByAuthorSurname method(when the resources is not in the libraryCategory.)
     *
     * 
     */
    @Test
    public void searchByAuthorSurnameNotInCategory()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("A");
        Author author1 = new Author();
        libraryR1.setAuthor(author1);
        library2.setLibraryCatergories(libraryR1);
        library2.searchCatalogueSurname("ABC");
        System.out.println("searchByAuthorSurnameNotInCategory testing successful");
    }
       /**
     * Test  printAvalible method
     *
     * 
     */
    @Test
    public void printAvalible()
    {
        Library library2 = new Library();
        Book book1 = new Book("A");
        ElectronicResources electron1 = new ElectronicResources(true, "C");
        LibraryResources libraryR1 = new LibraryResources("A");
        Member member1 = new Member();
        libraryR1.setBorrowMember(member1);
        library2.setLibraryCatergories(libraryR1);
        library2.setLibraryCatergories(book1);
        library2.setLibraryCatergories(electron1);
        library2.printAvailable();
        System.out.println("PrintAvalible method testing successful");
    }
        /**
     * Test  printLibraryDetails method
     *
     * 
     */
    @Test
    public void printLibraryDetails()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("A");
        Book book1 = new Book("B");
        ElectronicResources electron1 = new ElectronicResources(true, "C");
        library2.setLibraryCatergories(libraryR1);
        library2.setLibraryCatergories(book1);
        library2.setLibraryCatergories(electron1);
        library2.printLibraryDetails();
        System.out.println("printLibraryDetails method testing successful");
    }
          /**
     * Test  printEresourcesDetails method
     *
     * 
     */
    @Test
    public void printEresourcesDetails()
    {
        Library library1 = new Library();
        ElectronicResources electron1 = new ElectronicResources(true, "A");
        Book book1 = new Book("B");
        library1.setLibraryCatergories(electron1);
        library1.setLibraryCatergories(book1);
        library1.printEResourcesDetails();
        System.out.println("printEResourcesDetails method testing successful");
    }
           /**
     * Test  setLibraryCategories method(when the setting is successful)
     *
     * 
     */
    @Test
    public void setLibraryCategoriesSucess()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("A");
        ElectronicResources electron1 = new ElectronicResources(true, "B");
        Book book1 = new Book("C");
        library2.setLibraryCatergories(libraryR1);
        library2.setLibraryCatergories(electron1);
        library2.setLibraryCatergories(book1);
        assertEquals(3, library2.getNumberOfResources());
    }
           /**
     * Test  setLibraryCategories method(when the resources is null)
     *
     * 
     */
      @Test
    public void setLibraryCategoriesNull()
    {
        Library library2 = new Library();
        library2.setLibraryCatergories(null);
        System.out.println("setLibraryCategoriesNull method testing successful");
    }
           /**
     * Test  setLibraryCategories method(when the resources is already in the libraryCategory)
     *
     * 
     */
       @Test
    public void setLibraryCategoriesDuplicate()
    {
        Library library2 = new Library();
        LibraryResources libraryR1 = new LibraryResources("A");
        library2.setLibraryCatergories(libraryR1);
        library2.setLibraryCatergories(libraryR1);
        System.out.println("setLibraryCategoriesDuplicate method testing successful");
    }
           /**
     * Test  printBookdetails method
     *
     * 
     */
    @Test
    public void printBookdetails()
    {
        Library library2 = new Library();
        Book book1 = new Book("A");
        ElectronicResources electron1 = new ElectronicResources(true, "B");
        library2.setLibraryCatergories(book1);
        library2.setLibraryCatergories(electron1);
        library2.printBookDetails();
        System.out.println("printBookdetails method testing successful");
    }
}


















