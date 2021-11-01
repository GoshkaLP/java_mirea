package seminar3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {
    protected int milan_score = 0;
    protected int madrid_score = 0;
    protected String winner = "Draw";
    protected String last_scorer = "N/A";

    protected JLabel result_lbl;
    protected JLabel last_scorer_lbl;
    protected JLabel winner_lbl;


    public App() {
        JFrame jfrm = new JFrame("Football match");
        jfrm.setLayout(new BorderLayout());

        result_lbl = new JLabel("Result: 0X0", SwingConstants.CENTER);
        jfrm.add(result_lbl, BorderLayout.NORTH);

        last_scorer_lbl = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        jfrm.add(last_scorer_lbl, BorderLayout.CENTER);

        JButton milan_btn = new JButton("AC Milan");
        milan_btn.addMouseListener(new MilanMouseListener());
        jfrm.add(milan_btn, BorderLayout.WEST);

        JButton madrid_btn = new JButton("Real Madrid");
        madrid_btn.addMouseListener(new MadridMouseListener());
        jfrm.add(madrid_btn, BorderLayout.EAST);

        winner_lbl = new JLabel("Winner: Draw", SwingConstants.CENTER);
        jfrm.add(winner_lbl, BorderLayout.SOUTH);

        jfrm.setVisible(true);
        jfrm.setSize(800, 600);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void event_handler() {
        if (milan_score > madrid_score) {
            winner = "AC Milan";
        } else if (milan_score < madrid_score) {
            winner = "Real Madrid";
        } else {
            winner = "Draw";
        }
        result_lbl.setText("Result: " + milan_score + "X" + madrid_score);
        winner_lbl.setText("Winner: " + winner);
        last_scorer_lbl.setText("Last Scorer: " + last_scorer);
    }

    public class MilanMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {
            milan_score += 1;
            last_scorer = "AC Milan";
            event_handler();
        }

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }

    public class MadridMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {
            madrid_score += 1;
            last_scorer = "Real Madrid";
            event_handler();
        }

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new App();
            }
        });
    }
}


