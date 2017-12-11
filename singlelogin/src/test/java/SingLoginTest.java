import com.qingrong.singleLogin.dto.SingleLoginDto;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author: ZhangQingrong
 * @Date : 2017/10/9 9:21
 */
public class SingLoginTest {

    Map<String,String> userInfo = new HashMap<String, String>();

    @Test
    public void test1(){
        String preKey = "LOGIN_TOKEN_";
        String userId = "cs6688999";
        String userInfoKey = preKey + userId;

        String content = "6688";
        String salt = UUID.randomUUID().toString().replace("-","");
        SingleLoginDto singleLoginDto = new SingleLoginDto();
        singleLoginDto.setSalt(salt);
        singleLoginDto.setContent(content);

        System.out.println("salt : " + salt);
    }
}
