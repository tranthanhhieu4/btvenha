package TranThanhHieu_29219065013;
import java.util.Scanner;
public class Baitap1 {

   
    public static void main(String[] args) {
        //name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten:");
        String name=scanner.nextLine();
        System.out.println("Ten:"+name);
        
        //age
       System.out.print(" Nhap tuoi:");
       int age= scanner.nextInt();
       scanner.nextLine();
       System.out.println("Tuoi:"+age);
       //gender
       System.out.print("Nhap gioi tinh:");
       String gender=scanner.nextLine();
       System.out.println("GioiTinh:"+gender);
       
       System.out.print("Nhap chuyen nganh: ");
        String major = scanner.nextLine();
        System.out.println("Major: " + major);
        
        System.out.print("Nhap GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
         System.out.println("GPA: " + gpa);
       System.out.print("Nhap que quan : ");
        String hometown = scanner.nextLine();
       System.out.println("Hometown: " + hometown);
    }
       
    
}
