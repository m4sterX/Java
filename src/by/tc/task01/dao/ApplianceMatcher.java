package by.tc.task01.dao;

import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ApplianceMatcher {
    public List<String> match(List<String> appliances, Criteria criteria) {
        List<String> results = new ArrayList<String>();
        List<String> requests = partMatchFormer(criteria);

        for (String concreteApplianceData : appliances) {
            if (isMatch(concreteApplianceData, requests)) {
                results.add(concreteApplianceData);
            }
        }

        return results;
    }

    private List<String> partMatchFormer(Criteria criteria) {
        List<String> requests = new ArrayList<String>();
        Set<String> keys = criteria.getCriteria().keySet();
        for (String key : keys) {
            Object value = criteria.getCriteria().get(key);
            String data = key + "=" + value.toString();
            requests.add(data);
        }
        return requests;
    }




    private boolean isMatch(String applianceData, List<String> requests){

        for(String request : requests){
            if(!applianceData.contains(request)){
                return false;
            }
        }

        return true;
    }

}
