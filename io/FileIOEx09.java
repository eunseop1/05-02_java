package kr.human.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOEx09 {
	public static void main(String[] args) {
		//자료 형별로 저장이 가능
		
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("data1.dat"));
			dos.writeByte(123);//바이트형 저장
			dos.writeInt(345);//인트형 저장
			dos.writeDouble(3.14);//더블 형 저장
			dos.writeUTF("한글!!!");//문자형 저장
			dos.flush();
			System.out.println("데이터 타입별로 저장하기");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream("data1.dat"))){
			/*
			int i = dis.readInt();
			byte b = dis.readByte();
			*/
			//순서가 다르면 엉뚱한 값이 나온다
			
			//데이터를 정확하게 읽으려면 저장 순서를 반드시 알아야 한다 -> 형변환은 안해도 되지만 쓸일이 별로 없을거다
			byte b = dis.readByte();
			int i = dis.readInt();			
			double d = dis.readDouble();
			String str = dis.readUTF();
			
			System.out.println(i);
			System.out.println(b);
			System.out.println(d);
			System.out.println(str);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
