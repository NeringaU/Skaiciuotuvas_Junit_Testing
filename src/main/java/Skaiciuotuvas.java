import java.util.Scanner;

public class Skaiciuotuvas {
    static int sk,sk1;

    public static void main(String[] args) {

        String simbolis = "T";
        String zenklas;

        breztilinija();

        spausdinti("Skaičiuotuvas");

        breztilinija();

        do {

            spausdinti("Įveskite pirmająjį skaičių:");
            Scanner S = new Scanner(System.in); // įvedimui
            sk = S.nextInt();
            spausdinti("Įveskite norimo atlikti veiksmo ženklą:");
            zenklas = S.next();
            spausdinti("Įveskite antrąjį skaičių:");
            sk1 = S.nextInt();
            spausdinti("Atsakymas");

            switch (zenklas) {
                case "+":
                    spausdinti(sk + "+" + sk1 + "=" + sudeti(sk,sk1));
                    break;
                case "-":
                    spausdinti(sk + "-" + sk1 + "=" + atimti(sk,sk1));
                    break;
                case "*":
                    dauginti(sk,sk1);
                    break;
                case "/":
                    if (sk1 == 0) {
                        dalinti("Dalyba iš nulio negalima");
                    } else {
                        dalinti();
                    }
                    break;
                default:
                    spausdinti("Operacija negalima, patikrinkite norimo atlikti veiksmo ženklą");
            }

            spausdinti("Norėdami tęsti spauskite T, baigti- bet kurį kitą simbolį");
            simbolis = S.next();

        } while (simbolis.equals("T"));

        spausdinti("Skaičiavimas baigtas !");

    }
/*
------------------ Funkcijos---------------------------------
*/

    static void spausdinti(String info){
        System.out.println(info);
    }

    static void breztilinija(){
        System.out.println("-------------------------");
    }

    static int sudeti(int sk, int sk1){
        int sudetis = sk + sk1;
        return sudetis;
    }
    static void dalinti(){
        System.out.println(sk + "/" + sk1 + "=" + sk/sk1);
    }

    static void dalinti(String info){
        System.out.println(info);

    }
    static double atimti(double sk, double sk1){
        return sk-sk1;

    }

    static void dauginti(double sk,double sk1){
        System.out.println(sk + "*" + sk1 + "=" + sk*sk1);
    }

}
