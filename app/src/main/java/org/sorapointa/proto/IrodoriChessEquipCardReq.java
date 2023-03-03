package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriChessEquipCardReq {
    @Tag(tag=2) public Boolean isHardMap = null;
    @Tag(tag=12) public Integer levelId = null;
    @Tag(tag=9) public Integer cardId = null;
}
