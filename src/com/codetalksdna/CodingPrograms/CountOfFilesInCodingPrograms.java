package com.codetalksdna.CodingPrograms;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInCodingPrograms {
    public int returnFileCount() {
        PathOfProgram pathOfProgram = new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "CodingPrograms");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
