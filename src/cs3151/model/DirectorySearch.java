/**
 * 
 */
package cs3151.model;

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
	
	private static void directorySearch(File dir) {
		if(dir.isDirectory()) {
			for(File file : dir.listFiles()) {
				list.add(file.getAbsolutePath());
				if(file.isDirectory()) {
					directorySearch(file);
				}
			}
		}
	}
	
public static void main(String[] args) {
		
		list = new ArrayList<String>();
		fchooser = new JFileChooser();
		fchooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fchooser.setAcceptAllFileFilterUsed(false);
		int value = fchooser.showOpenDialog(null);
		if(value != JFileChooser.APPROVE_OPTION) {
			return;
		}
		directorySearch(fchooser.getSelectedFile());
		for(String name : list) {
			System.out.println(name);
		}

	}

}