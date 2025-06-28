package com.example.fileuploaddemo;

import java.io.*;
import java.util.List;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import org.apache.commons.fileupload2.core.DiskFileItemFactory;
import org.apache.commons.fileupload2.core.FileItem;
import org.apache.commons.fileupload2.core.FileUploadException;
import org.apache.commons.fileupload2.jakarta.servlet5.JakartaServletFileUpload;

@WebServlet(name = "upload", value = "/upload")
public class HelloServlet extends HttpServlet {

     final String filePath = "A:/workSpace/JAVA EE/";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        // Create factory using the builder pattern
        DiskFileItemFactory factory = DiskFileItemFactory.builder().get();
        JakartaServletFileUpload upload = new JakartaServletFileUpload(factory);

        List<FileItem> files;
        try {
            files = upload.parseRequest(request);
        } catch (FileUploadException e) {
            throw new RuntimeException("File upload failed", e);
        }

        for (FileItem item : files) {
            if (!item.isFormField()) {
                try {
                    File uploadedFile = new File(this.filePath + item.getName());
                    item.write(uploadedFile.toPath());
                    System.out.println("done");

                } catch (Exception e) {
                    throw new RuntimeException("Failed to save file", e);
                }
            }
        }
    }
}
