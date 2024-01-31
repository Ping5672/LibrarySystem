/**
 *class Guest that make users recored Guest related informations.
 *
 * @author (Ping)
 * @version (1.0)
 */
public class Guest
{
    // instance variables - replace the example below with your own
    private int duration;
    
    

    /**
     * Constructor for objects of class Guest
     * Parameter newDuration represent the duration that every guest must have.
     */
    public Guest(int newDuration)
    {
        // initialise instance variables
        if(newDuration>3){
            System.out.println("Duration can't longer than 3 days.Duration is set to 0");
            duration=0;
        }
        else{
            this.duration =newDuration;
        }
    }
                                 /**
     * 
     * get Duration 
     */
    public int getDuration(){
     return duration;
    }
                                    /**
     * set Duration 
     * Parameter newDuration represent the duration that every guest must have.
     */
    public void setDuration(int newDuration){
     if(newDuration>3){
            System.out.println("Duration can't longer than 3 days");
        }
        else{
            this.duration =newDuration;
        }
     
    }
  
}
    




    