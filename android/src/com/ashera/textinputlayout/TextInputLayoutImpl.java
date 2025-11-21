//start - license
/*
 * Copyright (c) 2025 Ashera Cordova
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
//end - license
package com.ashera.textinputlayout;
// start - imports
import java.util.*;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.*;
import android.widget.*;
import android.view.View.*;

import com.ashera.widget.BaseHasWidgets;

import android.annotation.SuppressLint;

import com.ashera.core.IFragment;
import com.ashera.widget.bus.*;
import com.ashera.converter.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.*;
import com.ashera.widget.IWidgetLifeCycleListener.*;
import com.ashera.layout.*;

import android.graphics.Canvas;
import android.widget.*;
import androidx.core.view.*;
import android.view.*;

import static com.ashera.widget.IWidget.*;
//end - imports
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

public class TextInputLayoutImpl extends BaseHasWidgets implements com.ashera.validations.FormElement {
	//start - body
	public final static String LOCAL_NAME = "com.google.android.material.textfield.TextInputLayout"; 
	public final static String GROUP_NAME = "com.google.android.material.textfield.TextInputLayout";
	private com.google.android.material.textfield.TextInputLayout textInputLayout;
	

	
		@SuppressLint("NewApi")
		final static class Orientation extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("horizontal",  0x0);
				mapping.put("vertical",  0x1);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class EndIconMode extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("custom",  -1);
				mapping.put("none",  0x0);
				mapping.put("password_toggle",  0x1);
				mapping.put("clear_text",  0x2);
				mapping.put("dropdown_menu",  0x3);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
		@SuppressLint("NewApi")
		final static class BoxBackgroundMode extends AbstractEnumToIntConverter{
		private Map<String, Integer> mapping = new HashMap<>();
				{
				mapping.put("none",  0x0);
				mapping.put("filled",  0x1);
				mapping.put("outline",  0x2);
				}
		@Override
		public Map<String, Integer> getMapping() {
				return mapping;
				}

		@Override
		public Integer getDefault() {
				return 0;
				}
				}
	@Override
	public void loadAttributes(String localName) {
		ViewGroupImpl.register(localName);

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baselineAligned").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("baselineAlignedChildIndex").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("divider").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("gravity").withType("gravity"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("measureWithLargestChild").withType("boolean"));
		ConverterFactory.register("com.google.android.material.textfield.TextInputLayout.orientation", new Orientation());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("orientation").withType("com.google.android.material.textfield.TextInputLayout.orientation"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("weightSum").withType("float"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hint").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxStrokeErrorColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxStrokeWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxStrokeWidthFocused").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("counterEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("counterMaxLength").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("counterOverflowTextAppearance").withType("style"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("counterOverflowTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("counterTextAppearance").withType("style"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("counterTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endIconCheckable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endIconContentDescription").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endIconDrawable").withType("drawable"));
		ConverterFactory.register("com.google.android.material.textfield.TextInputLayout.EndIconMode", new EndIconMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endIconMode").withType("com.google.android.material.textfield.TextInputLayout.EndIconMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endIconTint").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("errorContentDescription").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("errorEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("errorIconDrawable").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("errorIconTint").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("errorTextAppearance").withType("style"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("helperTextEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("helperTextTextAppearance").withType("style"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hintAnimationEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hintEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hintTextAppearance").withType("style"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hintTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("placeholderTextAppearance").withType("style"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("placeholderTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("prefixTextAppearance").withType("style"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("prefixTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("startIconCheckable").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("startIconContentDescription").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("startIconDrawable").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("startIconTint").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("suffixTextAppearance").withType("style"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("suffixTextColor").withType("colorstate"));
		ConverterFactory.register("com.google.android.material.textfield.TextInputLayout.BoxBackgroundMode", new BoxBackgroundMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxBackgroundMode").withType("com.google.android.material.textfield.TextInputLayout.BoxBackgroundMode"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxStrokeColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxBackgroundColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxCornerRadiusTopStart").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxCornerRadiusTopEnd").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxCornerRadiusBottomEnd").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxCornerRadiusBottomStart").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("defaultHintTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("errorTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("helperTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("helperText").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("error").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("placeholderText").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("prefixText").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("suffixText").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("startIconOnClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("startIconOnLongClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("startIconVisible").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endIconOnClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("errorIconOnClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endIconOnLongClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("errorIconOnLongClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endIconVisible").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endIconActivated").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hintTextFormat").withType("resourcestring").withOrder(-1));
	
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_gravity").withType("gravity").forChild());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("layout_weight").withType("float").forChild());
	}
	
	public TextInputLayoutImpl() {
		super(GROUP_NAME, LOCAL_NAME);
	}
	public  TextInputLayoutImpl(String localname) {
		super(GROUP_NAME, localname);
	}
	public  TextInputLayoutImpl(String groupName, String localname) {
		super(groupName, localname);
	}

	@Override
	public IWidget newInstance() {
		return new TextInputLayoutImpl(groupName, localName);
	}
	
	@SuppressLint("NewApi")
	@Override
	public void create(IFragment fragment, Map<String, Object> params) {
		super.create(fragment, params);
Context context = (Context) fragment.getRootActivity();
	Object systemStyle = params.get("systemStyle");
	Object systemAndroidAttrStyle = params.get("systemAndroidAttrStyle");
	
	if (systemStyle == null && systemAndroidAttrStyle == null) {
		textInputLayout = new TextInputLayoutExt(context);
	} else {
		int defStyleAttr = 0;
		int defStyleRes = 0;
		
		if (systemStyle != null) {
			defStyleRes = context.getResources().getIdentifier((String) systemStyle, "style", context.getPackageName());	
		}
		
		if (systemAndroidAttrStyle != null) {
			defStyleAttr = context.getResources().getIdentifier((String) systemAndroidAttrStyle, "attr", "android");	
		}
		
		if (defStyleRes == 0) {
			textInputLayout = new TextInputLayoutExt(context, null, defStyleAttr);	
		} else {
			textInputLayout = new TextInputLayoutExt(context, null, defStyleAttr, defStyleRes);
		}
		
	}

		
		nativeCreate(params);
		
		
		ViewGroupImpl.registerCommandConveter(this);

	}

	@Override
	public Object asWidget() {
		return textInputLayout;
	}

	@Override
	public boolean remove(IWidget w) {
		boolean remove = super.remove(w);
		textInputLayout.removeView((View) w.asWidget());
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		IWidget widget = widgets.get(index);
        boolean remove = super.remove(index);

        if (index + 1 <= textInputLayout.getChildCount()) {
            textInputLayout.removeViewAt(index);
        }    
        return remove;
    }

	
	@Override
	public void add(IWidget w, int index) {
		if (index != -2) {
			View view = (View) w.asWidget();
			createLayoutParams(view);
			    if (index == -1) {
			        textInputLayout.addView(view);
			    } else {
			        textInputLayout.addView(view, index);
			    }
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		com.google.android.material.textfield.TextInputLayout.LayoutParams layoutParams = (com.google.android.material.textfield.TextInputLayout.LayoutParams) view.getLayoutParams();
		
		layoutParams = (com.google.android.material.textfield.TextInputLayout.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new com.google.android.material.textfield.TextInputLayout.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private com.google.android.material.textfield.TextInputLayout.LayoutParams getLayoutParams(View view) {
		return (com.google.android.material.textfield.TextInputLayout.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();if (preSetChildAttribute(w, key, strValue, objValue)) {return;}
		com.google.android.material.textfield.TextInputLayout.LayoutParams layoutParams = getLayoutParams(view);
		ViewGroupImpl.setChildAttribute(w, key, objValue, layoutParams);		
		
		switch (key.getAttributeName()) {
		case "layout_width":
			layoutParams.width = (int) objValue;
			break;	
		case "layout_height":
			layoutParams.height = (int) objValue;
			break;
			case "layout_gravity": {
				
							layoutParams.gravity = ((int)objValue);
				
			}
			break;
			case "layout_weight": {
				
							layoutParams.weight = ((float)objValue);
				
			}
			break;
		default:
			break;
		}
		
		
		view.setLayoutParams(layoutParams);		
	}
	
	@SuppressLint("NewApi")
	@Override
	public Object getChildAttribute(IWidget w, WidgetAttribute key) {
		Object attributeValue = ViewGroupImpl.getChildAttribute(w, key);		
		if (attributeValue != null) {
			return attributeValue;
		}
		View view = (View) w.asWidget();
		com.google.android.material.textfield.TextInputLayout.LayoutParams layoutParams = getLayoutParams(view);

		switch (key.getAttributeName()) {
		case "layout_width":
			return layoutParams.width;
		case "layout_height":
			return layoutParams.height;
			case "layout_gravity": {
return layoutParams.gravity;			}

			case "layout_weight": {
return layoutParams.weight;			}

		}
		
		return null;

	}
	
		
	public class TextInputLayoutExt extends com.google.android.material.textfield.TextInputLayout implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
		private MeasureEvent measureFinished = new MeasureEvent();
		private OnLayoutEvent onLayoutEvent = new OnLayoutEvent();
		
		public IWidget getWidget() {
			return TextInputLayoutImpl.this;
		}
		private int mMaxWidth = -1;
		private int mMaxHeight = -1;
		@Override
		public void setMaxWidth(int width) {
			mMaxWidth = width;
		}
		@Override
		public void setMaxHeight(int height) {
			mMaxHeight = height;
		}
		@Override
		public int getMaxWidth() {
			return mMaxWidth;
		}
		@Override
		public int getMaxHeight() {
			return mMaxHeight;
		}

		public TextInputLayoutExt(Context context, android.util.AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	    }

	    public TextInputLayoutExt(Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    	super(context, attrs, defStyleAttr);
	    }
		public TextInputLayoutExt(Context context) {
			super(context);
			
		}
		
		@Override
		public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

			if(mMaxWidth > 0) {
	        	widthMeasureSpec = MeasureSpec.makeMeasureSpec(mMaxWidth, MeasureSpec.AT_MOST);
	        }
	        if(mMaxHeight > 0) {
	            heightMeasureSpec = MeasureSpec.makeMeasureSpec(mMaxHeight, MeasureSpec.AT_MOST);

	        }

	        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
			IWidgetLifeCycleListener listener = (IWidgetLifeCycleListener) getListener();
			if (listener != null) {
			    measureFinished.setWidth(getMeasuredWidth());
			    measureFinished.setHeight(getMeasuredHeight());
				listener.eventOccurred(EventId.measureFinished, measureFinished);
			}
		}
		
		@Override
		protected void onLayout(boolean changed, int l, int t, int r, int b) {
			super.onLayout(changed, l, t, r, b);
			
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			
			replayBufferedEvents();
			
			IWidgetLifeCycleListener listener = (IWidgetLifeCycleListener) getListener();
			if (listener != null) {
				onLayoutEvent.setB(b);
				onLayoutEvent.setL(l);
				onLayoutEvent.setR(r);
				onLayoutEvent.setT(t);
				onLayoutEvent.setChanged(changed);
				listener.eventOccurred(EventId.onLayout, onLayoutEvent);
			}
			
			if (isInvalidateOnFrameChange() && isInitialised()) {
				TextInputLayoutImpl.this.invalidate();
			}
		}	
		
		@Override
		public void onDraw(Canvas canvas) {
			Runnable runnable = () -> super.onDraw(canvas);
			executeMethodListeners("onDraw", runnable, canvas);
		}

		@Override
		public void draw(Canvas canvas) {
			Runnable runnable = () -> super.draw(canvas);
			executeMethodListeners("draw", runnable, canvas);
		}

		@SuppressLint("WrongCall")
		@Override
		public void execute(String method, Object... args) {
			switch (method) {
				case "onDraw":
					setOnMethodCalled(true);
					super.onDraw((Canvas) args[0]);
					break;

				case "draw":
					setOnMethodCalled(true);
					super.draw((Canvas) args[0]);
					break;

				default:
					break;
			}
		}

		public void updateMeasuredDimension(int width, int height) {
			setMeasuredDimension(width, height);
		}


		@Override
		public ILifeCycleDecorator newInstance(IWidget widget) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void setAttribute(WidgetAttribute widgetAttribute,
				String strValue, Object objValue) {
			throw new UnsupportedOperationException();
		}		
		

		@Override
		public List<String> getMethods() {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public void initialized() {
			throw new UnsupportedOperationException();
		}
		
        @Override
        public Object getAttribute(WidgetAttribute widgetAttribute) {
            throw new UnsupportedOperationException();
        }
        @Override
        public void drawableStateChanged() {
        	super.drawableStateChanged();
        	if (!isWidgetDisposed()) {
        		ViewImpl.drawableStateChanged(TextInputLayoutImpl.this);
        	}
        }
        
    	public void setState0(float value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 0, value);
    	}
    	public void setState0(int value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 0, value);
    	}
    	public void setState0(double value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 0, value);
    	}
    	
    	public void setState0(Float value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 0, value);
    	}
    	public void setState0(Integer value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 0, value);
    	}
    	public void setState0(Double value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 0, value);
    	}
    	public void setState0(Object value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 0, value);
    	}
    	public void setState1(float value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 1, value);
    	}
    	public void setState1(int value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 1, value);
    	}
    	public void setState1(double value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 1, value);
    	}
    	
    	public void setState1(Float value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 1, value);
    	}
    	public void setState1(Integer value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 1, value);
    	}
    	public void setState1(Double value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 1, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 1, value);
    	}
    	public void setState2(float value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 2, value);
    	}
    	public void setState2(int value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 2, value);
    	}
    	public void setState2(double value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 2, value);
    	}
    	
    	public void setState2(Float value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 2, value);
    	}
    	public void setState2(Integer value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 2, value);
    	}
    	public void setState2(Double value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 2, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 2, value);
    	}
    	public void setState3(float value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 3, value);
    	}
    	public void setState3(int value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 3, value);
    	}
    	public void setState3(double value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 3, value);
    	}
    	
    	public void setState3(Float value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 3, value);
    	}
    	public void setState3(Integer value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 3, value);
    	}
    	public void setState3(Double value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 3, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 3, value);
    	}
    	public void setState4(float value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 4, value);
    	}
    	public void setState4(int value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 4, value);
    	}
    	public void setState4(double value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 4, value);
    	}
    	
    	public void setState4(Float value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 4, value);
    	}
    	public void setState4(Integer value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 4, value);
    	}
    	public void setState4(Double value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 4, value);
    	}
    	public void setState4(Object value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 4, value);
    	}
        	public void state0() {
        		ViewImpl.state(TextInputLayoutImpl.this, 0);
        	}
        	public void state1() {
        		ViewImpl.state(TextInputLayoutImpl.this, 1);
        	}
        	public void state2() {
        		ViewImpl.state(TextInputLayoutImpl.this, 2);
        	}
        	public void state3() {
        		ViewImpl.state(TextInputLayoutImpl.this, 3);
        	}
        	public void state4() {
        		ViewImpl.state(TextInputLayoutImpl.this, 4);
        	}
                        
        public void stateYes() {
        	ViewImpl.stateYes(TextInputLayoutImpl.this);
        	
        }
        
        public void stateNo() {
        	ViewImpl.stateNo(TextInputLayoutImpl.this);
        }
     
	
	}
	@Override
	public Class getViewClass() {
		return TextInputLayoutExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
				ViewGroupImpl.setAttribute(this,  key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "baselineAligned": {


	textInputLayout.setBaselineAligned((boolean)objValue);



			}
			break;
			case "baselineAlignedChildIndex": {


	textInputLayout.setBaselineAlignedChildIndex((int)objValue);



			}
			break;
			case "divider": {
if (Build.VERSION.SDK_INT >= 11) {

	textInputLayout.setDividerDrawable((android.graphics.drawable.Drawable)objValue);

}

			}
			break;
			case "gravity": {


	textInputLayout.setGravity((int)objValue);



			}
			break;
			case "measureWithLargestChild": {
if (Build.VERSION.SDK_INT >= 11) {

	textInputLayout.setMeasureWithLargestChildEnabled((boolean)objValue);

}

			}
			break;
			case "orientation": {


	textInputLayout.setOrientation((int)objValue);



			}
			break;
			case "weightSum": {


	textInputLayout.setWeightSum((float)objValue);



			}
			break;
			case "hint": {


	textInputLayout.setHint((CharSequence)objValue);



			}
			break;
			case "boxStrokeErrorColor": {


	textInputLayout.setBoxStrokeErrorColor((ColorStateList)objValue);



			}
			break;
			case "boxStrokeWidth": {


	textInputLayout.setBoxStrokeWidth((int)objValue);



			}
			break;
			case "boxStrokeWidthFocused": {


	textInputLayout.setBoxStrokeWidthFocused((int)objValue);



			}
			break;
			case "counterEnabled": {


	textInputLayout.setCounterEnabled((boolean)objValue);



			}
			break;
			case "counterMaxLength": {


	textInputLayout.setCounterMaxLength((int)objValue);



			}
			break;
			case "counterOverflowTextAppearance": {


	textInputLayout.setCounterOverflowTextAppearance((int)objValue);



			}
			break;
			case "counterOverflowTextColor": {


	textInputLayout.setCounterOverflowTextColor((ColorStateList)objValue);



			}
			break;
			case "counterTextAppearance": {


	textInputLayout.setCounterTextAppearance((int)objValue);



			}
			break;
			case "counterTextColor": {


	textInputLayout.setCounterTextColor((ColorStateList)objValue);



			}
			break;
			case "endIconCheckable": {


	textInputLayout.setEndIconCheckable((boolean)objValue);



			}
			break;
			case "endIconContentDescription": {


	textInputLayout.setEndIconContentDescription((CharSequence)objValue);



			}
			break;
			case "endIconDrawable": {


	textInputLayout.setEndIconDrawable((Drawable)objValue);



			}
			break;
			case "endIconMode": {


	textInputLayout.setEndIconMode((int)objValue);



			}
			break;
			case "endIconTint": {


	textInputLayout.setEndIconTintList((ColorStateList)objValue);



			}
			break;
			case "errorContentDescription": {


	textInputLayout.setErrorContentDescription((CharSequence)objValue);



			}
			break;
			case "errorEnabled": {


	textInputLayout.setErrorEnabled((boolean)objValue);



			}
			break;
			case "errorIconDrawable": {


	textInputLayout.setErrorIconDrawable((Drawable)objValue);



			}
			break;
			case "errorIconTint": {


	textInputLayout.setErrorIconTintList((ColorStateList)objValue);



			}
			break;
			case "errorTextAppearance": {


	textInputLayout.setErrorTextAppearance((int)objValue);



			}
			break;
			case "helperTextEnabled": {


	textInputLayout.setHelperTextEnabled((boolean)objValue);



			}
			break;
			case "helperTextTextAppearance": {


	textInputLayout.setHelperTextTextAppearance((int)objValue);



			}
			break;
			case "hintAnimationEnabled": {


	textInputLayout.setHintAnimationEnabled((boolean)objValue);



			}
			break;
			case "hintEnabled": {


	textInputLayout.setHintEnabled((boolean)objValue);



			}
			break;
			case "hintTextAppearance": {


	textInputLayout.setHintTextAppearance((int)objValue);



			}
			break;
			case "hintTextColor": {


	textInputLayout.setHintTextColor((ColorStateList)objValue);



			}
			break;
			case "placeholderTextAppearance": {


	textInputLayout.setPlaceholderTextAppearance((int)objValue);



			}
			break;
			case "placeholderTextColor": {


	textInputLayout.setPlaceholderTextColor((ColorStateList)objValue);



			}
			break;
			case "prefixTextAppearance": {


	textInputLayout.setPrefixTextAppearance((int)objValue);



			}
			break;
			case "prefixTextColor": {


	textInputLayout.setPrefixTextColor((ColorStateList)objValue);



			}
			break;
			case "startIconCheckable": {


	textInputLayout.setStartIconCheckable((boolean)objValue);



			}
			break;
			case "startIconContentDescription": {


	textInputLayout.setStartIconContentDescription((String)objValue);



			}
			break;
			case "startIconDrawable": {


	textInputLayout.setStartIconDrawable((Drawable)objValue);



			}
			break;
			case "startIconTint": {


	textInputLayout.setStartIconTintList((ColorStateList)objValue);



			}
			break;
			case "suffixTextAppearance": {


	textInputLayout.setSuffixTextAppearance((int)objValue);



			}
			break;
			case "suffixTextColor": {


	textInputLayout.setSuffixTextColor((ColorStateList)objValue);



			}
			break;
			case "boxBackgroundMode": {


	textInputLayout.setBoxBackgroundMode((int)objValue);



			}
			break;
			case "boxStrokeColor": {


	textInputLayout.setBoxStrokeColorStateList((ColorStateList)objValue);



			}
			break;
			case "boxBackgroundColor": {


	textInputLayout.setBoxBackgroundColorStateList((ColorStateList)objValue);



			}
			break;
			case "boxCornerRadiusTopStart": {


		setBoxCornerRadiusTopStart(objValue);



			}
			break;
			case "boxCornerRadiusTopEnd": {


		setBoxCornerRadiusTopEnd(objValue);



			}
			break;
			case "boxCornerRadiusBottomEnd": {


		setBoxCornerRadiusBottomEnd(objValue);



			}
			break;
			case "boxCornerRadiusBottomStart": {


		setBoxCornerRadiusBottomStart(objValue);



			}
			break;
			case "defaultHintTextColor": {


	textInputLayout.setDefaultHintTextColor((ColorStateList)objValue);



			}
			break;
			case "errorTextColor": {


	textInputLayout.setErrorTextColor((ColorStateList)objValue);



			}
			break;
			case "helperTextColor": {


	textInputLayout.setHelperTextColor((ColorStateList)objValue);



			}
			break;
			case "helperText": {


	textInputLayout.setHelperText((CharSequence)objValue);



			}
			break;
			case "error": {


	textInputLayout.setError((CharSequence)objValue);



			}
			break;
			case "placeholderText": {


	textInputLayout.setPlaceholderText((CharSequence)objValue);



			}
			break;
			case "prefixText": {


	textInputLayout.setPrefixText((CharSequence)objValue);



			}
			break;
			case "suffixText": {


	textInputLayout.setSuffixText((CharSequence)objValue);



			}
			break;
			case "enabled": {


	textInputLayout.setEnabled((boolean)objValue);



			}
			break;
			case "startIconOnClick": {


		 if (objValue instanceof String) {textInputLayout.setStartIconOnClickListener(new OnClickListener(this, strValue));} else {textInputLayout.setStartIconOnClickListener((View.OnClickListener) objValue);}



			}
			break;
			case "startIconOnLongClick": {


		 if (objValue instanceof String) {textInputLayout.setStartIconOnLongClickListener(new OnLongClickListener(this, strValue));} else {textInputLayout.setStartIconOnLongClickListener((View.OnLongClickListener) objValue);}



			}
			break;
			case "startIconVisible": {


	textInputLayout.setStartIconVisible((boolean)objValue);



			}
			break;
			case "endIconOnClick": {


		 if (objValue instanceof String) {textInputLayout.setEndIconOnClickListener(new OnClickListener(this, strValue));} else {textInputLayout.setEndIconOnClickListener((View.OnClickListener) objValue);}



			}
			break;
			case "errorIconOnClick": {


		 if (objValue instanceof String) {textInputLayout.setErrorIconOnClickListener(new OnClickListener(this, strValue));} else {textInputLayout.setErrorIconOnClickListener((View.OnClickListener) objValue);}



			}
			break;
			case "endIconOnLongClick": {


		 if (objValue instanceof String) {textInputLayout.setEndIconOnLongClickListener(new OnLongClickListener(this, strValue));} else {textInputLayout.setEndIconOnLongClickListener((View.OnLongClickListener) objValue);}



			}
			break;
			case "errorIconOnLongClick": {


		 if (objValue instanceof String) {textInputLayout.setErrorIconOnLongClickListener(new OnLongClickListener(this, strValue));} else {textInputLayout.setErrorIconOnLongClickListener((View.OnLongClickListener) objValue);}



			}
			break;
			case "endIconVisible": {


	textInputLayout.setEndIconVisible((boolean)objValue);



			}
			break;
			case "endIconActivated": {


	textInputLayout.setEndIconActivated((boolean)objValue);



			}
			break;
			case "hintTextFormat": {


		setHintTextFormat(objValue);



			}
			break;
		default:
			break;
		}
		postSetAttribute(key, strValue, objValue, decorator);
	}
	
	@Override
	@SuppressLint("NewApi")
	public Object getAttribute(WidgetAttribute key, ILifeCycleDecorator decorator) {
		Object attributeValue = ViewGroupImpl.getAttribute(this, key, decorator);
		if (attributeValue != null) {
			return attributeValue;
		}
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "baselineAligned": {
return textInputLayout.isBaselineAligned();			}
			case "baselineAlignedChildIndex": {
return textInputLayout.getBaselineAlignedChildIndex();			}
			case "divider": {
if (Build.VERSION.SDK_INT >= 11) {
return textInputLayout.getDividerDrawable();
}
break;			}
			case "gravity": {
if (Build.VERSION.SDK_INT >= 24) {
return textInputLayout.getGravity();
}
break;			}
			case "measureWithLargestChild": {
if (Build.VERSION.SDK_INT >= 11) {
return textInputLayout.isMeasureWithLargestChildEnabled();
}
break;			}
			case "orientation": {
return textInputLayout.getOrientation();			}
			case "weightSum": {
return textInputLayout.getWeightSum();			}
			case "hint": {
return textInputLayout.getHint();			}
			case "boxStrokeErrorColor": {
return textInputLayout.getBoxStrokeErrorColor();			}
			case "counterMaxLength": {
return textInputLayout.getCounterMaxLength();			}
			case "counterOverflowTextColor": {
return textInputLayout.getCounterOverflowTextColor();			}
			case "counterTextColor": {
return textInputLayout.getCounterTextColor();			}
			case "endIconDrawable": {
return textInputLayout.getEndIconDrawable();			}
			case "endIconMode": {
return textInputLayout.getEndIconMode();			}
			case "errorIconDrawable": {
return textInputLayout.getErrorIconDrawable();			}
			case "hintTextColor": {
return textInputLayout.getHintTextColor();			}
			case "placeholderTextAppearance": {
return textInputLayout.getPlaceholderTextAppearance();			}
			case "placeholderTextColor": {
return textInputLayout.getPlaceholderTextColor();			}
			case "prefixTextColor": {
return textInputLayout.getPrefixTextColor();			}
			case "startIconDrawable": {
return textInputLayout.getStartIconDrawable();			}
			case "suffixTextColor": {
return textInputLayout.getSuffixTextColor();			}
		}
		return null;
	}


	@Override
    public Object asNativeWidget() {
        return textInputLayout;
    }
    
    @Override
    public void requestLayout() {
    	if (isInitialised()) {
    		ViewImpl.requestLayout(this, asNativeWidget());
    	}
    }
    
    @Override
    public void invalidate() {
    	if (isInitialised()) {
    		ViewImpl.invalidate(this, asNativeWidget());
    	}
    }
    
	

	@Override
	public void resetError() {
		int validationErrorDisplayType = getValidationErrorDisplayType();
		if ((validationErrorDisplayType & com.ashera.validations.FormElement.ERROR_DISPLAY_TYPE_POPUP) != 0) {
			setError(null);	
		}
		
		if ((validationErrorDisplayType & com.ashera.validations.FormElement.ERROR_DISPLAY_TYPE_LABEL) != 0) {
			ViewImpl.setMessageOnLabel(this, "");	
		}
		
		if ((validationErrorDisplayType & com.ashera.validations.FormElement.ERROR_DISPLAY_TYPE_STYLE) != 0) {
			ViewImpl.setStyle(this, getNormalStyle());
		}
	}

	@Override
	public void showError(String message) {
		int validationErrorDisplayType = getValidationErrorDisplayType();
		if ((validationErrorDisplayType & com.ashera.validations.FormElement.ERROR_DISPLAY_TYPE_POPUP) != 0) {
			setError(message);
		}
		
		if ((validationErrorDisplayType & com.ashera.validations.FormElement.ERROR_DISPLAY_TYPE_LABEL) != 0) {
			ViewImpl.setMessageOnLabel(this, message);
		}
		
		if ((validationErrorDisplayType & com.ashera.validations.FormElement.ERROR_DISPLAY_TYPE_STYLE) != 0) {
			ViewImpl.setStyle(this, getErrorStyle());
		}
	}
	


	private void setHintTextFormat(Object objValue) {
		applyAttributeCommand("hint", CommonConverters.command_textformatter, new String[] {"hintTextFormat"}, true, (String) objValue);
	}
	

	@SuppressLint("NewApi")
private static class OnClickListener implements View.OnClickListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnClickListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnClickListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public void onClick (View v){
    
	if (action == null || action.equals("onClick")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onClick");
	    java.util.Map<String, Object> obj = getOnClickEventObj(v);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v);
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return;
}//#####

public java.util.Map<String, Object> getOnClickEventObj(View v) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "click");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onClick", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}

	@SuppressLint("NewApi")
private static class OnLongClickListener implements View.OnLongClickListener, com.ashera.widget.IListener{
private IWidget w; private View view; private String strValue; private String action;
public String getAction() {return action;}
public OnLongClickListener(IWidget w, String strValue)  {
this.w = w; this.strValue = strValue;
}
public OnLongClickListener(IWidget w, String strValue, String action)  {
this.w = w; this.strValue = strValue;this.action=action;
}
public boolean onLongClick (View v){
    boolean result = true;
    
	if (action == null || action.equals("onLongClick")) {
		// populate the data from ui to pojo
		w.syncModelFromUiToPojo("onLongClick");
	    java.util.Map<String, Object> obj = getOnLongClickEventObj(v);
	    String commandName =  (String) obj.get(EventExpressionParser.KEY_COMMAND_NAME);
	    
	    // execute command based on command type
	    String commandType = (String)obj.get(EventExpressionParser.KEY_COMMAND_TYPE);
		switch (commandType) {
		case "+":
		    if (EventCommandFactory.hasCommand(commandName)) {
		    	 Object commandResult = EventCommandFactory.getCommand(commandName).executeCommand(w, obj, v);
		    	 if (commandResult != null) {
		    		 result = (boolean) commandResult;
		    	 }
		    }

			break;
		default:
			break;
		}
		
		if (obj.containsKey("refreshUiFromModel")) {
			Object widgets = obj.remove("refreshUiFromModel");
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, widgets, true);
		}
		if (w.getModelUiToPojoEventIds() != null) {
			com.ashera.layout.ViewImpl.refreshUiFromModel(w, w.getModelUiToPojoEventIds(), true);
		}
		if (strValue != null && !strValue.isEmpty() && !strValue.trim().startsWith("+")) {
		    com.ashera.core.IActivity activity = (com.ashera.core.IActivity)w.getFragment().getRootActivity();
		    if (activity != null) {
		    	activity.sendEventMessage(obj);
		    }
		}
	}
    return result;
}//#####

public java.util.Map<String, Object> getOnLongClickEventObj(View v) {
	java.util.Map<String, Object> obj = com.ashera.widget.PluginInvoker.getJSONCompatMap();
    obj.put("action", "action");
    obj.put("eventType", "longclick");
    obj.put("fragmentId", w.getFragment().getFragmentId());
    obj.put("actionUrl", w.getFragment().getActionUrl());
    obj.put("namespace", w.getFragment().getNamespace());
    
    if (w.getComponentId() != null) {
    	obj.put("componentId", w.getComponentId());
    }
    
    PluginInvoker.putJSONSafeObjectIntoMap(obj, "id", w.getId());
     
    
    // parse event info into the map
    EventExpressionParser.parseEventExpression(strValue, obj);
    
    // update model data into map
    w.updateModelToEventMap(obj, "onLongClick", (String)obj.get(EventExpressionParser.KEY_EVENT_ARGS));
    return obj;
}
}


	@Override
	public void setId(String id){
		if (id != null && !id.equals("")){
			super.setId(id);
			textInputLayout.setId((int) quickConvert(id, "id"));
		}
	}
	
    

		//end - body
	//start - textinputlayout
	public boolean preSetChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();
		if (view instanceof EditText) {
	
			android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
			android.view.ViewGroup.LayoutParams playoutParams = ((ViewGroup) view.getParent()).getLayoutParams();
	
			switch (key.getAttributeName()) {
				case "layout_width":
					layoutParams.width = (int) objValue;
					playoutParams.width = (int) objValue;
					break;
				case "layout_height":
					layoutParams.height = (int) objValue;
					playoutParams.height = (int) objValue;
					break;
				default:
					break;
			}
			view.setLayoutParams(layoutParams);
			((ViewGroup) view.getParent()).setLayoutParams(playoutParams);
			return true;
		}
		return false;
	}
	
	private float cornerRadiusBottomStart;
	private float cornerRadiusBottomEnd;
	private float cornerRadiusTopStart;
	private float cornerRadiusTopEnd;
	private void setBoxCornerRadiusBottomStart(Object objValue) {
		cornerRadiusBottomStart = (float) objValue;
		textInputLayout.setBoxCornerRadii(cornerRadiusTopStart, cornerRadiusTopEnd, cornerRadiusBottomStart, cornerRadiusBottomEnd);
	}
	
	private void setBoxCornerRadiusBottomEnd(Object objValue) {
		cornerRadiusBottomEnd = (float) objValue;
		textInputLayout.setBoxCornerRadii(cornerRadiusTopStart, cornerRadiusTopEnd, cornerRadiusBottomStart, cornerRadiusBottomEnd);
	}
	
	private void setBoxCornerRadiusTopEnd(Object objValue) {
		cornerRadiusTopEnd = (float) objValue;
		textInputLayout.setBoxCornerRadii(cornerRadiusTopStart, cornerRadiusTopEnd, cornerRadiusBottomStart, cornerRadiusBottomEnd);
		
	}
	
	private void setBoxCornerRadiusTopStart(Object objValue) {
		cornerRadiusTopStart = (float) objValue;		
		textInputLayout.setBoxCornerRadii(cornerRadiusTopStart, cornerRadiusTopEnd, cornerRadiusBottomStart, cornerRadiusBottomEnd);
	}

	@Override
	public String getTextEntered() {
		EditText editText = textInputLayout.getEditText();
		if (editText == null) {
			return "";
		}
		return editText.getText().toString();
	}

	@Override
	public boolean isViewVisible() {
		return textInputLayout.getVisibility() == View.VISIBLE;
	}

	@Override
	public void focus() {
		EditText editText = textInputLayout.getEditText();
		if (editText == null) {
			return;
		}

		editText.requestFocus();
	}
	
	private void setError(String mesage) {
		EditText editText = textInputLayout.getEditText();
		if (editText == null) {
			return;
		}
		editText.setError(mesage);
	}
	//end - textinputlayout
	
	
	private void postSetAttribute(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
		if (textInputLayout.getEndIconDrawable() != null) {
			View view = (View) getFieldValueUsingReflection(textInputLayout, "endLayout");
			view.bringToFront();
		}

		if (textInputLayout.getStartIconDrawable() != null) {
			View view = (View) getFieldValueUsingReflection(textInputLayout, "startLayout");
			view.bringToFront();
		}

		if (textInputLayout.getErrorIconDrawable() != null) {
			View view = (View) getFieldValueUsingReflection(textInputLayout, "endLayout");
			view.bringToFront();
		}
	}
	
	private void nativeCreate(Map<String, Object> params) {
		registerForAttributeCommandChain("hint");
	}

}
