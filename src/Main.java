import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.print("Asal sayıları bulmak için başlangıç sayısını giriniz :");
        n1 = input.nextInt();
        System.out.print("Asal sayıları bulmak için son sayıyı giriniz :");
        n2 = input.nextInt();

        if (n1 > 0  && n2 > 1) {
            for (int i =n1; i <= n2; i++) {

                boolean isAsal = true;


                for ( int j = 2; j <i/2+1; j++){
                    if (i % j ==0){
                        isAsal = false;
                        break;
                    }
                }
                if (isAsal){
                    if (i != 1) {
                        System.out.print(i + ",");
                    }
                }

            }



        } else System.out.print("Hatalı giriş yaptınız. Lütfen pozitif bir sayı giriniz!");



    }
}