package com.codetalksdna.UserInput;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInUserInputPackage {
    public int returnFileCount() {
        PathOfProgram pathOfProgram = new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "UserInput");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
