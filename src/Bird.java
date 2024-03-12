import java.io.Serializable;

public class Bird implements FlyAble, Serializable {
    @Override
    public void fly() {
        System.out.println("Toi la chim toi co the bay");
    }
}
