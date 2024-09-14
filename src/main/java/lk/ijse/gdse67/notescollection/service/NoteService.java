package lk.ijse.gdse67.notescollection.service;

import lk.ijse.gdse67.notescollection.dto.impl.NoteDTO;

import java.util.List;

public interface NoteService {
    NoteDTO saveNote(NoteDTO noteDTO);
    List<NoteDTO> getAll();
    NoteDTO getNote();
    boolean deleteNote(String id);
    boolean updateNote(String id,NoteDTO noteDTO);
}
