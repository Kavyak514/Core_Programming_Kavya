package com.codetalksdna.Objects;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInObjectsPackage {
    public int returnFileCount() {
        PathOfProgram pathOfProgram = new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "Objects");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
