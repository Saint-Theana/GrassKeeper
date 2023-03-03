package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartRogueDiaryRoomReq {
    @Tag(tag=13) public Integer roomDifficulty = null;
    @Tag(tag=1) public Boolean isSelectHard = null;
}
