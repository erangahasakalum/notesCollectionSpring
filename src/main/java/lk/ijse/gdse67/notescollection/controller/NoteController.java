package lk.ijse.gdse67.notescollection.controller;

import lk.ijse.gdse67.notescollection.dto.impl.NoteDTO;
import lk.ijse.gdse67.notescollection.service.NoteService;
import lk.ijse.gdse67.notescollection.service.NoteServiceImpl;
import lk.ijse.gdse67.notescollection.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController /*meta annotation*/
@RequestMapping("api/v1/notes") /*palaweni segment /version eka/*/
public class NoteController {
    @Autowired
    private NoteService noteService; /*interface type eka inject karanawa private danne */
    //json eka java karana eka serializable
    //meke method public danne eka standard ekak
//me method walata api kiyanne end point kiyala = crud operation walata
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public NoteDTO savedNote(@RequestBody NoteDTO noteDTO) {
        return noteService.saveNote(noteDTO);

    }

    public NoteDTO getSelectedNote() {
        return null;
    }

    public List<NoteDTO> getAllNotes() {
        return null;
    }

    public void deleteNote(String id) {

    }

    public void updateNote(String noteId, NoteDTO noteDTO) {

    }
}
