package sixteen.itogovie.factory_method;

import sixteen.itogovie.factory_method.common.ImageReader;
import sixteen.itogovie.factory_method.common.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
