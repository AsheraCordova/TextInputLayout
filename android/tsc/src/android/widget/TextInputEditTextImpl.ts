// start - imports

export const enum ImeOptions {
actionDone = "actionDone",
actionGo = "actionGo",
actionNext = "actionNext",
actionNone = "actionNone",
actionPrevious = "actionPrevious",
actionSearch = "actionSearch",
actionSend = "actionSend",
actionUnspecified = "actionUnspecified",
flagForceAscii = "flagForceAscii",
flagNavigateNext = "flagNavigateNext",
flagNavigatePrevious = "flagNavigatePrevious",
flagNoAccessoryAction = "flagNoAccessoryAction",
flagNoEnterAction = "flagNoEnterAction",
flagNoExtractUi = "flagNoExtractUi",
flagNoFullscreen = "flagNoFullscreen",
flagNoPersonalizedLearning = "flagNoPersonalizedLearning",
normal = "normal",
}
export const enum InputType {
date = "date",
datetime = "datetime",
none = "none",
number = "number",
numberDecimal = "numberDecimal",
numberPassword = "numberPassword",
numberSigned = "numberSigned",
phone = "phone",
text = "text",
textAutoComplete = "textAutoComplete",
textAutoCorrect = "textAutoCorrect",
textCapCharacters = "textCapCharacters",
textCapSentences = "textCapSentences",
textCapWords = "textCapWords",
textEmailAddress = "textEmailAddress",
textEmailSubject = "textEmailSubject",
textFilter = "textFilter",
textImeMultiLine = "textImeMultiLine",
textLongMessage = "textLongMessage",
textMultiLine = "textMultiLine",
textNoSuggestions = "textNoSuggestions",
textPassword = "textPassword",
textPersonName = "textPersonName",
textPhonetic = "textPhonetic",
textPostalAddress = "textPostalAddress",
textShortMessage = "textShortMessage",
textUri = "textUri",
textVisiblePassword = "textVisiblePassword",
textWebEditText = "textWebEditText",
textWebEmailAddress = "textWebEmailAddress",
textWebPassword = "textWebPassword",
time = "time",
}
export const enum Capitalize {
characters = "characters",
none = "none",
sentences = "sentences",
words = "words",
}
export const enum Numeric {
decimal = "decimal",
integer = "integer",
signed = "signed",
}
export const enum Font {
monospace = "monospace",
normal = "normal",
sans = "sans",
serif = "serif",
}
export const enum TextStyle {
bold = "bold",
italic = "italic",
normal = "normal",
}
export const enum DrawableTintMode {
add = "add",
multiply = "multiply",
screen = "screen",
src_atop = "src_atop",
src_in = "src_in",
src_over = "src_over",
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
import { Mixin, decorate } from 'ts-mixer';














export class ImeOptionsTransformer implements ITranform {
    transform(value: any, obj: any, type: number) : any{
        if (type == 1) {
            return value.toString().replace(",", "|");
        } else {
            let strArray:Array<string> = value.toString().split("|");
            
            let valueArr:Array<ImeOptions> = new Array<ImeOptions>();
            for (let i =0; i < strArray.length; i++) {
                switch(strArray[i]) {
					case "actionDone":
						valueArr.push(ImeOptions.actionDone);
                       	break;	
					case "actionGo":
						valueArr.push(ImeOptions.actionGo);
                       	break;	
					case "actionNext":
						valueArr.push(ImeOptions.actionNext);
                       	break;	
					case "actionNone":
						valueArr.push(ImeOptions.actionNone);
                       	break;	
					case "actionPrevious":
						valueArr.push(ImeOptions.actionPrevious);
                       	break;	
					case "actionSearch":
						valueArr.push(ImeOptions.actionSearch);
                       	break;	
					case "actionSend":
						valueArr.push(ImeOptions.actionSend);
                       	break;	
					case "actionUnspecified":
						valueArr.push(ImeOptions.actionUnspecified);
                       	break;	
					case "flagForceAscii":
						valueArr.push(ImeOptions.flagForceAscii);
                       	break;	
					case "flagNavigateNext":
						valueArr.push(ImeOptions.flagNavigateNext);
                       	break;	
					case "flagNavigatePrevious":
						valueArr.push(ImeOptions.flagNavigatePrevious);
                       	break;	
					case "flagNoAccessoryAction":
						valueArr.push(ImeOptions.flagNoAccessoryAction);
                       	break;	
					case "flagNoEnterAction":
						valueArr.push(ImeOptions.flagNoEnterAction);
                       	break;	
					case "flagNoExtractUi":
						valueArr.push(ImeOptions.flagNoExtractUi);
                       	break;	
					case "flagNoFullscreen":
						valueArr.push(ImeOptions.flagNoFullscreen);
                       	break;	
					case "flagNoPersonalizedLearning":
						valueArr.push(ImeOptions.flagNoPersonalizedLearning);
                       	break;	
					case "normal":
						valueArr.push(ImeOptions.normal);
                       	break;	
                }
                
            }
            return valueArr;
        }
    }
}


export class InputTypeTransformer implements ITranform {
    transform(value: any, obj: any, type: number) : any{
        if (type == 1) {
            return value.toString().replace(",", "|");
        } else {
            let strArray:Array<string> = value.toString().split("|");
            
            let valueArr:Array<InputType> = new Array<InputType>();
            for (let i =0; i < strArray.length; i++) {
                switch(strArray[i]) {
					case "date":
						valueArr.push(InputType.date);
                       	break;	
					case "datetime":
						valueArr.push(InputType.datetime);
                       	break;	
					case "none":
						valueArr.push(InputType.none);
                       	break;	
					case "number":
						valueArr.push(InputType.number);
                       	break;	
					case "numberDecimal":
						valueArr.push(InputType.numberDecimal);
                       	break;	
					case "numberPassword":
						valueArr.push(InputType.numberPassword);
                       	break;	
					case "numberSigned":
						valueArr.push(InputType.numberSigned);
                       	break;	
					case "phone":
						valueArr.push(InputType.phone);
                       	break;	
					case "text":
						valueArr.push(InputType.text);
                       	break;	
					case "textAutoComplete":
						valueArr.push(InputType.textAutoComplete);
                       	break;	
					case "textAutoCorrect":
						valueArr.push(InputType.textAutoCorrect);
                       	break;	
					case "textCapCharacters":
						valueArr.push(InputType.textCapCharacters);
                       	break;	
					case "textCapSentences":
						valueArr.push(InputType.textCapSentences);
                       	break;	
					case "textCapWords":
						valueArr.push(InputType.textCapWords);
                       	break;	
					case "textEmailAddress":
						valueArr.push(InputType.textEmailAddress);
                       	break;	
					case "textEmailSubject":
						valueArr.push(InputType.textEmailSubject);
                       	break;	
					case "textFilter":
						valueArr.push(InputType.textFilter);
                       	break;	
					case "textImeMultiLine":
						valueArr.push(InputType.textImeMultiLine);
                       	break;	
					case "textLongMessage":
						valueArr.push(InputType.textLongMessage);
                       	break;	
					case "textMultiLine":
						valueArr.push(InputType.textMultiLine);
                       	break;	
					case "textNoSuggestions":
						valueArr.push(InputType.textNoSuggestions);
                       	break;	
					case "textPassword":
						valueArr.push(InputType.textPassword);
                       	break;	
					case "textPersonName":
						valueArr.push(InputType.textPersonName);
                       	break;	
					case "textPhonetic":
						valueArr.push(InputType.textPhonetic);
                       	break;	
					case "textPostalAddress":
						valueArr.push(InputType.textPostalAddress);
                       	break;	
					case "textShortMessage":
						valueArr.push(InputType.textShortMessage);
                       	break;	
					case "textUri":
						valueArr.push(InputType.textUri);
                       	break;	
					case "textVisiblePassword":
						valueArr.push(InputType.textVisiblePassword);
                       	break;	
					case "textWebEditText":
						valueArr.push(InputType.textWebEditText);
                       	break;	
					case "textWebEmailAddress":
						valueArr.push(InputType.textWebEmailAddress);
                       	break;	
					case "textWebPassword":
						valueArr.push(InputType.textWebPassword);
                       	break;	
					case "time":
						valueArr.push(InputType.time);
                       	break;	
                }
                
            }
            return valueArr;
        }
    }
}



































export class NumericTransformer implements ITranform {
    transform(value: any, obj: any, type: number) : any{
        if (type == 1) {
            return value.toString().replace(",", "|");
        } else {
            let strArray:Array<string> = value.toString().split("|");
            
            let valueArr:Array<Numeric> = new Array<Numeric>();
            for (let i =0; i < strArray.length; i++) {
                switch(strArray[i]) {
					case "decimal":
						valueArr.push(Numeric.decimal);
                       	break;	
					case "integer":
						valueArr.push(Numeric.integer);
                       	break;	
					case "signed":
						valueArr.push(Numeric.signed);
                       	break;	
                }
                
            }
            return valueArr;
        }
    }
}
















export class TextStyleTransformer implements ITranform {
    transform(value: any, obj: any, type: number) : any{
        if (type == 1) {
            return value.toString().replace(",", "|");
        } else {
            let strArray:Array<string> = value.toString().split("|");
            
            let valueArr:Array<TextStyle> = new Array<TextStyle>();
            for (let i =0; i < strArray.length; i++) {
                switch(strArray[i]) {
					case "bold":
						valueArr.push(TextStyle.bold);
                       	break;	
					case "italic":
						valueArr.push(TextStyle.italic);
                       	break;	
					case "normal":
						valueArr.push(TextStyle.normal);
                       	break;	
                }
                
            }
            return valueArr;
        }
    }
}





















// end - imports
import {ViewImpl} from './ViewImpl';
export abstract class TextInputEditTextImpl<T> extends ViewImpl<T>{
	//start - body
	static initialize() {
		TransformerFactory.getInstance().register("imeOptions", new ImeOptionsTransformer());
		TransformerFactory.getInstance().register("inputType", new InputTypeTransformer());
		TransformerFactory.getInstance().register("numeric", new NumericTransformer());
		TransformerFactory.getInstance().register("textStyle", new TextStyleTransformer());
    }	
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "cursorVisible" }))
	cursorVisible!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawablePadding" }))
	drawablePadding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "elegantTextHeight" }))
	elegantTextHeight!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "ems" }))
	ems!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "fallbackLineSpacing" }))
	fallbackLineSpacing!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "firstBaselineToTopHeight" }))
	firstBaselineToTopHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "freezesText" }))
	freezesText!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "gravity" }))
	gravity!:CommandAttr<Gravity[]>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "height" }))
	height!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "hint" }))
	hint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "imeActionId" }))
	imeActionId!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "imeActionLabel" }))
	imeActionLabel!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "imeOptions" }))
	imeOptions!:CommandAttr<ImeOptions[]>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "includeFontPadding" }))
	includeFontPadding!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "inputType" }))
	inputType!:CommandAttr<InputType[]>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "lastBaselineToBottomHeight" }))
	lastBaselineToBottomHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "letterSpacing" }))
	letterSpacing!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "lineHeight" }))
	lineHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "lineSpacingExtra" }))
	lineSpacingExtra!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "lineSpacingMultiplier" }))
	lineSpacingMultiplier!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "lines" }))
	lines!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "maxEms" }))
	maxEms!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "maxHeight" }))
	maxHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "maxLines" }))
	maxLines!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "maxWidth" }))
	maxWidth!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "minEms" }))
	minEms!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "minHeight" }))
	minHeight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "minLines" }))
	minLines!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "minWidth" }))
	minWidth!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "privateImeOptions" }))
	privateImeOptions!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "scrollHorizontally" }))
	scrollHorizontally!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "selectAllOnFocus" }))
	selectAllOnFocus!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "shadowColor" }))
	shadowColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "shadowDx" }))
	shadowDx!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "shadowDy" }))
	shadowDy!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "shadowRadius" }))
	shadowRadius!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "singleLine" }))
	singleLine!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textColor" }))
	textColor!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textColorHighlight" }))
	textColorHighlight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textColorHint" }))
	textColorHint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textIsSelectable" }))
	textIsSelectable!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textScaleX" }))
	textScaleX!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "width" }))
	width!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onafterTextChange" }))
	onafterTextChange!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onbeforeTextChange" }))
	onbeforeTextChange!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onTextChange" }))
	onTextChange!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "onEditorAction" }))
	onEditorAction!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "capitalize" }))
	capitalize!:CommandAttr<Capitalize>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "phoneNumber" }))
	phoneNumber!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "numeric" }))
	numeric!:CommandAttr<Numeric[]>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "digits" }))
	digits!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "editorExtras" }))
	editorExtras!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "autoText" }))
	autoText!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textAllCaps" }))
	textAllCaps!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "setFocus" }))
	setFocus!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "selectAll" }))
	selectAll_!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "hintTextFormat" }))
	hintTextFormat!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "text" }))
	text!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textSize" }))
	textSize!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableStart" }))
	drawableStart!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableEnd" }))
	drawableEnd!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableTop" }))
	drawableTop!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableBottom" }))
	drawableBottom!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "maxLength" }))
	maxLength!:CommandAttr<number>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "typeface" }))
	typeface!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textStyle" }))
	textStyle!:CommandAttr<TextStyle[]>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "fontFamily" }))
	fontFamily!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "systemTextAppearance" }))
	systemTextAppearance!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "textAppearance" }))
	textAppearance!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "password" }))
	password!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "enabled" }))
	enabled!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "editable" }))
	editable!:CommandAttr<boolean>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableTint" }))
	drawableTint!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableTintMode" }))
	drawableTintMode!:CommandAttr<DrawableTintMode>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "padding" }))
	padding!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingBottom" }))
	paddingBottom!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingRight" }))
	paddingRight!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingLeft" }))
	paddingLeft!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingStart" }))
	paddingStart!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingEnd" }))
	paddingEnd!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingTop" }))
	paddingTop!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingHorizontal" }))
	paddingHorizontal!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "paddingVertical" }))
	paddingVertical!:CommandAttr<string>| undefined;
	@decorate(Type(() => CommandAttr))
	@decorate(Expose({ name: "drawableIconSize" }))
	drawableIconSize!:CommandAttr<string>| undefined;

	@decorate(Exclude())
	protected thisPointer: T;	
	protected abstract getThisPointer(): T;
	reset() : T {	
		super.reset();
		this.cursorVisible = undefined;
		this.drawablePadding = undefined;
		this.elegantTextHeight = undefined;
		this.ems = undefined;
		this.fallbackLineSpacing = undefined;
		this.firstBaselineToTopHeight = undefined;
		this.freezesText = undefined;
		this.gravity = undefined;
		this.height = undefined;
		this.hint = undefined;
		this.imeActionId = undefined;
		this.imeActionLabel = undefined;
		this.imeOptions = undefined;
		this.includeFontPadding = undefined;
		this.inputType = undefined;
		this.lastBaselineToBottomHeight = undefined;
		this.letterSpacing = undefined;
		this.lineHeight = undefined;
		this.lineSpacingExtra = undefined;
		this.lineSpacingMultiplier = undefined;
		this.lines = undefined;
		this.maxEms = undefined;
		this.maxHeight = undefined;
		this.maxLines = undefined;
		this.maxWidth = undefined;
		this.minEms = undefined;
		this.minHeight = undefined;
		this.minLines = undefined;
		this.minWidth = undefined;
		this.privateImeOptions = undefined;
		this.scrollHorizontally = undefined;
		this.selectAllOnFocus = undefined;
		this.shadowColor = undefined;
		this.shadowDx = undefined;
		this.shadowDy = undefined;
		this.shadowRadius = undefined;
		this.singleLine = undefined;
		this.textColor = undefined;
		this.textColorHighlight = undefined;
		this.textColorHint = undefined;
		this.textIsSelectable = undefined;
		this.textScaleX = undefined;
		this.width = undefined;
		this.onafterTextChange = undefined;
		this.onbeforeTextChange = undefined;
		this.onTextChange = undefined;
		this.onEditorAction = undefined;
		this.capitalize = undefined;
		this.phoneNumber = undefined;
		this.numeric = undefined;
		this.digits = undefined;
		this.editorExtras = undefined;
		this.autoText = undefined;
		this.textAllCaps = undefined;
		this.setFocus = undefined;
		this.selectAll_ = undefined;
		this.hintTextFormat = undefined;
		this.text = undefined;
		this.textSize = undefined;
		this.drawableStart = undefined;
		this.drawableEnd = undefined;
		this.drawableTop = undefined;
		this.drawableBottom = undefined;
		this.maxLength = undefined;
		this.typeface = undefined;
		this.textStyle = undefined;
		this.fontFamily = undefined;
		this.systemTextAppearance = undefined;
		this.textAppearance = undefined;
		this.password = undefined;
		this.enabled = undefined;
		this.editable = undefined;
		this.drawableTint = undefined;
		this.drawableTintMode = undefined;
		this.padding = undefined;
		this.paddingBottom = undefined;
		this.paddingRight = undefined;
		this.paddingLeft = undefined;
		this.paddingStart = undefined;
		this.paddingEnd = undefined;
		this.paddingTop = undefined;
		this.paddingHorizontal = undefined;
		this.paddingVertical = undefined;
		this.drawableIconSize = undefined;
		return this.thisPointer;
	}
	constructor(id: string, path: string[], event:  string) {
		super(id, path, event);
		this.thisPointer = this.getThisPointer();
	}
	

	public tryGetCursorVisible() : T {
		this.resetIfRequired();
		if (this.cursorVisible == null || this.cursorVisible == undefined) {
			this.cursorVisible = new CommandAttr<boolean>()
		}
		
		this.cursorVisible.setGetter(true);
		this.orderGet++;
		this.cursorVisible.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isCursorVisible() : boolean {
		if (this.cursorVisible == null || this.cursorVisible == undefined) {
			this.cursorVisible = new CommandAttr<boolean>();
		}
		return this.cursorVisible.getCommandReturnValue();
	}
	public setCursorVisible(value : boolean) : T {
		this.resetIfRequired();
		if (this.cursorVisible == null || this.cursorVisible == undefined) {
			this.cursorVisible = new CommandAttr<boolean>();
		}
		
		this.cursorVisible.setSetter(true);
		this.cursorVisible.setValue(value);
		this.orderSet++;
		this.cursorVisible.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetDrawablePadding() : T {
		this.resetIfRequired();
		if (this.drawablePadding == null || this.drawablePadding == undefined) {
			this.drawablePadding = new CommandAttr<string>()
		}
		
		this.drawablePadding.setGetter(true);
		this.orderGet++;
		this.drawablePadding.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getDrawablePadding() : string {
		if (this.drawablePadding == null || this.drawablePadding == undefined) {
			this.drawablePadding = new CommandAttr<string>();
		}
		return this.drawablePadding.getCommandReturnValue();
	}
	public setDrawablePadding(value : string) : T {
		this.resetIfRequired();
		if (this.drawablePadding == null || this.drawablePadding == undefined) {
			this.drawablePadding = new CommandAttr<string>();
		}
		
		this.drawablePadding.setSetter(true);
		this.drawablePadding.setValue(value);
		this.orderSet++;
		this.drawablePadding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetElegantTextHeight() : T {
		this.resetIfRequired();
		if (this.elegantTextHeight == null || this.elegantTextHeight == undefined) {
			this.elegantTextHeight = new CommandAttr<boolean>()
		}
		
		this.elegantTextHeight.setGetter(true);
		this.orderGet++;
		this.elegantTextHeight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isElegantTextHeight() : boolean {
		if (this.elegantTextHeight == null || this.elegantTextHeight == undefined) {
			this.elegantTextHeight = new CommandAttr<boolean>();
		}
		return this.elegantTextHeight.getCommandReturnValue();
	}
	public setElegantTextHeight(value : boolean) : T {
		this.resetIfRequired();
		if (this.elegantTextHeight == null || this.elegantTextHeight == undefined) {
			this.elegantTextHeight = new CommandAttr<boolean>();
		}
		
		this.elegantTextHeight.setSetter(true);
		this.elegantTextHeight.setValue(value);
		this.orderSet++;
		this.elegantTextHeight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setEms(value : number) : T {
		this.resetIfRequired();
		if (this.ems == null || this.ems == undefined) {
			this.ems = new CommandAttr<number>();
		}
		
		this.ems.setSetter(true);
		this.ems.setValue(value);
		this.orderSet++;
		this.ems.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetFallbackLineSpacing() : T {
		this.resetIfRequired();
		if (this.fallbackLineSpacing == null || this.fallbackLineSpacing == undefined) {
			this.fallbackLineSpacing = new CommandAttr<boolean>()
		}
		
		this.fallbackLineSpacing.setGetter(true);
		this.orderGet++;
		this.fallbackLineSpacing.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isFallbackLineSpacing() : boolean {
		if (this.fallbackLineSpacing == null || this.fallbackLineSpacing == undefined) {
			this.fallbackLineSpacing = new CommandAttr<boolean>();
		}
		return this.fallbackLineSpacing.getCommandReturnValue();
	}
	public setFallbackLineSpacing(value : boolean) : T {
		this.resetIfRequired();
		if (this.fallbackLineSpacing == null || this.fallbackLineSpacing == undefined) {
			this.fallbackLineSpacing = new CommandAttr<boolean>();
		}
		
		this.fallbackLineSpacing.setSetter(true);
		this.fallbackLineSpacing.setValue(value);
		this.orderSet++;
		this.fallbackLineSpacing.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetFirstBaselineToTopHeight() : T {
		this.resetIfRequired();
		if (this.firstBaselineToTopHeight == null || this.firstBaselineToTopHeight == undefined) {
			this.firstBaselineToTopHeight = new CommandAttr<string>()
		}
		
		this.firstBaselineToTopHeight.setGetter(true);
		this.orderGet++;
		this.firstBaselineToTopHeight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getFirstBaselineToTopHeight() : string {
		if (this.firstBaselineToTopHeight == null || this.firstBaselineToTopHeight == undefined) {
			this.firstBaselineToTopHeight = new CommandAttr<string>();
		}
		return this.firstBaselineToTopHeight.getCommandReturnValue();
	}
	public setFirstBaselineToTopHeight(value : string) : T {
		this.resetIfRequired();
		if (this.firstBaselineToTopHeight == null || this.firstBaselineToTopHeight == undefined) {
			this.firstBaselineToTopHeight = new CommandAttr<string>();
		}
		
		this.firstBaselineToTopHeight.setSetter(true);
		this.firstBaselineToTopHeight.setValue(value);
		this.orderSet++;
		this.firstBaselineToTopHeight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetFreezesText() : T {
		this.resetIfRequired();
		if (this.freezesText == null || this.freezesText == undefined) {
			this.freezesText = new CommandAttr<boolean>()
		}
		
		this.freezesText.setGetter(true);
		this.orderGet++;
		this.freezesText.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isFreezesText() : boolean {
		if (this.freezesText == null || this.freezesText == undefined) {
			this.freezesText = new CommandAttr<boolean>();
		}
		return this.freezesText.getCommandReturnValue();
	}
	public setFreezesText(value : boolean) : T {
		this.resetIfRequired();
		if (this.freezesText == null || this.freezesText == undefined) {
			this.freezesText = new CommandAttr<boolean>();
		}
		
		this.freezesText.setSetter(true);
		this.freezesText.setValue(value);
		this.orderSet++;
		this.freezesText.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetGravity() : T {
		this.resetIfRequired();
		if (this.gravity == null || this.gravity == undefined) {
			this.gravity = new CommandAttr<Gravity[]>()
		}
		
		this.gravity.setGetter(true);
		this.orderGet++;
		this.gravity.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getGravity() : Gravity[] {
		if (this.gravity == null || this.gravity == undefined) {
			this.gravity = new CommandAttr<Gravity[]>();
		}
this.gravity.setTransformer('gravity');		return this.gravity.getCommandReturnValue();
	}
	public setGravity(...value : Gravity[]) : T {
		this.resetIfRequired();
		if (this.gravity == null || this.gravity == undefined) {
			this.gravity = new CommandAttr<Gravity[]>();
		}
		
		this.gravity.setSetter(true);
		this.gravity.setValue(value);
		this.orderSet++;
		this.gravity.setOrderSet(this.orderSet);
this.gravity.setTransformer('gravity');		return this.thisPointer;
	}
		

	public tryGetHeight() : T {
		this.resetIfRequired();
		if (this.height == null || this.height == undefined) {
			this.height = new CommandAttr<string>()
		}
		
		this.height.setGetter(true);
		this.orderGet++;
		this.height.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getHeight() : string {
		if (this.height == null || this.height == undefined) {
			this.height = new CommandAttr<string>();
		}
		return this.height.getCommandReturnValue();
	}
	public setHeight(value : string) : T {
		this.resetIfRequired();
		if (this.height == null || this.height == undefined) {
			this.height = new CommandAttr<string>();
		}
		
		this.height.setSetter(true);
		this.height.setValue(value);
		this.orderSet++;
		this.height.setOrderSet(this.orderSet);
		return this.thisPointer;
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
		

	public setImeActionId(value : number) : T {
		this.resetIfRequired();
		if (this.imeActionId == null || this.imeActionId == undefined) {
			this.imeActionId = new CommandAttr<number>();
		}
		
		this.imeActionId.setSetter(true);
		this.imeActionId.setValue(value);
		this.orderSet++;
		this.imeActionId.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setImeActionLabel(value : string) : T {
		this.resetIfRequired();
		if (this.imeActionLabel == null || this.imeActionLabel == undefined) {
			this.imeActionLabel = new CommandAttr<string>();
		}
		
		this.imeActionLabel.setSetter(true);
		this.imeActionLabel.setValue(value);
		this.orderSet++;
		this.imeActionLabel.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetImeOptions() : T {
		this.resetIfRequired();
		if (this.imeOptions == null || this.imeOptions == undefined) {
			this.imeOptions = new CommandAttr<ImeOptions[]>()
		}
		
		this.imeOptions.setGetter(true);
		this.orderGet++;
		this.imeOptions.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getImeOptions() : ImeOptions[] {
		if (this.imeOptions == null || this.imeOptions == undefined) {
			this.imeOptions = new CommandAttr<ImeOptions[]>();
		}
this.imeOptions.setTransformer('imeOptions');		return this.imeOptions.getCommandReturnValue();
	}
	public setImeOptions(...value : ImeOptions[]) : T {
		this.resetIfRequired();
		if (this.imeOptions == null || this.imeOptions == undefined) {
			this.imeOptions = new CommandAttr<ImeOptions[]>();
		}
		
		this.imeOptions.setSetter(true);
		this.imeOptions.setValue(value);
		this.orderSet++;
		this.imeOptions.setOrderSet(this.orderSet);
this.imeOptions.setTransformer('imeOptions');		return this.thisPointer;
	}
		

	public tryGetIncludeFontPadding() : T {
		this.resetIfRequired();
		if (this.includeFontPadding == null || this.includeFontPadding == undefined) {
			this.includeFontPadding = new CommandAttr<boolean>()
		}
		
		this.includeFontPadding.setGetter(true);
		this.orderGet++;
		this.includeFontPadding.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isIncludeFontPadding() : boolean {
		if (this.includeFontPadding == null || this.includeFontPadding == undefined) {
			this.includeFontPadding = new CommandAttr<boolean>();
		}
		return this.includeFontPadding.getCommandReturnValue();
	}
	public setIncludeFontPadding(value : boolean) : T {
		this.resetIfRequired();
		if (this.includeFontPadding == null || this.includeFontPadding == undefined) {
			this.includeFontPadding = new CommandAttr<boolean>();
		}
		
		this.includeFontPadding.setSetter(true);
		this.includeFontPadding.setValue(value);
		this.orderSet++;
		this.includeFontPadding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setInputType(...value : InputType[]) : T {
		this.resetIfRequired();
		if (this.inputType == null || this.inputType == undefined) {
			this.inputType = new CommandAttr<InputType[]>();
		}
		
		this.inputType.setSetter(true);
		this.inputType.setValue(value);
		this.orderSet++;
		this.inputType.setOrderSet(this.orderSet);
this.inputType.setTransformer('inputType');		return this.thisPointer;
	}
		

	public tryGetLastBaselineToBottomHeight() : T {
		this.resetIfRequired();
		if (this.lastBaselineToBottomHeight == null || this.lastBaselineToBottomHeight == undefined) {
			this.lastBaselineToBottomHeight = new CommandAttr<string>()
		}
		
		this.lastBaselineToBottomHeight.setGetter(true);
		this.orderGet++;
		this.lastBaselineToBottomHeight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getLastBaselineToBottomHeight() : string {
		if (this.lastBaselineToBottomHeight == null || this.lastBaselineToBottomHeight == undefined) {
			this.lastBaselineToBottomHeight = new CommandAttr<string>();
		}
		return this.lastBaselineToBottomHeight.getCommandReturnValue();
	}
	public setLastBaselineToBottomHeight(value : string) : T {
		this.resetIfRequired();
		if (this.lastBaselineToBottomHeight == null || this.lastBaselineToBottomHeight == undefined) {
			this.lastBaselineToBottomHeight = new CommandAttr<string>();
		}
		
		this.lastBaselineToBottomHeight.setSetter(true);
		this.lastBaselineToBottomHeight.setValue(value);
		this.orderSet++;
		this.lastBaselineToBottomHeight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetLetterSpacing() : T {
		this.resetIfRequired();
		if (this.letterSpacing == null || this.letterSpacing == undefined) {
			this.letterSpacing = new CommandAttr<number>()
		}
		
		this.letterSpacing.setGetter(true);
		this.orderGet++;
		this.letterSpacing.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getLetterSpacing() : number {
		if (this.letterSpacing == null || this.letterSpacing == undefined) {
			this.letterSpacing = new CommandAttr<number>();
		}
		return this.letterSpacing.getCommandReturnValue();
	}
	public setLetterSpacing(value : number) : T {
		this.resetIfRequired();
		if (this.letterSpacing == null || this.letterSpacing == undefined) {
			this.letterSpacing = new CommandAttr<number>();
		}
		
		this.letterSpacing.setSetter(true);
		this.letterSpacing.setValue(value);
		this.orderSet++;
		this.letterSpacing.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetLineHeight() : T {
		this.resetIfRequired();
		if (this.lineHeight == null || this.lineHeight == undefined) {
			this.lineHeight = new CommandAttr<string>()
		}
		
		this.lineHeight.setGetter(true);
		this.orderGet++;
		this.lineHeight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getLineHeight() : string {
		if (this.lineHeight == null || this.lineHeight == undefined) {
			this.lineHeight = new CommandAttr<string>();
		}
		return this.lineHeight.getCommandReturnValue();
	}
	public setLineHeight(value : string) : T {
		this.resetIfRequired();
		if (this.lineHeight == null || this.lineHeight == undefined) {
			this.lineHeight = new CommandAttr<string>();
		}
		
		this.lineHeight.setSetter(true);
		this.lineHeight.setValue(value);
		this.orderSet++;
		this.lineHeight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetLineSpacingExtra() : T {
		this.resetIfRequired();
		if (this.lineSpacingExtra == null || this.lineSpacingExtra == undefined) {
			this.lineSpacingExtra = new CommandAttr<string>()
		}
		
		this.lineSpacingExtra.setGetter(true);
		this.orderGet++;
		this.lineSpacingExtra.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getLineSpacingExtra() : string {
		if (this.lineSpacingExtra == null || this.lineSpacingExtra == undefined) {
			this.lineSpacingExtra = new CommandAttr<string>();
		}
		return this.lineSpacingExtra.getCommandReturnValue();
	}
	public setLineSpacingExtra(value : string) : T {
		this.resetIfRequired();
		if (this.lineSpacingExtra == null || this.lineSpacingExtra == undefined) {
			this.lineSpacingExtra = new CommandAttr<string>();
		}
		
		this.lineSpacingExtra.setSetter(true);
		this.lineSpacingExtra.setValue(value);
		this.orderSet++;
		this.lineSpacingExtra.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetLineSpacingMultiplier() : T {
		this.resetIfRequired();
		if (this.lineSpacingMultiplier == null || this.lineSpacingMultiplier == undefined) {
			this.lineSpacingMultiplier = new CommandAttr<number>()
		}
		
		this.lineSpacingMultiplier.setGetter(true);
		this.orderGet++;
		this.lineSpacingMultiplier.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getLineSpacingMultiplier() : number {
		if (this.lineSpacingMultiplier == null || this.lineSpacingMultiplier == undefined) {
			this.lineSpacingMultiplier = new CommandAttr<number>();
		}
		return this.lineSpacingMultiplier.getCommandReturnValue();
	}
	public setLineSpacingMultiplier(value : number) : T {
		this.resetIfRequired();
		if (this.lineSpacingMultiplier == null || this.lineSpacingMultiplier == undefined) {
			this.lineSpacingMultiplier = new CommandAttr<number>();
		}
		
		this.lineSpacingMultiplier.setSetter(true);
		this.lineSpacingMultiplier.setValue(value);
		this.orderSet++;
		this.lineSpacingMultiplier.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setLines(value : number) : T {
		this.resetIfRequired();
		if (this.lines == null || this.lines == undefined) {
			this.lines = new CommandAttr<number>();
		}
		
		this.lines.setSetter(true);
		this.lines.setValue(value);
		this.orderSet++;
		this.lines.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMaxEms() : T {
		this.resetIfRequired();
		if (this.maxEms == null || this.maxEms == undefined) {
			this.maxEms = new CommandAttr<number>()
		}
		
		this.maxEms.setGetter(true);
		this.orderGet++;
		this.maxEms.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMaxEms() : number {
		if (this.maxEms == null || this.maxEms == undefined) {
			this.maxEms = new CommandAttr<number>();
		}
		return this.maxEms.getCommandReturnValue();
	}
	public setMaxEms(value : number) : T {
		this.resetIfRequired();
		if (this.maxEms == null || this.maxEms == undefined) {
			this.maxEms = new CommandAttr<number>();
		}
		
		this.maxEms.setSetter(true);
		this.maxEms.setValue(value);
		this.orderSet++;
		this.maxEms.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMaxHeight() : T {
		this.resetIfRequired();
		if (this.maxHeight == null || this.maxHeight == undefined) {
			this.maxHeight = new CommandAttr<string>()
		}
		
		this.maxHeight.setGetter(true);
		this.orderGet++;
		this.maxHeight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMaxHeight() : string {
		if (this.maxHeight == null || this.maxHeight == undefined) {
			this.maxHeight = new CommandAttr<string>();
		}
		return this.maxHeight.getCommandReturnValue();
	}
	public setMaxHeight(value : string) : T {
		this.resetIfRequired();
		if (this.maxHeight == null || this.maxHeight == undefined) {
			this.maxHeight = new CommandAttr<string>();
		}
		
		this.maxHeight.setSetter(true);
		this.maxHeight.setValue(value);
		this.orderSet++;
		this.maxHeight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMaxLines() : T {
		this.resetIfRequired();
		if (this.maxLines == null || this.maxLines == undefined) {
			this.maxLines = new CommandAttr<number>()
		}
		
		this.maxLines.setGetter(true);
		this.orderGet++;
		this.maxLines.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMaxLines() : number {
		if (this.maxLines == null || this.maxLines == undefined) {
			this.maxLines = new CommandAttr<number>();
		}
		return this.maxLines.getCommandReturnValue();
	}
	public setMaxLines(value : number) : T {
		this.resetIfRequired();
		if (this.maxLines == null || this.maxLines == undefined) {
			this.maxLines = new CommandAttr<number>();
		}
		
		this.maxLines.setSetter(true);
		this.maxLines.setValue(value);
		this.orderSet++;
		this.maxLines.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMaxWidth() : T {
		this.resetIfRequired();
		if (this.maxWidth == null || this.maxWidth == undefined) {
			this.maxWidth = new CommandAttr<string>()
		}
		
		this.maxWidth.setGetter(true);
		this.orderGet++;
		this.maxWidth.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMaxWidth() : string {
		if (this.maxWidth == null || this.maxWidth == undefined) {
			this.maxWidth = new CommandAttr<string>();
		}
		return this.maxWidth.getCommandReturnValue();
	}
	public setMaxWidth(value : string) : T {
		this.resetIfRequired();
		if (this.maxWidth == null || this.maxWidth == undefined) {
			this.maxWidth = new CommandAttr<string>();
		}
		
		this.maxWidth.setSetter(true);
		this.maxWidth.setValue(value);
		this.orderSet++;
		this.maxWidth.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMinEms() : T {
		this.resetIfRequired();
		if (this.minEms == null || this.minEms == undefined) {
			this.minEms = new CommandAttr<number>()
		}
		
		this.minEms.setGetter(true);
		this.orderGet++;
		this.minEms.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMinEms() : number {
		if (this.minEms == null || this.minEms == undefined) {
			this.minEms = new CommandAttr<number>();
		}
		return this.minEms.getCommandReturnValue();
	}
	public setMinEms(value : number) : T {
		this.resetIfRequired();
		if (this.minEms == null || this.minEms == undefined) {
			this.minEms = new CommandAttr<number>();
		}
		
		this.minEms.setSetter(true);
		this.minEms.setValue(value);
		this.orderSet++;
		this.minEms.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMinHeight() : T {
		this.resetIfRequired();
		if (this.minHeight == null || this.minHeight == undefined) {
			this.minHeight = new CommandAttr<string>()
		}
		
		this.minHeight.setGetter(true);
		this.orderGet++;
		this.minHeight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMinHeight() : string {
		if (this.minHeight == null || this.minHeight == undefined) {
			this.minHeight = new CommandAttr<string>();
		}
		return this.minHeight.getCommandReturnValue();
	}
	public setMinHeight(value : string) : T {
		this.resetIfRequired();
		if (this.minHeight == null || this.minHeight == undefined) {
			this.minHeight = new CommandAttr<string>();
		}
		
		this.minHeight.setSetter(true);
		this.minHeight.setValue(value);
		this.orderSet++;
		this.minHeight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMinLines() : T {
		this.resetIfRequired();
		if (this.minLines == null || this.minLines == undefined) {
			this.minLines = new CommandAttr<number>()
		}
		
		this.minLines.setGetter(true);
		this.orderGet++;
		this.minLines.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMinLines() : number {
		if (this.minLines == null || this.minLines == undefined) {
			this.minLines = new CommandAttr<number>();
		}
		return this.minLines.getCommandReturnValue();
	}
	public setMinLines(value : number) : T {
		this.resetIfRequired();
		if (this.minLines == null || this.minLines == undefined) {
			this.minLines = new CommandAttr<number>();
		}
		
		this.minLines.setSetter(true);
		this.minLines.setValue(value);
		this.orderSet++;
		this.minLines.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetMinWidth() : T {
		this.resetIfRequired();
		if (this.minWidth == null || this.minWidth == undefined) {
			this.minWidth = new CommandAttr<string>()
		}
		
		this.minWidth.setGetter(true);
		this.orderGet++;
		this.minWidth.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getMinWidth() : string {
		if (this.minWidth == null || this.minWidth == undefined) {
			this.minWidth = new CommandAttr<string>();
		}
		return this.minWidth.getCommandReturnValue();
	}
	public setMinWidth(value : string) : T {
		this.resetIfRequired();
		if (this.minWidth == null || this.minWidth == undefined) {
			this.minWidth = new CommandAttr<string>();
		}
		
		this.minWidth.setSetter(true);
		this.minWidth.setValue(value);
		this.orderSet++;
		this.minWidth.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPrivateImeOptions() : T {
		this.resetIfRequired();
		if (this.privateImeOptions == null || this.privateImeOptions == undefined) {
			this.privateImeOptions = new CommandAttr<string>()
		}
		
		this.privateImeOptions.setGetter(true);
		this.orderGet++;
		this.privateImeOptions.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPrivateImeOptions() : string {
		if (this.privateImeOptions == null || this.privateImeOptions == undefined) {
			this.privateImeOptions = new CommandAttr<string>();
		}
		return this.privateImeOptions.getCommandReturnValue();
	}
	public setPrivateImeOptions(value : string) : T {
		this.resetIfRequired();
		if (this.privateImeOptions == null || this.privateImeOptions == undefined) {
			this.privateImeOptions = new CommandAttr<string>();
		}
		
		this.privateImeOptions.setSetter(true);
		this.privateImeOptions.setValue(value);
		this.orderSet++;
		this.privateImeOptions.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setScrollHorizontally(value : boolean) : T {
		this.resetIfRequired();
		if (this.scrollHorizontally == null || this.scrollHorizontally == undefined) {
			this.scrollHorizontally = new CommandAttr<boolean>();
		}
		
		this.scrollHorizontally.setSetter(true);
		this.scrollHorizontally.setValue(value);
		this.orderSet++;
		this.scrollHorizontally.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSelectAllOnFocus(value : boolean) : T {
		this.resetIfRequired();
		if (this.selectAllOnFocus == null || this.selectAllOnFocus == undefined) {
			this.selectAllOnFocus = new CommandAttr<boolean>();
		}
		
		this.selectAllOnFocus.setSetter(true);
		this.selectAllOnFocus.setValue(value);
		this.orderSet++;
		this.selectAllOnFocus.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetShadowColor() : T {
		this.resetIfRequired();
		if (this.shadowColor == null || this.shadowColor == undefined) {
			this.shadowColor = new CommandAttr<string>()
		}
		
		this.shadowColor.setGetter(true);
		this.orderGet++;
		this.shadowColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getShadowColor() : string {
		if (this.shadowColor == null || this.shadowColor == undefined) {
			this.shadowColor = new CommandAttr<string>();
		}
		return this.shadowColor.getCommandReturnValue();
	}
	public setShadowColor(value : string) : T {
		this.resetIfRequired();
		if (this.shadowColor == null || this.shadowColor == undefined) {
			this.shadowColor = new CommandAttr<string>();
		}
		
		this.shadowColor.setSetter(true);
		this.shadowColor.setValue(value);
		this.orderSet++;
		this.shadowColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetShadowDx() : T {
		this.resetIfRequired();
		if (this.shadowDx == null || this.shadowDx == undefined) {
			this.shadowDx = new CommandAttr<number>()
		}
		
		this.shadowDx.setGetter(true);
		this.orderGet++;
		this.shadowDx.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getShadowDx() : number {
		if (this.shadowDx == null || this.shadowDx == undefined) {
			this.shadowDx = new CommandAttr<number>();
		}
		return this.shadowDx.getCommandReturnValue();
	}
	public setShadowDx(value : number) : T {
		this.resetIfRequired();
		if (this.shadowDx == null || this.shadowDx == undefined) {
			this.shadowDx = new CommandAttr<number>();
		}
		
		this.shadowDx.setSetter(true);
		this.shadowDx.setValue(value);
		this.orderSet++;
		this.shadowDx.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetShadowDy() : T {
		this.resetIfRequired();
		if (this.shadowDy == null || this.shadowDy == undefined) {
			this.shadowDy = new CommandAttr<number>()
		}
		
		this.shadowDy.setGetter(true);
		this.orderGet++;
		this.shadowDy.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getShadowDy() : number {
		if (this.shadowDy == null || this.shadowDy == undefined) {
			this.shadowDy = new CommandAttr<number>();
		}
		return this.shadowDy.getCommandReturnValue();
	}
	public setShadowDy(value : number) : T {
		this.resetIfRequired();
		if (this.shadowDy == null || this.shadowDy == undefined) {
			this.shadowDy = new CommandAttr<number>();
		}
		
		this.shadowDy.setSetter(true);
		this.shadowDy.setValue(value);
		this.orderSet++;
		this.shadowDy.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetShadowRadius() : T {
		this.resetIfRequired();
		if (this.shadowRadius == null || this.shadowRadius == undefined) {
			this.shadowRadius = new CommandAttr<number>()
		}
		
		this.shadowRadius.setGetter(true);
		this.orderGet++;
		this.shadowRadius.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getShadowRadius() : number {
		if (this.shadowRadius == null || this.shadowRadius == undefined) {
			this.shadowRadius = new CommandAttr<number>();
		}
		return this.shadowRadius.getCommandReturnValue();
	}
	public setShadowRadius(value : number) : T {
		this.resetIfRequired();
		if (this.shadowRadius == null || this.shadowRadius == undefined) {
			this.shadowRadius = new CommandAttr<number>();
		}
		
		this.shadowRadius.setSetter(true);
		this.shadowRadius.setValue(value);
		this.orderSet++;
		this.shadowRadius.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSingleLine(value : boolean) : T {
		this.resetIfRequired();
		if (this.singleLine == null || this.singleLine == undefined) {
			this.singleLine = new CommandAttr<boolean>();
		}
		
		this.singleLine.setSetter(true);
		this.singleLine.setValue(value);
		this.orderSet++;
		this.singleLine.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTextColor() : T {
		this.resetIfRequired();
		if (this.textColor == null || this.textColor == undefined) {
			this.textColor = new CommandAttr<string>()
		}
		
		this.textColor.setGetter(true);
		this.orderGet++;
		this.textColor.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTextColor() : string {
		if (this.textColor == null || this.textColor == undefined) {
			this.textColor = new CommandAttr<string>();
		}
		return this.textColor.getCommandReturnValue();
	}
	public setTextColor(value : string) : T {
		this.resetIfRequired();
		if (this.textColor == null || this.textColor == undefined) {
			this.textColor = new CommandAttr<string>();
		}
		
		this.textColor.setSetter(true);
		this.textColor.setValue(value);
		this.orderSet++;
		this.textColor.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTextColorHighlight() : T {
		this.resetIfRequired();
		if (this.textColorHighlight == null || this.textColorHighlight == undefined) {
			this.textColorHighlight = new CommandAttr<string>()
		}
		
		this.textColorHighlight.setGetter(true);
		this.orderGet++;
		this.textColorHighlight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTextColorHighlight() : string {
		if (this.textColorHighlight == null || this.textColorHighlight == undefined) {
			this.textColorHighlight = new CommandAttr<string>();
		}
		return this.textColorHighlight.getCommandReturnValue();
	}
	public setTextColorHighlight(value : string) : T {
		this.resetIfRequired();
		if (this.textColorHighlight == null || this.textColorHighlight == undefined) {
			this.textColorHighlight = new CommandAttr<string>();
		}
		
		this.textColorHighlight.setSetter(true);
		this.textColorHighlight.setValue(value);
		this.orderSet++;
		this.textColorHighlight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTextColorHint(value : string) : T {
		this.resetIfRequired();
		if (this.textColorHint == null || this.textColorHint == undefined) {
			this.textColorHint = new CommandAttr<string>();
		}
		
		this.textColorHint.setSetter(true);
		this.textColorHint.setValue(value);
		this.orderSet++;
		this.textColorHint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTextIsSelectable() : T {
		this.resetIfRequired();
		if (this.textIsSelectable == null || this.textIsSelectable == undefined) {
			this.textIsSelectable = new CommandAttr<boolean>()
		}
		
		this.textIsSelectable.setGetter(true);
		this.orderGet++;
		this.textIsSelectable.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public isTextIsSelectable() : boolean {
		if (this.textIsSelectable == null || this.textIsSelectable == undefined) {
			this.textIsSelectable = new CommandAttr<boolean>();
		}
		return this.textIsSelectable.getCommandReturnValue();
	}
	public setTextIsSelectable(value : boolean) : T {
		this.resetIfRequired();
		if (this.textIsSelectable == null || this.textIsSelectable == undefined) {
			this.textIsSelectable = new CommandAttr<boolean>();
		}
		
		this.textIsSelectable.setSetter(true);
		this.textIsSelectable.setValue(value);
		this.orderSet++;
		this.textIsSelectable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTextScaleX() : T {
		this.resetIfRequired();
		if (this.textScaleX == null || this.textScaleX == undefined) {
			this.textScaleX = new CommandAttr<number>()
		}
		
		this.textScaleX.setGetter(true);
		this.orderGet++;
		this.textScaleX.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTextScaleX() : number {
		if (this.textScaleX == null || this.textScaleX == undefined) {
			this.textScaleX = new CommandAttr<number>();
		}
		return this.textScaleX.getCommandReturnValue();
	}
	public setTextScaleX(value : number) : T {
		this.resetIfRequired();
		if (this.textScaleX == null || this.textScaleX == undefined) {
			this.textScaleX = new CommandAttr<number>();
		}
		
		this.textScaleX.setSetter(true);
		this.textScaleX.setValue(value);
		this.orderSet++;
		this.textScaleX.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetWidth() : T {
		this.resetIfRequired();
		if (this.width == null || this.width == undefined) {
			this.width = new CommandAttr<string>()
		}
		
		this.width.setGetter(true);
		this.orderGet++;
		this.width.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getWidth() : string {
		if (this.width == null || this.width == undefined) {
			this.width = new CommandAttr<string>();
		}
		return this.width.getCommandReturnValue();
	}
	public setWidth(value : string) : T {
		this.resetIfRequired();
		if (this.width == null || this.width == undefined) {
			this.width = new CommandAttr<string>();
		}
		
		this.width.setSetter(true);
		this.width.setValue(value);
		this.orderSet++;
		this.width.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnafterTextChange(value : string) : T {
		this.resetIfRequired();
		if (this.onafterTextChange == null || this.onafterTextChange == undefined) {
			this.onafterTextChange = new CommandAttr<string>();
		}
		
		this.onafterTextChange.setSetter(true);
		this.onafterTextChange.setValue(value);
		this.orderSet++;
		this.onafterTextChange.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnbeforeTextChange(value : string) : T {
		this.resetIfRequired();
		if (this.onbeforeTextChange == null || this.onbeforeTextChange == undefined) {
			this.onbeforeTextChange = new CommandAttr<string>();
		}
		
		this.onbeforeTextChange.setSetter(true);
		this.onbeforeTextChange.setValue(value);
		this.orderSet++;
		this.onbeforeTextChange.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnTextChange(value : string) : T {
		this.resetIfRequired();
		if (this.onTextChange == null || this.onTextChange == undefined) {
			this.onTextChange = new CommandAttr<string>();
		}
		
		this.onTextChange.setSetter(true);
		this.onTextChange.setValue(value);
		this.orderSet++;
		this.onTextChange.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setOnEditorAction(value : string) : T {
		this.resetIfRequired();
		if (this.onEditorAction == null || this.onEditorAction == undefined) {
			this.onEditorAction = new CommandAttr<string>();
		}
		
		this.onEditorAction.setSetter(true);
		this.onEditorAction.setValue(value);
		this.orderSet++;
		this.onEditorAction.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setCapitalize(value : Capitalize) : T {
		this.resetIfRequired();
		if (this.capitalize == null || this.capitalize == undefined) {
			this.capitalize = new CommandAttr<Capitalize>();
		}
		
		this.capitalize.setSetter(true);
		this.capitalize.setValue(value);
		this.orderSet++;
		this.capitalize.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setPhoneNumber(value : boolean) : T {
		this.resetIfRequired();
		if (this.phoneNumber == null || this.phoneNumber == undefined) {
			this.phoneNumber = new CommandAttr<boolean>();
		}
		
		this.phoneNumber.setSetter(true);
		this.phoneNumber.setValue(value);
		this.orderSet++;
		this.phoneNumber.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setNumeric(...value : Numeric[]) : T {
		this.resetIfRequired();
		if (this.numeric == null || this.numeric == undefined) {
			this.numeric = new CommandAttr<Numeric[]>();
		}
		
		this.numeric.setSetter(true);
		this.numeric.setValue(value);
		this.orderSet++;
		this.numeric.setOrderSet(this.orderSet);
this.numeric.setTransformer('numeric');		return this.thisPointer;
	}
		

	public setDigits(value : string) : T {
		this.resetIfRequired();
		if (this.digits == null || this.digits == undefined) {
			this.digits = new CommandAttr<string>();
		}
		
		this.digits.setSetter(true);
		this.digits.setValue(value);
		this.orderSet++;
		this.digits.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setEditorExtras(value : string) : T {
		this.resetIfRequired();
		if (this.editorExtras == null || this.editorExtras == undefined) {
			this.editorExtras = new CommandAttr<string>();
		}
		
		this.editorExtras.setSetter(true);
		this.editorExtras.setValue(value);
		this.orderSet++;
		this.editorExtras.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setAutoText(value : boolean) : T {
		this.resetIfRequired();
		if (this.autoText == null || this.autoText == undefined) {
			this.autoText = new CommandAttr<boolean>();
		}
		
		this.autoText.setSetter(true);
		this.autoText.setValue(value);
		this.orderSet++;
		this.autoText.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTextAllCaps(value : boolean) : T {
		this.resetIfRequired();
		if (this.textAllCaps == null || this.textAllCaps == undefined) {
			this.textAllCaps = new CommandAttr<boolean>();
		}
		
		this.textAllCaps.setSetter(true);
		this.textAllCaps.setValue(value);
		this.orderSet++;
		this.textAllCaps.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSetFocus(value : boolean) : T {
		this.resetIfRequired();
		if (this.setFocus == null || this.setFocus == undefined) {
			this.setFocus = new CommandAttr<boolean>();
		}
		
		this.setFocus.setSetter(true);
		this.setFocus.setValue(value);
		this.orderSet++;
		this.setFocus.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public selectAll(value : boolean) : T {
		this.resetIfRequired();
		if (this.selectAll_ == null || this.selectAll_ == undefined) {
			this.selectAll_ = new CommandAttr<boolean>();
		}
		
		this.selectAll_.setSetter(true);
		this.selectAll_.setValue(value);
		this.orderSet++;
		this.selectAll_.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setHintTextFormat(value : string) : T {
		this.resetIfRequired();
		if (this.hintTextFormat == null || this.hintTextFormat == undefined) {
			this.hintTextFormat = new CommandAttr<string>();
		}
		
		this.hintTextFormat.setSetter(true);
		this.hintTextFormat.setValue(value);
		this.orderSet++;
		this.hintTextFormat.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetText() : T {
		this.resetIfRequired();
		if (this.text == null || this.text == undefined) {
			this.text = new CommandAttr<string>()
		}
		
		this.text.setGetter(true);
		this.orderGet++;
		this.text.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getText() : string {
		if (this.text == null || this.text == undefined) {
			this.text = new CommandAttr<string>();
		}
		return this.text.getCommandReturnValue();
	}
	public setText(value : string) : T {
		this.resetIfRequired();
		if (this.text == null || this.text == undefined) {
			this.text = new CommandAttr<string>();
		}
		
		this.text.setSetter(true);
		this.text.setValue(value);
		this.orderSet++;
		this.text.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetTextSize() : T {
		this.resetIfRequired();
		if (this.textSize == null || this.textSize == undefined) {
			this.textSize = new CommandAttr<string>()
		}
		
		this.textSize.setGetter(true);
		this.orderGet++;
		this.textSize.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getTextSize() : string {
		if (this.textSize == null || this.textSize == undefined) {
			this.textSize = new CommandAttr<string>();
		}
		return this.textSize.getCommandReturnValue();
	}
	public setTextSize(value : string) : T {
		this.resetIfRequired();
		if (this.textSize == null || this.textSize == undefined) {
			this.textSize = new CommandAttr<string>();
		}
		
		this.textSize.setSetter(true);
		this.textSize.setValue(value);
		this.orderSet++;
		this.textSize.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableStart(value : string) : T {
		this.resetIfRequired();
		if (this.drawableStart == null || this.drawableStart == undefined) {
			this.drawableStart = new CommandAttr<string>();
		}
		
		this.drawableStart.setSetter(true);
		this.drawableStart.setValue(value);
		this.orderSet++;
		this.drawableStart.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableEnd(value : string) : T {
		this.resetIfRequired();
		if (this.drawableEnd == null || this.drawableEnd == undefined) {
			this.drawableEnd = new CommandAttr<string>();
		}
		
		this.drawableEnd.setSetter(true);
		this.drawableEnd.setValue(value);
		this.orderSet++;
		this.drawableEnd.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableTop(value : string) : T {
		this.resetIfRequired();
		if (this.drawableTop == null || this.drawableTop == undefined) {
			this.drawableTop = new CommandAttr<string>();
		}
		
		this.drawableTop.setSetter(true);
		this.drawableTop.setValue(value);
		this.orderSet++;
		this.drawableTop.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableBottom(value : string) : T {
		this.resetIfRequired();
		if (this.drawableBottom == null || this.drawableBottom == undefined) {
			this.drawableBottom = new CommandAttr<string>();
		}
		
		this.drawableBottom.setSetter(true);
		this.drawableBottom.setValue(value);
		this.orderSet++;
		this.drawableBottom.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setMaxLength(value : number) : T {
		this.resetIfRequired();
		if (this.maxLength == null || this.maxLength == undefined) {
			this.maxLength = new CommandAttr<number>();
		}
		
		this.maxLength.setSetter(true);
		this.maxLength.setValue(value);
		this.orderSet++;
		this.maxLength.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTypeface(value : string) : T {
		this.resetIfRequired();
		if (this.typeface == null || this.typeface == undefined) {
			this.typeface = new CommandAttr<string>();
		}
		
		this.typeface.setSetter(true);
		this.typeface.setValue(value);
		this.orderSet++;
		this.typeface.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTextStyle(...value : TextStyle[]) : T {
		this.resetIfRequired();
		if (this.textStyle == null || this.textStyle == undefined) {
			this.textStyle = new CommandAttr<TextStyle[]>();
		}
		
		this.textStyle.setSetter(true);
		this.textStyle.setValue(value);
		this.orderSet++;
		this.textStyle.setOrderSet(this.orderSet);
this.textStyle.setTransformer('textStyle');		return this.thisPointer;
	}
		

	public setFontFamily(value : string) : T {
		this.resetIfRequired();
		if (this.fontFamily == null || this.fontFamily == undefined) {
			this.fontFamily = new CommandAttr<string>();
		}
		
		this.fontFamily.setSetter(true);
		this.fontFamily.setValue(value);
		this.orderSet++;
		this.fontFamily.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setSystemTextAppearance(value : string) : T {
		this.resetIfRequired();
		if (this.systemTextAppearance == null || this.systemTextAppearance == undefined) {
			this.systemTextAppearance = new CommandAttr<string>();
		}
		
		this.systemTextAppearance.setSetter(true);
		this.systemTextAppearance.setValue(value);
		this.orderSet++;
		this.systemTextAppearance.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setTextAppearance(value : string) : T {
		this.resetIfRequired();
		if (this.textAppearance == null || this.textAppearance == undefined) {
			this.textAppearance = new CommandAttr<string>();
		}
		
		this.textAppearance.setSetter(true);
		this.textAppearance.setValue(value);
		this.orderSet++;
		this.textAppearance.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setPassword(value : boolean) : T {
		this.resetIfRequired();
		if (this.password == null || this.password == undefined) {
			this.password = new CommandAttr<boolean>();
		}
		
		this.password.setSetter(true);
		this.password.setValue(value);
		this.orderSet++;
		this.password.setOrderSet(this.orderSet);
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
		

	public setEditable(value : boolean) : T {
		this.resetIfRequired();
		if (this.editable == null || this.editable == undefined) {
			this.editable = new CommandAttr<boolean>();
		}
		
		this.editable.setSetter(true);
		this.editable.setValue(value);
		this.orderSet++;
		this.editable.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableTint(value : string) : T {
		this.resetIfRequired();
		if (this.drawableTint == null || this.drawableTint == undefined) {
			this.drawableTint = new CommandAttr<string>();
		}
		
		this.drawableTint.setSetter(true);
		this.drawableTint.setValue(value);
		this.orderSet++;
		this.drawableTint.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableTintMode(value : DrawableTintMode) : T {
		this.resetIfRequired();
		if (this.drawableTintMode == null || this.drawableTintMode == undefined) {
			this.drawableTintMode = new CommandAttr<DrawableTintMode>();
		}
		
		this.drawableTintMode.setSetter(true);
		this.drawableTintMode.setValue(value);
		this.orderSet++;
		this.drawableTintMode.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setPadding(value : string) : T {
		this.resetIfRequired();
		if (this.padding == null || this.padding == undefined) {
			this.padding = new CommandAttr<string>();
		}
		
		this.padding.setSetter(true);
		this.padding.setValue(value);
		this.orderSet++;
		this.padding.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPaddingBottom() : T {
		this.resetIfRequired();
		if (this.paddingBottom == null || this.paddingBottom == undefined) {
			this.paddingBottom = new CommandAttr<string>()
		}
		
		this.paddingBottom.setGetter(true);
		this.orderGet++;
		this.paddingBottom.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPaddingBottom() : string {
		if (this.paddingBottom == null || this.paddingBottom == undefined) {
			this.paddingBottom = new CommandAttr<string>();
		}
		return this.paddingBottom.getCommandReturnValue();
	}
	public setPaddingBottom(value : string) : T {
		this.resetIfRequired();
		if (this.paddingBottom == null || this.paddingBottom == undefined) {
			this.paddingBottom = new CommandAttr<string>();
		}
		
		this.paddingBottom.setSetter(true);
		this.paddingBottom.setValue(value);
		this.orderSet++;
		this.paddingBottom.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPaddingRight() : T {
		this.resetIfRequired();
		if (this.paddingRight == null || this.paddingRight == undefined) {
			this.paddingRight = new CommandAttr<string>()
		}
		
		this.paddingRight.setGetter(true);
		this.orderGet++;
		this.paddingRight.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPaddingRight() : string {
		if (this.paddingRight == null || this.paddingRight == undefined) {
			this.paddingRight = new CommandAttr<string>();
		}
		return this.paddingRight.getCommandReturnValue();
	}
	public setPaddingRight(value : string) : T {
		this.resetIfRequired();
		if (this.paddingRight == null || this.paddingRight == undefined) {
			this.paddingRight = new CommandAttr<string>();
		}
		
		this.paddingRight.setSetter(true);
		this.paddingRight.setValue(value);
		this.orderSet++;
		this.paddingRight.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPaddingLeft() : T {
		this.resetIfRequired();
		if (this.paddingLeft == null || this.paddingLeft == undefined) {
			this.paddingLeft = new CommandAttr<string>()
		}
		
		this.paddingLeft.setGetter(true);
		this.orderGet++;
		this.paddingLeft.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPaddingLeft() : string {
		if (this.paddingLeft == null || this.paddingLeft == undefined) {
			this.paddingLeft = new CommandAttr<string>();
		}
		return this.paddingLeft.getCommandReturnValue();
	}
	public setPaddingLeft(value : string) : T {
		this.resetIfRequired();
		if (this.paddingLeft == null || this.paddingLeft == undefined) {
			this.paddingLeft = new CommandAttr<string>();
		}
		
		this.paddingLeft.setSetter(true);
		this.paddingLeft.setValue(value);
		this.orderSet++;
		this.paddingLeft.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPaddingStart() : T {
		this.resetIfRequired();
		if (this.paddingStart == null || this.paddingStart == undefined) {
			this.paddingStart = new CommandAttr<string>()
		}
		
		this.paddingStart.setGetter(true);
		this.orderGet++;
		this.paddingStart.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPaddingStart() : string {
		if (this.paddingStart == null || this.paddingStart == undefined) {
			this.paddingStart = new CommandAttr<string>();
		}
		return this.paddingStart.getCommandReturnValue();
	}
	public setPaddingStart(value : string) : T {
		this.resetIfRequired();
		if (this.paddingStart == null || this.paddingStart == undefined) {
			this.paddingStart = new CommandAttr<string>();
		}
		
		this.paddingStart.setSetter(true);
		this.paddingStart.setValue(value);
		this.orderSet++;
		this.paddingStart.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPaddingEnd() : T {
		this.resetIfRequired();
		if (this.paddingEnd == null || this.paddingEnd == undefined) {
			this.paddingEnd = new CommandAttr<string>()
		}
		
		this.paddingEnd.setGetter(true);
		this.orderGet++;
		this.paddingEnd.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPaddingEnd() : string {
		if (this.paddingEnd == null || this.paddingEnd == undefined) {
			this.paddingEnd = new CommandAttr<string>();
		}
		return this.paddingEnd.getCommandReturnValue();
	}
	public setPaddingEnd(value : string) : T {
		this.resetIfRequired();
		if (this.paddingEnd == null || this.paddingEnd == undefined) {
			this.paddingEnd = new CommandAttr<string>();
		}
		
		this.paddingEnd.setSetter(true);
		this.paddingEnd.setValue(value);
		this.orderSet++;
		this.paddingEnd.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public tryGetPaddingTop() : T {
		this.resetIfRequired();
		if (this.paddingTop == null || this.paddingTop == undefined) {
			this.paddingTop = new CommandAttr<string>()
		}
		
		this.paddingTop.setGetter(true);
		this.orderGet++;
		this.paddingTop.setOrderGet(this.orderGet);
		return this.thisPointer;
	}
	
	public getPaddingTop() : string {
		if (this.paddingTop == null || this.paddingTop == undefined) {
			this.paddingTop = new CommandAttr<string>();
		}
		return this.paddingTop.getCommandReturnValue();
	}
	public setPaddingTop(value : string) : T {
		this.resetIfRequired();
		if (this.paddingTop == null || this.paddingTop == undefined) {
			this.paddingTop = new CommandAttr<string>();
		}
		
		this.paddingTop.setSetter(true);
		this.paddingTop.setValue(value);
		this.orderSet++;
		this.paddingTop.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setPaddingHorizontal(value : string) : T {
		this.resetIfRequired();
		if (this.paddingHorizontal == null || this.paddingHorizontal == undefined) {
			this.paddingHorizontal = new CommandAttr<string>();
		}
		
		this.paddingHorizontal.setSetter(true);
		this.paddingHorizontal.setValue(value);
		this.orderSet++;
		this.paddingHorizontal.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setPaddingVertical(value : string) : T {
		this.resetIfRequired();
		if (this.paddingVertical == null || this.paddingVertical == undefined) {
			this.paddingVertical = new CommandAttr<string>();
		}
		
		this.paddingVertical.setSetter(true);
		this.paddingVertical.setValue(value);
		this.orderSet++;
		this.paddingVertical.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		

	public setDrawableIconSize(value : string) : T {
		this.resetIfRequired();
		if (this.drawableIconSize == null || this.drawableIconSize == undefined) {
			this.drawableIconSize = new CommandAttr<string>();
		}
		
		this.drawableIconSize.setSetter(true);
		this.drawableIconSize.setValue(value);
		this.orderSet++;
		this.drawableIconSize.setOrderSet(this.orderSet);
		return this.thisPointer;
	}
		
	//end - body

}
	
//start - staticinit

export class TextInputEditText extends TextInputEditTextImpl<TextInputEditText> implements IWidget{
    getThisPointer(): TextInputEditText {
        return this;
    }
    
   	public getClass() {
		return TextInputEditText;
	}
	
   	constructor(id: string, path: string[], event: string) {
		super(id, path, event);	
	}
}

TextInputEditTextImpl.initialize();
export interface OnafterTextChangeEvent extends Event{
        //s:Editable;


}
export interface OnbeforeTextChangeEvent extends Event{
        //s:CharSequence;

	        start:number;
	        count:number;
	        after:number;

}
export interface OnTextChangeEvent extends Event{
        //s:CharSequence;

	        start:number;
	        before:number;
	        count:number;

}
export interface OnEditorActionEvent extends Event{
        //v:TextView;

	        actionId:number;
        //event:KeyEvent;
        		eventInfo: KeyEvent;


}

//end - staticinit
