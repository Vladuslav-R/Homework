

public class Human {


    private String name;
    private String surname;
    private int yearOfBirth;
    private int group;
    private String faculty;


    public String getName() {
        return name;
    }

    public void setName(String newName) {
         name = newName;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String newSurname) {

        surname = newSurname;
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }


    public void setBirthday(int newYearOfBirth) {
        yearOfBirth = newYearOfBirth;
    }

    public int getGroup() {

        return group;
    }

    public void setGroup(int groupNumber) {

        group = groupNumber;
    }


    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String facultyName) {
        faculty = facultyName;
    }


    public Human(String name, String surname, int yearOfBirth, int group, String faculty) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.faculty = faculty;
        this.group = group;

    }
}

