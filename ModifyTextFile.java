package org.studyeasy;
import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;

public class ModifyTextFile {
    public static void main(String[] args) {
        String filePath = "mod.txt"; // Ensure this file exists in the project root
        String oldWord = "old"; // Word to be replaced
        String newWord = "new"; // Replacement word

        modifyFile(filePath, oldWord, newWord);
    }

    public static void modifyFile(String filePath, String oldWord, String newWord) {
        try {
            // Read all lines from the file
            Path path = Paths.get(filePath);
            List<String> lines = Files.readAllLines(path);

            // Modify content
            List<String> modifiedLines = lines.stream()
                    .map(line -> line.replaceAll(oldWord, newWord))
                    .collect(Collectors.toList());

            // Write back to the file
            Files.write(path, modifiedLines, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("File modified successfully!");
        } catch (IOException e) {
            System.err.println("Error modifying file: " + e.getMessage());
        }
    }
}
