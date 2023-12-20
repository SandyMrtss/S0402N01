package cat.itacademy.barcelonactiva.martos.sandra.s04.t02.n01;

public class Fruita {
    private int id;
    private String nom;
    private int quantitalQuilos;

    public Fruita(int id, String nom, int quantitalQuilos) {
        this.id = id;
        this.nom = nom;
        this.quantitalQuilos = quantitalQuilos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitalQuilos() {
        return quantitalQuilos;
    }

    public void setQuantitalQuilos(int quantitalQuilos) {
        this.quantitalQuilos = quantitalQuilos;
    }
}
