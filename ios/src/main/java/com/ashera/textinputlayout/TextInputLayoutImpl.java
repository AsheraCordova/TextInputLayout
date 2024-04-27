package com.ashera.textinputlayout;
// start - imports
import java.util.*;

import r.android.annotation.SuppressLint;
import r.android.content.Context;
import r.android.os.Build;
import r.android.view.*;
import r.android.widget.*;
import r.android.view.View.*;

import com.ashera.widget.BaseHasWidgets;

import r.android.annotation.SuppressLint;

import com.ashera.core.IFragment;
import com.ashera.widget.bus.*;
import com.ashera.converter.*;
import com.ashera.widget.bus.Event.*;
import com.ashera.widget.*;
import com.ashera.widget.IWidgetLifeCycleListener.*;
import com.ashera.layout.*;

/*-[
#include <UIKit/UIKit.h>
#include "ASUIView.h"
#include "HasLifeCycleDecorators.h"
]-*/
import com.google.j2objc.annotations.Property;
import androidx.core.view.*;

import static com.ashera.widget.IWidget.*;
//end - imports

public class TextInputLayoutImpl extends BaseHasWidgets implements com.ashera.validations.FormElement {
	//start - body
	private @Property Object uiView;
	public final static String LOCAL_NAME = "com.google.android.material.textfield.TextInputLayout"; 
	public final static String GROUP_NAME = "com.google.android.material.textfield.TextInputLayout";
	private r.android.widget.LinearLayout linearLayout;
	

	
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

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hintTextFormat").withType("resourcestring").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hint").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("prefixText").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("suffixText").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endIconDrawable").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("startIconDrawable").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("counterEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("counterMaxLength").withType("int"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("counterOverflowTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("counterTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hintEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hintTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("placeholderText").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("placeholderTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("prefixTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("suffixTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endIconOnClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endIconOnLongClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("startIconOnClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("startIconOnLongClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("startIconVisible").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endIconVisible").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("helperTextEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("helperTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("helperText").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("error").withType("resourcestring"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("errorEnabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("errorTextColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("errorIconDrawable").withType("drawable"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("errorIconOnClick").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("errorIconOnLongClick").withType("string"));
		ConverterFactory.register("com.google.android.material.textfield.TextInputLayout.EndIconMode", new EndIconMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("endIconMode").withType("com.google.android.material.textfield.TextInputLayout.EndIconMode"));
		ConverterFactory.register("com.google.android.material.textfield.TextInputLayout.BoxBackgroundMode", new BoxBackgroundMode());
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxBackgroundMode").withType("com.google.android.material.textfield.TextInputLayout.BoxBackgroundMode").withOrder(-1));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxBackgroundColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxCornerRadiusTopStart").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxCornerRadiusTopEnd").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxCornerRadiusBottomEnd").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxCornerRadiusBottomStart").withType("dimensionfloat"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxStrokeErrorColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxStrokeWidth").withType("dimension"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxStrokeColor").withType("colorstate"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("enabled").withType("boolean"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("hintTextAppearance").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("counterOverflowTextAppearance").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("counterTextAppearance").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("errorTextAppearance").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("helperTextTextAppearance").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("prefixTextAppearance").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("suffixTextAppearance").withType("string"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("boxPadding").withType("dimension"));
	
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
		linearLayout = new TextInputLayoutExt();
		
		nativeCreate(params);
		
		
		ViewGroupImpl.registerCommandConveter(this);
		setWidgetOnNativeClass();
	}
	private native void setWidgetOnNativeClass() /*-[
		((ASUIView*) [self asNativeWidget]).widget = self;
	]-*/;

	@Override
	public Object asWidget() {
		return linearLayout;
	}

	@Override
	public boolean remove(IWidget w) {		
		boolean remove = super.remove(w);
		linearLayout.removeView((View) w.asWidget());
		 nativeRemoveView(w);            
		return remove;
	}
	
	@Override
    public boolean remove(int index) {
		IWidget widget = widgets.get(index);
        boolean remove = super.remove(index);

        if (index + 1 <= linearLayout.getChildCount()) {
            linearLayout.removeViewAt(index);
            nativeRemoveView(widget);
        }    
        return remove;
    }

	private void nativeRemoveView(IWidget widget) {
		r.android.animation.LayoutTransition layoutTransition = linearLayout.getLayoutTransition();
		if (layoutTransition != null && (
				layoutTransition.isTransitionTypeEnabled(r.android.animation.LayoutTransition.CHANGE_DISAPPEARING) ||
				layoutTransition.isTransitionTypeEnabled(r.android.animation.LayoutTransition.DISAPPEARING)
				)) {
			addToBufferedRunnables(() -> ViewGroupImpl.nativeRemoveView(widget));          
		} else {
			ViewGroupImpl.nativeRemoveView(widget);
		}
	}
	
	@Override
	public void add(IWidget w, int index) {
		if (index != -2) {
			View view = (View) w.asWidget();
			createLayoutParams(view);
			    if (index == -1) {
			        linearLayout.addView(view);
			    } else {
			        linearLayout.addView(view, index);
			    }
		}
		
		ViewGroupImpl.nativeAddView(asNativeWidget(), w.asNativeWidget());
		super.add(w, index);
	}
	
	private void createLayoutParams(View view) {
		r.android.widget.LinearLayout.LayoutParams layoutParams = (r.android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
		
		layoutParams = (r.android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
		if (layoutParams == null) {
			layoutParams = new r.android.widget.LinearLayout.LayoutParams(-2, -2);
			view.setLayoutParams(layoutParams);
		}  else {
			layoutParams.height = -2;
			layoutParams.width = -2;
		}
	}
	
	private r.android.widget.LinearLayout.LayoutParams getLayoutParams(View view) {
		return (r.android.widget.LinearLayout.LayoutParams) view.getLayoutParams();		
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		View view = (View) w.asWidget();if (preSetChildAttribute(w, key, strValue, objValue)) {return;}
		r.android.widget.LinearLayout.LayoutParams layoutParams = getLayoutParams(view);
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
		r.android.widget.LinearLayout.LayoutParams layoutParams = getLayoutParams(view);

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
	
@com.google.j2objc.annotations.WeakOuter		
	public class TextInputLayoutExt extends r.android.widget.LinearLayout implements ILifeCycleDecorator, com.ashera.widget.IMaxDimension{
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

		public TextInputLayoutExt() {
			super();
			
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
			ViewImpl.setDrawableBounds(TextInputLayoutImpl.this, l, t, r, b);
			ViewImpl.nativeMakeFrame(asNativeWidget(), l, t, r, b);
			replayBufferedEvents();
	        ViewImpl.redrawDrawables(TextInputLayoutImpl.this);
			
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
		public void execute(String method, Object... canvas) {
			
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
        	ViewImpl.drawableStateChanged(TextInputLayoutImpl.this);
        }
        private Map<String, IWidget> templates;
    	@Override
    	public r.android.view.View inflateView(java.lang.String layout) {
    		if (templates == null) {
    			templates = new java.util.HashMap<String, IWidget>();
    		}
    		IWidget template = templates.get(layout);
    		if (template == null) {
    			template = (IWidget) quickConvert(layout, "template");
    			templates.put(layout, template);
    		}
    		IWidget widget = template.loadLazyWidgets(TextInputLayoutImpl.this.getParent());
    		return (View) widget.asWidget();
    	}        
        
    	@Override
		public void remeasure() {
    		if (getFragment() != null) {
    			getFragment().remeasure();
    		}
		}
    	
        @Override
		public void removeFromParent() {
        	TextInputLayoutImpl.this.getParent().remove(TextInputLayoutImpl.this);
		}
        @Override
        public void getLocationOnScreen(int[] appScreenLocation) {
        	appScreenLocation[0] = ViewImpl.getLocationXOnScreen(asNativeWidget());
        	appScreenLocation[1] = ViewImpl.getLocationYOnScreen(asNativeWidget());
        }
        @Override
        public void getWindowVisibleDisplayFrame(r.android.graphics.Rect displayFrame){
        	
        	displayFrame.left = ViewImpl.getLocationXOnScreen(asNativeWidget());
        	displayFrame.top = ViewImpl.getLocationYOnScreen(asNativeWidget());
        	displayFrame.right = displayFrame.left + getWidth();
        	displayFrame.bottom = displayFrame.top + getHeight();
        }
        @Override
		public void offsetTopAndBottom(int offset) {
			super.offsetTopAndBottom(offset);
			ViewImpl.nativeMakeFrame(asNativeWidget(), getLeft(), getTop(), getRight(), getBottom());
		}
		@Override
		public void offsetLeftAndRight(int offset) {
			super.offsetLeftAndRight(offset);
			ViewImpl.nativeMakeFrame(asNativeWidget(), getLeft(), getTop(), getRight(), getBottom());
		}
		@Override
		public void setMyAttribute(String name, Object value) {
			if (name.equals("state0")) {
				setState0(value);
				return;
			}
			if (name.equals("state1")) {
				setState1(value);
				return;
			}
			if (name.equals("state2")) {
				setState2(value);
				return;
			}
			if (name.equals("state3")) {
				setState3(value);
				return;
			}
			if (name.equals("state4")) {
				setState4(value);
				return;
			}
			TextInputLayoutImpl.this.setAttribute(name, value, true);
		}
        @Override
        public void setVisibility(int visibility) {
            super.setVisibility(visibility);
            ViewImpl.nativeSetVisibility(asNativeWidget(), visibility != View.VISIBLE);
            
        }
        
    	public void setState0(Object value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 0, value);
    	}
    	public void setState1(Object value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 1, value);
    	}
    	public void setState2(Object value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 2, value);
    	}
    	public void setState3(Object value) {
    		ViewImpl.setState(TextInputLayoutImpl.this, 3, value);
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
     
		@Override
		public void endViewTransition(r.android.view.View view) {
			super.endViewTransition(view);
			runBufferedRunnables();
		}
	}
	@Override
	public Class getViewClass() {
		return TextInputLayoutExt.class;
	}
	
	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
				ViewGroupImpl.setAttribute(this, key, strValue, objValue, decorator);
		Object nativeWidget = asNativeWidget();
		switch (key.getAttributeName()) {
			case "hintTextFormat": {


		setHintTextFormat(objValue);



			}
			break;
			case "hint": {


		setHint(objValue);



			}
			break;
			case "prefixText": {


		setPrefixText(objValue);



			}
			break;
			case "suffixText": {


		setSuffixText(objValue);



			}
			break;
			case "endIconDrawable": {


		setEndIconDrawable(objValue);



			}
			break;
			case "startIconDrawable": {


		setStartIconDrawable(objValue);



			}
			break;
			case "counterEnabled": {


		setCounterEnabled(objValue);



			}
			break;
			case "counterMaxLength": {


		setCounterMaxLength(objValue);



			}
			break;
			case "counterOverflowTextColor": {


		setCounterOverflowTextColor(objValue);



			}
			break;
			case "counterTextColor": {


		setCounterTextColor(objValue);



			}
			break;
			case "hintEnabled": {


		setHintEnabled(objValue);



			}
			break;
			case "hintTextColor": {


		setHintTextColor(objValue);



			}
			break;
			case "placeholderText": {


		setPlaceholderText(objValue);



			}
			break;
			case "placeholderTextColor": {


		setPlaceholderTextColor(objValue);



			}
			break;
			case "prefixTextColor": {


		setPrefixTextColor(objValue);



			}
			break;
			case "suffixTextColor": {


		setSuffixTextColor(objValue);



			}
			break;
			case "endIconOnClick": {


		 if (objValue instanceof String) {setEndIconOnClickListener(new OnClickListener(this, strValue));} else {setEndIconOnClickListener((View.OnClickListener) objValue);}



			}
			break;
			case "endIconOnLongClick": {


		 if (objValue instanceof String) {setEndIconOnLongClickListener(new OnLongClickListener(this, strValue));} else {setEndIconOnLongClickListener((View.OnLongClickListener) objValue);}



			}
			break;
			case "startIconOnClick": {


		 if (objValue instanceof String) {setStartIconOnClickListener(new OnClickListener(this, strValue));} else {setStartIconOnClickListener((View.OnClickListener) objValue);}



			}
			break;
			case "startIconOnLongClick": {


		 if (objValue instanceof String) {setStartIconOnLongClickListener(new OnLongClickListener(this, strValue));} else {setStartIconOnLongClickListener((View.OnLongClickListener) objValue);}



			}
			break;
			case "startIconVisible": {


		setStartIconVisible(objValue);



			}
			break;
			case "endIconVisible": {


		setEndIconVisible(objValue);



			}
			break;
			case "helperTextEnabled": {


		setHelperTextEnabled(objValue);



			}
			break;
			case "helperTextColor": {


		setHelperTextColor(objValue);



			}
			break;
			case "helperText": {


		setHelperText(objValue);



			}
			break;
			case "error": {


		setMyError(objValue);



			}
			break;
			case "errorEnabled": {


		setErrorEnabled(objValue);



			}
			break;
			case "errorTextColor": {


		setErrorTextColor(objValue);



			}
			break;
			case "errorIconDrawable": {


		setErrorIconDrawable(objValue);



			}
			break;
			case "errorIconOnClick": {


		 if (objValue instanceof String) {setErrorIconOnClickListener(new OnClickListener(this, strValue));} else {setErrorIconOnClickListener((View.OnClickListener) objValue);}



			}
			break;
			case "errorIconOnLongClick": {


		 if (objValue instanceof String) {setErrorIconOnLongClickListener(new OnLongClickListener(this, strValue));} else {setErrorIconOnLongClickListener((View.OnLongClickListener) objValue);}



			}
			break;
			case "endIconMode": {


		setEndIconMode(objValue);



			}
			break;
			case "boxBackgroundMode": {


		setBoxBackgroundMode(objValue);



			}
			break;
			case "boxBackgroundColor": {


		setBoxBackgroundColorStateList(objValue);



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
			case "boxStrokeErrorColor": {


		setBoxStrokeErrorColor(objValue);



			}
			break;
			case "boxStrokeWidth": {


		setBoxStrokeWidth(objValue);



			}
			break;
			case "boxStrokeColor": {


		setBoxStrokeColorStateList(objValue);



			}
			break;
			case "enabled": {


		setEnabled(objValue);



			}
			break;
			case "hintTextAppearance": {


		setHintTextAppearance(objValue);



			}
			break;
			case "counterOverflowTextAppearance": {


		setCounterOverflowTextAppearance(objValue);



			}
			break;
			case "counterTextAppearance": {


		setCounterTextAppearance(objValue);



			}
			break;
			case "errorTextAppearance": {


		setErrorTextAppearance(objValue);



			}
			break;
			case "helperTextTextAppearance": {


		setHelperTextTextAppearance(objValue);



			}
			break;
			case "prefixTextAppearance": {


		setPrefixTextAppearance(objValue);



			}
			break;
			case "suffixTextAppearance": {


		setSuffixTextAppearance(objValue);



			}
			break;
			case "boxPadding": {


		setBoxPadding(objValue);



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
			case "hint": {
return getHint();			}
			case "endIconDrawable": {
return getEndIconDrawable();			}
			case "startIconDrawable": {
return getStartIconDrawable();			}
			case "counterMaxLength": {
return getCounterMaxLength();			}
			case "counterOverflowTextColor": {
return getCounterOverflowTextColor();			}
			case "counterTextColor": {
return getCounterTextColor();			}
			case "hintTextColor": {
return getHintTextColor();			}
			case "placeholderTextColor": {
return getPlaceholderTextColor();			}
			case "prefixTextColor": {
return getPrefixTextColor();			}
			case "suffixTextColor": {
return getSuffixTextColor();			}
			case "errorIconDrawable": {
return getErrorIconDrawable();			}
			case "endIconMode": {
return getEndIconMode();			}
			case "boxStrokeErrorColor": {
return getBoxStrokeErrorColor();			}
		}
		return null;
	}


	@Override
    public Object asNativeWidget() {
        return uiView;
    }
    public native boolean checkIosVersion(String v) /*-[
		return ([[[UIDevice currentDevice] systemVersion] compare:v options:NSNumericSearch] == NSOrderedDescending);
	]-*/;
    
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
	


	private IWidget suffixTextView;
	private IWidget prefixTextView;
	private HasWidgets editTextHolder;
	private IWidget mainWidget;
	private IWidget endIcon;
	private IWidget startIcon;
	private IWidget counterView;
	private IWidget hintView;
	private boolean counterEnabled;
	private IWidget editText;
	private int maxLength = -1;
	private String placeholderText;
	private Object placeholderTextColor;
	private Object counterTextColor;
	private Object counterOverflowTextColor;
	private boolean hintEnabled = true;
	private boolean helperTextEnabled;
	private IWidget helperTextView;
	private boolean errorEnabled;
	private IWidget errorTextView;
	private IWidget errorIcon;
	private Object errorIconDrawable;
	private int endIconMode = 0;
	private Object endIconDrawable;
	private int boxBackgroundMode;
	private IWidget innerLayout;
	private Object boxStrokeErrorColor;
	private boolean enabled = true;
	private Object boxStrokeColor = "#000";
	private Object counterOverflowTextAppearance;
	private Object counterTextAppearance;

	private boolean preSetChildAttribute(IWidget w, WidgetAttribute key, String strValue, Object objValue) {
		return false;
	}
	
	private void setSuffixText(Object objValue) {
		suffixTextView.setAttribute("text", objValue, true);
		
	}
	
	private void setPrefixText(Object objValue) {
		prefixTextView.setAttribute("text", objValue, true);
	}	
	
		
	private void nativeCreate(Map<String, Object> params) {
		String layout = "@layout/design_textinputlayout";
		IWidget template = (IWidget) quickConvert(layout, "template");
		IWidget widget = template.loadLazyWidgets(this.getParent());
		linearLayout = (LinearLayout) widget.asWidget();
		uiView =  widget.asNativeWidget();
		
		suffixTextView = (IWidget) widget.findWidgetById("@+id/textinput_suffix_text");
		prefixTextView= (IWidget) widget.findWidgetById("@+id/textinput_prefix_text");
		editTextHolder= (HasWidgets) widget.findWidgetById("@+id/editTextHolder");
		endIcon= (IWidget) widget.findWidgetById("@+id/text_input_end_icon");
		startIcon= (IWidget) widget.findWidgetById("@+id/text_input_start_icon");
		counterView = (IWidget) widget.findWidgetById("@+id/counter_view");
		hintView = (IWidget) widget.findWidgetById("@+id/hint");
		helperTextView = (IWidget) widget.findWidgetById("@+id/helperText_view");
		errorTextView = (IWidget) widget.findWidgetById("@+id/error_view");
		errorIcon = (IWidget) widget.findWidgetById("@+id/text_input_error_icon");
		innerLayout = (IWidget) widget.findWidgetById("@+id/inputFrame");
		
		mainWidget = widget;
		registerForAttributeCommandChain("hint");
	}

	@Override
	public void initialized() {
		super.initialized();
		if (editTextHolder.getWidgets().size() > 0) {
			editText = editTextHolder.get(0);
			r.android.text.TextWatcher oldTextWatcher = (r.android.text.TextWatcher) editText.getAttribute("onTextChange", true);
			r.android.text.TextWatcher textWatcher = new r.android.text.TextWatcher() {
				@Override
				public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				}

				@Override
				public void onTextChanged(CharSequence s, int start, int before, int count) {
					if (oldTextWatcher != null) {
						oldTextWatcher.onTextChanged(s, start, before, count);
					}
					if (updateViews(s)) {
						getFragment().remeasure();
					}
				}

				@Override
				public void afterTextChanged(r.android.text.Editable s) {
				}
			};
			editText.setAttribute("onTextChange", textWatcher, true);
			
			
			updateViews((String) editText.getAttribute("text", true));
			syncBackground();
		}
	}

	@Override
	public com.ashera.widget.HasWidgets getCompositeLeaf(IWidget w) {
		if (EditText.class.isAssignableFrom(w.getViewClass())) {
			return editTextHolder;
		}
		return super.getCompositeLeaf(w);
	}
	
	
	private void setEndIconDrawable(Object objValue) {
		this.endIconDrawable = objValue;
		if (endIconMode == -1 && objValue != null) {
			setEndIconInternal(objValue, true);
		}
	}

	public void setEndIconInternal(Object objValue, boolean skipConvert) {
		endIcon.setVisible(true);
		endIcon.setAttribute("src", objValue, skipConvert);
		endIcon.requestLayout();
	}
	
	private void setStartIconDrawable(Object objValue) {
		startIcon.setVisible(true);
		startIcon.setAttribute("src", objValue, true);
		startIcon.requestLayout();
	}
	
	private Object getEndIconDrawable() {
		return endIcon.getAttribute("src", true);
	}

	private Object getStartIconDrawable() {
		return startIcon.getAttribute("src", true);
	}

	
	private void setCounterEnabled(Object objValue) {
		counterEnabled = (boolean) objValue;
		counterView.setVisible(counterEnabled);
		counterView.requestLayout();
	}
	
	
	private void setCounterMaxLength(Object objValue) {
		this.maxLength = (int) objValue;
	}

	private Object getCounterMaxLength() {
		return maxLength;
	}
	
	private boolean updateViews(CharSequence s) {
		boolean remeasure = false;
		if (counterEnabled) {
			StringBuilder b = new StringBuilder(s.length() + ""); 
			if (maxLength != -1) {
				b.append("/" + maxLength);
				
				
				if (s.length() > maxLength) {
					if (counterOverflowTextAppearance != null) {
						counterView.setAttribute("textAppearance", counterOverflowTextAppearance, true);
						counterView.requestLayout();
						remeasure = true;
					}
					if (counterOverflowTextColor != null) {
						counterView.setAttribute("textColor", counterOverflowTextColor, true);
					}
				} else {
					if (counterTextAppearance != null && counterOverflowTextAppearance != null) {
						counterView.setAttribute("textAppearance", counterTextAppearance, true);
						counterView.requestLayout();
						remeasure = true;
					}
					if (counterOverflowTextColor != null) {
						if (counterTextColor == null) {
							counterView.setAttribute("textColor", "#000", false);
						} else {
							counterView.setAttribute("textColor", counterTextColor, true);
						}
					}
				}
			}
			
			counterView.setAttribute("text", b.toString(), true);
		}
		
		if (editText != null) {
			if (placeholderText != null) {
				editText.setAttribute("hint", placeholderText, true);
			}
			
			if (placeholderTextColor != null) {
				editText.setAttribute("textColorHint", placeholderTextColor, true);
			}
			
			if (hintEnabled) {
				if (s == null || s.equals("")) {
					hintView.setVisible(false);
					((View) hintView.asWidget()).setVisibility(View.INVISIBLE);
				} else {
					hintView.setVisible(true);
				}
			}


			if (hintEnabled) {
				View hintAView = (View) hintView.asWidget();
				hintAView.measure(0, 0);
				int hintMeasuredHeight = hintAView.getMeasuredHeight();
				int hintMeasuredWidth = hintAView.getMeasuredWidth();
				int editTextPaddingTop = ((View) editText.asWidget()).getPaddingTop();
				if (boxBackgroundMode != 2) {
					if (hintMeasuredWidth > 0 && hintMeasuredHeight > editTextPaddingTop) {
						hintMeasuredHeight = editTextPaddingTop;
					}

					hintView.setAttribute("layout_marginBottom", hintMeasuredHeight * -1, true);
				} else {
					//if (hintMeasuredWidth > 0) {
						hintView.setAttribute("layout_marginBottom", hintMeasuredHeight * -1/2, true);
					//} else {
					//	hintView.setAttribute("layout_marginBottom", hintMeasuredHeight * -1, true);
					//}
				}
				if (hintMeasuredWidth > 0) {
					hintView.setAttribute("layout_marginStart", ((View) editText.asWidget()).getPaddingStart(), true);
				}
			}
			
			editText.setAttribute("enabled", enabled, true);

			// end icon mode
			if (endIconMode == 1) {
				editText.setAttribute("password", endIconMode == 1, true);
			}
			if (endIconMode == 3) {
				editText.invokeMethod("setDataObserver", new r.android.database.DataSetObserver() {
					@Override
					public void onChanged() {
						updateIconState(false);
					}
				});
				
				editText.setAttribute("onDismiss", new AutoCompleteTextView.OnDismissListener() {
					@Override
					public void onDismiss() {
						updateIconState(true);
					}
				}, true);
				
				editText.setAttribute("onFocusChange", new View.OnFocusChangeListener() {
					@Override
					public void onFocusChange(View v, boolean hasFocus) {
						if (hasFocus) {
							editText.setAttribute("showDropDown", true, true);
						}
					}
					
				}, true);
			}
			
			editText.requestLayout();
		}
		
		if (boxBackgroundMode == 2) {
			String errorText = (String) errorTextView.getAttribute("text", true);
			if (errorEnabled && errorText != null && !errorText.isEmpty()) {
				innerLayout.setAttribute("borderColor", boxStrokeErrorColor, true);			
			} else {
				innerLayout.setAttribute("borderColor", boxStrokeColor, !(boxStrokeColor instanceof String));
			}
		}


		return remeasure;
	}

	
	private void postSetAttribute(WidgetAttribute key, String strValue, Object objValue,
			ILifeCycleDecorator decorator) {
		if (isInitialised() && editText != null) {
			updateViews((String) editText.getAttribute("text", true));
		}
	}
	
	private void setCounterTextColor(Object objValue) {
		counterTextColor = objValue;
		counterView.setAttribute("textColor", objValue, true);
	}

	private void setCounterOverflowTextColor(Object objValue) {
		counterOverflowTextColor = objValue;
	}

	private Object getCounterTextColor() {
		return counterTextColor;
	}

	private Object getCounterOverflowTextColor() {
		return counterOverflowTextColor;
	}
	

	private void setPlaceholderTextColor(Object objValue) {
		placeholderTextColor = objValue;
	}

	private void setPlaceholderText(Object objValue) {
		placeholderText = (String) objValue;
	}

	private void setSuffixTextColor(Object objValue) {
		suffixTextView.setAttribute("textColor", objValue, true);
	}

	private void setPrefixTextColor(Object objValue) {
		prefixTextView.setAttribute("textColor", objValue, true);
	}	


	private Object getSuffixTextColor() {
		return suffixTextView.getAttribute("textColor", true);
	}

	private Object getPrefixTextColor() {
		return prefixTextView.getAttribute("textColor", true);
	}

	private Object getPlaceholderTextColor() {
		return placeholderTextColor;
	}
	
	
	private void setHint(Object objValue) {
		placeholderText = (String) objValue;
		hintView.setAttribute("text", objValue, true);
		
	}

	private Object getHint() {
		return hintView.getAttribute("text", true);
	}

	private Object getHintTextColor() {
		return hintView.getAttribute("textColor", true);
	}
	
	private void setHintTextColor(Object objValue) {
		hintView.setAttribute("textColor", objValue, true);		
	}

	private void setHintEnabled(Object objValue) {
		hintEnabled = (boolean)	objValue;
		hintView.setVisible(hintEnabled);
		hintView.requestLayout();
	}
	
	private void setStartIconOnLongClickListener(View.OnLongClickListener objValue) {
		startIcon.setAttribute("onLongClick", objValue, true);
	}

	private void setStartIconOnClickListener(View.OnClickListener objValue) {
		startIcon.setAttribute("onClick", objValue, true);
	}

	private void setEndIconOnLongClickListener(View.OnLongClickListener objValue) {
		endIcon.setAttribute("onLongClick", objValue, true);
	}

	private void setEndIconOnClickListener(View.OnClickListener objValue) {
		endIcon.setAttribute("onClick", objValue, true);
	}


	private void setEndIconVisible(Object objValue) {
		endIcon.setVisible((boolean) objValue);
		endIcon.requestLayout();
	}

	private void setStartIconVisible(Object objValue) {
		startIcon.setVisible((boolean) objValue);
		startIcon.requestLayout();
	}

	
	private void setHelperText(Object objValue) {
		setHelperTextEnabled(true);
		helperTextView.setAttribute("text", objValue, true);
	}

	private void setHelperTextColor(Object objValue) {
		helperTextView.setAttribute("textColor", objValue, true);
	}


	private void setHelperTextEnabled(Object objValue) {
		helperTextEnabled = (boolean) objValue;
		helperTextView.setVisible(helperTextEnabled);
		helperTextView.requestLayout();
	}
	
	
	private void setErrorTextColor(Object objValue) {
		errorTextView.setAttribute("textColor", objValue, true);
	}

	private void setErrorEnabled(Object objValue) {
		errorEnabled = (boolean) objValue;
		errorTextView.setVisible(errorEnabled);
		errorTextView.requestLayout();
	}

	private void setMyError(Object objValue) {
		setErrorEnabled(true);
		errorTextView.setAttribute("text", objValue, true);
		errorTextView.requestLayout();
		if (errorIconDrawable != null) {
			String text = (String) objValue;
			errorIcon.setVisible(text != null && !text.isEmpty());
			errorIcon.requestLayout();
		}
		
	}
	
	private void setErrorIconOnLongClickListener(View.OnLongClickListener objValue) {
		errorIcon.setAttribute("onLongClick", objValue, true);
	}

	private void setErrorIconOnClickListener(View.OnClickListener objValue) {
		errorIcon.setAttribute("onClick", objValue, true);
	}

	private void setErrorIconDrawable(Object objValue) {
		this.errorIconDrawable = objValue;
		errorIcon.setAttribute("src", objValue, true);
		String text = (String) errorTextView.getAttribute("text", true);
		errorIcon.setVisible(text != null && !text.isEmpty());
		errorIcon.requestLayout();
	}

	private Object getErrorIconDrawable() {
		return errorIcon.getAttribute("src", true);
	}
	
	
	private void setEndIconMode(Object objValue) {
		endIconMode = (int) objValue;
		
		switch (endIconMode) {
		case -1:
			setEndIconDrawable(this.endIconDrawable);	
			break;
		case 0:
			setEndIconOnClickListener(null);
			break;
		case 1:
			setEndIconInternal("@drawable/password_eye", false);

			setEndIconOnClickListener(new View.OnClickListener() {
				boolean password = false;
				@Override
				public void onClick(View v) {
					if (password) {
						setEndIconInternal("@drawable/password_eye", false);	
					} else {
						setEndIconInternal("@drawable/password_eye_off", false);
					}
					
					if (editText != null) {
						editText.setAttribute("password", password, true);
					}			
					
					password = !password;
				}
			});
			break;
		case 2:
			setEndIconInternal("@drawable/icon_end_clear", false);
			setEndIconOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					if (editText != null) {
						editText.setAttribute("text", "", true);
					}
				}
			});
			break;
		case 3:
			endIcon.setAttribute("onClick", new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					if (popUpShowing) {
						editText.setAttribute("showDropDown", false, true);
					} else {
						editText.setAttribute("setFocus", true, true);
						editText.setAttribute("showDropDown", true, true);
					}
				}
			}, true);

			updateIconState(true);
			break;
		default:
			break;
		}
		endIcon.requestLayout();
		setEndIconVisible(endIconMode != 0);
	}
	
	private Object getEndIconMode() {
		return endIconMode;
	}
	
	
	private void setBoxBackgroundColorStateList(Object objValue) {
		if (boxBackgroundMode != 0) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			r.android.graphics.drawable.Drawable stateListDrawable = ViewImpl.getDrawable(colorStateList);
			innerLayout.setAttribute("background", stateListDrawable, true);
			
			if (boxBackgroundMode == 1) {
				mainWidget.setAttribute("background", stateListDrawable, true);
			}
			
			if (isInitialised()) {
				syncBackground();
			}
		}
	}


	private void setBoxBackgroundMode(Object objValue) {
		this.boxBackgroundMode = (int) objValue;
		
		switch (boxBackgroundMode) {
		case 0:			
			break;
		case 1:			
			break;
		case 2:
			innerLayout.setAttribute("borderWidth", "1dp", false);
			if (isPaddingFixNeeded()) {
				innerLayout.setAttribute("padding", "1dp", false);
			}
			break;
		default:
			break;
		}
		
	}

	private void setBoxStrokeWidth(Object objValue) {
		if (boxBackgroundMode == 2) {
			innerLayout.setAttribute("borderWidth", objValue, true);
			if (isPaddingFixNeeded()) {
				innerLayout.setAttribute("padding", objValue, true);
			}
		}
	}

	private void setBoxStrokeErrorColor(Object objValue) {
		boxStrokeErrorColor = objValue;
	}

	private void setBoxCornerRadiusBottomStart(Object objValue) {
		innerLayout.setAttribute("borderBottomLeftRadius", objValue, true);
		fixBorderRadiusPadding(objValue);
	}

	private void setBoxCornerRadiusBottomEnd(Object objValue) {
		innerLayout.setAttribute("borderBottomRightRadius", objValue, true);
		fixBorderRadiusPadding(objValue);
	}

	private void setBoxCornerRadiusTopEnd(Object objValue) {
		innerLayout.setAttribute("borderTopRightRadius", objValue, true);
		fixBorderRadiusPadding(objValue);
	}

	private void setBoxCornerRadiusTopStart(Object objValue) {
		innerLayout.setAttribute("borderTopLeftRadius", objValue, true);
		fixBorderRadiusPadding(objValue);
	}

	private void fixBorderRadiusPadding(Object objValue) {
		if (isPaddingFixNeeded()) {
			innerLayout.setAttribute("padding", (int)((float)objValue/2), true);
		}
	}


	private Object getBoxStrokeErrorColor() {
		return boxStrokeErrorColor;
	}
	
	private void setEnabled(Object objValue) {
		this.enabled = (boolean) objValue;
	}
	
	
	private void setBoxStrokeColorStateList(Object objValue) {
		boxStrokeColor = objValue;
	}
	
	private boolean popUpShowing;
	private void updateIconState(boolean hide) {
		popUpShowing = !hide;
		if (endIconMode == 3) {
			if (!hide) {
				setEndIconInternal("@drawable/icon_end_menu_up", false);	
			} else {
				setEndIconInternal("@drawable/icon_end_menu_down", false);	
			}
		}
	}
	
	
	private void setHintTextAppearance(Object objValue) {
		hintView.setAttribute("textAppearance", objValue, true);
		hintView.requestLayout();
	}
	
	private void setSuffixTextAppearance(Object objValue) {
		suffixTextView.setAttribute("textAppearance", objValue, true);
		suffixTextView.requestLayout();
	}

	private void setCounterOverflowTextAppearance(Object objValue) {
		counterOverflowTextAppearance = objValue;
	}

	private void setPrefixTextAppearance(Object objValue) {
		prefixTextView.setAttribute("textAppearance", objValue, true);	
		prefixTextView.requestLayout();
	}

	private void setHelperTextTextAppearance(Object objValue) {
		helperTextView.setAttribute("textAppearance", objValue, true);	
		helperTextView.requestLayout();
	}

	private void setErrorTextAppearance(Object objValue) {
		errorTextView.setAttribute("textAppearance", objValue, true);
		errorTextView.requestLayout();
	}

	private void setCounterTextAppearance(Object objValue) {
		counterTextAppearance = objValue;
		counterView.setAttribute("textAppearance", objValue, true);
		counterView.requestLayout();
	}


	private void setError(Object object) {
	}

	@Override
	public String getTextEntered() {
		if (editText == null) {
			return "";
		}
		return (String) editText.getAttribute("text", true);
	}

	@Override
	public boolean isViewVisible() {
		return linearLayout.getVisibility() == View.VISIBLE;
	}

	@Override
	public void focus() {
		if (editText == null) {
			return;
		}
		editText.setAttribute("setFocus", true, true);
	}
	
	private void setBoxPadding(Object objValue) {
		innerLayout.setAttribute("padding", objValue, true);		
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
		    activity.sendEventMessage(obj);
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
		    activity.sendEventMessage(obj);
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
			linearLayout.setId((int) quickConvert(id, "id"));
		}
	}
	
    
    @Override
    public void setVisible(boolean b) {
        ((View)asWidget()).setVisibility(b ? View.VISIBLE : View.GONE);
    }

	
private TextInputLayoutCommandBuilder builder;
private TextInputLayoutBean bean;
public Object getPlugin(String plugin) {
	return WidgetFactory.getAttributable(plugin).newInstance(this);
}
public TextInputLayoutBean getBean() {
	if (bean == null) {
		bean = new TextInputLayoutBean();
	}
	return bean;
}
public TextInputLayoutCommandBuilder getBuilder() {
	if (builder == null) {
		builder = new TextInputLayoutCommandBuilder();
	}
	return builder;
}


public  class TextInputLayoutCommandBuilder extends com.ashera.layout.ViewGroupImpl.ViewGroupCommandBuilder <TextInputLayoutCommandBuilder> {
    public TextInputLayoutCommandBuilder() {
	}
	
	public TextInputLayoutCommandBuilder execute(boolean setter) {
		if (setter) {
			executeCommand(command, null, IWidget.COMMAND_EXEC_SETTER_METHOD);
			getFragment().remeasure();
		}
		executeCommand(command, null, IWidget.COMMAND_EXEC_GETTER_METHOD);
return this;	}

public TextInputLayoutCommandBuilder setHintTextFormat(String value) {
	Map<String, Object> attrs = initCommand("hintTextFormat");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder tryGetHint() {
	Map<String, Object> attrs = initCommand("hint");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getHint() {
	Map<String, Object> attrs = initCommand("hint");
	return attrs.get("commandReturnValue");
}
public TextInputLayoutCommandBuilder setHint(String value) {
	Map<String, Object> attrs = initCommand("hint");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setPrefixText(String value) {
	Map<String, Object> attrs = initCommand("prefixText");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setSuffixText(String value) {
	Map<String, Object> attrs = initCommand("suffixText");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder tryGetEndIconDrawable() {
	Map<String, Object> attrs = initCommand("endIconDrawable");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getEndIconDrawable() {
	Map<String, Object> attrs = initCommand("endIconDrawable");
	return attrs.get("commandReturnValue");
}
public TextInputLayoutCommandBuilder setEndIconDrawable(String value) {
	Map<String, Object> attrs = initCommand("endIconDrawable");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder tryGetStartIconDrawable() {
	Map<String, Object> attrs = initCommand("startIconDrawable");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getStartIconDrawable() {
	Map<String, Object> attrs = initCommand("startIconDrawable");
	return attrs.get("commandReturnValue");
}
public TextInputLayoutCommandBuilder setStartIconDrawable(String value) {
	Map<String, Object> attrs = initCommand("startIconDrawable");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setCounterEnabled(boolean value) {
	Map<String, Object> attrs = initCommand("counterEnabled");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder tryGetCounterMaxLength() {
	Map<String, Object> attrs = initCommand("counterMaxLength");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getCounterMaxLength() {
	Map<String, Object> attrs = initCommand("counterMaxLength");
	return attrs.get("commandReturnValue");
}
public TextInputLayoutCommandBuilder setCounterMaxLength(int value) {
	Map<String, Object> attrs = initCommand("counterMaxLength");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder tryGetCounterOverflowTextColor() {
	Map<String, Object> attrs = initCommand("counterOverflowTextColor");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getCounterOverflowTextColor() {
	Map<String, Object> attrs = initCommand("counterOverflowTextColor");
	return attrs.get("commandReturnValue");
}
public TextInputLayoutCommandBuilder setCounterOverflowTextColor(String value) {
	Map<String, Object> attrs = initCommand("counterOverflowTextColor");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder tryGetCounterTextColor() {
	Map<String, Object> attrs = initCommand("counterTextColor");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getCounterTextColor() {
	Map<String, Object> attrs = initCommand("counterTextColor");
	return attrs.get("commandReturnValue");
}
public TextInputLayoutCommandBuilder setCounterTextColor(String value) {
	Map<String, Object> attrs = initCommand("counterTextColor");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setHintEnabled(boolean value) {
	Map<String, Object> attrs = initCommand("hintEnabled");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder tryGetHintTextColor() {
	Map<String, Object> attrs = initCommand("hintTextColor");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getHintTextColor() {
	Map<String, Object> attrs = initCommand("hintTextColor");
	return attrs.get("commandReturnValue");
}
public TextInputLayoutCommandBuilder setHintTextColor(String value) {
	Map<String, Object> attrs = initCommand("hintTextColor");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setPlaceholderText(String value) {
	Map<String, Object> attrs = initCommand("placeholderText");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder tryGetPlaceholderTextColor() {
	Map<String, Object> attrs = initCommand("placeholderTextColor");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getPlaceholderTextColor() {
	Map<String, Object> attrs = initCommand("placeholderTextColor");
	return attrs.get("commandReturnValue");
}
public TextInputLayoutCommandBuilder setPlaceholderTextColor(String value) {
	Map<String, Object> attrs = initCommand("placeholderTextColor");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder tryGetPrefixTextColor() {
	Map<String, Object> attrs = initCommand("prefixTextColor");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getPrefixTextColor() {
	Map<String, Object> attrs = initCommand("prefixTextColor");
	return attrs.get("commandReturnValue");
}
public TextInputLayoutCommandBuilder setPrefixTextColor(String value) {
	Map<String, Object> attrs = initCommand("prefixTextColor");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder tryGetSuffixTextColor() {
	Map<String, Object> attrs = initCommand("suffixTextColor");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getSuffixTextColor() {
	Map<String, Object> attrs = initCommand("suffixTextColor");
	return attrs.get("commandReturnValue");
}
public TextInputLayoutCommandBuilder setSuffixTextColor(String value) {
	Map<String, Object> attrs = initCommand("suffixTextColor");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setEndIconOnClick(String value) {
	Map<String, Object> attrs = initCommand("endIconOnClick");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setEndIconOnLongClick(String value) {
	Map<String, Object> attrs = initCommand("endIconOnLongClick");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setStartIconOnClick(String value) {
	Map<String, Object> attrs = initCommand("startIconOnClick");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setStartIconOnLongClick(String value) {
	Map<String, Object> attrs = initCommand("startIconOnLongClick");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setStartIconVisible(boolean value) {
	Map<String, Object> attrs = initCommand("startIconVisible");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setEndIconVisible(boolean value) {
	Map<String, Object> attrs = initCommand("endIconVisible");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setHelperTextEnabled(boolean value) {
	Map<String, Object> attrs = initCommand("helperTextEnabled");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setHelperTextColor(String value) {
	Map<String, Object> attrs = initCommand("helperTextColor");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setHelperText(String value) {
	Map<String, Object> attrs = initCommand("helperText");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setError(String value) {
	Map<String, Object> attrs = initCommand("error");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setErrorEnabled(boolean value) {
	Map<String, Object> attrs = initCommand("errorEnabled");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setErrorTextColor(String value) {
	Map<String, Object> attrs = initCommand("errorTextColor");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder tryGetErrorIconDrawable() {
	Map<String, Object> attrs = initCommand("errorIconDrawable");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getErrorIconDrawable() {
	Map<String, Object> attrs = initCommand("errorIconDrawable");
	return attrs.get("commandReturnValue");
}
public TextInputLayoutCommandBuilder setErrorIconDrawable(String value) {
	Map<String, Object> attrs = initCommand("errorIconDrawable");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setErrorIconOnClick(String value) {
	Map<String, Object> attrs = initCommand("errorIconOnClick");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setErrorIconOnLongClick(String value) {
	Map<String, Object> attrs = initCommand("errorIconOnLongClick");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder tryGetEndIconMode() {
	Map<String, Object> attrs = initCommand("endIconMode");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getEndIconMode() {
	Map<String, Object> attrs = initCommand("endIconMode");
	return attrs.get("commandReturnValue");
}
public TextInputLayoutCommandBuilder setEndIconMode(String value) {
	Map<String, Object> attrs = initCommand("endIconMode");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setBoxBackgroundMode(String value) {
	Map<String, Object> attrs = initCommand("boxBackgroundMode");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setBoxBackgroundColor(String value) {
	Map<String, Object> attrs = initCommand("boxBackgroundColor");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setBoxCornerRadiusTopStart(String value) {
	Map<String, Object> attrs = initCommand("boxCornerRadiusTopStart");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setBoxCornerRadiusTopEnd(String value) {
	Map<String, Object> attrs = initCommand("boxCornerRadiusTopEnd");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setBoxCornerRadiusBottomEnd(String value) {
	Map<String, Object> attrs = initCommand("boxCornerRadiusBottomEnd");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setBoxCornerRadiusBottomStart(String value) {
	Map<String, Object> attrs = initCommand("boxCornerRadiusBottomStart");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder tryGetBoxStrokeErrorColor() {
	Map<String, Object> attrs = initCommand("boxStrokeErrorColor");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getBoxStrokeErrorColor() {
	Map<String, Object> attrs = initCommand("boxStrokeErrorColor");
	return attrs.get("commandReturnValue");
}
public TextInputLayoutCommandBuilder setBoxStrokeErrorColor(String value) {
	Map<String, Object> attrs = initCommand("boxStrokeErrorColor");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setBoxStrokeWidth(String value) {
	Map<String, Object> attrs = initCommand("boxStrokeWidth");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setBoxStrokeColor(String value) {
	Map<String, Object> attrs = initCommand("boxStrokeColor");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setEnabled(boolean value) {
	Map<String, Object> attrs = initCommand("enabled");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setHintTextAppearance(String value) {
	Map<String, Object> attrs = initCommand("hintTextAppearance");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setCounterOverflowTextAppearance(String value) {
	Map<String, Object> attrs = initCommand("counterOverflowTextAppearance");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setCounterTextAppearance(String value) {
	Map<String, Object> attrs = initCommand("counterTextAppearance");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setErrorTextAppearance(String value) {
	Map<String, Object> attrs = initCommand("errorTextAppearance");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setHelperTextTextAppearance(String value) {
	Map<String, Object> attrs = initCommand("helperTextTextAppearance");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setPrefixTextAppearance(String value) {
	Map<String, Object> attrs = initCommand("prefixTextAppearance");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setSuffixTextAppearance(String value) {
	Map<String, Object> attrs = initCommand("suffixTextAppearance");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandBuilder setBoxPadding(String value) {
	Map<String, Object> attrs = initCommand("boxPadding");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
}
public class TextInputLayoutBean extends com.ashera.layout.ViewGroupImpl.ViewGroupBean{
		public TextInputLayoutBean() {
			super(TextInputLayoutImpl.this);
		}
public void setHintTextFormat(String value) {
	getBuilder().reset().setHintTextFormat(value).execute(true);
}

public Object getHint() {
	return getBuilder().reset().tryGetHint().execute(false).getHint(); 
}
public void setHint(String value) {
	getBuilder().reset().setHint(value).execute(true);
}

public void setPrefixText(String value) {
	getBuilder().reset().setPrefixText(value).execute(true);
}

public void setSuffixText(String value) {
	getBuilder().reset().setSuffixText(value).execute(true);
}

public Object getEndIconDrawable() {
	return getBuilder().reset().tryGetEndIconDrawable().execute(false).getEndIconDrawable(); 
}
public void setEndIconDrawable(String value) {
	getBuilder().reset().setEndIconDrawable(value).execute(true);
}

public Object getStartIconDrawable() {
	return getBuilder().reset().tryGetStartIconDrawable().execute(false).getStartIconDrawable(); 
}
public void setStartIconDrawable(String value) {
	getBuilder().reset().setStartIconDrawable(value).execute(true);
}

public void setCounterEnabled(boolean value) {
	getBuilder().reset().setCounterEnabled(value).execute(true);
}

public Object getCounterMaxLength() {
	return getBuilder().reset().tryGetCounterMaxLength().execute(false).getCounterMaxLength(); 
}
public void setCounterMaxLength(int value) {
	getBuilder().reset().setCounterMaxLength(value).execute(true);
}

public Object getCounterOverflowTextColor() {
	return getBuilder().reset().tryGetCounterOverflowTextColor().execute(false).getCounterOverflowTextColor(); 
}
public void setCounterOverflowTextColor(String value) {
	getBuilder().reset().setCounterOverflowTextColor(value).execute(true);
}

public Object getCounterTextColor() {
	return getBuilder().reset().tryGetCounterTextColor().execute(false).getCounterTextColor(); 
}
public void setCounterTextColor(String value) {
	getBuilder().reset().setCounterTextColor(value).execute(true);
}

public void setHintEnabled(boolean value) {
	getBuilder().reset().setHintEnabled(value).execute(true);
}

public Object getHintTextColor() {
	return getBuilder().reset().tryGetHintTextColor().execute(false).getHintTextColor(); 
}
public void setHintTextColor(String value) {
	getBuilder().reset().setHintTextColor(value).execute(true);
}

public void setPlaceholderText(String value) {
	getBuilder().reset().setPlaceholderText(value).execute(true);
}

public Object getPlaceholderTextColor() {
	return getBuilder().reset().tryGetPlaceholderTextColor().execute(false).getPlaceholderTextColor(); 
}
public void setPlaceholderTextColor(String value) {
	getBuilder().reset().setPlaceholderTextColor(value).execute(true);
}

public Object getPrefixTextColor() {
	return getBuilder().reset().tryGetPrefixTextColor().execute(false).getPrefixTextColor(); 
}
public void setPrefixTextColor(String value) {
	getBuilder().reset().setPrefixTextColor(value).execute(true);
}

public Object getSuffixTextColor() {
	return getBuilder().reset().tryGetSuffixTextColor().execute(false).getSuffixTextColor(); 
}
public void setSuffixTextColor(String value) {
	getBuilder().reset().setSuffixTextColor(value).execute(true);
}

public void setEndIconOnClick(String value) {
	getBuilder().reset().setEndIconOnClick(value).execute(true);
}

public void setEndIconOnLongClick(String value) {
	getBuilder().reset().setEndIconOnLongClick(value).execute(true);
}

public void setStartIconOnClick(String value) {
	getBuilder().reset().setStartIconOnClick(value).execute(true);
}

public void setStartIconOnLongClick(String value) {
	getBuilder().reset().setStartIconOnLongClick(value).execute(true);
}

public void setStartIconVisible(boolean value) {
	getBuilder().reset().setStartIconVisible(value).execute(true);
}

public void setEndIconVisible(boolean value) {
	getBuilder().reset().setEndIconVisible(value).execute(true);
}

public void setHelperTextEnabled(boolean value) {
	getBuilder().reset().setHelperTextEnabled(value).execute(true);
}

public void setHelperTextColor(String value) {
	getBuilder().reset().setHelperTextColor(value).execute(true);
}

public void setHelperText(String value) {
	getBuilder().reset().setHelperText(value).execute(true);
}

public void setError(String value) {
	getBuilder().reset().setError(value).execute(true);
}

public void setErrorEnabled(boolean value) {
	getBuilder().reset().setErrorEnabled(value).execute(true);
}

public void setErrorTextColor(String value) {
	getBuilder().reset().setErrorTextColor(value).execute(true);
}

public Object getErrorIconDrawable() {
	return getBuilder().reset().tryGetErrorIconDrawable().execute(false).getErrorIconDrawable(); 
}
public void setErrorIconDrawable(String value) {
	getBuilder().reset().setErrorIconDrawable(value).execute(true);
}

public void setErrorIconOnClick(String value) {
	getBuilder().reset().setErrorIconOnClick(value).execute(true);
}

public void setErrorIconOnLongClick(String value) {
	getBuilder().reset().setErrorIconOnLongClick(value).execute(true);
}

public Object getEndIconMode() {
	return getBuilder().reset().tryGetEndIconMode().execute(false).getEndIconMode(); 
}
public void setEndIconMode(String value) {
	getBuilder().reset().setEndIconMode(value).execute(true);
}

public void setBoxBackgroundMode(String value) {
	getBuilder().reset().setBoxBackgroundMode(value).execute(true);
}

public void setBoxBackgroundColor(String value) {
	getBuilder().reset().setBoxBackgroundColor(value).execute(true);
}

public void setBoxCornerRadiusTopStart(String value) {
	getBuilder().reset().setBoxCornerRadiusTopStart(value).execute(true);
}

public void setBoxCornerRadiusTopEnd(String value) {
	getBuilder().reset().setBoxCornerRadiusTopEnd(value).execute(true);
}

public void setBoxCornerRadiusBottomEnd(String value) {
	getBuilder().reset().setBoxCornerRadiusBottomEnd(value).execute(true);
}

public void setBoxCornerRadiusBottomStart(String value) {
	getBuilder().reset().setBoxCornerRadiusBottomStart(value).execute(true);
}

public Object getBoxStrokeErrorColor() {
	return getBuilder().reset().tryGetBoxStrokeErrorColor().execute(false).getBoxStrokeErrorColor(); 
}
public void setBoxStrokeErrorColor(String value) {
	getBuilder().reset().setBoxStrokeErrorColor(value).execute(true);
}

public void setBoxStrokeWidth(String value) {
	getBuilder().reset().setBoxStrokeWidth(value).execute(true);
}

public void setBoxStrokeColor(String value) {
	getBuilder().reset().setBoxStrokeColor(value).execute(true);
}

public void setEnabled(boolean value) {
	getBuilder().reset().setEnabled(value).execute(true);
}

public void setHintTextAppearance(String value) {
	getBuilder().reset().setHintTextAppearance(value).execute(true);
}

public void setCounterOverflowTextAppearance(String value) {
	getBuilder().reset().setCounterOverflowTextAppearance(value).execute(true);
}

public void setCounterTextAppearance(String value) {
	getBuilder().reset().setCounterTextAppearance(value).execute(true);
}

public void setErrorTextAppearance(String value) {
	getBuilder().reset().setErrorTextAppearance(value).execute(true);
}

public void setHelperTextTextAppearance(String value) {
	getBuilder().reset().setHelperTextTextAppearance(value).execute(true);
}

public void setPrefixTextAppearance(String value) {
	getBuilder().reset().setPrefixTextAppearance(value).execute(true);
}

public void setSuffixTextAppearance(String value) {
	getBuilder().reset().setSuffixTextAppearance(value).execute(true);
}

public void setBoxPadding(String value) {
	getBuilder().reset().setBoxPadding(value).execute(true);
}

}


private TextInputLayoutCommandParamsBuilder paramsBuilder;
private TextInputLayoutParamsBean paramsBean;

public TextInputLayoutParamsBean getParamsBean() {
	if (paramsBean == null) {
		paramsBean = new TextInputLayoutParamsBean();
	}
	return paramsBean;
}
public TextInputLayoutCommandParamsBuilder getParamsBuilder() {
	if (paramsBuilder == null) {
		paramsBuilder = new TextInputLayoutCommandParamsBuilder();
	}
	return paramsBuilder;
}



public class TextInputLayoutParamsBean extends com.ashera.layout.ViewGroupImpl.ViewGroupParamsBean{
public Object getLayoutGravity(IWidget w) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	java.util.Map<String, Object> command = getParamsBuilder().reset().tryGetLayoutGravity().getCommand();
	
	layoutParams.put("layoutParams", command);
	w.executeCommand(layoutParams, null, COMMAND_EXEC_GETTER_METHOD); 
	return getParamsBuilder().getLayoutGravity();
}
public void setLayoutGravity(IWidget w, String value) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	layoutParams.put("layoutParams", getParamsBuilder().reset().setLayoutGravity(value).getCommand());
	w.executeCommand(layoutParams, null, COMMAND_EXEC_SETTER_METHOD);
	w.getFragment().remeasure();
}

public Object getLayoutWeight(IWidget w) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	java.util.Map<String, Object> command = getParamsBuilder().reset().tryGetLayoutWeight().getCommand();
	
	layoutParams.put("layoutParams", command);
	w.executeCommand(layoutParams, null, COMMAND_EXEC_GETTER_METHOD); 
	return getParamsBuilder().getLayoutWeight();
}
public void setLayoutWeight(IWidget w, float value) {
	java.util.Map<String, Object> layoutParams = new java.util.HashMap<String, Object>();
	layoutParams.put("layoutParams", getParamsBuilder().reset().setLayoutWeight(value).getCommand());
	w.executeCommand(layoutParams, null, COMMAND_EXEC_SETTER_METHOD);
	w.getFragment().remeasure();
}

}





public class TextInputLayoutCommandParamsBuilder extends com.ashera.layout.ViewGroupImpl.ViewGroupCommandParamsBuilder<TextInputLayoutCommandParamsBuilder>{
public TextInputLayoutCommandParamsBuilder tryGetLayoutGravity() {
	Map<String, Object> attrs = initCommand("layout_gravity");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getLayoutGravity() {
	Map<String, Object> attrs = initCommand("layout_gravity");
	return attrs.get("commandReturnValue");
}
public TextInputLayoutCommandParamsBuilder setLayoutGravity(String value) {
	Map<String, Object> attrs = initCommand("layout_gravity");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
public TextInputLayoutCommandParamsBuilder tryGetLayoutWeight() {
	Map<String, Object> attrs = initCommand("layout_weight");
	attrs.put("type", "attribute");
	attrs.put("getter", true);
	attrs.put("orderGet", ++orderGet);
return this;}

public Object getLayoutWeight() {
	Map<String, Object> attrs = initCommand("layout_weight");
	return attrs.get("commandReturnValue");
}
public TextInputLayoutCommandParamsBuilder setLayoutWeight(float value) {
	Map<String, Object> attrs = initCommand("layout_weight");
	attrs.put("type", "attribute");
	attrs.put("setter", true);
	attrs.put("orderSet", ++orderSet);

	attrs.put("value", value);
return this;}
}

	//end - body

	private void syncBackground() {
	}
	

	private boolean isPaddingFixNeeded() {
		return false;
	}
}
