package com.codetalksdna.InheritancePrograms;

import PathOfProgram.PathOfProgram;
import java.io.File;
import java.util.Objects;

public class CountOfProgramInInheritance {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "InheritancePrograms");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
