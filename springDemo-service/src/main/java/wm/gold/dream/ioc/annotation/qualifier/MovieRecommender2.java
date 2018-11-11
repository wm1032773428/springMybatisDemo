package wm.gold.dream.ioc.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import wm.gold.dream.ioc.annotation.primary.MovieCatalog;

/**
 * @Author: wangmeng
 * @Date: 2018/10/30 15:14
 * @Version 1.0
 */
@Component("movieRecommender2")
public class MovieRecommender2 {

    @Autowired
    @MovieQualifier(format=Format.VHS, genre="Action")
    private MovieCatalog actionVhsCatalog;

    @Autowired
    @MovieQualifier(format=Format.VHS, genre="Comedy")
    private MovieCatalog comedyVhsCatalog;

    @Autowired
    @MovieQualifier(format=Format.DVD, genre="Action")
    private MovieCatalog actionDvdCatalog;

    @Autowired
    @MovieQualifier(format=Format.BLURAY, genre="Comedy")
    private MovieCatalog comedyBluRayCatalog;

    public MovieCatalog getActionVhsCatalog() {
        return actionVhsCatalog;
    }

    public void setActionVhsCatalog(MovieCatalog actionVhsCatalog) {
        this.actionVhsCatalog = actionVhsCatalog;
    }

    public MovieCatalog getComedyVhsCatalog() {
        return comedyVhsCatalog;
    }

    public void setComedyVhsCatalog(MovieCatalog comedyVhsCatalog) {
        this.comedyVhsCatalog = comedyVhsCatalog;
    }

    public MovieCatalog getActionDvdCatalog() {
        return actionDvdCatalog;
    }

    public void setActionDvdCatalog(MovieCatalog actionDvdCatalog) {
        this.actionDvdCatalog = actionDvdCatalog;
    }

    public MovieCatalog getComedyBluRayCatalog() {
        return comedyBluRayCatalog;
    }

    public void setComedyBluRayCatalog(MovieCatalog comedyBluRayCatalog) {
        this.comedyBluRayCatalog = comedyBluRayCatalog;
    }

    @Override
    public String toString() {
        return "MovieRecommender2{" +
                "actionVhsCatalog=" + actionVhsCatalog.getI() +
                ", comedyVhsCatalog=" + comedyVhsCatalog.getI() +
                ", actionDvdCatalog=" + actionDvdCatalog.getI() +
                ", comedyBluRayCatalog=" + comedyBluRayCatalog.getI() +
                '}';
    }
}
