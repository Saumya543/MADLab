class AbsTest implements Testable{
    public void display(){
     System.out.println("Hello AbsTest");
    }
}


//  AbsTest is not abstract and does not override abstract method display() in Testable
// so we need to define void display function in interface class with public specifier 