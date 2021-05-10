package sixteen_Concurrency.itogovie.factory_method;

import sixteen_Concurrency.itogovie.factory_method.common.ImageReader;
import sixteen_Concurrency.itogovie.factory_method.common.ImageTypes;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
