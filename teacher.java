

import java.util.ArrayList;
import java.util.Scanner;

public class teacher extends person {

    static ArrayList <teacher> teacherlist = new ArrayList<>();

    static private int key_id = 99 ;

    private String id ;

    private String subjet;

    private String hirdate;

    private int salery;

    private double Rating;

    public teacher() {
        key_id +=1 ;
    
        this.id = "2024" + key_id ;

    }

    public teacher(String name, int age, String gmail, String phone, String subjet, String hirdate, int salery,
            double Rating) {
        super(name, age, gmail, phone);
        this.subjet = subjet  ;
        this.hirdate = hirdate ;
        this.salery = salery ;
        this.Rating = Rating ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjet() {
        return subjet;
    }

    public void setSubjet(String subjet) {
        this.subjet = subjet;
    }

    public String getHirdate() {
        return hirdate;
    }

    public void setHirdate(String hirdate) {
        this.hirdate = hirdate;
    }

    public int getSalery() {
        return salery;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double rating) {
        Rating = rating;
    }
     public static void addchild_infromation(Scanner index){
         
        teacher teach = new teacher() ;
        System.out.println("Enter all date about teacher ");
        System.out.println("  ");
        System.out.println("Enter the name ");
        String name = index.next();
        System.out.println("Enter the age ");
        int age =  index.nextInt();
        System.out.println("Enter the gmail ");
        String gmail = index.next();
        System.out.println("Enter the phone number ");
        String phone = index.next();
        System.out.println("Enter the subjet ");
        String subjet = index.next();
        System.out.println("Enter the hirdate");
        String hirdate = index.next();
        System.out.println("Enter the rating 1 for 4 1 ");
        double rating = index.nextDouble();
        teach.setName(name);
        teach.setAge(age );
        teach.setGmail(gmail);
        teach.setPhone(phone);
        teach.setSubjet(subjet);
        teach.setHirdate(hirdate);
        teach.setRating(rating);
        teacherlist.add(teach);
        System.out.println("      ***** Successful Operation *****      ");


     }
     
     public static void search_teacher(String id) {

         for (teacher teacher_id1 : teacherlist) {

             if (teacher_id1.getId().equals(id)) {

                 System.out.println("the child is found");

             } else {

                 System.out.println("the child is not found");

             }

         }
     }
    public static void all_informationt(String id){
        
        for (teacher teacher_id1 : teacherlist) {

            if (teacher_id1.getId().equals(id)) {

          System.out.println("name    : " + teacher_id1.getName() +   "       age  : " + teacher_id1.getAge());
          System.out.println("gmail   : " + teacher_id1.getGmail() +  "       phone : " + teacher_id1.getPhone());
          System.out.println("subjet  : " +teacher_id1.getSubjet()  + "        hairdate : "  + teacher_id1.getHirdate());
          System.out.println("rating  : "   + teacher_id1.getRating());
               

            } else {

                System.out.println("the child is not found");

            }

        }

    }
    public static void delete_teacher(String id){
        for (teacher teacher_id1 : teacherlist) {

            if (teacher_id1.getId().equals(id)) {

                teacherlist.remove(teacher_id1);

                System.out.println("      ***** Successful Operation *****      ");


            } else {

                System.out.println("the teacher  is not found");
                

            }

        }
    }
    

}
