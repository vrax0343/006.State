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
		System.out.println("1. �߸� ���, �ù�, �����縦 �����Ѵ�");
		System.out.println("=======================================================");
		
		Unit knight = new Knight();
		Unit mage = new Mage();
		Unit citizen = new Citizen();
		
		
		System.out.println("=======================================================");
		System.out.println("2. ��� ü���� 50, �ù� ü���� 1, ������ ü���� 18�� �Ǿ���");
		System.out.println("=======================================================");
		
		knight.setHealth(50);
		System.out.println("����� ü����: " + knight.getHealth());
		citizen.setHealth(1);
		System.out.println("�ù��� ü����: " + citizen.getHealth());
		mage.setHealth(18);
		System.out.println("������ ü����: " + mage.getHealth());
		
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("3. ��簡 �����ѵ� �ڱ�ġ�Ḧ �Ѵ�.");
		System.out.println("=======================================================");
		
		knight.fight();
		knight.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("4. �ù��� �ڱ�ġ�Ḧ �����ѵ�.");
		System.out.println("=======================================================");
		
		citizen.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("5. �����簡 +10, +10 �̵��� �ڱ�ġ�Ḧ �Ѵ�");
		System.out.println("=======================================================");
		
		mage.move(10, 10);
		System.out.println();
		mage.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("6. ���� ������ ������ 1�̵Ǿ���. ");
		System.out.println("=======================================================");
		
		knight.setMana(1);
		System.out.print("����� ���� ="+knight.getMana());
		
		mage.setMana(1);
		System.out.println("\t�������� ���� ="+mage.getMana());
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("7. ��簡 �����ѵ� �ڱ�ġ�Ḧ �Ѵ�.");
		System.out.println("=======================================================");
		
		knight.fight();
		knight.doSelfHeal();
		System.out.println();
	
		System.out.println("=======================================================");
		System.out.println("8. ��簡 �����ѵ� �ڱ�ġ�Ḧ �Ѵ�.");
		System.out.println("=======================================================");
		knight.fight();
		System.out.println();
		knight.doSelfHeal();
		System.out.println();
		
		
		System.out.println("=======================================================");
		System.out.println("9. ��簡 �����ѵ� �ڱ�ġ�Ḧ �Ѵ�.");
		System.out.println("=======================================================");
		knight.fight();
		System.out.println();
		knight.doSelfHeal();
		System.out.println();

		System.out.println("=======================================================");
		System.out.println("10. �����簡 �ڱ�ġ�Ḧ �Ѵ�.");
		System.out.println("=======================================================");
		
		mage.doSelfHeal();
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("11. �����簡 �����ѵ� �ڱ�ġ�Ḧ �Ѵ�.");
		System.out.println("=======================================================");
		mage.fight();
		System.out.println();
		mage.doSelfHeal();
		System.out.println();
		
		System.out.println("=======================================================");
		System.out.println("12. �����簡 �����ѵ� �ڱ�ġ�Ḧ �Ѵ�.");
		System.out.println("=======================================================");
		mage.fight();
		System.out.println();
		mage.doSelfHeal();
		System.out.println();
	
	}
}
