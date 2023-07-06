package ua.ithillel.hw20.builder;

public class Engine {
    private EngineType engineType;
    private Integer engineCapacity;

    public Engine() {
        this.engineType = EngineType.DIESEL;
        this.engineCapacity = 1998;
    }

    public Engine(EngineType engineType, Integer engineCapacity) {
        this.engineType = engineType;
        this.engineCapacity = engineCapacity;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineType=" + engineType +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
