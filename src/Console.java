//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;
import model.Spieler;
//import model.Produkt;

public class Console {
    private Controller controller;

    public Console(Controller controller) {
        this.controller = controller;
    }

    public Console() {
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int option = -1;

        while(option != 0) {
            System.out.println("1. Alle Spieler Zeigen\n2.Spieler CRUD\n0. Exit");
            option = sc.nextInt();
            sc.nextLine();
            int crudOption;
            switch (option) {
                case 0:
                default:
                    break;
                case 1:
                    this.controller.alleSpielerAnschreiben();
                    break;

                case 2:
                    System.out.println("1. Neuer Spieler hinzufugen\n2. Alle KSpieler sehen\n3. Einen bestimmten Spieler finden\n4. Einen Spieler aktualisieren\n5. Einen Spieler loschen\n6. Spieler nach Position filtrieren\n0. Exit");
                    crudOption = sc.nextInt();
                    sc.nextLine();
                    switch (crudOption) {
                        case 0:
                        default:
                            break;
                        case 1:
                            this.controller.createSpieler();
                            break;
                        case 2:
                            this.controller.alleSpielerAnschreiben();
                            break;
                        case 3:
                            this.controller.showSpieler();
                            break;
                        case 4:
                            this.controller.updateSpielerValidate();
                            break;
                        case 5:
                            this.controller.deleteSpieler();
                            break;
                        case 6:
                            this.controller.spielerNachPositionFiltrieren();
                            break;

                    }
            }
        }

    }

    public static void main(String[] args) {
        Repository<Spieler> spielerRepository = new Repository();
        Console console = new Console();
        console.initialiseData(spielerRepository);
        Service service = new Service(spielerRepository);
        Controller controller = new Controller(service);
        console = new Console(controller);
        console.run();
    }

    public void initialiseData(Repository<Spieler> kundeRepository) {

        Spieler spieler1 = new Spieler(24, "Kevin", "Fundas", 200);
        Spieler spieler2 = new Spieler(21, "Maria", "Portar", 2000);
        Spieler spieler3 = new Spieler(22, "Markus", "Atacant", 1200);
        Spieler spieler4 = new Spieler(30, "Aurelius", "Fundas", 200001);
        kundeRepository.addElement(spieler1);
        kundeRepository.addElement(spieler2);
        kundeRepository.addElement(spieler3);
        kundeRepository.addElement(spieler4);
    }
}
