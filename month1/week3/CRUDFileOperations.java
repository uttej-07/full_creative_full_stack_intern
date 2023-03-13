package FilesTask;

import java.io.*;
import java.util.Scanner;

public class CRUDFileOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String fileName;
        do {
        	 File directoryPath = new File("E:\\java_prgs\\Java_Full_Creative_Task");
         	File[] filesList = directoryPath.listFiles();
            System.out.println("Enter your choice: ");
            System.out.println("1. Create a file");
            System.out.println("2. Read from a file");
            System.out.println("3. Write to a file");
            System.out.println("4. Update a file");
            System.out.println("5. Delete a file");
            System.out.println("0. Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the file name: ");
                    fileName = sc.nextLine();
                    createFile(fileName);
                    break;
                case 2:
                	 System.out.println("List of files and directories in the specified directory:");
                     for(File file : filesList) {
                        System.out.println("File name: "+file.getName());
                        System.out.println(" ");
                     }
                    System.out.println("Enter the file name: ");
                    fileName = sc.nextLine();
                    readFile(fileName);
                    break;
                case 3:
                	 System.out.println("List of files and directories in the specified directory:");
                     for(File file : filesList) {
                        System.out.println("File name: "+file.getName());
                        System.out.println(" ");
                     }
                    System.out.println("Enter the file name: ");
                    fileName = sc.nextLine();
                    System.out.println("Enter the content to write to file: ");
                    String content = sc.nextLine();
                    writeFile(fileName, content);
                    break;
                case 4:
                	 System.out.println("List of files and directories in the specified directory:");
                     for(File file : filesList) {
                        System.out.println("File name: "+file.getName());
                        System.out.println(" ");
                     }
                    System.out.println("Enter the file name: ");
                    fileName = sc.nextLine();
                    System.out.println("Enter the new content to update the file: ");
                    String newContent = sc.nextLine();
                    updateFile(fileName, newContent);
                    break;
                case 5:
                    System.out.println("Enter the file name: ");
                    fileName = sc.nextLine();
                    deleteFile(fileName);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
                    break;
            }
        } while (choice != 0);
    }

    public static void createFile(String fileName) {
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully."+file.getAbsolutePath()+file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void writeFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(content);
            writer.close();
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void updateFile(String fileName, String newContent) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(newContent);
            writer.close();
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("Error updating file: " + e.getMessage());
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Error deleting file. File may not exist.");
        }
    }
}

