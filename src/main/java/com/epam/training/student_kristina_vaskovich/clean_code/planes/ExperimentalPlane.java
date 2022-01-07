package com.epam.training.student_kristina_vaskovich.clean_code.planes;

import com.epam.training.student_kristina_vaskovich.clean_code.models.SecrecyLevelType;
import com.epam.training.student_kristina_vaskovich.clean_code.models.ExperimentalType;

public class ExperimentalPlane extends BasePlane {
    private ExperimentalType experimentalType;
    private SecrecyLevelType secrecyLevelType;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalType experimentalType, SecrecyLevelType secrecyLevelType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalType = experimentalType;
        this.secrecyLevelType = secrecyLevelType;
    }

    public SecrecyLevelType getSecrecyLevelType() {
        return secrecyLevelType;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "ExperimentalPlane{" +
                "experimentalType=" + experimentalType +
                ", secrecyLevelType=" + secrecyLevelType + '}';
    }
}
