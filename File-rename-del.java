import java.io.File;

public class FileRenameAndDelete {
    public static void main(String[] args) {
        // Check if a file name is provided as a command line argument
        if (args.length != 1) {
            System.out.println("Usage: java FileRenameAndDelete <file_name>");
            return;
        }

        String fileName = args[0];
        File originalFile = new File(fileName);

        // Check if the file exists
        if (!originalFile.exists()) {
            System.out.println("File not found: " + fileName);
            return;
        }

        // Rename the file by adding "_renamed" to the original file name
        String renamedFileName = fileName.replaceFirst("\\.([^.]*)$", "_renamed.$1");
        File renamedFile = new File(renamedFileName);

        if (originalFile.renameTo(renamedFile)) {
            System.out.println("File renamed to: " + renamedFileName);

            // Delete the renamed file
            if (renamedFile.delete()) {
                System.out.println("Renamed file deleted successfully.");
            } else {
                System.out.println("Failed to delete the renamed file.");
            }
        } else {
            System.out.println("Failed to rename the file.");
        }
    }
}
