package com.gmail.fitanns;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {

	private String[] arr;

	public MyFileFilter(String... arr) {
		super();
		this.arr = arr;
	}

	private boolean check(String ext) {
		for (String stringExt : arr) {
			if (stringExt.equals(ext)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean accept(File folder) {
		int pointerIndex = folder.getName().lastIndexOf(".");
		if (pointerIndex == -1) {
			return false;
		}
		String ext = folder.getName().substring(pointerIndex + 1);
		return check(ext);
	}

}
