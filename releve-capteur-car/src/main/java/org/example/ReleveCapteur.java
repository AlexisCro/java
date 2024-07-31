package org.example;

public class ReleveCapteur {
    private int id;
    private String typeMachine;
    private Double valeurReleve;

    public ReleveCapteur() {}

    public ReleveCapteur(int id, String typeMachine, Double valeurReleve) {
        this.id = id;
        this.typeMachine = typeMachine;
        this.valeurReleve = valeurReleve;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeMachine() {
        return this.typeMachine;
    }

    public void setTypeMachine(String typeMachine) {
        this.typeMachine = typeMachine;
    }

    public Double getValeurReleve() {
        return this.valeurReleve;
    }

    public void setValeurReleve(Double valeurReleve) {
        this.valeurReleve = valeurReleve;
    }

    @Override
    public String toString() {
        return "Type Machine " + this.typeMachine + "\nValeur " + this.valeurReleve + "\n";
    }
}
