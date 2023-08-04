//import java.util.*;
//public class CollectionFramework {
//        public static void main(String args[]){
//            ArrayList<String> list=new ArrayList<String>();     //Creating arraylist
//            list.add("usama");//Adding object in arraylist
//            list.add("ali");
//            list.add("umer");
//            list.add("abdullah");
////Traversing list through Iterator
//            Iterator itr=list.iterator();
//            while(itr.hasNext()){
//                System.out.println(itr.next());
//            }
//        }
//    }


//import java.util.*;
//public class CollectionFramework{
//    public static void main(String args[]){
//        LinkedList<String> al=new LinkedList<String>();
//        al.add("usama");
//        al.add("ali");
//        al.add("umer");
//        al.add("abdullah");
//        Iterator<String> itr=al.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//    }
//}


//import java.util.*;
//public class CollectionFramework{
//    public static void main(String args[]){
////Creating HashSet and adding elements
//        HashSet<String> set=new HashSet<String>();
//        set.add("usama");
//        set.add("ali");
//        set.add("ahmad");
//        set.add("abdullah");
////Traversing elements
//        Iterator<String> itr=set.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//    }
//}


// Java program to demonstrate the working of a HashMap
import java.util.*;
public class CollectionFramework {
    public static void main(String[] args)
    {
        // Creating HashMap and adding elements
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "rana");
        hm.put(2, "usama");
        hm.put(3, "ahmad");

        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
