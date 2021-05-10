package arraylisting;

import java.util.ArrayList;

public class mama_mila_ramu {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");


        for(int i=1;i<strings.size()+1;i++)
        {
            strings.add(i++,"именно");
        }
        for(int i=0;i<strings.size();i++)
        {
            System.out.println(strings.get(i));
        }
    }}
