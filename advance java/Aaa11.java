// import java.util.*;

// import javax.swing.DefaultComboBoxModel;
// import javax.swing.JComboBox;

// import java.time.DayOfWeek;
// import java.time.LocalDate;

// import java.time.temporal.TemporalAdjusters;


// public class Aaa11 {

//     public static void main(String... ak) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your date of birth (YYYY-MM-DD):");
//         String dobString = sc.nextLine();
//         LocalDate dob = LocalDate.parse(dobString);
//         for (int i = 1; i <= 5; i++) {
//             LocalDate satDate = dob.with(TemporalAdjusters.dayOfWeekInMonth(i,DayOfWeek.SATURDAY));
//             LocalDate sunDate = dob.with(TemporalAdjusters.dayOfWeekInMonth(i, DayOfWeek.SUNDAY));

//             if (i == 2 || i == 4)
//                 System.out.println("Saturday no: "+i+" -> "+satDate);
                
//             System.out.println("Sunday no: "+i+" -> "+sunDate);
//         }
        

//     }
// }

/*
 * JavaFX was intended to replace Swing as the standard GUI library for Java SE.
 * The majority of new Java GUI applications are based on JavaFX.
 * JavaFX has a number of advantages over Swing. It is more lightweight, and has
 * more sophisticated design controls. It uses CSS styling for components, and
 * XML can
 * be used to develop the GUI layout (with FXML and Scene Builder).
 * Swing can only be used to create rich client desktop applications. JavaFX can
 * be used to create the same rich desktop applications, as well as rich web
 * applications
 * that can run across a wide variety of devices.
 * JavaFX is both an alternative to web-based development and an alternative to
 * other toolkits for building GUI desktop/mobile applications.
 */







 
 import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aaa11 extends JFrame {
    private int x = 50;
    private int y = 100;
    private final int WIDTH = 600;
    private final int HEIGHT = 200;
    private final int CAR_WIDTH = 50;
    private final int CAR_HEIGHT = 30;
    private Timer timer;
    private JButton runButton;
    private JButton stopButton;

    public Aaa11() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel controlPanel = new JPanel();
        runButton = new JButton("Run");
        runButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                timer.start();
            }
        });
        controlPanel.add(runButton);
        stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                timer.stop();;
            }
        });
        controlPanel.add(stopButton);
        add(controlPanel, BorderLayout.NORTH);

        timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                x += 5;
                if (x > WIDTH) {
                    x = -CAR_WIDTH;
                }
                repaint();
        }
        });
    }
    

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, CAR_WIDTH, CAR_HEIGHT);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aaa11 frame = new Aaa11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}




//********************************  CAR ******************************/


/*
  import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A1_1 extends JFrame implements ActionListener {
    private int x = 50;
    private int y = 100;
    private final int WIDTH = 600;
    private final int HEIGHT = 200;
    private final int CAR_WIDTH = 50;
    private final int CAR_HEIGHT = 30;
    private Timer timer;
    private JButton runButton;
    private JButton stopButton;

    public A1_1() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel controlPanel = new JPanel();
        runButton = new JButton("Run");
        runButton.addActionListener(this);
        controlPanel.add(runButton);
        stopButton = new JButton("Stop");
        stopButton.addActionListener(this);
        controlPanel.add(stopButton);
        add(controlPanel, BorderLayout.NORTH);

        timer = new Timer(100, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == runButton) {
            timer.start();
        } else if (e.getSource() == stopButton) {
            timer.stop();
        } else {
            x += 5;
            if (x > WIDTH) {
                x = -CAR_WIDTH;
            }
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, CAR_WIDTH, CAR_HEIGHT);

        g.setColor(Color.GREEN);
        g.fillPolygon(null, null, ABORT);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A1_1 frame = new A1_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
} 


 */
