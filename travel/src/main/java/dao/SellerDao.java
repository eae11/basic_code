package dao;


import domain.Seller;

public interface SellerDao {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    Seller findById(int id);
}
