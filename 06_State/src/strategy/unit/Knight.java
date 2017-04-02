package strategy.unit;

import strategy.behavior.attack.SwingSword;
import strategy.behavior.movement.Walk;
import strategy.behavior.weapon.Sword;

public class Knight extends Unit {
	public Knight() {
		// TODO Auto-generated constructor stub
		super("Knight");
		this.health = 30;
		this.weapon = new Sword();
		this.movement = new Walk();
		this.attack = new SwingSword();
		this.maxHealth = this.health*2;
		this.mana = this.maxHealth;
		this.maxMana = this.maxHealth;
}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.print("��簡\t ");
		weapon.useWeapon();
		attack.attack();
		System.out.println();
		this.stackCountArr[0]+=1;
		stackCounterCheck();
	}
}