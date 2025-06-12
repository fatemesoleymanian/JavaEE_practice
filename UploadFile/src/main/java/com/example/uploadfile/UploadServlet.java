package com.example.uploadfile;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.RequestContext;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Upload", value = "/Upload")
public class UploadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletFileUpload servletFileUpload  = new ServletFileUpload(new DiskFileItemFactory());
        List<FileItem> files = null;
        try {
            files = servletFileUpload.parseRequest(request);
        } catch (FileUploadException e) {
            throw new RuntimeException(e);
        }
        for (FileItem item : files) {
                try {
                    item.write(new File("D:\\java EE\\JavaEE_practice\\UploadFile" + item.getName()));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("done");


    }
}
