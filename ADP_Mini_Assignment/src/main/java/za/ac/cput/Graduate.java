package za.ac.cput;

public class Graduate extends Student {

    private boolean researchAssistant;
    private double stipend;

    public boolean isResearchAssistant() {
        return researchAssistant;
    }

    public double getStipend() {
        return stipend;
    }

    private Graduate (Builder builder){
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;

        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    //Tuition calculation
    @Override
    public double calculateTuition(){
        double tuition = 30000.0;
        if (researchAssistant){
            return 0;
        }else{
            return tuition - stipend;
        }
    }

    //Student type
    @Override
    public String getStudentType(){
        return "Graduate";
    }

    //Display student details
    @Override
    public void displayStudentDetails() {
        System.out.println("-----------------------------------------");
        System.out.println(getStudentType());
        System.out.println("ID: " + studentId);
        System.out.println("Student Name: " + name);
        System.out.println("Student Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Research Assistant: " + researchAssistant);
        System.out.println("Stipend: " + stipend);
        System.out.println("Tuition Fee: " + calculateTuition());
        System.out.println("-----------------------------------------\n");

    }
    public static class Builder {
        protected String studentId;

        protected String name;
        protected String email;
        protected String department;

        private boolean researchAssistant;
        private double stipend;

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setStipend(double stipend) {
            this.stipend = stipend;
            return this;
        }

        public Builder setResearchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder copy(Graduate grad){
             this.studentId = grad.studentId;
             this.name = grad.name;
             this.email = grad.email;
             this.department = grad.department;
             this.researchAssistant = grad.researchAssistant;
             this.stipend = grad.stipend;
             return this;
            }
            public Graduate build(){
                return new Graduate(this);
            }

        }
    }

