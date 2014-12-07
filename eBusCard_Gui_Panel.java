package ebuscard;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;
import javax.imageio.stream.ImageInputStream;
import javax.swing.JPanel;


/**
 *
 * @author David York
 */
public class eBusCard_Gui_Panel extends JPanel{
    private int newNodeSuffix = 1;
    private static String ADD_COMMAND = "add";
    private static String REMOVE_COMMAND = "remove";
    private static String CLEAR_COMMAND = "clear";
    private JPanel cardPanel;
    private BufferedImage cardImg;


    public eBusCard_Gui_Panel() {
        super(new BorderLayout());
        try {
            cardImg = ImageIO.read(new File("BusCard_front.png"));
        } catch (IOException e) {
            System.out.println("file i/o error");
        }
        //Create the components.
        cardPanel = new JPanel();


        JPanel panel = new JPanel(new GridLayout(0,3));
        add(panel, BorderLayout.SOUTH);
        cardPanel.setPreferredSize(new Dimension(339, 194));
        Graphics g = cardImg.createGraphics();
        
        cardPanel.paintComponents(g);
        cardPanel.setVisible(true);
        
 
        
        
    }   
    @Override
    public void paintComponent(Graphics gimg)
    {
        super.paintComponent(gimg);
        boolean drawImage = gimg.drawImage(cardImg, 0, 0, 260, 170, null);
    }

    
    /** Unit test main()
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        eBusCard_Gui_Panel ebc = new eBusCard_Gui_Panel();
    }
}
