package hu.petrik.sokszogoop;

public class Haromszog extends Sokszog{
    private double b;
    private double c;

    public Haromszog(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
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
}
