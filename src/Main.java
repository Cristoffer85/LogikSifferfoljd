//Pseudokod
//Instruktioner
        //Skapa ett nytt projekt i IntelliJ
        //Skriv ut "2, 5, 9, 14, " i konsolen
       // Beräkna vilket tal som kommer efter 14
        //Skriv ut det i konsolen

        //Tips
        //Vad är sambandet mellan 2, 5, 9, 14 och nästa tal? Kan du se mönstrat i siffrorna?

        // Hur blir 2 -> 5?
        // Hur blir 5 -> 9?
        // Hur blir 9 -> 14?
        // Hur blir 14 -> nästa tal?
//End



public class Main {
    public static void main(String[] args) {

        int sum1 = 2;
        sum1 += 2;
        ++sum1;

        int sum2 = sum1;
        sum2 += 3;
        sum2++;

        int sum3 = sum2;
        sum3 += 4;
        sum3++;

        int sum4 = sum3;
        sum4 += 5;
        ++sum4;

                         //   2, 5, 9, 14, __
        System.out.println("2, " + sum1 + ", " + sum2 + ", " + sum3 + ", " + sum4);




        /// Skriv din kod här

    }
}
