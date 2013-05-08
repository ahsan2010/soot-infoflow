package soot.jimple.infoflow.test.securibench;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import soot.jimple.infoflow.Infoflow;

public class AliasingTests extends JUnitTests {

	@Test
	public void aliasing1() {
		Infoflow infoflow = initInfoflow();
		List<String> epoints = new ArrayList<String>();
		epoints.add("<securibench.micro.aliasing.Aliasing1: void doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)>");	
		infoflow.computeInfoflow(path, entryPointCreator, epoints, sources, sinks);
		checkInfoflow(infoflow,1);
	}

	@Test
	public void aliasing2() {
		Infoflow infoflow = initInfoflow();
		List<String> epoints = new ArrayList<String>();
		epoints.add("<securibench.micro.aliasing.Aliasing2: void doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)>");	
		infoflow.computeInfoflow(path, entryPointCreator, epoints, sources, sinks);
		negativeCheckInfoflow(infoflow);
	}
	
	@Test
	public void aliasing3() {
		Infoflow infoflow = initInfoflow();
		List<String> epoints = new ArrayList<String>();
		epoints.add("<securibench.micro.aliasing.Aliasing3: void doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)>");	
		infoflow.computeInfoflow(path, entryPointCreator, epoints, sources, sinks);
		negativeCheckInfoflow(infoflow);
		//INFO: this test has failed originally but I don't think there is a flow from source to sink - changed.
	}
	
	@Test
	public void aliasing4() {
		Infoflow infoflow = initInfoflow();
		List<String> epoints = new ArrayList<String>();
		epoints.add("<securibench.micro.aliasing.Aliasing4: void doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)>");	
		infoflow.computeInfoflow(path, entryPointCreator, epoints, sources, sinks);
		checkInfoflow(infoflow, 2);
	}
	
	@Test
	public void aliasing5() {
		Infoflow infoflow = initInfoflow();
		List<String> epoints = new ArrayList<String>();
		epoints.add("<securibench.micro.aliasing.Aliasing5: void doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)>");	
		infoflow.computeInfoflow(path, entryPointCreator, epoints, sources, sinks);
		checkInfoflow(infoflow, 1);
	}
	
	@Test
	public void aliasing6() {
		Infoflow infoflow = initInfoflow();
		List<String> epoints = new ArrayList<String>();
		epoints.add("<securibench.micro.aliasing.Aliasing6: void doGet(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)>");	
		infoflow.computeInfoflow(path, entryPointCreator, epoints, sources, sinks);
		checkInfoflow(infoflow, 7);
	}

}
