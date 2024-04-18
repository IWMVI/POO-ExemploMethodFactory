package model;

public class Personagem {

    private int id;
    private String nome;
    private String arma;
    private int energia;
    private int nivel;

    public Personagem() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("================= NPC Nível 1 =================");
        buffer.append("ID: " + getId() + "\n");
        buffer.append("Arma: " + getArma() + "\n");
        buffer.append("Energia: " + getEnergia() + "\n");
        buffer.append("Nível: " + getNivel() + "\n");
        System.out.println("==========================================");
        return buffer.toString();
    }
}
