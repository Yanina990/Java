package com.company;


import java.util.Scanner;

/* Создать объект класса Дерево, используя классы Лист, Ветка.
Методы: зацвести, опасть листьям, покрыться инеем, пожелтеть листьям. */
public class Main {

	public static void main(String[] args) throws Error{
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	System.out.println("Введите 4 дерева: ");
		String tr1=scan.nextLine();
		String tr2=scan.nextLine();
		String tr3=scan.nextLine();
		String tr4=scan.nextLine();

		Tree tree1 = new Tree(tr1);
        Tree tree2 = new Tree(tr2);
        Tree tree3 = new Tree(tr3);
        Tree tree4 = new Tree(tr4);

        tree1.becomeYellow();
        tree2.coveredWithIny();
        tree3.throwTheLeaves();
        tree4.bloom();

	System.out.println("Равны ли "+ tree1+" и "+tree2 + ": "+tree1.equals(tree2));
	System.out.println(tree1);
	System.out.println(tree2);

	}
}