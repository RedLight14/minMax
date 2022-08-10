import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, x;
        int max=0,min=0;

        System.out.print("Kac tane sayi giriceksiniz? ");
        n = inp.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.print("Sayi giriniz : ");
            x = inp.nextInt();
            if (i == 0){
                min = x;
                max = x;
            }

            if(x < min){
                min = x;
            }

            if(x > max){
                max = x;
            }
        }
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
    }
