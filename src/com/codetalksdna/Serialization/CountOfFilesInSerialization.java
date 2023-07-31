package com.codetalksdna.Serialization;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInSerialization {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "Serialization");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
