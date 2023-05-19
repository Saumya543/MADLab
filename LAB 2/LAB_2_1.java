/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class Mother{
    Mother(int x) {
   System.out.println("I am parent class:");
        
    }
}

class Child extends Mother{
    Child(int x){
        super(x);
        System.out.println("I am child class:");
    }
    
    // child class is derived from class mother
}

class Main{
    public static void main(String[] args){
        //Mother m = new Mother();
        //m.show();
        Child ch = new Child(2);
        //ch.show();
    }
}

