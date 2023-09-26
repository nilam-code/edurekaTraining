package com.maint.adminms.v1.api.repository;

import com.maint.adminms.v1.api.model.BusRoute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRouteRepository  extends JpaRepository<BusRoute,String> {
    void updateSourceAndDestination(String source, String destination, BusRoute busRoute);
}
