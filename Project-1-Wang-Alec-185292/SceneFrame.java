import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SceneFrame {
    private JFrame frame;
    private SceneCanvas canvas;
    private JButton closeButton;
    private JButton lightningButton;
    private JPanel panel;
    private Boolean isOpen;

    public SceneFrame() {
        frame = new JFrame();
        canvas = new SceneCanvas(new Color(135, 206, 235));
        closeButton = new JButton("Close");
        panel = new JPanel();
        isOpen = true;

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
        for (int i = 0; i < 4000; i++) {
            canvas.getDrawings().get(canvas.getDrawings().size() - 3).adjustX(-5);
            canvas.getDrawings().get(canvas.getDrawings().size() - 4).adjustX(-5);
            canvas.getDrawings().get(canvas.getDrawings().size() - 5).adjustX(-5);
            canvas.getDrawings().get(canvas.getDrawings().size() - 6).adjustX(-5);
            canvas.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            canvas.getDrawings().get(canvas.getDrawings().size() - 3).adjustX(5);
            canvas.getDrawings().get(canvas.getDrawings().size() - 4).adjustX(5);
            canvas.getDrawings().get(canvas.getDrawings().size() - 5).adjustX(5);
            canvas.getDrawings().get(canvas.getDrawings().size() - 6).adjustX(5);
            canvas.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            canvas.getDrawings().get(canvas.getDrawings().size() - 3).adjustX(5);
            canvas.getDrawings().get(canvas.getDrawings().size() - 4).adjustX(5);
            canvas.getDrawings().get(canvas.getDrawings().size() - 5).adjustX(5);
            canvas.getDrawings().get(canvas.getDrawings().size() - 6).adjustX(5);
            canvas.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            canvas.getDrawings().get(canvas.getDrawings().size() - 3).adjustX(-5);
            canvas.getDrawings().get(canvas.getDrawings().size() - 4).adjustX(-5);
            canvas.getDrawings().get(canvas.getDrawings().size() - 5).adjustX(-5);
            canvas.getDrawings().get(canvas.getDrawings().size() - 6).adjustX(-5);
            canvas.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void setUpButtonListener() {
        ActionListener bl = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object o = e.getSource();
                if (o == closeButton && isOpen == true) {
                    closeButton.setText("Open");
                    for (int i = 0; i < 40; i++) {
                        canvas.getDrawings().get(canvas.getDrawings().size() - 2).adjustX(10);
                        canvas.getDrawings().get(canvas.getDrawings().size() - 1).adjustX(-10);
                        canvas.repaint();
                        try {
                            Thread.sleep(30);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }
                    isOpen = false;
                } else if (o == closeButton && isOpen == false) {
                    for (int i = 0; i < 40; i++) {
                        closeButton.setText("Close");
                        canvas.getDrawings().get(canvas.getDrawings().size() - 2).adjustX(-10);
                        canvas.getDrawings().get(canvas.getDrawings().size() - 1).adjustX(10);
                        canvas.repaint();
                        try {
                            Thread.sleep(30);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                    isOpen = true;
                }
            }
        };
        closeButton.addActionListener(bl);
    }
}