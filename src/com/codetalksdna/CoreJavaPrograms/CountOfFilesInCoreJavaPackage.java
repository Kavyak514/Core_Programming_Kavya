package com.codetalksdna.CoreJavaPrograms;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInCoreJavaPackage {
    public int returnFileCount() {
        PathOfProgram pathOfProgram = new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "CoreJavaPrograms");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
