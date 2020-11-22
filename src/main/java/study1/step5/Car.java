package study1.step5;

import java.util.Objects;

public class Car {
    public final String racer;
    public int distance;

    public Car(String racer, int initialNumber){
        this.racer = racer;
        this.distance = initialNumber;
    }

    public void move(Decision decision){
        if(decision.moveDecision()){
            this.distance ++;
        }
    }

    public boolean isBestRacer(int highestScore){
        return highestScore == this.distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return distance == car.distance &&
                Objects.equals(racer, car.racer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(racer, distance);
    }
}