package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class Employees {
    String firstName;
    String lastName;
    String middleName;
    String position;
}
