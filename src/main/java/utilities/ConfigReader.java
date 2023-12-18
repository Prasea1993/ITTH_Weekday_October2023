package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {



    private Properties properties;


    public Properties loadProperties() throws IOException {


        FileInputStream inputFile=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/configData/Config.properties");
        // Where the file is available
        // load the data inside that file into properties

        properties=new Properties();
        properties.load(inputFile);

        return properties;

    }


    public int sumOf2Nums(int a, int b){

        return a+b;
    }

    public static void main(String[] args) throws IOException {

        ConfigReader reader=new ConfigReader();
        Properties p1=  reader.loadProperties();


        System.out.println(p1.get("browser"));

    }



}
