import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GameMain extends JFrame
{
	
	private final static String WINDOW_TITLE ="Tic-Tac-Toe";
	private final static int WINDOW_WIDTH = 800;
	private final static int WINDOW_HEIGHT = 600;
   
	public GameMain() {
		setTitle(WINDOW_TITLE);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setResizable(false);
		add(new Board());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
    public static void main(String[] args) 
    {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
    	public void run() {
    		new GameMain();
    	}
    });
}
}
