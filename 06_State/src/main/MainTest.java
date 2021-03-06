package main;

import factory.fm.*;
import observer.function.FindUnit;
import singleton.function.Print;
import singleton.unit.SingletonUnit;
import strategy.unit.Citizen;
import strategy.unit.Knight;
import strategy.unit.Mage;
import strategy.unit.Unit;


public class MainTest {
	
	public static void main(String[] args){		
		
		System.out.println("=======================================================");
		System.out.println("1. 중립 기사, 시민, 마법사를 생성한다");
		System.out.println("=======================================================");
		
		Unit knight = new Knight();
		System.out.println(knight.toString());
		Unit mage = new Mage();
		System.out.println(mage.toString());
		Unit citizen = new Citizen();
		System.out.println(citizen.toString());
		
		
		System.out.println("=======================================================");
		System.out.println("2. 기사 체력은 50, 시민 체력은 1, 마법사 체력은 18가 되었다");
		System.out.println("=======================================================");
		
		knight.setHealth(50);
		System.out.println("기사의 체력은: " + knight.getHealth());
		citizen.setHealth(1);
		System.out.println("시민의 체력은: " + citizen.getHealth());
		mage.setHealth(18);
		System.out.println("법사의 체력은: " + mage.getHealth());
		
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("3. 기사가 공격한뒤 자기치료를 한다.");
		System.out.println("=======================================================");
		
		knight.fight();
		knight.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("4. 시민이 자기치료를 수행한디.");
		System.out.println("=======================================================");
		
		citizen.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("5. 마법사가 +10, +10 이동뒤 자기치료를 한다");
		System.out.println("=======================================================");
		
		mage.move(10, 10);
		System.out.println();
		mage.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("6. 기사와 마법사 마력이 1이되었다. ");
		System.out.println("=======================================================");
		
		knight.setMana(1);
		System.out.print("기사의 마력 ="+knight.getMana());
		
		mage.setMana(1);
		System.out.println("\t마법사의 마력 ="+mage.getMana());
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("7. 기사가 공격한뒤 자기치료를 한다.");
		System.out.println("=======================================================");
		
		knight.fight();
		knight.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("8. 기사가 공격한뒤 자기치료를 한다.");
		System.out.println("=======================================================");
		knight.fight();
		System.out.println();
		knight.doSelfHeal();
		System.out.println();
		
		
		System.out.println("=======================================================");
		System.out.println("9. 기사가 공격한뒤 자기치료를 한다.");
		System.out.println("=======================================================");
		knight.fight();
		System.out.println();
		knight.doSelfHeal();
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("10. 마법사가 자기치료를 한다.");
		System.out.println("=======================================================");
		
		mage.doSelfHeal();
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("11. 마법사가 공격한뒤 자기치료를 한다.");
		System.out.println("=======================================================");
		mage.fight();
		System.out.println();
		mage.doSelfHeal();
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("12. 마법사가 공격한뒤 자기치료를 한다.");
		System.out.println("=======================================================");
		mage.fight();
		System.out.println();
		mage.doSelfHeal();
		System.out.println();
	
	}
}
