import com.codetalksdna.Identifier.CountOfFilesInIdentifierPackage;
import com.codetalksdna.codingPrograms.CountOfFilesInCodingPrograms;
import com.codetalksdna.constructor.CountOfFilesInConstructorPackage;
import com.codetalksdna.dataTypes.CountOfFilesInDataTypes;
import com.codetalksdna.userInput.CountOfFilesInUserInputPackage;

public class CountOfProgramsDone {
    public static void main(String[] args) {
        CountOfFilesInCodingPrograms countOfFilesInCodingPrograms = new CountOfFilesInCodingPrograms();
        CountOfFilesInConstructorPackage countOfFilesInConstructorPackage = new CountOfFilesInConstructorPackage();
        CountOfFilesInDataTypes countOfFilesInDataTypes = new CountOfFilesInDataTypes();
        CountOfFilesInIdentifierPackage countOfFilesInAbstractionUsingAbstractClass = new CountOfFilesInIdentifierPackage();
        CountOfFilesInUserInputPackage countOfFilesInUserInputPackage = new CountOfFilesInUserInputPackage();
        int[] files = {countOfFilesInAbstractionUsingAbstractClass.returnFileCount(), countOfFilesInCodingPrograms.returnFileCount(), countOfFilesInDataTypes.returnFileCount(), countOfFilesInUserInputPackage.returnFileCount(), countOfFilesInConstructorPackage.returnFileCount()};
        System.out.println(files.length);
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
