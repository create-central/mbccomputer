package exam_p;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileClassifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String folderPath = "E:\\mbccomputer\\ori";
        File dir = new File(folderPath);
        File[] files = dir.listFiles(); 
        
        /*
        경로에 있는 모든 파일과 폴더를 가져오는 올바른 Java 표준 코드입니다.
        */

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) { 
                	
                	/*
                	현재 File 객체가 실제로 존재하는 '일반 파일'인지 확인하는 메서드입니다.
                	*/
                	
                    String fileName = file.getName(); 
                    String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
                    
                    
                    File targetDir = new File(folderPath + File.separator + extension);
                    if (!targetDir.exists()) targetDir.mkdirs();
                    
                    Path source = Paths.get(file.getAbsolutePath());
                    Path target = Paths.get(targetDir.getAbsolutePath() + File.separator + fileName);
                    
                    /*
                    파일을 확장자별로 분류하여 폴더를 자동 생성하고 이동시키기 위한 완벽한 준비 단계입니다.
                    */
                    
                    try {
                        Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
                        System.out.println(fileName + " -> " + extension + " 폴더로 이동");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    
                    /*
                    폴더 안에 있는 파일들을 jpg, pdf, txt 등 각자의 확장자명을 가진 하위 폴더로 쏙쏙 집어넣는 기능을 수행합니다.
                    */
                     
                }
            }
        }
        
    }
}
