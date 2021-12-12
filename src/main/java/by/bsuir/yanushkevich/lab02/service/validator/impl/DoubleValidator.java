package by.bsuir.yanushkevich.lab02.service.validator.impl;

import by.bsuir.yanushkevich.lab02.service.validator.FeatureValidator;

/**
 * DoubleValidator class.
 
 */
public class DoubleValidator implements FeatureValidator {

    /**
     * Method that checks valid of double.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > 0;
        } else {
            return false;
        }
    }

}
