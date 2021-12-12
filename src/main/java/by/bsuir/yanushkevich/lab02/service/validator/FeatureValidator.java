package by.bsuir.yanushkevich.lab02.service.validator;

/**
 * CriteriaValidator interface.
 
 */
public interface FeatureValidator {

    /**
     * Validate value of a search criteria
     *
     * @param value - value to validate
     * @return true, if value is valid. Otherwise, false.
     */
    boolean isCriteriaValid(Object value);
}
