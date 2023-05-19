/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// when created static in Mother class
/*class Mother{
    public static void show(){
        System.out.println("This is Parent class:");
        
    }
}

class Child extends Mother{
    public  void show(){
        System.out.println("This is child class:");
    }
    
}
class Main{
    public static void main(String[] args ){
        Mother m1 = new Child();
        m1.show();
        
    }
}*/

// when created static in Child class

/*class Mother{
    public void show(){
        System.out.println("This is Parent class:");
        
    }
}

class Child extends Mother{
    public static void show(){
        System.out.println("This is child class:");
    }
    
}
class Main{
    public static void main(String[] args ){
        Mother m1 = new Child();
        m1.show();
        
    }
}*/


class Mother{
    public static void show(){
        System.out.println("This is Parent class:");
        
    }
}

class Child extends Mother{
    public static void show(){
        System.out.println("This is child class:");
    }
    
}
class Main{
    public static void main(String[] args ){
        Mother m1 = new Child();
        m1.show();
        
    }
}



