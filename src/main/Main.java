package main;

import util.draw.QRCodeGUIFrame;
import util.draw.QRCodePicture;
import util.qrcode.QRCode;

public class Main {

	public static void main(String[] args) {
		boolean[][] array = new QRCode("https://jiufunghaha.github.io/").getQRCodeArray();
//		QRCodeGUIFrame gui = new QRCodeGUIFrame(array, 20);
//		gui.setVisible(true);
		QRCodePicture.getQRCodePicture(array, 20, "E:\\picture\\QRCode.png");
	}

}
