package service;

import domain.Province;

import java.util.List;

public interface ProvinceService {
    List<Province> findAll();

    String findAllJson();
}
