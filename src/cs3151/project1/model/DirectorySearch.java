/**
 * 
 */
package cs3151.project1.model;

import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;

/**
 * @author Corey Thornton
 *
 */
public class DirectorySearch {

	// private static ArrayList<String> list;
	// private static JFileChooser fchooser;
	// private static boolean nameOnlySelected;

	public void directorySearch(File dir, ArrayList<String> eList) {
		if (dir.isDirectory()) {
			for (File file : dir.listFiles()) {
				if (file.isFile()) {
					eList.add(file.getAbsolutePath());
				}
				else if  (file.isDirectory()) {
					eList.add(file.getAbsolutePath());
				}
				if (file.isDirectory()) {
					directorySearch(file, eList);
				}
			}
		}
	}

	public ArrayList<String> patternMatch(String pattern, ArrayList<String> eList) {
		ArrayList<String> patternList = new ArrayList<String>();
		for (String currD : eList) {
			if (currD.toLowerCase().contains(pattern)) {
				patternList.add(currD);
			}
		}
		return patternList;

	}

	
}
