public class Bicycle extends Vehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("в велосипедах нет двигателя");
    }

    @Override
    public void checkTrailer() {
        System.out.println("В велосипедах нет прицепа");
    }
}