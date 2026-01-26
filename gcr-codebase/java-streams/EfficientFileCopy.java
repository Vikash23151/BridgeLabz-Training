package java_streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EfficientFileCopy {
	public static void createLargeFile() {
		int fileSizeMB=100;
		int bufferSize=1024*1024;
		byte[] buffer=new byte[bufferSize];
		try(BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("input.txt"))) {
			for(int i=0;i<fileSizeMB;i++) {
				bos.write(buffer);
			}
			System.out.println("100MB file created!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		createLargeFile();
		long startTime,endTime;
		startTime=System.nanoTime();
		try(FileInputStream fis=new FileInputStream("input.txt");
				FileOutputStream fos=new FileOutputStream("normal_output.txt")){
				int byteData;
				while((byteData=fis.read())!=-1) {
					fos.write(byteData);
				}
				endTime=System.nanoTime();
				System.out.println("File copied successfully");
				System.out.println("Normal read & write time: "+(endTime-startTime) / 1_000_000 + " ms");
			}catch(IOException e) {
				e.printStackTrace();
			}
		startTime=System.nanoTime();
		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("input.txt"));
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("buffered_output.txt"))){
			byte[] buffer=new byte[4096];
			int bytesRead;
			while((bytesRead=bis.read(buffer))!=-1) {
				bos.write(buffer,0,bytesRead);
			}
			endTime=System.nanoTime();
			System.out.println("File copied successfully");
			System.out.println("Buffered read & write time: "+(endTime-startTime) / 1_000_000 + " ms");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
