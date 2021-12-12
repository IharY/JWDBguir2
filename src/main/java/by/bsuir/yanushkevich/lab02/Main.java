package by.bsuir.yanushkevich.lab02;

import by.bsuir.yanushkevich.lab02.common.ApplianceNameConstant;
import by.bsuir.yanushkevich.lab02.entity.Appliance;
import by.bsuir.yanushkevich.lab02.entity.feature.Feature;
import by.bsuir.yanushkevich.lab02.entity.feature.SearchFeature;
import by.bsuir.yanushkevich.lab02.exception.ResourceException;
import by.bsuir.yanushkevich.lab02.exception.ServiceException;
import by.bsuir.yanushkevich.lab02.service.ApplianceService;
import by.bsuir.yanushkevich.lab02.service.ServiceFactory;

import java.util.List;

/**
 * Main class. The entry point of application.
 */

public class Main {



    public static void main(String[] args) throws ServiceException, ResourceException {
        List<Appliance> appliances;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Feature featureLaptop = new Feature(ApplianceNameConstant.LAPTOP);
        featureLaptop.add(SearchFeature.PriceFilter.LESS_THAN_CURRENT_PRICE.name(), 8000.0);
        appliances = service.find(featureLaptop);
        System.out.println("Find all Laptops that price is less 8000.0:");
        PrinterAppliance.print(appliances);

        //////////////////////////////////////////////////////////////////

/*      Feature featureTablePC = new Feature(ApplianceNameConstant.TABLETPC);
        featureTablePC.add(SearchFeature.TabletPC.COLOR.name(), "WHITE");
        featureTablePC.add(SearchFeature.TabletPC.COMPANY.name(), "LG");
        System.out.println("\nFind all TabletPC that COLOR is WHITE and COMPANY is LG:");
        appliances = service.find(featureTablePC);
        PrinterAppliance.print(appliances);*/

        Feature featureFridge = new Feature(ApplianceNameConstant.FRIDGE);
        featureFridge.add(SearchFeature.Fridge.COLOR.name(), "WHITE");
        featureFridge.add(SearchFeature.Fridge.COMPANY.name(), "LG");
        System.out.println("\nFind all Fridges that COLOR is WHITE and COMPANY is LG:");
        appliances = service.find(featureFridge);
        PrinterAppliance.print(appliances);

       //////////////////////////////////////////////////////////////////

        Feature featureKettle = new Feature(ApplianceNameConstant.KETTLE);
//        featureKettle.add(SearchFeature.Kettle.POWER.name(), 1000.0);
//        featureKettle.add(SearchFeature.Kettle.BULK.name(), 1.0);
        appliances = service.find(featureKettle);
        System.out.println("\nFind all Kettles in Catalog:");
        PrinterAppliance.print(appliances);
    }
}
