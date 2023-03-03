package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class ScenePlayerSoundNotify {
    public enum PlaySoundType {
        @Tag(tag=0) PLAY_SOUND_TYPE_NONE ,
        @Tag(tag=1) PLAY_SOUND_TYPE_START ,
        @Tag(tag=2) PLAY_SOUND_TYPE_STOP ;
    }

    @Tag(tag=4) public String soundName = null;
    @Tag(tag=8) public PlaySoundType playType = null;
    @Tag(tag=3) public Vector playPos = null;
}
