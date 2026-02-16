package za.ac.cput;

public class Main {
    public static void main(String[] args) {

        Undergraduate st1 = new Undergraduate.Builder()
                .setStudentId("0511022819942")
                .setName("Matthew Ferreira")
                .setEmail("mattehw365@gmail.com")
                .setDepartment("IT")
                .setCreditHours(120)
                .setScholarshipAmount(15000)
                .build();

        st1.displayStudentDetails();

        Undergraduate st2 = new Undergraduate.Builder()
                .setStudentId("0501055589012")
                .setName("Fred Du Toit")
                .setEmail("FredDuToit@gmail.com")
                .setDepartment("IT")
                .setCreditHours(120)
                .setScholarshipAmount(0.0)
                .build();

        st2.displayStudentDetails();

        Graduate st3 = new Graduate.Builder()
                .setStudentId("0312022814442")
                .setName("James Gordon")
                .setEmail("JamesGordon12@gmail.com")
                .setDepartment("Culinary Arts")
                .setResearchAssistant(true)
                .setStipend(10000)
                .build();


        st3.displayStudentDetails();

        Graduate st4 = new Graduate.Builder()
                .setStudentId("0312022814442")
                .setName("Kyle Lewis")
                .setEmail("KyleLewis123@gmail.com")
                .setDepartment("Physics")
                .setResearchAssistant(false)
                .setStipend(0)
                .build();

        st4.displayStudentDetails();

        Graduate st5 = new Graduate.Builder()
                .setStudentId("0312022814442")
                .setName("Luke Webster")
                .setEmail("LukeWebster1@gmail.com")
                .setDepartment("Psychology")
                .setResearchAssistant(false)
                .setStipend(10000)
                .build();


        st5.displayStudentDetails();
    }

}
