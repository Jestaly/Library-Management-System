
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LibraryManagement extends JFrame {

    LibraryManagement() {
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
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
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

        // TITLE
        JLabel title = new JLabel("LIBRARY MANAGEMENT SYSTEM");
        title.setForeground(new Color(126, 99, 99));
        title.setFont(new Font("Dialog", Font.BOLD, 50));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.CENTER);
        title.setBounds(-48, 50, 1280, 50);
        homePanel.add(title);

        // ITEM LABELS
        JLabel totalNumBooksLabel = new JLabel("Total Books");
        totalNumBooksLabel.setForeground(new Color(228, 224, 225));
        totalNumBooksLabel.setFont(new Font("Dialog", Font.BOLD, 30));
        totalNumBooksLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalNumBooksLabel.setVerticalAlignment(SwingConstants.CENTER);
        totalNumBooksLabel.setBounds(25, 40, 250, 50);
        totalNumBooksDisplay.add(totalNumBooksLabel);

        JLabel totalNumAvailBooksLabel = new JLabel("Available Books");
        totalNumAvailBooksLabel.setForeground(new Color(228, 224, 225));
        totalNumAvailBooksLabel.setFont(new Font("Dialog", Font.BOLD, 30));
        totalNumAvailBooksLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalNumAvailBooksLabel.setVerticalAlignment(SwingConstants.CENTER);
        totalNumAvailBooksLabel.setBounds(25, 40, 250, 50);
        totalNumAvailBooksDisplay.add(totalNumAvailBooksLabel);

        JLabel totalPriceBooksLabel = new JLabel("Total Price");
        totalPriceBooksLabel.setForeground(new Color(228, 224, 225));
        totalPriceBooksLabel.setFont(new Font("Dialog", Font.BOLD, 30));
        totalPriceBooksLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalPriceBooksLabel.setVerticalAlignment(SwingConstants.CENTER);
        totalPriceBooksLabel.setBounds(25, 40, 250, 50);
        totalPriceBooksDisplay.add(totalPriceBooksLabel);

        JLabel totalNumMembersLabel = new JLabel("Members");
        totalNumMembersLabel.setForeground(new Color(228, 224, 225));
        totalNumMembersLabel.setFont(new Font("Dialog", Font.BOLD, 30));
        totalNumMembersLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalNumMembersLabel.setVerticalAlignment(SwingConstants.CENTER);
        totalNumMembersLabel.setBounds(25, 40, 250, 50);
        totalNumMembersDisplay.add(totalNumMembersLabel);

        JLabel totalNumBorrowersLabel = new JLabel("Borrowers");
        totalNumBorrowersLabel.setForeground(new Color(228, 224, 225));
        totalNumBorrowersLabel.setFont(new Font("Dialog", Font.BOLD, 30));
        totalNumBorrowersLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalNumBorrowersLabel.setVerticalAlignment(SwingConstants.CENTER);
        totalNumBorrowersLabel.setBounds(25, 40, 250, 50);
        totalNumBorrowersDisplay.add(totalNumBorrowersLabel);

        JLabel totalNumStaffsLabel = new JLabel("Staffs");
        totalNumStaffsLabel.setForeground(new Color(228, 224, 225));
        totalNumStaffsLabel.setFont(new Font("Dialog", Font.BOLD, 30));
        totalNumStaffsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalNumStaffsLabel.setVerticalAlignment(SwingConstants.CENTER);
        totalNumStaffsLabel.setBounds(25, 40, 250, 50);
        totalNumStaffsDisplay.add(totalNumStaffsLabel);

        // ITEM COUNTS
        JLabel totalNumBooks = new JLabel("2890");
        totalNumBooks.setForeground(new Color(228, 224, 225));
        totalNumBooks.setFont(new Font("Dialog", Font.PLAIN, 50));
        totalNumBooks.setHorizontalAlignment(SwingConstants.CENTER);
        totalNumBooks.setVerticalAlignment(SwingConstants.CENTER);
        totalNumBooks.setBounds(25, 90, 250, 50);
        totalNumBooksDisplay.add(totalNumBooks);

        JLabel totalNumAvailBooks = new JLabel("2305");
        totalNumAvailBooks.setForeground(new Color(228, 224, 225));
        totalNumAvailBooks.setFont(new Font("Dialog", Font.PLAIN, 50));
        totalNumAvailBooks.setHorizontalAlignment(SwingConstants.CENTER);
        totalNumAvailBooks.setVerticalAlignment(SwingConstants.CENTER);
        totalNumAvailBooks.setBounds(25, 90, 250, 50);
        totalNumAvailBooksDisplay.add(totalNumAvailBooks);

        JLabel totalPriceBooks = new JLabel("$153,200");
        totalPriceBooks.setForeground(new Color(228, 224, 225));
        totalPriceBooks.setFont(new Font("Dialog", Font.PLAIN, 50));
        totalPriceBooks.setHorizontalAlignment(SwingConstants.CENTER);
        totalPriceBooks.setVerticalAlignment(SwingConstants.CENTER);
        totalPriceBooks.setBounds(25, 90, 250, 50);
        totalPriceBooksDisplay.add(totalPriceBooks);

        JLabel totalNumMembers = new JLabel("207");
        totalNumMembers.setForeground(new Color(228, 224, 225));
        totalNumMembers.setFont(new Font("Dialog", Font.PLAIN, 50));
        totalNumMembers.setHorizontalAlignment(SwingConstants.CENTER);
        totalNumMembers.setVerticalAlignment(SwingConstants.CENTER);
        totalNumMembers.setBounds(25, 90, 250, 50);
        totalNumMembersDisplay.add(totalNumMembers);

        JLabel totalNumBorrowers = new JLabel("360");
        totalNumBorrowers.setForeground(new Color(228, 224, 225));
        totalNumBorrowers.setFont(new Font("Dialog", Font.PLAIN, 50));
        totalNumBorrowers.setHorizontalAlignment(SwingConstants.CENTER);
        totalNumBorrowers.setVerticalAlignment(SwingConstants.CENTER);
        totalNumBorrowers.setBounds(25, 90, 250, 50);
        totalNumBorrowersDisplay.add(totalNumBorrowers);

        JLabel totalNumStaffs = new JLabel("15");
        totalNumStaffs.setForeground(new Color(228, 224, 225));
        totalNumStaffs.setFont(new Font("Dialog", Font.PLAIN, 50));
        totalNumStaffs.setHorizontalAlignment(SwingConstants.CENTER);
        totalNumStaffs.setVerticalAlignment(SwingConstants.CENTER);
        totalNumStaffs.setBounds(25, 90, 250, 50);
        totalNumStaffsDisplay.add(totalNumStaffs);

        // SEARCH BUTTON
        JLabel searchButton = new JLabel();
        searchButton.setSize(60, 60);
        searchButton.setLocation(20, 100);
        ImageIcon searchIcon = new ImageIcon("Library Management System/src/Icons/search.png");
        Image searchImage = searchIcon.getImage();
        Image searchScale = searchImage.getScaledInstance(searchButton.getWidth(), searchButton.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon scaledSearch = new ImageIcon(searchScale);
        searchButton.setIcon(scaledSearch);
        searchButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

        });

        sidePanel.add(searchButton);

        // BOOK SECTION
        JLabel bookButton = new JLabel();
        bookButton.setSize(60, 60);
        bookButton.setLocation(20, 210);
        ImageIcon bookIcon = new ImageIcon("Library Management System/src/Icons/book.png");
        Image bookImage = bookIcon.getImage();
        Image bookScale = bookImage.getScaledInstance(bookButton.getWidth(), bookButton.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon scaledBook = new ImageIcon(bookScale);
        bookButton.setIcon(scaledBook);
        bookButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

        });
        sidePanel.add(bookButton);

        // MEMBER SECTION
        JLabel memberButton = new JLabel();
        memberButton.setSize(60, 60);
        memberButton.setLocation(20, 330);
        ImageIcon memberIcon = new ImageIcon("Library Management System/src/Icons/member.png");
        Image memberImage = memberIcon.getImage();
        Image memberScale = memberImage.getScaledInstance(memberButton.getWidth(), memberButton.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon scaledMember = new ImageIcon(memberScale);
        memberButton.setIcon(scaledMember);
        memberButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

        });
        sidePanel.add(memberButton);

        // STAFF SECTION
        JLabel staffButton = new JLabel();
        staffButton.setSize(60, 60);
        staffButton.setLocation(20, 450);
        ImageIcon staffIcon = new ImageIcon("Library Management System/src/Icons/staff.png");
        Image staffImage = staffIcon.getImage();
        Image staffScale = staffImage.getScaledInstance(staffButton.getWidth(), staffButton.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon scaledStaff = new ImageIcon(staffScale);
        staffButton.setIcon(scaledStaff);
        staffButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

        });
        sidePanel.add(staffButton);

        // BORROWER SECTION
        JLabel borrowerButton = new JLabel();
        borrowerButton.setSize(60, 60);
        borrowerButton.setLocation(20, 570);
        ImageIcon borrowerIcon = new ImageIcon("Library Management System/src/Icons/borrower.png");
        Image borrowerImage = borrowerIcon.getImage();
        Image borrowerScale = borrowerImage.getScaledInstance(borrowerButton.getWidth(), borrowerButton.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon scaledBorrower = new ImageIcon(borrowerScale);
        borrowerButton.setIcon(scaledBorrower);
        borrowerButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

        });
        sidePanel.add(borrowerButton);
    }
}
