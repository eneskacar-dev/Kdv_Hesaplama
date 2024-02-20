import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri oluştur
        int mat , fizik , kimya , turkce , muzik;

        // Scanner sınıfımızı tanımladık
    Scanner input = new Scanner(System.in);

    //Kullanıcıdan değerleri alacağız.
        System.out.print("Matematik Notunuz :  ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz :  ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz :  ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz :  ");
        turkce = input.nextInt();

        System.out.print("Müzik Notunuz :  ");
        muzik =input.nextInt();
// Notların ortalamasını hesapla
int toplam = (mat + fizik + kimya + muzik + turkce);
double sonuc = toplam / 6 ;
  String durum = (sonuc >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı" ;

System.out.println(durum);
    }
}