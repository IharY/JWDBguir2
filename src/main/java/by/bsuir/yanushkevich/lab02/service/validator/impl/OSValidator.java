package by.bsuir.yanushkevich.lab02.service.validator.impl;

import by.bsuir.yanushkevich.lab02.entity.enums.OS;
import by.bsuir.yanushkevich.lab02.service.validator.FeatureValidator;

/**
 * OSValidator class.
 
 */
public class OSValidator implements FeatureValidator {

    /**
     * Method that checks valid of os.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            OS.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
