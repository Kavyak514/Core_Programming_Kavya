package com.codetalksdna.FileIO;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInFileIO {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "FileIO");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
