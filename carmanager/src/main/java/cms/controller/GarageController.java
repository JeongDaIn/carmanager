package cms.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cms.dao.GarageDao;
import cms.domain.AjaxResult;
import cms.domain.Garage;

@Controller
@RequestMapping("/garage/*")
public class GarageController {
  public static final Logger log = Logger.getLogger(GarageController.class);
  
  @Autowired GarageDao garageDao;
  
  
  @RequestMapping("detail")
  public Object detail(int no) throws Exception {
    log.debug("message");
    Garage garage = garageDao.selectOne(no);
    
    return new AjaxResult("success", garage);
  }
  
}
