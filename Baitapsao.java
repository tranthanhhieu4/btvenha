package TranThanhHieu_29219065013;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Baitapsao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Nhập tên
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();

        // Nhập tuổi
        System.out.print("Nhap tuoi: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự xuống dòng

        // Nhập năm sinh
        System.out.print("Nhap nam sinh (yyyy-MM-dd): ");
        String yearOfBirthInput = scanner.nextLine();
        Date yearOfBirth;

        
        try {
            yearOfBirth = dateFormat.parse(yearOfBirthInput);
        } catch (ParseException e) {
            System.out.println("khong hop le.");
            scanner.close(); 
            return; 
        }

        // Nhập giới tính
        System.out.print("Nhap gioi tinh: ");
        String gender = scanner.nextLine();

        // Nhập chuyên ngành
        System.out.print("Nhap chuyen nganh: ");
        String major = scanner.nextLine();

        // Nhập GPA
        System.out.print("Nhap gpa: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine(); // Đọc ký tự xuống dòng

        // Nhập quê quán
        System.out.print("Nhap que quan: ");
        String hometown = scanner.nextLine();

        
        System.out.println("\nThong tin nhap:");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Nam sinh: " + dateFormat.format(yearOfBirth));
        System.out.println("Gioi tinh: " + gender);
        System.out.println("Chuyen nganh: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("Que quan: " + hometown);

        
    }
}
