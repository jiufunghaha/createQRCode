package util.draw;

import javax.swing.JFrame;

public class QRCodeGUIFrame extends JFrame{
	
	private boolean[][] array = null;
	
	private int sizeOfBlock;
	
	public QRCodeGUIFrame(boolean[][] array, int sizeOfBlock){
		this.array = array;
		this.sizeOfBlock = sizeOfBlock;
		init();
	}
	
	public void init(){
		setTitle("QRCode");
		int width = (array.length+3) * sizeOfBlock;
		int height = (array.length+3) * sizeOfBlock;
		setSize(width, height);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new QRCodeGUIPanel(array, sizeOfBlock));
	}

}
