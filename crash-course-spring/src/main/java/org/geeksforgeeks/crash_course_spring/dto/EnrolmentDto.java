package org.geeksforgeeks.crash_course_spring.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.geeksforgeeks.crash_course_spring.enums.EnrollmentStatus;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class EnrolmentDto {

    private long studentId;

    private long courseId;

    private LocalDateTime enrolmentDate;

    private EnrollmentStatus status = EnrollmentStatus.ACTIVE;
}
