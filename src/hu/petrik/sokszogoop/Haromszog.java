package hu.petrik.sokszogoop;

public class Haromszog extends Sokszog{
    private double b;
    private double c;

    public Haromszog(){
        super(getVeletlenOldal());
        this.b = getVeletlenOldal();
        this.b = getVeletlenOldal();
        while(!isSzerkesztheto()){
            super.setA(getVeletlenOldal());
            this.b = getVeletlenOldal();
            this.c = getVeletlenOldal();
        }
    }

    private static double getVeletlenOldal() {
        return Math.random() * 5 + 5;
    }

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
        if (!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A megadott háromszög nem szerkeszthető");
        }
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setB(double b) {
        this.b = b;
        if (!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A megadott háromszög nem szerkeszthető");
        }
    }

    public void setC(double c) {
        this.c = c;
        if (!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A megadott háromszög nem szerkeszthető");
        }
    }

    @Override
    public void setA(double a) {
        super.setA(a);
        if (!this.isSzerkesztheto()){
            throw new IllegalArgumentException("A megadott háromszög nem szerkeszthető");
        }
    }

    private boolean isSzerkesztheto(){
        boolean szerkesztheto = true;
        if ((this.getA() + this.getB()) <= this.getC() ||
                (this.getB() + this.getC()) <= this.getA() || (this.getA() + this.getC()) <= this.getB()){
            szerkesztheto = false;
        }

        return szerkesztheto;
    }

    public double getKerulet(){
        return this.getA() + this.getB() + this.getC();
    }
    public double getS(){
        return getKerulet() / 2;
    }
    public double getTerulet(){
        return Math.sqrt(this.getS()*(this.getS()-getA())*(this.getS()-this.getB())*(this.getS()-this.getC()));
    }

    @Override
    public String toString() {
        return String.format("Háromszög: a = %-10.3f b = %-10.3f c = %-10.3f %s",
                this.getA(), this.getB(), this.getC(), super.toString());
    }
}
