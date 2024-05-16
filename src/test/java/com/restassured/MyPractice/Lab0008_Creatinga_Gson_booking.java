package com.restassured.MyPractice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lab0008_Creatinga_Gson_booking {

        @SerializedName("firstname")
        @Expose
        private String firstname;
        @SerializedName("lastname")
        @Expose
        private String lastname;
        @SerializedName("totalprice")
        @Expose
        private Integer totalprice;
        @SerializedName("depositpaid")
        @Expose
        private Boolean depositpaid;
        @SerializedName("bookingdates")
        @Expose
        private Lab0009_Creatinga_gson_bookindates bookingdates;
        @SerializedName("additionalneeds")
        @Expose
        private String additionalneeds;

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public Integer getTotalprice() {
            return totalprice;
        }

        public void setTotalprice(Integer totalprice) {
            this.totalprice = totalprice;
        }

        public Boolean getDepositpaid() {
            return depositpaid;
        }

        public void setDepositpaid(Boolean depositpaid) {
            this.depositpaid = depositpaid;
        }

        public Lab0009_Creatinga_gson_bookindates getBookingdates() {
            return bookingdates;
        }

        public void setBookingdates(Lab0009_Creatinga_gson_bookindates bookingdates) {
            this.bookingdates = bookingdates;
        }

        public String getAdditionalneeds() {
            return additionalneeds;
        }

        public void setAdditionalneeds(String additionalneeds) {
            this.additionalneeds = additionalneeds;
        }

    }

