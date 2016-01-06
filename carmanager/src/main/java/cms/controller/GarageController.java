package cms.controller;

import org.springframework.beans.factory.annotation.Autowired;

import cms.dao.GarageDao;

public class GarageController {
  
  @Autowired GarageDao garageDao;
  
  
  public Object detail(int no) throws Exception {
    
    
    
    return new AjaxResult("sucess", garage);
  }
  
}
