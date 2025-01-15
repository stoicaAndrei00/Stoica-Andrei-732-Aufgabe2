import java.util.Iterator;
import java.util.Scanner;
import model.Spieler;

public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }



    public void alleSpielerAnschreiben() {
        Iterator var1 = this.service.alleSpielerZuruckgeben().iterator();

        while(var1.hasNext()) {
            Spieler spieler = (Spieler)var1.next();
            System.out.println(spieler);
        }

    }


    public void createSpieler() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Alter: ");
        int alter = sc.nextInt();
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Position: ");
        String position = sc.nextLine();
        System.out.println("Marktwert: ");
        int marktwert = sc.nextInt();
        this.service.createASpieler(alter, name, position, marktwert);
    }

    public void showSpieler() {
        Iterator var1 = this.service.alleSpielerZuruckgeben().iterator();

        while(var1.hasNext()) {
            Spieler spieler = (Spieler)var1.next();
            System.out.println(spieler);
        }

        System.out.println("Alter des Spielers:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println(this.service.getSpieler(id));
    }

    public void updateSpielerValidate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Alter des Spielers, das geandert werden soll: ");
        int alter = sc.nextInt();
        System.out.println("Neuer Name: ");
        String name = sc.nextLine();
        System.out.println("Neuer Position: ");
        String position = sc.nextLine();
        System.out.println("Neuer Marktwert: ");
        int marktwert = sc.nextInt();
        Spieler spieler = new Spieler(alter, name, position, marktwert);
        this.service.updateSpieler(spieler);
    }

    public void deleteSpieler() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name des Spielers, der geloescht werden soll: ");
        String name = sc.nextLine();
        sc.nextLine();
        this.service.deleteSpieler(name);
    }

    public void spielerNachPositionFiltrieren() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Position: ");
        String position = sc.nextLine();
        Iterator var3 = this.service.filterNachPosition(position).iterator();

        while(var3.hasNext()) {
            Spieler spieler = (Spieler)var3.next();
            System.out.println(spieler);
        }

    }
}