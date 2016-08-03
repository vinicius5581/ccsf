/**
 * Created by vinicius on 7/1/16.

 Part 1- The Student Class (10 points)

 Write a class called Student. A student is described by:

 a name
 an ID (text-based, such as "A146")
 whether or not tuition is paid
 Write a constructor, getters and setters, and a toString method for this class.

 */
import java.util.*;

public class Student {
    private String name;
    private String id;
    private Boolean tuitionPaid;
    private Scanner scan = new Scanner(System.in);


    public Student(){

    }

    public Student(String name, String id, Boolean tuitionPaid){
        this.name = name;
        this.id = id;
        this.tuitionPaid = tuitionPaid;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setTuitionPaid(Boolean tuitionPaid){
        this.tuitionPaid = tuitionPaid;
    }

    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public Boolean getTuitionPaid(){
        return this.tuitionPaid;
    }

    public String toString(){
        String student = "aaa";

        System.out.printf("Name: %s%n ID: %s%n Tuition Paid: %b%s", getName(), getId(), getTuitionPaid());

        return student;
    }

}
