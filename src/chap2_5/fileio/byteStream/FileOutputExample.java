package chap2_5.fileio.byteStream;

import chap2_5.fileio.FileExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputExample {
    public static void main(String[] args) {

        // 바이트 기반 출력 스트림 - 1 바이트 단위로 데이터 처리
        // 주로 이미지, 영상같은 바이너리 데이터 처리에 적합
        // 파라미터로 저장위치
       // 하드웨어에 접근하는 작업이라 예외처리 해줘야 하는 경우가 많음
        try {
            FileOutputStream fos
                    = new FileOutputStream(FileExample.ROOT_PATH + "/pet.txt");
//            String str = "dog";

//            fos.write(str.getBytes()); 이 것은 바이트 배열로 데이터를 바꿔주는것인데
//            fos.write(new byte[]{99,100,116}); 이런작업이 된다고 보면 된다.

        } catch (FileNotFoundException e) {
            File rootDirectory = new File(FileExample.ROOT_PATH);
            if(!rootDirectory.exists())rootDirectory.mkdir();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
