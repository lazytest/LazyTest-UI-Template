package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.BaseTestCase;
import page.PageDemoBaidu;

public class TestDemoBaidu extends BaseTestCase{

	private PageDemoBaidu pageDemoBaidu;

	@BeforeClass
	public void before(){
		pageDemoBaidu = new PageDemoBaidu(be);
		be.open("https://www.baidu.com/");
	}
	@Test
	public void searchTest(){
		pageDemoBaidu.search();
	}
}
