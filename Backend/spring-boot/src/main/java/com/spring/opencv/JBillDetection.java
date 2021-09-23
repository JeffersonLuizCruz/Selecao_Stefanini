package com.spring.opencv;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.imgcodecs.Imgcodecs;


public class JBillDetection {
	
	public int transform(String filename) {
		
		try {
			System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		} catch (UnsatisfiedLinkError error) {
            // Output expected UnsatisfiedLinkErrors.
        } catch (Error | Exception error) {
            // Output unexpected Errors and Exceptions.
        }


    	//String imgFile = "./src/main/java/com/spring/opencv/2real.jpg";
		String imgFile = "./src/uploads/" + filename;
		//Vai ler a imagem e colocar em grayscale 0/Preto-255/Branco
		Mat src = Imgcodecs.imread(imgFile,0);

		//Binarização Inicio
		int width = (int) (0.2 * (src.width())); 
		int height = (int) (0.3* (src.height())); 
		int x = (int) (0.8 * (src.width())); 
		int y = 0;
		
		Rect rectCrop = new Rect(x, y, width, height);
		Mat output_rec = src.submat(rectCrop);
		//Binarização Fim

		//Threshold Inicio
		int heightMat = output_rec.height(); //Altura da imagem recortada
		int widthMath = output_rec.width(); //Largura da imagem recortada
		
		for(int i=0; i<heightMat; i++) {
			for(int s=0; s<widthMath; s++) {
				
				double pixel[] = output_rec.get(i,s);
				if(pixel[0] >= 165) {
					output_rec.put(i,s,255);
				} else {
					output_rec.put(i,s,0);
				}
				
			}
		}

        //Threshold Fim
		
		Imgcodecs.imwrite("./src/downloads/"+filename, output_rec);
    
		return 5;
	}
	
}