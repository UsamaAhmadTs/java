//Single Inheritance Example
//class Animal{
//    void eat(){System.out.println("eating...");}
//}
//class Dog extends Animal{
//    void bark(){System.out.println("barking...");}
//}
//class Inheritance{
//    public static void main(String[] args){
//        Dog d=new Dog();
//        d.bark();
//        d.eat();
//    }}



//Multilevel Inheritance Example
class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class BabyDog extends Dog{
    void weep(){System.out.println("weeping...");}
}
class Inheritance2{
    public static void main(String[] args){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }}



//Hierarchical Inheritance Example
//class Animal{
//    void eat(){System.out.println("eating...");}
//}
//class Dog extends Animal{
//    void bark(){System.out.println("barking...");}
//}
//class Cat extends Animal{
//    void meow(){System.out.println("meowing...");}
//}
//class TestInheritance3{
//    public static void main(String args[]){
//        Cat c=new Cat();
//        c.meow();
//        c.eat();
////c.bark();//C.T.Error
//    }}



//multiple inheritance not allowed
//class A{
//    void msg(){System.out.println("Hello");}
//}
//class B{
//    void msg(){System.out.println("Welcome");}
//}
//class C extends A,B{//suppose if it were
//
//    public static void main(String args[]){
//        C obj=new C();
//        obj.msg();//Now which msg() method would be invoked?
//    }
//}