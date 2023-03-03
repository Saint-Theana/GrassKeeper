package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGTCTavernInfoNotify {
    @Tag(tag=14) public Boolean isLastDuelWin = null;
    @Tag(tag=11) public Integer levelId = null;
    @Tag(tag=5) public Boolean isOwnerInDuel = null;
    @Tag(tag=3) public Integer pointId = null;
    @Tag(tag=12) public Integer avatarId = null;
    @Tag(tag=7) public Integer characterId = null;
    @Tag(tag=10) public Integer elementType = null;
}
