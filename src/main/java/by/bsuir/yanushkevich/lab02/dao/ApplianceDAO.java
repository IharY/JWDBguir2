package by.bsuir.yanushkevich.lab02.dao;

import by.bsuir.yanushkevich.lab02.entity.Appliance;
import by.bsuir.yanushkevich.lab02.entity.criteria.Criteria;

public interface ApplianceDAO {
	Appliance find(Criteria criteria);
}
