import java.util.Scanner;

public class SoalPrioritas2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Kata : ");
        String kata = sc.nextLine();

        String res = ubahKata(kata);
        System.out.println("Hasil : " + res);

    }

    public static String  ubahKata (String kata){

        String temp = "";
        kata = kata.toLowerCase();

        for (int i = 0; i < kata.length(); i++){
            char huruf = kata.charAt(i);
            String vocal = "";
            String notVocal = "";
            if (huruf == 'a' || huruf == 'i' || huruf == 'e' || huruf == 'o'){
                if (huruf == 'a'){
                    huruf = '4';
                    vocal = Character.toString(huruf);
                    temp = temp.concat(vocal);
                } else if (huruf == 'e') {
                    huruf = '3';
                    vocal = Character.toString(huruf);
                    temp = temp.concat(vocal);
                } else if (huruf == 'i') {
                    huruf = '1';
                    vocal = Character.toString(huruf);
                    temp = temp.concat(vocal);
                } else {
                    huruf = '0';
                    vocal = Character.toString(huruf);
                    temp = temp.concat(vocal);
                }
            }
            else {
                notVocal = Character.toString(huruf);
                temp = temp.concat(notVocal);
            }
        }
        return temp;
    }
}
