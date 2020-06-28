package com.company;

import java.util.ArrayList;

class Cooler {
Board freezer;
Board topShelve;
Board middleShelve;
Board vegieBasket;


public Cooler() {
  freezer = new Board();
  topShelve = new Board();
  middleShelve = new Board();
  vegieBasket = new Board();
}

private class Board {
  Board() {
    ArrayList<Storable> content = new ArrayList<>();

  }

}

}
