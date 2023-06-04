import java.util.Scanner;
public class KdvHesaplama {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double tutar ,  kdv = 0.18;
System.out.print("Lütfen ürünün fiyatını giriniz :");
tutar =input.nextInt();
double kdvlifiyat = (tutar * kdv)+tutar;
System.out.println("Ürünün kdv dahil fiyatı :"+kdvlifiyat
        );
    }
}