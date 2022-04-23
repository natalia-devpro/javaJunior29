package lesson14;

public class Coin implements Comparable<Coin>{
    private int years;
    private int nominal;
    private double diametr;
    private String metal;

    public Coin() {
    }

    public Coin(int years, int nominal, double diametr, String metal) {
        this.years = years;
        this.nominal = nominal;
        this.diametr = diametr;
        this.metal = metal;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "years=" + years +
                ", nominal=" + nominal +
                ", diametr=" + diametr +
                ", metal='" + metal + '\'' +
                '}';
    }

    @Override
    public int compareTo(Coin o) {

        if (this.getDiametr()!=o.getDiametr()){
            return Double.compare(this.getDiametr(),o.getDiametr());
        }
        if (this.getNominal()!=o.getNominal()){
            return this.getNominal()-o.getNominal();
        }
        if (this.getYears()!=o.getYears()){
            return this.getYears()-o.getYears();
        }
        if (this.getMetal().equals(o.getMetal())){
            return this.getMetal().compareTo(o.getMetal());
        }
        return 0;
    }
}
