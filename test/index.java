abstract class teacher {
    String name;
    String subject;

    public teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void teach() {
        System.out.println(name + " is teaching " + subject);
    }

    abstract public void getSalary();
}

class GraduateTeacher extends teacher{
    public GraduateTeacher(String name, String subject) {
        super(name, subject);
    }

    public void getSalary() {
        double salary = 40000;
        System.out.println(salary + " credited to " + name);
    }
}

class phdTeacher extends teacher{
    int phdStudents;

    public phdTeacher(String name, String subject, int phdStudents) {
        super(name, subject);
        this.phdStudents = phdStudents;
    }

    public void getSalary() {
        double salary = 40000 + (40000 * phdStudents);
        System.out.println(salary + " credited to " + name);
    }

    void teach() {
        System.out.println(name + " is teaching " + subject +"(PHD)");
    }
}

class studentTest {
    public static void main(String[] args) {
        teacher t1 = new GraduateTeacher("Raman", "CS");
        teacher t2 = new phdTeacher("Ravi", "Maths", 2);

        t1.teach();
        t2.teach();

        t1.getSalary();
        t2.getSalary();

    }
}