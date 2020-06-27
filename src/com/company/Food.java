package com.company;

import java.util.GregorianCalendar;

public class Food implements Storable{

String type;
double weight;
GregorianCalendar bestBy;

public Food( String Type, double kg, GregorianCalendar bestBefore  ){
  this.type=Type;
  this.weight=kg;
  this.bestBy=bestBefore;
}

public Food(){
  this.type="unknown";
  this.weight=0;
  this.bestBy=new GregorianCalendar();
}

@Override
public void add(Food item) {

}

@Override
public void rm() {

}

@Override
public boolean checkBestBy() {
  return false;
}
}
