package com.inventoryms.v1.api.controller;


import com.bookingms.v1.api.model.Booking;
import com.bookingms.v1.api.repository.BookingRepository;
import com.bookingms.v1.api.service.BookingService;
import com.inventoryms.v1.api.model.BusInventory;
import com.inventoryms.v1.api.repositrory.BusInventoryRepository;
import com.inventoryms.v1.api.service.BusInventoryService;
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

    private final BusInventoryRepository busInventoryRepository;

    private final WebClient.Builder webClientBuilder;

    private BusInventoryService bookingService;


    @PostMapping("save/busInventory")
    public ResponseEntity<BusInventory> saveBusRoute(@RequestBody BusInventory busInventory)
    {

        busInventoryRepository.save(busInventory);
        return ResponseEntity.ok().body(busInventory);

    }

    @GetMapping("get/booking/detail/{bookingId}")
    public ResponseEntity<Booking> getUserDetail(@PathVariable("bookingId") String bookingId) {

        return ResponseEntity.ok().body(bookingService.getBookingDetail(bookingId));
    }



    @PostMapping("update/booking/{bookingId}") //UPDATE
    public Booking  updateBusRoute(@PathVariable("bookingId") String bookingId, @RequestBody Booking booking)
    {
        bookingRepository.updateBookingDetails(busRoute.getSource(),busRoute.getDestination(),busRoute);
        return booking;
    }

    @DeleteMapping("delete/booking/{bookingId}") //DELETE
    public ResponseEntity<String> deleteBusRoute(@PathVariable("bookingId") String bookingId)
    {
        bookingRepository.deleteById(bookingId);
        return new ResponseEntity<>("Booking Deleted", HttpStatus.OK);
    }



}


