package com.example.demonew.repository;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
    @Entity
    @Table(name = "book", schema = "book", catalog = "lib")
    public class Book {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        @Column(name = "B_name")
         private String name;
        @Column(name = "B_category")
        private String category;
        @Column(name = "B_name_of_authore")
        private String nameOfAuthore;
        @Column(name = "B_surname_name_of_authore")
        private String surnameOfAuthore;
        @Column(name = "B_year")
        private int year;
        @Column(name = "B_publication")
        private String publication;
        @Column(name = "B_image")
        private String image;
        @Column(name = "B_status")
        private String status;
        @Column(name = "B_info")
        private String info;



        public Book(String name, String category, String nameOfAuthore, String surnameOfAuthore,
                    int year, String publication, String image, String status, String info) {
            this.name = name;
            this.category = category;
            this.nameOfAuthore = nameOfAuthore;
            this.surnameOfAuthore = surnameOfAuthore;
            this.year = year;
            this.publication = publication;
            this.image = image;
            this.status = status;
        }
            public void setName(String name) { this.name = name; }

            public void setCategory(String category) { this.category = category; }

            public void setNameOfAuthore(String nameOfAuthore) { this.nameOfAuthore = nameOfAuthore; }

            public void setSurnameOfAuthore(String surnameOfAuthore) { this.surnameOfAuthore = surnameOfAuthore; }

            public void setYear(int year) {this.year = year; }

            public void setPublication(String publication) { this.publication = publication; }

            public void setImage(String image) {this.image = image; }

            public void setStatus(String status) {this.status = status; }

            public void setInfo(String info) { this.info = info; }

        public String getName() { return name; }

        public String getCategory() { return category; }

        public String getNameOfAuthore() { return nameOfAuthore; }

        public String getSurnameOfAuthore() { return surnameOfAuthore; }

        public int getYear() { return year; }

        public String getPublication() { return publication; }

        public String getImage() { return image; }

        public String getStatus() { return status; }

        public String getInfo() { return info; }
    }

