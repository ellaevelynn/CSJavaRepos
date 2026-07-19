
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.EmptyStackException;
import java.util.Scanner;

public class Isabella_Eaton_Converter {
public static void main(String[]args) {
	Scanner userInput=new Scanner(System.in);
	System.out.println("Enter input filename (ex: input.txt): ");
	String inputFileName= userInput.nextLine();
	
	System.out.println("Enter output filename (ex: output.txt): ");
	String outputFileName= userInput.nextLine();
	
	try(Scanner fileScanner= new Scanner(new File(inputFileName));
			PrintWriter writer= new PrintWriter(new File(outputFileName))){
		
		while(fileScanner.hasNextLine()) {
			String infix=fileScanner.nextLine().trim();
			if(infix.isEmpty()) continue;
			
			String postfix=convertInfixToPostfix(infix);
			
			System.out.println("Infix Expression:  "+infix);
			System.out.println("Postfix Expression:  "+postfix);
			System.out.println();
			
			writer.println(postfix);
		}
		System.out.println(" Conversion complete. Output saved successfully.");
	} catch (FileNotFoundException e) {
		System.err.println("Error: count not open file. verify file name and/or location.");
	}finally {
		userInput.close();
	}
	
}//end main


/**
 * Method:convertInfixToPostfix
 * Converts a standard infix math expression into its postfix variant.
 * @param infix 
 * @return output as a string
 */

public static String convertInfixToPostfix(String infix) {
	StringBuilder output= new StringBuilder();
	MyLinkedStack<Character> operatorStack= new MyLinkedStack<>();
	for(int i=0;i<infix.length();i++) {
		char current= infix.charAt(i);
		
		//ignores document whitespace
		if(Character.isWhitespace(current)) {
			continue;
		}
		//directly append to output
		if(Character.isLetterOrDigit(current)) {
			output.append(current);
		}
		
		//open parenthesis ->push to stack
		else if(current=='(') {
			operatorStack.push(current);
		}
		//closed parenthesis-> pop until a correlating matching parenthesis is found
		else if(current==')') {
			try {
				while(!operatorStack.isEmpty() && operatorStack.peek() !='(') {
					output.append(operatorStack.pop());
				}
				if (operatorStack.isEmpty()) {
					return "Invalid expression: no matching parenthesis";
				}
				operatorStack.pop();//removed open parenthesis
			} catch (EmptyStackException e) {
				return "Invalid expression: no matching parenthesis";
			}
		}
		//operator handling
		else if (isOperator(current)) {
			if(current=='^') {
				operatorStack.push(current);
			}else {
				while(!operatorStack.isEmpty()&& getPrecedence(operatorStack.peek())>=getPrecedence(current)) {
					output.append(operatorStack.pop());
				}
				operatorStack.push(current);
			}
		} else {
			return "Invalid expression: unknown symbol:   "+current;
		}
	}
	
	//empty remaining content from stack
	
	while (!operatorStack.isEmpty()) {
		char top=operatorStack.pop();
		if (top=='('|| top==')') {
		return 	"Invalid expression: no matching parenthesis";
		}
		output.append(top);
		}
	return output.toString();
	}

private static boolean isOperator (char ch) {
	return ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^';
}

private static int getPrecedence(char operator) {
	switch(operator) {
	case'+':
	case'-':
		return 1;
	case'*':
	case'/':
		return 2;
	case'^':
		return 3;
		default:
		return -1;//safety measure for boundaries of parenthesis
	}
}
}//end class




















