package test;

public class BestBowler 
{
	private int input1;
	private String input2;
	long x[] = new long[100];
	long r,s,n;
	int flag,count = 0;

	double []avg = new double[100];
	
BestBowler(int input1 ,String input2){
	this.input1 = input1;
	this.input2 = input2;
	}
public int getInput1() {
	return input1;
}
public String getInput2() {
	return input2;
}
public void setInput1(int input1) {
	this.input1 = input1;
}
public void setInput2(String input2) {
	this.input2 = input2;
}


int bestBowler(){
	String []value  = input2.split(",");
	
	for(int i=0;i<value.length;i++)
	 {
     	x[i] = Long.parseLong(value[i]);     	
     }
	
			for(int i=0;i<value.length;i++)
			{
					n =  x[i];
				    s=0;
				    r=0;
				    flag= 0;
				while(n!=0)
				{
     			flag++;
     			s = n%10;
	  			r = r+s;
	  			n = n/10;
				}
     		avg[i] = r/flag;	   
			}
			for(int i=0;i<value.length;i++)
			 {
		    	System.out.println("average = "+avg[i]);     	
		    }
     for(int i=0;i<value.length;i++)
     {
     	if(avg[i]>=5)
     	{
     		count++;
        }	
     }
	return count;
}
     }
