// 14 point
class Satellite {
    // 16 point
    String name;
    Double radius;
    Double period;

    /**
     * Возвращает период
     *
     * @return double period
     */
    public double getPeriod() {
        return this.period;
    }

    /**
     * Возвращает период в днях
     *
     * @return double period
     */
    public double getPeriodInDays() {
        return this.period * 365;
    }

    /**
     * Выводит значения спутника
     *
     * @return none
     */
    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Radius: " + this.radius);
        System.out.println("Period: " + this.period);
    }
    // 21 point
    /**
     * Конструктор
     *
     * @param String name - название спутника
     * @param Double radius - радиус спутника
     * @param Double period - перидо спутника
     */
    public Satellite(String name, Double radius, Double period) {
        this.name = name;
        this.radius = radius;
        this.period = period;
    }
}

public class Planet {
    String name;
    Double radius;
    Double sunDistance;
    Satellite satellite;
    public Planet(String name, Double radius, Double sunDistance, Satellite satellite) {
        this.name = name;
        this.radius = radius;
        this.sunDistance = sunDistance;
        this.satellite = satellite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double toThousandKm(String param) {
        double result = 0;
        switch (param) {
            case "sunDistance":
                result = this.sunDistance / 1000;
            case "radius":
                result = this.radius / 1000;
        }
        return result;
    }
    // 22 point
    public void getSatelliteInfo(){
        this.satellite.print();
    }
}


