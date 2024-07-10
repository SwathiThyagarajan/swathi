package Assignments.OOPs_mini_project;

public class RunnerClass {
    public static void main(String[] args) {

        Students ankitha = new Students();
        ankitha.name = "Ankitha";
        ankitha.age = 28;
        ankitha.id = "Atb308";
        ankitha.DOB = "20/05/1990";
        ankitha.email = "ankitha@gmail.com";
        ankitha.ph_no = "9885325545";
        ankitha.background = "Mechanical Engineering";
        System.out.println(ankitha.name);
        System.out.println(ankitha.age);
        System.out.println(ankitha.id);
        System.out.println(ankitha.DOB);
        System.out.println(ankitha.email);
        System.out.println(ankitha.ph_no);
        System.out.println(ankitha.background);
        System.out.println();


        Students rahul = new Students();
        rahul.name = "Rahul";
        rahul.age = 35;
        rahul.id = "Atb305";
        rahul.DOB = "10/08/1989";
        rahul.email = "rahul45@gmail.com";
        rahul.ph_no = "9885325512";
        rahul.background = "MBA Non IT";
        System.out.println(rahul.name);
        System.out.println(rahul.age);
        System.out.println(rahul.DOB);
        System.out.println(rahul.email);
        System.out.println(rahul.ph_no);
        System.out.println(rahul.background);
        System.out.println();


        Students jaya = new Students();
        jaya.name = "Jaya";
        jaya.age = 32;
        jaya.id = "Atb310";
        jaya.DOB = "29/10/1992";
        jaya.email = "jaya05@gmail.com";
        jaya.ph_no = "9886225512";
        jaya.background = "B com Non IT";
        System.out.println(jaya.name);
        System.out.println(jaya.age);
        System.out.println(jaya.id);
        System.out.println(jaya.DOB);
        System.out.println(jaya.email);
        System.out.println(jaya.ph_no);
        System.out.println(jaya.background);

        Course course_info = new Course();
        course_info.Batch = "06";
        course_info.courseCode = "AT_Java.Selenium";
        course_info.courseName ="Automation Testing with Java and Selenium";
        course_info.enrolledStudents = new String[]{"Jaya, Ankitha, Rahul", "Pramod","Surya","vaishali"};
        course_info.instructor = "Pramod Dutta";
        course_info.schedule ="Tuesday, Thursday Morning 7AM to 8:30 AM, Saturday Morning 7AM to 9:00 AM ";
        course_info.studentCount = 508;

        Course course2_info = new Course();
        course2_info.Batch = "03";
        course2_info.courseCode = "AT_Python.Selenium";
        course2_info.courseName ="Automation Testing with Python and Selenium";
        course2_info.enrolledStudents = new String[]{"Jaya, Ankitha, Rahul", "Pramod","Surya","vaishali", "Anand","Praveen","Nethra"};
        course2_info.instructor = "Pramod Dutta";
        course2_info.schedule ="Monday, Wednesday Morning 7AM to 8:30 AM, Friday Morning 7AM to 9:00 AM ";
        course2_info.studentCount = 250;

        Course course3_info = new Course();
        course3_info.Batch = "05";
        course3_info.courseCode = "AT_Python";
        course3_info.courseName ="Automation Testing with Python";
        course3_info.enrolledStudents = new String[]{"Jaya, Ankitha, Rahul", "Pramod","Surya","vaishali", "Anand","Praveen","Nethra"};
        course2_info.instructor = "Pramod Dutta";
        course_info.schedule =" Monday, Wednesday Evening 7PM to 8:30 PM, Friday Evening 7PM to 9:00 PM  ";
        course3_info.studentCount = 300;

        Payment payment_info = new Payment();
        payment_info.studentId = "Atb310";
        payment_info.paymentDate = "30/01/2024";
        payment_info.amount = 9999;
        payment_info.paymentMethod = "UPI -> Googlepay";

        Payment payment2_info = new Payment();
        payment2_info.studentId = "Atb305";
        payment2_info.paymentDate = "25/01/2024";
        payment2_info.amount = 12500;
        payment2_info.paymentMethod = "Credit Card";

        Payment payment3_info = new Payment();
        payment3_info.studentId = "Atb319";
        payment3_info.paymentDate = "28/01/2024";
        payment3_info.amount = 9999;
        payment3_info.paymentMethod = "Debit Card, EMI";
    }
}
