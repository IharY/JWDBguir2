package by.bsuir.yanushkevich.lab02.dao.factory.impl;

import by.bsuir.yanushkevich.lab02.dao.ExceptionMessageConstant;
import by.bsuir.yanushkevich.lab02.dao.factory.ApplianceFactory;
import by.bsuir.yanushkevich.lab02.entity.Appliance;
import by.bsuir.yanushkevich.lab02.entity.TabletPC;
import by.bsuir.yanushkevich.lab02.entity.enums.Color;
import by.bsuir.yanushkevich.lab02.entity.enums.Company;
import by.bsuir.yanushkevich.lab02.entity.feature.SearchFeature;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TabletpcFactory extends ApplianceFactory {

    int price;
    double batteryCapacity;
    double displayInches;
    double memoryRom;
    Color color;
    Company company;

    /**
     * Method for create appliance
     *
     * @param nodeList the node list
     * @return appliance {@link Appliance}
     */
    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();

                SearchFeature.TabletPC tabletpcSearchCriteria = SearchFeature.TabletPC.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (tabletpcSearchCriteria) {
                    case PRICE:
                        price = Integer.parseInt(value);
                        break;
                    case BATTERY_CAPACITY:
                        batteryCapacity = Double.parseDouble(value);
                        break;
                    case DISPLAY_INCHES:
                        displayInches = Double.parseDouble(value);
                        break;
                    case MEMORY_ROM:
                        memoryRom = Double.parseDouble(value);
                        break;
                    case COLOR:
                        color = Color.valueOf(value);
                        break;
                    case COMPANY:
                        company = Company.valueOf(value);
                        break;

                    default:
                        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }
            }
        }

        return new TabletPC(price, batteryCapacity, displayInches, memoryRom, color, company);
    }
}
