import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SceneFrame {
    private JFrame frame;
    private SceneCanvas canvas;
    private JButton closeButton;
    private JPanel panel;
    private Boolean isOpen;
    private int speed;

    public SceneFrame() {
        frame = new JFrame();
        canvas = new SceneCanvas(new Color(135, 206, 235));
        closeButton = new JButton("Close");
        panel = new JPanel();
        isOpen = true;
        speed = 65;
    }

    public void setUpGUI() {
        Container cp = frame.getContentPane();
        frame.setTitle("Project1-Wang-Alec-185292");
        cp.add(canvas, BorderLayout.CENTER);
        panel.add(closeButton);
        cp.add(panel, BorderLayout.SOUTH);
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
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            for (int i = 5; i < 11; i++) {
                NinjaStar temp = (NinjaStar) canvas.getDrawings().get(i);
                temp.adjustRotation(speed);
                canvas.repaint();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException f) {
                    f.printStackTrace();
                }
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
                    canvas.repaint();
                    if (triangleObject.getRotation() > -45 && triangleObject.getRotation() < 45) {
                        Circle temp = (Circle) canvas.getDrawings().get(3);
                        temp.setColor(Color.WHITE);
                        canvas.repaint();
                        for (int i = 5; i < 11; i++) {
                            NinjaStar temp1 = (NinjaStar) canvas.getDrawings().get(i);
                            temp1.setColor(Color.GRAY);
                            canvas.repaint();
                        }
                    }
                }

                else if (keyCode == KeyEvent.VK_LEFT && triangleObject.getRotation() != 45) {
                    triangleObject.adjustRotation(45);
                    canvas.repaint();
                    if (triangleObject.getRotation() > 0) {
                        Circle temp = (Circle) canvas.getDrawings().get(3);
                        temp.setColor(Color.RED);
                        canvas.repaint();
                        for (int i = 5; i < 11; i++) {
                            NinjaStar temp1 = (NinjaStar) canvas.getDrawings().get(i);
                            temp1.setColor(Color.WHITE);
                            canvas.repaint();
                        }
                    }
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