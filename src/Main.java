import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kiên", 20, "Hà Nội");
        Student student1 = new Student("Hải", 31, "Hà Tĩnh");
        Student student2 = new Student("Hồng", 33, "Phú thọ");
        Student student3 = new Student("Nam", 23, "Vĩnh Phúc");
        Student student4 = new Student("Vân", 25, "Phú Yên");

        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);

        System.out.println();

        for (Student st: list){
            System.out.println(st.toString());
        }
        AgeComparable ageComparable = new AgeComparable();
        Collections.sort(list,ageComparable);
        System.out.println("\t So sánh theo tuổi: ");
        for (Student st: list){
            System.out.println(st.toString());
        }





    }
}