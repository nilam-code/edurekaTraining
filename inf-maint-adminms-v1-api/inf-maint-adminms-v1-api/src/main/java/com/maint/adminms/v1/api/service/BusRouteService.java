package com.maint.adminms.v1.api.service;

import com.maint.adminms.v1.api.model.BusRoute;
import com.maint.adminms.v1.api.repository.BusRouteRepository;

import java.util.Optional;

public class BusRouteService {

    private BusRouteRepository busRouteRepository;
    public BusRoute getBusRouteDetail(String busId) {

        Optional<BusRoute> byId = busRouteRepository.findById(busId);

        return byId.orElse(null);

    }
}
