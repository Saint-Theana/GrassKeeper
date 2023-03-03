package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusPickCardNotify {
    @Tag(tag=6) public Integer playerUid = null;
    @Tag(tag=7) public Integer groupId = null;
    @Tag(tag=8) public Integer playIndex = null;
    @Tag(tag=10) public Integer cardId = null;
}
