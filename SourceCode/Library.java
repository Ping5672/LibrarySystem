import java.util.ArrayList;

/**
 * class Library that make users recored Library related informations.
 *
 * @author (Ping)
 * @version (1.0)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private ArrayList<LibraryResources> libraryCategories;

    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        // initialise instance variables
        libraryCategories = new ArrayList<>();
    }
    
    /**
     * 
     * get LibraryCatergories 
     */
    public ArrayList getLibraryCategories(){
     return libraryCategories;
    }
    /**
     * set LibraryCatergories
     * parameter resources is the one that user want to add into the library 
     */
    public void  setLibraryCatergories(LibraryResources resources)
    {
    if(resources == null)
    {
      System.out.println("Resources can not be null");
    }
    else if (libraryCategories.contains(resources))
    {
        System.out.println("Resources is already recoreded");
    }
    else
    {    
        libraryCategories.add(resources);
    }
    }
    /**
     * 
     * Print details of the librarys  
     */
    public void  printLibraryDetails()
    {
     System.out.println( "LibraryResources: ");
       for(LibraryResources resource : libraryCategories) {
        {
           resource.printResourcesDetails();
        }
    }
    }
    /**
     * Check if resources in thelibrarys 
     * parameter resources is the one that user want to check if in the library 
     */
    public boolean  checkResources(LibraryResources resources)
    {
        if (libraryCategories.contains(resources))
        {
        return true;
        }
        else
        {
        return false;   
        }
        }
    /**
     * Change Auhor's first name
     * parameter resourceChange is the one that user want to change the name
     * parameter newName  is the name that user want to change
     */
    public void  changeAuthorFirstName(LibraryResources resourceChange,String newName)
    {   
        if (libraryCategories.contains(resourceChange))
        {
        for(LibraryResources resource : libraryCategories) {
        if(resource.getAuthor()==null)
        {
        System.out.println("There is no Author in this resources");   
        }
        else{
        resource.getAuthor().setFirstName(newName);
        }
        }
        }
        else{
        System.out.println("This resource is not in this categories");
        }
        
    }
      /**
     * Search Library catalogue by title  
     * parameter aimTitle  is the title that user want to search
     */
    public void  searchCatalogueTitle(String aimTitle)
    {   int i=0;
        for(LibraryResources resource : libraryCategories) {
        if (resource.getTitle().equalsIgnoreCase(aimTitle))
        {
        resource.printResourcesDetails();
        i++;
        }
        else{
        System.out.println("This title is not in the category");
        }
        }
        System.out.println("Total resources found:" +i);
    }
         /**
     * Search Library catalogue by Surname  
     * parameter aimTitle  is the Surname that user want to search
     */
    public void  searchCatalogueSurname(String aimSurName)
    {   int i=0;
        for(LibraryResources resource : libraryCategories) {
        if (resource.getAuthor()==null){
        continue;    
        }
        if (resource.getAuthor().getSurName().equalsIgnoreCase(aimSurName))
        {
        resource.printResourcesDetails();
        i++;
        }
 
        else{
        System.out.println("There is no Author with this surname ");
        }
        }
        System.out.println("Total resources found:" +i);
    }
            /**
     * Remove resources from Library catalogue
     * parameter resource  is the one that user want to remove
     */
    public void  removeFromCatalogue(LibraryResources resource)
    { 
    
        if (libraryCategories.contains(resource))
        {
        if (resource.getMember()== null){
            libraryCategories.remove(resource);
        }
        else{
            System.out.println("Resource is on loan ");
        }
        }
 
        else{
        System.out.println("Resource is not in the Category ");
        }
        
    }
            /**
     * Remove resources from Library catalogue by position
     *  parameter i  is the index that user want to remove
     */
    public void  removeFromCataloguePosition(int i)
    {
        if(i >= libraryCategories.size() || i < 0){
        System.out.println("Resource is not in the Category ");
        }
        else
        {
        if (libraryCategories.get(i).getMember()== null){
            libraryCategories.remove(libraryCategories.get(i));
        }
        else{
            System.out.println("Resource is on loan ");
        }
        }
    }
                /**
     * 
     * Print all available book from Library catalogue  
     */
    public void  printAvailable()
    {   
        for(LibraryResources resource : libraryCategories) {
        if(resource instanceof ElectronicResources ||resource.getMember()!= null){
        continue;
        }
        else
        {
        resource.printResourcesDetails();
        }
        }
    }
                /**
     * 
     * Return number of resources in the category 
     */
    public int  getNumberOfResources()
    {   
        return libraryCategories.size();
        
    }
      /**
     * simulate book borrowing
     * parameter book  is the book that user want to borrow
     * parameter member  is the member who  want to borrow that book
     */
    public void  bookBorrowing(Book book,Member member)
    {   
        if(libraryCategories.contains(book))
        {
        if(book.getMember()== null){
        book.setBorrowMember(member);
        }
        else{
        System.out.println("Book is not available ");
        }
        }
        else
        {    
        System.out.println("Book is not in the category ");
        }
    }
          /**
     * 
     * simulate book returning
     * parameter book  is the book that user want to return
     * parameter damage  record if this book have damge from this borrowing or not.
     * parameter damageDescription  is the description about the damage for that book.
     */
    public void  bookReturning(Book book,boolean damage,String damageDescription)
    {   
    if(libraryCategories.contains(book))
    {
    if(book.getMember()!= null){
    book.setBorrowMember(null);
    }
    else{
    System.out.println("The book is already returned");
    }
    if(damage == true){
    book.setDamageOfBook(damageDescription);
    }
    }
    else
    {    
    System.out.println("Please Check  if book in the category ");
    }
    }
    /**
     * 
     * print all  books detail
     */
    public void  printBookDetails()
    {   
    for(LibraryResources resource : libraryCategories) {
    if(resource instanceof Book){
        resource.printResourcesDetails();
    }
    }
    }   
    /**
     * 
     * print all  E-resources detail
     */
    public void  printEResourcesDetails()
    {   
    for(LibraryResources resource : libraryCategories) {
    if(resource instanceof ElectronicResources){
        resource.printResourcesDetails();
    }
    }
    }
}

    
  
     


    



    
    



