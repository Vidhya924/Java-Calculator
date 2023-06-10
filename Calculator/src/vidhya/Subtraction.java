package vidhya;

public class Subtraction implements Operate {
 @Override
 public Double getResult(Double... Numbers) {
	  Double sub=Numbers[0];
	  for(int i=1;i<Numbers.length;i++) {
		  sub-=Numbers[i];
	  }
	  return sub;
 }
}
