package chap2_4.collection.song;

import chap2_5.fileio.FileExample;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArtistRepository implements Serializable {

    // 가수들을 담을 자료구조
    // key : 가수명
    // value : 가수 객체
    private Map<String,Artist> artistMap;

    public ArtistRepository(){

        this.artistMap = new HashMap<>();
       /* try (FileReader fr = new FileReader(FileExample.ROOT_PATH + "/artist.txt")) {

            // 텍스트를 줄 단위로 읽어내는 보조 스트림
            BufferedReader br = new BufferedReader(fr);

            while(true){
                String data = br.readLine();
                if(data == null) break;
                // 가수명과 노래목록을 분리
                String[] split = data.split("-");

                Artist artist = new Artist(split[0]);

                // 노래목록 문자열에서 노래들을 분리
                String[] songList = split[1].split(",");

                for (String song : songList) {
                    artist.addSong(song);
                }

                artistMap.put(split[0],artist);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    public int count(){
        return this.artistMap.size();
    }// count 끝


    /**
     * 가수가 등록되어 있는지 확인하는 메서드
     * @param name
     * @return
     */
    public boolean isRegistered(String name) {

        return artistMap.containsKey(name);
    }

    /**
     * 새로운 가수를 등록하는 메서드
     * @param artistName
     * @param newSongName
     */
    public void addNewArtist(String artistName, String newSongName) {
        // 새 가수 객체 생성
        Artist newArtist = new Artist(artistName);

        // 가수의 노래목록에 새 노래 추가
        newArtist.addSong(newSongName);

        // 신규가수를 맵에 저장
        artistMap.put(artistName, newArtist);
    }


    /**
     * 기존 가수의 노래목록에만 접근해서 새 노래를 추가하는 메서드
     * @param name
     * @param song
     */
    public boolean addNewsong(String name, String song) {
        // 1. Map에서 해당 가수를 꺼내와봄
        Artist artist = artistMap.get(name);
        // set은 add가 성공하면 true, 실패하면 false를 반환한다.

        return artist.addSong(song);
    }

    public Set<String> getTrackList(String name) {

        Artist artist = artistMap.get(name);


        return artist.getSongList();
    }

    public void allArtist() {

        Set<String> keys = artistMap.keySet();

        for (String key : keys) {
            Artist artist = artistMap.get(key);
            System.out.printf("\n %s - 총 %d 곡 \n ",key,artist.getSongCount());
        }

    }

    // 가수 정보를 세이브파일에 저장하는 메서드
    public void save() {
        try (FileOutputStream fos = new FileOutputStream(FileExample.ROOT_PATH + "/artist.sav")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(artistMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 가수 정보를 세이브파일로부터 로드하는 메서드
    public void load() {
        String savePath = FileExample.ROOT_PATH + "/artist.sav";
        File saveFile = new File(savePath);
        if (saveFile.exists()) {
            try (FileInputStream fis = new FileInputStream(FileExample.ROOT_PATH + "/artist.sav")) {
                ObjectInputStream ois = new ObjectInputStream(fis);
                artistMap = (Map<String, Artist>) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
