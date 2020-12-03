
public class app
{
    public static void main(String args[])
    {
        //Object for Student 1
        student student1 = new student("Jenna", "Plots", 20, 3.556);
        
        //Object for Student 2
        student student2 = new student("Henry", "Boots", 23, 3.223);
        
        //Object for Student 3
        student student3 = new student("Kelsie", "Hampstead", 19, 3.832);

        //Print Overall Class Information
        System.out.println("Class Statistics:");
        System.out.println("Total Student's in Section and Class: 3");
        
        //Find Highest GPA Student
        if(student1.getGPA() >= student2.getGPA())
            {
                if(student1.getGPA() >= student3.getGPA())
                    System.out.println("Student with the Highest GPA: " + student1.getName() + " (GPA: " + student1.getGPA() + ")");
                
                else
                    System.out.println("Student with the Highest GPA: " + student3.getName() + " (GPA: " + student3.getGPA() + ")");
            }

        else
            {
            if(student2.getGPA() >= student3.getGPA())
                System.out.println("Student with the Highest GPA: " + student2.getName() + " (GPA: " + student2.getGPA() + ")");

            else
                System.out.println("Student with the Highest GPA: " + student3.getName() + " (GPA: " + student3.getGPA() + ")");
            }
        
        //Find Lowest GPA Student
        if(student1.getGPA() <= student2.getGPA())
            {
                if(student1.getGPA() <= student3.getGPA())
                    System.out.println("Student with the Lowest GPA: " + student1.getName() + " (GPA: " + student1.getGPA() + ")");
                
                else
                    System.out.println("Student with the Lowest GPA: " + student3.getName() + " (GPA: " + student3.getGPA() + ")");
            }

        else
            {
                if(student2.getGPA() <= student3.getGPA())
                    System.out.println("Student with the Lowest GPA: " + student2.getName() + " (GPA: " + student2.getGPA() + ")");
                
                else
                    System.out.println("Student with the Lowest GPA: " + student3.getName() + " (GPA: " + student3.getGPA() + ")");
            }
        
        System.out.println("");
        
        //Print Student 1 Info
        System.out.println("Student 1's Information:");
        System.out.println("Student's Complete Record: " + student1.getInfo());
        System.out.println("Student's Full Name: " + student1.getName());
        System.out.println("Student's First Name: " + student1.getfirstName());
        System.out.println("Student's Last Name: " + student1.getlastName());
        System.out.println("Student's Age: " + student1.age);
        System.out.println("Student's GPA: " + student1.gpa);
        System.out.println("");
        
        //Print Student 2 Info
        System.out.println("Student 2's Information:");
        System.out.println("Student's Complete Record: " + student2.getInfo());
        System.out.println("Student's Full Name: " + student2.getName());
        System.out.println("Student's First Name: " + student2.getfirstName());
        System.out.println("Student's Last Name: " + student2.getlastName());
        System.out.println("Student's Age: " + student2.age);
        System.out.println("Student's GPA: " + student2.gpa);
        System.out.println("");
        
        //Print Student 3 Info
        System.out.println("Student 3's Information:");
        System.out.println("Student's Complete Record: " + student3.getInfo());
        System.out.println("Student's Full Name: " + student3.getName());
        System.out.println("Student's First Name: " + student3.getfirstName());
        System.out.println("Student's Last Name: " + student3.getlastName());
        System.out.println("Student's Age: " + student3.age);
        System.out.println("Student's GPA: " + student3.gpa);
    }
}
