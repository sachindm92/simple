package simple;

public class Armstrong {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int i=num%10;
			sum=sum+(i*i*i);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("armstrong no");
		}
		else
		{
			System.out.println("not srmstrong");
		}

	}

}
