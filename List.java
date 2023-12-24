import java.util.*;

/**
 * AC12001/AC22007 Lab 1 Starting files
 * 
 * @author Computing, School of Science and Engineering, University of Dundee.
 *         Note. Change this comment to describe this class and add your name!
 * @version v1.0
 */
public class List 
{
    private ListNode head; // used to hold a reference to an instance of a ListNode object
    // which will be the first item in the list, i.e. at the 'head'
    // of the list

    /**
     * Default constructor. Initialise fields to default values.
     */
    public List()
    {
        // set the list to be empty, i.e. not referring to anything valid yet
        head = null;
    }

    /**
     * Get the list node which is at the 'head' of the list
     * 
     * @return A reference to a ListNode object which represents the node at the
     *         head of the list (or null if the list is empty, i.e. no 'head' has
     *         been set yet).    
     */
    public ListNode getHead()
    {
        return head;
    }

    /**
     * Set the 'head' of the list to the given node
     * 
     * @param  newHead A reference to a ListNode object which will be
     *                 the head of the list. 
     *                 
     * NOTE: if a list already exists, the existing listing will be 
     * lost since the head is being assigned to something new.
     */
    public void setHead(ListNode newHead)
    {
        head = newHead;
    }

    /**
     * Method addtoList ro add listb ro listnode
     * 
     * @param data to add to listNode
     * 
     * 
     */
    public ListNode addToList(double data)
    {
        ListNode newNode;
        newNode = new ListNode(data);
        newNode.setNext(head);
        head = newNode;
        return newNode;
    }

    /**
     * Method printToList to print calculated result
     *
     */
    public void printToList(ListNode marker){
        System.out.println(marker.getSummaryData());
    }

    /**
     * Method deleteFromStart to delete from node
     *
     */
    public ListNode deleteFromStart(ListNode node){
        node = node.getNext();
        head = node;
        return node;
    }

}
