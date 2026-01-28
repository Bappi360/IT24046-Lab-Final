
class Student {

    
    private int id;
    private String name;
    private double cgpa;

   
    public void setId(int id) {
        this.id = id;
    }

    
    public int getId() {
        return id;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("CGPA must be between 0.0 and 4.0!");
        }
    }

    
    public double getCgpa() {
        return cgpa;
    }
}


public class Main {
    public static void main(String[] args) {

        
        Student student = new Student();

        
        student.setId(101);
        student.setName("Bappi");
        student.setCgpa(3.80);   // valid CGPA

        
        System.out.println("Student Information:");
        System.out.println("ID   : " + student.getId());
        System.out.println("Name : " + student.getName());
        System.out.println("CGPA : " + student.getCgpa());

        
        student.setCgpa(4.5);   // invalid CGPA
    }
}
