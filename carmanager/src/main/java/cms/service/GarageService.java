package cms.service;

import java.util.List;

import cms.domain.Garage;

public interface GarageService {
  Garage display(int no);
  
  List<Garage> alldisplay(int no);
}
