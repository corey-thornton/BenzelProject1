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

	private static ArrayList<String> list;
	private static JFileChooser fchooser;
	private static boolean nameOnlySelected;

	public  void directorySearch(File dir, ArrayList<String> eList) {
		if (dir.isDirectory()) {
			for (File file : dir.listFiles()) {
				eList.add(file.getAbsolutePath());
				if (file.isDirectory()) {
					directorySearch(file, eList);
				}
			}
		}
	}
	
	public ArrayList<String> patternMatch(String pattern, ArrayList<String> eList) {
		ArrayList<String> patternList = new ArrayList<String>();
		for(String currD : eList) {
			if(currD.toLowerCase().contains(pattern) ) {
				patternList.add(currD);
			}
		}
		return patternList;
		
		
	}

	public  boolean isNameOnlySelected() {
		return nameOnlySelected;
	}

//	public  void main(String[] args) {
//
//		System.out.println(isFullPathSelected());
//
//		list = new ArrayList<String>();
//		fchooser = new JFileChooser();
//		fchooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//		fchooser.setAcceptAllFileFilterUsed(false);
//		int value = fchooser.showOpenDialog(null);
//		if (value != JFileChooser.APPROVE_OPTION) {
//			return;
//		}
//		directorySearch(fchooser.getSelectedFile(), list);
//		for (String name : list) {
//			System.out.println(name);
//		}
//
//	}

}
