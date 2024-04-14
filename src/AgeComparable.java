import java.util.Comparator;

public  class AgeComparable implements Comparable<Student>, Comparator<Student> {


    public int compare(Student o1, Student o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }


    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
