package com.gmail.fitanns;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

	public static void main(String[] args) {
		MyFileFilter a = new MyFileFilter("doc", "txt");
		File folder = new File("C:\\AMD");
		File[] fileList = folder.listFiles(a);
		for (File files : fileList) {
			System.out.println(files);
		}

		Path destDir = Paths.get("C:\\AMD\\Support");
		if (fileList != null) {
			for (File file : fileList) {
				try {
					Files.copy(file.toPath(), destDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
