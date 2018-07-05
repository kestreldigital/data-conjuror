package com.kestreldigital.conjuror.utils;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResourceUtils {

    public List<String> readResourceToStringList(String resourceName) {
        List<String> stringList = new ArrayList<>();
        try {
            String text = IOUtils.toString(this.getClass().getResourceAsStream(resourceName), "UTF-8");
            String[] lines = text.split("\n");
            stringList.addAll(Arrays.asList(lines));
        } catch (IOException e) {
            // TODO: Error logging!
        }
        return stringList;
    }

}
