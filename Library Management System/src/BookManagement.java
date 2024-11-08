
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BookManagement extends JFrame {

    BookManagement() {
        super("Book Management System");

        setSize(1280, 720);
        setUndecorated(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        frameLayout();
        setVisible(true);
    }

    public void frameLayout() {
        JPanel sidePanel = new JPanel();

        sidePanel.setSize(100, 720);
        sidePanel.setBackground(new Color(62, 50, 50));
        sidePanel.setLayout(null);
        add(sidePanel);

        JPanel homePanel = new JPanel();
        homePanel.setBackground(new Color(228, 224, 225));
        homePanel.setLayout(null);
        homePanel.setBounds(100, 0, 1180, 720);
        add(homePanel);

        JLabel exitButton = new JLabel();
        exitButton.setSize(50, 50);
        exitButton.setLocation(1100, 20);
        ImageIcon exitIcon = new ImageIcon("Library Management System/src/Icons/close.png");
        Image exitImage = exitIcon.getImage();
        Image exitScale = exitImage.getScaledInstance(exitButton.getWidth(), exitButton.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon scaledExit = new ImageIcon(exitScale);
        exitButton.setIcon(scaledExit);
        exitButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });

        JPanel totalNumBooksDisplay = new JPanel();
        totalNumBooksDisplay.setBounds(80, 130, 300, 200);
        totalNumBooksDisplay.setBackground(new Color(126, 99, 99));

        JPanel totalNumAvailBooksDisplay = new JPanel();
        totalNumAvailBooksDisplay.setBounds(440, 130, 300, 200);
        totalNumAvailBooksDisplay.setBackground(new Color(126, 99, 99));

        JPanel totalPriceBooksDisplay = new JPanel();
        totalPriceBooksDisplay.setBounds(800, 130, 300, 200);
        totalPriceBooksDisplay.setBackground(new Color(126, 99, 99));

        JPanel totalNumMembersDisplay = new JPanel();
        totalNumMembersDisplay.setBounds(80, 390, 300, 200);
        totalNumMembersDisplay.setBackground(new Color(126, 99, 99));

        JPanel totalNumBorrowersDisplay = new JPanel();
        totalNumBorrowersDisplay.setBounds(440, 390, 300, 200);
        totalNumBorrowersDisplay.setBackground(new Color(126, 99, 99));

        JPanel totalNumStaffsDisplay = new JPanel();
        totalNumStaffsDisplay.setBounds(800, 390, 300, 200);
        totalNumStaffsDisplay.setBackground(new Color(126, 99, 99));

        homePanel.add(totalNumBooksDisplay);
        homePanel.add(totalNumAvailBooksDisplay);
        homePanel.add(totalPriceBooksDisplay);
        homePanel.add(totalNumMembersDisplay);
        homePanel.add(totalNumBorrowersDisplay);
        homePanel.add(totalNumStaffsDisplay);
        homePanel.add(exitButton);

    }
}
