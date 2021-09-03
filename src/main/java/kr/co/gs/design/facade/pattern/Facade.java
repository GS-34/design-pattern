package kr.co.gs.design.facade.pattern;

public class Facade {

  private SubProcess1 subProcess1;
  private SubProcess2 subProcess2;

  public Facade (){
    subProcess1 = new SubProcess1();
    subProcess2 = new SubProcess2();
  }

  public void process(){
    subProcess1.subProcess1();
    subProcess2.subProcess2();
  }


}
