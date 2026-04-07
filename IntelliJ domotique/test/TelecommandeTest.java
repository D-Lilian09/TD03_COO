import import org.junit.jupiter.api.Test;



/**
 * Classe de test permettant de tester les comportements de Telecommande et Lampe
 */
public class TelecommandeTest {

    /**
     * Test de l'ajout d'une lampe à la télécommande
     */
    @Test
    public void testAjout() {
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouterLampe(l);

        // Utilisation des assertions JUnit directement (plus lisible qu'un if)
        // Note : Si l'attribut lampes est privé (bonne pratique),
        // remplace "t.lampes[0]" par un accesseur comme "t.getLampe(0)"
        assertSame(l, t.lampes[0], "Erreur d'ajout : la lampe ajoutée n'est pas à l'index 0");
    }

    /**
     * Test allumer une lampe qui est éteinte par défaut
     */
    @Test
    public void testAllumer_eteinte() {
        // Préparation des données
        Lampe l = new Lampe("lampe1"); // Une lampe est normalement éteinte à la création

        // Méthode testée
        l.allumer();

        // Vérification
        assertTrue(l.isAllume(), "Après l'action allumer(), la lampe devrait être allumée");
    }

    /**
     * Test allumer une lampe déjà allumée
     */
    @Test
    public void testAllumer_allumee() {
        // Préparation des données
        Lampe l = new Lampe("lampe1");
        l.allumer();

        // Méthode testée
        l.allumer();

        // Vérification
        assertTrue(l.isAllume(), "Après un deuxième allumer(), la lampe devrait toujours être allumée");
    }

    /**
     * Test éteindre une lampe allumée
     */
    @Test
    public void testEteindre_allumee() {
        // Préparation des données
        Lampe l = new Lampe("lampe1");
        l.allumer();

        // Méthode testée
        l.eteindre();

        // Vérification
        assertFalse(l.isAllume(), "Après eteindre(), la lampe devrait être éteinte");
    }

    /**
     * Test éteindre une lampe déjà éteinte
     */
    @Test
    public void testEteindre_eteinte() {
        // Préparation des données
        Lampe l = new Lampe("lampe1");

        // Méthode testée
        l.eteindre();

        // Vérification
        assertFalse(l.isAllume(), "Après eteindre() sur une lampe éteinte, elle doit rester éteinte");
    }

    /**
     * Test toString lampe éteinte
     */
    @Test
    public void testToString_eteinte() {
        // Préparation des données
        Lampe l = new Lampe("lampe1");

        // Méthode testée
        String r = "" + l;

        // Vérification
        assertEquals("lampe1: Off", r, "L'affichage devrait être 'Off'");
    }

    /**
     * Test toString lampe allumée
     */
    @Test
    public void testToString_allumee() {
        // Préparation des données
        Lampe l = new Lampe("lampe1");
        l.allumer();

        // Méthode testée
        String r = "" + l;

        // Vérification (message d'erreur corrigé)
        assertEquals("lampe1: On", r, "L'affichage devrait être 'On'");
    }

    /**
     * Test de l'allumage d'une lampe via la télécommande
     */
    @Test
    public void testActiverLampe_viaTelecommande() {
        // Ce test suppose que la Telecommande possède une méthode comme activerLampe(int index)
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouterLampe(l);

        // Méthode testée (à adapter selon les méthodes réelles de la classe Telecommande)
        // t.activerLampe(0);

        // Vérification
        // assertTrue(l.isAllume(), "La télécommande devrait avoir allumé la lampe");
    }
}
