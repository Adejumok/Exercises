package tdd;

public class BooleanLoop {
    public boolean getBoolean(String[] a, String[] b) {
    int counter = 0;
    if(a.length != b.length){return false;}
    else {
        for (int i = 0; i < a.length; i++) {
            if(a[i].equalsIgnoreCase(b[i])){
                counter+=1;}
        }
        if(counter == a.length){
            return true;
        }
    }
    return false;
}
}
