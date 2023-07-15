package com.codetalksdna.dataTypes;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInDataTypes {
    public int returnFileCount() {
        PathOfProgram pathOfProgram = new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "dataTypes");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
