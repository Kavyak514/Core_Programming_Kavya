package com.codetalksdna.Identifier;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInIdentifierPackage {
    public int returnFileCount() {
        PathOfProgram pathOfProgram = new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "Identifier");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
