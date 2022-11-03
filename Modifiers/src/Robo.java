
public class Robo {
	int a,b,total;
	void add(int x,int y) {             //passing parameters
		a=x;
		b=y;
		total=a+b;
		System.out.println("Sum="+total);
	}

	public static void main(String[] args) {
		Robo obj=new Robo();
		obj.add(10,20);

	}

}

//public class Robo{
//	public int sum(int a, int b) {
//		int c=a+b;
//		return c;
//	}
//public static void main(String[] args) {
//	Robo obj=new Robo();
//	int d=obj.sum(10,32);
//	System.out.println(d);
//}
//	
//}