package Nov.ex_14112024_Static_Wrapper_Exception;

public enum APIConstantEndPoints {

    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dasHboard"),
    CHATBOT_PAGE("https://app.vwo.com/chat");

    private String name;

    APIConstantEndPoints(String name){
        this.name = name;
    }

    String getvalue(){
        return  name;
    }
}
