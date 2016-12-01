package look.lookup.com.lookup.Model;

import java.util.List;

/**
 * Created by emb-ankitom on 12/1/2016.
 */

public class Model {


    private DataEntity data;

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public static class DataEntity {
        private List<BusinessesEntity> businesses;

        public List<BusinessesEntity> getBusinesses() {
            return businesses;
        }

        public void setBusinesses(List<BusinessesEntity> businesses) {
            this.businesses = businesses;
        }

        public static class BusinessesEntity {

            private Object employeeCount;
            private long updatedAt;
            private AddressEntity address;
            private Object features;
            private Object generalInfo;
            private Object placeId;
            private TimingsEntity timings;
            private boolean onlinePayment;
            private Object businessTypes;
            private Object premiumSellerInfo;
            private Object knownFor;
            private NowfloatsEntity nowfloats;
            private String id;
            private Object paymentMethods;
            private Object registrationDetails;
            private Object businessImages;
            private String status;
            private long timestamp;
            private String description;
            private String website;
            private String bookingStatus;
            private String name;
            private Object category;
            private boolean premiumSeller;
            private Object registeredName;
            private String profileImage;
            private String location;
            private Object coverImage;
            private Object socialNetworks;
            private Object poc;
            private Object subcategories;
            private Object parentId;
            private String source;
            private ClaimedUserEntity claimedUser;
            private List<PhoneNumbersEntityX> phoneNumbers;
            private List<EmailsEntity> emails;

            public Object getEmployeeCount() {
                return employeeCount;
            }

            public void setEmployeeCount(Object employeeCount) {
                this.employeeCount = employeeCount;
            }

            public long getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(long updatedAt) {
                this.updatedAt = updatedAt;
            }

            public AddressEntity getAddress() {
                return address;
            }

            public void setAddress(AddressEntity address) {
                this.address = address;
            }

            public Object getFeatures() {
                return features;
            }

            public void setFeatures(Object features) {
                this.features = features;
            }

            public Object getGeneralInfo() {
                return generalInfo;
            }

            public void setGeneralInfo(Object generalInfo) {
                this.generalInfo = generalInfo;
            }

            public Object getPlaceId() {
                return placeId;
            }

            public void setPlaceId(Object placeId) {
                this.placeId = placeId;
            }

            public TimingsEntity getTimings() {
                return timings;
            }

            public void setTimings(TimingsEntity timings) {
                this.timings = timings;
            }

            public boolean isOnlinePayment() {
                return onlinePayment;
            }

            public void setOnlinePayment(boolean onlinePayment) {
                this.onlinePayment = onlinePayment;
            }

            public Object getBusinessTypes() {
                return businessTypes;
            }

            public void setBusinessTypes(Object businessTypes) {
                this.businessTypes = businessTypes;
            }

            public Object getPremiumSellerInfo() {
                return premiumSellerInfo;
            }

            public void setPremiumSellerInfo(Object premiumSellerInfo) {
                this.premiumSellerInfo = premiumSellerInfo;
            }

            public Object getKnownFor() {
                return knownFor;
            }

            public void setKnownFor(Object knownFor) {
                this.knownFor = knownFor;
            }

            public NowfloatsEntity getNowfloats() {
                return nowfloats;
            }

            public void setNowfloats(NowfloatsEntity nowfloats) {
                this.nowfloats = nowfloats;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public Object getPaymentMethods() {
                return paymentMethods;
            }

            public void setPaymentMethods(Object paymentMethods) {
                this.paymentMethods = paymentMethods;
            }

            public Object getRegistrationDetails() {
                return registrationDetails;
            }

            public void setRegistrationDetails(Object registrationDetails) {
                this.registrationDetails = registrationDetails;
            }

            public Object getBusinessImages() {
                return businessImages;
            }

            public void setBusinessImages(Object businessImages) {
                this.businessImages = businessImages;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public long getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(long timestamp) {
                this.timestamp = timestamp;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getWebsite() {
                return website;
            }

            public void setWebsite(String website) {
                this.website = website;
            }

            public String getBookingStatus() {
                return bookingStatus;
            }

            public void setBookingStatus(String bookingStatus) {
                this.bookingStatus = bookingStatus;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Object getCategory() {
                return category;
            }

            public void setCategory(Object category) {
                this.category = category;
            }

            public boolean isPremiumSeller() {
                return premiumSeller;
            }

            public void setPremiumSeller(boolean premiumSeller) {
                this.premiumSeller = premiumSeller;
            }

            public Object getRegisteredName() {
                return registeredName;
            }

            public void setRegisteredName(Object registeredName) {
                this.registeredName = registeredName;
            }

            public String getProfileImage() {
                return profileImage;
            }

            public void setProfileImage(String profileImage) {
                this.profileImage = profileImage;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public Object getCoverImage() {
                return coverImage;
            }

            public void setCoverImage(Object coverImage) {
                this.coverImage = coverImage;
            }

            public Object getSocialNetworks() {
                return socialNetworks;
            }

            public void setSocialNetworks(Object socialNetworks) {
                this.socialNetworks = socialNetworks;
            }

            public Object getPoc() {
                return poc;
            }

            public void setPoc(Object poc) {
                this.poc = poc;
            }

            public Object getSubcategories() {
                return subcategories;
            }

            public void setSubcategories(Object subcategories) {
                this.subcategories = subcategories;
            }

            public Object getParentId() {
                return parentId;
            }

            public void setParentId(Object parentId) {
                this.parentId = parentId;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public ClaimedUserEntity getClaimedUser() {
                return claimedUser;
            }

            public void setClaimedUser(ClaimedUserEntity claimedUser) {
                this.claimedUser = claimedUser;
            }

            public List<PhoneNumbersEntityX> getPhoneNumbers() {
                return phoneNumbers;
            }

            public void setPhoneNumbers(List<PhoneNumbersEntityX> phoneNumbers) {
                this.phoneNumbers = phoneNumbers;
            }

            public List<EmailsEntity> getEmails() {
                return emails;
            }

            public void setEmails(List<EmailsEntity> emails) {
                this.emails = emails;
            }

            public static class AddressEntity {


                private Object state;
                private String pin;
                private String city;
                private String locality;
                private Object landmark;
                private String country;
                private Object street;
                private String addressLine;

                public Object getState() {
                    return state;
                }

                public void setState(Object state) {
                    this.state = state;
                }

                public String getPin() {
                    return pin;
                }

                public void setPin(String pin) {
                    this.pin = pin;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getLocality() {
                    return locality;
                }

                public void setLocality(String locality) {
                    this.locality = locality;
                }

                public Object getLandmark() {
                    return landmark;
                }

                public void setLandmark(Object landmark) {
                    this.landmark = landmark;
                }

                public String getCountry() {
                    return country;
                }

                public void setCountry(String country) {
                    this.country = country;
                }

                public Object getStreet() {
                    return street;
                }

                public void setStreet(Object street) {
                    this.street = street;
                }

                public String getAddressLine() {
                    return addressLine;
                }

                public void setAddressLine(String addressLine) {
                    this.addressLine = addressLine;
                }
            }

            public static class TimingsEntity {
                private List<TuesdayEntity> tuesday;
                private List<?> thursday;
                private List<?> friday;
                private List<?> saturday;
                private List<SundayEntity> sunday;
                private List<?> wednesday;
                private List<MondayEntity> monday;

                public List<TuesdayEntity> getTuesday() {
                    return tuesday;
                }

                public void setTuesday(List<TuesdayEntity> tuesday) {
                    this.tuesday = tuesday;
                }

                public List<?> getThursday() {
                    return thursday;
                }

                public void setThursday(List<?> thursday) {
                    this.thursday = thursday;
                }

                public List<?> getFriday() {
                    return friday;
                }

                public void setFriday(List<?> friday) {
                    this.friday = friday;
                }

                public List<?> getSaturday() {
                    return saturday;
                }

                public void setSaturday(List<?> saturday) {
                    this.saturday = saturday;
                }

                public List<SundayEntity> getSunday() {
                    return sunday;
                }

                public void setSunday(List<SundayEntity> sunday) {
                    this.sunday = sunday;
                }

                public List<?> getWednesday() {
                    return wednesday;
                }

                public void setWednesday(List<?> wednesday) {
                    this.wednesday = wednesday;
                }

                public List<MondayEntity> getMonday() {
                    return monday;
                }

                public void setMonday(List<MondayEntity> monday) {
                    this.monday = monday;
                }

                public static class TuesdayEntity {
                    /**
                     * close : 00:00
                     * open : 00:00
                     */

                    private String close;
                    private String open;

                    public String getClose() {
                        return close;
                    }

                    public void setClose(String close) {
                        this.close = close;
                    }

                    public String getOpen() {
                        return open;
                    }

                    public void setOpen(String open) {
                        this.open = open;
                    }
                }

                public static class SundayEntity {
                    /**
                     * close : 00:00
                     * open : 00:00
                     */

                    private String close;
                    private String open;

                    public String getClose() {
                        return close;
                    }

                    public void setClose(String close) {
                        this.close = close;
                    }

                    public String getOpen() {
                        return open;
                    }

                    public void setOpen(String open) {
                        this.open = open;
                    }
                }

                public static class MondayEntity {
                    /**
                     * close : 00:00
                     * open : 00:00
                     */

                    private String close;
                    private String open;

                    public String getClose() {
                        return close;
                    }

                    public void setClose(String close) {
                        this.close = close;
                    }

                    public String getOpen() {
                        return open;
                    }

                    public void setOpen(String open) {
                        this.open = open;
                    }
                }
            }

            public static class NowfloatsEntity {
                /**
                 * parentId : null
                 * id : CANROHIT
                 */

                private Object parentId;
                private String id;

                public Object getParentId() {
                    return parentId;
                }

                public void setParentId(Object parentId) {
                    this.parentId = parentId;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }
            }

            public static class ClaimedUserEntity {

                private Object email;
                private RoleEntity role;
                private String id;
                private String name;
                private List<PhoneNumbersEntity> phoneNumbers;

                public Object getEmail() {
                    return email;
                }

                public void setEmail(Object email) {
                    this.email = email;
                }

                public RoleEntity getRole() {
                    return role;
                }

                public void setRole(RoleEntity role) {
                    this.role = role;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public List<PhoneNumbersEntity> getPhoneNumbers() {
                    return phoneNumbers;
                }

                public void setPhoneNumbers(List<PhoneNumbersEntity> phoneNumbers) {
                    this.phoneNumbers = phoneNumbers;
                }

                public static class RoleEntity {

                    private String description;
                    private String label;
                    private int id;

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getLabel() {
                        return label;
                    }

                    public void setLabel(String label) {
                        this.label = label;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }
                }

                public static class PhoneNumbersEntity {
                    /**
                     * type : PRIMARY
                     * number : 918470007678
                     */

                    private String type;
                    private String number;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getNumber() {
                        return number;
                    }

                    public void setNumber(String number) {
                        this.number = number;
                    }
                }
            }

            public static class PhoneNumbersEntityX {
                /**
                 * type : PRIMARY
                 * number : 918470007678
                 */

                private String type;
                private String number;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getNumber() {
                    return number;
                }

                public void setNumber(String number) {
                    this.number = number;
                }
            }

            public static class EmailsEntity {
                /**
                 * type : PRIMARY
                 * id : rohit@canbrand.in
                 */

                private String type;
                private String id;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }
            }
        }
    }
}
