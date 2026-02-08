package creational.singleton;

public class MainT {
    public static void main(String[] args) {

        TPE caissier1 = TPE.getInstance();
        TPE caissier2 = TPE.getInstance();
        TPE caissier3 = TPE.getInstance();

        caissier1.encaisser(8);
        caissier2.encaisser(10);
        caissier3.encaisser(9);

        System.out.println("\nTotal fin de journée : " + caissier1.getTotalJournee() + "€");

        System.out.println("Même TPE ? " + (caissier1 == caissier2));

        caissier1.nouvelleJournee();

        caissier2.encaisser(5);
        System.out.println("Total nouvelle journée : " + caissier3.getTotalJournee() + "€");
    }
}
