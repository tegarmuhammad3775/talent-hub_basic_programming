import java.util.Scanner;

public class SoalPrioritas2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah angka : ");
        int jAngka = sc.nextInt(); // jumlah angka
        System.out.print("Masukan nilai  n : ");
        int nilai = sc.nextInt(); // nilai

        System.out.println("Hasil : ");
        int count = 0;
        while (count != jAngka){
            for ( int i = 1 ; i < Integer.MAX_VALUE; i++){
                if( i % nilai == 0){
                    System.out.println(i);
                    count++;
                }
                if(count == jAngka){
                    break;
                }
            }
        }
    }


}
