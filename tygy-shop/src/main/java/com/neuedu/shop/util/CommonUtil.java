package com.neuedu.shop.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CommonUtil {
	public static void fileCopyToLocal(String srcPath,String descPath) {
    	//JDK7 Files
    	try {
    		File src = new File(srcPath);
        	File dest = new File(descPath);
			Files.copy(src.toPath(), dest.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
