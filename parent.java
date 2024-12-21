import static java.lang.StrictMath.abs;

import java.util.ArrayList;
import java.util.Scanner;

public class parent extends person {
   
   static ArrayList <parent> listparent = new ArrayList<>();

   private String id ;

   private String adress ;
   
   private String profession ;

   private String any_information ;

   private double expenses = 3000;

   private double payments = 0;



   public parent(){


   }

public parent(String address, String profession, String any_information) {
    this.adress = address;
    this.profession = profession;
    this.any_information = any_information;
}

public parent(String name, int age, String gmail, String phone, String address, String profession,
        String any_information) {
    super(name, age, gmail, phone);
    this.adress = address;
    this.profession = profession;
    this.any_information = any_information;
}

public String getAddress() {
    return adress;
}

public void setAddress(String address) {
    this.adress = address;
}

public String getProfession() {
    return profession;
}


public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public void setProfession(String profession) {
    this.profession = profession;
}

public String getAny_information() {
    return any_information;
}

public void setAny_information(String any_information) {
    this.any_information = any_information;
}


 public static void add_data_parent(Scanner index){
     System.out.println("Enter id of child ");
     String id = index.next();
     System.out.println("Enter name  -> parent ");
     String name = index.next();
     System.out.println("Enter  gmail  -> gmail  ");
     String gmail = index.next();
     System.out.println("Enter age -> parent ");
     int age = index.nextInt();                                                        
     System.out.println("Enter phone -> parent ");
     String phone = index.next();
     System.out.println("Enter adress -> parent ");
     String adress = index.next();
     System.out.println("Enter  profession -> parent ");
     String profession = index.next();
     System.out.println("Enter any information ->parent ");
     parent parent_now = new parent();
     parent_now.setId(id);
     parent_now.setAddress(adress);
     parent_now.setAge(age);
     parent_now.setPhone(phone);
     parent_now.setProfession(profession);
     parent_now.setName(name);
     parent_now.setGmail(gmail);
     listparent.add(parent_now);
     System.out.println("      ***** Successful Operation *****      ");
     System.out.println(" ");



 }
 public static void all_data(String id){
     for (parent parent_id : listparent) {

         if (parent_id.getId().equals(id)) {

            System.out.println("name        : " + parent_id.getName() +  "  age         : " + parent_id.getAge() );
            System.out.println("gmail       : " + parent_id.getGmail() + "  phone       : " + parent_id.getPhone());
            System.out.println("adress      : " + parent_id.getAddress()+"  parefession : " + parent_id.getProfession());
            System.out.println("information : " + parent_id.getAny_information());
            System.out.println(" ");
            
            System.out.println("------------------------------------------------------------------------------");
         } else {

             System.out.println("the parent is not found");

         }
     }
 }
 public  void paying(String id , Scanner index){

    try{

     for (parent parent_id : listparent) {

         if (parent_id.getId().equals(id)) {


             System.out.println("Enter amount the money");
              payments  = index.nextDouble();
             if (payments > 3000) {

                 System.out.println("the amount money is greater than 3000");
                 System.out.println("");
                 System.out.println("not : Payment is the largest 3000 and less than 1000");

             } else if (payments < 1000) {

                 System.out.println("the amount money less than 1000");
                 System.out.println(" ");
                 System.out.println("not : Payment is the largest 3000 and less than 1000");


             } else {

                 expenses -= payments;

                 System.out.println(" the remaining expenses  = " + expenses + "  the  paymentes = " + payments);
                 System.out.println(" ");
                 System.out.println("*****       Successful Operation      ******");

             }
        
             System.out.println("------------------------------------------------------------------------------  ");
         } else {

             System.out.println("the child is not found");

         }
     }
    }catch(Exception er){

        System.out.println("the payments is integer number ");

    }
 }

@Override
public String toString() {
    return "parent [address=" + adress + ", profession=" + profession + ", any_information=" + any_information
            + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getGmail()=" + getGmail() + ", getPhone()="
            + getPhone() + "]";
}
public static void search1(String id){
     for (parent parent_id : listparent) {

         if (parent_id.getId().equals(id)) {

            
             System.out.println(parent_id.getName());
           
        
         } else {

     

         }
     }
     
    }
 
}
