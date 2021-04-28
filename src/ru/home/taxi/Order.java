package ru.home.taxi;

import ru.home.taxi.enums.StatusOrder;

import java.io.Serializable;

public class Order implements Serializable {
    private static final long serialVersionUID = -6465504969925974301L;
    //    private Integer numberOfOrder;
    private Integer idClient;
    private String fromStreet;
    private String toStreet;
    private Integer idDispatcher;
    private Float price;
    private Integer idDriver;
    private StatusOrder status;


//    public static class Builder {
//        private Order newOrder;
//
//        public Builder() {
//            newOrder = new Order();
//        }
//
//        public Builder setIdClient(Integer idClient) {
//            newOrder.idClient = idClient;
//            return this;
//        }
//        public Builder setFromStreet (String fromStreet) {
//            newOrder.fromStreet = fromStreet;
//            return this;
//        }
//        public Builder setToStreet (String toStreet) {
//            newOrder.toStreet = toStreet;
//            return this;
//        }
//        public Builder setIdDispatcher (Integer idDispatcher) {
//            newOrder.idDispatcher = idDispatcher;
//            return this;
//        }
//        public Builder setPrice (Float price) {
//            newOrder.price = price;
//            return this;
//        }
//        public Builder setIdDriver (Integer idDriver) {
//            newOrder.idDriver = idDriver;
//            return this;
//        }
//        public Builder setStatus (StatusOrder status) {
//            newOrder.status = status;
//            return this;
//        }
//        public Order build() {
//            return newOrder;
//        }
//
//    }


    public Integer getIdClient() {
        return idClient;
    }

    public String getFromStreet() {
        return fromStreet;
    }

    public String getToStreet() {
        return toStreet;
    }

    public Integer getIdDispatcher() {
        return idDispatcher;
    }

    public Float getPrice() {
        return price;
    }

    public Integer getIdDriver() {
        return idDriver;
    }

    public StatusOrder getStatus() {
        return status;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public void setFromStreet(String fromStreet) {
        this.fromStreet = fromStreet;
    }

    public void setToStreet(String toStreet) {
        this.toStreet = toStreet;
    }

    public void setIdDispatcher(Integer idDispatcher) {
        this.idDispatcher = idDispatcher;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setIdDriver(Integer idDriver) {
        this.idDriver = idDriver;
    }

    public void setStatus(StatusOrder status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return  "Клиент=" + idClient +
                ", Откуда='" + fromStreet + '\'' +
                ", Куда='" + toStreet + '\'' +
                ", Диспетчер=" + idDispatcher +
                ", цена=" + price +
                ", Водитель=" + idDriver +
                ", Статус=" + status;
    }
}
