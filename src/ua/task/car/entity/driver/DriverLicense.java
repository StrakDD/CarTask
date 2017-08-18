package ua.task.car.entity.driver;

import ua.task.car.entity.utility.DriverLicenseCategory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Denis Starovoitenko on 18.08.2017.
 */
public class DriverLicense {
        private List<DriverLicenseCategory> categories = new ArrayList<>();
        private Date fromDate;
        private Date expires;


        public DriverLicense(Date expires, List<DriverLicenseCategory> categories, Date fromDate) {
            this.expires = expires;
            this.categories = categories;
            this.fromDate = fromDate;
        }
        public DriverLicense(Date expires, DriverLicenseCategory category, Date fromDate) {
            this.expires = expires;
            this.categories.add( category );
            this.fromDate = fromDate;
        }

        public List<DriverLicenseCategory> getCategories() {
            return categories;
        }

        public void setCategories(List<DriverLicenseCategory> categories) {
            this.categories = categories;
        }

        public Date getFromDate() {
            return fromDate;
        }

        public void setFromDate(Date fromDate) {
            this.fromDate = fromDate;
        }

        public Date getExpires() {
            return expires;
        }

        public void setExpires(Date expires) {
            this.expires = expires;
        }

        @Override
        public String toString() {
            return "DriverLicense{" +
                    "categories=" + categories +
                    ", fromDate=" + fromDate +
                    ", expires=" + expires +
                    '}';
        }
}
