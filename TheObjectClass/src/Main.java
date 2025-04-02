public class Main extends Object {
    public static void main(String[] args) {
        Student max = new Student("Max", 21);
        System.out.println(max);
        System.out.println(max.toString());

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);
    }
}
