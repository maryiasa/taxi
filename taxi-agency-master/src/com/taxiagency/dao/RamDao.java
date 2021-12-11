package com.taxiagency.dao;

import com.taxiagency.domain.Car;
import com.taxiagency.domain.Entity;

import java.util.*;

public class RamDao<T extends Entity> implements Dao<T> {

    private Map<String, T> ram;

    public RamDao() {

        this.ram = new HashMap<>();
    }

    @Override
    public String save(T obj) {
        ram.put(obj.getId(), obj);
        return "Сохранено";
    }

    @Override
    public void update(T obj) {
        ram.put(obj.getId(), obj);
    }

    @Override
    public void upsert(T obj) {

    }

    @Override
    public void delete(T obj) {
        ram.remove(obj.getId());
    }


    @Override
    public T findById(String id) {
        return ram.get(id);
    }

    @Override
    public List<T> findAll() {
        return this.find(null);
    }

    public List<T> find(String param) {
        List<T> objects = new ArrayList<>();
        Set<String> keys = ram.keySet();
        System.out.println(ram);
        for (String key : keys) {
            T obj = ram.get(key);

            if (param == null || param.trim().equals("")) {
                objects.add(obj);
            } else {
                if (obj instanceof Car) {

                    }
                if (obj.toString().contains(param)) {
                    objects.add(obj);
                }
            }
        }
        return objects;
    }
}
