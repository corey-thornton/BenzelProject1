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
	private static boolean fullPathSelected;

	public static void directorySearch(File dir, ArrayList<String> eList) {
		if (dir.isDirectory()) {
			for (File file : dir.listFiles()) {
				eList.add(file.getAbsolutePath());
				if (file.isDirectory()) {
					directorySearch(file, eList);
				}
			}
		}
	}

	public static boolean isFullPathSelected() {
		return fullPathSelected;
	}

	public static void main(String[] args) {

		System.out.println(isFullPathSelected());

		list = new ArrayList<String>();
		fchooser = new JFileChooser();
		fchooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fchooser.setAcceptAllFileFilterUsed(false);
		int value = fchooser.showOpenDialog(null);
		if (value != JFileChooser.APPROVE_OPTION) {
			return;
		}
		directorySearch(fchooser.getSelectedFile(), list);
		for (String name : list) {
			System.out.println(name);
		}

	}

}
