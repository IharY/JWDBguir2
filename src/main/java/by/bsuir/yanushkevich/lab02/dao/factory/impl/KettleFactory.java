package by.bsuir.yanushkevich.lab02.dao.factory.impl;

import by.bsuir.yanushkevich.lab02.dao.ExceptionMessageConstant;
import by.bsuir.yanushkevich.lab02.dao.factory.ApplianceFactory;
import by.bsuir.yanushkevich.lab02.entity.Appliance;
import by.bsuir.yanushkevich.lab02.entity.Kettle;
import by.bsuir.yanushkevich.lab02.entity.enums.Color;
import by.bsuir.yanushkevich.lab02.entity.feature.SearchFeature;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * KettleFactory class.
 */
public class KettleFactory extends ApplianceFactory {

    int price;
    double power;
    double weight;
    double bulk;
    Color color;


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

                SearchFeature.Kettle KettleSearchFeature
                        = SearchFeature.Kettle.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (KettleSearchFeature) {
                    case PRICE:
                        price = Integer.parseInt(value);
                        break;
                    case POWER:
                        power = Double.parseDouble(value);
                        break;
                    case WEIGHT:
                        weight = Double.parseDouble(value);
                        break;
                    case BULK:
                        bulk = Double.parseDouble(value);
                        break;
                    case COLOR:
                        color = Color.valueOf(value);
                        break;
                    default:
                        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }

            }
        }
        return new Kettle(price, power, weight, bulk, color);
    }

}
