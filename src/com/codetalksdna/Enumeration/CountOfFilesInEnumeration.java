package com.codetalksdna.Enumeration;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInEnumeration {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "Enumeration");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
