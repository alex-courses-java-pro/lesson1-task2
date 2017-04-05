package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by arahis on 4/5/17.
 */
@SaveTo(path= "./file.txt")
public class TextContainer {
    private final String TEXT = "(͡° ͜ʖ ͡°)";

    @Saver
    public void save(String path){
        try {
            Path f = Paths.get(path);
            List<String> line = Collections.singletonList(TEXT);
            Files.write(f, line, Charset.forName("UTF-8"));
        }
        catch(IOException io) {
            io.printStackTrace();
        }
    }
}
