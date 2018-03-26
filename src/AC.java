
 class AC {

int a;	
int b;

AC(int a1,int b1)
{
	a=a1;
	b=b1;

	
}
AC(AC s)
{
	
	a=s.a;
	b=s.b;
}
void disp()
{
	
	System.out.println(a+" "+b);
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AC s=new AC(5,10);
		AC s1=new AC(s);
		s.disp();
		s1.disp();
		
		
	}

}
