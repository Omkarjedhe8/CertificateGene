package com.renocrewsoluations.certgenerator.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;


@Entity
@Table(name = "certifications")
public class Certification {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private int certiId;
		private String certiName;
		private String certiDescription;

		private double certiCost;

		public Certification() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Certification(int certiId, String certiName, String certiDescription, double certiCost) {
			super();
			this.certiId = certiId;
			this.certiName = certiName;
			this.certiDescription = certiDescription;
			this.certiCost = certiCost;
		}

		public int getCertiId() {
			return certiId;
		}

		public void setCertiId(int certiId) {
			this.certiId = certiId;
		}

		public String getCertiName() {
			return certiName;
		}

		public void setCertiName(String certiName) {
			this.certiName = certiName;
		}

		public String getCertiDescription() {
			return certiDescription;
		}

		public void setCertiDescription(String certiDescription) {
			this.certiDescription = certiDescription;
		}

		public double getCertiCost() {
			return certiCost;
		}

		public void setCertiCost(double certiCost) {
			this.certiCost = certiCost;
		}

		@Override
		public String toString() {
			return "Certification [certiId=" + certiId + ", certiName=" + certiName + ", certiDescription="
					+ certiDescription + ", certiCost=" + certiCost + "]";
		}
		
}

