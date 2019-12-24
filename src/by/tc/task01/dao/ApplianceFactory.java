package by.tc.task01.dao;

import by.tc.task01.entity.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class ApplianceFactory {
    public List<Appliance> create(List<String> strAppliancesData){
        List<Appliance> results = new ArrayList<Appliance>();

        for(String data : strAppliancesData){
            results.add(create(data));
        }

        return results;

    }

    private Appliance create(String data){
        String[] applianceData = data.split(" ");

        switch(applianceData[0]){
            case "Oven" :
                return createOven(applianceData);
            case "Laptop" :
                return createLaptop(applianceData);
            case "Refrigerator" :
                return createRefrigerator(applianceData);
            case "Speakers" :
                return createSpeakers(applianceData);
            case "TabletPC" :
                return createTabletPC(applianceData);
            case "VacuumCleaner" :
                return createVacuumCleaner(applianceData);
            default:
                return null;
        }

    }

    private Appliance createVacuumCleaner(String[] data) {
        VacuumCleaner vc = new VacuumCleaner();
        vc.setPOWER_CONSUMPTION(parseInt(data[2].substring(data[2].indexOf("=") + 1)));
        vc.setFILTER_TYPE(data[3].substring(data[3].indexOf("=") + 1));
        vc.setBAG_TYPE(data[4].substring(data[4].indexOf("=") + 1));
        vc.setWAND_TYPE(data[5].substring(data[5].indexOf("=") + 1));
        vc.setMOTOR_SPEED_REGULATION(parseInt(data[6].substring(data[6].indexOf("=") + 1)));
        vc.setCLEANING_WIDTH(parseInt(data[7].substring(data[7].indexOf("=") + 1)));
        return vc;
    }

    private Appliance createTabletPC(String[] data) {
        TabletPC tb = new TabletPC();
        tb.setBATTERY_CAPACITY(parseInt(data[2].substring(data[2].indexOf("=") + 1)));
        tb.setDISPLAY_INCHES(parseInt(data[3].substring(data[3].indexOf("=") + 1)));
        tb.setMEMORY_ROM(parseInt(data[4].substring(data[4].indexOf("=") + 1)));
        tb.setFLASH_MEMORY_CAPACITY(parseInt(data[5].substring(data[5].indexOf("=") + 1)));
        tb.setCOLOR(data[6].substring(data[6].indexOf("=") + 1));
        return tb;
    }

    private Appliance createSpeakers(String[] data) {
        Speakers spkrs = new Speakers();
        spkrs.setPOWER_CONSUMPTION(parseInt(data[2].substring(data[2].indexOf("=") + 1)));
        spkrs.setNUMBER_OF_SPEAKERS(parseInt(data[3].substring(data[3].indexOf("=") + 1)));
        spkrs.setFREQUENCY_RANGE(data[4].substring(data[4].indexOf("=") + 1));
        spkrs.setCORD_LENGTH(parseInt(data[5].substring(data[5].indexOf("=") + 1)));
        return spkrs;
    }

    private Appliance createRefrigerator(String[] data) {
        Refrigerator refrig = new Refrigerator();
        refrig.setPOWER_CONSUMPTION(parseInt(data[2].substring(data[2].indexOf("=") + 1)));
        refrig.setWEIGHT(parseDouble(data[3].substring(data[3].indexOf("=") + 1)));
        refrig.setFREEZER_CAPACITY(parseInt(data[4].substring(data[4].indexOf("=") + 1)));
        refrig.setOVERALL_CAPACITY(parseDouble(data[5].substring(data[5].indexOf("=") + 1)));
        refrig.setHEIGHT(parseDouble(data[6].substring(data[6].indexOf("=") + 1)));
        refrig.setWEIGHT(parseDouble(data[7].substring(data[7].indexOf("=") + 1)));
        return refrig;
    }

    private Appliance createLaptop(String[] data) {
        Laptop laptop = new Laptop();
        laptop.setBATTERY_CAPACITY(parseDouble(data[2].substring(data[2].indexOf("=") + 1)));
        laptop.setOS(data[3].substring(data[3].indexOf("=") + 1));
        laptop.setMEMORY_ROM(parseInt(data[4].substring(data[4].indexOf("=") + 1)));
        laptop.setSYSTEM_MEMORY(parseInt(data[5].substring(data[5].indexOf("=") + 1)));
        laptop.setCPU(parseDouble(data[6].substring(data[6].indexOf("=") + 1)));
        laptop.setDISPLAY_INCHS(parseInt(data[7].substring(data[7].indexOf("=") + 1)));
        return laptop;
    }

    private Appliance createOven(String[] data){
        Oven oven = new Oven();
        oven.setPOWER_CONSUMPTION(parseInt(data[2].substring(data[2].indexOf("=") + 1)));
        oven.setWEIGHT(parseDouble(data[3].substring(data[3].indexOf("=") + 1)));
        oven.setCAPACITY(parseInt(data[4].substring(data[4].indexOf("=") + 1)));
        oven.setDEPTH(parseInt(data[5].substring(data[5].indexOf("=") + 1)));
        oven.setHEIGHT(parseDouble(data[6].substring(data[6].indexOf("=") + 1)));
        oven.setWIDTH(parseDouble(data[7].substring(data[7].indexOf("=") + 1)));
        return oven;
    }

}
