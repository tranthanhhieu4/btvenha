
package TranThanhHieu_29219065013;
import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhap chuoi:");
        if (scanner.hasNext()) {
            String chuoi = scanner.next(); // Lấy đầu vào
            System.out.println("La chuoi chi chua chu cai: " + chuoi);
        } else {
            System.out.println("Dau vao khong phai la chuoi chi chua chu cai.");
        }
        
        
    }
}
