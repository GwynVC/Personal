import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main {
  public static void main (String[] args) {
    System.out.println("Welcome to Mythical Monsters! A game that... I haven't really decided what it does tbh, I'm just kinda testing this out lol.");
    System.out.println("Anywaysssssss, what's you name?");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Nice to meet you, " + name + "! While I haven't figured out what I'm doing for this game, why don't you pick your favorite moster?");

    JFrame frame = new JFrame("Button Example");

    JButton button = new JButton("Vampires");
    button.setBounds(50, 50, 100, 30);

    JButton button2 = new JButton("Sirens");
    button2.setBounds(50, 100, 100, 30);
    button2.setVisible(true);

    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        button.setVisible(false);
        button2.setVisible(false);
        vampires();
      }
    });

    button2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        button2.setVisible(false);
        button.setVisible(false);
        sirens();

      }
    });
    frame.add(button);
    frame.add(button2);

    frame.setSize(200, 200);
    frame.setLayout(null);
    frame.setVisible(true);

  }

  public static void sirens() {
    System.out.println("Sirens huh? In that case, I have someone you'd might like to meet.");
  }

  public static void vampires() {
    System.out.println("Vampires huh? In that case, I have someone you'd might like to meet.");
  }

}
