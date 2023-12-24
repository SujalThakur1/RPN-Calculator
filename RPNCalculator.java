import java.util.Scanner;

/**
 * Write a description of class RPNCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RPNCalculator
{
    //creating instance of other classes
    private Stack stack;
    private ListNode head;
    private Tester t;
    /**
     * RPNCalculator Constructor
     *
     */
    public RPNCalculator(){
        t = new Tester();
        stack = new Stack();
        head = null;
    }

    /**
     * Method processString calculate input
     *
     * @param number A parameter
     */
    public void processString(String number){
        //variable
        double result = 0;
        double first = 0;
        double second = 0;
        String str = number;
        String[] temp;
        String delimiter = ",";
        // Split a String into an array of Strings
        temp = str.split(delimiter);
        for(int i =0; i < temp.length ; i++)
        {
            // Convert a String to an int

            try{
                //converting array to int
                int num = Integer.parseInt(temp[i]);
                //pusing to stack
                stack.push(num);
            }
            catch(Exception e){
                //checking operator and invalid input
                if(temp[i].equals("+") ){
                    //poping stack 2 time
                    stack.pop();
                    //getting listnode head value and storing in variable
                    first = stack.getHeadData();
                    second = stack.getNextData();
                    //adding result
                    result = first + second;
                }else if(temp[i].equals("-") ){
                    stack.pop();
                    first = stack.getHeadData();
                    second = stack.getNextData();
                    result = second - first;
                }else if(temp[i].equals("/") ){
                    stack.pop();

                    first = stack.getHeadData();
                    second = stack.getNextData();

                    try
                    {
                        result = zero(first , second);
                    }
                    catch (ArithmeticException ae)
                    {
                        t.menu();
                    }
                    // if(first == 0 && second == 0){
                    // System.out.println("If nothing is divided by nothing, then there's nothing to divide, or divide it with, and the division never happened. So the answer is... indeterminate.");
                    // t.menu();
                    // }
                    // else if(second == 0){
                    // ArithmeticException ae = new ArithmeticException();
                    // t.menu();
                    // }
                }else if(temp[i].equals("*") ){
                    stack.pop();
                    first = stack.getHeadData();
                    second = stack.getNextData();
                    result = first * second;
                }else if(temp[i].length() > 10){
                    System.out.println("Number should not be more than 10 digit & Alphabet are not allowed");
                    t.menu();
                }else{

                    try
                    {
                        numberformat();
                    }
                    catch (NumberFormatException nfe)
                    {
                        t.menu();
                    }

                } 
                //pusing result to stack
                stack.push(result);
            }
        }
    }

    public double zero(double f, double s) throws ArithmeticException {
        if(s == 0){
            throw new ArithmeticException();
        }
        double result = f/s;

        return result;

    }

    public void numberformat() throws NumberFormatException {
        throw new NumberFormatException();
    }

    /**
     * Method Display to display result
     *
     */
    public void Display(){
        stack.che();
    }

    /**
     * Method Display2 to display infix version
     *
     * @param number A parameter
     */
    public void Display2(String number){
        //spliting string
        String [] temp = number.split(",");
        for(int i =0; i < temp.length ; i++){
            try{
                int num2 = Integer.parseInt(temp[i]);
                String str = temp[i];
                //adding string in listnode
                add(str);
            }catch(Exception e){
                //poping and storing
                String str1 = delete();
                String str2 = delete();
                if(temp[i].equals("+")){
                    add("(" + str1  +  "+" +str2+ ")");
                }else if(temp[i].equals("-")){
                    add("(" + str2 +  "-" + str1+ ")");
                }else if(temp[i].equals("/")){
                    add("(" + str1  +  "/"  +str2+ ")");
                }else if(temp[i].equals("*")){
                    add("(" + str1  +  "*"  +str2+ ")");
                }
            }
        }
        //printing data
        if(head.getNext() != null){
            System.out.println("Less operator error");
            t.menu();
        }else{
            System.out.print(head.getPrintData() + " ");
            System.out.println("");
        }

    }

    /**
     * Method add to add string in listnode
     *
     * @param print A parameter
     */
    public void add(String print){
        ListNode newNode = new ListNode(print);
        newNode.setNext(head);
        head = newNode;
    }

    /**
     * Method delete to delete from stack
     *
     * @return The return value
     */
    public String delete(){
        String str = "";
        str = head.getPrint();
        head = head.getNext();
        return str;
    }
}
