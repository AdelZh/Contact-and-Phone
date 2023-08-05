import java.util.concurrent.Callable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


       Contact contact=new Contact("Adel", 23456);
       Contact contact1=new Contact("Faria", 34567);
       Contact contact2=new Contact("Alina", 45678);
       Contact contact3=new Contact("Elina", 45678);

       Contact [] contacts={contact, contact1, contact2, contact3};
       Contact [] contacts1={contact,contact1, contact2};

       Phone phone=new Phone("Iphone", "14pro", 45, "Eliza", contacts);
       Phone phone1=new Phone("Samsung", "A15", 55, "Aziz",contacts1);






        System.out.println(phone.getPhoneUserName());
        System.out.println(phone.getContactCount(phone));
        phone.getAll();
        System.out.println("---------------------------");
        System.out.println(phone1.getPhoneUserName());
        System.out.println(phone1.getContact(phone1));
        phone1.getAll();

    }
}