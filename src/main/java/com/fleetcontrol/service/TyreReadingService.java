package com.fleetcontrol.service;

import com.fleetcontrol.dto.TyreReadingRequest;
import com.fleetcontrol.model.TyreReading;

public interface TyreReadingService {

    TyreReading createTyreReading(TyreReadingRequest form);

}
