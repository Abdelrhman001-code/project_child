public class person {
     
    private String name ;

    private int age ; 

    private String gmail ;

    private String phone  ;

    public person (){

    }
    public person(String name , int age , String gmail , String phone){

        this.name  = name ; 
        this.age = age ; 
        this.gmail =  gmail ; 
        this.phone = phone ;
    }
    public String getName() {
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
    public String getGmail() {
        return gmail;
    }
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
