package by.bsuir.yanushkevich.lab02.service.validator.impl;

import by.bsuir.yanushkevich.lab02.service.validator.FeatureValidator;

/**
 * IntValidator class.
 
 */
public class IntValidator implements FeatureValidator {

    /**
     * Method that checks valid of int.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Integer) {
            return (Integer) value > 0;
        } else {
            return false;
        }
    }

}
