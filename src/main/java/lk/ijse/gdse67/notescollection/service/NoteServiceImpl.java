package lk.ijse.gdse67.notescollection.service;

import lk.ijse.gdse67.notescollection.dto.impl.NoteDTO;
import lk.ijse.gdse67.notescollection.util.AppUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service/*component wenuwata service classes waladi api meka use karanawa spring mannage karanana denawa*/
public class NoteServiceImpl implements NoteService{
    @Override
    public NoteDTO saveNote(NoteDTO noteDTO) {
        noteDTO.setNoteId(AppUtil.generateNoteId());
        return noteDTO;
    }

    @Override
    public List<NoteDTO> getAll() {
        return null;
    }

    @Override
    public NoteDTO getNote() {
        return null;
    }

    @Override
    public boolean deleteNote(String id) {
        return false;
    }

    @Override
    public boolean updateNote(String id, NoteDTO noteDTO) {
        return false;
    }
}
