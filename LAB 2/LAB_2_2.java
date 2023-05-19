/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Mother{
    public void show(){
        System.out.println("This is Parent class:");
        
    }
}

class Child extends Mother{
    public void show(){
        System.out.println("This is child class:");
    }
    public void display(){
        System.out.println("I am child class:");
    }
}
class Main{
    public static void main(String[] args ){
        Mother m = new Mother();
        m.show();
        Child ch = new Child();
        ch.show();
        //ch.display();
    }
}

