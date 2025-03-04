package com.springboot.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {

        @Value("Naveen")
        private String name;
        @Autowired
        private Address address;
        @Autowired
        @Qualifier("laptop")
        private Computer com;

        public Computer getCom() {
            return com;
        }

        public void setCom(Computer com) {
            this.com = com;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public Student(String name, Address address,Computer com) {
            this.name = name;
            this.address = address;
            this.com=com;
        }

        public Student() {
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", address=" + address +
                    ", computer=" + com +
                    '}';
        }
        public void code(){
            com.compile();
        }
}
