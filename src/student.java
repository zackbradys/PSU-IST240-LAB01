
public class student {
    //Class Variables for Student's

    String firstName;
    String lastName;
    int age;
    double gpa;

    //Constructor Method for Student's
    public student(String informedFirstName, String informedLastName, int informedAge, double informedGPA) {
        firstName = informedFirstName;
        lastName = informedLastName;
        age = informedAge;
        gpa = informedGPA;
    }

    //Method for Student's Complete Record
    public String getInfo() {
        return "First Name: " + firstName + " / " + "Last Name: " + lastName + " / " + "Age: " + age + " / " + "GPA: " + gpa;
    }

    //Method for Student's Full Name
    public String getName() {
        return firstName + " " + lastName;
    }

    //Method for Student's First Name
    public String getfirstName() {
        return firstName;
    }

    //Method for Student's Last Name
    public String getlastName() {
        return lastName;
    }

    //Method for Student's Age
    public int getAge() {
        return age;
    }

    //Method for Student's GPA
    public double getGPA() {
        return gpa;
    }
}
