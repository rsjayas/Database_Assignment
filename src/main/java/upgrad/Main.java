package upgrad;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        // Connection Default Value Initialization
        Connection connection = null;
        MongoClient mongoClient = null;

        // MySql credentials
        String url = "jdbc:mysql://pgc-sd-bigdata.cyaielc9bmnf.us-east-1.rds.amazonaws.com:3306/pgcdata";
        String user = "student";
        String password = "STUDENT123";


        try {
            // Creating Mysql database connections

            connection = DriverManager.getConnection(url, user, password);

            if(connection != null){
                System.out.println("<---!Connected to MySQL Database--->");
                System.out.println();
            }

            // Mongo credentials

            mongoClient = MongoClients.create("mongodb://ec2-75-101-254-71.compute-1.amazonaws.com");
            System.out.println(mongoClient);

            // Creating MongoDB database connections

            MongoDatabase db = mongoClient.getDatabase("pgcdata");
            MongoCollection<Document> productCollection = db.getCollection("test2");

            System.out.println("Collection : " + productCollection);
            if(mongoClient != null){
                System.out.println("<---!Connected to Mongo Database--->");
                System.out.println();
            }


            // Import data into MongoDb

            System.out.println("---!Importing Mobiles Data From MySql to Mongo Database----->");
            System.out.println();

            Statement statement = connection.createStatement();
            String sql = "select * from mobiles";
            ResultSet resultset =  statement.executeQuery(sql);

            while(resultset.next()){
                Mobiles mobile = new Mobiles();

                //getting mobile data from MySql Database and saving it to Mobiles class objects
                mobile.setCategory("Mobiles");
                mobile.setProductId(resultset.getString("ProductId"));
                mobile.setTitle(resultset.getString("Title"));
                mobile.setManufacturer(resultset.getString("Manufacturer"));
                mobile.setBattery(resultset.getString("Battery"));

                mobile.setDimensions(resultset.getString("Dimensions"));
                mobile.setWeight(resultset.getString("Weight"));

                mobile.setNetworkTechnology(resultset.getString("NetworkTechnology"));
                mobile.setDisplay(resultset.getString("Display"));
                mobile.setBluetooth(resultset.getString("Bluetooth"));
                mobile.setSensors(resultset.getString("Sensors"));
                mobile.setOS(resultset.getString("OS"));
                mobile.setChipset(resultset.getString("Chipset"));
                mobile.setCPU(resultset.getString("CPU"));
                mobile.setGPU(resultset.getString("GPU"));
                mobile.setMemory(resultset.getString("Memory"));
                mobile.setCamera(resultset.getString("Camera"));


                //Setting Data from Mobile Class to Mongodb
                Document doc = new Document("ProductId", mobile.getProductId())
                        .append("Category", mobile.getCategory())
                        .append("Title", mobile.getTitle())
                        .append("Manufacturer", mobile.getManufacturer())
                        .append("Battery", mobile.getBattery())
                        .append("Dimensions", mobile.getDimensions())
                        .append("Weight", mobile.getWeight())
                        .append("NetworkTechnology", mobile.getNetworkTechnology())
                        .append("Display", mobile.getDisplay())
                        .append("Bluetooth", mobile.getBluetooth())
                        .append("Sensors", mobile.getSensors())
                        .append("OS", mobile.getOS())
                        .append("Chipset", mobile.getChipset())
                        .append("CPU", mobile.getCPU())
                        .append("GPU", mobile.getGPU())
                        .append("Memory", mobile.getMemory())
                        .append("Camera", mobile.getCamera());
                productCollection.insertOne(doc);

            }


            System.out.println("---!Importing HeadPhones Data From MySql to Mongo Database----->");
            System.out.println();
            sql = "select * from headphones";
            resultset =  statement.executeQuery(sql);
            while(resultset.next()){
                HeadPhones hp = new HeadPhones();

                //getting headphones data from MySql Database and saving it to headphone class objects
                hp.setCategory("HeadPhones");
                hp.setProductId(resultset.getString("ProductId"));
                hp.setTitle(resultset.getString("Title"));
                hp.setManufacturer(resultset.getString("Manufacturer"));
                hp.setBattery(resultset.getString("Battery"));

                hp.setItemWeight(resultset.getString("ItemWeight"));

                hp.setHeadPhoneType(resultset.getString("HeadPhoneType"));
                hp.setWarranty(resultset.getString("Warranty"));
                hp.setConnectorType(resultset.getString("ConnectorType"));
                hp.setWithMicrophone(resultset.getString("WithMicrophone"));
                hp.setColor(resultset.getString("Color"));
                hp.setAdditionalFeatures(resultset.getString("AdditionalFeatures"));



                //Setting Data from Headphones Class to Mongodb
                Document doc = new Document("ProductId", hp.getProductId())
                        .append("Category", hp.getCategory())
                        .append("Title", hp.getTitle())
                        .append("Manufacturer", hp.getManufacturer())
                        .append("Battery", hp.getBattery())
                        .append("ItemWeight", hp.getItemWeight())
                        .append("HeadPhoneType", hp.getHeadPhoneType())
                        .append("Warranty", hp.getWarranty())
                        .append("ConnectorType", hp.getConnectorType())
                        .append("WithMicrophone", hp.getWithMicrophone())
                        .append("Color", hp.getColor())
                        .append("AdditionalFeatures", hp.getAdditionalFeatures());
                productCollection.insertOne(doc);

            }


            System.out.println("---!Importing camera Data From MySql to Mongo Database----->");
            System.out.println();
            sql = "select * from cameras";
            resultset =  statement.executeQuery(sql);
            while(resultset.next()){
                //System.out.print(resultset);
                Cameras cameras = new Cameras();

                //getting Camera data from MySql Database and saving it to Cameras class objects
                cameras.setCategory("Cameras");
                cameras.setProductId(resultset.getString("ProductId"));
                cameras.setTitle(resultset.getString("Title"));
                cameras.setManufacturer(resultset.getString("Manufacturer"));
                cameras.setBattery(resultset.getString("Battery"));

                cameras.setDimension(resultset.getString("Dimension"));
                cameras.setWeight(resultset.getString("Weight"));

                cameras.setEffectivePixels(resultset.getString("EffectivePixels"));
                cameras.setZoom(resultset.getString("Zoom"));
                cameras.setVideoResolution(resultset.getString("VideoResolution"));
                cameras.setShutterSpeed(resultset.getString("ShutterSpeed"));


                //Setting Data from Cameras Class to Mongodb
                Document doc = new Document("ProductId", cameras.getProductId())
                        .append("Category", cameras.getCategory())
                        .append("Title", cameras.getTitle())
                        .append("Manufacturer", cameras.getManufacturer())
                        .append("Battery", cameras.getBattery())
                        .append("Dimension", cameras.getDimension())
                        .append("Weight", cameras.getWeight())
                        .append("EffectivePixels", cameras.getEffectivePixels())
                        .append("Zoom", cameras.getZoom())
                        .append("VideoResolution", cameras.getVideoResolution())
                        .append("ShutterSpeed", cameras.getShutterSpeed());
                productCollection.insertOne(doc);

            }



            // List all products in the inventory
            CRUDHelper.displayAllProducts(productCollection);

            // Display top 5 Mobiles
            CRUDHelper.displayTop5Mobiles(productCollection);

            // Display products ordered by their categories in Descending Order Without autogenerated Id
            CRUDHelper.displayCategoryOrderedProductsDescending(productCollection);

            // Display product count in each category
            CRUDHelper.displayProductCountByCategory(productCollection);

            // Display wired headphones
            CRUDHelper.displayWiredHeadphones(productCollection);

            // To drop the collection
            productCollection.drop();
        }
        catch(Exception ex) {
            System.out.println("Got Exception.");
            ex.printStackTrace();
        }
        finally {
            // Close Connections
            mongoClient.close();
            System.out.println();
            System.out.println("<-----!Connection Closed----->");
        }
    }
}