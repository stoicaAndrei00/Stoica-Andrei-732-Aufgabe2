//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import model.Spieler;

public class Service {
    private Repository<Spieler> spielerRepository;

    public Service(Repository<Spieler> spielerRepository) {
        this.spielerRepository = spielerRepository;
    }

    public List<Spieler> alleSpielerZuruckgeben() {
        return this.spielerRepository.getAllElements();
    }



    public void createASpieler(int alter, String name, String position, int marktwert) {

        this.spielerRepository.addElement(new Spieler(alter, name, position, marktwert));
    }

    public Spieler getSpieler(int alter) {
        Iterator var2 = this.spielerRepository.getAllElements().iterator();

        Spieler p;
        do {
            if (!var2.hasNext()) {
                throw new RuntimeException("Spieler nicht gefunden");
            }

            p = (Spieler)var2.next();
        } while(p.getAlter() != alter);

        return p;
    }

    public void updateSpieler(Spieler spieler) {
        Iterator var2 = this.spielerRepository.getAllElements().iterator();

        while(var2.hasNext()) {
            Spieler p = (Spieler)var2.next();
            if (p.getAlter() == spieler.getAlter()) {
                int index = this.spielerRepository.getAllElements().indexOf(p);
                p.setName(spieler.getName());
                p.setPosition(spieler.getPosition());
                this.spielerRepository.updateElement(index, p);
                break;
            }
        }

    }

    public void deleteSpieler(String name) {
        Iterator var2 = this.spielerRepository.getAllElements().iterator();

        while(var2.hasNext()) {
            Spieler p = (Spieler)var2.next();
            if (Objects.equals(p.getName(), name)) {
                this.spielerRepository.remove(p);
                break;
            }
        }

    }

    public List<Spieler> filterNachPosition(String ort) {
        new ArrayList();
        List<Spieler> spielerList = this.spielerRepository.getAllElements().stream().filter((spieler) -> {
            return ort.equals(spieler.getPosition());
        }).toList();
        return spielerList;
    }




}
