import java.util.ArrayList;

/**
 *class Book that make users recored book related informations.
 *
 * @author (Ping)
 * @version (1.0)
 */
public class Book extends LibraryResources
{
    // instance variables - replace the example below with your own
    
    private ArrayList<String>damageOfBook;
    

    /**
     * Constructor for objects of class Book
     * Parameter titles represent a title that every LibraryResources must have.
     */
    public Book(String titles)
    {
        // initialise instance variables
        super(titles);
        damageOfBook = new ArrayList<>();
        
    }

    
               /**
     * 
     * get DamageOfBook 
     */
    public ArrayList getDamageOfBook()
    {
        return damageOfBook;
    }
    
                       /**
     * set DamageOfBook
     * Parameter damage represent a description of damage from a book
     */
    public void  setDamageOfBook(String damage)
    {
    if(damage == null)
    {
      System.out.println("Description can not be null");
    }
    else if (damageOfBook.contains(damage))
    {
        System.out.println("Damage is already recoreded");
    }
    else
    {    
        damageOfBook.add(damage);
    }
    }
                                   /**
     * 
     * Check if the book is avaliable  
     */
    public boolean  checkBook()
    { 
    if(getMember() == null)
    {
      return true;
    }
    else
    {    
       return false; 
    }
    }
                                          /**
     * 
     * print BookDetails
     */
    @Override
    public void printResourcesDetails(){
    if(getAuthor() == null && getMember() == null){
         System.out.println("ISBN: " + super.getISBN() + "," + "Title: " + super.getTitle() + "," + "Author: Author haven't add"+ 
         "," + "Avaliable: " + "Yes"+ "DamageOfBook: ");
          for(String damage : damageOfBook)
        {
            System.out.println(damage);
        }
    }
    else if(getAuthor() != null && getMember() == null){
        System.out.println("ISBN: " + getISBN() + "," + "Title: " + getTitle() + "," + "Author: " + getAuthor().getAuthorFullName() + 
         "," + "Avaliable: " + "Yes"+ "," + "DamageOfBook: ");
         for(String damage : damageOfBook)
        {
            System.out.println(damage);
        }
    }
    else if(getAuthor() == null && getMember() != null){
        System.out.println("ISBN: " + getISBN() + "," + "Title: " + getTitle() + "," + "Author: Author haven't add" + 
         "," + "Avaliable: " + "No"+ "," + "DamageOfBook: ");
         for(String damage : damageOfBook)
        {
            System.out.println(damage);
        }
    }
    
    else{
     System.out.println("ISBN: " + getISBN() + "," + "Title: " + getTitle() + "," + "Author: " + getAuthor().getAuthorFullName() + 
         "," + "Avaliable: " + "No"+ "," + "DamageOfBook: ");
         for(String damage : damageOfBook)
        {
            System.out.println(damage);
        }
        }
    }
    }




    