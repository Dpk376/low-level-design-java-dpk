public class Student {

    private String name;
    private double psp;
    private String batch;
    private int gradYear;
    private int mobNo;
    private String email;

    public static Builder getBuilder() {
        return new Builder();
    }

    private Student(Builder builder) {
        this.name = builder.getName();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
        this.gradYear = builder.getGradYear();
        this.mobNo = builder.getMobNo();
        this.email = builder.getEmail();
    }

    public static class Builder {

        private String name;
        private double psp;
        private String batch;
        private int gradYear;
        private int mobNo;
        private String email;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setMobNo(int mobNo) {
            this.mobNo = mobNo;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getName() {
            return name;
        }

        public double getPsp() {
            return psp;
        }

        public String getBatch() {
            return batch;
        }

        public int getGradYear() {
            return gradYear;
        }

        public int getMobNo() {
            return mobNo;
        }

        public String getEmail() {
            return email;
        }

        public void validate() {
            if(this.getGradYear() < 2022) {
                throw new RuntimeException("Grad year should be greater than or equal to 2022");
            }
        }

        public Student build() {
            validate();
            return new Student(this);
        }
    }

}
