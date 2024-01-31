import java.util.ArrayList;

/**
 *class LibraryResources that make users recored LibraryResources related informations.
 *
 * @author (Ping)
 * @version (1.0)
 */
public class LibraryResources
{
    // instance variables - replace the example below with your own
    private String ISBN;
    private String title;
    private Author author;
    private Member member;
    private Guest guest;

    /**
     * Constructor for objects of class LibraryResources
     * Parameter titles represent a title that every LibraryResources must have.
     */
    public LibraryResources(String titles)
    {
        // initialise instance variables
        ISBN = "";
        this.title = titles;
        author = null;
        member = null;
        guest = null;
        
        
    }
      /**
     * 
     * get guest 
     */
    public Guest getGuest()
    {
        return guest;
    }
    /**
     * 
     * get ISBN 
     */
    public String getISBN()
    {
        return ISBN;
    }
       /**
     * 
     * get Title 
     */
    public String getTitle()
    {
        return title;
    }
          /**
     * 
     * get Author 
     */
    public Author getAuthor()
    {
        return author;
    }
             /**
     * 
     * get Member 
     */
    public Member getMember()
    {
        return member;
    }
                            /**
     * 
     * set Guest 
     */
    public void  setGuest(Guest newGuest)
    {
       this.guest =newGuest;
    }
                          /**
     * 
     * set Author 
     */
    public void  setAuthor(Author newAuthor)
    {
       this.author =newAuthor;
    }
                         /**
     * 
     * set Borrow Member 
     */
    public void  setBorrowMember(Member newMember)
    {
       this.member =newMember;
    }
                        /**
     * 
     * set ISBN 
     */
    public void  setISBN(String newISBN)
    {
       this.ISBN =newISBN;
    }
        
                      /**
     * 
     * set Title 
     */
    public void  setTitle(String newTitle)
    {
       this.title =newTitle;
    }
    
   
                                          /**
     * 
     * print ResourcesDetails
     */
    public void printResourcesDetails(){
    if(author == null && member == null){
        System.out.println("ISBN: " + ISBN + "," + "Title: " + title + "," + "Author: Author haven't add"+ 
         "," + "Avaliable: " + "Yes");
    }
    else if(author != null && member == null){
        System.out.println("ISBN: " + ISBN + "," + "Title: " + title + "," + "Author: " + author.getAuthorFullName() + 
         "," + "Avaliable: " + "Yes");
    }
    else if(author == null && member != null){
        System.out.println("ISBN: " + ISBN + "," + "Title: " + title + "," + "Author: Author haven't add" + 
         "," + "Avaliable: " + "No");
    }
    else{
     System.out.println("ISBN: " + ISBN + "," + "Title: " + title + "," + "Author: " + author.getAuthorFullName() + 
         "," + "Avaliable: " + "No");
        
        }
    }
    }




    