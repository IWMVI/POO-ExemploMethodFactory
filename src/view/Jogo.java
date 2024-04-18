package view;

import controller.BatalhaFactory;
import controller.BatalhaNivelDois;
import controller.BatalhaNivelTres;
import controller.BatalhaNivelUm;
import model.NPC;
import model.Personagem;

public class Jogo {
    public static void main(String[] args) {
        Personagem p = new Personagem();
        p.setId(1);
        p.setNome("IWMVI");
        p.setEnergia(100);
        p.setNivel(3);
        p.setArma("Espada");

        NPC npc = null;

        switch (p.getNivel()) {
            case 1:
                BatalhaFactory batNivelUm = new BatalhaNivelUm();
                batNivelUm.inicioBatalha(p);
                npc = batNivelUm.npcBatalha();
                break;

            case 2:
                BatalhaFactory batNivelDois = new BatalhaNivelDois();
                batNivelDois.inicioBatalha(p);
                npc = batNivelDois.npcBatalha();
                break;

            case 3:
                BatalhaFactory batNivelTres = new BatalhaNivelTres();
                batNivelTres.inicioBatalha(p);
                npc = batNivelTres.npcBatalha();
                break;
        }
        System.out.println(npc);
    }
}
