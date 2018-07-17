package util.draw;

import java.awt.Graphics;

import javax.swing.JPanel;

public class QRCodeGUIPanel extends JPanel{
	
	private boolean[][] array = null;
	
	private int sizeOfBlock;
	
	public QRCodeGUIPanel(boolean[][] array, int sizeOfBlock) {
		this.array = array;
		this.sizeOfBlock = sizeOfBlock;
	}
	
	@Override
	public void paint(Graphics g) {
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				if(array[i][j]){
					int x = (i+1) * sizeOfBlock;
					int y = (j+1) * sizeOfBlock;
					g.fillRect(x, y, sizeOfBlock, sizeOfBlock);
				}
			}
		}
	}

}
