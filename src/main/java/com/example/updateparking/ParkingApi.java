package com.example.updateparking;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/parking2/")

public class ParkingApi {


    private List<EnterOutParking> parking;

    public ParkingApi() {

        parking = new ArrayList<>();

        parking.add(new EnterOutParking("WD321342", "Toyota", "Yaris"));
        parking.add(new EnterOutParking("OR234653", "Opel", "Astra"));
        parking.add(new EnterOutParking("ZE213733", "BMW", "6"));
        //parking.add(null);

    }

    @GetMapping("/All")
    public List<EnterOutParking> getParking() {
        return parking;
    }

    @GetMapping
    public EnterOutParking getParkingbyID(@RequestParam String i) {
        Optional<EnterOutParking> first = parking.stream().
                filter(e -> e.getId() == i)
                .findFirst();

        return first.get();
    }

    @PostMapping
    public boolean addCar(@RequestBody EnterOutParking enterOutParking) {
        return parking.add(enterOutParking);
    }


    @PutMapping
    public boolean updateCar(@RequestBody EnterOutParking enterOutParking) {
        return parking.add(enterOutParking);
    }

    @DeleteMapping
    public boolean deleteCar(@RequestParam String i) {
        return parking.removeIf(element -> element.getId() == i);
    }
}

