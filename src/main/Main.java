package main;

import util.draw.QRCodeGUIFrame;
import util.draw.QRCodePicture;
import util.qrcode.QRCode;

public class Main {

	public static void main(String[] args) {
		String content = "";
		boolean[][] array = new QRCode(content).getQRCodeArray();
		//gui方式显示二维码
		QRCodeGUIFrame gui = new QRCodeGUIFrame(array, 20);
		gui.setVisible(true);
		//保存二维码图片
		QRCodePicture.getQRCodePicture(array, 20, "QRCode.png");
	}

}
