
public class Payment {
    double pay;
    int clients;


    Payment( double a, int visitors) {
        pay = a;
        clients = visitors;
    }

    public void paymentPerPerson() {
        double finalSum = pay/clients;
        double piss = Math.floor(finalSum);
        String sumFinal = String.format("%.2f",finalSum);
        String ruble;
        if ((piss % 10 == 1) && (piss != 11)) {
            ruble = "рубль";
        }
        else if ((piss % 10 >= 2) && (piss % 10 <= 4) && ((piss < 10) || (piss > 20)))  {
            ruble = "рубля";
        }
        else {
            ruble = "рублей";
        }
        System.out.println("Расчет на человека: " + sumFinal + " " + ruble);

    }

}