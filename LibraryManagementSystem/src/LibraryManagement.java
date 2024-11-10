
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import INITIAL.CONSTANTS;

public class LibraryManagement extends JFrame {

        LibraryManagement() {
                super("Book Management System");

                setSize(CONSTANTS.MAIN_DIMENSIONS[0], CONSTANTS.MAIN_DIMENSIONS[1]);
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

                sidePanel.setSize(CONSTANTS.SIDE_DIMENSIONS[0], CONSTANTS.SIDE_DIMENSIONS[1]);
                sidePanel.setBackground(
                                new Color(CONSTANTS.SIDE_COLOR[0], CONSTANTS.SIDE_COLOR[1], CONSTANTS.SIDE_COLOR[2]));
                sidePanel.setLayout(null);
                add(sidePanel);

                JPanel homePanel = new JPanel();
                homePanel.setBackground(
                                new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
                homePanel.setLayout(null);
                homePanel.setBounds(100, 0, 1180, 720);
                add(homePanel);

                JLabel exitButton = new JLabel();
                exitButton.setSize(50, 50);
                exitButton.setLocation(1100, 20);
                ImageIcon exitIcon = new ImageIcon("LibraryManagementSystem/src/Icons/close.png");
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
                totalNumBooksDisplay
                                .setBackground(new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1],
                                                CONSTANTS.TAB_COLOR[2]));

                JPanel totalNumAvailBooksDisplay = new JPanel();
                totalNumAvailBooksDisplay.setLayout(null);
                totalNumAvailBooksDisplay.setBounds(440, 130, 300, 200);
                totalNumAvailBooksDisplay
                                .setBackground(new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1],
                                                CONSTANTS.TAB_COLOR[2]));

                JPanel totalPriceBooksDisplay = new JPanel();
                totalPriceBooksDisplay.setLayout(null);
                totalPriceBooksDisplay.setBounds(800, 130, 300, 200);
                totalPriceBooksDisplay
                                .setBackground(new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1],
                                                CONSTANTS.TAB_COLOR[2]));

                JPanel totalNumMembersDisplay = new JPanel();
                totalNumMembersDisplay.setLayout(null);
                totalNumMembersDisplay.setBounds(80, 390, 300, 200);
                totalNumMembersDisplay
                                .setBackground(new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1],
                                                CONSTANTS.TAB_COLOR[2]));

                JPanel totalNumBorrowersDisplay = new JPanel();
                totalNumBorrowersDisplay.setLayout(null);
                totalNumBorrowersDisplay.setBounds(440, 390, 300, 200);
                totalNumBorrowersDisplay
                                .setBackground(new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1],
                                                CONSTANTS.TAB_COLOR[2]));

                JPanel totalNumStaffsDisplay = new JPanel();
                totalNumStaffsDisplay.setLayout(null);
                totalNumStaffsDisplay.setBounds(800, 390, 300, 200);
                totalNumStaffsDisplay
                                .setBackground(new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1],
                                                CONSTANTS.TAB_COLOR[2]));

                homePanel.add(totalNumBooksDisplay);
                homePanel.add(totalNumAvailBooksDisplay);
                homePanel.add(totalPriceBooksDisplay);
                homePanel.add(totalNumMembersDisplay);
                homePanel.add(totalNumBorrowersDisplay);
                homePanel.add(totalNumStaffsDisplay);
                homePanel.add(exitButton);

                // TITLE
                JLabel title = new JLabel("LIBRARY MANAGEMENT SYSTEM");
                title.setForeground(new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1], CONSTANTS.TAB_COLOR[2]));
                title.setFont(new Font("Dialog", Font.BOLD, 50));
                title.setHorizontalAlignment(SwingConstants.CENTER);
                title.setVerticalAlignment(SwingConstants.CENTER);
                title.setBounds(-48, 50, 1280, 50);
                homePanel.add(title);

                // ITEM LABELS
                JLabel totalNumBooksLabel = new JLabel("Total Books");
                totalNumBooksLabel
                                .setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1],
                                                CONSTANTS.MAIN_COLOR[2]));
                totalNumBooksLabel.setFont(new Font("Dialog", Font.BOLD, 30));
                totalNumBooksLabel.setHorizontalAlignment(SwingConstants.CENTER);
                totalNumBooksLabel.setVerticalAlignment(SwingConstants.CENTER);
                totalNumBooksLabel.setBounds(CONSTANTS.LABEL_POS[0], CONSTANTS.LABEL_POS[1], CONSTANTS.LABEL_POS[2],
                                CONSTANTS.LABEL_POS[3]);
                totalNumBooksDisplay.add(totalNumBooksLabel);

                JLabel totalNumAvailBooksLabel = new JLabel("Available Books");
                totalNumAvailBooksLabel
                                .setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1],
                                                CONSTANTS.MAIN_COLOR[2]));
                totalNumAvailBooksLabel.setFont(new Font("Dialog", Font.BOLD, 30));
                totalNumAvailBooksLabel.setHorizontalAlignment(SwingConstants.CENTER);
                totalNumAvailBooksLabel.setVerticalAlignment(SwingConstants.CENTER);
                totalNumAvailBooksLabel.setBounds(CONSTANTS.LABEL_POS[0], CONSTANTS.LABEL_POS[1],
                                CONSTANTS.LABEL_POS[2],
                                CONSTANTS.LABEL_POS[3]);
                totalNumAvailBooksDisplay.add(totalNumAvailBooksLabel);

                JLabel totalPriceBooksLabel = new JLabel("Total Price");
                totalPriceBooksLabel
                                .setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1],
                                                CONSTANTS.MAIN_COLOR[2]));
                totalPriceBooksLabel.setFont(new Font("Dialog", Font.BOLD, 30));
                totalPriceBooksLabel.setHorizontalAlignment(SwingConstants.CENTER);
                totalPriceBooksLabel.setVerticalAlignment(SwingConstants.CENTER);
                totalPriceBooksLabel.setBounds(CONSTANTS.LABEL_POS[0], CONSTANTS.LABEL_POS[1], CONSTANTS.LABEL_POS[2],
                                CONSTANTS.LABEL_POS[3]);
                totalPriceBooksDisplay.add(totalPriceBooksLabel);

                JLabel totalNumMembersLabel = new JLabel("Members");
                totalNumMembersLabel
                                .setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1],
                                                CONSTANTS.MAIN_COLOR[2]));
                totalNumMembersLabel.setFont(new Font("Dialog", Font.BOLD, 30));
                totalNumMembersLabel.setHorizontalAlignment(SwingConstants.CENTER);
                totalNumMembersLabel.setVerticalAlignment(SwingConstants.CENTER);
                totalNumMembersLabel.setBounds(CONSTANTS.LABEL_POS[0], CONSTANTS.LABEL_POS[1], CONSTANTS.LABEL_POS[2],
                                CONSTANTS.LABEL_POS[3]);
                totalNumMembersDisplay.add(totalNumMembersLabel);

                JLabel totalNumBorrowersLabel = new JLabel("Borrowers");
                totalNumBorrowersLabel
                                .setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1],
                                                CONSTANTS.MAIN_COLOR[2]));
                totalNumBorrowersLabel.setFont(new Font("Dialog", Font.BOLD, 30));
                totalNumBorrowersLabel.setHorizontalAlignment(SwingConstants.CENTER);
                totalNumBorrowersLabel.setVerticalAlignment(SwingConstants.CENTER);
                totalNumBorrowersLabel.setBounds(CONSTANTS.LABEL_POS[0], CONSTANTS.LABEL_POS[1], CONSTANTS.LABEL_POS[2],
                                CONSTANTS.LABEL_POS[3]);
                totalNumBorrowersDisplay.add(totalNumBorrowersLabel);

                JLabel totalNumStaffsLabel = new JLabel("Staffs");
                totalNumStaffsLabel
                                .setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1],
                                                CONSTANTS.MAIN_COLOR[2]));
                totalNumStaffsLabel.setFont(new Font("Dialog", Font.BOLD, 30));
                totalNumStaffsLabel.setHorizontalAlignment(SwingConstants.CENTER);
                totalNumStaffsLabel.setVerticalAlignment(SwingConstants.CENTER);
                totalNumStaffsLabel.setBounds(CONSTANTS.LABEL_POS[0], CONSTANTS.LABEL_POS[1], CONSTANTS.LABEL_POS[2],
                                CONSTANTS.LABEL_POS[3]);
                totalNumStaffsDisplay.add(totalNumStaffsLabel);

                // ITEM COUNTS
                JLabel totalNumBooks = new JLabel("2890");
                totalNumBooks
                                .setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1],
                                                CONSTANTS.MAIN_COLOR[2]));
                totalNumBooks.setFont(new Font("Dialog", Font.PLAIN, 50));
                totalNumBooks.setHorizontalAlignment(SwingConstants.CENTER);
                totalNumBooks.setVerticalAlignment(SwingConstants.CENTER);
                totalNumBooks.setBounds(CONSTANTS.COUNT_POS[0], CONSTANTS.COUNT_POS[1], CONSTANTS.COUNT_POS[2],
                                CONSTANTS.COUNT_POS[3]);
                totalNumBooksDisplay.add(totalNumBooks);

                JLabel totalNumAvailBooks = new JLabel("2305");
                totalNumAvailBooks
                                .setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1],
                                                CONSTANTS.MAIN_COLOR[2]));
                totalNumAvailBooks.setFont(new Font("Dialog", Font.PLAIN, 50));
                totalNumAvailBooks.setHorizontalAlignment(SwingConstants.CENTER);
                totalNumAvailBooks.setVerticalAlignment(SwingConstants.CENTER);
                totalNumAvailBooks.setBounds(CONSTANTS.COUNT_POS[0], CONSTANTS.COUNT_POS[1], CONSTANTS.COUNT_POS[2],
                                CONSTANTS.COUNT_POS[3]);
                totalNumAvailBooksDisplay.add(totalNumAvailBooks);

                JLabel totalPriceBooks = new JLabel("$153,200");
                totalPriceBooks
                                .setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1],
                                                CONSTANTS.MAIN_COLOR[2]));
                totalPriceBooks.setFont(new Font("Dialog", Font.PLAIN, 50));
                totalPriceBooks.setHorizontalAlignment(SwingConstants.CENTER);
                totalPriceBooks.setVerticalAlignment(SwingConstants.CENTER);
                totalPriceBooks.setBounds(CONSTANTS.COUNT_POS[0], CONSTANTS.COUNT_POS[1], CONSTANTS.COUNT_POS[2],
                                CONSTANTS.COUNT_POS[3]);
                totalPriceBooksDisplay.add(totalPriceBooks);

                JLabel totalNumMembers = new JLabel("207");
                totalNumMembers
                                .setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1],
                                                CONSTANTS.MAIN_COLOR[2]));
                totalNumMembers.setFont(new Font("Dialog", Font.PLAIN, 50));
                totalNumMembers.setHorizontalAlignment(SwingConstants.CENTER);
                totalNumMembers.setVerticalAlignment(SwingConstants.CENTER);
                totalNumMembers.setBounds(CONSTANTS.COUNT_POS[0], CONSTANTS.COUNT_POS[1], CONSTANTS.COUNT_POS[2],
                                CONSTANTS.COUNT_POS[3]);
                totalNumMembersDisplay.add(totalNumMembers);

                JLabel totalNumBorrowers = new JLabel("360");
                totalNumBorrowers
                                .setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1],
                                                CONSTANTS.MAIN_COLOR[2]));
                totalNumBorrowers.setFont(new Font("Dialog", Font.PLAIN, 50));
                totalNumBorrowers.setHorizontalAlignment(SwingConstants.CENTER);
                totalNumBorrowers.setVerticalAlignment(SwingConstants.CENTER);
                totalNumBorrowers.setBounds(CONSTANTS.COUNT_POS[0], CONSTANTS.COUNT_POS[1], CONSTANTS.COUNT_POS[2],
                                CONSTANTS.COUNT_POS[3]);
                totalNumBorrowersDisplay.add(totalNumBorrowers);

                JLabel totalNumStaffs = new JLabel("15");
                totalNumStaffs
                                .setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1],
                                                CONSTANTS.MAIN_COLOR[2]));
                totalNumStaffs.setFont(new Font("Dialog", Font.PLAIN, 50));
                totalNumStaffs.setHorizontalAlignment(SwingConstants.CENTER);
                totalNumStaffs.setVerticalAlignment(SwingConstants.CENTER);
                totalNumStaffs.setBounds(CONSTANTS.COUNT_POS[0], CONSTANTS.COUNT_POS[1], CONSTANTS.COUNT_POS[2],
                                CONSTANTS.COUNT_POS[3]);
                totalNumStaffsDisplay.add(totalNumStaffs);

                // SEARCH BUTTON
                JLabel searchButton = new JLabel();
                searchButton.setSize(CONSTANTS.BUTTON_SIZE[0], CONSTANTS.BUTTON_SIZE[1]);
                searchButton.setLocation(20, 100);
                ImageIcon searchIcon = new ImageIcon("LibraryManagementSystem/src/Icons/search.png");
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
                bookButton.setSize(CONSTANTS.BUTTON_SIZE[0], CONSTANTS.BUTTON_SIZE[1]);
                bookButton.setLocation(20, 210);
                ImageIcon bookIcon = new ImageIcon("LibraryManagementSystem/src/Icons/book.png");
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
                                homePanel.setVisible(false);
                                new BookManagement();

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
                memberButton.setSize(CONSTANTS.BUTTON_SIZE[0], CONSTANTS.BUTTON_SIZE[1]);
                memberButton.setLocation(20, 330);
                ImageIcon memberIcon = new ImageIcon("LibraryManagementSystem/src/Icons/member.png");
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
                staffButton.setSize(CONSTANTS.BUTTON_SIZE[0], CONSTANTS.BUTTON_SIZE[1]);
                staffButton.setLocation(20, 450);
                ImageIcon staffIcon = new ImageIcon("LibraryManagementSystem/src/Icons/staff.png");
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
                borrowerButton.setSize(CONSTANTS.BUTTON_SIZE[0], CONSTANTS.BUTTON_SIZE[1]);
                borrowerButton.setLocation(20, 570);
                ImageIcon borrowerIcon = new ImageIcon("LibraryManagementSystem/src/Icons/borrower.png");
                Image borrowerImage = borrowerIcon.getImage();
                Image borrowerScale = borrowerImage.getScaledInstance(borrowerButton.getWidth(),
                                borrowerButton.getHeight(),
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
