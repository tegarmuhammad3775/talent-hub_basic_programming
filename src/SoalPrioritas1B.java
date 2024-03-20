import java.util.Scanner;

public class SoalPrioritas1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Panjang : ");
        int panjang = sc.nextInt();
        System.out.print("Masukan Lebar : ");
        int lebar = sc.nextInt();
        String res = jenisPersegiPanjang(panjang, lebar);
        System.out.println("Hasil : " + res);

    }

    public static String jenisPersegiPanjang(int panjang, int lebar){
        String res = "";
        int luas = panjang * lebar;

        if(luas % 2 == 0){
            res = "even rectangle";
        } else if (luas % 2 == 1) {
            res = "odd rectangle";
        } else {
            res = "other rectangle";
        }

        return res;
    }
}
