import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class test41 extends JFrame {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 500;
    private static final int TOTAL_DISKS = 4;

    private final List<List<Integer>> rods = new ArrayList<>();
    private final JPanel canvas;

    public test41() {
        setTitle("Tower of Hanoi");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        for (int i = 0; i < 3; i++) {
            rods.add(new ArrayList<>());
        }

        for (int i = TOTAL_DISKS; i > 0; i--) {
            rods.get(0).add(i);
        }

        canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                renderGraphics(g);
            }
        };
        canvas.setBackground(new Color(245, 245, 245));
        add(canvas);

        setVisible(true);

        new Thread(this::initiateAnimation).start();
    }

    private void initiateAnimation() {
        try {
            Thread.sleep(1200);
            computeMoves(TOTAL_DISKS, 0, 2, 1);
        } catch (Exception ignored) {

        }
    }

    private void computeMoves(int n, int from, int to, int aux) throws InterruptedException {
        if (n == 1) {
            executeVisualMove(from, to);
            return;
        }
        computeMoves(n - 1, from, aux, to);
        executeVisualMove(from, to);
        computeMoves(n - 1, aux, to, from);
    }

    private void executeVisualMove(int from, int to) throws InterruptedException {
        List<Integer> fromRod = rods.get(from);
        List<Integer> toRod = rods.get(to);

        if (!fromRod.isEmpty()) {
            int disk = fromRod.remove(fromRod.size() - 1);
            toRod.add(disk);

            canvas.repaint();

            Thread.sleep(750);
        }
    }

    private void renderGraphics(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int spacing = WINDOW_WIDTH / 4;
        int baseHeight = 20;
        int poleWidth = 12;
        int poleHeight = 240;
        int baselineY = WINDOW_HEIGHT - 120;

        g2.setColor(new Color(120, 80, 50));
        g2.fillRect(60, baselineY, WINDOW_WIDTH - 120, baseHeight);

        g2.setColor(new Color(70, 80, 90));
        for (int i = 0; i < 3; i++) {
            int poleX = (i + 1) * spacing;
            g2.fillRect(poleX - (poleWidth / 2), baselineY - poleHeight, poleWidth, poleHeight);
        }

        int diskThickness = 22;
        for (int i = 0; i < 3; i++) {
            int poleX = (i + 1) * spacing;
            List<Integer> currentRod = rods.get(i);

            for (int j = 0; j < currentRod.size(); j++) {
                int diskValue = currentRod.get(j);

                int diskWidth = diskValue * 35 + 45;
                int diskX = poleX - (diskWidth / 2);
                int diskY = baselineY - ((j + 1) * diskThickness);

                g2.setColor(new Color((diskValue * 60) % 256, 120, 200 - (diskValue * 20)));
                g2.fillRoundRect(diskX, diskY, diskWidth, diskThickness - 2, 6, 6);

                g2.setColor(new Color(40, 40, 40));
                g2.drawRoundRect(diskX, diskY, diskWidth, diskThickness - 2, 6, 6);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(test41::new);
    }
}
