package by.htp.hometask.view;

import by.htp.hometask.bean.*;

public class FileView {

	public void printContent(File file) {

		System.out.println(
				file.getFileName() + " file size = " + file.getFileSize() + " file content: " + file.getFileContent());

	}

}
