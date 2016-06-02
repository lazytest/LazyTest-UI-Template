package page;

import bean.BeanDemoBaidu;
import lazy.test.ui.browser.BrowseEmulator;

public class PageDemoBaidu {
private BeanDemoBaidu beanDemoBaidu;
	
	public PageDemoBaidu(BrowseEmulator be){
		beanDemoBaidu = new BeanDemoBaidu(be);
	}
	public void  search(){
		beanDemoBaidu.kw.input("kaka1121 lazytest");
		beanDemoBaidu.su.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
