
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
        totalNumBooksDisplay.setLayout(null);
        totalNumBooksDisplay.setBounds(80, 130, 300, 200);
        totalNumBooksDisplay.setBackground(new Color(126, 99, 99));

        JPanel totalNumAvailBooksDisplay = new JPanel();
        totalNumAvailBooksDisplay.setLayout(null);
        totalNumAvailBooksDisplay.setBounds(440, 130, 300, 200);
        totalNumAvailBooksDisplay.setBackground(new Color(126, 99, 99));

        JPanel totalPriceBooksDisplay = new JPanel();
        totalPriceBooksDisplay.setLayout(null);
        totalPriceBooksDisplay.setBounds(800, 130, 300, 200);
        totalPriceBooksDisplay.setBackground(new Color(126, 99, 99));

        JPanel totalNumMembersDisplay = new JPanel();
        totalNumMembersDisplay.setLayout(null);
        totalNumMembersDisplay.setBounds(80, 390, 300, 200);
        totalNumMembersDisplay.setBackground(new Color(126, 99, 99));

        JPanel totalNumBorrowersDisplay = new JPanel();
        totalNumBorrowersDisplay.setLayout(null);
        totalNumBorrowersDisplay.setBounds(440, 390, 300, 200);
        totalNumBorrowersDisplay.setBackground(new Color(126, 99, 99));

        JPanel totalNumStaffsDisplay = new JPanel();
        totalNumStaffsDisplay.setLayout(null);
        totalNumStaffsDisplay.setBounds(800, 390, 300, 200);
        totalNumStaffsDisplay.setBackground(new Color(126, 99, 99));

        homePanel.add(totalNumBooksDisplay);
        homePanel.add(totalNumAvailBooksDisplay);
        homePanel.add(totalPriceBooksDisplay);
        homePanel.add(totalNumMembersDisplay);
        homePanel.add(totalNumBorrowersDisplay);
        homePanel.add(totalNumStaffsDisplay);
        homePanel.add(exitButton);

        JLabel totalNumBooks = new JLabel("2890");
        totalNumBooks.setFont(new Font("Dialog", Font.PLAIN, 50));
        totalNumBooks.setHorizontalAlignment(SwingConstants.CENTER);
        totalNumBooks.setVerticalAlignment(SwingConstants.CENTER);
        totalNumBooks.setBounds(25, 90, 250, 50);
        totalNumBooksDisplay.add(totalNumBooks);

        JLabel totalNumAvailBooks = new JLabel("2305");
        totalNumAvailBooks.setFont(new Font("Dialog", Font.PLAIN, 50));
        totalNumAvailBooks.setHorizontalAlignment(SwingConstants.CENTER);
        totalNumAvailBooks.setVerticalAlignment(SwingConstants.CENTER);
        totalNumAvailBooks.setBounds(25, 90, 250, 50);
        totalNumAvailBooksDisplay.add(totalNumAvailBooks);

        JLabel totalPriceBooks = new JLabel("$153,200");
        totalPriceBooks.setFont(new Font("Dialog", Font.PLAIN, 50));
        totalPriceBooks.setHorizontalAlignment(SwingConstants.CENTER);
        totalPriceBooks.setVerticalAlignment(SwingConstants.CENTER);
        totalPriceBooks.setBounds(25, 90, 250, 50);
        totalPriceBooksDisplay.add(totalPriceBooks);

        JLabel totalNumMembers = new JLabel("207");
        totalNumMembers.setFont(new Font("Dialog", Font.PLAIN, 50));
        totalNumMembers.setHorizontalAlignment(SwingConstants.CENTER);
        totalNumMembers.setVerticalAlignment(SwingConstants.CENTER);
        totalNumMembers.setBounds(25, 90, 250, 50);
        totalNumMembersDisplay.add(totalNumMembers);

        JLabel totalNumBorrowers = new JLabel("360");
        totalNumBorrowers.setFont(new Font("Dialog", Font.PLAIN, 50));
        totalNumBorrowers.setHorizontalAlignment(SwingConstants.CENTER);
        totalNumBorrowers.setVerticalAlignment(SwingConstants.CENTER);
        totalNumBorrowers.setBounds(25, 90, 250, 50);
        totalNumBorrowersDisplay.add(totalNumBorrowers);

        JLabel totalNumStaffs = new JLabel("15");
        totalNumStaffs.setFont(new Font("Dialog", Font.PLAIN, 50));
        totalNumStaffs.setHorizontalAlignment(SwingConstants.CENTER);
        totalNumStaffs.setVerticalAlignment(SwingConstants.CENTER);
        totalNumStaffs.setBounds(25, 90, 250, 50);
        totalNumStaffsDisplay.add(totalNumStaffs);

    }
}
