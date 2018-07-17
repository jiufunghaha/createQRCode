package util.draw;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class QRCodePicture {
	public static void getQRCodePicture(boolean[][] array, int sizeOfBlock, String path){
		int pictureSize = (array.length+2) * sizeOfBlock;
		BufferedImage bi = new BufferedImage(pictureSize, pictureSize, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = bi.createGraphics();
		g.setBackground(Color.white);
		g.clearRect(0, 0, pictureSize, pictureSize);
		g.setColor(Color.BLACK);
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				int x = (i+1) * sizeOfBlock;
				int y = (j+1) * sizeOfBlock;
				if(array[i][j]){
					g.fillRect(x, y, sizeOfBlock, sizeOfBlock);
				}
			}
		}
		g.dispose(); 
		bi.flush();
		File imgFile = new File(path);    
        try {
			ImageIO.write(bi, "png", imgFile);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
