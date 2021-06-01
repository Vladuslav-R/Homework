public class University {
    public static void main(String[] args) {
             Student people = new Student();
            // people [0].name = Vasya;
           //  people [0] = new Student();
       // people [0].birthday = 10;
        people.birthday=10;

        System.out.println(people.birthday);
    }

    public class Student {
        int id;
        String name ;
        String surname;
        int telNumber;
        int birthday;
        String faculty;
        int group;
        int course;
    }

}
