package com.ashera.textinputlayout;

import com.ashera.widget.WidgetFactory;

public class TextInputLayoutPlugin  {
    public static void initPlugin() {
    	//start - widgets
        WidgetFactory.register(new com.ashera.textinputlayout.TextInputLayoutImpl());
        WidgetFactory.register(new com.ashera.textinputlayout.TextInputEditTextImpl());
        //end - widgets
    }
}
