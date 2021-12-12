package by.bsuir.yanushkevich.lab02.entity;

import by.bsuir.yanushkevich.lab02.common.ApplianceNameConstant;
import by.bsuir.yanushkevich.lab02.common.SearchFeatureConstant;
import by.bsuir.yanushkevich.lab02.entity.enums.Color;

import java.util.Objects;

public class Kettle extends Appliance {
    /**
     * Field powerConsumption of Kettle
     */
    private double power;
    /**
     * Field weight of Kettle
     */
    private double weight;
    /**
     * Field capacity of Kettle
     */
    private double bulk;
    /**
     * Field color of Kettle
     */
    private Color color;

    /**
     * Instantiates a new Kettle.
     */
    public Kettle() {
    }

    /**
     * Instantiates a new Kettle.
     *
     * @param price            the price
     * @param power            the power consumption
     * @param weight           the weight
     * @param bulk             the bulk
     */
    public Kettle(double price,
                  double power,
                  double weight,
                  double bulk,
                  Color color) {
        super(price);
        this.power = power;
        this.weight = weight;
        this.bulk = bulk;
        this.color = color;

    }

    @Override
    public boolean isMatchesCriteria(String featureName, Object value) {
        switch (featureName) {
            case SearchFeatureConstant.PRICE:
            case SearchFeatureConstant.MORE_THAN_CURRENT_PRICE:
            case SearchFeatureConstant.LESS_THAN_CURRENT_PRICE:
            case SearchFeatureConstant.EQUAL_CURRENT_PRICE:
                return super.isMatchesCriteria(featureName, value);
            case SearchFeatureConstant.APPLIANCE_NAME:
                return ApplianceNameConstant.KETTLE.equals(value);
            case SearchFeatureConstant.POWER:
                return (double) value == power;
            case SearchFeatureConstant.WEIGHT:
                return (double) value == weight;
            case SearchFeatureConstant.BULK:
                return (double) value == bulk;
            case SearchFeatureConstant.COLOR:
                return color.equals(Color.valueOf((String) value));
            default:
                return false;
        }
    }

    /**
     * Gets power value
     *
     * @return power
     */
    public double getPower() {
        return power;
    }

    /**
     * Gets weight value
     *
     * @return width weight
     */
    public double getWidth() {
        return weight;
    }

    /**
     * Gets bulk value
     *
     * @return bulk bulk
     */
    public double getBulk() {
        return bulk;
    }
    /**
     * Gets color value
     *
     * @return color
     */
    public Color getColor() {
        return color;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kettle Kettle = (Kettle) o;
        return Double.compare(Kettle.power, power) == 0 && Double.compare(Kettle.bulk, bulk) == 0 &&  Double.compare(Kettle.weight, weight) == 0 && color == Kettle.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), power, weight, bulk);
    }

    @Override
    public String toString() {
        return "Kettle [" +
                "price - " + super.getPrice() +
                " | power - " + power +
                " | weight - " + weight +
                " | bulk - " + bulk +
                " | color - " + color +
                ']';
    }
}
