package ebuscard;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
/**
*
* @author David A York
*/
public class EBusCard extends JFrame {
private void createGUI() {
//Create and set up the content pane.
eBusCard_Gui_Panel cardPane = new eBusCard_Gui_Panel();
JMenuBar eBusCardSvc = new JMenuBar();
JMenu fileScs = new JMenu("File");
eBusCardSvc.add(fileScs);
JMenu viewScs = new JMenu("View");
eBusCardSvc.add(viewScs);
JMenu helpScs = new JMenu("Help");
eBusCardSvc.add(helpScs);
this.setJMenuBar(eBusCardSvc);
setContentPane(cardPane);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
pack();
setVisible(true);
//eBusCardSvc.setVisible(false);
}
/**
* @param args the command line arguments
*/
public static void main(String [] args) {
EBusCard app = new EBusCard();
app.createGUI();
app.setPreferredSize(new Dimension(276, 232));
app.pack();
}
}
