//// Java program to show multiple type parameters in Java Generics
//// We use < > to specify Parameter type
//class Generics<T, U>
//{
//    T obj1;
//    U obj2;
//
//    // constructor
//    Generics(T obj1, U obj2)
//    {
//        this.obj1 = obj1;
//        this.obj2 = obj2;
//    }
//
//    // To print objects of T and U
//    public void print()
//    {
//        System.out.println(obj1);
//        System.out.println(obj2);
//    }
//}



// Java program to demonstrate that NOT using
// generics can cause run time exceptions


//
//class Generics
//{
//    public static void main(String[] args)
//    {
//        // Creating an ArrayList without any type specified
//        ArrayList al = new ArrayList();
//
//        al.add("usama");
//        al.add("ahmad");
//        al.add(10); // Compiler allows this
//
//        String s1 = (String)al.get(0);
//        String s2 = (String)al.get(1);
//
//        // Causes Runtime Exception
//        String s3 = (String)al.get(2);
//    }
//}


// Using Java Generics converts run time exceptions into
// compile time exception.


//class Generics
//{
//    public static void main(String[] args)
//    {
//        // Creating an ArrayList with String specified
//        ArrayList <String> al = new ArrayList<String> ();
//
//        al.add("usama");
//        al.add("ahmad");
//
//        // Now Compiler doesn't allow this
//        al.add(10);
//
//        String s1 = (String)al.get(0);
//        String s2 = (String)al.get(1);
//        String s3 = (String)al.get(2);
//    }
//}


// We don't need to typecast individual members of ArrayList


import java.util.*;
class Generics {
    public static void main(String[] args)
    {
        // Creating an ArrayList with String specified
        ArrayList<String> al = new ArrayList<>();

        al.add("usama");
        al.add("ahmad");

        // Typecasting is not needed
        String s1 = al.get(0);
        String s2 = al.get(1);
    }
}