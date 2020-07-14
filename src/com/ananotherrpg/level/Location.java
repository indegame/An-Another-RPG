package com.ananotherrpg.level;

import java.util.ArrayList;
import java.util.List;

import com.ananotherrpg.Identifiable;
import com.ananotherrpg.entity.Entity;
import com.ananotherrpg.inventory.ItemStack;

public class Location implements Identifiable{
		private int locationId;
		
		private String name;
		private String description;
		
		private ArrayList<Entity> permanentEntities;
		private ArrayList<ItemStack> items;
		
		public Location(int locationId) {
			super();
			this.locationId = locationId;
		}

		public Location(String name, String description, ArrayList<Entity> permanentEntities, ArrayList<ItemStack> items) {
			super();
			this.name = name;
			this.description = description;
			this.permanentEntities = permanentEntities;
			this.items = items;
		}

		public String getName() {
			return name;
		}

		public List<Entity> getPermanentEntities() {
			return permanentEntities;
		}

		public ArrayList<ItemStack> getItems() {
			return items;
		}

		public String getDescription() {
			return description;
		}	
		
}