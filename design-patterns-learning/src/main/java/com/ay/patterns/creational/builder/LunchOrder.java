package com.ay.patterns.creational.builder;

public class LunchOrder {

    public static class LunchOrderBuilder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public LunchOrderBuilder() {

        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public LunchOrderBuilder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public LunchOrderBuilder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public LunchOrderBuilder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public LunchOrderBuilder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrder(LunchOrderBuilder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}