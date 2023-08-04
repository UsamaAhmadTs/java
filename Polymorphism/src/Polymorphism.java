//class Shape{
//    void draw(){System.out.println("drawing...");}
//}
//class Rectangle extends Shape{
//    void draw(){System.out.println("drawing rectangle...");}
//}
//class Circle extends Shape{
//    void draw(){System.out.println("drawing circle...");}
//}
//class Triangle extends Shape{
//    void draw(){System.out.println("drawing triangle...");}
//}
//class TestPolymorphism2{
//    public static void main(String args[]){
//        Shape s;
//        s=new Rectangle();
//        s.draw();
//        s=new Circle();
//        s.draw();
//        s=new Triangle();
//        s.draw();
//    }
//}


// Java program to demonstrate the working of method
// overloading by changing the number of parameters

class MethodOverloading {

    // 1 parameter
    void show(int num1)
    {
        System.out.println("number 1 : " + num1);
    }

    // 2 parameter
    void show(int num1, int num2)
    {
        System.out.println("number 1 : " + num1
                + " number 2 : " + num2);
    }

    public static void main(String[] args)
    {
        MethodOverloading obj = new MethodOverloading();

        // 1st show function
        obj.show(3);

        // 2nd show function
        obj.show(4, 5);
    }
}
