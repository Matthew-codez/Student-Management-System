package za.ac.cput;

public abstract class Student {

    protected String studentId;

    protected String name;

    protected String email;

    protected String department;

    public abstract double calculateTuition();

    public abstract String getStudentType();
    public void displayStudentDetails(){};

    Undergraduate ungrad = new Undergraduate.Builder()
            .setStudentId("0511022819942")
            .setStudentName("Matthew")
            .setEmail("mattehw365@gmail.com")
            .setDepartment("IT")
            .setCreditHours(15)
            .setScholarshipAmount(30000)
            .build();
    graduate
}

