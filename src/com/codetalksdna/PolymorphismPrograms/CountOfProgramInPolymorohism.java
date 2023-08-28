package com.codetalksdna.PolymorphismPrograms;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfProgramInPolymorohism {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "PolymorphismPrograms");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
