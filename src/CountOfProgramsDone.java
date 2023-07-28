import com.codetalksdna.Abstraction.CountOfFilesInAbstraction;
import com.codetalksdna.Arrays.CountOfFilesInArrays;
import com.codetalksdna.EncapsulationPrograms.CountOfFilesInEncapsulation;
import com.codetalksdna.ExceptionHandling.CountOfFilesInExceptionHandling;
import com.codetalksdna.Identifier.CountOfFilesInIdentifierPackage;
import com.codetalksdna.CodingPrograms.CountOfFilesInCodingPrograms;
import com.codetalksdna.Constructor.CountOfFilesInConstructorPackage;
import com.codetalksdna.DataTypes.CountOfFilesInDataTypes;
import com.codetalksdna.InheritancePrograms.CountOfProgramInInheritance;
import com.codetalksdna.Objects.CountOfFilesInObjectsPackage;
import com.codetalksdna.PolymorphismPrograms.CountOfProgramInPolymorohism;
import com.codetalksdna.UserInput.CountOfFilesInUserInputPackage;

public class CountOfProgramsDone {
    public static void main(String[] args) {
        CountOfFilesInAbstraction countOfFilesInAbstraction = new CountOfFilesInAbstraction();
        CountOfFilesInArrays countOfFilesInArrays = new CountOfFilesInArrays();
        CountOfFilesInCodingPrograms countOfFilesInCodingPrograms = new CountOfFilesInCodingPrograms();
        CountOfFilesInConstructorPackage countOfFilesInConstructorPackage = new CountOfFilesInConstructorPackage();
        CountOfFilesInDataTypes countOfFilesInDataTypes = new CountOfFilesInDataTypes();
        CountOfFilesInEncapsulation countOfFilesInEncapsulation = new CountOfFilesInEncapsulation();
        CountOfFilesInExceptionHandling countOfFilesInExceptionHandling = new CountOfFilesInExceptionHandling();
        CountOfFilesInIdentifierPackage countOfFilesInIdentifierPackage = new CountOfFilesInIdentifierPackage();
        CountOfProgramInInheritance countOfProgramInInheritance = new CountOfProgramInInheritance();
        CountOfFilesInObjectsPackage countOfFilesInObjectsPackage = new CountOfFilesInObjectsPackage();
        CountOfProgramInPolymorohism countOfProgramInPolymorohism = new CountOfProgramInPolymorohism();
        CountOfFilesInUserInputPackage countOfFilesInUserInputPackage = new CountOfFilesInUserInputPackage();
        int[] files = {countOfFilesInAbstraction.returnFileCount(), countOfFilesInCodingPrograms.returnFileCount(), countOfFilesInDataTypes.returnFileCount(), countOfFilesInUserInputPackage.returnFileCount(), countOfFilesInConstructorPackage.returnFileCount(), countOfFilesInArrays.returnFileCount(), countOfFilesInEncapsulation.returnFileCount(), countOfFilesInIdentifierPackage.returnFileCount(), countOfProgramInInheritance.returnFileCount(), countOfProgramInPolymorohism.returnFileCount(), countOfFilesInObjectsPackage.returnFileCount(), countOfFilesInExceptionHandling.returnFileCount()};
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
