package by.bsuir.yanushkevich.lab02.entity.feature;

/**
 * SearchFeature class.
 * Contains all search feature.
 */
public final class SearchFeature {

    /**
     * Contains General search feature
     */
    public enum General {
        NAME, PRICE
    }

    /**
     * Contains Kettle search feature
     */
    public enum Kettle {
        PRICE, POWER, WEIGHT, BULK, COLOR
    }

    /**
     * Contains Kettle search feature
     */
    public enum TabletPC {
        PRICE, BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, COLOR, COMPANY
    }
    /**
     * Contains Laptop search feature
     */
    public enum Laptop {
        PRICE, BATTERY_CAPACITY, OS, MEMORY_ROM, CPU, DISPLAY_INCHES
    }


    /**
     * Contains Fridge search feature
     */
    public enum Fridge {
        PRICE, COLOR, COMPANY
    }

    /**
     * Contains Speakers search feature
     */
    public enum Mouse {
        PRICE, WEIGHT, LENGTH, HEIGHT, WIDTH, DPI
    }

    /**
     * Contains PriceFilter search feature
     */
    public enum PriceFilter {
        MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE
    }

    /**
     * Private constructor.
     */
    private SearchFeature() {
    }
}

