package by.bsuir.yanushkevich.lab02.service.validator.impl;

import by.bsuir.yanushkevich.lab02.entity.enums.CPU;
import by.bsuir.yanushkevich.lab02.service.validator.FeatureValidator;

/**
 * CPUValidator class.
 
 */
public class CPUValidator implements FeatureValidator {

    /**
     * Method that checks valid of cpu.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            CPU.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
