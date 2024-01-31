
/**
 *class E- Resources that make users recored  E- Resources related informations.
 *
 * @author (Ping)
 * @version (1.0)
 */
public class ElectronicResources extends LibraryResources
{
    // instance variables - replace the example below with your own
    private boolean download;
    
    

    /**
     * Constructor for objects of class E- Resources
     * Parameter titles represent a title that every LibraryResources must have.
     * Parameter newDownload represent this E-resources can download or not.
     */
    public ElectronicResources(boolean newDownload,String titles)
    {
        // initialise instance variables
        super(titles);
        this.download = newDownload;
    }
                                 /**
     * 
     * get Dowload Status
     */
    public boolean getDownload(){
     return download;
    }
                                          /**
     * 
     * print E- Resources
     */
    @Override
    public void printResourcesDetails(){
    if(getAuthor() == null){
        System.out.println("ISBN: " + getISBN() + "," + "Title: " + getTitle() + "," + "Author:Author haven't add. "   
          + "," + "Download: "+download);
    
    }
   
    else{
     System.out.println("ISBN: " + getISBN() + "," + "Title: " + getTitle() + "," + "Author: " + getAuthor().getAuthorFullName() + 
         ","  + "Download: "+download);
        
    }
    }
    }
    
    




    