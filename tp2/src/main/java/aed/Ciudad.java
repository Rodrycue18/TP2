package aed;

import java.util.Comparator;

public class Ciudad {
    private int id;
    private int gananciaTotal;
    private int perdidaTotal;

    public Ciudad(int id) {
        this.id = id;
        this.gananciaTotal = 0;
        this.perdidaTotal = 0;
    }

    public int getId() { return id; }
    public int getGananciaTotal() { return gananciaTotal; }
    public int getPerdidaTotal() { return perdidaTotal; }
    public int getSuperavit() { return gananciaTotal - perdidaTotal; }


    public void agregarPerdida(int perdida) {
        this.perdidaTotal += perdida;
    }

    public void agregarGanancia(int ganancia) {
        this.gananciaTotal += ganancia;
    }

    public static Comparator<Ciudad> byMayorSuperavit() {
        return Comparator.comparingInt(Ciudad::getSuperavit).reversed()
                         .thenComparingInt(Ciudad::getId);
    }


}