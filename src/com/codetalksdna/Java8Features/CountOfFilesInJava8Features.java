package com.codetalksdna.Java8Features;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInJava8Features {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "Java8Features");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
