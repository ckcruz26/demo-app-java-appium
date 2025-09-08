package utils;

public class DemoAppXpathUtils {

    // =========================
    // ApiCall Locators
    // =========================
    public static final String API_CALL_HEADER_TXT = PropertiesReader.get("ApiCall.ApiCallHeaderTxt");
    public static final String EU_DC_MENU = PropertiesReader.get("ApiCall.EuDcMenu");
    public static final String US_DC_MENU = PropertiesReader.get("ApiCall.UsDcMenu");
    public static final String MENU_401 = PropertiesReader.get("ApiCall.Menu401");
    public static final String MENU_404 = PropertiesReader.get("ApiCall.Menu404");

    // =========================
    // About Page Locators
    // =========================
    public static final String ABOUT_HEADER = PropertiesReader.get("AboutPageXpaths.aboutHeader");
    public static final String SAUCE_WEBSITE_LINK = PropertiesReader.get("AboutPageXpaths.sauceWebsiteLink");
    public static final String IMAGE_ONE = PropertiesReader.get("AboutPageXpaths.imageOne");
    public static final String IMAGE_TWO = PropertiesReader.get("AboutPageXpaths.imageTwo");
    public static final String IMAGE_THREE = PropertiesReader.get("AboutPageXpaths.imageThree");

    // =========================
    // Base Page Locators
    // =========================
    public static final String GLOBAL_HAMBURGER = PropertiesReader.get("BasePageXpaths.globalHamburger");
    public static final String LOGIN_MENU = PropertiesReader.get("BasePageXpaths.loginMenu");
    public static final String ABOUT_MENU = PropertiesReader.get("BasePageXpaths.aboutMenu");
    public static final String API_CALL_MENU = PropertiesReader.get("BasePageXpaths.apiCallMenu");
    public static final String LOGOUT_MENU = PropertiesReader.get("BasePageXpaths.logoutMenu");
    public static final String SAUCE_VIDEO_MENU = PropertiesReader.get("BasePageXpaths.sauceVideoMenu");
    public static final String GEO_LOCATION_MENU = PropertiesReader.get("BasePageXpaths.geoLocationMenu");
    public static final String DRAWING_MENU = PropertiesReader.get("BasePageXpaths.drawingMenu");

    // =========================
    // Product Page Locators
    // =========================
    public static final String ADD_TO_CART_BUTTON = PropertiesReader.get("ProductPageXpaths.product.addToCartButton");
    public static final String FIRST_PRODUCT = PropertiesReader.get("ProductPageXpaths.product.firstProduct");
    public static final String QUANTITY_ADD = PropertiesReader.get("ProductPageXpaths.product.quantityAdd");
    public static final String QUANTITY_MINUS = PropertiesReader.get("ProductPageXpaths.product.quantityMinus");

    public static final String CART_BADGE = PropertiesReader.get("ProductPageXpaths.cart.cartBadge");
    public static final String PROCEED_TO_CHECKOUT = PropertiesReader.get("ProductPageXpaths.cart.proceedToCheckout");

    public static final String COLOR_BLACK = PropertiesReader.get("ProductPageXpaths.colors.black");
    public static final String COLOR_BLUE = PropertiesReader.get("ProductPageXpaths.colors.blue");
    public static final String COLOR_GRAY = PropertiesReader.get("ProductPageXpaths.colors.gray");
    public static final String COLOR_RED = PropertiesReader.get("ProductPageXpaths.colors.red");

    public static final String CHECKOUT_FULLNAME = PropertiesReader.get("ProductPageXpaths.checkout.fullName");
    public static final String CHECKOUT_ADDRESS_LINE = PropertiesReader.get("ProductPageXpaths.checkout.addressLine");
    public static final String CHECKOUT_CITY = PropertiesReader.get("ProductPageXpaths.checkout.city");
    public static final String CHECKOUT_STATE_REGION = PropertiesReader.get("ProductPageXpaths.checkout.stateRegion");
    public static final String CHECKOUT_ZIPCODE = PropertiesReader.get("ProductPageXpaths.checkout.zipCode");
    public static final String CHECKOUT_COUNTRY = PropertiesReader.get("ProductPageXpaths.checkout.country");
    public static final String CHECKOUT_TO_PAYMENT = PropertiesReader.get("ProductPageXpaths.checkout.toPayment");

    public static final String PAYMENT_FULLNAME = PropertiesReader.get("ProductPageXpaths.payment.fullName");
    public static final String PAYMENT_CARD_NO = PropertiesReader.get("ProductPageXpaths.payment.cardNo");
    public static final String PAYMENT_EXP_DATE = PropertiesReader.get("ProductPageXpaths.payment.expDate");
    public static final String PAYMENT_SEC_CODE = PropertiesReader.get("ProductPageXpaths.payment.secCode");
    public static final String PAYMENT_REVIEW_ORDER = PropertiesReader.get("ProductPageXpaths.payment.reviewOrder");
    public static final String PAYMENT_PLACE_ORDER = PropertiesReader.get("ProductPageXpaths.payment.placeOrder");

    // =========================
    // Login Page Locators
    // =========================
    public static final String USERNAME_FIELD = PropertiesReader.get("LoginPageXpaths.usernameField");
    public static final String PASSWORD_FIELD = PropertiesReader.get("LoginPageXpaths.passwordField");
    public static final String LOGIN_BUTTON = PropertiesReader.get("LoginPageXpaths.loginButton");
    public static final String ERROR_MSG_LOCATOR = PropertiesReader.get("LoginPageXpaths.errorMsgLocator");
    public static final String ERR_MSG_USERNAME = PropertiesReader.get("LoginPageXpaths.errMsgUsername");
    public static final String PRODUCT_HEADER = PropertiesReader.get("LoginPageXpaths.productMain.productHeader");

    // =========================
    // Android Buttons
    // =========================
    public static final String LOGOUT_BUTTON = PropertiesReader.get("AndroidButtonsXpath.logoutBttn");
    public static final String CANCEL_BUTTON = PropertiesReader.get("AndroidButtonsXpath.cancelBttn");

    // =========================
    // Geo Location
    // =========================
    public static final String GEO_START_OBSERVING = PropertiesReader.get("GeoLocationUtils.startObservingBttn");
    public static final String GEO_STOP_OBSERVING = PropertiesReader.get("GeoLocationUtils.stopObservingBttn");
    public static final String GEO_HEADER_TXT = PropertiesReader.get("GeoLocationUtils.geoLocationHeaderTxt");
    public static final String GEO_PARAGRAPH_TXT = PropertiesReader.get("GeoLocationUtils.geoLocationParagraphTxt");
    public static final String GEO_STATEMENT_ONE = PropertiesReader.get("GeoLocationUtils.geoLocationStatementOne");
    public static final String GEO_STATEMENT_TWO = PropertiesReader.get("GeoLocationUtils.geoLocationStatementTwo");
    public static final String GEO_LAT_LONG_GROUP = PropertiesReader.get("GeoLocationUtils.geoLocationLatitudeLongtitudeGroup");

    // =========================
    // Sauce Video
    // =========================
    public static final String VIDEO_CONTAINER_HEADER = PropertiesReader.get("SauceVideoUtils.containerHeader");
    public static final String SAUCE_BOT_SCREEN = PropertiesReader.get("SauceVideoUtils.sauceBotScreen");
    public static final String VIDEO_STOP = PropertiesReader.get("SauceVideoUtils.stopButton");
    public static final String VIDEO_PLAY = PropertiesReader.get("SauceVideoUtils.playButton");
    public static final String VIDEO_REWIND = PropertiesReader.get("SauceVideoUtils.rewindButton");
    public static final String VIDEO_FORWARD = PropertiesReader.get("SauceVideoUtils.forwardButton");
    public static final String VIDEO_MUTE = PropertiesReader.get("SauceVideoUtils.muteButton");
    public static final String VIDEO_UNMUTE = PropertiesReader.get("SauceVideoUtils.unmuteButton");

    // =========================
    // Drawing
    // =========================
    public static final String DRAWING_HEADER = PropertiesReader.get("DrawingUtils.drawingHeader");
    public static final String DRAWING_SCREEN = PropertiesReader.get("DrawingUtils.drawingScreen");
    public static final String DRAWING_CLEAR_BUTTON = PropertiesReader.get("DrawingUtils.clearButton");
    public static final String DRAWING_SAVE_BUTTON = PropertiesReader.get("DrawingUtils.saveButton");
}
