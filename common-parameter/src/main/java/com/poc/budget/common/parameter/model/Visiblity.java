package com.poc.budget.common.parameter.model;



	public enum Visiblity {
		ALL_VISIBLE("all_visible"), 
		FORBOOKING_VISIBLE("4Booking_visible"), 
		FORBUDGET_VISIBLE("4Budget_visible"), 
		ALL_UNVISIBLE("all_unvisible"), 
		ONLY_FORBOOKING_VISIBLE("only_4Booking_visible"); 
		
		String description;

		private Visiblity(String description) {
			this.description = description;
		}

		public String getDescription() {
			return description;
		}
	}

