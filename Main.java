import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int [] list ={15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        System.out.print("Sayı giriniz: ");
        int numb = imp.nextInt();
        System.out.println("Girilen Sayı: " + numb);
        int min =0;
        int max =0;

        for(int k: list){
            if(k>numb){
                max = k;
                break;
            }
        }
        for(int i = list.length-1; i>0; i--){
            if(list[i]<numb){
                min = list[i];
                break;
            }
        }
        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Girilen Sayıdan Küçük En Yakın Sayı: " + min);
        System.out.println("Girilen Sayıdan Büyük En Yakın Sayı: " + max);

    }
}