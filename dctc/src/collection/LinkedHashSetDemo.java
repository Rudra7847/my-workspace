package collection;


import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> a1=new LinkedHashSet<String>();
		a1.add(null);
		a1.add("10");
		a1.add("11");
		a1.add("0");
		a1.add("100");
		System.out.println(a1);
		a1.remove("0");
		System.out.println(a1);
		a1.add("56");
		System.out.println(a1);
		a1.add("100");
		System.out.println(a1);
		System.out.println(a1.size());
		Object x[]=a1.toArray();
		for(Object y:x)
		{
			System.out.println(y);
		}
		LinkedHashSet<Object>a2=new LinkedHashSet<Object>();
		a2.add("vinayak");
		a2.add(555);
		a2.add("sonali");
		a2.add(78.78);
		a2.add("rudra");
		a2.add("india");
		System.out.println(a2);
		a2.add(null);
		System.out.println(a2);
		a2.add(555);
		System.out.println(a2);
		a2.remove(0);
		System.out.println(a2);
		a2.add("444");
		System.out.println(a2);
		System.out.println(a2.size());
		a2.add(a1);
		Object p[]=a2.toArray();
		for(Object z:p)
		{
			System.out.println(z);
		}	
		

	}

}
