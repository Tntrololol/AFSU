package xbony2.afsu;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	public static String afsutexture;
	public static String afbtexture;
	
	private static final String[] usableValuesAFSU = {"default", "blue", "yellow", "black", "old"};
	private static final String[] usableValuesAFB = {"default"};
	
	private static final String WARNING = "DO NOT CHANGE THIS IF YOU DONT KNOW WHAT YOU ARE DOING";
	
	public static int AFSUxSize;
	public static int AFSUySize;
	public static int AFSUGuiButtonid1;
	public static int AFSUGuiButtonxpart;
	public static int AFSUGuiButtonypart;
	public static int AFSUGuiButtonw;
	public static int AFSUGuiButtonh;
	public static boolean AFSUGuiButtonDrawQuantity1;
	public static int AFSUTextColor;
	public static int AFSUyName;
	public static int AFSUxLevel;
	public static int AFSUyLevel;
	public static int AFSUxEnergy;
	public static int AFSUyEnergy;
	public static int AFSUxEnergy2;
	public static int AFSUyEnergy2;
	public static int AFSUxEnergy3;
	public static int AFSUyEnergy3;
	public static int AFSUToolTipminx;
	public static int AFSUToolTipminy;
	public static int AFSUToolTipmaxx;
	public static int AFSUToolTipmaxy;
	
	public static void init(File file){
		Configuration config = new Configuration(file);
		
		config.load();
		{
			afsutexture = config.getString("AFSU Texture", "Textures", "default", "Changes the texture of the AFSU. Possible values: default, blue, yellow, black, old", usableValuesAFSU);
			afbtexture = config.getString("AFB Texture", "Textures", "default", "Changes the texture of the AFB. Possible values: default", usableValuesAFB);
			AFSUxSize = config.getInt("xSize", "GUI", 176, 0, Integer.MAX_VALUE, WARNING);
			AFSUySize = config.getInt("ySize", "GUI", 166, 0, Integer.MAX_VALUE, WARNING);
			AFSUGuiButtonid1 = config.getInt("GuiButtonid1", "GUI", 0, Integer.MIN_VALUE, Integer.MAX_VALUE, WARNING);
			AFSUGuiButtonxpart = config.getInt("GuiButtonXPart", "GUI", 10, Integer.MIN_VALUE, Integer.MAX_VALUE, WARNING);
			AFSUGuiButtonypart = config.getInt("GuiButtonYPart", "GUI", 7, Integer.MIN_VALUE, Integer.MAX_VALUE, WARNING);
			AFSUGuiButtonw = config.getInt("GuiButtonW", "GUI", 20, 0, Integer.MAX_VALUE, WARNING);
			AFSUGuiButtonh = config.getInt("GuiButtonH", "GUI", 20, 0, Integer.MAX_VALUE, WARNING);
			AFSUGuiButtonDrawQuantity1 = config.getBoolean("GuiButtonDrawQuantity1", "GUI", true, WARNING);
			AFSUTextColor = config.getInt("textColor", "GUI", 16448255, Integer.MIN_VALUE, Integer.MAX_VALUE, WARNING);
			AFSUyName = config.getInt("yName", "GUI", 8, 0, Integer.MAX_VALUE, WARNING);
			AFSUxLevel = config.getInt("xLevel", "GUI", 16, 0, Integer.MAX_VALUE, WARNING);
			AFSUyLevel = config.getInt("yLevel", "GUI", 29, 0, Integer.MAX_VALUE, WARNING);
			AFSUxEnergy = config.getInt("xEnergy", "GUI", 37, 0, Integer.MAX_VALUE, WARNING);
			AFSUyEnergy = config.getInt("yEnergy", "GUI", 39, 0, Integer.MAX_VALUE, WARNING);
			AFSUxEnergy2 = config.getInt("xEnergy2", "GUI", 37, 0, Integer.MAX_VALUE, WARNING);
			AFSUyEnergy2 = config.getInt("yEnergy2", "GUI", 49, 0, Integer.MAX_VALUE, WARNING);
			AFSUxEnergy3 = config.getInt("xEnergy3", "GUI", 26, 0, Integer.MAX_VALUE, WARNING);
			AFSUyEnergy3 = config.getInt("yEnergy3", "GUI", 60, 0, Integer.MAX_VALUE, WARNING);
			AFSUToolTipminx = config.getInt("toolTipMinX", "GUI", 10, 0, Integer.MAX_VALUE, WARNING);
			AFSUToolTipminy = config.getInt("toolTipMinY", "GUI", 7, 0, Integer.MAX_VALUE, WARNING);
			AFSUToolTipmaxx = config.getInt("toolTipMaxX", "GUI", 29, 0, Integer.MAX_VALUE, WARNING);
			AFSUToolTipmaxy = config.getInt("toolTipMaxY", "GUI", 26, 0, Integer.MAX_VALUE, WARNING);
		}
		config.save();
	}
}
