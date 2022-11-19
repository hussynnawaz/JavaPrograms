
package AllPrograms;


public class Multiplication_Of_Matrix {

   
    public static void main(String[] args) {
    
   
int a[][]={{5,4,2},{5,4,2},{8,5,2}};    
int b[][]={{1,8,6},{9,2,1},{6,7,1}};    
int c[][]={{3,9,4},{5,1,2},{6,5,4}};
int d[][]=new int[3][3];  
    

for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
d[i][j]=0;      
for(int k=0;k<3;k++)      
{      
d[i][j]+=a[i][k]*b[k][j];      
} 
System.out.print(d[i][j]+" "); 
System.out.println(); 
}    
} 
} 
    }
   