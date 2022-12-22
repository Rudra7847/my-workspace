package collection;

import java.util.Iterator;
import java.util.TreeSet;



public class TreeSetDemo
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> a1=new TreeSet<Integer>(); 
		a1.add(1);
		a1.add(100);
		a1.add(27);
		a1.add(104);
		a1.add(100);
		System.out.println(a1);
		TreeSet<Object> a2=new TreeSet<Object>(); 
		a2.add("rudra");
		a2.add("sonali");
		a2.add("vvinayak");
		a2.add("ankush");
		System.out.println(a2);
		System.out.println(a1.size());
		System.out.println(a2.size());
		a1.remove(1);
		System.out.println(a1);
		Object x[]=a1.toArray();
		for(Object z:x)
		{
			System.out.println(z);
		}
		Iterator i=a2.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
