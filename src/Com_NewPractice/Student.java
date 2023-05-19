package Com_NewPractice;

public class Student {
    int id;
    String name;
    float marks;

    public static Student[] filterbymarks(Student arg[]) {
        Student filter[] = new Student[3];
        int x = 0;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i].marks > 85) {
                filter[x] = arg[i];
                x++;
            }
        }
            return filter;
    }

    public static void main(String[] args) {
        Student arr[]=new Student[4];
        Student s=new Student();
        s.id=1;
        s.name="King";
        s.marks=87;
       arr[0]=s;
        Student s1=new Student(); 
        s1.id=2;
        s1.name="Queen";
        s1.marks=80;
        arr[1]=s1;
        Student s2=new Student();
        s2.id=3;
        s2.name="Jack";
        s2.marks=89;
        arr[2]=s2;
        Student s3=new Student();
        s3.id=4;
        s3.name="Elizibith";
        s3.marks=90;
        arr[3]=s3;

        Student[] fil=filterbymarks(arr);
        for ( Student f:fil){
            System.out.println(f.id+" "+f.name+" "+f.marks);

        }
    }
}
