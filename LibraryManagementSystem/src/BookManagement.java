import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

import INITIAL.CONSTANTS;

public class BookManagement extends JFrame implements Functions {
    public BookInterfaceFunction bookInterfaceFunction = new BookInterfaceFunction();

    @Override
    public void add() {
        System.out.println("ADDING BOOK");
        bookInterfaceFunction.addInterface();
    }

    @Override
    public void edit() {
        System.out.println("EDITING BOOK");
        bookInterfaceFunction.editInterface();
    }

    @Override
    public void delete() {
        System.out.println("DELETING BOOK");
        bookInterfaceFunction.deleteInterface();
    }

    public BookManagement(JPanel bookPanel) {
        bookPanel.setLayout(null);
        bookPanel.setSize(CONSTANTS.HOME_DIMENSIONS[0], CONSTANTS.HOME_DIMENSIONS[1]);
        bookPanel.setBackground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
        bookPanel.setLocation(100, 0);
        bookLayout(bookPanel);
    }

    public void bookLayout(JPanel bookPanel) {
        table(bookPanel);

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
        JButton editButton = new JButton("EDIT BOOK");
        JButton deleteButton = new JButton("DELETE BOOK");

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
                editButton.setEnabled(false);
                deleteButton.setEnabled(false);

                add();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                addButton.setBackground(new Color(146, 119, 119));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                addButton.setBackground(
                        new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1], CONSTANTS.TAB_COLOR[2]));
                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }

        });
        bookPanel.add(addButton);

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
                edit();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                editButton.setBackground(new Color(146, 119, 119));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                editButton.setBackground(
                        new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1], CONSTANTS.TAB_COLOR[2]));
                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }

        });
        bookPanel.add(editButton);

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
                delete();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                deleteButton.setBackground(new Color(146, 119, 119));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deleteButton.setBackground(
                        new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1], CONSTANTS.TAB_COLOR[2]));
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

        });
        bookPanel.add(deleteButton);
    }

    public void table(JPanel bookPanel) {
        String[] columnNames = { "Book ID", "Title", "Author", "Publisher", "Genre", "Date Published", "Worth" };

        // Data for the JTable
        Object[][] data = { { 1, "Alice", 23 }, { 2, "Bob", 30 }, { 3, "Charlie", 25 }, { 4, "Alice", 23 } };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable bookTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(bookTable);
        bookTable.setFocusable(false);

        bookTable.getTableHeader().setResizingAllowed(false);
        bookTable.getTableHeader().setReorderingAllowed(false);
        bookTable.getTableHeader().setBorder(BorderFactory.createLineBorder(
                new Color(CONSTANTS.SIDE_COLOR[0], CONSTANTS.SIDE_COLOR[1], CONSTANTS.SIDE_COLOR[2])));
        bookTable.getTableHeader()
                .setBackground(new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1], CONSTANTS.TAB_COLOR[2]));
        bookTable.getTableHeader()
                .setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
        bookTable.getTableHeader().setFont(new Font("Dialog", Font.PLAIN, 20));
        bookTable.setFont(new Font("Dialog", Font.PLAIN, 20));
        bookTable.setBackground(new Color(146, 119, 119));
        bookTable.setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
        bookTable.setGridColor(new Color(CONSTANTS.SIDE_COLOR[0], CONSTANTS.SIDE_COLOR[1], CONSTANTS.SIDE_COLOR[2]));
        bookTable.setShowGrid(true);
        bookTable.setCellSelectionEnabled(false);
        bookTable.setEnabled(false);
        bookTable.setRowHeight(40);
        bookTable.setSize(1100, 540);
        bookTable.setLocation(40, 150);
        bookTable.setLayout(null);
        scrollPane.setBounds(40, 150, 1100, 540);
        scrollPane.getViewport()
                .setBackground(new Color(186, 159, 159));
        bookPanel.add(scrollPane);
    }
}
