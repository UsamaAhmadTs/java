//Example of an abstract class that has abstract and non-abstract methods  
//abstract class Bike{
//    Bike(){System.out.println("bike is created");}
//    abstract void run();
//    void changeGear(){System.out.println("gear changed");}
//}
////Creating a Child class which inherits Abstract class
//class Honda extends Bike{
//    void run(){System.out.println("running safely..");}
//}
////Creating a Test class which calls abstract and non-abstract methods
//class Abstraction{
//    public static void main(String args[]){
//        Bike obj = new Honda();
//        obj.run();
//        obj.changeGear();
//    }
//}
//

interface A{
    void a();
    void b();
    void c();
    void d();
}

abstract class B implements A{
    public void c(){System.out.println("I am c");}
}

class M extends B{
    public void a(){System.out.println("I am a");}
    public void b(){System.out.println("I am b");}
    public void d(){System.out.println("I am d");}
}

class Test5{
    public static void main(String[] args){
        A a=new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }}