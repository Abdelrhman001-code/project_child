import static java.lang.StrictMath.incrementExact;

import java.util.ArrayList;
import java.util.Scanner;

public class child  extends parent{

    static ArrayList<child> childlist = new ArrayList<>();

    private static int key_id = 0;

    private String name;

    private int age;

    private String id;

    private String brith;

    private String season;

    private String genter;

    public child(int b) {

    }

    public child() {
        this.key_id += 1;

        this.id = "2024" + this.key_id;

    }

    public child(String name, int age, String brith, String season, String genter) {
        this.name = name;
        this.age = age;
        this.brith = brith;
        this.season = season;
        this.genter = genter;

    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getBrith() {
        return brith;
    }

    public void setBrith(String brith) {
        this.brith = brith;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getGenter() {
        return genter;
    }

    public void setGenter(String genter) {
        this.genter = genter;
    }

    public static void addchild_infromation(Scanner index) {
        child add_Child = new child();
        System.out.println("Enter all data about child ");
        System.out.println(" ");
        System.out.println("Enter the name of child ");
        String name = index.next();
        System.out.println("Enter the age child ");
        int age = index.nextInt();
        System.out.println("Enter the brith ");
        String brith = index.next();
        System.out.println("Enter the season Winter or Summer ");
        String season = index.next();
        System.out.println("Enter the genter  Male or female ");
        String genter = index.next();
        add_Child.setName(name);
        add_Child.setAge(age);
        add_Child.setBrith(brith);
        add_Child.setSeason(season);
        add_Child.setGenter(genter);
        child.childlist.add(add_Child);
        System.out.println("      ***** Successful Operation *****      ");

    }

    public static void search_child(String id) {

        for (child child_id : childlist) {

            if (child_id.getId().equals(id)) {

                System.out.println("the child is found");

            } else {

                System.out.println("the child is not found");

            }

        }
    }

    public static void edit_data(String id4, Scanner index) {

        for (child child_id : childlist) {

            if (child_id.getId().equals(id4)) {
                System.out.println("Enter for edit name  --> 1");
                System.out.println("Enter for edit age   --> 2");
                System.out.println("Enter for edit brith --> 3");
                System.out.println("Enter for edit season--> 4");
                System.out.println("Enter for edit genter--> 5");
                int n = index.nextInt();

                if (n == 1) {
                    System.out.println("Enter the now name ");

                    String name_now = index.next();

                    child_id.setName(name_now);

                    System.out.println("*****       Successful Operation      ******");

                } else if (n == 2) {
                    System.out.println("Enter the now age ");

                    int age_now = index.nextInt();

                    System.out.println("*****       Successful Operation      ******");

                } else if (n == 3) {
                    System.out.println("Enter the now brith ");

                    String brith_now = index.next();

                    System.out.println("*****       Successful Operation      ******");

                } else if (n == 4) {
                    System.out.println("Enter the now seadon ");

                    String season_now = index.next();

                    System.out.println("*****       Successful Operation      ******");

                } else if (n == 5) {
                    System.out.println("Enter the gender ");

                    String genter_now = index.next();

                    System.out.println("*****       Successful Operation      ******");

                }

            } else {

                System.out.println("the child is not found");

            }

        }

    }

    public static void all_information(String id) {

        for (child child_id : childlist) {

            if (child_id.getId().equals(id)) {

                System.out.println(" name : " + child_id.getName() + "   age  : " + child_id.getAge());
                System.out.println("  ");
                System.out.println(" brith : " + child_id.getBrith() + "  season  :" + child_id.getSeason());
                System.out.println("  ");
                System.out.println("gender :" + child_id.getGenter() + " id  :" + child_id.getId());

                System.out.println("------------------------------------------------------------------------------  ");
            } else {

                System.out.println("the child is not found");

            }
        }
    }
    public static void delete_child(String id){

        for (child child_id : childlist) {

            if (child_id.getId().equals(id)) {

                 childlist.remove(child_id);
                 System.out.println("*****       Successful Operation      ******");   

            } else {

                System.out.println("the child is not found");

            }
        }
    }
    
    public static void searchname(String id) {

        for (child child_id : childlist) {

            if (child_id.getId().equals(id)) {

                 System.out.print( "name child :"  + child_id.getName() + " ");

            } else {


            }

        }
    }
}