
/**
 * AC12001/AC22007 Lab 1 Starting files
 * 
 * @author Computing, School of Science and Engineering, University of Dundee.
 *           Note. Change this to comment to describe this class and add your name!
 * @version v1.0
 */
public class ListNode    
{
    // fields to store the data being held in this list node
    private double data;
    private String print;
    private ListNode next;  

    /**
     * Default constructor. Initialise fields to default values
     */
    public ListNode()
    {
        // set data and next to default / empty values 
        data = 0;
        print = " ";
        next = null;
    }

    /**
     * Alternative constructor. Set fields to given values.
     * @param data
     */
    public ListNode(double data)
    {
        // set result to values provided
        this.data = data;
       next = null; 
    }
    
    /**
     * ListNode Constructor .set fiels to give infix data
     *
     * @param print A parameter
     */
    public ListNode(String print)
    {
        // set result to values provided
        this.print = print;
       next = null; 
    }

    /**
     * Get the data contained in this list node
     * 
     * @return The calculated result
     */
    public double getData()
    {
        return data;
    }
    
    /**
     * Method getPrint
     *
     * @return The return value
     */
    public String getPrint(){
        return print;
    }

    /**
     * Get the next node in the list after this one
     * 
     * @return A reference to the next node (or null if
     *         there is no next node)
     */
    public ListNode getNext()
    {
       return next;
    }

    /**
     * Set the next node in the list after this one
     * 
     * @param next A reference to a ListNode object which 
     *             represents the next node in the list after
     *             this one.
     */
    public void setNext(ListNode newNext)
    {
        next = newNext;
    }

    /**
     * Return a string containing summary data from this node
     * 
     * @return A String containing a summary of the data contained in this list node
     */
    public String getSummaryData()
    {
        String info;        
        info = "Result => " + data;        
        return info;
    }
    
    /**
     * Return a string containing summary data from this node
     * 
     * @return A String containing a summary of the data contained in this list node
     */
    public String getPrintData(){
        String info;
        info = print;
        return info;
    }
}
