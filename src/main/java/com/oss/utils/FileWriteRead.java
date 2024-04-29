package com.oss.utils;

import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public abstract class FileWriteRead {
    public static <E> List<E> readFile(String fileName, Type type) {
        try {
            byte[] bytes = Files.readAllBytes(Path.of(fileName));
            return GlobalVar.GSON.fromJson(new String(bytes), type);
        }catch (Exception e) {
            System.out.println("Exception = " + e.getMessage());
        }
        return new ArrayList<>();
    }
    public static <E> void writeFile(String fileName, List<E> data) {
        try {
            String json = GlobalVar.GSON.toJson(data);
            Files.writeString(Path.of(fileName),json);
        }catch (Exception e) {
            System.out.println("Exception = " + e.getMessage());
        }
    }
}
