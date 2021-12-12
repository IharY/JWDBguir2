package by.bsuir.yanushkevich.lab02.service;

import by.bsuir.yanushkevich.lab02.entity.Appliance;
import by.bsuir.yanushkevich.lab02.entity.feature.Feature;
import by.bsuir.yanushkevich.lab02.exception.ResourceException;
import by.bsuir.yanushkevich.lab02.exception.ServiceException;

import java.util.List;

/**
 * ApplianceService interface of an ApplianceService class.
 */

public interface ApplianceService {

    /**
     * Method that finds list of appliance.
     *
     * @param feature the feature
     * @return the list
     * @throws ResourceException the resource exception
     * @throws ServiceException  the service exception
     */
    List<Appliance> find(Feature feature) throws ResourceException, ServiceException;

}
