package com.fleetcontrol.service;

import com.fleetcontrol.dto.TyreReadingRequest;
import com.fleetcontrol.model.TyreReading;

import java.util.List;

public interface TyreReadingService {

    TyreReading createTyreReading(TyreReadingRequest form);

    List<TyreReading> getReadingsByTyreId(Long tyreId);

}
