public class Rooster{

    private String name;

    private int age;



    public Rooster(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){

        if(name.length() > 0){

            this.name = name;

        }

    }

    public String getName(){

        return name;

    }


    public void setAge(int age){

        if(age >=0){

            this.age = age;

        }

    }

    public int getAge(){

        return age;

    }




    @Override

    public String toString(){

        return String.format("Name: %s  -  Age: %2d", getName(), getAge());

    }




}


