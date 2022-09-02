import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;
        System.out.println("matematik notunuz : ");
        mat = scanner.nextInt();

        System.out.println("fizik notunuz : ");
        fizik = scanner.nextInt();

        System.out.println("kimya notunuz : ");
        kimya = scanner.nextInt();

        System.out.println("türkçe notunuz : ");
        turkce = scanner.nextInt();

        System.out.println("tarih notunuz : ");
        tarih = scanner.nextInt();

        System.out.println("müzik notunuz : ");
        muzik = scanner.nextInt();

        int toplam=mat+fizik+kimya+turkce+tarih+muzik;
        double sonuc = toplam/6.0;
        System.out.println("ortalamanız : " + sonuc);
        boolean state=sonuc>60;
        String stateString=state?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(stateString);
    }
}
