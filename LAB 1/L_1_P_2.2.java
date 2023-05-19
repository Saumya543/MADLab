/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

********************************************************************************/
/*public class Main
{
	public static void main(String[] args){
	    int n=4;
	    for(int i=1;i<=10;i++)
	    System.out.println(n+"*"+i+"="+n*i);
	}
}*/
public class Main
{
	public static void main(String[] args) {
	    int i,j,row=4;
	    for(i=0;i<row;i++){
	        for(j=row-i;j>1;j--){
	            System.out.print(" ");
	        }
	        for(j=0;j<=i;j++){
	            System.out.print(" * ");
	        }
	        System.out.println("");
	    }
		
	}
}
	    
	    
