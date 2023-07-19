package com.codetalksdna.constructor;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInConstructorPackage {
    public int returnFileCount() {
        PathOfProgram pathOfProgram = new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "constructor");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
