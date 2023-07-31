package com.codetalksdna.Multithreading;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInMultithreading {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "Multithreading");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
