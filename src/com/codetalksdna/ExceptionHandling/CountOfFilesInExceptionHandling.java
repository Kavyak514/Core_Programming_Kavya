package com.codetalksdna.ExceptionHandling;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInExceptionHandling {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "exceptionHandling");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
