package com.ashera.textinputlayout;

import com.ashera.widget.WidgetFactory;

public class TextInputLayoutPlugin  {
    public static void initPlugin() {
    	//start - widgets
        WidgetFactory.register(new com.ashera.textinputlayout.TextInputLayoutImpl());
        //end - widgets
        WidgetFactory.register(new com.ashera.layout.EditTextImpl("com.google.android.material.textfield.TextInputEditText",
        		"com.google.android.material.textfield.TextInputEditText"));
    }
}
