package com.restassured.MyPractice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

     public class Lab0009_Creatinga_gson_bookindates {

        @SerializedName("checkin")
        @Expose
        private String checkin;
        @SerializedName("checkout")
        @Expose
        private String checkout;

        public String getCheckin() {
            return checkin;
        }

        public void setCheckin(String checkin) {
            this.checkin = checkin;
        }

        public String getCheckout() {
            return checkout;
        }

        public void setCheckout(String checkout) {
            this.checkout = checkout;
        }

    }

