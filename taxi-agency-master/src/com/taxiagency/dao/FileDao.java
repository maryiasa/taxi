package com.taxiagency.dao;

import com.taxiagency.domain.Entity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileDao<B> implements Dao {
    @Override
    public String save(Entity obj) {
        return null;
    }

    @Override
    public void update(Entity obj) {

    }

    @Override
    public void upsert(Entity obj) {

    }

    @Override
    public void delete(Entity obj) {

    }

    @Override
    public Entity findById(String id) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }

    public void createFile(String dir, String fileName, List<B> list) {
        File path = new File(dir);
        boolean created1 = path.mkdirs();
        System.out.println(list);
        if (created1) {
            File file = new File(dir + fileName);
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (IOException e4) {
                e4.printStackTrace();
            }

            try (FileWriter fw = new FileWriter(file);
                 BufferedWriter bw = new BufferedWriter(fw)) {
                 bw.write(list.toString());
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
    }
}
