package gestionParc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParcGUI {
    private JFrame frame;
    private JTextField nomZoneField, superficieField, typeField;
    private JTextField especeAnimalField, ageAnimalField, etatSanteField;
    private JTextArea detailsArea;
    private Zone zone;

    public ParcGUI() {
        frame = new JFrame("Système de Gestion d'un Parc National");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Zone Inputs
        nomZoneField = new JTextField(10);
        superficieField = new JTextField(10);
        typeField = new JTextField(10);
        
        JButton ajouterZoneBtn = new JButton("Ajouter Zone");
        ajouterZoneBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nom = nomZoneField.getText();
                double superficie = Double.parseDouble(superficieField.getText());
                String type = typeField.getText();
                zone = new Zone(nom, superficie, type);
                detailsArea.setText(zone.getDetails());
            }
        });

        frame.add(new JLabel("Nom de la Zone: "));
        frame.add(nomZoneField);
        frame.add(new JLabel("Superficie: "));
        frame.add(superficieField);
        frame.add(new JLabel("Type: "));
        frame.add(typeField);
        frame.add(ajouterZoneBtn);

        // Animal Inputs
        especeAnimalField = new JTextField(10);
        ageAnimalField = new JTextField(5);
        etatSanteField = new JTextField(10);
        
        JButton ajouterAnimalBtn = new JButton("Ajouter Animal");
        ajouterAnimalBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (zone != null) {
                    String espece = especeAnimalField.getText();
                    int age = Integer.parseInt(ageAnimalField.getText());
                    String etatSante = etatSanteField.getText();
                    Animal animal = new Animal(espece, age, etatSante);
                    zone.ajouterAnimal(animal);
                    detailsArea.setText(zone.getDetails());
                } else {
                    JOptionPane.showMessageDialog(frame, "Veuillez d'abord ajouter une zone.");
                }
            }
        });

        frame.add(new JLabel("Espèce de l'Animal: "));
        frame.add(especeAnimalField);
        frame.add(new JLabel("Âge: "));
        frame.add(ageAnimalField);
        frame.add(new JLabel("État de Santé: "));
        frame.add(etatSanteField);
        frame.add(ajouterAnimalBtn);

        // Details Area
        detailsArea = new JTextArea(10, 30);
        detailsArea.setEditable(false);
        frame.add(new JScrollPane(detailsArea));

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ParcGUI();
    }
}
