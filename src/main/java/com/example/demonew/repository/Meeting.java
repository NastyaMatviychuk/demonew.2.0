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
@Table(name = "meeting", schema = "meeting", catalog = "lib")
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "M_name")
    private String name;
    @Column(name = "M_image")
    private String image;
    @Column(name = "M_date")
    private String date;
    @Column(name = "M_time")
    private String time;
    @Column(name = "M_text")
    private String  text;
    public Meeting(String name, String image, String date, String time, String text) {
        this.name = name;
        this.image = image;
        this.date = date;
        this.time = time;
        this.text = text;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public String getTime() { return time; }

    public void setTime(String time) { this.time = time; }

    public String getText() { return text; }

    public void setText(String text) {this.text = text; }

}

