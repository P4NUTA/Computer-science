public class FifthClass {
    public static void main(String[] args) {
        Satellite satellite = new Satellite("Moon",1738.14,8.8);
        Planet planet = new Planet("Earth-01", 6371.0, 149.6,satellite);
        System.out.println(planet.name);
        planet.setName("Earth");
        System.out.println(planet.getName());
        System.out.println(planet.toThousandKm("radius"));
        System.out.println(satellite.getPeriod());
        System.out.println(satellite.getPeriodInDays());
        planet.getSatelliteInfo();
    }
}
