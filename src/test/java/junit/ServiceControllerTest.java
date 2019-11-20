package junit;

import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class ServiceControllerTest {

    // 需启动服务后进行测试
    @Test
    public void loginTest() throws Exception{
        String serviceInfo = "{\"name\":\"Sun\"}";

        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.valueOf("application/json; charset=UTF-8"));
        headers.add("Accept", MediaType.APPLICATION_JSON_UTF8.toString());

        HttpEntity<String> strEntity = new HttpEntity<>(serviceInfo, headers);
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.postForObject("http://localhost:6001/service/hello", strEntity, String.class);
        System.out.println(result);
    }
}
