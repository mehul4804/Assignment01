class Swap 
{
	public static void main(String[] args) 
	{
		int a=20,b=10;
		System.out.println("Before swapping:");
		System.out.println("The value of a is :"+a);//20
		System.out.println("The value of b is :"+b);//10
		a=a+b; //30
		b=a-b; //20
		a=a-b;//10
		System.out.println("After swapping:");
		System.out.println("The value of a is :"+a);
		System.out.println("The value of b is :"+b);

	}
}
