import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

import INITIAL.CONSTANTS;

public class BookManagement extends JFrame implements Functions {
    // protected BookInterfaceFunction bookInterfaceFunction = new
    // BookInterfaceFunction();
    protected DatabaseConnector connector = new DatabaseConnector();

    // protected BookManagement(BookInterfaceFunction bookInterfaceFunction) {
    // this.bookInterfaceFunction = bookInterfaceFunction;
    // }
    protected BookManagement() {

    }

    protected BookManagement(JPanel bookPanel) {
        bookPanel.setLayout(null);
        bookPanel.setSize(CONSTANTS.HOME_DIMENSIONS[0], CONSTANTS.HOME_DIMENSIONS[1]);
        bookPanel
                .setBackground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
        bookPanel.setLocation(100, 0);

        // bookInterfaceFunction = new BookInterfaceFunction(this);
        bookLayout(bookPanel);

    }

    @Override
    public void add() {
        System.out.println("ADDING BOOK");
        // bookInterfaceFunction.addInterface();
    }

    @Override
    public void edit() {
        System.out.println("EDITING BOOK");
        // bookInterfaceFunction.editInterface();
    }

    @Override
    public void delete() {
        System.out.println("DELETING BOOK");
        // bookInterfaceFunction.deleteInterface();
    }

    private void bookLayout(JPanel bookPanel) {
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
        addButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        addButton.addMouseListener(new MouseListener() {

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
        addButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                editButton.setEnabled(false);
                deleteButton.setEnabled(false);
                add();
            }

        });
        bookPanel.add(addButton);

        editButton.setFont(new Font("Dialog", Font.BOLD, 20));
        editButton.setForeground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
        editButton.setBackground(new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1], CONSTANTS.TAB_COLOR[2]));
        editButton.setSize(CONSTANTS.BOOK_BUTTON_SIZE[0], CONSTANTS.BOOK_BUTTON_SIZE[1]);
        editButton.setLocation(280, 50);
        editButton.setFocusable(false);
        editButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        editButton.addMouseListener(new MouseListener() {

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
        editButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                deleteButton.setEnabled(false);
                addButton.setEnabled(false);
                edit();
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
        deleteButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        deleteButton.addMouseListener(new MouseListener() {

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
                deleteButton.setBackground(new Color(146, 119, 119));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deleteButton.setBackground(
                        new Color(CONSTANTS.TAB_COLOR[0], CONSTANTS.TAB_COLOR[1], CONSTANTS.TAB_COLOR[2]));
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }

        });
        deleteButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                editButton.setEnabled(false);
                addButton.setEnabled(false);
                delete();
            }

        });
        bookPanel.add(deleteButton);
    }

    protected final String[] columnNames = { "Book ID", "Title", "Author", "Genre", "Date Published", "Worth" };
    protected DefaultTableModel model = new DefaultTableModel(dataTable(columnNames), columnNames);

    private void table(JPanel bookPanel) {

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
        bookTable.setFont(new Font("Dialog", Font.PLAIN, 15));
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
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        bookPanel.add(scrollPane);
    }

    private String[][] dataTable(String[] columnNames) {
        int rowCount = getNumData();
        int columnCount = columnNames.length;

        try {
            connector.statement = connector.connect().createStatement();
            connector.query = "SELECT * FROM book;";
            connector.resultSet = connector.statement.executeQuery(connector.query);

            String[][] data = new String[rowCount][columnCount];
            int i = 0;
            while (connector.resultSet.next()) {
                for (int j = 0; j < columnNames.length; j++) {
                    data[i][j] = connector.resultSet.getString(j + 1).toString();
                }
                i++;
            }

            connector.resultSet.close();

            return data;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    protected int getNumData() {
        try {
            connector.statement = connector.connect().createStatement();
            connector.query = "SELECT COUNT(*) AS num_of_book FROM book;";
            connector.resultSet = connector.statement.executeQuery(connector.query);

            int numData = 0;
            while (connector.resultSet.next()) {
                numData = Integer.parseInt(connector.resultSet.getString(1));
            }

            connector.resultSet.close();
            return numData;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

}
