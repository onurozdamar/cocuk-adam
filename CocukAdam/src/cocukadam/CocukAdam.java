package cocukadam;

import javax.swing.JFrame;

public class CocukAdam extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Çocuk Adam");
        Ekran ekran = new Ekran();
        frame.add(ekran);
        frame.setSize(400, 540);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
