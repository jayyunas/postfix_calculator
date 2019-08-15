import java.io.*;
import java.util.Scanner;

public class PostfixCalculator{
	public static void main(String[] args){
        PostfixEvaluator calc = new PostfixEvaluator();

        System.out.println("Input an expression in postfix notation:"); //opening line
		Scanner s = new Scanner(System.in);
		String exp = s.nextLine();
        System.out.println("postfix evaluation: " + calc.evaluatePostfix(exp));
    }
}