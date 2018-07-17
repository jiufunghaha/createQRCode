package util.qrcode;

import java.io.UnsupportedEncodingException;

import com.swetake.util.Qrcode;

public class QRCode {
	
	//版本号，默认为3
	private int version = 3;
	
	//内容字符，默认无字符
	private String content = "";
	
	//二维码排错率，L(7%)、M(15%)、Q(25%)、H(30%)，默认为L
	private char errorCorrect = 'l';
	//二维码字符集，N代表数字,A代表字符a-Z,B代表其他字符，默认为B  
	private char encodeMode = 'B';
	
	//无参构造
	public QRCode(){}
	
	//有参构造
	public QRCode(String content){
		this.content = content;
	}
	public QRCode(int version, String content){
		this.version = version;
		this.content = content;
	}
	public QRCode(int version, String content, char errorCorrect, char encodeMode){
		this.version = version;
		this.content = content;
		this.errorCorrect = errorCorrect;
		this.encodeMode = encodeMode;
	}
	
	//获取二维码矩阵
	public boolean[][] getQRCodeArray(){

		Qrcode qrcode = new Qrcode();
		//设置二维码排错率
		qrcode.setQrcodeErrorCorrect(errorCorrect);
		//设置二维码字符集
		qrcode.setQrcodeEncodeMode(encodeMode);
		//设置二维码版本号
		qrcode.setQrcodeVersion(version);
		
		byte[] contentBytes = null;
		try {
			contentBytes = content.getBytes("utf8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//二维码矩阵
		boolean[][] qrcodeArray = qrcode.calQrcode(contentBytes);
		
		return qrcodeArray;
		
	}

}
