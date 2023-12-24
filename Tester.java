import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    //making instance of rpn calculator class
    RPNCalculator RPN;

    /**
     * Method main to run program
     *
     * @param arg A parameter
     */
    public static void main(String[] arg){
        System.out.println('\u000c');//clear all previous text
        Tester t = new Tester();//instance of tester class
        t.menu();//runing menu method
    }
    
    /**
     * Method run to run calculator
     *
     */
    public void run(){
        System.out.println("WELCOME TO RPN CALCULATOR");
        System.out.println("Enter Postfix input.(Eg -> {2,3,+,4,5,*,6,-,/}");
        Scanner s = new Scanner(System.in);//taking input
        String number = s.next();
        RPN = new RPNCalculator();
        RPN.processString(number);//sending input to calulator class
        RPN.Display2(number);//displaying infix virson
        RPN.Display();//displaying result
    }
    
    /**
     * Method menu to display menu
     *
     */
    public void menu(){
        //declare variable 
        int userInput;
        boolean valid = false;
        //using do while loop which end when user input is 0
        do{
            //printing some line
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*_*_*_*_*_*_*_*-*-*-*-*-*-*-");    
            System.out.println("please select one of the options below");
            System.out.println("1. Open Calculator");
            System.out.println("2. Help");
            System.out.println("0. Exit");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*_*_*_*_*_*_*_*-*-*-*-*-*-*-"); 

            //taking user input and storing in a variable
            try{
            Scanner s = new Scanner(System.in);
            userInput = s.nextInt();
        

            //using switch statement 
            switch(userInput){
                case 1://when user enter 1 open Calculator
                    run();
                    break;

                case 2://when user enter 2 open help
                    System.out.println("Read the instruction below");
                    System.out.println("This is a RPMCalculator. Suppose you want to add to number.Your input should be like ->");
                    System.out.println("{18,70,+}");
                    System.out.println("So computer will work like 18+70 and give you answer 87.0");
                    System.out.println("If your input is incorrect then calculator will so error");
                    break;

                case 0://when user enter 0 kill system
                    System.exit(0);
                    valid = true;
                    break;
                    
                default:// if user print invalid input
                    System.out.println("!!!!!!!!!  Please Press Valid Input :-(  !!!!!!!!"); 
                    valid = false;
            }
        }catch(InputMismatchException ime){
            System.out.println("Only Integers are alloywed");
        }
            
        }while(!valid);
    }
}
    
