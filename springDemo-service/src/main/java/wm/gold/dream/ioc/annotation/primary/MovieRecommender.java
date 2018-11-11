package wm.gold.dream.ioc.annotation.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 14:36
 * @Version 1.0
 */
@Component
public class MovieRecommender {

    @Autowired
    private MovieCatalog movieCatalog1;


    private MovieCatalog movieCatalog2;

    @Autowired
    public void setMovieCatalog1(@Qualifier("wm") MovieCatalog movieCatalog) {
        this.movieCatalog2 = movieCatalog;
    }

    public MovieCatalog getMovieCatalog1() {
        return movieCatalog1;
    }

    public MovieCatalog getMovieCatalog2() {
        return movieCatalog2;
    }

    public void setMovieCatalog2(MovieCatalog movieCatalog2) {
        this.movieCatalog2 = movieCatalog2;
    }
}
