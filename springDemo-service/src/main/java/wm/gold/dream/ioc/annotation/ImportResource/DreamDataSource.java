package wm.gold.dream.ioc.annotation.ImportResource;

/**
 * @Author: wangmeng
 * @Date: 2018/10/31 10:23
 * @Version 1.0
 */
public class DreamDataSource {

    private String url;

    private String username;

    private String password;

    public DreamDataSource(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "DreamDataSource{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
