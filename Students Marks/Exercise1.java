import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {

        Scanner S=new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name=S.nextLine();
        System.out.println("Enter the marks of 6 Subjects out of 100 : ");
        System.out.print("Enter Marks in English : ");
        int English_MArks=S.nextInt();
        System.out.print("Enter Marks in Maths : ");
        int Maths_MArks=S.nextInt();
        System.out.print("Enter Marks in Physics : ");
        int Physics_MArks=S.nextInt();
        System.out.print("Enter Marks in Chemistry : ");
        int Chemistry_MArks=S.nextInt();
        System.out.print("Enter Marks in Biology : ");
        int Biology_MArks=S.nextInt();
        System.out.print("Enter Marks in Hindi : ");
        int Hindi_MArks=S.nextInt();
        int total_marks=(English_MArks + Maths_MArks + Physics_MArks + Chemistry_MArks + Biology_MArks+Hindi_MArks);
        float percentage= (total_marks /600.0f)*100;
        System.out.print("Name : "+name);
        System.out.print("\nPercentage : "+percentage+"%");
    }
}
