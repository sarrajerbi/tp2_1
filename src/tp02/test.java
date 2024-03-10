package tp02;

import java.util.*;

public class test {
public static void main(String args[]){
	Etudiant e1=new Etudiant("159220","sarra");
	Etudiant e2=new Etudiant("154220","abc");
	Note n1=new Note("java",19.5);
	Note n2=new Note("java",20);
	Note n3=new Note("java",18);
	Note n4=new Note("java",17);
	e1.addlist(n1);
	e1.affiche();
	e1.addlist(n2);
	e2.addlist(n3);
	e2.addlist(n4);
	e2.affiche();
	List <Etudiant>le=new Vector<>();
	le.add(e1);
	le.add(e2);
	Stats s =new Stats();
	System.out.println("avant trie");
	s.afficheStats(le);
	
	//Collections.sort(le);
	Matcomparator cm=new Matcomparator();
	Collections.sort(le,cm);
	System.out.println("apres trie");
	s.afficheStats(le);
	
	
}
}
