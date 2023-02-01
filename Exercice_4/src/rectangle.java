 class Rectangle {

    public int largeur;
    public int longueur;

    public Rectangle() {
        super();
    }
    public Rectangle(int largeur, int longueur) {
        super();
        this.largeur = largeur;
        this.longueur = longueur;
    }


    public int getLargeur() {
        return this.largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLongueur() {
        return this.longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public  double Area(){
        return this.longueur * this.largeur;

    }

    @Override
    public String toString() {
        return "[longueur=" + longueur + ", largeur=" + largeur + " area "+Area()+"]";
    }
    

}