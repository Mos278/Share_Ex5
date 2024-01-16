public class App {
    public static void main(String[] args) {
       Student stu = new Student.StudentBuilder("test", "Unitest")
       //.setAge(5)
       .build();

       System.out.println(stu);
       
    }
}
