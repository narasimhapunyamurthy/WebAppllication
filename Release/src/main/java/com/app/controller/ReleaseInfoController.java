package com.app.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.xml.parsers.ParserConfigurationException;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.xml.sax.SAXException;

import com.sun.management.OperatingSystemMXBean;



@RestController
@Controller
@RequestMapping(value = "/getWarDetails")
public class ReleaseInfoController {

	@RequestMapping(value = "/Info",method = RequestMethod.GET)
	public HashMap<String,String> getReleaseInformation() throws IOException, ParserConfigurationException, SAXException{
		Runtime runTime=Runtime.getRuntime();
		long maxMemory = runTime.maxMemory();
		System.out.println(runTime.totalMemory());
		System.out.println(runTime.freeMemory());
		System.out.println(runTime.totalMemory()-runTime.freeMemory());
		
		OperatingSystemMXBean bean = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
		double processCpuLoad = bean.getProcessCpuLoad();
	    System.out.println("bean.getProcessCpuLoad() : "+bean.getProcessCpuLoad());
	    System.out.println(bean.getSystemCpuLoad());	
		
		ModelAndView model=new ModelAndView("warInfo");
		HashMap<String,String> mapWar = null;
		File directory = new File("C://");
		File[] filesInfo = directory.listFiles();
		String absolutePath = directory.getAbsolutePath();
		if (filesInfo.length > 0) {
			mapWar = new HashMap<String,String>();
			for (File file : filesInfo) {
				boolean war = file.getName().endsWith(".zip");
				if (war == true) {
					mapWar.put("WarName : ",file.getName());
					ZipFile zipFile = new ZipFile(absolutePath+""+file.getName());
		            Enumeration<? extends ZipEntry> entries = zipFile.entries();
		            while (entries.hasMoreElements()) {
		                ZipEntry entry = entries.nextElement();
		                String name = entry.getName();
		                if(name.endsWith("/pom.xml")) {
		                	File pom = new File(name);
		                	 BufferedReader br = new BufferedReader(
		                             new InputStreamReader(zipFile.getInputStream(entry)));
		                         String line;
		                         while ((line = br.readLine()) != null) {
		                           System.out.println("line :: "+line);
		                         }
		                	
		                	
		                }
					}

				}
			}
		}
		
		
		
		model.addObject("list", mapWar);
		mapWar.put("TotalMemory", String.valueOf(formatSize(runTime.totalMemory())));
		mapWar.put("UsageMemory", String.valueOf(formatSize(runTime.totalMemory()-runTime.freeMemory())));
		mapWar.put("CPUCurentUsage", String.valueOf(String.valueOf(bean.getProcessCpuLoad())));

		
		/*
		 * GitHubClient client=new GitHubClient(); RepositoryService service = new
		 * RepositoryService(client); List<Repository> repositories =
		 * service.getRepositories();
		 */
		
		return mapWar;
	}
	
	
	
	public static String formatSize(long v) {
	    if (v < 1024) return v + " B";
	    int z = (63 - Long.numberOfLeadingZeros(v)) / 10;
	    return String.format("%.1f %sB", (double)v / (1L << (z*10)), " KMGTPE".charAt(z));
	}
	
	
	public static String format(double bytes, int digits) {
        String[] dictionary = { "bytes", "KB", "MB", "GB", "TB", "PB", "EB", "ZB", "YB" };
        int index = 0;
        for (index = 0; index < dictionary.length; index++) {
            if (bytes < 1024) {
                break;
            }
            bytes = bytes / 1024;
        }
        return String.format("%." + digits + "f", bytes) + " " + dictionary[index];
    }

	
	
	
	public void pomVersion(String pomLocation) throws IOException {
		ZipFile zipFile = new ZipFile(pomLocation);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry entry = entries.nextElement();
            String name = entry.getName();
            if(name.endsWith("/pom.xml")) {
            	System.out.println("name : "+name);
            	File pom = new File(name);
            	
            }
		}
	}

}
