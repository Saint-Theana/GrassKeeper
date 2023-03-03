package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriChessUnequipCardReq {
    @Tag(tag=8) public Integer cardId = null;
    @Tag(tag=5) public Integer levelId = null;
    @Tag(tag=10) public Boolean isHardMap = null;
}
