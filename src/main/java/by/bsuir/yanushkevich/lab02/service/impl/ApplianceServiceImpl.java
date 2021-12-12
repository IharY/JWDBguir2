package by.bsuir.yanushkevich.lab02.service.impl;

import by.bsuir.yanushkevich.lab02.dao.ApplianceDAO;
import by.bsuir.yanushkevich.lab02.dao.DAOFactory;
import by.bsuir.yanushkevich.lab02.dao.ExceptionMessageConstant;
import by.bsuir.yanushkevich.lab02.entity.Appliance;
import by.bsuir.yanushkevich.lab02.entity.feature.Feature;
import by.bsuir.yanushkevich.lab02.exception.ResourceException;
import by.bsuir.yanushkevich.lab02.exception.ServiceException;
import by.bsuir.yanushkevich.lab02.service.ApplianceService;
import by.bsuir.yanushkevich.lab02.service.validator.Validator;

import java.util.List;

/**
 * ApplianceServiceImpl class that works with appliances DAO.
 *
 */
public class ApplianceServiceImpl implements ApplianceService {

    /**
     * Method that find appliances by criteria.
     *
     * @param feature the criteria
     * @return appliances
     * @throws ServiceException exception
     */
    @Override
    public List<Appliance> find(Feature feature) throws ServiceException {
        if (!Validator.isCriteriaValid(feature)) {
            throw new ServiceException(ExceptionMessageConstant.INVALID_CRITERIA_EXCEPTION_MSG);
        }

        List<Appliance> appliances;
        try {
            DAOFactory factory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = factory.getApplianceDAO();
            appliances = applianceDAO.find(feature);
        } catch (ResourceException e) {
            throw new ServiceException(e);
        }
        return appliances;
    }

}
