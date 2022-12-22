package loopsinjava;

public class LebelledLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	outer:	for(int i=0;i<5;i++) {
	inner:		for(int j=0;j<5;j++) {
				System.out.println("hii sonal i="+i+"j="+j);
				if(i==j)
				{
					break outer;
				
			}
			
		}
		

	}
	outer: for(int i=0;i<4;i++) {
		inner: for(int j=0;j<4;j++) {
			System.out.println("sonal i="+i+"j="+j);
			if(i==j) {
				break inner;
			}
		}
	}

	}
}
