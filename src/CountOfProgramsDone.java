import com.codetalksdna.Arrays.CountOfFilesInArrays;
import com.codetalksdna.Identifier.CountOfFilesInIdentifierPackage;
import com.codetalksdna.CodingPrograms.CountOfFilesInCodingPrograms;
import com.codetalksdna.Constructor.CountOfFilesInConstructorPackage;
import com.codetalksdna.DataTypes.CountOfFilesInDataTypes;
import com.codetalksdna.UserInput.CountOfFilesInUserInputPackage;

public class CountOfProgramsDone {
    public static void main(String[] args) {
        CountOfFilesInArrays countOfFilesInArrays = new CountOfFilesInArrays();
        CountOfFilesInCodingPrograms countOfFilesInCodingPrograms = new CountOfFilesInCodingPrograms();
        CountOfFilesInConstructorPackage countOfFilesInConstructorPackage = new CountOfFilesInConstructorPackage();
        CountOfFilesInDataTypes countOfFilesInDataTypes = new CountOfFilesInDataTypes();
        CountOfFilesInIdentifierPackage countOfFilesInAbstractionUsingAbstractClass = new CountOfFilesInIdentifierPackage();
        CountOfFilesInUserInputPackage countOfFilesInUserInputPackage = new CountOfFilesInUserInputPackage();
        int[] files = {countOfFilesInAbstractionUsingAbstractClass.returnFileCount(), countOfFilesInCodingPrograms.returnFileCount(), countOfFilesInDataTypes.returnFileCount(), countOfFilesInUserInputPackage.returnFileCount(), countOfFilesInConstructorPackage.returnFileCount(), countOfFilesInArrays.returnFileCount()};
        System.out.println("Packages Created Here" + " " + files.length);
        sumOfProgramsWeDidTillNow(files);
    }

    public static void sumOfProgramsWeDidTillNow(int[] files) {
        int sum = 0;
        for (int file : files) {
            sum = sum + file;
        }
        System.out.println("Total Number of Programs Done till Now" + "::" + (sum));
    }
}
