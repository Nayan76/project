package org.geeksforgeeks.crash_course_spring.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "course")
@NoArgsConstructor
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="price", nullable = false)
    @Min(3)
    private double price;

    @Column(name="capacity", nullable = false)
    private int capacity;

    @Column(name="number_of_days", nullable = false)
    private int noOfDays;

    @Column(name="start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "mentor_id", nullable = false)
    private Mentor mentor;

    @Column(name="enrollment_end_date", nullable = false)
    private LocalDateTime enrollmentEndDate;

    public LocalDateTime getEndDate(){
        return this.startDate.plusDays(this.noOfDays);
    }
}
