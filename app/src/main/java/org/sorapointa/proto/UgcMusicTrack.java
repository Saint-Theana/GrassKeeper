package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UgcMusicTrack {
    @Tag(tag=13) public List<UgcMusicNote> musicNoteList = new ArrayList<>();
}
