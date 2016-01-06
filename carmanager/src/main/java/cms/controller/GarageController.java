package cms.controller;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cms.dao.GarageDao;
import cms.domain.Garage;

@Controller
@RequestMapping("/main/*")
public class GarageController {
  public static final Logger log = Logger.getLogger(GarageController.class);
  
  @Autowired GarageDao garageDao;
  @Autowired ServletContext servletContext;
  
  @RequestMapping("detail")
  public Object detail(int no) throws Exception {
    log.debug("message");
    Garage garage = garageDao.selectOne(no);
    log.debug(garage.getNickName());
    
    return "main";
  }
  
}
