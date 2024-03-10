package tp02;

import java.util.*;

public class Matcomparator implements Comparator<Etudiant> {

@Override
public int compare(Etudiant E1, Etudiant E2) {
	return (E1.getMat().compareTo(E2.getMat()));
}}

