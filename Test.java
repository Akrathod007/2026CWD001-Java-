class Student{
    private int roll;
    private String name;
    private int noOfSubject;
   
    void setRoll(int r){
        roll = r;
    }

    int getRoll(){
        return roll;
    }

    void setName(String n){
        name = n;
    }

    String getName(){
        return  name;
    }

    void setNoOfSubject(int nos){
        if(nos <= 0){
            System.out.println("Not Valid");
            return;
        }
        noOfSubject = nos;
    }

    int getNoOfSubject(){
        return noOfSubject;
    }

}

public class Test{
    public static void main(String[] args) {
        Student s = new Student();
        s.setRoll(1);
        System.out.println(s.getRoll());
        s.setName("Ram");
        System.out.println(s.getName());
        s.setNoOfSubject(-5);
        System.out.println(s.getNoOfSubject());
    }
}



