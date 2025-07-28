import java.util.Scanner;

public class Student_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Student name:");
        String name =sc.nextLine();

        System.out.print("Enter roll number:");
        int roll_no = sc.nextInt();

        System.out.print("Enter Computer Marks:");
        float comp_mark =sc.nextFloat();

        System.out.print("Enter Science Marks:");
        float science_marks =sc.nextFloat();

        System.out.print("Enter Social Science Marks:");
        float SST_marks =sc.nextFloat();

        System.out.print("Enter English Marks:");
        float Eng_marks =sc.nextFloat();

        System.out.print("Enter Physical Marks:");
        float phy_marks =sc.nextFloat();

        System.out.print("Total Marks of all subjects:");
        float marks =(comp_mark+science_marks+SST_marks+Eng_marks+phy_marks);
        System.out.println(marks);

        System.out.print("Total average of all subjects:");
        float avg =(comp_mark+science_marks+SST_marks+Eng_marks+phy_marks)/5;
        System.out.println(avg);
        char Grade;

            if(avg<=100.0&&avg>90){
                Grade='A';
            }
            else if(avg<=89.0&&avg>=80.0){
                Grade='B';
            }
            else if(avg<=79.0&&avg>=70.0){
                 Grade='C';
            }
            else if(avg<=69.0&&avg>=60.0){
                Grade='D';
            }
            else if(avg<=59.0&&avg>35.0){
                Grade='E';
            }
            else{
                Grade='F';
            }
            System.out.println(name+" whom enroll no. "+roll_no+" marked with Grade:"+Grade);      
    }  
}
