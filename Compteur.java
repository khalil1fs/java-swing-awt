
 /*  
  * Écrivez une classe Counter qui crée une fenêtre comme celle présentée sur la figure suivante.
  * La fenêtre n'est pas redimensionnable et fait 200 pixels de large sur 100 pixels de haut. Elle
  * comporte un label et deux boutons. Il y a 20 pixels entre le label et le bouton - et 10 pixels entre
  * les deux boutons. Le label affiche le texte Compteur : suivi de la valeur du compteur qui vaut
  * 0 initialement. Une pression sur les boutons + (-) incrémente (décrémente) la valeur du
  * compteur et met à jour le label.
  */
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Compteur extends JFrame implements ActionListener {
    private int x =0;
    private JLabel l1;
    private JPanel p1,p2;
    private JButton b1,b2;
    private  GridLayout g,g1;
    public static void main(String[] args) {
        Compteur test = new Compteur();
    }
    Compteur() {
        super.setTitle("counter");
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.setBounds(530,350,200,100);

        g = new GridLayout(1,1,20,0);
        p2 = new JPanel(g);
        l1 = new JLabel("Compteur:"+x);
        p2.add(l1);
        add(p2);

        p1 = new JPanel();
        p1.setMaximumSize(new Dimension(80,40));
        g1 = new GridLayout(1, 4,10,0);
        p1.setLayout(g1);

        b1 = new JButton("-");
        b1.setFont(new Font("Arial",Font.BOLD,20));
        b1.setBounds(new Rectangle(110,60,30,30));
        p1.add(b1);
        b1.addActionListener(this);

        b2 = new JButton("+");
        b2.setFont(new Font("Arial",Font.BOLD,19));
        b1.setBounds(new Rectangle(140,60,30,30));
        p1.add(b2);
        b2.addActionListener(this);
        add(p1, BorderLayout.EAST);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e1) {
        if (e1.getSource()== b1) {
            x--;
            l1.setText("Compteur:"+x);
        } else if (e1.getSource() == b2) {
            x++;
            l1.setText("Compteur:"+x);
        }
    }
}
