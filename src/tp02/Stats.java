package tp02;
import java.util.*;
public class Stats {
	public void afficheStats(List<Etudiant>l)
	{
		Iterator<Etudiant>it=l.iterator();
		while(it.hasNext())
		{
			Etudiant e=it.next();
			System.out.println(e.getValue());
			System.out.println(e.getmax());
			System.out.println(e.getmin());
		}
	}
}
