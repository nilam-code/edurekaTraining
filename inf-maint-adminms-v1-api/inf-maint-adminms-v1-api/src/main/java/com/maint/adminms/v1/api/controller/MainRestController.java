package com.maint.adminms.v1.api.controller;


import com.maint.adminms.v1.api.model.BusRoute;
import com.maint.adminms.v1.api.repository.BusRouteRepository;
import com.maint.adminms.v1.api.service.BusRouteService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class MainRestController {

    Logger logger = LoggerFactory.getLogger(MainRestController.class);

    private final BusRouteRepository busRouteRepository;

    private final WebClient.Builder webClientBuilder;

    private BusRouteService busRouteService;


    @PostMapping("save/busRoute")
    public ResponseEntity<BusRoute> saveBusRoute(@RequestBody BusRoute busRouteDetail)
    {

            busRouteRepository.save(busRouteDetail);
            return ResponseEntity.ok().body(busRouteDetail);

    }

    @GetMapping("get/busroute/detail/{busId}")
    public ResponseEntity<BusRoute> getUserDetail(@PathVariable("busId") String busId) {

        return ResponseEntity.ok().body(busRouteService.getBusRouteDetail(busId));
    }



    @PostMapping("update/busRoute/{busId}") //UPDATE
    public BusRoute  updateBusRoute(@PathVariable("busId") String busId, @RequestBody BusRoute busRoute)
    {
        busRouteRepository.updateSourceAndDestination(busRoute.getSource(),busRoute.getDestination(),busRoute);
        return busRoute;
    }

    @DeleteMapping("delete/busRoute/{busID}") //DELETE
    public ResponseEntity<String> deleteBusRoute(@PathVariable("busId") String busId)
    {
        busRouteRepository.deleteById(busId);
        return new ResponseEntity<>("Product Deleted", HttpStatus.OK);
    }



}
