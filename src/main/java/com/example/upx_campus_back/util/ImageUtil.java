package com.example.upx_campus_back.util;

import org.hibernate.id.GUIDGenerator;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class ImageUtil{
    // Chemin du dossier projet
    private static final String PATH_IMAGE_FOLDER =   System.getProperty("user.dir")
                                                    + "\\src\\main\\resources\\images\\";
    private static final String FORMAT_JPG = "jpg";

    public static byte[] getByteFromImage(String imageName){
        if (imageName == null || imageName.isEmpty()) return null;

        String pathImage = PATH_IMAGE_FOLDER + imageName;

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        BufferedImage bImage = null;
        File file = new File(pathImage);
        try {
            bImage = ImageIO.read(file);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        switch(getFileExtension(file).toLowerCase()){
            case FORMAT_JPG:
                try {
                    ImageIO.write(bImage, FORMAT_JPG, bos);
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default:
                break;

        }

        return bos.toByteArray();
    }

    public static String convertByteArrayToImage(byte[] data) {
        String imageName = null;
        String pathImage = PATH_IMAGE_FOLDER;
        ByteArrayInputStream bis = new ByteArrayInputStream(data);
        try {
            BufferedImage bImage = ImageIO.read(bis);
            imageName = UUID.randomUUID().toString() + ".jpg";
            pathImage = pathImage + imageName;
            ImageIO.write(bImage, "jpg", new File(pathImage));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return imageName;
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
}


