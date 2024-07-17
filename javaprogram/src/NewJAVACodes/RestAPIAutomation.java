package javaprogram.src.NewJAVACodes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.rest.api.v2010.account.Recording;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.Header;
import io.restassured.response.Response;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RestAPIAutomation {
    static String acessToken = null;
    static ObjectMapper objectMapper = new ObjectMapper();
    public static  void  main(String[] args) throws JsonProcessingException {
        acessToken = getAuthorization();
        Response response = getExportGroup();
        GroupWrapper groupWrapper = objectMapper.readValue(response.asString(), GroupWrapper.class);
        List<Group> groups = groupWrapper.getGroups();
        for (Group group : groups) {
            // Call the getDetailsAsJson method for each agent and print the returned JSON string
            for (Group.Agent agent : group.getAgents()) {String agentJson = agent.getDetailsAsJson();
                System.out.println(agentJson);
            }
        }

    }

    public static String getAuthorization(){
        Response authResponse = RestAssured.given()
                .header(new Header("Content-Type", "application/x-www-form-urlencoded"))
                .urlEncodingEnabled(true)
                .filter(new RequestLoggingFilter())
                .filter(new ResponseLoggingFilter())
                .formParam("username", "mvendhanqa@mailinator.com")
                .formParam("password", "Testing1%")
                .formParam("grant_type", "client_credentials")
                .formParam("client_id", "test/client1I")
                .formParam("client_secret", "zM55Ry7SPDHJHmqQi2qVksfhglp44yM5wmI")
                .formParam("scope", "access_control")
                .post("https://security.io.qa.velocify.net/identity/connect/token")
                .then()
                .statusCode(200)
                .extract().response();
        System.out.println(authResponse.getBody().asString());
        return authResponse.jsonPath().getString("access_token");
    }

    public static Response getExportGroup() throws JsonProcessingException {
        Response exportGroup= RestAssured.given()
                .header(new Header("Content-Type", "application/json"))
                .header(new Header("Authorization", "Bearer "+acessToken))
                .filter(new RequestLoggingFilter())
                .filter(new ResponseLoggingFilter())
                .get("https://agents-api.io.qa.velocify.net/v1/clients/LmQamullaiLM/exportGroups")
                .then()
                .statusCode(200)
                .extract().response();
        return exportGroup;
    }
}
