package jdbc;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AgStopWatch extends JFrame {

    private JPanel contentPane;
    private JLabel lblNewLabel;
    private Timer timer;
    private int seconds = 0;
    private boolean running = false;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AgStopWatch frame = new AgStopWatch();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    public AgStopWatch() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        lblNewLabel = new JLabel("00:00:00");
        lblNewLabel.setFont(new Font("STZhongsong", Font.BOLD, 16));
        lblNewLabel.setBounds(315, 34, 154, 42);
        contentPane.add(lblNewLabel);

        JButton btnNewButton = new JButton("Start");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startTimer();
            }
        });
        btnNewButton.setFont(new Font("STZhongsong", Font.BOLD, 16));
        btnNewButton.setBounds(191, 112, 103, 31);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Pause");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pauseTimer();
            }
        });
        btnNewButton_1.setFont(new Font("STZhongsong", Font.BOLD, 16));
        btnNewButton_1.setBounds(315, 112, 91, 31);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Stop");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stopTimer();
            }
        });
        btnNewButton_2.setFont(new Font("STZhongsong", Font.BOLD, 16));
        btnNewButton_2.setBounds(449, 112, 91, 31);
        contentPane.add(btnNewButton_2);

        JLabel lblNewLabel_1 = new JLabel("Timer :- ");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel_1.setBounds(218, 34, 76, 42);
        contentPane.add(lblNewLabel_1);
    }

    private void startTimer() {
        if (!running) {
            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    seconds++;
                    int hour = seconds / 3600;
                    int minute = (seconds % 3600) / 60;
                    int second = seconds % 60;
                    lblNewLabel.setText(String.format("%02d:%02d:%02d", hour, minute, second));
                }
            });
            timer.start();
            running = true;
        }
    }

    private void pauseTimer() {
        if (running) {
            timer.stop();
            running = false;
        }
    }

    private void stopTimer() {
        if (running) {
            timer.stop();
            running = false;
        }
        seconds = 0;
        lblNewLabel.setText("00:00:00");
    }
}
