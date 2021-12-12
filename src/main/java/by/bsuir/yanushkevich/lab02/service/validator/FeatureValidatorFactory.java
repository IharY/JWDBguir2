package by.bsuir.yanushkevich.lab02.service.validator;

import by.bsuir.yanushkevich.lab02.dao.ExceptionMessageConstant;
import by.bsuir.yanushkevich.lab02.entity.feature.SearchFeature;
import by.bsuir.yanushkevich.lab02.service.validator.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * CriteriaValidatorFactory class.
  */
public class FeatureValidatorFactory {

    private static final FeatureValidatorFactory instance = new FeatureValidatorFactory();
    private final Map<String, FeatureValidator> validators = new HashMap<>();

    {
        validators.put(SearchFeature.General.NAME.name(), new ApplianceNameValidator());
        validators.put(SearchFeature.General.PRICE.name(), new DoubleValidator());
        validators.put(SearchFeature.PriceFilter.MORE_THAN_CURRENT_PRICE.name(), new DoubleValidator());
        validators.put(SearchFeature.PriceFilter.LESS_THAN_CURRENT_PRICE.name(), new DoubleValidator());
        validators.put(SearchFeature.PriceFilter.EQUAL_CURRENT_PRICE.name(), new DoubleValidator());

        validators.put(SearchFeature.Laptop.BATTERY_CAPACITY.name(), new DoubleValidator());
        validators.put(SearchFeature.Laptop.OS.name(), new OSValidator());
        validators.put(SearchFeature.Laptop.MEMORY_ROM.name(), new DoubleValidator());
        validators.put(SearchFeature.Laptop.CPU.name(), new CPUValidator());
        validators.put(SearchFeature.Laptop.DISPLAY_INCHES.name(), new DoubleValidator());

        validators.put(SearchFeature.Kettle.POWER.name(), new DoubleValidator());
        validators.put(SearchFeature.Kettle.WEIGHT.name(), new DoubleValidator());
        validators.put(SearchFeature.Kettle.BULK.name(), new DoubleValidator());
        validators.put(SearchFeature.Kettle.COLOR.name(), new ColorValidator());

        validators.put(SearchFeature.Fridge.COLOR.name(), new ColorValidator());
        validators.put(SearchFeature.Fridge.COMPANY.name(), new CompanyValidator());
    }

    /**
     * private constructor
     */
    private FeatureValidatorFactory() {
    }

    /**
     * Gets instance of CriteriaValidatorFactory
     *
     * @return instance instance
     */
    public static FeatureValidatorFactory getInstance() {
        return instance;
    }


    /**
     * Method that gets needed validator.
     *
     * @param criteriaName name
     * @return validator validator
     */
    public FeatureValidator getValidator(String criteriaName) {
        if (validators.containsKey(criteriaName)) {
            return validators.get(criteriaName);
        }
        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
    }

}
