package gestionParc;

public class Main {
    public static void main(String[] args) {
        // Initialisation de l'interface utilisateur
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ParcGUI();
            }
        });
    }
}
