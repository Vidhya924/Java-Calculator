package vidhya;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("WELCOME TO JAVA CALCULATOR!!");
      System.out.println("Enter your Expression");
      String expression = sc.next();
      String numArr[]=expression.split("[+*-/]");
      String operArr[]=expression.split("[0-9]+");
      System.out.println("Solution of the Expression: ");
      System.out.print(expression+" = ");
   //   System.out.println(Arrays.toString(numArr)+"\n"+Arrays.toString(operArr));
      Queue<String>Numbers;
      Queue<String>Operations;
      Numbers = new LinkedList<String>(Arrays.asList(numArr));
      Operations = new LinkedList<String>(Arrays.asList(operArr));
      Double res = Double.parseDouble(Numbers.poll());
      while(!Numbers.isEmpty()) {
    	  String opr = Operations.poll();
    	  Operate operate ;
    	  switch (opr) {
    	  case "+" :
    		  operate = new Add();
    		  break;
    	  case "-":
    		  operate = new Subtraction();
    		  break;
    	  case "*":
    		  operate = new Multiply();
    		  break;
    	  case "/":
    		  operate = new Divide();
    		  break;
    	  default:
    		  continue;
    	  }
    	  Double num = Double.parseDouble(Numbers.poll());
    	  res = operate.getResult(res,num);
      }
      System.out.println(res);
	}

}
