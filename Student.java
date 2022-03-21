public class Student {
    /*
    Student Sınıfı Özellikleri :

Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()*/


    Course c1;
    Course c2;
    Course c3;
    String name;
    int stuNo;
    String classes;
    double avarage;
    boolean isPass;

     Student(String name,int stuNo,String classes,Course c1,Course c2,Course c3){
         this.name=name;
         this.classes=classes;
         this.stuNo=stuNo;
         this.c1=c1;
         this.c2=c2;
         this.c3=c3;
         this.avarage=0.0;
         this.isPass=false;
     }
     void addBulkExamNote(int not1,int not2,int not3){
         if((not1>0)&&(not1<100)){
        c1.note=not1;
         }
         if((not2>0)&&(not2<100)){
             c2.note=not2;
         }
         if((not3>0)&&(not3<100)){
             c3.note=not3;

         }



     }

}
