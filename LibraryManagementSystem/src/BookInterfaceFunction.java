import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import INITIAL.CONSTANTS;

public class BookInterfaceFunction extends JFrame {
    public BookInterfaceFunction() {
        setSize(CONSTANTS.FUNCTION_INTERFACE_DIMENSIONS[0], CONSTANTS.FUNCTION_INTERFACE_DIMENSIONS[1]);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
    }

    public void addInterface() {
        JPanel addPanel = new JPanel();
        addPanel.setBackground(new Color(CONSTANTS.FUNCTION_INTERFACE_COLOR[0], CONSTANTS.FUNCTION_INTERFACE_COLOR[1],
                CONSTANTS.FUNCTION_INTERFACE_COLOR[2]));
        addPanel.setSize(CONSTANTS.FUNCTION_INTERFACE_DIMENSIONS[0], CONSTANTS.FUNCTION_INTERFACE_DIMENSIONS[1]);
        addPanel.setLayout(null);

        JTextField titleField = new JTextField();
        titleField.setSize(420, 40);
        titleField.setFont(new Font("Dialog", Font.PLAIN, 20));
        titleField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        titleField.setBackground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
        titleField.setLocation(20, 50);
        titleField.addMouseListener(new MouseListener() {

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
                titleField.setBackground(new Color(183, 183, 183));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                titleField.setBackground(
                        new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
            }

        });
        addPanel.add(titleField);

        JTextField authorField = new JTextField();
        authorField.setSize(200, 40);
        authorField.setFont(new Font("Dialog", Font.PLAIN, 15));
        authorField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        authorField.setBackground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
        authorField.setLocation(20, 140);
        authorField.addMouseListener(new MouseListener() {

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
                authorField.setBackground(new Color(183, 183, 183));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                authorField.setBackground(
                        new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
            }

        });
        addPanel.add(authorField);

        JTextField datePublishedField = new JTextField();
        datePublishedField.setSize(200, 40);
        datePublishedField.setFont(new Font("Dialog", Font.PLAIN, 15));
        datePublishedField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        datePublishedField
                .setBackground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
        datePublishedField.setLocation(240, 140);
        datePublishedField.addMouseListener(new MouseListener() {

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
                datePublishedField.setBackground(new Color(183, 183, 183));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                datePublishedField.setBackground(
                        new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
            }

        });
        addPanel.add(datePublishedField);

        JTextField genreField = new JTextField();
        genreField.setSize(200, 40);
        genreField.setFont(new Font("Dialog", Font.PLAIN, 15));
        genreField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        genreField.setBackground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
        genreField.setLocation(20, 230);
        genreField.addMouseListener(new MouseListener() {

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
                genreField.setBackground(new Color(183, 183, 183));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                genreField.setBackground(
                        new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
            }

        });
        addPanel.add(genreField);

        JTextField worthField = new JTextField();
        worthField.setSize(200, 40);
        worthField.setFont(new Font("Dialog", Font.PLAIN, 15));
        worthField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        worthField.setBackground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
        worthField.setLocation(240, 230);
        worthField.addMouseListener(new MouseListener() {

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
                worthField.setBackground(new Color(183, 183, 183));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                worthField.setBackground(
                        new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
            }

        });
        addPanel.add(worthField);

        JButton saveButton = new JButton("Save");
        saveButton.setBackground(Color.WHITE);
        saveButton.setFont(new Font("Dialog", Font.PLAIN, 20));
        saveButton.setSize(160, 50);
        saveButton.setLocation(150, 310);
        saveButton.setFocusable(false);
        saveButton.setBackground(new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
        saveButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        saveButton.addMouseListener(new MouseListener() {

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
                saveButton.setBackground(new Color(183, 183, 183));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                saveButton.setBackground(
                        new Color(CONSTANTS.MAIN_COLOR[0], CONSTANTS.MAIN_COLOR[1], CONSTANTS.MAIN_COLOR[2]));
            }

        });
        addPanel.add(saveButton);

        JLabel titleLabel = new JLabel("Title");
        titleLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        titleLabel.setSize(100, 30);
        titleLabel.setLocation(20, 20);
        addPanel.add(titleLabel);

        JLabel authorLabel = new JLabel("Author");
        authorLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        authorLabel.setSize(100, 30);
        authorLabel.setLocation(20, 110);
        addPanel.add(authorLabel);

        JLabel datePublishedLabel = new JLabel("Date Published");
        datePublishedLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        datePublishedLabel.setSize(200, 30);
        datePublishedLabel.setLocation(240, 110);
        addPanel.add(datePublishedLabel);

        JLabel genreLabel = new JLabel("Genre");
        genreLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        genreLabel.setSize(200, 30);
        genreLabel.setLocation(20, 200);
        addPanel.add(genreLabel);

        JLabel worthLabel = new JLabel("Worth");
        worthLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        worthLabel.setSize(200, 30);
        worthLabel.setLocation(240, 200);
        addPanel.add(worthLabel);

        add(addPanel);
        setVisible(true);
    }

    public void editInterface() {
        JPanel editPanel = new JPanel();
        editPanel.setBackground(new Color(CONSTANTS.FUNCTION_INTERFACE_COLOR[0], CONSTANTS.FUNCTION_INTERFACE_COLOR[1],
                CONSTANTS.FUNCTION_INTERFACE_COLOR[2]));
        editPanel.setSize(CONSTANTS.FUNCTION_INTERFACE_DIMENSIONS[0], CONSTANTS.FUNCTION_INTERFACE_DIMENSIONS[1]);
        editPanel.setLayout(null);

        add(editPanel);
        setVisible(true);
    }

    public void deleteInterface() {
        JPanel deletePanel = new JPanel();
        deletePanel
                .setBackground(new Color(CONSTANTS.FUNCTION_INTERFACE_COLOR[0], CONSTANTS.FUNCTION_INTERFACE_COLOR[1],
                        CONSTANTS.FUNCTION_INTERFACE_COLOR[2]));
        deletePanel.setSize(CONSTANTS.FUNCTION_INTERFACE_DIMENSIONS[0], CONSTANTS.FUNCTION_INTERFACE_DIMENSIONS[1]);
        deletePanel.setLayout(null);

        add(deletePanel);
        setVisible(true);
    }
}
