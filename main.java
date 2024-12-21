
import static java.lang.StrictMath.incrementExact;
import static java.lang.StrictMath.random;

import java.util.InputMismatchException;
import java.util.Scanner;

class main {

    public static void main(String[] args) {
     

        Scanner index = new Scanner(System.in);

        boolean test = true;

        while (test) {
            System.out.println("************************************************");
            System.out.println("*             progrem interface                *");
            System.out.println("************************************************");
            System.out.println("Enter for add                    -->  1 ");
            System.out.println("Enter for search                 -->  2 ");
            System.out.println("Enter for edit data child        -->  3 ");
            System.out.println("Enter for view information       -->  4 ");
            System.out.println("Enter for delete data child      -->  5 ");
            System.out.println("Enter for information parent     -->  6 ");
            System.out.println("Enter for exit progrem           -->  7 ");
            System.out.println(" ");

            System.out.println("Enter the number ");
            int number = 0 ;
            try {

                number = index.nextInt();

            } catch (InputMismatchException er) {

                System.out.println(" Enter number please as 1  , 2 , 3");

            }

            switch (number) {
                case 1:
                    boolean test1 = true;
                    while (test1) {
                        System.out.println("Enter for add data child   --> 1");
                        System.out.println("Enter for add date teacher --> 2");
                        System.out.println("Enter for exit             --> 3");
                        System.out.println("   ");
                        System.out.println("Enter the number ");
                        int number1 = index.nextInt();
                        switch (number1) {

                            case 1:

                                child.addchild_infromation(index);

                                break;

                            case 2:
                                teacher.addchild_infromation(index);

                                break;
                            case 3:
                                test1 = false;
                                break;

                        }
                    }
                case 2:
                    boolean test3 = true;
                    while (test3) {
                        System.out.println("Enter for search child   --> 1");
                        System.out.println("Enter for search teacher --> 2");
                        System.out.println("Enter for exit           --> 3");
                        System.out.println(" ");
                        System.out.println("Enter the number");
                        int num = index.nextInt();

                        switch (num) {
                            case 1:
                                System.out.println("Enter id");
                                String id = index.next();
                                child.search_child(id);

                                break;
                            case 2:
                                System.out.println("Enter id");
                                String id1 = index.next();
                                teacher.search_teacher(id1);
                                break;
                            case 3:
                                test3 = false;
                                break;
                        }

                    }

                    break;

                case 3:

                    System.out.println("Enter the  id ");

                    String idb = index.next();

                    child.edit_data(idb, index);

                    break;
                case 4:
                    boolean test4 = true;
                    while (test4) {
                        System.out.println("Enter for information child  -->  1");
                        System.out.println("Enter for information teacher --> 2");
                        System.out.println("Enter for exit                --> 3");
                        System.out.println(" ");
                        System.out.println("Enter the number");
                        int number3 = index.nextInt();
                        switch (number3) {
                            case 1:
                                System.out.println("Enter the id ");
                                String id6 = index.next();
                                child.all_information(id6);
                                break;
                            case 2:
                                System.out.println(" Enter the id ");
                                String id9 = index.next();
                                teacher.all_informationt(id9);

                                break;
                            case 3:

                                test4 = false;

                                break;
                        }
                    }

                    break;
                case 5:
                    boolean test5 = true;
                    while (test5) {
                        System.out.println("Enter for delete child   --> 1");
                        System.out.println("Enter for delete teacher --> 2");
                        System.out.println("Enter for exit           --> 3");
                        System.out.println(" ");
                        System.out.println("Enter the number ");
                        int number4 = index.nextInt();
                        switch (number4) {
                            case 1: try{
                                     System.out.println("Enter the id ");
                                     String id = index.next();
                                     child.delete_child(id);
                                       }catch(Exception er){}


                                break;
                            case 2:   try{
                                         System.out.println("Enter the id");
                                         String id0 = index.next();
                                         teacher.delete_teacher(id0);
                                         }catch(Exception er){}

                                break;
                            case 3:
                                test5 = false;

                                break;

                        }
                    }

                    break;
                case 6:
                 boolean test6 = true  ;
                 while (test6) {
                    System.out.println("Entre for add data parent              --> 1");
                    System.out.println("Enter for all information about parant --> 2");
                    System.out.println("Enter for pay the money                --> 3");
                    System.out.println("Enter for exit progrem                 --> 4");
                    System.out.println("  ");
                    System.out.println("Enter number please ......");
                    int number5= index.nextInt();
                    switch (number5) {
                        case 1: 
                                parent.add_data_parent(index);
                            
                            break;
                        case 2: 
                                System.out.println( " Enter id ");
                                String id = index.next();
                                parent.all_data(id);

                            break;
                        case 3:
                              System.out.println( " inter id child");
                              String idm = index.next();
                              System.out.println("******    you are within the payment process     *******");
                              System.out.println(" ");
                              child.searchname(idm);parent.search1(idm);
                              parent parent1=new parent();
                              parent1.paying(idm, index);

                            break;
                        case 4:
                                test6 = false ; 
                            break;
                    
                        
                    }
                 }
                  

                    break;
                case 7:
                      System.exit(0);
                                     break;
                 

            }
        }

    }
}
