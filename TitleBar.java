package classes;

import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {

    private TitleBar title;
    private List list;
    private ButtonPanel buttonPanel;


//    Consterctor
    TitleBar() {
        this.setPreferredSize(new Dimension(400, 80));

    JLabel titleText = new JLabel("To Do List");
    titleText.setPreferredSize(new Dimension(200, 80));
    titleText.setFont(new Font("Sans-serif", Font.BOLD, 20));
    titleText.setHorizontalAlignment(JLabel.CENTER);

    this.add(titleText);

    }
}
