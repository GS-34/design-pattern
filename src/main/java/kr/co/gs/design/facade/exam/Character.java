package kr.co.gs.design.facade.exam;

public class Character {

  private ManaCheckProcess manaCheckProcess;

  private SkillOptionProcess skillOptionProcess;

  private UsingSkillProcess usingSkillProcess;

  public Character(){
    manaCheckProcess = new ManaCheckProcess();
    skillOptionProcess = new SkillOptionProcess();
    usingSkillProcess = new UsingSkillProcess();
  }

  public void skill(){

    //마나 체크
    manaCheckProcess.manaCheck();

    //스킬 강화
    skillOptionProcess.strengthenSkills();

    //스킬 사용
    usingSkillProcess.usingSkill();

  }

}
