/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialnumber;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.util.ArrayList;

/**
 *
 * @author Chamsoft
 */
public class SerialNumber {

    /**
     * @param args the command line arguments
     */
	public     ArrayList<String> getSerial(){
		  ArrayList<String>ar=new ArrayList<>();

	       for(FileStore store: FileSystems.getDefault().getFileStores()){
	String k = null;
	try {
		k = String.format("%-20s vsn:%s\n", store, store.getAttribute("volume:vsn"));
		System.out.println(k);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(k.length());
	          ar.add(k.substring(25, k.length()-1));
	       }
	   
	       
	       return ar;
	}
	
 public static void main(String[] args) {
	new SerialNumber().getSerial();
}
    
}
