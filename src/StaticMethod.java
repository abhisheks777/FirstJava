
public class StaticMethod {

	int a,b;
	static String str="BBDIT";
	
	static void  Change() {
		
		str="IMS";
		
	}
	 StaticMethod(int a1,int b1)
	{
		a=a1;
		b=b1;
		//str=str1;
		
		System.out.println(a+" "+b+" "+str);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Change();
		StaticMethod s=new StaticMethod(123,321); 
		

	}

}
