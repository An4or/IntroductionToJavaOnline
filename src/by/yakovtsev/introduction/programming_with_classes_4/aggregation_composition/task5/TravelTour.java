package by.yakovtsev.introduction.programming_with_classes_4.aggregation_composition.task5;

public class TravelTour {

    private String nameTour;
    private double costTour;
    private int countDay;
    private FoodType foodType;
    private TransportType transportType;

    public TravelTour(String nameTour, double costTour, int countDay, FoodType foodType, TransportType transportType) {
        this.nameTour = nameTour;
        this.costTour = costTour;
        this.countDay = countDay;
        this.foodType = foodType;
        this.transportType = transportType;
    }

    public String getNameTour() {
        return nameTour;
    }

    public void setNameTour(String nameTour) {
        this.nameTour = nameTour;
    }

    public double getCostTour() {
        return costTour;
    }

    public void setCostTour(double costTour) {
        this.costTour = costTour;
    }

    public int getCountDay() {
        return countDay;
    }

    public void setCountDay(int countDay) {
        this.countDay = countDay;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    @Override
    public String toString() {
        return "TravelTour{" +
                "nameTour='" + nameTour + '\'' +
                ", costTour=" + costTour +
                ", countDay=" + countDay +
                ", foodType=" + foodType +
                ", transportType=" + transportType +
                '}';
    }
}
