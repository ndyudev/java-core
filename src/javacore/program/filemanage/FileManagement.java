package javacore.program.filemanage;

import javacore.program.filemanage.entity.Document;
import javacore.program.filemanage.entity.Status;
import javacore.program.filemanage.service.impl.DocumentServiceImpl;
import javacore.program.filemanage.service.impl.CopyServiceImpl;
import javacore.program.filemanage.service.impl.IOStreamImpl;

import java.util.Map;
import java.util.Scanner;

public class FileManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DocumentServiceImpl docService = new DocumentServiceImpl();
        CopyServiceImpl copyService = new CopyServiceImpl(docService);
        IOStreamImpl ioService = new IOStreamImpl();

        Map<String, Document> loadedData = ioService.readFromFile();
        if (loadedData != null && !loadedData.isEmpty()) {
            docService.setDocumentMap(loadedData);
            System.out.println("Data loaded: " + loadedData.size() + " items.");
        }

        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Document");
            System.out.println("2. View All");
            System.out.println("3. Add Copy");
            System.out.println("5. Save Data");
            System.out.println("0. Exit");
            System.out.print("> Select: ");

            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Numbers only.");
                sc.nextLine();
                choice = -1;
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("ID: "); String id = sc.nextLine();
                    System.out.print("Title: "); String title = sc.nextLine();
                    System.out.print("Author: "); String author = sc.nextLine();
                    docService.addDocument(id, title, author);
                    break;

                case 2:
                    if (docService.getAllDocuments().isEmpty()) {
                        System.out.println("Library is empty.");
                    } else {
                        docService.getAllDocuments().forEach(System.out::println);
                    }
                    break;

                case 3:
                    System.out.print("Doc ID: "); String dId = sc.nextLine();
                    System.out.print("Copy ID: "); String cId = sc.nextLine();
                    System.out.print("Status (1.GOOD, 2.DAMAGED, 3.LOST): ");
                    int st = sc.nextInt();
                    Status s = (st == 2) ? Status.DAMAGED : (st == 3) ? Status.LOST : Status.GOOD;
                    copyService.addCopy(cId, dId, s);
                    break;

                case 5:
                    ioService.writeToFile(docService.getDocumentMap());
                    System.out.println("Data saved to disk.");
                    break;

                case 0:
                    ioService.writeToFile(docService.getDocumentMap());
                    System.out.println("Exiting... Goodbye!");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}