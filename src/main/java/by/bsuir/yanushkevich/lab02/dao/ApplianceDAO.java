package by.bsuir.yanushkevich.lab02.dao;

import by.bsuir.yanushkevich.lab02.entity.Appliance;
import by.bsuir.yanushkevich.lab02.entity.feature.Feature;
import by.bsuir.yanushkevich.lab02.exception.ResourceException;

import java.util.List;

/**
 * ApplianceDAO interface of an applianceDao class.
 */
public interface ApplianceDAO {

    /**
     * Finds all appliances by given criteria.
     *
     * @param feature {@link Feature}
     * @return list of appliance
     * @throws ResourceException exception
     */
    List<Appliance> find(Feature feature) throws ResourceException;
}
