package za.ac.cput;

public class Graduate extends Student {

    private boolean researchAssistant;
    private double stipend;

    private Graduate (Builder builder){
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;

        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }
    @Override
    public double calculateTuition(){
        return 0;
    }

    @Override
    public String getStudentType(){
        return null;
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("Graduate");
        System.out.println("ID: " + studentId);
        System.out.println("Student Name: " + name);
        System.out.println("Student Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Research Assistant: " + researchAssistant);
        System.out.println("Stipend: " + stipend);

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

        public Graduate build(){
                return new Graduate(this);
            }
        }
    }

