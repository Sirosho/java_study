package chap2_5.fileio.textstream;

import chap2_5.fileio.FileExample;

import java.io.FileWriter;

import static chap1_9.static_.util.InputUtils.prompt;

public class FileWriterExample {

    public static void main(String[] args) {

        /*
         *
         *       바이트 기반 스트림 : 이미지, 영상, 텍스트 등을 1바이트로 단위로 입출력
         *                       -> InputStream, OutputStream
         *       텍스트 기반 스트림 : 오직 텍스트만을 2바이트 단위로 입출력
         *                       -> Reader, Writer
         * */


        // try ~ with ~ resources 명령 : 메모리 정리가 필요한 객체에 대해 자동 클로즈 처리
        // AutoClosable 상속받는 클래스는 사용가능
        try(FileWriter fw = new FileWriter(FileExample.ROOT_PATH + "/hobbies.txt")) {
            // 이렇게 try의 괄호안에 FileWriter 객체를 생성

//            fw = new FileWriter(FileExample.ROOT_PATH + "/hobbies.txt");

            String hobby = prompt("취미를 입력: ");

            // 파일 출력명령
            fw.write("당신의 취미: " + hobby);


        } catch (Exception e) {
            System.out.println("파일 저장 실패!");
        }
       /* finally {
            //리소스 반납을 해줘야 입출력에 막힘이 없음
            try {
                if (fw != null) fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
    }
}
