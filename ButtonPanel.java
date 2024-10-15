package classes;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ButtonPanel extends JPanel {

    private JButton addTask;
    private JButton clear;

    Border emptyBorder = BorderFactory.createEmptyBorder();

    //    Constructor
    ButtonPanel(){

    this.setPreferredSize(new Dimension(100,100));

        addTask = new JButton("Add Task");
        addTask.setBorder(emptyBorder);
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));

        this.add(addTask);
        this.add(Box.createHorizontalStrut(20));

        clear = new JButton("Completed Task:(Clear)");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(clear);
    }
    public JButton getAddTask() {
        return addTask;
    }
    public JButton getClear() {
        return clear;
    }
}
