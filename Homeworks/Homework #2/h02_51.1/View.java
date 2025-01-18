//**************************************************************************************************
// CLASS: View
//
// DESCRIPTION
// Implements the GUI for a calculator.
//**************************************************************************************************
/**------------HW 2-5.1----------------
 * CLASS: View (View.java)
 * GROUP 42
 * AUTHOR 1: Caleb Ewer, cewer, cewer@asu.edu
 * AUTHOR 2: Lorenzo Stewart, lkstewa2, lkstewa2@asu.edu
 * AUTHOR 3: Samuel Ketcham, scketch1, scktech1@asu.edu
 * AUTHOR 4: Miranda Coston, mcoston, mcoston@asu.edu
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Implements the GUI for a calculator.
 */
public class View extends JFrame implements ActionListener {

    public static final int FRAME_WIDTH  = 500;
    public static final int FRAME_HEIGHT = 200;

    private JTextField mText;

    /**
     * Default ctor. Does nothing.
     */
    public View() {

        JPanel panelFunctButton = new JPanel();
        panelFunctButton.setLayout(new GridLayout(2,2));
        addButton(panelFunctButton, "x^y");
        addButton(panelFunctButton, "log 10");
        addButton(panelFunctButton, "log e");
        addButton(panelFunctButton, "SQRT");

        // Declare and create a JPanel named panelSysButton. Use the default FlowLayout layout
        // manager. Call addButton() to add buttons labeled "Clear", "About", and "Exit".
        JPanel panelSysButton = new JPanel();
        addButton(panelSysButton, "Clear");
        addButton(panelSysButton, "About");
        addButton(panelSysButton, "Exit");


        JPanel panelFunctSys = new JPanel();
        panelFunctSys.setLayout(new BorderLayout());
        panelFunctSys.add(panelFunctButton, BorderLayout.CENTER);
        panelFunctSys.add(panelSysButton, BorderLayout.SOUTH);


        JPanel panelKeypad = new JPanel();
        panelKeypad.setLayout(new GridLayout(4,4));
        addButton(panelKeypad, "7");
        addButton(panelKeypad, "8");
        addButton(panelKeypad, "9");
        addButton(panelKeypad, "/");
        addButton(panelKeypad, "4");
        addButton(panelKeypad, "5");
        addButton(panelKeypad, "6");
        addButton(panelKeypad, "*");
        addButton(panelKeypad, "1");
        addButton(panelKeypad, "2");
        addButton(panelKeypad, "3");
        addButton(panelKeypad, "-");
        addButton(panelKeypad, "0");
        addButton(panelKeypad, ".");
        addButton(panelKeypad, "+/-");
        addButton(panelKeypad, "+");


        JPanel panelBottom = new JPanel();
        panelBottom.setLayout(new BoxLayout(panelBottom, BoxLayout.X_AXIS));
        panelBottom.add(panelKeypad);
        panelBottom.add(Box.createRigidArea(new Dimension(10, 20)));
        panelBottom.add(panelFunctSys);


        JPanel panelTextField = new JPanel();
        mText = new JTextField(30);
        panelTextField.add(mText);


        JPanel panelLabel = new JPanel();
        JLabel label = new JLabel("Kalkutron-9000");
        panelLabel.add(label);


        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.add(Box.createVerticalGlue());
        panelMain.add(panelLabel);
        panelMain.add(Box.createVerticalGlue());
        panelMain.add(panelTextField);
        panelMain.add(panelBottom);
        panelMain.add(Box.createVerticalGlue());

        // Set the title bar string of this JFrame.
        setTitle("Kalkutron-9000");

        // Set the width and height of this JFrame.
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Configure this JFrame so the frame will be closed and the application will terminate when
        // the X button on the title bar is closed.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add panelMain to this JFrame.
        add(panelMain);

        // Make this JFrame visible.
        setVisible(true);
    }

    /**
     * Declare and create a JButton object displaying pText. Make this JFrame the action listener
     * for button events. Add the button to pPanel.
     */
    private void addButton(JPanel pPanel, String pText) {
        JButton button = new JButton(pText);
        button.addActionListener(this);
        pPanel.add(button);
    }

    /**
     * Implementation of the actionPerformed() method of the ActionListener interface.
     */
    @Override
    public void actionPerformed(ActionEvent pEvent) {

        String buttonCommand = pEvent.getActionCommand();

        if(buttonCommand == "Exit")
        {
            System.exit(0);
        }

        if(buttonCommand == "About")
        {
            JOptionPane.showMessageDialog(null, "Kalkuton-9000 Ver. 1 \nCaleb Ewer \nLorenzo Stewart \nSamuel Ketcham \nMiranda Coston", "About", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
