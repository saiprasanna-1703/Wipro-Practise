package com.wipro.hibernate_mappingmine.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Restaurant_Menu {
        @Id
		private int mid;
        private String mname;
        @OneToOne(mappedBy = "restaurant_menu",cascade = CascadeType.ALL)
        private Customer_order customer_order;
		public Restaurant_Menu(int mid, String mname) {
			super();
			this.mid = mid;
			this.mname = mname;
		}
		public Restaurant_Menu(int mid, String mname, Customer_order customer_order) {
			super();
			this.mid = mid;
			this.mname = mname;
			this.customer_order = customer_order;
		}
		public Restaurant_Menu() {
			super();
		}
		public int getMid() {
			return mid;
		}
		public void setMid(int mid) {
			this.mid = mid;
		}
		public String getMname() {
			return mname;
		}
		public void setMname(String mname) {
			this.mname = mname;
		}
		public Customer_order getCustomer_order() {
			return customer_order;
		}
		public void setCustomer_order(Customer_order customer_order) {
			this.customer_order = customer_order;
		}
		@Override
		public String toString() {
			return "Restaurant_Menu [mid=" + mid + ", mname=" + mname + "]";
		}
	
		
	

}
