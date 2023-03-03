package org.campus02.arrays;

public class Car {

    private String carType;
    private int productionYear;
    private int drivenKilometer;

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setProdutionYear(int produtionYear) {
        this.productionYear = produtionYear;
    }

    public String getCarType() {
        return carType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getDrivenKilometer() {
        return drivenKilometer;
    }

    public void setDrivenKilometer(int drivenKilometer) {
        this.drivenKilometer = drivenKilometer;
    }

    public Car(String carType, int produtionYear, int drivenKilometer) {
        this.carType = carType;
        this.productionYear = produtionYear;
        this.drivenKilometer = drivenKilometer;
    }

    public static void sortByProductionYear(Car[] cars) {
        // Sortieren des Arrays mit Hilfe der Bubble-Sort-Algorithmus
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].getProductionYear() > cars[j + 1].getProductionYear()) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    public int compareTo(Car other) {
        if (this.productionYear == other.productionYear) {
            return 0;
        }

        if (this.productionYear < other.productionYear) {
            return -1;
        } else return +1;

    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", productionYear=" + productionYear +
                ", drivenKilometer=" + drivenKilometer +
                '}';
    }
}
