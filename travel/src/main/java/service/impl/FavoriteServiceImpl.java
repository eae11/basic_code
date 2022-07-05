package service.impl;


import dao.FavoriteDao;
import dao.impl.FavoriteDaoImpl;
import domain.Favorite;
import service.FavoriteService;

public class FavoriteServiceImpl implements FavoriteService {

    private final FavoriteDao favoriteDao = new FavoriteDaoImpl();

    @Override
    public boolean isFavorite(String rid, int uid) {

        Favorite favorite = favoriteDao.findByRidAndUid(Integer.parseInt(rid), uid);

        return favorite != null;//如果对象有值，则为true，反之，则为false
    }

    @Override
    public void add(String rid, int uid) {
        favoriteDao.add(Integer.parseInt(rid),uid);
    }
}
