package javaapplication41;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp {
    private JFrame frame;
    private JLabel counterLabel;
    private int counterValue;
    private boolean counting;

    public CounterApp() {
        frame = new JFrame("Counter App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        counterLabel = new JLabel("Counter: 0");
        counterLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.add(counterLabel);

        JButton startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startCounter();
            }
        });

        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopCounter();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);
    }

    public void startCounter() {
        counting = true;
        counterValue = 0;

        Thread counterThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (counting) {
                    counterValue++;
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            counterLabel.setText("Counter: " + counterValue);
                        }
                    });

                    try {
                        Thread.sleep(1000); // Update the counter every second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        counterThread.start();
    }

    public void stopCounter() {
        counting = false;
    }

    public void display() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CounterApp app = new CounterApp();
                app.display();
            }
        });
    }
}

