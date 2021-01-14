package simple;

import java.util.Iterator;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		Vector<String>str=new Vector<String>();
		str.add("food");
		str.add("animal");
		str.add("fruits");
		Iterator<String>itr=str.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
