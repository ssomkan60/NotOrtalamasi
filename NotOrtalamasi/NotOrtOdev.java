import java.util.Scanner;
public class NotOrtOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fiz, kim, tr, mzk;
        int i = 0;
        double ort = 0;
        double genelort;

        System.out.print("Matematik Notunuzu Giriniz:");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz:");
        fiz = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:");
        kim = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz:");
        tr = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz:");
        mzk = input.nextInt();

        if (mat >= 0 && mat <= 100){
            ort += mat;
            i++;
        }
        if (fiz >= 0 && fiz <= 100){
            ort += fiz;
            i++;
        }
        if (kim >= 0 && kim <= 100){
            ort += kim;
            i++;
        }
        if (tr >= 0 && tr <= 100){
            ort += tr;
            i++;
        }
        if (mzk >= 0 && mzk <= 100){
            ort += mzk;
            i++;
        }
        genelort = ort / i;
        System.out.print("Genel Ortalama:");
        System.out.print(genelort);

        if(genelort > 55){
            System.out.println("\nSınıfı Geçtiniz.");
        }
        else{
            System.out.println("\nSınıfta Kaldınız.");
        }
    }
}
