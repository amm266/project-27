package Moudle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
public class Load {
	public static void saveAccounts () {
	}
	public static void loadMinionAndHeros() throws FileNotFoundException {
		Gson gson = CreatGson.getGson ();
		Reader reader = new FileReader ( "MinionAndHeros.json" );
		MinionAndHeroTmp tmp = gson.fromJson ( reader, MinionAndHeroTmp.class);
		MinionAndHero.setMinionAndHeroes ( tmp.minionAndHeroes );
	}
	public static void loadSpells() throws FileNotFoundException {
		Gson gson = CreatGson.getGson ();
		Reader reader = new FileReader ( "Spells.json");
		SpellTmp tmp = gson.fromJson ( reader, ( Type ) Spell.class);
		Spell.setSpells ( tmp.spells );
	}
	public static void loadItems() throws FileNotFoundException {
		Gson gson = CreatGson.getGson ();
		Reader reader = new FileReader ( "Items.json" );
		ItemTmp tmp = gson.fromJson ( reader, ( Type ) Item.class );
		Item.setItems(tmp.items);
	}
	public static void loadAccounts(){
		Gson gson = CreatGson.getGson ();
	}
}
class ItemTmp{
	ArrayList<Item> items;
}
class MinionAndHeroTmp {
	ArrayList<MinionAndHero> minionAndHeroes;
}
class SpellTmp {
	ArrayList<Spell> spells;
}
class AccountTnp{
	ArrayList<Account> accounts;
}
class CreatGson {
	private static Gson gson;
	public static Gson getGson (){
		if ( gson == null ){
			GsonBuilder builder = new GsonBuilder ();
			gson = builder.create ();
		}
		return gson;
	}
}