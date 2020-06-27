package com.company;

import java.util.Date;

public interface Storable {
  public void add(Food item);
  public void rm();
  public boolean checkBestBy();
}
