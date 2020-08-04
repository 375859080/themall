package com.huang.mall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallThirdPartyApplicationTests {

    @Test
    public void  contextLoads() {
    }
    @Resource
    OSSClient ossClient;

    @Test
    public void test() throws FileNotFoundException {
        // // Endpoint以杭州为例，其它Region请按实际情况填写。
        // String endpoint = "http://oss-cn-hangzhou.aliyuncs.com";
        // // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
        // String accessKeyId = "LTAI4G8exigejNMVsvn8h6D9";
        // String accessKeySecret = "slNUsJRr0VfJb4Y8jNcW31j7CDYvjS";
        //
        // // 创建OSSClient实例。
        // OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        //
        // 上传文件流。
        InputStream inputStream = new FileInputStream("C:\\Users\\Mr Huang\\Pictures\\bh3rd\\2019-09-16-20-02-17_0.png");
        ossClient.putObject("375859080", "ccc.png", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();
    }
}
