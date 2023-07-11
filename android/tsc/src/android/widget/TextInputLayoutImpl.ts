// start - imports

export const enum EndIconMode {
custom = "custom",
none = "none",
password_toggle = "password_toggle",
clear_text = "clear_text",
dropdown_menu = "dropdown_menu",
}
export const enum BoxBackgroundMode {
none = "none",
filled = "filled",
outline = "outline",
}	
import CommandAttr from '../../widget/CommandAttr';
import IWidget from '../../widget/IWidget';
import ILayoutParam from '../../widget/ILayoutParam';
import {plainToClass, Type, Exclude, Expose, Transform} from "class-transformer";
import 'babel-polyfill';
import {Gravity} from '../../widget/TypeConstants';
import {ITranform, TransformerFactory} from '../../widget/TransformerFactory';
import {Event} from '../../app/Event';
import {MotionEvent} from '../../app/MotionEvent';
import {DragEvent} from '../../app/DragEvent';
import {KeyEvent} from '../../app/KeyEvent';
import { ScopedObject } from '../../app/ScopedObject';






























































import {ViewGroupImpl_LayoutParams} from './ViewGroupImpl';

// end - imports
import {ViewGroupImpl} from './ViewGroupImpl';
export abstract class TextInputLayoutImpl<T> extends ViewGroupImpl<T>{
	//start - body
	static initialize() {
    }	
	@Type(() => CommandAttr)
	@Expose({ name: "hint" })
	hint!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "boxStrokeErrorColor" })
	boxStrokeErrorColor!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "boxStrokeWidth" })
	boxStrokeWidth!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "boxStrokeWidthFocused" })
	boxStrokeWidthFocused!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "counterEnabled" })
	counterEnabled!:CommandAttr<boolean>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "counterMaxLength" })
	counterMaxLength!:CommandAttr<number>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "counterOverflowTextAppearance" })
	counterOverflowTextAppearance!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "counterOverflowTextColor" })
	counterOverflowTextColor!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "counterTextAppearance" })
	counterTextAppearance!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "counterTextColor" })
	counterTextColor!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "endIconCheckable" })
	endIconCheckable!:CommandAttr<boolean>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "endIconContentDescription" })
	endIconContentDescription!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "endIconDrawable" })
	endIconDrawable!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "endIconMode" })
	endIconMode!:CommandAttr<EndIconMode>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "endIconTint" })
	endIconTint!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "errorContentDescription" })
	errorContentDescription!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "errorEnabled" })
	errorEnabled!:CommandAttr<boolean>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "errorIconDrawable" })
	errorIconDrawable!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "errorIconTint" })
	errorIconTint!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "errorTextAppearance" })
	errorTextAppearance!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "helperTextEnabled" })
	helperTextEnabled!:CommandAttr<boolean>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "helperTextTextAppearance" })
	helperTextTextAppearance!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "hintAnimationEnabled" })
	hintAnimationEnabled!:CommandAttr<boolean>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "hintEnabled" })
	hintEnabled!:CommandAttr<boolean>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "hintTextAppearance" })
	hintTextAppearance!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "hintTextColor" })
	hintTextColor!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "placeholderTextAppearance" })
	placeholderTextAppearance!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "placeholderTextColor" })
	placeholderTextColor!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "prefixTextAppearance" })
	prefixTextAppearance!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "prefixTextColor" })
	prefixTextColor!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "startIconCheckable" })
	startIconCheckable!:CommandAttr<boolean>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "startIconContentDescription" })
	startIconContentDescription!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "startIconDrawable" })
	startIconDrawable!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "startIconTint" })
	startIconTint!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "suffixTextAppearance" })
	suffixTextAppearance!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "suffixTextColor" })
	suffixTextColor!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "boxBackgroundMode" })
	boxBackgroundMode!:CommandAttr<BoxBackgroundMode>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "boxStrokeColor" })
	boxStrokeColor!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "boxBackgroundColor" })
	boxBackgroundColor!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "boxCornerRadiusTopStart" })
	boxCornerRadiusTopStart!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "boxCornerRadiusTopEnd" })
	boxCornerRadiusTopEnd!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "boxCornerRadiusBottomEnd" })
	boxCornerRadiusBottomEnd!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "boxCornerRadiusBottomStart" })
	boxCornerRadiusBottomStart!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "defaultHintTextColor" })
	defaultHintTextColor!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "errorTextColor" })
	errorTextColor!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "helperTextColor" })
	helperTextColor!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "helperText" })
	helperText!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "error" })
	error!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "placeholderText" })
	placeholderText!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "prefixText" })
	prefixText!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "suffixText" })
	suffixText!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "enabled" })
	enabled!:CommandAttr<boolean>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "startIconOnClick" })
	startIconOnClick!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "startIconOnLongClick" })
	startIconOnLongClick!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "startIconVisible" })
	startIconVisible!:CommandAttr<boolean>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "endIconOnClick" })
	endIconOnClick!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "errorIconOnClick" })
	errorIconOnClick!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "endIconOnLongClick" })
	endIconOnLongClick!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "errorIconOnLongClick" })
	errorIconOnLongClick!:CommandAttr<string>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "endIconVisible" })
	endIconVisible!:CommandAttr<boolean>| undefined;
	@Type(() => CommandAttr)
	@Expose({ name: "endIconActivated" })
	endIconActivated!:CommandAttr<boolean>| undefined;

	@Exclude()
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.hint = undefined;
		this.boxStrokeErrorColor = undefined;
		this.boxStrokeWidth = undefined;
		this.boxStrokeWidthFocused = undefined;
		this.counterEnabled = undefined;
		this.counterMaxLength = undefined;
		this.counterOverflowTextAppearance = undefined;
		this.counterOverflowTextColor = undefined;
		this.counterTextAppearance = undefined;
		this.counterTextColor = undefined;
		this.endIconCheckable = undefined;
		this.endIconContentDescription = undefined;
		this.endIconDrawable = undefined;
		this.endIconMode = undefined;
		this.endIconTint = undefined;
		this.errorContentDescription = undefined;
		this.errorEnabled = undefined;
		this.errorIconDrawable = undefined;
		this.errorIconTint = undefined;
		this.errorTextAppearance = undefined;
		this.helperTextEnabled = undefined;
		this.helperTextTextAppearance = undefined;
		this.hintAnimationEnabled = undefined;
		this.hintEnabled = undefined;
		this.hintTextAppearance = undefined;
		this.hintTextColor = undefined;
		this.placeholderTextAppearance = undefined;
		this.placeholderTextColor = undefined;
		this.prefixTextAppearance = undefined;
		this.prefixTextColor = undefined;
		this.startIconCheckable = undefined;
		this.startIconContentDescription = undefined;
		this.startIconDrawable = undefined;
		this.startIconTint = undefined;
		this.suffixTextAppearance = undefined;
		this.suffixTextColor = undefined;
		this.boxBackgroundMode = undefined;
		this.boxStrokeColor = undefined;
		this.boxBackgroundColor = undefined;
		this.boxCornerRadiusTopStart = undefined;
		this.boxCornerRadiusTopEnd = undefined;
		this.boxCornerRadiusBottomEnd = undefined;
		this.boxCornerRadiusBottomStart = undefined;
		this.defaultHintTextColor = undefined;
		this.errorTextColor = undefined;
		this.helperTextColor = undefined;
		this.helperText = undefined;
		this.error = undefined;
		this.placeholderText = undefined;
		this.prefixText = undefined;
		this.suffixText = undefined;
		this.enabled = undefined;
		this.startIconOnClick = undefined;
		this.startIconOnLongClick = undefined;
		this.startIconVisible = undefined;
		this.endIconOnClick = undefined;
		this.errorIconOnClick = undefined;
		this.endIconOnLongClick = undefined;
		this.errorIconOnLongClick = undefined;
		this.endIconVisible = undefined;
		this.endIconActivated = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
	}
	

	public tryGetHint() : T {
		this.resetIfRequired();
		if (this.hint == null || this.hint == undefined) {
			this.hint = new CommandAttr<string>()
		}
		
		this.hint.setGetter(true);
		this.orderGet++;
		this.hint.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getHint() : string {
		if (this.hint == null || this.hint == undefined) {
			this.hint = new CommandAttr<string>();
		}
		return this.hint.getCommandReturnValue();
	}
	public setHint(value : string) : T {
		this.resetIfRequired();
		if (this.hint == null || this.hint == undefined) {
			this.hint = new CommandAttr<string>();
		}
		
		this.hint.setSetter(true);
		this.hint.setValue(value);
		this.orderSet++;
		this.hint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetBoxStrokeErrorColor() : T {
		this.resetIfRequired();
		if (this.boxStrokeErrorColor == null || this.boxStrokeErrorColor == undefined) {
			this.boxStrokeErrorColor = new CommandAttr<string>()
		}
		
		this.boxStrokeErrorColor.setGetter(true);
		this.orderGet++;
		this.boxStrokeErrorColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getBoxStrokeErrorColor() : string {
		if (this.boxStrokeErrorColor == null || this.boxStrokeErrorColor == undefined) {
			this.boxStrokeErrorColor = new CommandAttr<string>();
		}
		return this.boxStrokeErrorColor.getCommandReturnValue();
	}
	public setBoxStrokeErrorColor(value : string) : T {
		this.resetIfRequired();
		if (this.boxStrokeErrorColor == null || this.boxStrokeErrorColor == undefined) {
			this.boxStrokeErrorColor = new CommandAttr<string>();
		}
		
		this.boxStrokeErrorColor.setSetter(true);
		this.boxStrokeErrorColor.setValue(value);
		this.orderSet++;
		this.boxStrokeErrorColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBoxStrokeWidth(value : string) : T {
		this.resetIfRequired();
		if (this.boxStrokeWidth == null || this.boxStrokeWidth == undefined) {
			this.boxStrokeWidth = new CommandAttr<string>();
		}
		
		this.boxStrokeWidth.setSetter(true);
		this.boxStrokeWidth.setValue(value);
		this.orderSet++;
		this.boxStrokeWidth.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBoxStrokeWidthFocused(value : string) : T {
		this.resetIfRequired();
		if (this.boxStrokeWidthFocused == null || this.boxStrokeWidthFocused == undefined) {
			this.boxStrokeWidthFocused = new CommandAttr<string>();
		}
		
		this.boxStrokeWidthFocused.setSetter(true);
		this.boxStrokeWidthFocused.setValue(value);
		this.orderSet++;
		this.boxStrokeWidthFocused.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setCounterEnabled(value : boolean) : T {
		this.resetIfRequired();
		if (this.counterEnabled == null || this.counterEnabled == undefined) {
			this.counterEnabled = new CommandAttr<boolean>();
		}
		
		this.counterEnabled.setSetter(true);
		this.counterEnabled.setValue(value);
		this.orderSet++;
		this.counterEnabled.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetCounterMaxLength() : T {
		this.resetIfRequired();
		if (this.counterMaxLength == null || this.counterMaxLength == undefined) {
			this.counterMaxLength = new CommandAttr<number>()
		}
		
		this.counterMaxLength.setGetter(true);
		this.orderGet++;
		this.counterMaxLength.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getCounterMaxLength() : number {
		if (this.counterMaxLength == null || this.counterMaxLength == undefined) {
			this.counterMaxLength = new CommandAttr<number>();
		}
		return this.counterMaxLength.getCommandReturnValue();
	}
	public setCounterMaxLength(value : number) : T {
		this.resetIfRequired();
		if (this.counterMaxLength == null || this.counterMaxLength == undefined) {
			this.counterMaxLength = new CommandAttr<number>();
		}
		
		this.counterMaxLength.setSetter(true);
		this.counterMaxLength.setValue(value);
		this.orderSet++;
		this.counterMaxLength.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setCounterOverflowTextAppearance(value : string) : T {
		this.resetIfRequired();
		if (this.counterOverflowTextAppearance == null || this.counterOverflowTextAppearance == undefined) {
			this.counterOverflowTextAppearance = new CommandAttr<string>();
		}
		
		this.counterOverflowTextAppearance.setSetter(true);
		this.counterOverflowTextAppearance.setValue(value);
		this.orderSet++;
		this.counterOverflowTextAppearance.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetCounterOverflowTextColor() : T {
		this.resetIfRequired();
		if (this.counterOverflowTextColor == null || this.counterOverflowTextColor == undefined) {
			this.counterOverflowTextColor = new CommandAttr<string>()
		}
		
		this.counterOverflowTextColor.setGetter(true);
		this.orderGet++;
		this.counterOverflowTextColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getCounterOverflowTextColor() : string {
		if (this.counterOverflowTextColor == null || this.counterOverflowTextColor == undefined) {
			this.counterOverflowTextColor = new CommandAttr<string>();
		}
		return this.counterOverflowTextColor.getCommandReturnValue();
	}
	public setCounterOverflowTextColor(value : string) : T {
		this.resetIfRequired();
		if (this.counterOverflowTextColor == null || this.counterOverflowTextColor == undefined) {
			this.counterOverflowTextColor = new CommandAttr<string>();
		}
		
		this.counterOverflowTextColor.setSetter(true);
		this.counterOverflowTextColor.setValue(value);
		this.orderSet++;
		this.counterOverflowTextColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setCounterTextAppearance(value : string) : T {
		this.resetIfRequired();
		if (this.counterTextAppearance == null || this.counterTextAppearance == undefined) {
			this.counterTextAppearance = new CommandAttr<string>();
		}
		
		this.counterTextAppearance.setSetter(true);
		this.counterTextAppearance.setValue(value);
		this.orderSet++;
		this.counterTextAppearance.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetCounterTextColor() : T {
		this.resetIfRequired();
		if (this.counterTextColor == null || this.counterTextColor == undefined) {
			this.counterTextColor = new CommandAttr<string>()
		}
		
		this.counterTextColor.setGetter(true);
		this.orderGet++;
		this.counterTextColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getCounterTextColor() : string {
		if (this.counterTextColor == null || this.counterTextColor == undefined) {
			this.counterTextColor = new CommandAttr<string>();
		}
		return this.counterTextColor.getCommandReturnValue();
	}
	public setCounterTextColor(value : string) : T {
		this.resetIfRequired();
		if (this.counterTextColor == null || this.counterTextColor == undefined) {
			this.counterTextColor = new CommandAttr<string>();
		}
		
		this.counterTextColor.setSetter(true);
		this.counterTextColor.setValue(value);
		this.orderSet++;
		this.counterTextColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setEndIconCheckable(value : boolean) : T {
		this.resetIfRequired();
		if (this.endIconCheckable == null || this.endIconCheckable == undefined) {
			this.endIconCheckable = new CommandAttr<boolean>();
		}
		
		this.endIconCheckable.setSetter(true);
		this.endIconCheckable.setValue(value);
		this.orderSet++;
		this.endIconCheckable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setEndIconContentDescription(value : string) : T {
		this.resetIfRequired();
		if (this.endIconContentDescription == null || this.endIconContentDescription == undefined) {
			this.endIconContentDescription = new CommandAttr<string>();
		}
		
		this.endIconContentDescription.setSetter(true);
		this.endIconContentDescription.setValue(value);
		this.orderSet++;
		this.endIconContentDescription.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetEndIconDrawable() : T {
		this.resetIfRequired();
		if (this.endIconDrawable == null || this.endIconDrawable == undefined) {
			this.endIconDrawable = new CommandAttr<string>()
		}
		
		this.endIconDrawable.setGetter(true);
		this.orderGet++;
		this.endIconDrawable.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getEndIconDrawable() : string {
		if (this.endIconDrawable == null || this.endIconDrawable == undefined) {
			this.endIconDrawable = new CommandAttr<string>();
		}
		return this.endIconDrawable.getCommandReturnValue();
	}
	public setEndIconDrawable(value : string) : T {
		this.resetIfRequired();
		if (this.endIconDrawable == null || this.endIconDrawable == undefined) {
			this.endIconDrawable = new CommandAttr<string>();
		}
		
		this.endIconDrawable.setSetter(true);
		this.endIconDrawable.setValue(value);
		this.orderSet++;
		this.endIconDrawable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetEndIconMode() : T {
		this.resetIfRequired();
		if (this.endIconMode == null || this.endIconMode == undefined) {
			this.endIconMode = new CommandAttr<EndIconMode>()
		}
		
		this.endIconMode.setGetter(true);
		this.orderGet++;
		this.endIconMode.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getEndIconMode() : EndIconMode {
		if (this.endIconMode == null || this.endIconMode == undefined) {
			this.endIconMode = new CommandAttr<EndIconMode>();
		}
		return this.endIconMode.getCommandReturnValue();
	}
	public setEndIconMode(value : EndIconMode) : T {
		this.resetIfRequired();
		if (this.endIconMode == null || this.endIconMode == undefined) {
			this.endIconMode = new CommandAttr<EndIconMode>();
		}
		
		this.endIconMode.setSetter(true);
		this.endIconMode.setValue(value);
		this.orderSet++;
		this.endIconMode.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setEndIconTint(value : string) : T {
		this.resetIfRequired();
		if (this.endIconTint == null || this.endIconTint == undefined) {
			this.endIconTint = new CommandAttr<string>();
		}
		
		this.endIconTint.setSetter(true);
		this.endIconTint.setValue(value);
		this.orderSet++;
		this.endIconTint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setErrorContentDescription(value : string) : T {
		this.resetIfRequired();
		if (this.errorContentDescription == null || this.errorContentDescription == undefined) {
			this.errorContentDescription = new CommandAttr<string>();
		}
		
		this.errorContentDescription.setSetter(true);
		this.errorContentDescription.setValue(value);
		this.orderSet++;
		this.errorContentDescription.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setErrorEnabled(value : boolean) : T {
		this.resetIfRequired();
		if (this.errorEnabled == null || this.errorEnabled == undefined) {
			this.errorEnabled = new CommandAttr<boolean>();
		}
		
		this.errorEnabled.setSetter(true);
		this.errorEnabled.setValue(value);
		this.orderSet++;
		this.errorEnabled.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetErrorIconDrawable() : T {
		this.resetIfRequired();
		if (this.errorIconDrawable == null || this.errorIconDrawable == undefined) {
			this.errorIconDrawable = new CommandAttr<string>()
		}
		
		this.errorIconDrawable.setGetter(true);
		this.orderGet++;
		this.errorIconDrawable.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getErrorIconDrawable() : string {
		if (this.errorIconDrawable == null || this.errorIconDrawable == undefined) {
			this.errorIconDrawable = new CommandAttr<string>();
		}
		return this.errorIconDrawable.getCommandReturnValue();
	}
	public setErrorIconDrawable(value : string) : T {
		this.resetIfRequired();
		if (this.errorIconDrawable == null || this.errorIconDrawable == undefined) {
			this.errorIconDrawable = new CommandAttr<string>();
		}
		
		this.errorIconDrawable.setSetter(true);
		this.errorIconDrawable.setValue(value);
		this.orderSet++;
		this.errorIconDrawable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setErrorIconTint(value : string) : T {
		this.resetIfRequired();
		if (this.errorIconTint == null || this.errorIconTint == undefined) {
			this.errorIconTint = new CommandAttr<string>();
		}
		
		this.errorIconTint.setSetter(true);
		this.errorIconTint.setValue(value);
		this.orderSet++;
		this.errorIconTint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setErrorTextAppearance(value : string) : T {
		this.resetIfRequired();
		if (this.errorTextAppearance == null || this.errorTextAppearance == undefined) {
			this.errorTextAppearance = new CommandAttr<string>();
		}
		
		this.errorTextAppearance.setSetter(true);
		this.errorTextAppearance.setValue(value);
		this.orderSet++;
		this.errorTextAppearance.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setHelperTextEnabled(value : boolean) : T {
		this.resetIfRequired();
		if (this.helperTextEnabled == null || this.helperTextEnabled == undefined) {
			this.helperTextEnabled = new CommandAttr<boolean>();
		}
		
		this.helperTextEnabled.setSetter(true);
		this.helperTextEnabled.setValue(value);
		this.orderSet++;
		this.helperTextEnabled.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setHelperTextTextAppearance(value : string) : T {
		this.resetIfRequired();
		if (this.helperTextTextAppearance == null || this.helperTextTextAppearance == undefined) {
			this.helperTextTextAppearance = new CommandAttr<string>();
		}
		
		this.helperTextTextAppearance.setSetter(true);
		this.helperTextTextAppearance.setValue(value);
		this.orderSet++;
		this.helperTextTextAppearance.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setHintAnimationEnabled(value : boolean) : T {
		this.resetIfRequired();
		if (this.hintAnimationEnabled == null || this.hintAnimationEnabled == undefined) {
			this.hintAnimationEnabled = new CommandAttr<boolean>();
		}
		
		this.hintAnimationEnabled.setSetter(true);
		this.hintAnimationEnabled.setValue(value);
		this.orderSet++;
		this.hintAnimationEnabled.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setHintEnabled(value : boolean) : T {
		this.resetIfRequired();
		if (this.hintEnabled == null || this.hintEnabled == undefined) {
			this.hintEnabled = new CommandAttr<boolean>();
		}
		
		this.hintEnabled.setSetter(true);
		this.hintEnabled.setValue(value);
		this.orderSet++;
		this.hintEnabled.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setHintTextAppearance(value : string) : T {
		this.resetIfRequired();
		if (this.hintTextAppearance == null || this.hintTextAppearance == undefined) {
			this.hintTextAppearance = new CommandAttr<string>();
		}
		
		this.hintTextAppearance.setSetter(true);
		this.hintTextAppearance.setValue(value);
		this.orderSet++;
		this.hintTextAppearance.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetHintTextColor() : T {
		this.resetIfRequired();
		if (this.hintTextColor == null || this.hintTextColor == undefined) {
			this.hintTextColor = new CommandAttr<string>()
		}
		
		this.hintTextColor.setGetter(true);
		this.orderGet++;
		this.hintTextColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getHintTextColor() : string {
		if (this.hintTextColor == null || this.hintTextColor == undefined) {
			this.hintTextColor = new CommandAttr<string>();
		}
		return this.hintTextColor.getCommandReturnValue();
	}
	public setHintTextColor(value : string) : T {
		this.resetIfRequired();
		if (this.hintTextColor == null || this.hintTextColor == undefined) {
			this.hintTextColor = new CommandAttr<string>();
		}
		
		this.hintTextColor.setSetter(true);
		this.hintTextColor.setValue(value);
		this.orderSet++;
		this.hintTextColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPlaceholderTextAppearance() : T {
		this.resetIfRequired();
		if (this.placeholderTextAppearance == null || this.placeholderTextAppearance == undefined) {
			this.placeholderTextAppearance = new CommandAttr<string>()
		}
		
		this.placeholderTextAppearance.setGetter(true);
		this.orderGet++;
		this.placeholderTextAppearance.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPlaceholderTextAppearance() : string {
		if (this.placeholderTextAppearance == null || this.placeholderTextAppearance == undefined) {
			this.placeholderTextAppearance = new CommandAttr<string>();
		}
		return this.placeholderTextAppearance.getCommandReturnValue();
	}
	public setPlaceholderTextAppearance(value : string) : T {
		this.resetIfRequired();
		if (this.placeholderTextAppearance == null || this.placeholderTextAppearance == undefined) {
			this.placeholderTextAppearance = new CommandAttr<string>();
		}
		
		this.placeholderTextAppearance.setSetter(true);
		this.placeholderTextAppearance.setValue(value);
		this.orderSet++;
		this.placeholderTextAppearance.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPlaceholderTextColor() : T {
		this.resetIfRequired();
		if (this.placeholderTextColor == null || this.placeholderTextColor == undefined) {
			this.placeholderTextColor = new CommandAttr<string>()
		}
		
		this.placeholderTextColor.setGetter(true);
		this.orderGet++;
		this.placeholderTextColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPlaceholderTextColor() : string {
		if (this.placeholderTextColor == null || this.placeholderTextColor == undefined) {
			this.placeholderTextColor = new CommandAttr<string>();
		}
		return this.placeholderTextColor.getCommandReturnValue();
	}
	public setPlaceholderTextColor(value : string) : T {
		this.resetIfRequired();
		if (this.placeholderTextColor == null || this.placeholderTextColor == undefined) {
			this.placeholderTextColor = new CommandAttr<string>();
		}
		
		this.placeholderTextColor.setSetter(true);
		this.placeholderTextColor.setValue(value);
		this.orderSet++;
		this.placeholderTextColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setPrefixTextAppearance(value : string) : T {
		this.resetIfRequired();
		if (this.prefixTextAppearance == null || this.prefixTextAppearance == undefined) {
			this.prefixTextAppearance = new CommandAttr<string>();
		}
		
		this.prefixTextAppearance.setSetter(true);
		this.prefixTextAppearance.setValue(value);
		this.orderSet++;
		this.prefixTextAppearance.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPrefixTextColor() : T {
		this.resetIfRequired();
		if (this.prefixTextColor == null || this.prefixTextColor == undefined) {
			this.prefixTextColor = new CommandAttr<string>()
		}
		
		this.prefixTextColor.setGetter(true);
		this.orderGet++;
		this.prefixTextColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPrefixTextColor() : string {
		if (this.prefixTextColor == null || this.prefixTextColor == undefined) {
			this.prefixTextColor = new CommandAttr<string>();
		}
		return this.prefixTextColor.getCommandReturnValue();
	}
	public setPrefixTextColor(value : string) : T {
		this.resetIfRequired();
		if (this.prefixTextColor == null || this.prefixTextColor == undefined) {
			this.prefixTextColor = new CommandAttr<string>();
		}
		
		this.prefixTextColor.setSetter(true);
		this.prefixTextColor.setValue(value);
		this.orderSet++;
		this.prefixTextColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setStartIconCheckable(value : boolean) : T {
		this.resetIfRequired();
		if (this.startIconCheckable == null || this.startIconCheckable == undefined) {
			this.startIconCheckable = new CommandAttr<boolean>();
		}
		
		this.startIconCheckable.setSetter(true);
		this.startIconCheckable.setValue(value);
		this.orderSet++;
		this.startIconCheckable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setStartIconContentDescription(value : string) : T {
		this.resetIfRequired();
		if (this.startIconContentDescription == null || this.startIconContentDescription == undefined) {
			this.startIconContentDescription = new CommandAttr<string>();
		}
		
		this.startIconContentDescription.setSetter(true);
		this.startIconContentDescription.setValue(value);
		this.orderSet++;
		this.startIconContentDescription.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetStartIconDrawable() : T {
		this.resetIfRequired();
		if (this.startIconDrawable == null || this.startIconDrawable == undefined) {
			this.startIconDrawable = new CommandAttr<string>()
		}
		
		this.startIconDrawable.setGetter(true);
		this.orderGet++;
		this.startIconDrawable.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getStartIconDrawable() : string {
		if (this.startIconDrawable == null || this.startIconDrawable == undefined) {
			this.startIconDrawable = new CommandAttr<string>();
		}
		return this.startIconDrawable.getCommandReturnValue();
	}
	public setStartIconDrawable(value : string) : T {
		this.resetIfRequired();
		if (this.startIconDrawable == null || this.startIconDrawable == undefined) {
			this.startIconDrawable = new CommandAttr<string>();
		}
		
		this.startIconDrawable.setSetter(true);
		this.startIconDrawable.setValue(value);
		this.orderSet++;
		this.startIconDrawable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setStartIconTint(value : string) : T {
		this.resetIfRequired();
		if (this.startIconTint == null || this.startIconTint == undefined) {
			this.startIconTint = new CommandAttr<string>();
		}
		
		this.startIconTint.setSetter(true);
		this.startIconTint.setValue(value);
		this.orderSet++;
		this.startIconTint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSuffixTextAppearance(value : string) : T {
		this.resetIfRequired();
		if (this.suffixTextAppearance == null || this.suffixTextAppearance == undefined) {
			this.suffixTextAppearance = new CommandAttr<string>();
		}
		
		this.suffixTextAppearance.setSetter(true);
		this.suffixTextAppearance.setValue(value);
		this.orderSet++;
		this.suffixTextAppearance.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetSuffixTextColor() : T {
		this.resetIfRequired();
		if (this.suffixTextColor == null || this.suffixTextColor == undefined) {
			this.suffixTextColor = new CommandAttr<string>()
		}
		
		this.suffixTextColor.setGetter(true);
		this.orderGet++;
		this.suffixTextColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getSuffixTextColor() : string {
		if (this.suffixTextColor == null || this.suffixTextColor == undefined) {
			this.suffixTextColor = new CommandAttr<string>();
		}
		return this.suffixTextColor.getCommandReturnValue();
	}
	public setSuffixTextColor(value : string) : T {
		this.resetIfRequired();
		if (this.suffixTextColor == null || this.suffixTextColor == undefined) {
			this.suffixTextColor = new CommandAttr<string>();
		}
		
		this.suffixTextColor.setSetter(true);
		this.suffixTextColor.setValue(value);
		this.orderSet++;
		this.suffixTextColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBoxBackgroundMode(value : BoxBackgroundMode) : T {
		this.resetIfRequired();
		if (this.boxBackgroundMode == null || this.boxBackgroundMode == undefined) {
			this.boxBackgroundMode = new CommandAttr<BoxBackgroundMode>();
		}
		
		this.boxBackgroundMode.setSetter(true);
		this.boxBackgroundMode.setValue(value);
		this.orderSet++;
		this.boxBackgroundMode.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBoxStrokeColor(value : string) : T {
		this.resetIfRequired();
		if (this.boxStrokeColor == null || this.boxStrokeColor == undefined) {
			this.boxStrokeColor = new CommandAttr<string>();
		}
		
		this.boxStrokeColor.setSetter(true);
		this.boxStrokeColor.setValue(value);
		this.orderSet++;
		this.boxStrokeColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBoxBackgroundColor(value : string) : T {
		this.resetIfRequired();
		if (this.boxBackgroundColor == null || this.boxBackgroundColor == undefined) {
			this.boxBackgroundColor = new CommandAttr<string>();
		}
		
		this.boxBackgroundColor.setSetter(true);
		this.boxBackgroundColor.setValue(value);
		this.orderSet++;
		this.boxBackgroundColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBoxCornerRadiusTopStart(value : string) : T {
		this.resetIfRequired();
		if (this.boxCornerRadiusTopStart == null || this.boxCornerRadiusTopStart == undefined) {
			this.boxCornerRadiusTopStart = new CommandAttr<string>();
		}
		
		this.boxCornerRadiusTopStart.setSetter(true);
		this.boxCornerRadiusTopStart.setValue(value);
		this.orderSet++;
		this.boxCornerRadiusTopStart.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBoxCornerRadiusTopEnd(value : string) : T {
		this.resetIfRequired();
		if (this.boxCornerRadiusTopEnd == null || this.boxCornerRadiusTopEnd == undefined) {
			this.boxCornerRadiusTopEnd = new CommandAttr<string>();
		}
		
		this.boxCornerRadiusTopEnd.setSetter(true);
		this.boxCornerRadiusTopEnd.setValue(value);
		this.orderSet++;
		this.boxCornerRadiusTopEnd.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBoxCornerRadiusBottomEnd(value : string) : T {
		this.resetIfRequired();
		if (this.boxCornerRadiusBottomEnd == null || this.boxCornerRadiusBottomEnd == undefined) {
			this.boxCornerRadiusBottomEnd = new CommandAttr<string>();
		}
		
		this.boxCornerRadiusBottomEnd.setSetter(true);
		this.boxCornerRadiusBottomEnd.setValue(value);
		this.orderSet++;
		this.boxCornerRadiusBottomEnd.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setBoxCornerRadiusBottomStart(value : string) : T {
		this.resetIfRequired();
		if (this.boxCornerRadiusBottomStart == null || this.boxCornerRadiusBottomStart == undefined) {
			this.boxCornerRadiusBottomStart = new CommandAttr<string>();
		}
		
		this.boxCornerRadiusBottomStart.setSetter(true);
		this.boxCornerRadiusBottomStart.setValue(value);
		this.orderSet++;
		this.boxCornerRadiusBottomStart.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDefaultHintTextColor(value : string) : T {
		this.resetIfRequired();
		if (this.defaultHintTextColor == null || this.defaultHintTextColor == undefined) {
			this.defaultHintTextColor = new CommandAttr<string>();
		}
		
		this.defaultHintTextColor.setSetter(true);
		this.defaultHintTextColor.setValue(value);
		this.orderSet++;
		this.defaultHintTextColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setErrorTextColor(value : string) : T {
		this.resetIfRequired();
		if (this.errorTextColor == null || this.errorTextColor == undefined) {
			this.errorTextColor = new CommandAttr<string>();
		}
		
		this.errorTextColor.setSetter(true);
		this.errorTextColor.setValue(value);
		this.orderSet++;
		this.errorTextColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setHelperTextColor(value : string) : T {
		this.resetIfRequired();
		if (this.helperTextColor == null || this.helperTextColor == undefined) {
			this.helperTextColor = new CommandAttr<string>();
		}
		
		this.helperTextColor.setSetter(true);
		this.helperTextColor.setValue(value);
		this.orderSet++;
		this.helperTextColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setHelperText(value : string) : T {
		this.resetIfRequired();
		if (this.helperText == null || this.helperText == undefined) {
			this.helperText = new CommandAttr<string>();
		}
		
		this.helperText.setSetter(true);
		this.helperText.setValue(value);
		this.orderSet++;
		this.helperText.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setError(value : string) : T {
		this.resetIfRequired();
		if (this.error == null || this.error == undefined) {
			this.error = new CommandAttr<string>();
		}
		
		this.error.setSetter(true);
		this.error.setValue(value);
		this.orderSet++;
		this.error.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setPlaceholderText(value : string) : T {
		this.resetIfRequired();
		if (this.placeholderText == null || this.placeholderText == undefined) {
			this.placeholderText = new CommandAttr<string>();
		}
		
		this.placeholderText.setSetter(true);
		this.placeholderText.setValue(value);
		this.orderSet++;
		this.placeholderText.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setPrefixText(value : string) : T {
		this.resetIfRequired();
		if (this.prefixText == null || this.prefixText == undefined) {
			this.prefixText = new CommandAttr<string>();
		}
		
		this.prefixText.setSetter(true);
		this.prefixText.setValue(value);
		this.orderSet++;
		this.prefixText.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSuffixText(value : string) : T {
		this.resetIfRequired();
		if (this.suffixText == null || this.suffixText == undefined) {
			this.suffixText = new CommandAttr<string>();
		}
		
		this.suffixText.setSetter(true);
		this.suffixText.setValue(value);
		this.orderSet++;
		this.suffixText.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setEnabled(value : boolean) : T {
		this.resetIfRequired();
		if (this.enabled == null || this.enabled == undefined) {
			this.enabled = new CommandAttr<boolean>();
		}
		
		this.enabled.setSetter(true);
		this.enabled.setValue(value);
		this.orderSet++;
		this.enabled.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setStartIconOnClick(value : string) : T {
		this.resetIfRequired();
		if (this.startIconOnClick == null || this.startIconOnClick == undefined) {
			this.startIconOnClick = new CommandAttr<string>();
		}
		
		this.startIconOnClick.setSetter(true);
		this.startIconOnClick.setValue(value);
		this.orderSet++;
		this.startIconOnClick.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setStartIconOnLongClick(value : string) : T {
		this.resetIfRequired();
		if (this.startIconOnLongClick == null || this.startIconOnLongClick == undefined) {
			this.startIconOnLongClick = new CommandAttr<string>();
		}
		
		this.startIconOnLongClick.setSetter(true);
		this.startIconOnLongClick.setValue(value);
		this.orderSet++;
		this.startIconOnLongClick.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setStartIconVisible(value : boolean) : T {
		this.resetIfRequired();
		if (this.startIconVisible == null || this.startIconVisible == undefined) {
			this.startIconVisible = new CommandAttr<boolean>();
		}
		
		this.startIconVisible.setSetter(true);
		this.startIconVisible.setValue(value);
		this.orderSet++;
		this.startIconVisible.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setEndIconOnClick(value : string) : T {
		this.resetIfRequired();
		if (this.endIconOnClick == null || this.endIconOnClick == undefined) {
			this.endIconOnClick = new CommandAttr<string>();
		}
		
		this.endIconOnClick.setSetter(true);
		this.endIconOnClick.setValue(value);
		this.orderSet++;
		this.endIconOnClick.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setErrorIconOnClick(value : string) : T {
		this.resetIfRequired();
		if (this.errorIconOnClick == null || this.errorIconOnClick == undefined) {
			this.errorIconOnClick = new CommandAttr<string>();
		}
		
		this.errorIconOnClick.setSetter(true);
		this.errorIconOnClick.setValue(value);
		this.orderSet++;
		this.errorIconOnClick.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setEndIconOnLongClick(value : string) : T {
		this.resetIfRequired();
		if (this.endIconOnLongClick == null || this.endIconOnLongClick == undefined) {
			this.endIconOnLongClick = new CommandAttr<string>();
		}
		
		this.endIconOnLongClick.setSetter(true);
		this.endIconOnLongClick.setValue(value);
		this.orderSet++;
		this.endIconOnLongClick.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setErrorIconOnLongClick(value : string) : T {
		this.resetIfRequired();
		if (this.errorIconOnLongClick == null || this.errorIconOnLongClick == undefined) {
			this.errorIconOnLongClick = new CommandAttr<string>();
		}
		
		this.errorIconOnLongClick.setSetter(true);
		this.errorIconOnLongClick.setValue(value);
		this.orderSet++;
		this.errorIconOnLongClick.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setEndIconVisible(value : boolean) : T {
		this.resetIfRequired();
		if (this.endIconVisible == null || this.endIconVisible == undefined) {
			this.endIconVisible = new CommandAttr<boolean>();
		}
		
		this.endIconVisible.setSetter(true);
		this.endIconVisible.setValue(value);
		this.orderSet++;
		this.endIconVisible.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setEndIconActivated(value : boolean) : T {
		this.resetIfRequired();
		if (this.endIconActivated == null || this.endIconActivated == undefined) {
			this.endIconActivated = new CommandAttr<boolean>();
		}
		
		this.endIconActivated.setSetter(true);
		this.endIconActivated.setValue(value);
		this.orderSet++;
		this.endIconActivated.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	//end - body

}
	
//start - staticinit

export class TextInputLayout extends TextInputLayoutImpl<TextInputLayout> implements IWidget{
    getThisPointer(): TextInputLayout {
        return this;
    }
    
   	public getClass() {
		return TextInputLayout;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

TextInputLayoutImpl.initialize();

//end - staticinit
