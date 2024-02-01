public class CarTest{
    public static void main(String[] args){

        Car myCar = new Car.CarBuilder()
        .engineType("Gasoline")
        .transmission("Manual")
        .color("White")
        .capacity(8)
        .brand("Toyota")
        .build();

        System.out.println("- Car Builder - \nInformation Details");
        System.out.println("Brand: "+ myCar.brand);
        System.out.println("Transmission: "+ myCar.transmission);
        System.out.println("Engine Type"+ myCar.engineType);
        System.out.println("Capacity: "+ myCar.capacity);

        System.out.println("Color: "+ myCar.color);
    }
        
}