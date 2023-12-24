
/**
 * Write a description of class Stack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stack
{
    //instance of classes
    private ListNode theStack;
    private List list;
    private Tester t;
    private double headData;
    private double nextData;
    /**
     * Stack Constructor
     *
     */
    public Stack(){
        theStack = null;
        list = new List();
        t = new Tester();
        headData = 0;
        nextData = 0;
    }

    /**
     * Method getTheStack
     *
     * @return The return value
     */
    public ListNode getTheStack(){
        return theStack;
    }

    /**
     * Method getHeadData
     *
     * @return The return value
     */
    public double getHeadData(){
        return headData;
    }

    /**
     * Method getNextData
     *
     * @return The return value
     */
    public double getNextData(){
        return nextData;
    }

    /**
     * Method push which will push data 
     *
     * @param data A parameter
     */
    public void push(double data){ 
        list.setHead(list.addToList(data));
        theStack = list.getHead();
    }

    /**
     * Method pop delete from node 2 time
     *
     */
    public void pop(){
        try{
            isStackEmpty();
        }catch(EmptyStackException ese){
            t.menu();
        }
        headData = theStack.getData();
        theStack =  list.deleteFromStart(theStack);
        nextData = theStack.getData();
        theStack =  list.deleteFromStart(theStack);
        list.setHead(theStack);

    }

    /**
     * Method isStackEmpty to check wether stack is empty or not
     *
     * @return The return boolean
     */
    public void isStackEmpty() throws EmptyStackException{

        if(theStack.getNext() == null){
            throw new EmptyStackException();
        }

    }

    /**
     * Method che to print result
     *
     */
    public void che(){
        list.printToList(theStack);
    }

}
