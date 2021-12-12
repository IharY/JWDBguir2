package by.bsuir.yanushkevich.lab02.dao;

import by.bsuir.yanushkevich.lab02.dao.impl.ApplianceDAOImpl;

/**
 * DAOFactory class.
 */
public final class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();
    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

    /**
     * private constructor
     */
    private DAOFactory() {
    }


    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }


    public static DAOFactory getInstance() {
        return instance;
    }
}
