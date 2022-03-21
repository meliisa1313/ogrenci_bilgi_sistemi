/*Course Sınıfı Özellikleri :

Nitelikler : name,code,prefix,note,Teacher
Metotlar : Course() , addTeacher() , printTeacher()*/

public class Course {
    String name;
    int code;
    String prefix;
    int note;
    Teacher teacher;

     Course(String name,int code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
        //this.teacher=teacher;

    }
    void Addteacher(Teacher teacher){
         if(teacher.branch.equals(this.prefix)){
             this.teacher=teacher;
             PrintTeacherInfo();
         }
         else{
             System.out.println("maalesef hoca ile ders ayni bransta degil");
         }

    }
    void PrintTeacherInfo(){
         this.teacher.TeacherInfo();
    }

}

