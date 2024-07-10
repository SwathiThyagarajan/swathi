package MAY.ex_30052024_Linked_List;
import java.util.Comparator;

class SortByIdAscending implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class SortByIdDescending implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}

class SortByNameAscending implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByNameDescending implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

public class  Student implements Comparable<Student> { // overide a function compare to


    // In student class every student has Id and Name
    Integer id;
    String name;


    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // To print the student override the toString method

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }// toString is a method available in Object class used to print all the data varibles
    // it can also be used to convert anything into string

    // Override compareTo method for comparison based on student id
//    @Override
//    public int compareTo(Student o) {
//        return Integer.compare(this.id, o.id); // here o represents student id
//    }
    @Override
    public int compareTo(Student o) {
        return CharSequence.compare(this.name, o.name); // not allowed only 1 overide method at a time
    }

}

