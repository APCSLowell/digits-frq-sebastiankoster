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
		digitList.add(num%10);
		num = num/10;
	}
		digitList = reverse(digitList);
	}

	public boolean isStrictlyIncreasing()
	{ 
	for(int i =0; i<digitList.size()-2;i++){
		if(digitList.get(i)>=digitList.get(i+1)) return false;
	
	}	
return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
	
	public ArrayList<Integer> reverse(ArrayList<Integer> list) {
    if(list.size() > 1) {                   
        Integer value = list.remove(0);
        reverse(list);
        list.add(value);
    }
    return list;
}
}
