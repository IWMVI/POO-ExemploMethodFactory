package model;

public class NPCNivelTres extends NPC {

    private int replicacao;

    public NPCNivelTres() {
        super();
    }

    public int getReplicacao() {
        return replicacao;
    }

    public void setReplicacao(int replicacao) {
        this.replicacao = replicacao;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("================= NPC Nível 3 =================\n");
        buffer.append("ID: " + getId() + "\n");
        buffer.append("Arma: " + getArma() + "\n");
        buffer.append("Energia: " + getEnergia() + "\n");
        buffer.append("Replicação: " + replicacao + "\n");
        System.out.println("==========================================");
        return buffer.toString();
    }
}
