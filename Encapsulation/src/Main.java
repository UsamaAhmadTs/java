//A Java class to test the encapsulated class Account.  
public class Main {
    public static void main(String[] args) {
        //creating instance of Account class
        Account acc=new Account();
        //setting values through setter methods
        acc.setAcc_no(745723864);
        acc.setName("Usama Ahmad");
        acc.setEmail("usama.ahmad@techno-soft.com");
        acc.setAmount(500000f);
        //getting values through getter methods
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }
}  
