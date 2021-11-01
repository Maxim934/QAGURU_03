package maxim.kim;

public class Peron {
    int age;
    String gender;
    boolean educated;
    String name;
    String surname;
    boolean workless;

    public Peron(int age, String gender, boolean educated, String name, String surname) {
        this.age = age;
        this.educated = educated;
        this.gender = gender;
        this.name = name;
        this.surname = surname;
    }

    void hireToWork(String answer) {
        if (this.educated == true) {
            workless = false;
            System.out.println(name + " " + surname + " is hired to work");
        } else{
            System.out.println("ask some question if yes hire");
            if (answer == "yes") {
                workless = false;
            } else {
                workless = true;
            }
        }
    }

    public String toString() {
        if (this.workless == false) {
            System.out.println(name + " " + surname +"\n" + "age: " + age +"\n" +  "gender: " + gender + " is hired to work");
            return null;
        } else {
            System.out.println(name + " " + surname +"\n" + "age: " + age +"\n" +  "gender: " + gender + " is not hired to work");
        }
        return null;
    }

}
