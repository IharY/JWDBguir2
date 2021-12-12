package by.bsuir.yanushkevich.lab02.entity;

import by.bsuir.yanushkevich.lab02.common.ApplianceNameConstant;
import by.bsuir.yanushkevich.lab02.common.SearchFeatureConstant;
import by.bsuir.yanushkevich.lab02.entity.enums.Color;
import by.bsuir.yanushkevich.lab02.entity.enums.Company;

import java.util.Objects;

public class TabletPC extends Appliance {

    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private Color color;
    private Company company;

    /**
     * Instantiates a new Tab.
     */
    public TabletPC() {
    }

    /**
     * Instantiates a new TabletPC.
     *
     * @param price           the price
     * @param batteryCapacity the battery capacity
     * @param displayInches   the display inches
     * @param memoryRom       the memory rom
     * @param color               the color
     * @param company             the company

     */
    public TabletPC(double price, double batteryCapacity, double displayInches, double memoryRom, Color color, Company company){
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.color = color;
        this.company = company;

    }

    @Override
    public boolean isMatchesCriteria(String criteriaName, Object value) {
        switch (criteriaName) {
            case SearchFeatureConstant.PRICE:
            case SearchFeatureConstant.MORE_THAN_CURRENT_PRICE:
            case SearchFeatureConstant.LESS_THAN_CURRENT_PRICE:
            case SearchFeatureConstant.EQUAL_CURRENT_PRICE:
                return super.isMatchesCriteria(criteriaName, value);
            case SearchFeatureConstant.APPLIANCE_NAME:
                return ApplianceNameConstant.TABLETPC.equals(value);
            case SearchFeatureConstant.BATTERY_CAPACITY:
                return (double) value == batteryCapacity;
            case SearchFeatureConstant.COLOR:
                return color.equals(Color.valueOf((String) value));
            case SearchFeatureConstant.MEMORY_ROM:
                return (double) value == memoryRom;
            case SearchFeatureConstant.COMPANY:
                return company.equals(Company.valueOf((String) value));
            case SearchFeatureConstant.DISPLAY_INCHES:
                return (double) value == displayInches;
            default:
                return false;
        }
    }


    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public Color getColor() {
        return color;
    }

    public Company getCompany() {
        return company;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TabletPC TabletPC = (TabletPC) o;
        return batteryCapacity == TabletPC.batteryCapacity
                && Double.compare(TabletPC.displayInches, displayInches) == 0
                && memoryRom == TabletPC.memoryRom
                && color == TabletPC.color
                && company == TabletPC.company;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, displayInches, memoryRom, color, company );
    }

    @Override
    public String toString() {
        return "TabletPC [" +
                "price - " + super.getPrice() +
                " | batteryCapacity - " + batteryCapacity +
                " | displayInches - " + displayInches +
                " | memoryRom - " + memoryRom +
                " | Color - " + color +
                " | Company - " + company +
                ']';
    }
}
