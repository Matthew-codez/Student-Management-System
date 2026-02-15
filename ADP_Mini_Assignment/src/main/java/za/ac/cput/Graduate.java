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

