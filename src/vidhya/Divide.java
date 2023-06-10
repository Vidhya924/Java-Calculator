package vidhya;

public class Divide implements Operate {
@Override
public Double getResult(Double... Numbers) {
	Double result=Numbers[0];
	for(int i=1;i<Numbers.length;i++) {
		result/=Numbers[i];
	}
	return result;
}
}
