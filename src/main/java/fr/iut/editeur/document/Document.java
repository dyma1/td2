package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }
    public void remplacer(int start, int end, String remplacement){
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }
    public void majuscules(int start, int end){
        String texte = getTexte();
        texte = (texte.substring(start, end)).toUpperCase();
        remplacer(start, end, texte);
    }

    /**
     * Efface le texte entre les positions debut et fin
     * @param debut position de début
     * @param fin position de fin
     */
    public void effacer(int debut, int fin){
        remplacer(debut, fin, "");
    }

    /**
     * Efface tout le texte du document
     */
    public void clear(){
        effacer(0, getTexte().length());
    }
}
