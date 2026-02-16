# Student-Management-System

# SRP (Single Responsibility Principle) 

def. A class should only have one reason to change

1. The Builder classes only collect student data and handles Undergraduate or Graduate student object construction
   
ex. Undergraduate
```Java
    private Undergraduate(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }
    public Undergraduate build(){
            return new Undergraduate(this);
```
ex Graduate
```Java
    private Graduate (Builder builder){
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;

        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }
     public Graduate build(){
                return new Graduate(this);
            }
```

2. The Undergraduate and Graduate class only handles undergraduate and Graduate student logic/behavior

 ex. Undergraduate
```Java
    public class Undergraduate extends Student {

    private int creditHours;
    private double scholarshipAmount;

    public int getCreditHours() {
        return creditHours;
    }

    public double getScholarshipAmount() {
        return scholarshipAmount;
    }

```

 ex. Graduate
```Java
    public class Graduate extends Student {

    private boolean researchAssistant;
    private double stipend;

    public boolean isResearchAssistant() {
        return researchAssistant;
    }

    public double getStipend() {
        return stipend;
    }
```

# OCP (Open/Closed Principle)
def. Software entities should be open for extension but closed for modification.

1. I can modify and add new student types without changing existing code example I can add partime students without touching the student code.
   
2. The parent class student provides the foundation for all the other subclasses and then Undergraduate and Graduate extends the student class and adds its additional fields

ex. Student
```Java
    public abstract class Student {

    protected String studentId;

    protected String name;

    protected String email;

    protected String department;

    public abstract double calculateTuition();

    public abstract String getStudentType();
    public void displayStudentDetails(){

    }
```

ex. Graduate
```Java
    public class Graduate extends Student {
    ...
```

ex. Undergraduate
```Java
    public class Undergraduate extends Student {
    ...
```
