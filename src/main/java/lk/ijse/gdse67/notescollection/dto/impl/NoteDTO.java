package lk.ijse.gdse67.notescollection.dto.impl;

import lk.ijse.gdse67.notescollection.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class NoteDTO implements SuperDTO {
    private String noteId;
    private String noteTittle;
    private String time;
    private String description;
    private String currentDate;
    private String priorityLevel;
    private String userName;
}
