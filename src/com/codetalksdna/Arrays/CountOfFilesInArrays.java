package com.codetalksdna.Arrays;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInArrays {
    public int returnFileCount() {
        PathOfProgram pathOfProgram = new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "Arrays");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
