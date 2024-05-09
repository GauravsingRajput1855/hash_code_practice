package NewJava;

import java.util.HashSet;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Tester {
	public static void main(String []args)
	{
		System.out.println("Welcome to the website");
		try (Scanner sc=new Scanner(System.in))
		{
			System.out.println("enter your choice ");
			boolean falg=false;
			HashSet<Declaration> stringSet=new HashSet<>();
			while(!falg)
			{
				try
				{

					switch(sc.nextInt())
					{
					case 1:
						System.out.println("enter phone no ,name, email ,date of birth ");
						Declaration stringSet1=Validations.Validationsinputs(sc.nextInt(),sc.next(),sc.next(),sc.next());
						
						stringSet.add(stringSet1);
						System.out.println(" details added" );
//						java.util.Iterator<Declaration> itr=stringSet.iterator();
//						while(itr.hasNext()) {
//							if(itr.next() != null) {
//								System.out.println(stringSet);
//							}
//						}
						break;
					case 2:
					System.out.println("Details are ....");
					for(Declaration declasration: stringSet)
						System.out.println(declasration);
						
						
//						java.util.Iterator<Declaration> itr=stringSet.iterator();
//						while(itr.hasNext()) {
//							if(itr.next() != null) {
//								System.out.println(stringSet);
//							}
//						}


						break;
					case 3:
						break;
					}
					
				
					
				}catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
				
			}
			
			
		}
	}
	}
}
