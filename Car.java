import java.lang.Comparable;
public class Car implements Comparable <Car>{
    String nazwaModelu;
    Integer rokProdukcji;

    Car(String nazwaModelu, int rokProdukcji) {
        this.nazwaModelu = nazwaModelu;
        this.rokProdukcji = rokProdukcji;
    }

    @Override
    public int compareTo(Car car) {
        return rokProdukcji.compareTo(car.rokProdukcji);
    }
}
