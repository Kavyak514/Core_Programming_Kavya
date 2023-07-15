import com.codetalksdna.Identifier.CountOfFilesInIdentifierPackage;
import com.codetalksdna.codingPrograms.CountOfFilesInCodingPrograms;
import com.codetalksdna.dataTypes.CountOfFilesInDataTypes;

public class CountOfProgramsDone {
    public static void main(String[] args) {
        CountOfFilesInIdentifierPackage countOfFilesInAbstractionUsingAbstractClass = new CountOfFilesInIdentifierPackage();
        CountOfFilesInCodingPrograms countOfFilesInCodingPrograms = new CountOfFilesInCodingPrograms();
        CountOfFilesInDataTypes countOfFilesInDataTypes = new CountOfFilesInDataTypes();
        int[] files = {countOfFilesInAbstractionUsingAbstractClass.returnFileCount(), countOfFilesInCodingPrograms.returnFileCount(), countOfFilesInDataTypes.returnFileCount()};
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
