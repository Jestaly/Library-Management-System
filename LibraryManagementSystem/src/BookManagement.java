import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import INITIAL.CONSTANTS;

public class BookManagement extends JFrame {

    public BookManagement(JPanel bookPanel) {
        bookPanel.setLayout(null);
        bookPanel.setSize(CONSTANTS.HOME_DIMENSIONS[0], CONSTANTS.HOME_DIMENSIONS[1]);
        bookPanel.setBackground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
        bookPanel.setLocation(100, 0);
        bookLayout(bookPanel);
    }

    public void bookLayout(JPanel bookPanel) {
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
        bookPanel.add(exitButton);

        JButton addButton = new JButton("ADD BOOK");
        addButton.setFont(new Font("Dialog", Font.BOLD, 20));
        addButton.setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
        addButton.setBackground(new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1], CONSTANTS.TAB_COLOR[2]));
        addButton.setSize(CONSTANTS.BOOK_BUTTON_SIZE[0], CONSTANTS.BOOK_BUTTON_SIZE[1]);
        addButton.setLocation(70, 50);
        addButton.setFocusable(false);
        addButton.setBorder(null);
        addButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                addBook(addButton);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                addButton.setBackground(new Color(146, 119, 119));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                addButton.setBackground(
                        new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1], CONSTANTS.TAB_COLOR[2]));
            }

        });
        bookPanel.add(addButton);

        JButton editButton = new JButton("EDIT BOOK");
        editButton.setFont(new Font("Dialog", Font.BOLD, 20));
        editButton.setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
        editButton.setBackground(new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1], CONSTANTS.TAB_COLOR[2]));
        editButton.setSize(CONSTANTS.BOOK_BUTTON_SIZE[0], CONSTANTS.BOOK_BUTTON_SIZE[1]);
        editButton.setLocation(280, 50);
        editButton.setFocusable(false);
        editButton.setBorder(null);
        editButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                editBook(editButton);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                editButton.setBackground(new Color(146, 119, 119));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                editButton.setBackground(
                        new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1], CONSTANTS.TAB_COLOR[2]));
            }

        });
        bookPanel.add(editButton);

        JButton deleteButton = new JButton("DELETE BOOK");
        deleteButton.setFont(new Font("Dialog", Font.BOLD, 20));
        deleteButton
                .setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
        deleteButton.setBackground(new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1], CONSTANTS.TAB_COLOR[2]));
        deleteButton.setSize(CONSTANTS.BOOK_BUTTON_SIZE[0], CONSTANTS.BOOK_BUTTON_SIZE[1]);
        deleteButton.setLocation(490, 50);
        deleteButton.setFocusable(false);
        deleteButton.setBorder(null);
        deleteButton.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                deleteBook(deleteButton);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                deleteButton.setBackground(new Color(146, 119, 119));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deleteButton.setBackground(
                        new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1], CONSTANTS.TAB_COLOR[2]));
            }

        });
        bookPanel.add(deleteButton);
    }

    public void addBook(JButton addButton) {
        System.out.println("ADDED A BOOK!");
    }

    public void editBook(JButton editButton) {
        System.out.println("EDITED A BOOK!");
    }

    public void deleteBook(JButton deleteButton) {
        System.out.println("DELETED A BOOK!");
    }
}
