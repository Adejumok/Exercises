package DiaryM;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;

    ArrayList <Diary> theDiaries = new ArrayList<>();
    private int diaryId=0;
    public User(String name){
        this.name = name;
    }

    public void createDiary(Diary diary) {
        diary.setId(++diaryId);
        theDiaries.add(diary);
    }

    public Diary viewDiary(int id) {
        for (Diary diaryToView: theDiaries){
            if (id==diaryToView.getId()){
                return theDiaries.get(id-1);
            }
        }
        throw new DiaryDoesNotExistException("Oops! This diary doesn't exist");

    }

    private boolean isExistDiary(Diary diary){
        for (Diary searchDiary: theDiaries){
            if (diary.equals(searchDiary)){
                return true;
            }
        }return false;
    }

    public List<Diary> viewAllDiaries() {
        return theDiaries;
    }

    public int getNumberOfDiaries() {
        return theDiaries.size();
    }

    public void editDiary(Diary diary, int id) {
        if (isExistDiary(diary)){
            theDiaries.set(id-1, diary);
        }
        else {
            throw new DiaryDoesNotExistException("This diary does not exist");
        }
    }

    public void deleteDiary(Diary diary) {
        if (isExistDiary(diary)){
            theDiaries.remove(diary);
        }
        else {
            throw new DiaryDoesNotExistException("This diary does not exist");
        }
    }
}
