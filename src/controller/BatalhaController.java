package controller;

import model.Personagem;

public class BatalhaController {

    public BatalhaController() {
        super();
    }

    public void inicioBatalha(Personagem p) {
        System.out.println("Início da batalha nível: " + p.getNivel());
    }

    // public NPC npcBatalha(Personagem p) {
    //     switch (p.getNivel()) {
    //         case 1:
    //             NPCNivelUm npc1 = new NPCNivelUm();
    //             int id1 = (int) ((Math.random() * 1001) + 1000);
    //             npc1.setId(id1);
    //             npc1.setArma("Espada");
    //             npc1.setEnergia(100);
    //             npc1.setMagia(10);
    //             return npc1;

    //         case 2:
    //             NPCNivelDois npc2 = new NPCNivelDois();
    //             int id2 = (int) ((Math.random() * 10001) + 10000);
    //             npc2.setId(id2);
    //             npc2.setArma("Machado");
    //             npc2.setEnergia(100);
    //             npc2.setAutocura(20);
    //             return npc2;

    //         case 3:
    //             NPCNivelTres npc3 = new NPCNivelTres();
    //             int id3 = (int) ((Math.random() * 1001) + 1000);
    //             npc3.setId(id3);
    //             npc3.setArma("Adaga");
    //             npc3.setEnergia(100);
    //             npc3.setReplicacao(5);
    //             return npc3;

    //         default:
    //             NPCNivelUm npc = new NPCNivelUm();
    //             int id = (int) ((Math.random() * 1001) + 1000);
    //             npc.setId(id);
    //             npc.setArma("Espada");
    //             npc.setEnergia(100);
    //             npc.setMagia(10);
    //             return npc;
    //     }
    // }
}
