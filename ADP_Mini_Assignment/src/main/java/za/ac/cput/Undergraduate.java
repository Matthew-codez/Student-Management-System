package za.ac.cput;

public class Undergraduate extends Student {

    private int creditHours;
    private double scholarshipAmount;

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

        return 0;
    }

    @Override
    public String getStudentType() {

        return null;
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

        public Builder setStudentName(String name) {
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
        public Undergraduate build(){
            return new Undergraduate(this);
        }


    }
}
