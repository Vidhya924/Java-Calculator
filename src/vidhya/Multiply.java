package vidhya;

public class Multiply implements Operate {
 @Override
 public Double getResult(Double... Numbers) {
	 Double result=1.0;
	 for(Double num : Numbers) {
		 result*=num;
	 }
 return result;
 }
}
