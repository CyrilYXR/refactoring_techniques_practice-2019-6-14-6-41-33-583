package com.tws.refactoring.extract_variable;

import org.junit.Test;
import static org.junit.Assert.*;


public class BannerRenderTest {

    @Test
    public void should_return_ie_on_mac_when_platform_is_mac_and_browser_is_ie(){
        //GIVEN
        BannerRender bannerRender = new BannerRender();
        //WHEN
        String result = bannerRender.renderBanner("MAC", "IE");
        //THEN
        assertEquals(result, "IE on Mac?");
    }
}
