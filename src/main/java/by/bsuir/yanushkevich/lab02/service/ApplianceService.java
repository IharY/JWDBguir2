package by.bsuir.yanushkevich.lab02.service;

import by.bsuir.yanushkevich.lab02.entity.Appliance;
import by.bsuir.yanushkevich.lab02.entity.criteria.Criteria;

public interface ApplianceService {	
	
	Appliance find(Criteria criteria);
	
}
