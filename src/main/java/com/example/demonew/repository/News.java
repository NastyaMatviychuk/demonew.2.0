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
    @Table(name = "news", schema = "news", catalog = "lib")
    public class News {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        @Column(name = "N_name")
        private String name;
        @Column(name = "N_image")
        private String image;
        @Column(name = "N_text")
        private String text;
        public News(String name, String image, String text) {
            this.name = name;
            this.image = image;
            this.text = text;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }


}
