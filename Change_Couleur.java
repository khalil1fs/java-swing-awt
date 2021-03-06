/*  
 * Ecrire un programme qui permet d'afficher une fenêtre (comme celle présentée sur la figure
 * suivante) sur laquelle se trouve une boite combo. La boite combo contient une liste de 5 noms
 * correspondants à 5 couleurs différentes. Si on choisit un de ces noms, la fenêtre prend la couleur
 * correspondante.
 */
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Change_Couleur extends Frame implements ItemListener {
    //private Choice c1;
    private Panel p1;
    public static void main(String[] args) {
        Change_Couleur test = new Change_Couleur();
    }
    public Change_Couleur() {
        super("Changer le couleur");
        super.setSize(400, 300);
        super.setAlwaysOnTop(true);
        super.setBackground(Color.WHITE);
        p1 = new Panel();
        Choice c1 = new Choice();
        c1.setBackground(Color.CYAN);
        c1.addItem("Bleu");
        c1.addItem("Rouge");
        c1.addItem("Vert");
        c1.addItem("Jaune");
        c1.addItem("Orange");
        c1.addItem("Gris");
        c1.addItem("White");
        c1.addItem("Black");
        p1.add(c1);
        add(p1, BorderLayout.NORTH);
        c1.addItemListener(this);
        show();
    }

    @Override
    public void itemStateChanged(ItemEvent e1) {
        if (e1.getItem().equals("Bleu"))  {    super.setBackground(Color.BLUE);  }
        if (e1.getItem().equals("Rouge"))  {  super.setBackground(Color.RED);}
        if (e1.getItem().equals("Vert"))  {  super.setBackground(Color.GREEN); }
        if (e1.getItem().equals("Jaune"))  {  super.setBackground(Color.YELLOW);}
        if (e1.getItem().equals("Orange"))  {  super.setBackground(Color.ORANGE);}
        if (e1.getItem().equals("Gris"))  {  super.setBackground(Color.GRAY);}
        if (e1.getItem().equals("White"))  {  super.setBackground(Color.WHITE);}
        if (e1.getItem().equals("Black"))  {  super.setBackground(Color.BLACK);}
    }
}
