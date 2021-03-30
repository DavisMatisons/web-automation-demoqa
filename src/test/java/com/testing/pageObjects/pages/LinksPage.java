package com.testing.pageObjects.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
@DefaultUrl("/links")
public class LinksPage extends ElementsPage{
    public static By LINKS_TITLE = text("Links");
    public static By HOME_LINK = css("a[id='simpleLink']");
    public static By DYNAMIC_HOME_LINK = css("a[id='dynamicLink']");
    public static By CREATED_LINK = css("a[id='created']");
    public static By NO_CONTENT_LINK = css("a[id='no-content']");
    public static By MOVED_LINK = css("a[id='moved']");
    public static By BAD_REQUEST_LINK = css("a[id='bad-request']");
    public static By UNAUTHORIZED_LINK = css("a[id='unauthorized']");
    public static By FORBIDDEN_LINK = css("a[id='forbidden']");
    public static By NOT_FOUND_LINK = css("a[id='invalid-url']");
    public static By LINK_RESPONSE = css("p[id='linkResponse']");
    // Public methods ----------------------------------------------------------------------------------------------------
    public void waitForPageToLoad() {
        getElement(LINKS_TITLE).waitUntilPresent();
        logWeAreOnPage();
    }

}
