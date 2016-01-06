package cms.dao;

import java.util.List;

import cms.domain.Garage;

public interface GarageDao {
  public Garage selectOne(int no);
  
  public List<Garage> selectList(int no);
}
