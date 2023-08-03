//public class exceptionhandling {
//        public static void main(String args[]) {
//            int a[] = new int[2];
//            try {
//                System.out.println("Access element three :" + a[3]);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Exception thrown  :" + e);
//            }finally {
//                a[0] = 6;
//                System.out.println("First element value: " + a[0]);
//                System.out.println("The finally statement is executed");
//            }
//        }
//}

public class exceptionhandling {
    // Java program to demonstrate working of throws
    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args)
    {
        try {
            fun();
        }
        catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        }
    }
}



