package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusPickCardReq {
    @Tag(tag=11) public Integer groupId = null;
    @Tag(tag=7) public Integer playIndex = null;
    @Tag(tag=1) public Integer cardId = null;
}
