import com.codetalksdna.Abstraction.CountOfFilesInAbstraction;
import com.codetalksdna.Arrays.CountOfFilesInArrays;
import com.codetalksdna.Collections.CountOfFilesInCollectionsPackage;
import com.codetalksdna.EncapsulationPrograms.CountOfFilesInEncapsulation;
import com.codetalksdna.ExceptionHandling.CountOfFilesInExceptionHandling;
import com.codetalksdna.FileIO.CountOfFilesInFileIO;
import com.codetalksdna.Identifier.CountOfFilesInIdentifierPackage;
import com.codetalksdna.CodingPrograms.CountOfFilesInCodingPrograms;
import com.codetalksdna.Constructor.CountOfFilesInConstructorPackage;
import com.codetalksdna.DataTypes.CountOfFilesInDataTypes;
import com.codetalksdna.InheritancePrograms.CountOfProgramInInheritance;
import com.codetalksdna.Java8Features.CountOfFilesInJava8Features;
import com.codetalksdna.Multithreading.CountOfFilesInMultithreading;
import com.codetalksdna.Objects.CountOfFilesInObjectsPackage;
import com.codetalksdna.PolymorphismPrograms.CountOfProgramInPolymorohism;
import com.codetalksdna.Serialization.CountOfFilesInSerialization;
import com.codetalksdna.UserInput.CountOfFilesInUserInputPackage;

public class CountOfProgramsDone {
    public static void main(String[] args) {
        CountOfFilesInAbstraction countOfFilesInAbstraction = new CountOfFilesInAbstraction();
        CountOfFilesInArrays countOfFilesInArrays = new CountOfFilesInArrays();
        CountOfFilesInCodingPrograms countOfFilesInCodingPrograms = new CountOfFilesInCodingPrograms();
        CountOfFilesInCollectionsPackage countOfFilesInCollectionsPackage = new CountOfFilesInCollectionsPackage();
        CountOfFilesInConstructorPackage countOfFilesInConstructorPackage = new CountOfFilesInConstructorPackage();
        CountOfFilesInDataTypes countOfFilesInDataTypes = new CountOfFilesInDataTypes();
        CountOfFilesInEncapsulation countOfFilesInEncapsulation = new CountOfFilesInEncapsulation();
        CountOfFilesInExceptionHandling countOfFilesInExceptionHandling = new CountOfFilesInExceptionHandling();
        CountOfFilesInFileIO countOfFilesInFileIO = new CountOfFilesInFileIO();
        CountOfFilesInIdentifierPackage countOfFilesInIdentifierPackage = new CountOfFilesInIdentifierPackage();
        CountOfProgramInInheritance countOfProgramInInheritance = new CountOfProgramInInheritance();
        CountOfFilesInJava8Features countOfFilesInJava8Features = new CountOfFilesInJava8Features();
        CountOfFilesInMultithreading countOfFilesInMultithreading = new CountOfFilesInMultithreading();
        CountOfFilesInObjectsPackage countOfFilesInObjectsPackage = new CountOfFilesInObjectsPackage();
        CountOfProgramInPolymorohism countOfProgramInPolymorohism = new CountOfProgramInPolymorohism();
        CountOfFilesInSerialization countOfFilesInSerialization = new CountOfFilesInSerialization();
        CountOfFilesInUserInputPackage countOfFilesInUserInputPackage = new CountOfFilesInUserInputPackage();
        int[] files = {countOfFilesInAbstraction.returnFileCount(), countOfFilesInCodingPrograms.returnFileCount(), countOfFilesInDataTypes.returnFileCount(), countOfFilesInUserInputPackage.returnFileCount(), countOfFilesInConstructorPackage.returnFileCount(), countOfFilesInArrays.returnFileCount(), countOfFilesInEncapsulation.returnFileCount(), countOfFilesInIdentifierPackage.returnFileCount(), countOfProgramInInheritance.returnFileCount(), countOfProgramInPolymorohism.returnFileCount(), countOfFilesInObjectsPackage.returnFileCount(), countOfFilesInExceptionHandling.returnFileCount(), countOfFilesInFileIO.returnFileCount(), countOfFilesInMultithreading.returnFileCount(), countOfFilesInJava8Features.returnFileCount(), countOfFilesInSerialization.returnFileCount(), countOfFilesInCollectionsPackage.returnFileCount()};
        System.out.println("Packages Created Here" + " " + files.length);
        sumOfProgramsWeDidTillNow(files);
        System.out.println("Total Number of Programs Done till Now by Yourself" + "::" + countOfFilesInCodingPrograms.returnFileCount());
    }

    public static void sumOfProgramsWeDidTillNow(int[] files) {
        int sum = 0;
        for (int file : files) {
            sum = sum + file;
        }
        System.out.println("Total Number of Programs Done till Now" + "::" + (sum));
    }
}
