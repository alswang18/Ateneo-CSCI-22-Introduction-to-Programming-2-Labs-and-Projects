import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SceneFrame {
    private JFrame frame;
    private SceneCanvas canvas;
    private JButton closeButton;
    private JPanel panel1;
    private JPanel panel2;
    private Boolean isOpen;
    private int speed;
    private Boolean second;
    private Boolean third;
    private JLabel label;
    private int sleepTime;

    public SceneFrame() {
        frame = new JFrame();
        canvas = new SceneCanvas(new Color(135, 206, 235));
        closeButton = new JButton("Close");
        panel1 = new JPanel();
        panel2 = new JPanel();
        isOpen = true;
        speed = 20;
        second = false;
        third = false;
        sleepTime = 10;
        label = new JLabel("PRESS LEFT OR RIGHT WITH YOUR KEYPAD TO SEE MORE ANIMATIONS");
    }

    public void setUpGUI() {
        Container cp = frame.getContentPane();
        frame.setTitle("Project1-Wang-Alec-185292");
        cp.add(canvas, BorderLayout.CENTER);
        panel2.add(closeButton);
        panel1.add(label);
        cp.add(panel1, BorderLayout.NORTH);
        cp.add(panel2, BorderLayout.SOUTH);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void startAnimation() {
        for (int i = 0; i < 40; i++) {
            canvas.getDrawings().get(canvas.getDrawings().size() - 2).adjustX(-10);
            canvas.getDrawings().get(canvas.getDrawings().size() - 1).adjustX(10);
            canvas.repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            for (int i = 5; i < 11; i++) {
                NinjaStar temp = (NinjaStar) canvas.getDrawings().get(i);
                Sharingan temp2 = (Sharingan) canvas.getDrawings().get(11);
                temp.adjustRotation(speed);
                temp2.adjustRotation(speed);
                Circle tempCircle = (Circle) canvas.getDrawings().get(3);
                if (second && !third) {
                    tempCircle.setColor(new Color(173, 216, 230));
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                }
                canvas.repaint();
                if (second && !third) {
                    tempCircle.setColor(Color.BLUE);
                }
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                }
                canvas.repaint();
            }
        }

    }

    class al implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object o = e.getSource();
            if (o == closeButton && isOpen == true) {
                canvas.getDrawings().get(canvas.getDrawings().size() - 2).adjustX(400);
                canvas.getDrawings().get(canvas.getDrawings().size() - 1).adjustX(-400);
                canvas.repaint();
                closeButton.setText("Open");
                isOpen = false;
            } else if (o == closeButton && isOpen == false) {
                canvas.getDrawings().get(canvas.getDrawings().size() - 2).adjustX(-400);
                canvas.getDrawings().get(canvas.getDrawings().size() - 1).adjustX(400);
                canvas.repaint();
                closeButton.setText("Close");
                isOpen = true;
            }
        }
    }

    public void setUpButtonListener() {
        al actionListener = new al();
        closeButton.addActionListener(actionListener);

        closeButton.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                Triangle triangleObject = (Triangle) canvas.getDrawings().get(4);
                if (keyCode == KeyEvent.VK_RIGHT && triangleObject.getRotation() != -45) {
                    triangleObject.adjustRotation(-45);
                    if (triangleObject.getRotation() > -1 && triangleObject.getRotation() < 45) {
                        Circle temp = (Circle) canvas.getDrawings().get(3);
                        temp.setColor(Color.WHITE);
                        second = true;
                        for (int i = 5; i < 11; i++) {
                            NinjaStar temp1 = (NinjaStar) canvas.getDrawings().get(i);
                            temp1.setColor(Color.GRAY);
                        }
                    } else if (triangleObject.getRotation() < -1) {
                        third = true;
                        for (int i = 5; i < 11; i++) {
                            NinjaStar temp = (NinjaStar) canvas.getDrawings().get(i);
                            temp.setColor(Color.WHITE);
                        }
                        sleepTime = 50;
                        Sharingan temp1 = (Sharingan) canvas.getDrawings().get(11);
                        temp1.setColor(Color.BLACK);
                        Circle temp2 = (Circle) canvas.getDrawings().get(3);
                        temp2.setColor(Color.BLACK);
                    }
                    canvas.repaint();
                }

                else if (keyCode == KeyEvent.VK_LEFT && triangleObject.getRotation() != 45) {
                    triangleObject.adjustRotation(45);
                    if (triangleObject.getRotation() > 0) {
                        Circle temp = (Circle) canvas.getDrawings().get(3);
                        temp.setColor(Color.RED);
                        second = false;
                        for (int i = 5; i < 11; i++) {
                            NinjaStar temp1 = (NinjaStar) canvas.getDrawings().get(i);
                            temp1.setColor(Color.WHITE);
                        }
                    } else if (triangleObject.getRotation() == 0) {
                        third = false;
                        for (int i = 5; i < 11; i++) {
                            NinjaStar temp = (NinjaStar) canvas.getDrawings().get(i);
                            temp.setColor(Color.GRAY);
                        }
                        sleepTime = 10;
                        Sharingan temp1 = (Sharingan) canvas.getDrawings().get(11);
                        temp1.setColor(Color.WHITE);
                    }
                    canvas.repaint();
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
}