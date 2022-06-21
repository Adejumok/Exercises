package MiniProject;

import java.util.ArrayList;

public class User {
    private ArrayList<Diary> theDiaries;

    public void createDiary(Diary newDiary){
        theDiaries.add(newDiary);
    }

    public Diary viewDiary(int index){
        return theDiaries.get(index);
    }

    public ArrayList<Diary> viewAllDiaries(){
        return theDiaries;
    }

    public void editDiaryDetails(int index){
        this.theDiaries = theDiaries;
    }

    public void deleteDiary(int index){
        theDiaries.remove(index);
    }
}
