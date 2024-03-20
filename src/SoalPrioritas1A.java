import java.util.Scanner;

public class SoalPrioritas1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Berat Paket : ");
        int berat = sc.nextInt();
        System.out.print("Masukan Jarak Tempuh : ");
        int jarak = sc.nextInt();

        //Biaya
        int res = hitungHarga(berat, jarak);
        System.out.print("Biaya : " + res);
        System.out.println();
    }

    public static int hitungHarga(int berat, int jarak){
        int hBerat = 0; //harga dari berat
        int hjarak = 0; //harga dari jarak tempuh
        int res = 0;

        //berat paket
        if(berat < 2){
            hBerat = 10000;
        } else if (berat >= 2 && berat <= 7) {
            hBerat = 15000;
        } else if (berat >= 8 && berat <= 15) {
            hBerat = 25000;
        } else {
            hBerat = 40000;
        }

        //jarak tempuh ke tujuan
        if(jarak < 1){
            hjarak = 2000;
        } else if (jarak >= 1 && jarak <= 7) {
            hjarak = 5000;
        } else if (jarak >= 8 && jarak <= 15) {
            hjarak = 10000;
        } else {
            hjarak = 20000;
        }

        res = hBerat + hjarak;

        return res;
    }
}