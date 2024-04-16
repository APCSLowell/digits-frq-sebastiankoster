import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{
	digitList = new ArrayList<Integer>();
	int n = 0;
	int num1 = num;
	while(num1>=1){
		n++;
		num1 = num1/10;
	}
	for(int i=0;i<n;i++){
		digitList.add(0,num%10);
		num = num/10;
	}
	}

	public boolean isStrictlyIncreasing()
	{ 
	for(int i = 1; i < digitList.size(); i++)
        	if(digitList.get(i - 1).compareTo(digitList.get(i)) >= 0)
            		return false;

    	return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}

}
