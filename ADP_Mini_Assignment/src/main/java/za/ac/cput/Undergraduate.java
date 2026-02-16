package za.ac.cput;

public class Undergraduate extends Student {

    private int creditHours;
    private double scholarshipAmount;

    public int getCreditHours() {
        return creditHours;
    }

    public double getScholarshipAmount() {
        return scholarshipAmount;
    }

    private Undergraduate(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;

        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        double tuition = creditHours * 250;
        return tuition - scholarshipAmount;
    }

    @Override
    public String getStudentType() {

        return "Undergraduate";
    }

    @Override
    public void displayStudentDetails(){
        System.out.println("-----------------------------------------");
        System.out.println(getStudentType());
        System.out.println("ID: " + studentId);
        System.out.println("Student Name: " + name);
        System.out.println("Student Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Scholarship Amount: " + scholarshipAmount);
        System.out.println("Tuition Fee: R" + calculateTuition());
        System.out.println("-----------------------------------------\n");
    }

    //Builder
    public static class Builder {
        protected String studentId;

        protected String name;
        protected String email;
        protected String department;

        private int creditHours;
        private double scholarshipAmount;

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setCreditHours(int creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public Builder setScholarshipAmount(double scholarshipAmount){
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }
        public Builder copy(Undergraduate ungrad){
            this.studentId = ungrad.studentId;
            this.name = ungrad.name;
            this.email = ungrad.email;
            this.department = ungrad.department;
            this.creditHours = ungrad.creditHours;
            this.scholarshipAmount = ungrad.scholarshipAmount;
            return this;
        }

        public Undergraduate build(){
            return new Undergraduate(this);
        }
    }
}
