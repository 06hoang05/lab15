package lambda;

public class Person {
    private String name;
    private int age;
    public static int compareByName ( Person p1, Person p2){ return  p1.getName().compareTo(p2.getName());}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return name + "-"+ age ;
    }

}
