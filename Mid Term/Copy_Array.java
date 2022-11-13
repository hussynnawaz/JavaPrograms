
package fa19_bcs_183;


public class Copy_Array {
   public static void main(String[] args)
    {
        int a[] = { 74, 3, 2001 };
	int b[] = { 15, 18, 33 };
	int c[] = { -21, 47, 33 };
	int d[] = { -31, -58, 3 };
 
       
        int e[] = new int[a.length];
 	int f[] = new int[b.length];
 	int g[] = new int[c.length];
 	int h[] = new int[d.length];

 
      
        e = a;
 	f = b;
	g = c;
	h = d;

      
        e[0]++;
	f[0]++;
	g[0]++;
	h[0]++;
 
        System.out.println("Contents of a[]: are ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

 System.out.println("\nContents of b[]: are ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");

 System.out.println("\nContents of c[]: are ");
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + " ");

 System.out.println("\nContents of d[]: are");
        for (int i = 0; i < d.length; i++)
            System.out.print(d[i] + " ");


 

        System.out.println("\nContents of e[]: are ");
        for (int i = 0; i < e.length; i++)
            System.out.print(e[i] + " ");

        System.out.println("\nContents of f[]: are ");
        for (int i = 0; i < f.length; i++)
            System.out.print(f[i] + " ");

        System.out.println("\nContents of g[] are ");
        for (int i = 0; i < g.length; i++)
            System.out.print(g[i] + " ");

        System.out.println("\nContents of h[] are ");
        for (int i = 0; i < h.length; i++)
            System.out.print(h[i] + " ");

    }
}
