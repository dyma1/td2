package fr.iut.editeur.document;

import org.junit.Test;

public class DocumentTest {
    @Test
    public void testAjouter() {
        Document document = new Document();
        document.ajouter("test");
        assert(document.getTexte().equals("test"));
    }
    @Test
    public void testRemplacer() {
        Document document = new Document();
        document.ajouter("test");
        document.remplacer(0, 4, "tset");
        assert(document.getTexte().equals("tset"));
    }
    @Test
    public void testMajuscules() {
        Document document = new Document();
        document.ajouter("test");
        document.majuscules(0, 4);
        assert(document.getTexte().equals("TEST"));
    }
    @Test
    public void testPremiereLettreMajuscule(){
        Document document = new Document();
        document.ajouter("test");
        document.majuscules(0,1);
        assert(document.getTexte().equals("Test"));
    }
    @Test
    public void testEffacer() {
        Document document = new Document();
        document.ajouter("test");
        document.effacer(0, 3);
        assert(document.getTexte().equals("t"));
    }
    @Test
    public void testClear(){
        Document document = new Document();
        document.ajouter("test");
        document.clear();
        assert(document.getTexte().equals(""));
    }
}
