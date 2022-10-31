class Vehicle {
    protected String brand = "";
    public void run() {
        System.out.println("Car is running");
    }
}

class Car extends Vehicle {
    private String modelName = "Corolla";
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.run();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
