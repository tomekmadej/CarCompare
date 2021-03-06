package pl.CarComp.utils.converters;

import pl.CarComp.database.models.CarCapacity;
import pl.CarComp.modelFX.CapacitiesFX;

public class ConverterCapacity {
    public static CarCapacity convertToCapacity(CapacitiesFX capacitiesFX){
        CarCapacity carCapacity=new CarCapacity();
        carCapacity.setId(capacitiesFX.getId());
        carCapacity.setCapacity(capacitiesFX.getCapacity());
        return carCapacity;
    }
    public static CapacitiesFX convertToCapacitiesFX(CarCapacity carCapacity){
        CapacitiesFX capacitiesFX=new CapacitiesFX();
        capacitiesFX.setId(carCapacity.getId());
        capacitiesFX.setCapacity(carCapacity.getCapacity());
        capacitiesFX.setModelsFXObjectProperty(ConverterModels.convertToModelFX(carCapacity.getModel()));
        return capacitiesFX;
    }
}
