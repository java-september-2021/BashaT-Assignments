public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        System.out.println(project1.getName());
        System.out.println(project1.getDescription());
        System.out.println(project1.elevatorPitch());

        Project project2 = new Project("Wiring.");
        System.out.println(project2.getName());
        System.out.println(project2.getDescription());
        System.out.println(project2.elevatorPitch());

        Project project3 = new Project("Smith", "Contracts");
        System.out.println(project3.elevatorPitch());
        project3.setName("Smith Electric.");
        project3.setDescription("The Major Contracts with Smith Electric.");
        project3.setInitialCost("$25,000");
        System.out.println(project3.getName());
        System.out.println(project3.getDescription());
        System.out.println(project3.getInitialCost());
    }
}
