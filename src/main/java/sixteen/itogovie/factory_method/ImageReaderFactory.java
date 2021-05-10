package sixteen.itogovie.factory_method;


import sixteen.itogovie.factory_method.common.*;

public class ImageReaderFactory {
    private ImageReaderFactory(){

    }


    public static ImageReader getImageReader(ImageTypes type) {
        ImageReader reader;
        if(type == ImageTypes.BMP)
        {
        reader = new BmpReader();
        }
        else if(type == ImageTypes.JPG)
        {
            reader = new JpgReader();
        }
        else if(type == ImageTypes.PNG)
        {
            reader = new PngReader();
        }
        else{
            throw new IllegalArgumentException("Error");
        }
        return reader;
    }
}

