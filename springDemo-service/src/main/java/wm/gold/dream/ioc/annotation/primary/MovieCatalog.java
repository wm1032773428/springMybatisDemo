package wm.gold.dream.ioc.annotation.primary;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 14:34
 * @Version 1.0
 */
public class MovieCatalog {

    int i;

    public MovieCatalog(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "MovieCatalog{" +
                "i=" + i +
                '}';
    }
}
