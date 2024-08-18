import java.util.*;

public class LS1 {

    public static void main(String[] args) {

        HashMap<Student, List<Course>> enrollmentMap = new HashMap<>();
        Student student1 = new Student("S1", null);
        Student student2 = new Student("S2", null);
        Student student3 = new Student("S3", null);
        Student student4 = new Student("S4", null);

        System.out.println("Test");

        List<Course> courseList1 = new ArrayList<>();
        courseList1.add(new Course("C1", null));
        courseList1.add(new Course("C2", null));
        courseList1.add(new Course("C3", null));
        courseList1.add(new Course("C4", null));

        List<Course> courseList2 = new ArrayList<>();
        courseList1.add(new Course("C2", null));
        courseList1.add(new Course("C4", null));
        courseList1.add(new Course("C7", null));
        courseList1.add(new Course("C9", null));

        List<Course> courseList3 = new ArrayList<>();
        courseList1.add(new Course("C2", null));
        courseList1.add(new Course("C8", null));
        courseList1.add(new Course("C11", null));

        List<Course> courseList4 = new ArrayList<>();
        courseList1.add(new Course("C5", null));
        courseList1.add(new Course("C6", null));
        courseList1.add(new Course("C7", null));
        courseList1.add(new Course("C2", null));
        courseList1.add(new Course("C9", null));

        enrollmentMap.put(student1, courseList1);
        enrollmentMap.put(student2, courseList2);
        enrollmentMap.put(student3, courseList3);
        enrollmentMap.put(student4, courseList4);

       // System.out.println("Test2");

        HashMap<Course, Integer> uniqueCommonCourses = new HashMap<Course, Integer>();

        for (List<Course> courseList : enrollmentMap.values()) {
           // System.out.println("Test3");
            for (Course course : courseList) {
                //System.out.println("Test4");
                if (uniqueCommonCourses.containsKey(course)) {
                    uniqueCommonCourses.put(course, uniqueCommonCourses.get(course) + 1);
                    System.out.println(course);
                } else {
                    uniqueCommonCourses.put(course, 1);
                }
            }
        }

        System.out.println(Arrays.toString(new HashMap[]{uniqueCommonCourses}));


    }

}

class Student {

    String name;
    Integer id;

    Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
}


class Course {
    String name;
    Integer id;

    Course(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


}



   /* university which has students like below
S1, S2, S3, S4. ....SN

        And Each of the Students can opt as many courses as they like which would be like below
        S1 -> C1, C2, C3, C4
        S2 -> C2, C4, C7, C9
        S3 -> C2, C8, C11
        S4 -> C5, C6, C7, C2, C9*/
