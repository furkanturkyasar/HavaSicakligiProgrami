import java.util.Scanner;
/*
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
*/
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heat;

        System.out.print("Sicaklik degerini giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak ");
        } else if (heat < 15) {
            System.out.print("Sinema");
        } else if (heat <25) {
            System.out.print("Piknik");
        }else {
            System.out.println("Yuzme");
        }
    }


    }
