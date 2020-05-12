package hw22;

public class HW22 {

    public static void main(String[] args) {

        Person igor = new Person();
        igor.displayName();
        igor.displayAge();

        Person vasya = new Person();
        vasya.displayName();
        vasya.displayAge();

        Person vova = new Person();
        vova.displayName();
        vova.displayAge();
            }
}
 class Person{
            String name;
            int age;

            Person(){

            }
            Person(String n){
                name = n;

            }
            Person(String x, int y){
                name = x;
                age = y;

            }


            public void displayName(){
                System.out.println(name);
            }
            public void displayAge() {
                System.out.println(age);
            }





    }

