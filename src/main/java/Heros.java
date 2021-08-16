import java.util.ArrayList;
import java.util.List;

public class Heros {

    private String mName;
    private String mAge;
    private String mPower;
    private String mWeakness;
    private static ArrayList<Heros> instances = new ArrayList<>();
    private int id ;

    public Heros (String name, String age, String power, String weakness){
        mName = name;
        mAge =  age;
        mPower = power;
        mWeakness = weakness;
        instances.add(this);
        id = instances.size();

    }

    public String getName() {
        return mName;
    }


    public String getAge() {
        return mAge;
    }

    public String getPower() {
        return mPower;
    }

    public String getWeakness() {
        return mWeakness;
    }

    public static ArrayList<Heros> all() {
        return instances;
    }

    public static void clear(){
        instances.clear();
    }

    public int getmId() {
        return id;
    }
    public static Heros find(int id) {
        return instances.get(id - 1);
    }

}
