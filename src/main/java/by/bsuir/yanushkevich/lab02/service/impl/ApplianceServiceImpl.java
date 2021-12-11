package by.bsuir.yanushkevich.lab02.service.impl;

import by.bsuir.yanushkevich.lab02.dao.ApplianceDAO;
import by.bsuir.yanushkevich.lab02.dao.DAOFactory;
import by.bsuir.yanushkevich.lab02.entity.Appliance;
import by.bsuir.yanushkevich.lab02.entity.criteria.Criteria;
import by.bsuir.yanushkevich.lab02.service.ApplianceService;
import by.bsuir.yanushkevich.lab02.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public Appliance find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		Appliance appliance = applianceDAO.find(criteria);
		
		// you may add your own code here
		
		return appliance;
	}

}

//you may add your own new classes
