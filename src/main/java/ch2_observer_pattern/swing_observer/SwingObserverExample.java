package ch2_observer_pattern.swing_observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame jframe;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        jframe = new JFrame();

        JButton jButton = new JButton("Should I do it?");

        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());

        jframe.add(jButton);
        jframe.setVisible(true);
    }

    private class DevilListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    private class AngelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }
}
