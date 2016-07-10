package basegems.data;

/**
 * 
 * @author Jasmine Iwanek
 *
 */
public abstract class DataConstants {

	public static final String defaultOreSpawnJSON = "{"
+ "\n	\"dimensions\":["
+ "\n		{"
+ "\n			\"dimension\":\"+\","
+ "\n			\"__comment\":\""
+ "dimension 0 for overworld, -1 for the nether, 1 for the end, other numbers "
+ "for dimensions added by other mods, and + for any dimension not already "
+ "described by this file.\","
+ "\n			\"ores\":["
+ "\n				{"
+ "\n					\"__comment\":\"These settings are roughly equivalent to the "
+ "parameters of the CUSTOM world json: blockID = the unlocalized name of a "
+ "block in the format 'ModID:blockName',blockMeta = the meta data value for "
+ "the block (optional),size = number of blocks to spawn per ore deposit, "
+ "variation = vary the size of deposits by +/- this amount, frequency = number "
+ "of deposits per chunk (can be less than 1, e.g. 0.5 for 1 deposit every 2 "
+ "chunks), minHeight = minimum spawn height, maxHeight = maximum spawn height, "
+ "biomes = array of biomes to spawn this ore in (if empty or absent, the ore "
+ "will spawn in all biomes). Note that the size values in the Minecraft CUSTOM "
+ "world json do not represent the actual number of blocks spawned, where-as the "
+ "size value here does represent actual number of blocks. \","
+ "\n					\"blockID\":\"basegems:template_ore\","
+ "\n					\"size\":8,"
+ "\n					\"variation\":4,"
+ "\n					\"frequency\":10,"
+ "\n					\"minHeight\":0,"
+ "\n					\"maxHeight\":96"
+ "\n				},"
+ "\n			]"
+ "\n		}"
+ "\n	]"
+ "\n}";
}
