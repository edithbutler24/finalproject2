import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static int select = 0;

public static JLabel hintLabel;
    public static void main(String[] args) {
        // start screen
        BorderLayout layout = new BorderLayout();
        layout.setHgap(5);
        layout.setVgap(2);
    JFrame startFrame = new JFrame();
    startFrame.setSize(300, 250);
    JPanel startPanel = new JPanel(layout);

        int score=0;
        JLabel welcome = new JLabel("Welcome to ChromaQuest");
        JLabel scoreLabel = new JLabel("Close = +1 point     Right on = +3 points" );
        JButton start = new JButton("Press to Start ");
start.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame game = new JFrame();
        game.setSize(1000,1000);

        JPanel mainPanel = new JPanel(new BorderLayout());
        gamePanel gameP = new gamePanel();
        JPanel hintPanel = new JPanel();
       hintLabel= new JLabel(gamePanel.correct.getHint() + "       Score: 0");
System.out.print(gamePanel.correct.getIndex());
        hintPanel.add(hintLabel);
        mainPanel.add(gameP, BorderLayout.CENTER);
        mainPanel.add(hintPanel, BorderLayout.SOUTH);
        game.add(mainPanel);
        game.setVisible(true);
        }
    });

        startPanel.add(welcome, BorderLayout.NORTH);
        startPanel.add(scoreLabel, BorderLayout.SOUTH);
        startPanel.add(start, BorderLayout.CENTER);
        startFrame.add(startPanel);
        startFrame.setVisible(true);


    }
}