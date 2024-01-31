
/**
 *class Author that make users recored Author related informations.
 *
 * @author (Ping)
 * @version (1.0)
 */
public class Author
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String surName;
    private String address;
    

    /**
     * Constructor for objects of class Author
     */
    public Author()
    {
        // initialise instance variables
        firstName = "";
        surName = "";
        address = "";
        
    }

    /**
     * 
     * get FirstName 
     */
    public String getFirstName()
    {
        return firstName;
    }
       /**
     * 
     * get SurName 
     */
    public String getSurName()
    {
        return surName;
    }
          /**
     * 
     * get Address 
     */
    public String getAddress()
    {
        return address;
    }
  
                         /**
     * set FirstName 
     * Parameter newFirstName represent the new firstname that user want to add.
     */
    public void  setFirstName(String newFirstName)
    {
       this.firstName =newFirstName;
    }
                        /**
     * set SurName 
     * Parameter newSurName represent the new surname that user want to add.
     */
    public void  setSurName(String newSurName)
    {
       this.surName =newSurName;
    }
        
                      /**
     * set Address 
     * Parameter newAddress represent the new address that user want to add.
     */
    public void  setAddress(String newAddress)
    {
       this.address =newAddress;
    }
                                           /**
     * 
     * print Author's FullName
     */
    public String getAuthorFullName(){
     return  firstName +" "+ surName ; 
       
    }
                                          /**
     * 
     * print AuthorDetails
     */
    public void printAuthorDetails(){
     System.out.println("FirstName: " + firstName + "," + "SurName: " + surName + "," + "Address: " + address); 
       
    }
    }
    




    