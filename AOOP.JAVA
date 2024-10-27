abstract class School {
    private String name;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void performOperation();

    public abstract void printEntityDetails();
}


class Teacher extends School {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void perform() {
        System.out.println(getName() + " is teaching " + subject);
    }

    @Override
    public void printEntityDetails() {
        System.out.println("Teacher: " + getName() + ", Subject: " + subject);
    }
}

class Student extends School {
    private int grade;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    @Override
    public void perform() {
        System.out.println(getName() + " is studying");
    }

    @Override
    public void printEntityDetails() {
        System.out.println("Student: " + getName() + ", Grade: " + grade);
    }
}


public class School {
    public static void main(String[] args) {
        SchoolEntity teacher = new Teacher("Mr. Smith", "Math");
        SchoolEntity student = new Student("John Doe", 10);

        SchoolEntity[] entities = {teacher, student};

        for (SchoolEntity entity : entities) {
            entity.printEntityDetails();
            entity.performOperation();
        }
    }
}



