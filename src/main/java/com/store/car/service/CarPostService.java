package com.store.car.service;

import com.store.car.dto.CarPostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarPostService {

    void newPostDetails(CarPostDto carPostDto);

    List<CarPostDto> getCarSales();

    void changeCarSales(CarPostDto carPostDto, Long postId);

    void removeCarSale(Long postId);
}
