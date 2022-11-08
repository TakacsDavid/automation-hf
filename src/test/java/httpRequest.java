package test.java;

import com.aventstack.extentreports.Status;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import java.util.List;

import static test.java.BaseTest.logger;

public class httpRequest extends BaseTest{
    @Test
    void httpReqTest (){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RequestSpecification req = RestAssured.given();
        Response res = req.get("/users");
        ResponseBody response = res.getBody();
        List<String> jsonResponseId = response.jsonPath().getList("id");
        List<String> jsonResponseName = response.jsonPath().getList("name");
        List<String> jsonResponseEmail = response.jsonPath().getList("email");
        for(int i=0;i<jsonResponseId.stream().count();i++){
            System.out.println(jsonResponseName.get(i)+" | "+jsonResponseEmail.get(i));
        }
        if (jsonResponseEmail.get(0).contains("@")){
            logger.log(Status.PASS, "First Email contains '@'!");
        }
        else
            logger.log(Status.FAIL, "First Email does NOT contains '@'!");
//        System.out.println(response.asString());
//        System.out.println(jsonResponseName.get(0)+" | "+jsonResponseEmail.get(0));
    }

}
