package com.codetalksdna.Abstraction;


import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class AbstractionPrograms {
    public int returnFileCount() {
        PathOfProgram pathOfProgram =  new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "Abstraction");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
