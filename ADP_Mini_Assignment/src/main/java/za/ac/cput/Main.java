package za.ac.cput;

public class Main {
    public static void main(String[] args) {

        Undergraduate ungrad = new Undergraduate.Builder()
                .setStudentId("0511022819942")
                .setName("Matthew Ferreira")
                .setEmail("mattehw365@gmail.com")
                .setDepartment("IT")
                .setCreditHours(15)
                .setScholarshipAmount(30000)
                .build();

        ungrad.displayStudentDetails();

        Graduate grad = new Graduate.Builder()
                .setStudentId("0312022814442")
                .setName("James Gordon")
                .setEmail("JamesGordon12@gmail.com")
                .setDepartment("Engineering")
                .setResearchAssistant(true)
                .setStipend(10000)
                .build();

        grad.displayStudentDetails();
    }
}