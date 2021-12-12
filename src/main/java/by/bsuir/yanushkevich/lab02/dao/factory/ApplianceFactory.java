package by.bsuir.yanushkevich.lab02.dao.factory;

import by.bsuir.yanushkevich.lab02.common.ApplianceNameConstant;
import by.bsuir.yanushkevich.lab02.dao.ExceptionMessageConstant;
import by.bsuir.yanushkevich.lab02.dao.factory.impl.FridgeFactory;
import by.bsuir.yanushkevich.lab02.dao.factory.impl.KettleFactory;
import by.bsuir.yanushkevich.lab02.dao.factory.impl.LaptopFactory;
import by.bsuir.yanushkevich.lab02.dao.factory.impl.TabletpcFactory;
import by.bsuir.yanushkevich.lab02.entity.Appliance;
import org.w3c.dom.NodeList;

/**
 * ApplianceFactory abstract class.
 */
public abstract class ApplianceFactory {

    /**
     * Create appliance appliance.
     *
     * @param nodeList the node list
     * @return the appliance
     */
    public abstract Appliance createAppliance(NodeList nodeList);

    /**
     * Gets appliance factory.
     *
     * @param applianceName the appliance name
     * @return the appliance factory
     */
    public static ApplianceFactory getApplianceFactory(String applianceName) {
        switch (applianceName) {
            case ApplianceNameConstant.LAPTOP:
                return new LaptopFactory();
            case ApplianceNameConstant.KETTLE:
                return new KettleFactory();
            case ApplianceNameConstant.FRIDGE:
                return new FridgeFactory();
            case ApplianceNameConstant.TABLETPC:
                return new TabletpcFactory();
            default:
                throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_FACTORY_EXCEPTION_MSG);
        }
    }

}
