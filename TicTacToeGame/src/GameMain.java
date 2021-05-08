import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GameMain extends JFrame
{
   
	public GameMain() {
		setTitle("Tic-Tac-Toe");
		setSize(800,600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
    public static void main(String[] args) 
    {
      new GameMain();
    }
}
