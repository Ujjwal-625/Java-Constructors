public class Person {
    String name;
    int age;
    char gender;

    Person(String name,int age ,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    Person(Person p){
        this.name=p.name;
        this.age=p.age;
        this.gender=p.gender;
    }

    public static void main(String[] args) {
        Person p1=new Person("ABC",24,'M');

        Person p2=new Person(p1);
    }

}
