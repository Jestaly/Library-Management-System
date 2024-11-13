import java.awt.*;
import javax.swing.*;

import INITIAL.CONSTANTS;

public class BookInterfaceFunction extends JFrame {

    public void addInterface() {

        setSize(CONSTANTS.FUNCTION_INTERFACE_DIMENSIONS[0], CONSTANTS.FUNCTION_INTERFACE_DIMENSIONS[1]);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(new Color(CONSTANTS.FUNCTION_INTERFACE_COLOR[0], CONSTANTS.FUNCTION_INTERFACE_COLOR[1],
                CONSTANTS.FUNCTION_INTERFACE_COLOR[2]));
        setResizable(false);
        setVisible(true);
    }

    public void editInterface() {

        setSize(CONSTANTS.FUNCTION_INTERFACE_DIMENSIONS[0], CONSTANTS.FUNCTION_INTERFACE_DIMENSIONS[1]);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(new Color(CONSTANTS.FUNCTION_INTERFACE_COLOR[0], CONSTANTS.FUNCTION_INTERFACE_COLOR[1],
                CONSTANTS.FUNCTION_INTERFACE_COLOR[2]));
        setResizable(false);
        setVisible(true);

    }

    public void deleteInterface() {
        setSize(CONSTANTS.FUNCTION_INTERFACE_DIMENSIONS[0], CONSTANTS.FUNCTION_INTERFACE_DIMENSIONS[1]);
        setLocationRelativeTo(null);
        setLayout(null);
        setBackground(new Color(CONSTANTS.FUNCTION_INTERFACE_COLOR[0], CONSTANTS.FUNCTION_INTERFACE_COLOR[1],
                CONSTANTS.FUNCTION_INTERFACE_COLOR[2]));
        setResizable(false);
        setVisible(true);

    }
}
