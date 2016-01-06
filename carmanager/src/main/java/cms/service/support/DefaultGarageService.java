package cms.service.support;

import org.springframework.beans.factory.annotation.Autowired;

import cms.dao.GarageDao;
import cms.domain.Garage;
import cms.service.GarageService;

public class DefaultGarageService implements GarageService {
  @Autowired GarageDao garageDao;

  @Override
  public Garage display(int no) {
    return garageDao.selectOne(no);
  }
  
  
}
