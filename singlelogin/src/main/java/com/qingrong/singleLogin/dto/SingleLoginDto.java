package com.qingrong.singleLogin.dto;

/**
 * 单点登陆校验信息
 * @Author: ZhangQingrong
 * @Date : 2017/10/9 9:18
 */
public class SingleLoginDto {

    private String salt;

    private String content;

    public SingleLoginDto() {
    }

    public SingleLoginDto(String salt, String content) {
        this.salt = salt;
        this.content = content;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
