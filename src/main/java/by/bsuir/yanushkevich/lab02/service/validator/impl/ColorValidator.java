package by.bsuir.yanushkevich.lab02.service.validator.impl;

import by.bsuir.yanushkevich.lab02.entity.enums.Color;
import by.bsuir.yanushkevich.lab02.service.validator.FeatureValidator;

/**
 * ColorValidator class.
 
 */
public class ColorValidator implements FeatureValidator {

    /**
     * Method that checks valid of color.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Color.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
