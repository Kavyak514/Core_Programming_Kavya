import com.codetalksdna.Identifier.CountOfFilesInIdentifierPackage;

public class CountOfProgramsDone {
    public static void main(String[] args) {
        CountOfFilesInIdentifierPackage countOfFilesInAbstractionUsingAbstractClass = new CountOfFilesInIdentifierPackage();
        int[] files = {countOfFilesInAbstractionUsingAbstractClass.returnFileCount()};
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
