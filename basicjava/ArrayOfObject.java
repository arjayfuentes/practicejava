class Student {
    int studentId;
    String name;
    int grade;

    
}
class ArrayOfObject {
    public static void main (String a[]) {

       Student student1 = new Student();
       student1.studentId = 1;
       student1.name = "Ariel";
       student1.grade = 87;
       
       Student student2 = new Student();
       student2.studentId = 2;
       student2.name = "Jay";
       student2.grade = 75;
       
       Student student3 = new Student();
       student3.studentId = 3;
       student3.name = "Arjay";
       student3.grade = 98;

       Student students [] = new Student[3];

       students[0] = student1;
       students[1] = student2;
       students[2] = student3;

       //normal  for loop
       for(int counter=0;counter <students.length; counter++) {
            System.out.println("Student "+students[counter].studentId + " : " + students[counter].name + " grade is  " 
                + students[counter].grade);
       }

       //enhanced for loop 
       for(Student student : students) {
        System.out.println("Student " + student.studentId + " : " + student.name + " grade is  " 
        + student.grade);
       }
       

    }
}