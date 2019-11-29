package by.nkt.agreg.entity;

import java.util.Objects;

public class Engine {

    private double engineSize;

    private int horsePower;

    public Engine() {
    }

    public Engine(double engineSize, int horsePower) {
        this.engineSize = engineSize;
        this.horsePower = horsePower;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.engineSize, engineSize) == 0 &&
                horsePower == engine.horsePower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineSize, horsePower);
    }
}