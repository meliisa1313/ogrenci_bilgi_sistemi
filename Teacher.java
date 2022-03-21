/*Nitelikler : name,mpno,branch
Metotlar : Teacher()*/
public class Teacher {
    String name;
    int mpno;
    String branch;

    Teacher(String name,int mpno,String branch) {
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;

    }
    void TeacherInfo(){
        System.out.println("Hocanin ismi :"+this.name);
        System.out.println("hocanin numarasi:"+this.mpno);
        System.out.println("hocanin bransi:"+this.branch);

    }
}
