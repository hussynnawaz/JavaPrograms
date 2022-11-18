/*STATIC METHOD */
import java.util.Scanner;
class Rev
{
public static void main(String[] arg)
{
int a,res=0,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
while(n!=0)
{
a=n%10;
res=(res*10)+a;
n=n/10;
}
System.out.println("reverse of a number is "+res);
}
}
/*USING FUNCTION */
Java
import java.util.Scanner;
class Rev
{
	public static void main(String[] arg)
	{
	int a,res=0,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	n=sc.nextInt();
	for( ;n!=0; )
	{
	a=n%10;
	res=(res*10)+a;
	n=n/10;
	}
	System.out.println("Reverse of a number is =  "+res);
	}
}
/*RECURSION */
import java.util.Scanner;
class Rev
{
	int res=0;	
	void reverse(int num)
	{
	int rem;
	if(num!=0)
	{
	rem=num%10;
	res=(res*10)+rem;
	num=num/10;
	reverse(num);
	}
	else
	System.out.println("reverse of a number is "+res);

	}

public static void main(String[] arg)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int x=sc.nextInt();
	Rev r=new Rev();
	r.reverse(x);
	}
}