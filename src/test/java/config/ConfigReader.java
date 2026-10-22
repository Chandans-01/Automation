package config;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ConfigReader {


    Properties prop = new Properties();

    public ConfigReader(){


        try(FileInputStream fs = 
            new FileInputStream(
                "src/test/resources/config/config.properties")){

                prop.load(fs);


        }catch(IOException e){

            throw new RuntimeException("Unable to load config file", e);

        }

    }


    public String getLoginPageUrl(){
         return prop.getProperty("loginPageUrl");

    }


    public String getHomePageUrl(){
        return prop.getProperty("homePageUrl");


    }


}
