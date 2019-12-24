package by.tc.task01.dao.impl;


import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.ApplianceFactory;
import by.tc.task01.dao.ApplianceMatcher;
import by.tc.task01.dao.ApplianceReader;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import java.io.IOException;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {
		ApplianceReader reader = new ApplianceReader("t.txt");
		ApplianceMatcher matcher = new ApplianceMatcher();
		ApplianceFactory factory = new ApplianceFactory();

		List<String> strAppliancesData = null;
		List<Appliance> appliances = null;

		strAppliancesData = reader.read(criteria.getGroupSearchName());
		strAppliancesData = matcher.match(strAppliancesData, criteria);

		appliances = factory.create(strAppliancesData);
		return appliances;
	}
}