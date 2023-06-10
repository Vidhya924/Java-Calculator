package vidhya;

public class Add implements Operate {
  @Override
  public Double getResult(Double...Numbers) {
	  Double sum=0.0;
	  for(Double num : Numbers) {
		  sum+=num;
	  }
	  return sum;
  }
}
