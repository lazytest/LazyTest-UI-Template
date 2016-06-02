package bean;


import lazy.test.ui.annotations.*;
import lazy.test.ui.beans.PageBean;
import lazy.test.ui.controls.*;
import lazy.test.ui.browser.BrowserEmulator;

public class BeanDemoBaidu extends PageBean {

    @Xpath(xpath={"//input[@id='kw']", "//input[@name='wd']", "//input[contains(@class,'s_ipt')]"})
    @Frame(frame="")
    @Description(description="输入框")
    public Text kw;

    @Xpath(xpath={"//input[@id='su']", "//input[contains(@value,'百度一下')]", "//input[contains(@class,'bg s_btn')]"})
    @Frame(frame="")
    @Description(description="百度一下")
    public Click su;

    public BeanDemoBaidu(BrowserEmulator be) { super(be); }

}