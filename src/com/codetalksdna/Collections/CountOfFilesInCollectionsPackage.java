package com.codetalksdna.Collections;

import PathOfProgram.PathOfProgram;

import java.io.File;
import java.util.Objects;

public class CountOfFilesInCollectionsPackage {
    public int returnFileCount() {
        PathOfProgram pathOfProgram = new PathOfProgram();
        File file = new File(pathOfProgram.getPath() + "Collections");
        return Objects.requireNonNull(file.listFiles()).length;
    }
}
