public class Television implements apareil {
    private boolean estAllumee;
    private int chaine;
    public Television(){
        this.chaine = 0;
        this.estAllumee = false;
    }

    public void allumer() {
        this.estAllumee = true;
    }

    public void eteindre() {
        this.estAllumee = false;
    }

    public String toString(){
        String r = "Chaine : ";
        r += chaine;
        return r;
    }
}
