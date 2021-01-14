package simple;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		ArrayList<String>str=new ArrayList<String>();
		str.add("sachin");
		str.add("manu");
		str.add("vivek");
		str.add("mahesh");
		Iterator<String>itr=str.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		

	}

}
